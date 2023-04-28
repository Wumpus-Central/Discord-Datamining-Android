package p455z3;

import java.io.IOException;
import java.io.InputStream;
import p005a4.AbstractC1262c;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: z3.f */
/* loaded from: classes7.dex */
public class C14534f extends InputStream {

    /* renamed from: k */
    private final InputStream f32955k;

    /* renamed from: l */
    private final byte[] f32956l;

    /* renamed from: m */
    private final AbstractC1262c<byte[]> f32957m;

    /* renamed from: n */
    private int f32958n = 0;

    /* renamed from: o */
    private int f32959o = 0;

    /* renamed from: p */
    private boolean f32960p = false;

    public C14534f(InputStream inputStream, byte[] bArr, AbstractC1262c<byte[]> cVar) {
        this.f32955k = (InputStream) C13740j.m2834g(inputStream);
        this.f32956l = (byte[]) C13740j.m2834g(bArr);
        this.f32957m = (AbstractC1262c) C13740j.m2834g(cVar);
    }

    /* renamed from: b */
    private boolean m269b() {
        if (this.f32959o < this.f32958n) {
            return true;
        }
        int read = this.f32955k.read(this.f32956l);
        if (read <= 0) {
            return false;
        }
        this.f32958n = read;
        this.f32959o = 0;
        return true;
    }

    /* renamed from: g */
    private void m268g() {
        if (this.f32960p) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() {
        boolean z;
        if (this.f32959o <= this.f32958n) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        m268g();
        return (this.f32958n - this.f32959o) + this.f32955k.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f32960p) {
            this.f32960p = true;
            this.f32957m.release(this.f32956l);
            super.close();
        }
    }

    protected void finalize() {
        if (!this.f32960p) {
            C13925a.m2288j("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() {
        C13740j.m2832i(this.f32959o <= this.f32958n);
        m268g();
        if (!m269b()) {
            return -1;
        }
        byte[] bArr = this.f32956l;
        int i = this.f32959o;
        this.f32959o = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        boolean z;
        if (this.f32959o <= this.f32958n) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        m268g();
        int i = this.f32958n;
        int i2 = this.f32959o;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f32959o = (int) (i2 + j);
            return j;
        }
        this.f32959o = i;
        return j2 + this.f32955k.skip(j - j2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C13740j.m2832i(this.f32959o <= this.f32958n);
        m268g();
        if (!m269b()) {
            return -1;
        }
        int min = Math.min(this.f32958n - this.f32959o, i2);
        System.arraycopy(this.f32956l, this.f32959o, bArr, i, min);
        this.f32959o += min;
        return min;
    }
}
