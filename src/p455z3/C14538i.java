package p455z3;

import java.io.InputStream;
import p394w3.C13740j;

/* renamed from: z3.i */
/* loaded from: classes7.dex */
public class C14538i extends InputStream {

    /* renamed from: k */
    final AbstractC14535g f32961k;

    /* renamed from: l */
    int f32962l = 0;

    /* renamed from: m */
    int f32963m = 0;

    public C14538i(AbstractC14535g gVar) {
        C13740j.m2839b(Boolean.valueOf(!gVar.isClosed()));
        this.f32961k = (AbstractC14535g) C13740j.m2834g(gVar);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f32961k.size() - this.f32962l;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f32963m = this.f32962l;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        AbstractC14535g gVar = this.f32961k;
        int i = this.f32962l;
        this.f32962l = i + 1;
        return gVar.mo265j(i) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f32962l = this.f32963m;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        int min = Math.min((int) j, available());
        this.f32962l += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f32961k.mo266f(this.f32962l, bArr, i, min);
        this.f32962l += min;
        return min;
    }
}
