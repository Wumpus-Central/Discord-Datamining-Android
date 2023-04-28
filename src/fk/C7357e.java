package fk;

import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.BufferedSink;
import okio.Sink;
import okio.Timeout;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, m15073d2 = {"Lfk/e;", "Lokio/Sink;", "", "syncFlush", "", "b", "Lokio/Buffer;", "source", "", "byteCount", "K", "flush", "g", "()V", "close", "Lokio/Timeout;", "timeout", "", "toString", "k", "Z", "closed", "Lokio/BufferedSink;", "l", "Lokio/BufferedSink;", "sink", "Ljava/util/zip/Deflater;", "m", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.e */
/* loaded from: classes8.dex */
public final class C7357e implements Sink {

    /* renamed from: k */
    private boolean f15846k;

    /* renamed from: l */
    private final BufferedSink f15847l;

    /* renamed from: m */
    private final Deflater f15848m;

    public C7357e(BufferedSink sink, Deflater deflater) {
        C9971q.m14633g(sink, "sink");
        C9971q.m14633g(deflater, "deflater");
        this.f15847l = sink;
        this.f15848m = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: b */
    private final void m22835b(boolean z) {
        C7377u I0;
        int i;
        Buffer c = this.f15847l.mo9747c();
        while (true) {
            I0 = c.m9787I0(1);
            if (z) {
                Deflater deflater = this.f15848m;
                byte[] bArr = I0.f15886a;
                int i2 = I0.f15888c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f15848m;
                byte[] bArr2 = I0.f15886a;
                int i3 = I0.f15888c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                I0.f15888c += i;
                c.m9791F0(c.size() + i);
                this.f15847l.mo9751B();
            } else if (this.f15848m.needsInput()) {
                break;
            }
        }
        if (I0.f15887b == I0.f15888c) {
            c.f25530k = I0.m22778b();
            C7379v.m22771b(I0);
        }
    }

    @Override // okio.Sink
    /* renamed from: K */
    public void mo392K(Buffer source, long j) {
        C9971q.m14633g(source, "source");
        C7355c.m22840b(source.size(), 0L, j);
        while (j > 0) {
            C7377u uVar = source.f25530k;
            C9971q.m14636d(uVar);
            int min = (int) Math.min(j, uVar.f15888c - uVar.f15887b);
            this.f15848m.setInput(uVar.f15886a, uVar.f15887b, min);
            m22835b(false);
            long j2 = min;
            source.m9791F0(source.size() - j2);
            int i = uVar.f15887b + min;
            uVar.f15887b = i;
            if (i == uVar.f15888c) {
                source.f25530k = uVar.m22778b();
                C7379v.m22771b(uVar);
            }
            j -= j2;
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th2;
        if (!this.f15846k) {
            try {
                m22834g();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.f15848m.end();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                }
            }
            try {
                this.f15847l.close();
            } catch (Throwable th5) {
                if (th2 == null) {
                    th2 = th5;
                }
            }
            this.f15846k = true;
            if (th2 != null) {
                throw th2;
            }
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        m22835b(true);
        this.f15847l.flush();
    }

    /* renamed from: g */
    public final void m22834g() {
        this.f15848m.finish();
        m22835b(false);
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f15847l.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f15847l + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7357e(Sink sink, Deflater deflater) {
        this(C7366m.m22820c(sink), deflater);
        C9971q.m14633g(sink, "sink");
        C9971q.m14633g(deflater, "deflater");
    }
}
