package fk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, m15073d2 = {"Lfk/k;", "Lokio/Source;", "", "h", "Lokio/Buffer;", "sink", "", "byteCount", "read", "b", "", "g", "Lokio/Timeout;", "timeout", "close", "", "k", "I", "bufferBytesHeldByInflater", "l", "Z", "closed", "Lokio/BufferedSource;", "m", "Lokio/BufferedSource;", "source", "Ljava/util/zip/Inflater;", "n", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.k */
/* loaded from: classes8.dex */
public final class C7364k implements Source {

    /* renamed from: k */
    private int f15859k;

    /* renamed from: l */
    private boolean f15860l;

    /* renamed from: m */
    private final BufferedSource f15861m;

    /* renamed from: n */
    private final Inflater f15862n;

    public C7364k(BufferedSource source, Inflater inflater) {
        C9971q.m14633g(source, "source");
        C9971q.m14633g(inflater, "inflater");
        this.f15861m = source;
        this.f15862n = inflater;
    }

    /* renamed from: h */
    private final void m22823h() {
        int i = this.f15859k;
        if (i != 0) {
            int remaining = i - this.f15862n.getRemaining();
            this.f15859k -= remaining;
            this.f15861m.skip(remaining);
        }
    }

    /* renamed from: b */
    public final long m22825b(Buffer sink, long j) {
        boolean z;
        C9971q.m14633g(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f15860l)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0L;
        } else {
            try {
                C7377u I0 = sink.m9787I0(1);
                m22824g();
                int inflate = this.f15862n.inflate(I0.f15886a, I0.f15888c, (int) Math.min(j, 8192 - I0.f15888c));
                m22823h();
                if (inflate > 0) {
                    I0.f15888c += inflate;
                    long j2 = inflate;
                    sink.m9791F0(sink.size() + j2);
                    return j2;
                }
                if (I0.f15887b == I0.f15888c) {
                    sink.f25530k = I0.m22778b();
                    C7379v.m22771b(I0);
                }
                return 0L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f15860l) {
            this.f15862n.end();
            this.f15860l = true;
            this.f15861m.close();
        }
    }

    /* renamed from: g */
    public final boolean m22824g() {
        if (!this.f15862n.needsInput()) {
            return false;
        }
        if (this.f15861m.mo9731h0()) {
            return true;
        }
        C7377u uVar = this.f15861m.mo9734c().f25530k;
        C9971q.m14636d(uVar);
        int i = uVar.f15888c;
        int i2 = uVar.f15887b;
        int i3 = i - i2;
        this.f15859k = i3;
        this.f15862n.setInput(uVar.f15886a, i2, i3);
        return false;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        C9971q.m14633g(sink, "sink");
        do {
            long b = m22825b(sink, j);
            if (b > 0) {
                return b;
            }
            if (this.f15862n.finished() || this.f15862n.needsDictionary()) {
                return -1L;
            }
        } while (!this.f15861m.mo9731h0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f15861m.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7364k(Source source, Inflater inflater) {
        this(C7366m.m22819d(source), inflater);
        C9971q.m14633g(source, "source");
        C9971q.m14633g(inflater, "inflater");
    }
}
