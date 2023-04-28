package p081e9;

import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.InputStream;
import p119g9.C7510a;

/* renamed from: e9.m */
/* loaded from: classes5.dex */
public final class C6779m extends InputStream {

    /* renamed from: k */
    private final DataSource f14447k;

    /* renamed from: l */
    private final C5288a f14448l;

    /* renamed from: p */
    private long f14452p;

    /* renamed from: n */
    private boolean f14450n = false;

    /* renamed from: o */
    private boolean f14451o = false;

    /* renamed from: m */
    private final byte[] f14449m = new byte[1];

    public C6779m(DataSource dataSource, C5288a aVar) {
        this.f14447k = dataSource;
        this.f14448l = aVar;
    }

    /* renamed from: b */
    private void m24353b() {
        if (!this.f14450n) {
            this.f14447k.mo12542b(this.f14448l);
            this.f14450n = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f14451o) {
            this.f14447k.close();
            this.f14451o = true;
        }
    }

    /* renamed from: g */
    public void m24352g() {
        m24353b();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f14449m) == -1) {
            return -1;
        }
        return this.f14449m[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C7510a.m22366f(!this.f14451o);
        m24353b();
        int read = this.f14447k.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f14452p += read;
        return read;
    }
}
