package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p081e9.AbstractC6771f;
import p119g9.C7510a;
import p119g9.C7557q0;

/* loaded from: classes5.dex */
public final class RawResourceDataSource extends AbstractC6771f {

    /* renamed from: e */
    private final Resources f9739e;

    /* renamed from: f */
    private final String f9740f;

    /* renamed from: g */
    private Uri f9741g;

    /* renamed from: h */
    private AssetFileDescriptor f9742h;

    /* renamed from: i */
    private InputStream f9743i;

    /* renamed from: j */
    private long f9744j;

    /* renamed from: k */
    private boolean f9745k;

    /* renamed from: com.google.android.exoplayer2.upstream.RawResourceDataSource$a */
    /* loaded from: classes5.dex */
    public static class C5287a extends IOException {
        public C5287a(String str) {
            super(str);
        }

        public C5287a(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f9739e = context.getResources();
        this.f9740f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        int parseInt;
        String str;
        Uri uri = aVar.f9746a;
        this.f9741g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C7510a.m22367e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) C7510a.m22367e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new C5287a("Resource identifier must be an integer.");
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str2 = (String) C7510a.m22367e(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb2.append(str);
            sb2.append(str2);
            parseInt = this.f9739e.getIdentifier(sb2.toString(), "raw", this.f9740f);
            if (parseInt == 0) {
                throw new C5287a("Resource not found.");
            }
        } else {
            throw new C5287a("URI must either use scheme rawresource or android.resource");
        }
        m24358q(aVar);
        AssetFileDescriptor openRawResourceFd = this.f9739e.openRawResourceFd(parseInt);
        this.f9742h = openRawResourceFd;
        if (openRawResourceFd != null) {
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f9743i = fileInputStream;
            try {
                fileInputStream.skip(openRawResourceFd.getStartOffset());
                if (fileInputStream.skip(aVar.f9752g) >= aVar.f9752g) {
                    long j = aVar.f9753h;
                    long j2 = -1;
                    if (j != -1) {
                        this.f9744j = j;
                    } else {
                        long length = openRawResourceFd.getLength();
                        if (length != -1) {
                            j2 = length - aVar.f9752g;
                        }
                        this.f9744j = j2;
                    }
                    this.f9745k = true;
                    m24357r(aVar);
                    return this.f9744j;
                }
                throw new EOFException();
            } catch (IOException e) {
                throw new C5287a(e);
            }
        } else {
            throw new C5287a("Resource is compressed: " + uri);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f9741g = null;
        try {
            try {
                InputStream inputStream = this.f9743i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9743i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f9742h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f9742h = null;
                        if (this.f9745k) {
                            this.f9745k = false;
                            m24359p();
                        }
                    }
                } catch (IOException e) {
                    throw new C5287a(e);
                }
            } catch (IOException e2) {
                throw new C5287a(e2);
            }
        } catch (Throwable th2) {
            this.f9743i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f9742h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f9742h = null;
                    if (this.f9745k) {
                        this.f9745k = false;
                        m24359p();
                    }
                    throw th2;
                } catch (IOException e3) {
                    throw new C5287a(e3);
                }
            } finally {
                this.f9742h = null;
                if (this.f9745k) {
                    this.f9745k = false;
                    m24359p();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f9741g;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9744j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C5287a(e);
            }
        }
        int read = ((InputStream) C7557q0.m22145j(this.f9743i)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f9744j;
            if (j2 != -1) {
                this.f9744j = j2 - read;
            }
            m24360o(read);
            return read;
        } else if (this.f9744j == -1) {
            return -1;
        } else {
            throw new C5287a(new EOFException());
        }
    }
}
