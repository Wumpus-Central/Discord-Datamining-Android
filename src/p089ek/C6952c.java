package p089ek;

import fk.C7364k;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.Source;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Lek/c;", "Ljava/io/Closeable;", "Lokio/Buffer;", "buffer", "", "b", "close", "k", "Lokio/Buffer;", "deflatedBytes", "Ljava/util/zip/Inflater;", "l", "Ljava/util/zip/Inflater;", "inflater", "Lfk/k;", "m", "Lfk/k;", "inflaterSource", "", "n", "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ek.c */
/* loaded from: classes8.dex */
public final class C6952c implements Closeable {

    /* renamed from: k */
    private final Buffer f15114k;

    /* renamed from: l */
    private final Inflater f15115l;

    /* renamed from: m */
    private final C7364k f15116m;

    /* renamed from: n */
    private final boolean f15117n;

    public C6952c(boolean z) {
        this.f15117n = z;
        Buffer buffer = new Buffer();
        this.f15114k = buffer;
        Inflater inflater = new Inflater(true);
        this.f15115l = inflater;
        this.f15116m = new C7364k((Source) buffer, inflater);
    }

    /* renamed from: b */
    public final void m23855b(Buffer buffer) {
        boolean z;
        C9971q.m14633g(buffer, "buffer");
        if (this.f15114k.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f15117n) {
                this.f15115l.reset();
            }
            this.f15114k.mo9748N(buffer);
            this.f15114k.writeInt(65535);
            long bytesRead = this.f15115l.getBytesRead() + this.f15114k.size();
            do {
                this.f15116m.m22825b(buffer, Long.MAX_VALUE);
            } while (this.f15115l.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15116m.close();
    }
}
