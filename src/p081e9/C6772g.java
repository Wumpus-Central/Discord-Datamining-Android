package p081e9;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p119g9.C7557q0;

/* renamed from: e9.g */
/* loaded from: classes5.dex */
public final class C6772g extends AbstractC6771f {

    /* renamed from: e */
    private final ContentResolver f14436e;

    /* renamed from: f */
    private Uri f14437f;

    /* renamed from: g */
    private AssetFileDescriptor f14438g;

    /* renamed from: h */
    private FileInputStream f14439h;

    /* renamed from: i */
    private long f14440i;

    /* renamed from: j */
    private boolean f14441j;

    /* renamed from: e9.g$a */
    /* loaded from: classes5.dex */
    public static class C6773a extends IOException {
        public C6773a(IOException iOException) {
            super(iOException);
        }
    }

    public C6772g(Context context) {
        super(false);
        this.f14436e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        try {
            Uri uri = aVar.f9746a;
            this.f14437f = uri;
            m24358q(aVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f14436e.openAssetFileDescriptor(uri, "r");
            this.f14438g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f14439h = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(aVar.f9752g + startOffset) - startOffset;
                if (skip == aVar.f9752g) {
                    long j = aVar.f9753h;
                    if (j != -1) {
                        this.f14440i = j;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f14440i = -1L;
                            } else {
                                long position = size - channel.position();
                                this.f14440i = position;
                                if (position < 0) {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.f14440i = j2;
                            if (j2 < 0) {
                                throw new EOFException();
                            }
                        }
                    }
                    this.f14441j = true;
                    m24357r(aVar);
                    return this.f14440i;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + uri);
        } catch (IOException e) {
            throw new C6773a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f14437f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14439h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14439h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14438g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f14438g = null;
                        if (this.f14441j) {
                            this.f14441j = false;
                            m24359p();
                        }
                    }
                } catch (IOException e) {
                    throw new C6773a(e);
                }
            } catch (IOException e2) {
                throw new C6773a(e2);
            }
        } catch (Throwable th2) {
            this.f14439h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f14438g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f14438g = null;
                    if (this.f14441j) {
                        this.f14441j = false;
                        m24359p();
                    }
                    throw th2;
                } catch (IOException e3) {
                    throw new C6773a(e3);
                }
            } finally {
                this.f14438g = null;
                if (this.f14441j) {
                    this.f14441j = false;
                    m24359p();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f14437f;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14440i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C6773a(e);
            }
        }
        int read = ((FileInputStream) C7557q0.m22145j(this.f14439h)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f14440i;
            if (j2 != -1) {
                this.f14440i = j2 - read;
            }
            m24360o(read);
            return read;
        } else if (this.f14440i == -1) {
            return -1;
        } else {
            throw new C6773a(new EOFException());
        }
    }
}
