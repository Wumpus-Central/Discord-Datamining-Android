package p037c4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c4.a */
/* loaded from: classes7.dex */
public class C3763a extends FilterInputStream {

    /* renamed from: k */
    private int f6166k;

    /* renamed from: l */
    private int f6167l;

    public C3763a(InputStream inputStream, int i) {
        super(inputStream);
        inputStream.getClass();
        if (i >= 0) {
            this.f6166k = i;
            this.f6167l = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f6166k);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.f6167l = this.f6166k;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f6166k == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f6166k--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f6167l != -1) {
            ((FilterInputStream) this).in.reset();
            this.f6166k = this.f6167l;
        } else {
            throw new IOException("mark not set");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f6166k));
        this.f6166k = (int) (this.f6166k - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f6166k;
        if (i3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f6166k -= read;
        }
        return read;
    }
}
