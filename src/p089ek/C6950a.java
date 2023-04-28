package p089ek;

import fk.C7357e;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.ByteString;
import okio.Sink;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m15073d2 = {"Lek/a;", "Ljava/io/Closeable;", "Lokio/Buffer;", "Lokio/ByteString;", "suffix", "", "g", "buffer", "", "b", "close", "k", "Lokio/Buffer;", "deflatedBytes", "Ljava/util/zip/Deflater;", "l", "Ljava/util/zip/Deflater;", "deflater", "Lfk/e;", "m", "Lfk/e;", "deflaterSink", "n", "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ek.a */
/* loaded from: classes8.dex */
public final class C6950a implements Closeable {

    /* renamed from: k */
    private final Buffer f15109k;

    /* renamed from: l */
    private final Deflater f15110l;

    /* renamed from: m */
    private final C7357e f15111m;

    /* renamed from: n */
    private final boolean f15112n;

    public C6950a(boolean z) {
        this.f15112n = z;
        Buffer buffer = new Buffer();
        this.f15109k = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.f15110l = deflater;
        this.f15111m = new C7357e((Sink) buffer, deflater);
    }

    /* renamed from: g */
    private final boolean m23857g(Buffer buffer, ByteString byteString) {
        return buffer.m9775S(buffer.size() - byteString.m9697v(), byteString);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable, okio.Buffer$a, java.lang.Object] */
    /* renamed from: b */
    public final void m23858b(Buffer buffer) {
        boolean z;
        ByteString byteString;
        C9971q.m14633g(buffer, "buffer");
        if (this.f15109k.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f15112n) {
                this.f15110l.reset();
            }
            this.f15111m.mo392K(buffer, buffer.size());
            this.f15111m.flush();
            Buffer buffer2 = this.f15109k;
            byteString = C6951b.f15113a;
            if (m23857g(buffer2, byteString)) {
                th = 0;
                try {
                    Buffer.m9767b0(this.f15109k, th, 1, th).m9754g(this.f15109k.size() - 4);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                this.f15109k.writeByte(0);
            }
            Buffer buffer3 = this.f15109k;
            buffer.mo392K(buffer3, buffer3.size());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15111m.close();
    }
}
