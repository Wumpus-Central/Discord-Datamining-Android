package okio;

import fk.C7355c;
import fk.C7377u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\""}, m15073d2 = {"Lokio/a;", "Lokio/Timeout;", "", "now", "u", "", "r", "", "s", "x", "Lokio/Sink;", "sink", "v", "Lokio/Source;", "source", "w", "Ljava/io/IOException;", "cause", "m", "t", "f", "Z", "inQueue", "g", "Lokio/a;", "next", "h", "J", "timeoutAt", "<init>", "()V", "l", "a", "b", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: okio.a */
/* loaded from: classes8.dex */
public class C11440a extends Timeout {

    /* renamed from: i */
    private static final long f25551i;

    /* renamed from: j */
    private static final long f25552j;

    /* renamed from: k */
    private static C11440a f25553k;

    /* renamed from: l */
    public static final C0365a f25554l = new C0365a(null);

    /* renamed from: f */
    private boolean f25555f;

    /* renamed from: g */
    private C11440a f25556g;

    /* renamed from: h */
    private long f25557h;

    @Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m15073d2 = {"Lokio/a$a;", "", "Lokio/a;", "node", "", "timeoutNanos", "", "hasDeadline", "", "e", "d", "c", "()Lokio/a;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lokio/a;", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.a$a */
    /* loaded from: classes8.dex */
    public static final class C0365a {
        private C0365a() {
        }

        public /* synthetic */ C0365a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m9661d(C11440a aVar) {
            synchronized (C11440a.class) {
                for (C11440a aVar2 = C11440a.f25553k; aVar2 != null; aVar2 = aVar2.f25556g) {
                    if (aVar2.f25556g == aVar) {
                        aVar2.f25556g = aVar.f25556g;
                        aVar.f25556g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m9660e(C11440a aVar, long j, boolean z) {
            synchronized (C11440a.class) {
                if (C11440a.f25553k == null) {
                    C11440a.f25553k = new C11440a();
                    new C11441b().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i != 0 && z) {
                    aVar.f25557h = Math.min(j, aVar.mo9684c() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    aVar.f25557h = j + nanoTime;
                } else if (z) {
                    aVar.f25557h = aVar.mo9684c();
                } else {
                    throw new AssertionError();
                }
                long u = aVar.m9667u(nanoTime);
                C11440a aVar2 = C11440a.f25553k;
                C9971q.m14636d(aVar2);
                while (aVar2.f25556g != null) {
                    C11440a aVar3 = aVar2.f25556g;
                    C9971q.m14636d(aVar3);
                    if (u < aVar3.m9667u(nanoTime)) {
                        break;
                    }
                    aVar2 = aVar2.f25556g;
                    C9971q.m14636d(aVar2);
                }
                aVar.f25556g = aVar2.f25556g;
                aVar2.f25556g = aVar;
                if (aVar2 == C11440a.f25553k) {
                    C11440a.class.notify();
                }
                Unit unit = Unit.f22042a;
            }
        }

        /* renamed from: c */
        public final C11440a m9662c() {
            C11440a aVar = C11440a.f25553k;
            C9971q.m14636d(aVar);
            C11440a aVar2 = aVar.f25556g;
            if (aVar2 == null) {
                long nanoTime = System.nanoTime();
                C11440a.class.wait(C11440a.f25551i);
                C11440a aVar3 = C11440a.f25553k;
                C9971q.m14636d(aVar3);
                if (aVar3.f25556g != null || System.nanoTime() - nanoTime < C11440a.f25552j) {
                    return null;
                }
                return C11440a.f25553k;
            }
            long u = aVar2.m9667u(System.nanoTime());
            if (u > 0) {
                long j = u / 1000000;
                C11440a.class.wait(j, (int) (u - (1000000 * j)));
                return null;
            }
            C11440a aVar4 = C11440a.f25553k;
            C9971q.m14636d(aVar4);
            aVar4.f25556g = aVar2.f25556g;
            aVar2.f25556g = null;
            return aVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"Lokio/a$b;", "Ljava/lang/Thread;", "", "run", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.a$b */
    /* loaded from: classes8.dex */
    public static final class C11441b extends Thread {
        public C11441b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C11440a c;
            while (true) {
                try {
                    synchronized (C11440a.class) {
                        c = C11440a.f25554l.m9662c();
                        if (c == C11440a.f25553k) {
                            C11440a.f25553k = null;
                            return;
                        }
                        Unit unit = Unit.f22042a;
                    }
                    if (c != null) {
                        c.mo381x();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m15073d2 = {"okio/a$c", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "flush", "close", "Lokio/a;", "b", "", "toString", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.a$c */
    /* loaded from: classes8.dex */
    public static final class C11442c implements Sink {

        /* renamed from: l */
        final /* synthetic */ Sink f25559l;

        C11442c(Sink sink) {
            this.f25559l = sink;
        }

        @Override // okio.Sink
        /* renamed from: K */
        public void mo392K(Buffer source, long j) {
            C9971q.m14633g(source, "source");
            C7355c.m22840b(source.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C7377u uVar = source.f25530k;
                    C9971q.m14636d(uVar);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += uVar.f15888c - uVar.f15887b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            uVar = uVar.f15891f;
                            C9971q.m14636d(uVar);
                        }
                    }
                    C11440a aVar = C11440a.this;
                    aVar.m9669r();
                    try {
                        this.f25559l.mo392K(source, j2);
                        Unit unit = Unit.f22042a;
                        if (!aVar.m9668s()) {
                            j -= j2;
                        } else {
                            throw aVar.m9674m(null);
                        }
                    } catch (IOException e) {
                        if (aVar.m9668s()) {
                            throw aVar.m9674m(e);
                        }
                        throw e;
                    } finally {
                        aVar.m9668s();
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public C11440a timeout() {
            return C11440a.this;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C11440a aVar = C11440a.this;
            aVar.m9669r();
            try {
                this.f25559l.close();
                Unit unit = Unit.f22042a;
                if (aVar.m9668s()) {
                    throw aVar.m9674m(null);
                }
            } catch (IOException e) {
                if (aVar.m9668s()) {
                    throw aVar.m9674m(e);
                }
            } finally {
                aVar.m9668s();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            C11440a aVar = C11440a.this;
            aVar.m9669r();
            try {
                this.f25559l.flush();
                Unit unit = Unit.f22042a;
                if (aVar.m9668s()) {
                    throw aVar.m9674m(null);
                }
            } catch (IOException e) {
                if (aVar.m9668s()) {
                    throw aVar.m9674m(e);
                }
            } finally {
                aVar.m9668s();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f25559l + ')';
        }
    }

    @Metadata(m15074d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m15073d2 = {"okio/a$d", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "Lokio/a;", "b", "", "toString", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.a$d */
    /* loaded from: classes8.dex */
    public static final class C11443d implements Source {

        /* renamed from: l */
        final /* synthetic */ Source f25561l;

        C11443d(Source source) {
            this.f25561l = source;
        }

        /* renamed from: b */
        public C11440a timeout() {
            return C11440a.this;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C11440a aVar = C11440a.this;
            aVar.m9669r();
            try {
                this.f25561l.close();
                Unit unit = Unit.f22042a;
                if (aVar.m9668s()) {
                    throw aVar.m9674m(null);
                }
            } catch (IOException e) {
                if (aVar.m9668s()) {
                    throw aVar.m9674m(e);
                }
            } finally {
                aVar.m9668s();
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            C9971q.m14633g(sink, "sink");
            C11440a aVar = C11440a.this;
            aVar.m9669r();
            try {
                long read = this.f25561l.read(sink, j);
                if (!aVar.m9668s()) {
                    return read;
                }
                throw aVar.m9674m(null);
            } catch (IOException e) {
                if (!aVar.m9668s()) {
                    throw e;
                }
                throw aVar.m9674m(e);
            } finally {
                aVar.m9668s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f25561l + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f25551i = millis;
        f25552j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final long m9667u(long j) {
        return this.f25557h - j;
    }

    /* renamed from: m */
    public final IOException m9674m(IOException iOException) {
        return mo382t(iOException);
    }

    /* renamed from: r */
    public final void m9669r() {
        if (!this.f25555f) {
            long h = mo9682h();
            boolean e = mo9683e();
            if (h != 0 || e) {
                this.f25555f = true;
                f25554l.m9660e(this, h, e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    /* renamed from: s */
    public final boolean m9668s() {
        if (!this.f25555f) {
            return false;
        }
        this.f25555f = false;
        return f25554l.m9661d(this);
    }

    /* renamed from: t */
    protected IOException mo382t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: v */
    public final Sink m9666v(Sink sink) {
        C9971q.m14633g(sink, "sink");
        return new C11442c(sink);
    }

    /* renamed from: w */
    public final Source m9665w(Source source) {
        C9971q.m14633g(source, "source");
        return new C11443d(source);
    }

    /* renamed from: x */
    protected void mo381x() {
    }
}
