package p450yj;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okio.Buffer;
import okio.BufferedSource;
import okio.C11440a;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 @2\u00020\u0001:\u0004 \u001c!\u0011B3\b\u0000\u0012\u0006\u0010V\u001a\u00020\u0015\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010`\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\ba\u0010bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010\u001dR*\u0010)\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010,\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R*\u0010/\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R*\u00102\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00106R\u001e\u0010\u0014\u001a\u000608R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001e\u0010B\u001a\u00060=R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001e\u0010H\u001a\u00060CR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001e\u0010K\u001a\u00060CR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010GR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010L\u001a\u0004\b>\u0010M\"\u0004\bN\u0010OR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010P\u001a\u0004\bD\u0010Q\"\u0004\bR\u0010SR\u0017\u0010V\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bF\u0010T\u001a\u0004\bI\u0010UR\u0017\u0010Z\u001a\u00020W8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\b9\u0010YR\u0011\u0010]\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010_\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b^\u0010\\¨\u0006c"}, m15073d2 = {"Lyj/i;", "", "Lyj/b;", "errorCode", "Ljava/io/IOException;", "errorException", "", "e", "Lokhttp3/Headers;", "C", "Lokio/Timeout;", "v", "E", "Lokio/Sink;", "n", "rstStatusCode", "", "d", "f", "Lokio/BufferedSource;", "source", "", "length", "w", "headers", "inFinished", "x", "y", "b", "()V", "", "delta", "a", "c", "D", "<set-?>", "J", "l", "()J", "A", "(J)V", "readBytesTotal", "k", "z", "readBytesAcknowledged", "r", "B", "writeBytesTotal", "q", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "Z", "hasResponseHeaders", "Lyj/i$c;", "g", "Lyj/i$c;", "p", "()Lyj/i$c;", "Lyj/i$b;", "h", "Lyj/i$b;", "o", "()Lyj/i$b;", "sink", "Lyj/i$d;", "i", "Lyj/i$d;", "m", "()Lyj/i$d;", "readTimeout", "j", "s", "writeTimeout", "Lyj/b;", "()Lyj/b;", "setErrorCode$okhttp", "(Lyj/b;)V", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "I", "()I", "id", "Lyj/f;", "Lyj/f;", "()Lyj/f;", "connection", "u", "()Z", "isOpen", "t", "isLocallyInitiated", "outFinished", "<init>", "(ILyj/f;ZZLokhttp3/Headers;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.i */
/* loaded from: classes8.dex */
public final class C14481i {

    /* renamed from: o */
    public static final C14482a f32827o = new C14482a(null);

    /* renamed from: a */
    private long f32828a;

    /* renamed from: b */
    private long f32829b;

    /* renamed from: c */
    private long f32830c;

    /* renamed from: d */
    private long f32831d;

    /* renamed from: e */
    private final ArrayDeque<Headers> f32832e;

    /* renamed from: f */
    private boolean f32833f;

    /* renamed from: g */
    private final C14484c f32834g;

    /* renamed from: h */
    private final C14483b f32835h;

    /* renamed from: i */
    private final C14485d f32836i = new C14485d();

    /* renamed from: j */
    private final C14485d f32837j = new C14485d();

    /* renamed from: k */
    private EnumC14449b f32838k;

    /* renamed from: l */
    private IOException f32839l;

    /* renamed from: m */
    private final int f32840m;

    /* renamed from: n */
    private final C14457f f32841n;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lyj/i$a;", "", "", "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.i$a */
    /* loaded from: classes8.dex */
    public static final class C14482a {
        private C14482a() {
        }

        public /* synthetic */ C14482a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006'"}, m15073d2 = {"Lyj/i$b;", "Lokio/Sink;", "", "outFinishedOnLastFrame", "", "b", "Lokio/Buffer;", "source", "", "byteCount", "K", "flush", "Lokio/Timeout;", "timeout", "close", "k", "Lokio/Buffer;", "sendBuffer", "Lokhttp3/Headers;", "l", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "trailers", "m", "Z", "g", "()Z", "setClosed", "(Z)V", "closed", "n", "h", "setFinished", "finished", "<init>", "(Lyj/i;Z)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.i$b */
    /* loaded from: classes8.dex */
    public final class C14483b implements Sink {

        /* renamed from: k */
        private final Buffer f32842k = new Buffer();

        /* renamed from: l */
        private Headers f32843l;

        /* renamed from: m */
        private boolean f32844m;

        /* renamed from: n */
        private boolean f32845n;

        public C14483b(boolean z) {
            this.f32845n = z;
        }

        /* renamed from: b */
        private final void m391b(boolean z) {
            long min;
            boolean z2;
            synchronized (C14481i.this) {
                C14481i.this.m400s().m9669r();
                while (C14481i.this.m401r() >= C14481i.this.m402q() && !this.f32845n && !this.f32844m && C14481i.this.m411h() == null) {
                    C14481i.this.m420D();
                }
                C14481i.this.m400s().m380y();
                C14481i.this.m416c();
                min = Math.min(C14481i.this.m402q() - C14481i.this.m401r(), this.f32842k.size());
                C14481i iVar = C14481i.this;
                iVar.m422B(iVar.m401r() + min);
                if (z && min == this.f32842k.size() && C14481i.this.m411h() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Unit unit = Unit.f22042a;
            }
            C14481i.this.m400s().m9669r();
            try {
                C14481i.this.m412g().m507d1(C14481i.this.m409j(), z2, this.f32842k, min);
            } finally {
                C14481i.this.m400s().m380y();
            }
        }

        @Override // okio.Sink
        /* renamed from: K */
        public void mo392K(Buffer source, long j) {
            C9971q.m14633g(source, "source");
            C14481i iVar = C14481i.this;
            if (!C12729c.f28589h || !Thread.holdsLock(iVar)) {
                this.f32842k.mo392K(source, j);
                while (this.f32842k.size() >= 16384) {
                    m391b(false);
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z;
            boolean z2;
            boolean z3;
            C14481i iVar = C14481i.this;
            if (!C12729c.f28589h || !Thread.holdsLock(iVar)) {
                synchronized (C14481i.this) {
                    if (!this.f32844m) {
                        if (C14481i.this.m411h() == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Unit unit = Unit.f22042a;
                        if (!C14481i.this.m404o().f32845n) {
                            if (this.f32842k.size() > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (this.f32843l != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                while (this.f32842k.size() > 0) {
                                    m391b(false);
                                }
                                C14457f g = C14481i.this.m412g();
                                int j = C14481i.this.m409j();
                                Headers headers = this.f32843l;
                                C9971q.m14636d(headers);
                                g.m506e1(j, z, C12729c.m5631L(headers));
                            } else if (z2) {
                                while (this.f32842k.size() > 0) {
                                    m391b(true);
                                }
                            } else if (z) {
                                C14481i.this.m412g().m507d1(C14481i.this.m409j(), true, null, 0L);
                            }
                        }
                        synchronized (C14481i.this) {
                            this.f32844m = true;
                            Unit unit2 = Unit.f22042a;
                        }
                        C14481i.this.m412g().flush();
                        C14481i.this.m417b();
                        return;
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            C14481i iVar = C14481i.this;
            if (!C12729c.f28589h || !Thread.holdsLock(iVar)) {
                synchronized (C14481i.this) {
                    C14481i.this.m416c();
                    Unit unit = Unit.f22042a;
                }
                while (this.f32842k.size() > 0) {
                    m391b(false);
                    C14481i.this.m412g().flush();
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        /* renamed from: g */
        public final boolean m390g() {
            return this.f32844m;
        }

        /* renamed from: h */
        public final boolean m389h() {
            return this.f32845n;
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return C14481i.this.m400s();
        }
    }

    @Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u001f¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u0015\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010,\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$¨\u0006/"}, m15073d2 = {"Lyj/i$c;", "Lokio/Source;", "", "read", "", "n", "Lokio/Buffer;", "sink", "byteCount", "Lokio/BufferedSource;", "source", "h", "(Lokio/BufferedSource;J)V", "Lokio/Timeout;", "timeout", "close", "k", "Lokio/Buffer;", "getReceiveBuffer", "()Lokio/Buffer;", "receiveBuffer", "l", "getReadBuffer", "readBuffer", "Lokhttp3/Headers;", "m", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "(Lokhttp3/Headers;)V", "trailers", "", "Z", "b", "()Z", "setClosed$okhttp", "(Z)V", "closed", "o", "J", "maxByteCount", "p", "g", "i", "finished", "<init>", "(Lyj/i;JZ)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.i$c */
    /* loaded from: classes8.dex */
    public final class C14484c implements Source {

        /* renamed from: k */
        private final Buffer f32847k = new Buffer();

        /* renamed from: l */
        private final Buffer f32848l = new Buffer();

        /* renamed from: m */
        private Headers f32849m;

        /* renamed from: n */
        private boolean f32850n;

        /* renamed from: o */
        private final long f32851o;

        /* renamed from: p */
        private boolean f32852p;

        public C14484c(long j, boolean z) {
            this.f32851o = j;
            this.f32852p = z;
        }

        /* renamed from: n */
        private final void m383n(long j) {
            C14481i iVar = C14481i.this;
            if (!C12729c.f28589h || !Thread.holdsLock(iVar)) {
                C14481i.this.m412g().m508c1(j);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        /* renamed from: b */
        public final boolean m388b() {
            return this.f32850n;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            synchronized (C14481i.this) {
                this.f32850n = true;
                size = this.f32848l.size();
                this.f32848l.m9765h();
                C14481i iVar = C14481i.this;
                if (iVar != null) {
                    iVar.notifyAll();
                    Unit unit = Unit.f22042a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (size > 0) {
                m383n(size);
            }
            C14481i.this.m417b();
        }

        /* renamed from: g */
        public final boolean m387g() {
            return this.f32852p;
        }

        /* renamed from: h */
        public final void m386h(BufferedSource source, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C9971q.m14633g(source, "source");
            C14481i iVar = C14481i.this;
            if (!C12729c.f28589h || !Thread.holdsLock(iVar)) {
                while (j > 0) {
                    synchronized (C14481i.this) {
                        z = this.f32852p;
                        z2 = true;
                        if (this.f32848l.size() + j > this.f32851o) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Unit unit = Unit.f22042a;
                    }
                    if (z3) {
                        source.skip(j);
                        C14481i.this.m413f(EnumC14449b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        source.skip(j);
                        return;
                    } else {
                        long read = source.read(this.f32847k, j);
                        if (read != -1) {
                            j -= read;
                            synchronized (C14481i.this) {
                                if (this.f32850n) {
                                    j2 = this.f32847k.size();
                                    this.f32847k.m9765h();
                                } else {
                                    if (this.f32848l.size() != 0) {
                                        z2 = false;
                                    }
                                    this.f32848l.mo9748N(this.f32847k);
                                    if (z2) {
                                        C14481i iVar2 = C14481i.this;
                                        if (iVar2 != null) {
                                            iVar2.notifyAll();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                m383n(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        /* renamed from: i */
        public final void m385i(boolean z) {
            this.f32852p = z;
        }

        /* renamed from: l */
        public final void m384l(Headers headers) {
            this.f32849m = headers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(okio.Buffer r18, long r19) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p450yj.C14481i.C14484c.read(okio.Buffer, long):long");
        }

        @Override // okio.Source
        public Timeout timeout() {
            return C14481i.this.m406m();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, m15073d2 = {"Lyj/i$d;", "Lokio/a;", "", "x", "Ljava/io/IOException;", "cause", "t", "y", "<init>", "(Lyj/i;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.i$d */
    /* loaded from: classes8.dex */
    public final class C14485d extends C11440a {
        public C14485d() {
        }

        @Override // okio.C11440a
        /* renamed from: t */
        protected IOException mo382t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.C11440a
        /* renamed from: x */
        protected void mo381x() {
            C14481i.this.m413f(EnumC14449b.CANCEL);
            C14481i.this.m412g().m517W0();
        }

        /* renamed from: y */
        public final void m380y() {
            if (m9668s()) {
                throw mo382t(null);
            }
        }
    }

    public C14481i(int i, C14457f connection, boolean z, boolean z2, Headers headers) {
        C9971q.m14633g(connection, "connection");
        this.f32840m = i;
        this.f32841n = connection;
        this.f32831d = connection.m535I0().m352c();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.f32832e = arrayDeque;
        this.f32834g = new C14484c(connection.m536H0().m352c(), z2);
        this.f32835h = new C14483b(z);
        if (headers != null) {
            if (!m399t()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!m399t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: e */
    private final boolean m414e(EnumC14449b bVar, IOException iOException) {
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f32838k != null) {
                    return false;
                }
                if (this.f32834g.m387g() && this.f32835h.m389h()) {
                    return false;
                }
                this.f32838k = bVar;
                this.f32839l = iOException;
                notifyAll();
                Unit unit = Unit.f22042a;
                this.f32841n.m518V0(this.f32840m);
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: A */
    public final void m423A(long j) {
        this.f32828a = j;
    }

    /* renamed from: B */
    public final void m422B(long j) {
        this.f32830c = j;
    }

    /* renamed from: C */
    public final synchronized Headers m421C() {
        Headers removeFirst;
        this.f32836i.m9669r();
        while (this.f32832e.isEmpty() && this.f32838k == null) {
            m420D();
        }
        this.f32836i.m380y();
        if (!this.f32832e.isEmpty()) {
            removeFirst = this.f32832e.removeFirst();
            C9971q.m14634f(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.f32839l;
            if (iOException != null) {
                throw iOException;
            }
            EnumC14449b bVar = this.f32838k;
            C9971q.m14636d(bVar);
            throw new C14494n(bVar);
        }
        return removeFirst;
    }

    /* renamed from: D */
    public final void m420D() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final Timeout m419E() {
        return this.f32837j;
    }

    /* renamed from: a */
    public final void m418a(long j) {
        this.f32831d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m417b() {
        boolean z;
        boolean u;
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f32834g.m387g() || !this.f32834g.m388b() || (!this.f32835h.m389h() && !this.f32835h.m390g())) {
                    z = false;
                } else {
                    z = true;
                }
                u = m398u();
                Unit unit = Unit.f22042a;
            }
            if (z) {
                m415d(EnumC14449b.CANCEL, null);
            } else if (!u) {
                this.f32841n.m518V0(this.f32840m);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    /* renamed from: c */
    public final void m416c() {
        if (this.f32835h.m390g()) {
            throw new IOException("stream closed");
        } else if (this.f32835h.m389h()) {
            throw new IOException("stream finished");
        } else if (this.f32838k != null) {
            IOException iOException = this.f32839l;
            if (iOException == null) {
                EnumC14449b bVar = this.f32838k;
                C9971q.m14636d(bVar);
                throw new C14494n(bVar);
            }
        }
    }

    /* renamed from: d */
    public final void m415d(EnumC14449b rstStatusCode, IOException iOException) {
        C9971q.m14633g(rstStatusCode, "rstStatusCode");
        if (m414e(rstStatusCode, iOException)) {
            this.f32841n.m502g1(this.f32840m, rstStatusCode);
        }
    }

    /* renamed from: f */
    public final void m413f(EnumC14449b errorCode) {
        C9971q.m14633g(errorCode, "errorCode");
        if (m414e(errorCode, null)) {
            this.f32841n.m500h1(this.f32840m, errorCode);
        }
    }

    /* renamed from: g */
    public final C14457f m412g() {
        return this.f32841n;
    }

    /* renamed from: h */
    public final synchronized EnumC14449b m411h() {
        return this.f32838k;
    }

    /* renamed from: i */
    public final IOException m410i() {
        return this.f32839l;
    }

    /* renamed from: j */
    public final int m409j() {
        return this.f32840m;
    }

    /* renamed from: k */
    public final long m408k() {
        return this.f32829b;
    }

    /* renamed from: l */
    public final long m407l() {
        return this.f32828a;
    }

    /* renamed from: m */
    public final C14485d m406m() {
        return this.f32836i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:19:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:19:0x0001 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okio.Sink m405n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f32833f     // Catch: all -> 0x0023
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.m399t()     // Catch: all -> 0x0023
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            kotlin.Unit r0 = kotlin.Unit.f22042a     // Catch: all -> 0x0023
            monitor-exit(r2)
            yj.i$b r0 = r2.f32835h
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: all -> 0x0023
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x0023
            r1.<init>(r0)     // Catch: all -> 0x0023
            throw r1     // Catch: all -> 0x0023
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p450yj.C14481i.m405n():okio.Sink");
    }

    /* renamed from: o */
    public final C14483b m404o() {
        return this.f32835h;
    }

    /* renamed from: p */
    public final C14484c m403p() {
        return this.f32834g;
    }

    /* renamed from: q */
    public final long m402q() {
        return this.f32831d;
    }

    /* renamed from: r */
    public final long m401r() {
        return this.f32830c;
    }

    /* renamed from: s */
    public final C14485d m400s() {
        return this.f32837j;
    }

    /* renamed from: t */
    public final boolean m399t() {
        boolean z;
        if ((this.f32840m & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f32841n.m497j0() == z) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final synchronized boolean m398u() {
        if (this.f32838k != null) {
            return false;
        }
        if ((this.f32834g.m387g() || this.f32834g.m388b()) && (this.f32835h.m389h() || this.f32835h.m390g())) {
            if (this.f32833f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public final Timeout m397v() {
        return this.f32836i;
    }

    /* renamed from: w */
    public final void m396w(BufferedSource source, int i) {
        C9971q.m14633g(source, "source");
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            this.f32834g.m386h(source, i);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:9:0x003d, B:13:0x0045, B:14:0x004b, B:16:0x0054, B:17:0x0059), top: B:24:0x003d }] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m395x(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C9971q.m14633g(r3, r0)
            boolean r0 = p327rj.C12729c.f28589h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x003c
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x003c:
            monitor-enter(r2)
            boolean r0 = r2.f32833f     // Catch: all -> 0x006d
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r4 != 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            yj.i$c r0 = r2.f32834g     // Catch: all -> 0x006d
            r0.m384l(r3)     // Catch: all -> 0x006d
            goto L_0x0052
        L_0x004b:
            r2.f32833f = r1     // Catch: all -> 0x006d
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.f32832e     // Catch: all -> 0x006d
            r0.add(r3)     // Catch: all -> 0x006d
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            yj.i$c r3 = r2.f32834g     // Catch: all -> 0x006d
            r3.m385i(r1)     // Catch: all -> 0x006d
        L_0x0059:
            boolean r3 = r2.m398u()     // Catch: all -> 0x006d
            r2.notifyAll()     // Catch: all -> 0x006d
            kotlin.Unit r4 = kotlin.Unit.f22042a     // Catch: all -> 0x006d
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006c
            yj.f r3 = r2.f32841n
            int r4 = r2.f32840m
            r3.m518V0(r4)
        L_0x006c:
            return
        L_0x006d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p450yj.C14481i.m395x(okhttp3.Headers, boolean):void");
    }

    /* renamed from: y */
    public final synchronized void m394y(EnumC14449b errorCode) {
        C9971q.m14633g(errorCode, "errorCode");
        if (this.f32838k == null) {
            this.f32838k = errorCode;
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void m393z(long j) {
        this.f32829b = j;
    }
}
