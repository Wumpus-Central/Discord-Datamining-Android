package fk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0010\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m15073d2 = {"Lfk/f;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "flush", "Lokio/Timeout;", "timeout", "close", "", "toString", "k", "Lokio/Sink;", "delegate", "()Lokio/Sink;", "<init>", "(Lokio/Sink;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.f */
/* loaded from: classes8.dex */
public abstract class AbstractC7358f implements Sink {

    /* renamed from: k */
    private final Sink f15849k;

    public AbstractC7358f(Sink delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f15849k = delegate;
    }

    @Override // okio.Sink
    /* renamed from: K */
    public void mo392K(Buffer source, long j) {
        C9971q.m14633g(source, "source");
        this.f15849k.mo392K(source, j);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15849k.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f15849k.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f15849k.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f15849k + ')';
    }
}
