package tj;

import fk.AbstractC7358f;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.Sink;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m15073d2 = {"Ltj/e;", "Lfk/f;", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "flush", "close", "", "l", "Z", "hasErrors", "Lkotlin/Function1;", "Ljava/io/IOException;", "m", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", "onException", "Lokio/Sink;", "delegate", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: tj.e */
/* loaded from: classes8.dex */
public class C13160e extends AbstractC7358f {

    /* renamed from: l */
    private boolean f29515l;

    /* renamed from: m */
    private final Function1<IOException, Unit> f29516m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13160e(Sink delegate, Function1<? super IOException, Unit> onException) {
        super(delegate);
        C9971q.m14633g(delegate, "delegate");
        C9971q.m14633g(onException, "onException");
        this.f29516m = onException;
    }

    @Override // fk.AbstractC7358f, okio.Sink
    /* renamed from: K */
    public void mo392K(Buffer source, long j) {
        C9971q.m14633g(source, "source");
        if (this.f29515l) {
            source.skip(j);
            return;
        }
        try {
            super.mo392K(source, j);
        } catch (IOException e) {
            this.f29515l = true;
            this.f29516m.invoke(e);
        }
    }

    @Override // fk.AbstractC7358f, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f29515l) {
            try {
                super.close();
            } catch (IOException e) {
                this.f29515l = true;
                this.f29516m.invoke(e);
            }
        }
    }

    @Override // fk.AbstractC7358f, okio.Sink, java.io.Flushable
    public void flush() {
        if (!this.f29515l) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f29515l = true;
                this.f29516m.invoke(e);
            }
        }
    }
}
