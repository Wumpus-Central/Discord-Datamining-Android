package p065dc;

import ec.C6813a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p030bc.C3457i;

/* renamed from: dc.a */
/* loaded from: classes3.dex */
public final class C6430a {

    /* renamed from: a */
    private static final OutputStream f13469a = new C0190a();

    /* renamed from: dc.a$a */
    /* loaded from: classes3.dex */
    class C0190a extends OutputStream {
        C0190a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C3457i.m34352i(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C3457i.m34352i(bArr);
        }
    }

    /* renamed from: a */
    private static byte[] m25575a(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    /* renamed from: b */
    public static InputStream m25574b(InputStream inputStream, long j) {
        return new C6431b(inputStream, j);
    }

    /* renamed from: c */
    public static byte[] m25573c(InputStream inputStream) {
        C3457i.m34352i(inputStream);
        return m25572d(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: d */
    private static byte[] m25572d(InputStream inputStream, Queue<byte[]> queue, int i) {
        int i2 = 8192;
        while (i < 2147483639) {
            int min = Math.min(i2, 2147483639 - i);
            byte[] bArr = new byte[min];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m25575a(queue, i);
                }
                i3 += read;
                i += read;
            }
            i2 = C6813a.m24299d(i2, 2);
        }
        if (inputStream.read() == -1) {
            return m25575a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: dc.a$b */
    /* loaded from: classes3.dex */
    private static final class C6431b extends FilterInputStream {

        /* renamed from: k */
        private long f13470k;

        /* renamed from: l */
        private long f13471l = -1;

        C6431b(InputStream inputStream, long j) {
            super(inputStream);
            boolean z;
            C3457i.m34352i(inputStream);
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C3457i.m34356e(z, "limit must be non-negative");
            this.f13470k = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f13470k);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f13471l = this.f13470k;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f13470k == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f13470k--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f13471l != -1) {
                ((FilterInputStream) this).in.reset();
                this.f13470k = this.f13471l;
            } else {
                throw new IOException("Mark not set");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f13470k));
            this.f13470k -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            long j = this.f13470k;
            if (j == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (read != -1) {
                this.f13470k -= read;
            }
            return read;
        }
    }
}
