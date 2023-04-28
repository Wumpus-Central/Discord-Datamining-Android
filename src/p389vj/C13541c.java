package p389vj;

import fk.AbstractC7358f;
import fk.AbstractC7359g;
import fk.C7366m;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.Sink;
import okio.Source;
import p089ek.C6953d;
import p307qj.AbstractC12237n;
import p409wj.AbstractC13895d;
import p409wj.C13899h;

@Metadata(m15074d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\"\u001bB'\u0012\u0006\u00103\u001a\u00020/\u0012\u0006\u00108\u001a\u000204\u0012\u0006\u0010=\u001a\u000209\u0012\u0006\u0010@\u001a\u00020>¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J9\u0010\"\u001a\u00028\u0000\"\n\b\u0000\u0010\u001d*\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#J\u0006\u0010$\u001a\u00020\u0004R$\u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u001a\u00108\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b6\u00107R\u001a\u0010=\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010B\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010(¨\u0006E"}, m15073d2 = {"Lvj/c;", "", "Ljava/io/IOException;", "e", "", "t", "Lokhttp3/Request;", "request", "v", "", "duplex", "Lokio/Sink;", "c", "f", "s", "expectContinue", "Lokhttp3/Response$a;", "q", "Lokhttp3/Response;", "response", "r", "Lokhttp3/ResponseBody;", "p", "Lek/d$d;", "m", "u", "n", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "<set-?>", "Z", "l", "()Z", "isDuplex", "Lvj/f;", "Lvj/f;", "h", "()Lvj/f;", "connection", "Lvj/e;", "Lvj/e;", "g", "()Lvj/e;", "call", "Lqj/n;", "Lqj/n;", "i", "()Lqj/n;", "eventListener", "Lvj/d;", "Lvj/d;", "j", "()Lvj/d;", "finder", "Lwj/d;", "Lwj/d;", "codec", "k", "isCoalescedConnection", "<init>", "(Lvj/e;Lqj/n;Lvj/d;Lwj/d;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.c */
/* loaded from: classes8.dex */
public final class C13541c {

    /* renamed from: a */
    private boolean f30247a;

    /* renamed from: b */
    private final C13549f f30248b;

    /* renamed from: c */
    private final C13545e f30249c;

    /* renamed from: d */
    private final AbstractC12237n f30250d;

    /* renamed from: e */
    private final C13544d f30251e;

    /* renamed from: f */
    private final AbstractC13895d f30252f;

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001e"}, m15073d2 = {"Lvj/c$a;", "Lfk/f;", "Ljava/io/IOException;", "E", "e", "b", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "flush", "close", "", "l", "Z", "completed", "m", "J", "bytesReceived", "n", "closed", "o", "contentLength", "Lokio/Sink;", "delegate", "<init>", "(Lvj/c;Lokio/Sink;J)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.c$a */
    /* loaded from: classes8.dex */
    private final class C13542a extends AbstractC7358f {

        /* renamed from: l */
        private boolean f30253l;

        /* renamed from: m */
        private long f30254m;

        /* renamed from: n */
        private boolean f30255n;

        /* renamed from: o */
        private final long f30256o;

        /* renamed from: p */
        final /* synthetic */ C13541c f30257p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13542a(C13541c cVar, Sink delegate, long j) {
            super(delegate);
            C9971q.m14633g(delegate, "delegate");
            this.f30257p = cVar;
            this.f30256o = j;
        }

        /* renamed from: b */
        private final <E extends IOException> E m3441b(E e) {
            if (this.f30253l) {
                return e;
            }
            this.f30253l = true;
            return (E) this.f30257p.m3463a(this.f30254m, false, true, e);
        }

        @Override // fk.AbstractC7358f, okio.Sink
        /* renamed from: K */
        public void mo392K(Buffer source, long j) {
            C9971q.m14633g(source, "source");
            if (!this.f30255n) {
                long j2 = this.f30256o;
                if (j2 == -1 || this.f30254m + j <= j2) {
                    try {
                        super.mo392K(source, j);
                        this.f30254m += j;
                    } catch (IOException e) {
                        throw m3441b(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f30256o + " bytes but received " + (this.f30254m + j));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        @Override // fk.AbstractC7358f, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f30255n) {
                this.f30255n = true;
                long j = this.f30256o;
                if (j == -1 || this.f30254m == j) {
                    try {
                        super.close();
                        m3441b(null);
                    } catch (IOException e) {
                        throw m3441b(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        @Override // fk.AbstractC7358f, okio.Sink, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw m3441b(e);
            }
        }
    }

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001f"}, m15073d2 = {"Lvj/c$b;", "Lfk/g;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "Ljava/io/IOException;", "E", "e", "b", "(Ljava/io/IOException;)Ljava/io/IOException;", "k", "J", "bytesReceived", "", "l", "Z", "invokeStartEvent", "m", "completed", "n", "closed", "o", "contentLength", "Lokio/Source;", "delegate", "<init>", "(Lvj/c;Lokio/Source;J)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.c$b */
    /* loaded from: classes8.dex */
    public final class C13543b extends AbstractC7359g {

        /* renamed from: k */
        private long f30258k;

        /* renamed from: l */
        private boolean f30259l = true;

        /* renamed from: m */
        private boolean f30260m;

        /* renamed from: n */
        private boolean f30261n;

        /* renamed from: o */
        private final long f30262o;

        /* renamed from: p */
        final /* synthetic */ C13541c f30263p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13543b(C13541c cVar, Source delegate, long j) {
            super(delegate);
            C9971q.m14633g(delegate, "delegate");
            this.f30263p = cVar;
            this.f30262o = j;
            if (j == 0) {
                m3440b(null);
            }
        }

        /* renamed from: b */
        public final <E extends IOException> E m3440b(E e) {
            if (this.f30260m) {
                return e;
            }
            this.f30260m = true;
            if (e == null && this.f30259l) {
                this.f30259l = false;
                this.f30263p.m3455i().m7283w(this.f30263p.m3457g());
            }
            return (E) this.f30263p.m3463a(this.f30258k, true, false, e);
        }

        @Override // fk.AbstractC7359g, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f30261n) {
                this.f30261n = true;
                try {
                    super.close();
                    m3440b(null);
                } catch (IOException e) {
                    throw m3440b(e);
                }
            }
        }

        @Override // fk.AbstractC7359g, okio.Source
        public long read(Buffer sink, long j) {
            C9971q.m14633g(sink, "sink");
            if (!this.f30261n) {
                try {
                    long read = delegate().read(sink, j);
                    if (this.f30259l) {
                        this.f30259l = false;
                        this.f30263p.m3455i().m7283w(this.f30263p.m3457g());
                    }
                    if (read == -1) {
                        m3440b(null);
                        return -1L;
                    }
                    long j2 = this.f30258k + read;
                    long j3 = this.f30262o;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.f30262o + " bytes but received " + j2);
                    }
                    this.f30258k = j2;
                    if (j2 == j3) {
                        m3440b(null);
                    }
                    return read;
                } catch (IOException e) {
                    throw m3440b(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public C13541c(C13545e call, AbstractC12237n eventListener, C13544d finder, AbstractC13895d codec) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(eventListener, "eventListener");
        C9971q.m14633g(finder, "finder");
        C9971q.m14633g(codec, "codec");
        this.f30249c = call;
        this.f30250d = eventListener;
        this.f30251e = finder;
        this.f30252f = codec;
        this.f30248b = codec.mo466c();
    }

    /* renamed from: t */
    private final void m3444t(IOException iOException) {
        this.f30251e.m3432h(iOException);
        this.f30252f.mo466c().m3389H(this.f30249c, iOException);
    }

    /* renamed from: a */
    public final <E extends IOException> E m3463a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            m3444t(e);
        }
        if (z2) {
            if (e != null) {
                this.f30250d.m7287s(this.f30249c, e);
            } else {
                this.f30250d.m7289q(this.f30249c, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f30250d.m7282x(this.f30249c, e);
            } else {
                this.f30250d.m7284v(this.f30249c, j);
            }
        }
        return (E) this.f30249c.m3407v(this, z2, z, e);
    }

    /* renamed from: b */
    public final void m3462b() {
        this.f30252f.cancel();
    }

    /* renamed from: c */
    public final Sink m3461c(Request request, boolean z) {
        C9971q.m14633g(request, "request");
        this.f30247a = z;
        RequestBody a = request.m9888a();
        C9971q.m14636d(a);
        long contentLength = a.contentLength();
        this.f30250d.m7288r(this.f30249c);
        return new C13542a(this, this.f30252f.mo464e(request, contentLength), contentLength);
    }

    /* renamed from: d */
    public final void m3460d() {
        this.f30252f.cancel();
        this.f30249c.m3407v(this, true, true, null);
    }

    /* renamed from: e */
    public final void m3459e() {
        try {
            this.f30252f.mo468a();
        } catch (IOException e) {
            this.f30250d.m7287s(this.f30249c, e);
            m3444t(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void m3458f() {
        try {
            this.f30252f.mo461h();
        } catch (IOException e) {
            this.f30250d.m7287s(this.f30249c, e);
            m3444t(e);
            throw e;
        }
    }

    /* renamed from: g */
    public final C13545e m3457g() {
        return this.f30249c;
    }

    /* renamed from: h */
    public final C13549f m3456h() {
        return this.f30248b;
    }

    /* renamed from: i */
    public final AbstractC12237n m3455i() {
        return this.f30250d;
    }

    /* renamed from: j */
    public final C13544d m3454j() {
        return this.f30251e;
    }

    /* renamed from: k */
    public final boolean m3453k() {
        return !C9971q.m14638b(this.f30251e.m3436d().m7399l().m10042h(), this.f30248b.m3396A().m7268a().m7399l().m10042h());
    }

    /* renamed from: l */
    public final boolean m3452l() {
        return this.f30247a;
    }

    /* renamed from: m */
    public final C6953d.AbstractC0211d m3451m() {
        this.f30249c.m3430B();
        return this.f30252f.mo466c().m3367x(this);
    }

    /* renamed from: n */
    public final void m3450n() {
        this.f30252f.mo466c().m3365z();
    }

    /* renamed from: o */
    public final void m3449o() {
        this.f30249c.m3407v(this, true, false, null);
    }

    /* renamed from: p */
    public final ResponseBody m3448p(Response response) {
        C9971q.m14633g(response, "response");
        try {
            String t = Response.m9834t(response, "Content-Type", null, 2, null);
            long d = this.f30252f.mo465d(response);
            return new C13899h(t, d, C7366m.m22819d(new C13543b(this, this.f30252f.mo467b(response), d)));
        } catch (IOException e) {
            this.f30250d.m7282x(this.f30249c, e);
            m3444t(e);
            throw e;
        }
    }

    /* renamed from: q */
    public final Response.C11430a m3447q(boolean z) {
        try {
            Response.C11430a g = this.f30252f.mo462g(z);
            if (g != null) {
                g.m9821l(this);
            }
            return g;
        } catch (IOException e) {
            this.f30250d.m7282x(this.f30249c, e);
            m3444t(e);
            throw e;
        }
    }

    /* renamed from: r */
    public final void m3446r(Response response) {
        C9971q.m14633g(response, "response");
        this.f30250d.m7281y(this.f30249c, response);
    }

    /* renamed from: s */
    public final void m3445s() {
        this.f30250d.m7280z(this.f30249c);
    }

    /* renamed from: u */
    public final void m3443u() {
        m3463a(-1L, true, true, null);
    }

    /* renamed from: v */
    public final void m3442v(Request request) {
        C9971q.m14633g(request, "request");
        try {
            this.f30250d.m7285u(this.f30249c);
            this.f30252f.mo463f(request);
            this.f30250d.m7286t(this.f30249c, request);
        } catch (IOException e) {
            this.f30250d.m7287s(this.f30249c, e);
            m3444t(e);
            throw e;
        }
    }
}
