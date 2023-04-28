package fk;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m15073d2 = {"Lfk/l;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "Lokio/Timeout;", "timeout", "", "toString", "Ljava/io/InputStream;", "k", "Ljava/io/InputStream;", "input", "l", "Lokio/Timeout;", "<init>", "(Ljava/io/InputStream;Lokio/Timeout;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.l */
/* loaded from: classes8.dex */
public final class C7365l implements Source {

    /* renamed from: k */
    private final InputStream f15863k;

    /* renamed from: l */
    private final Timeout f15864l;

    public C7365l(InputStream input, Timeout timeout) {
        C9971q.m14633g(input, "input");
        C9971q.m14633g(timeout, "timeout");
        this.f15863k = input;
        this.f15864l = timeout;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15863k.close();
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        boolean z;
        C9971q.m14633g(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f15864l.mo9680f();
                C7377u I0 = sink.m9787I0(1);
                int read = this.f15863k.read(I0.f15886a, I0.f15888c, (int) Math.min(j, 8192 - I0.f15888c));
                if (read != -1) {
                    I0.f15888c += read;
                    long j2 = read;
                    sink.m9791F0(sink.size() + j2);
                    return j2;
                } else if (I0.f15887b != I0.f15888c) {
                    return -1L;
                } else {
                    sink.f25530k = I0.m22778b();
                    C7379v.m22771b(I0);
                    return -1L;
                }
            } catch (AssertionError e) {
                if (C7366m.m22818e(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f15864l;
    }

    public String toString() {
        return "source(" + this.f15863k + ')';
    }
}
