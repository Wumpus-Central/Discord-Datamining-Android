package p081e9;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: e9.c */
/* loaded from: classes5.dex */
public final class C6766c extends AbstractC6771f {

    /* renamed from: e */
    private final AssetManager f14419e;

    /* renamed from: f */
    private Uri f14420f;

    /* renamed from: g */
    private InputStream f14421g;

    /* renamed from: h */
    private long f14422h;

    /* renamed from: i */
    private boolean f14423i;

    /* renamed from: e9.c$a */
    /* loaded from: classes5.dex */
    public static final class C6767a extends IOException {
        public C6767a(IOException iOException) {
            super(iOException);
        }
    }

    public C6766c(Context context) {
        super(false);
        this.f14419e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        try {
            Uri uri = aVar.f9746a;
            this.f14420f = uri;
            String str = (String) C7510a.m22367e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            m24358q(aVar);
            InputStream open = this.f14419e.open(str, 1);
            this.f14421g = open;
            if (open.skip(aVar.f9752g) >= aVar.f9752g) {
                long j = aVar.f9753h;
                if (j != -1) {
                    this.f14422h = j;
                } else {
                    long available = this.f14421g.available();
                    this.f14422h = available;
                    if (available == 2147483647L) {
                        this.f14422h = -1L;
                    }
                }
                this.f14423i = true;
                m24357r(aVar);
                return this.f14422h;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C6767a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f14420f = null;
        try {
            try {
                InputStream inputStream = this.f14421g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C6767a(e);
            }
        } finally {
            this.f14421g = null;
            if (this.f14423i) {
                this.f14423i = false;
                m24359p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f14420f;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14422h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C6767a(e);
            }
        }
        int read = ((InputStream) C7557q0.m22145j(this.f14421g)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f14422h;
            if (j2 != -1) {
                this.f14422h = j2 - read;
            }
            m24360o(read);
            return read;
        } else if (this.f14422h == -1) {
            return -1;
        } else {
            throw new C6767a(new EOFException());
        }
    }
}
