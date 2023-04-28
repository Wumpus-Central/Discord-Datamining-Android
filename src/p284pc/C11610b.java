package p284pc;

import java.io.OutputStream;

/* renamed from: pc.b */
/* loaded from: classes3.dex */
final class C11610b extends OutputStream {

    /* renamed from: k */
    private long f25879k = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m9267b() {
        return this.f25879k;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f25879k++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f25879k += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f25879k += i2;
    }
}
