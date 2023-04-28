package p394w3;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: w3.c */
/* loaded from: classes7.dex */
public class C13730c extends FilterOutputStream {

    /* renamed from: k */
    private long f30703k = 0;

    public C13730c(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: b */
    public long m2855b() {
        return this.f30703k;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f30703k += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.f30703k++;
    }
}
