package p037c4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c4.b */
/* loaded from: classes7.dex */
public class C3764b extends FilterInputStream {

    /* renamed from: k */
    private final byte[] f6168k;

    /* renamed from: l */
    private int f6169l;

    /* renamed from: m */
    private int f6170m;

    public C3764b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f6168k = bArr;
    }

    /* renamed from: b */
    private int m33624b() {
        int i = this.f6169l;
        byte[] bArr = this.f6168k;
        if (i >= bArr.length) {
            return -1;
        }
        this.f6169l = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.f6170m = this.f6169l;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : m33624b();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.f6169l = this.f6170m;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int b = m33624b();
            if (b == -1) {
                break;
            }
            bArr[i + i3] = (byte) b;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
