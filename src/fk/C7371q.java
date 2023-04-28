package fk;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m15073d2 = {"Lfk/q;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "flush", "close", "Lokio/Timeout;", "timeout", "", "toString", "Ljava/io/OutputStream;", "k", "Ljava/io/OutputStream;", "out", "l", "Lokio/Timeout;", "<init>", "(Ljava/io/OutputStream;Lokio/Timeout;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.q */
/* loaded from: classes8.dex */
public final class C7371q implements Sink {

    /* renamed from: k */
    private final OutputStream f15869k;

    /* renamed from: l */
    private final Timeout f15870l;

    public C7371q(OutputStream out, Timeout timeout) {
        C9971q.m14633g(out, "out");
        C9971q.m14633g(timeout, "timeout");
        this.f15869k = out;
        this.f15870l = timeout;
    }

    @Override // okio.Sink
    /* renamed from: K */
    public void mo392K(Buffer source, long j) {
        C9971q.m14633g(source, "source");
        C7355c.m22840b(source.size(), 0L, j);
        while (j > 0) {
            this.f15870l.mo9680f();
            C7377u uVar = source.f25530k;
            C9971q.m14636d(uVar);
            int min = (int) Math.min(j, uVar.f15888c - uVar.f15887b);
            this.f15869k.write(uVar.f15886a, uVar.f15887b, min);
            uVar.f15887b += min;
            long j2 = min;
            j -= j2;
            source.m9791F0(source.size() - j2);
            if (uVar.f15887b == uVar.f15888c) {
                source.f25530k = uVar.m22778b();
                C7379v.m22771b(uVar);
            }
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15869k.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f15869k.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f15870l;
    }

    public String toString() {
        return "sink(" + this.f15869k + ')';
    }
}
