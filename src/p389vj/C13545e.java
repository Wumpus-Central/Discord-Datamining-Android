package p389vj;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import nf.C11067f;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.C11440a;
import p015ak.C1457k;
import p307qj.AbstractC12216d;
import p307qj.AbstractC12237n;
import p307qj.C12208a;
import p307qj.C12217e;
import p327rj.C12729c;
import p409wj.C13898g;

@Metadata(m15074d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f*\u0001@\u0018\u00002\u00020\u0001:\u0002l\u0012B\u001f\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010g\u001a\u00020\u0011\u0012\u0006\u0010i\u001a\u00020\u0014¢\u0006\u0004\bj\u0010kJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000f\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0014J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010$J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J;\u0010+\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b-\u0010\u0007J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b/\u00100J\u0006\u00101\u001a\u00020\u0002J\u0017\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0014H\u0000¢\u0006\u0004\b3\u00104J\u0006\u00105\u001a\u00020\u0014J\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109R\u001a\u0010?\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010LR(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010N\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bE\u0010QR\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010X\u001a\u0004\u0018\u00010\"2\b\u0010N\u001a\u0004\u0018\u00010\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bR\u0010WR\u0016\u0010Y\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010SR\u0016\u0010Z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010SR\u0016\u0010[\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010SR\u0016\u0010\\\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010SR\u0018\u0010(\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010VR$\u0010`\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010P\u001a\u0004\b]\u0010Q\"\u0004\b^\u0010_R\u0017\u0010d\u001a\u00020a8\u0006¢\u0006\f\n\u0004\b5\u0010b\u001a\u0004\bA\u0010cR\u0017\u0010g\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b^\u0010e\u001a\u0004\bU\u0010fR\u0017\u0010i\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b1\u0010S\u001a\u0004\bO\u0010h¨\u0006m"}, m15073d2 = {"Lvj/e;", "Lokhttp3/Call;", "", "f", "Ljava/io/IOException;", "E", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "C", "Lokhttp3/HttpUrl;", "url", "Lqj/a;", "j", "", "D", "h", "Lokhttp3/Request;", "b", "cancel", "", "i", "Lokhttp3/Response;", "execute", "Lqj/d;", "responseCallback", "p", "t", "()Lokhttp3/Response;", "request", "newExchangeFinder", "k", "Lwj/g;", "chain", "Lvj/c;", "u", "(Lwj/g;)Lvj/c;", "Lvj/f;", "connection", "d", "exchange", "requestDone", "responseDone", "v", "(Lvj/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "w", "Ljava/net/Socket;", "y", "()Ljava/net/Socket;", "B", "closeExchange", "l", "(Z)V", "z", "x", "()Ljava/lang/String;", "Lvj/h;", "Lvj/h;", "connectionPool", "Lqj/n;", "Lqj/n;", "o", "()Lqj/n;", "eventListener", "vj/e$c", "m", "Lvj/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "n", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "Ljava/lang/Object;", "callStackTrace", "Lvj/d;", "Lvj/d;", "exchangeFinder", "<set-?>", "q", "Lvj/f;", "()Lvj/f;", "r", "Z", "timeoutEarlyExit", "s", "Lvj/c;", "()Lvj/c;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "getConnectionToCancel", "A", "(Lvj/f;)V", "connectionToCancel", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "()Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "()Lokhttp3/Request;", "originalRequest", "()Z", "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.e */
/* loaded from: classes8.dex */
public final class C13545e implements Call {

    /* renamed from: A */
    private final Request f39399A;

    /* renamed from: B */
    private final boolean f39400B;

    /* renamed from: k */
    private final C13555h f30274k;

    /* renamed from: l */
    private final AbstractC12237n f30275l;

    /* renamed from: m */
    private final C13548c f30276m;

    /* renamed from: o */
    private Object f30278o;

    /* renamed from: p */
    private C13544d f30279p;

    /* renamed from: q */
    private C13549f f30280q;

    /* renamed from: r */
    private boolean f30281r;

    /* renamed from: s */
    private C13541c f30282s;

    /* renamed from: t */
    private boolean f30283t;

    /* renamed from: u */
    private boolean f30284u;

    /* renamed from: w */
    private volatile boolean f30286w;

    /* renamed from: x */
    private volatile C13541c f30287x;

    /* renamed from: y */
    private volatile C13549f f30288y;

    /* renamed from: z */
    private final OkHttpClient f30289z;

    /* renamed from: n */
    private final AtomicBoolean f30277n = new AtomicBoolean();

    /* renamed from: v */
    private boolean f30285v = true;

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m15073d2 = {"Lvj/e$a;", "Ljava/lang/Runnable;", "Lvj/e;", "other", "", "e", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "k", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "Lqj/d;", "l", "Lqj/d;", "responseCallback", "", "d", "()Ljava/lang/String;", "host", "b", "()Lvj/e;", "call", "<init>", "(Lvj/e;Lqj/d;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.e$a */
    /* loaded from: classes8.dex */
    public final class RunnableC13546a implements Runnable {

        /* renamed from: k */
        private volatile AtomicInteger f30290k = new AtomicInteger(0);

        /* renamed from: l */
        private final AbstractC12216d f30291l;

        /* renamed from: m */
        final /* synthetic */ C13545e f30292m;

        public RunnableC13546a(C13545e eVar, AbstractC12216d responseCallback) {
            C9971q.m14633g(responseCallback, "responseCallback");
            this.f30292m = eVar;
            this.f30291l = responseCallback;
        }

        /* renamed from: a */
        public final void m3402a(ExecutorService executorService) {
            C9971q.m14633g(executorService, "executorService");
            Dispatcher r = this.f30292m.m3416m().m9941r();
            if (!C12729c.f28589h || !Thread.holdsLock(r)) {
                try {
                    try {
                        executorService.execute(this);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        this.f30292m.m3406w(interruptedIOException);
                        this.f30291l.onFailure(this.f30292m, interruptedIOException);
                        this.f30292m.m3416m().m9941r().m10081g(this);
                    }
                } catch (Throwable th2) {
                    this.f30292m.m3416m().m9941r().m10081g(this);
                    throw th2;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9971q.m14634f(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(r);
                throw new AssertionError(sb2.toString());
            }
        }

        /* renamed from: b */
        public final C13545e m3401b() {
            return this.f30292m;
        }

        /* renamed from: c */
        public final AtomicInteger m3400c() {
            return this.f30290k;
        }

        /* renamed from: d */
        public final String m3399d() {
            return this.f30292m.m3410s().m9877l().m10042h();
        }

        /* renamed from: e */
        public final void m3398e(RunnableC13546a other) {
            C9971q.m14633g(other, "other");
            this.f30290k = other.f30290k;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            IOException e;
            Dispatcher r;
            Throwable th2;
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.f30292m.m3405x());
            try {
                this.f30292m.f30276m.m9669r();
                try {
                    z = true;
                } catch (IOException e2) {
                    z = false;
                    e = e2;
                } catch (Throwable th3) {
                    z = false;
                    th2 = th3;
                }
                try {
                    this.f30291l.onResponse(this.f30292m, this.f30292m.m3409t());
                    r = this.f30292m.m3416m().m9941r();
                } catch (IOException e3) {
                    e = e3;
                    if (z) {
                        C1457k.f517c.m41079g().m41091k("Callback failure for " + this.f30292m.m3428D(), 4, e);
                    } else {
                        this.f30291l.onFailure(this.f30292m, e);
                    }
                    r = this.f30292m.m3416m().m9941r();
                    r.m10081g(this);
                } catch (Throwable th4) {
                    th2 = th4;
                    this.f30292m.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th2);
                        C11067f.m10981a(iOException, th2);
                        this.f30291l.onFailure(this.f30292m, iOException);
                    }
                    throw th2;
                }
                r.m10081g(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Lvj/e$b;", "Ljava/lang/ref/WeakReference;", "Lvj/e;", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callStackTrace", "referent", "<init>", "(Lvj/e;Ljava/lang/Object;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.e$b */
    /* loaded from: classes8.dex */
    public static final class C13547b extends WeakReference<C13545e> {

        /* renamed from: a */
        private final Object f30293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13547b(C13545e referent, Object obj) {
            super(referent);
            C9971q.m14633g(referent, "referent");
            this.f30293a = obj;
        }

        /* renamed from: a */
        public final Object m3397a() {
            return this.f30293a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, m15073d2 = {"vj/e$c", "Lokio/a;", "", "x", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.e$c */
    /* loaded from: classes8.dex */
    public static final class C13548c extends C11440a {
        C13548c() {
        }

        @Override // okio.C11440a
        /* renamed from: x */
        protected void mo381x() {
            C13545e.this.cancel();
        }
    }

    public C13545e(OkHttpClient client, Request originalRequest, boolean z) {
        C9971q.m14633g(client, "client");
        C9971q.m14633g(originalRequest, "originalRequest");
        this.f30289z = client;
        this.f39399A = originalRequest;
        this.f39400B = z;
        this.f30274k = client.m9944n().m7346a();
        this.f30275l = client.m9939t().mo5591a(this);
        C13548c cVar = new C13548c();
        cVar.mo9679g(client.m9948j(), TimeUnit.MILLISECONDS);
        Unit unit = Unit.f22042a;
        this.f30276m = cVar;
    }

    /* renamed from: C */
    private final <E extends IOException> E m3429C(E e) {
        if (this.f30281r) {
            return e;
        }
        if (!this.f30276m.m9668s()) {
            return e;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final String m3428D() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (mo3420i()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f39400B) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(m3405x());
        return sb2.toString();
    }

    /* renamed from: e */
    private final <E extends IOException> E m3423e(E e) {
        Socket y;
        boolean z;
        boolean z2 = C12729c.f28589h;
        if (!z2 || !Thread.holdsLock(this)) {
            C13549f fVar = this.f30280q;
            if (fVar != null) {
                if (!z2 || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        y = m3404y();
                    }
                    if (this.f30280q == null) {
                        if (y != null) {
                            C12729c.m5607k(y);
                        }
                        this.f30275l.m7294l(this, fVar);
                    } else {
                        if (y == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    C9971q.m14634f(currentThread, "Thread.currentThread()");
                    sb2.append(currentThread.getName());
                    sb2.append(" MUST NOT hold lock on ");
                    sb2.append(fVar);
                    throw new AssertionError(sb2.toString());
                }
            }
            E e2 = (E) m3429C(e);
            if (e != null) {
                AbstractC12237n nVar = this.f30275l;
                C9971q.m14636d(e2);
                nVar.m7301e(this, e2);
            } else {
                this.f30275l.m7302d(this);
            }
            return e2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Thread ");
        Thread currentThread2 = Thread.currentThread();
        C9971q.m14634f(currentThread2, "Thread.currentThread()");
        sb3.append(currentThread2.getName());
        sb3.append(" MUST NOT hold lock on ");
        sb3.append(this);
        throw new AssertionError(sb3.toString());
    }

    /* renamed from: f */
    private final void m3422f() {
        this.f30278o = C1457k.f517c.m41079g().mo41093i("response.body().close()");
        this.f30275l.m7300f(this);
    }

    /* renamed from: j */
    private final C12208a m3419j(HttpUrl httpUrl) {
        C12217e eVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.m10041i()) {
            sSLSocketFactory = this.f30289z.m9958L();
            hostnameVerifier = this.f30289z.m9935x();
            eVar = this.f30289z.m9946l();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            eVar = null;
        }
        return new C12208a(httpUrl.m10042h(), httpUrl.m10037m(), this.f30289z.m9940s(), this.f30289z.m9959K(), sSLSocketFactory, hostnameVerifier, eVar, this.f30289z.m9963G(), this.f30289z.m9964F(), this.f30289z.m9965E(), this.f30289z.m9943o(), this.f30289z.m9962H());
    }

    /* renamed from: A */
    public final void m3431A(C13549f fVar) {
        this.f30288y = fVar;
    }

    /* renamed from: B */
    public final void m3430B() {
        if (!this.f30281r) {
            this.f30281r = true;
            this.f30276m.m9668s();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    /* renamed from: b */
    public Request mo3426b() {
        return this.f39399A;
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (!this.f30286w) {
            this.f30286w = true;
            C13541c cVar = this.f30287x;
            if (cVar != null) {
                cVar.m3462b();
            }
            C13549f fVar = this.f30288y;
            if (fVar != null) {
                fVar.m3387d();
            }
            this.f30275l.m7299g(this);
        }
    }

    /* renamed from: d */
    public final void m3424d(C13549f connection) {
        boolean z;
        C9971q.m14633g(connection, "connection");
        if (!C12729c.f28589h || Thread.holdsLock(connection)) {
            if (this.f30280q == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f30280q = connection;
                connection.m3377n().add(new C13547b(this, this.f30278o));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(connection);
        throw new AssertionError(sb2.toString());
    }

    @Override // okhttp3.Call
    public Response execute() {
        if (this.f30277n.compareAndSet(false, true)) {
            this.f30276m.m9669r();
            m3422f();
            try {
                this.f30289z.m9941r().m10085c(this);
                return m3409t();
            } finally {
                this.f30289z.m9941r().m10080h(this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    /* renamed from: h */
    public C13545e clone() {
        return new C13545e(this.f30289z, this.f39399A, this.f39400B);
    }

    @Override // okhttp3.Call
    /* renamed from: i */
    public boolean mo3420i() {
        return this.f30286w;
    }

    /* renamed from: k */
    public final void m3418k(Request request, boolean z) {
        boolean z2;
        C9971q.m14633g(request, "request");
        if (this.f30282s == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            synchronized (this) {
                if (!(!this.f30284u)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.f30283t) {
                    Unit unit = Unit.f22042a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z) {
                this.f30279p = new C13544d(this.f30274k, m3419j(request.m9877l()), this, this.f30275l);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: l */
    public final void m3417l(boolean z) {
        C13541c cVar;
        synchronized (this) {
            if (this.f30285v) {
                Unit unit = Unit.f22042a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.f30287x) != null) {
            cVar.m3460d();
        }
        this.f30282s = null;
    }

    /* renamed from: m */
    public final OkHttpClient m3416m() {
        return this.f30289z;
    }

    /* renamed from: n */
    public final C13549f m3415n() {
        return this.f30280q;
    }

    /* renamed from: o */
    public final AbstractC12237n m3414o() {
        return this.f30275l;
    }

    @Override // okhttp3.Call
    /* renamed from: p */
    public void mo3413p(AbstractC12216d responseCallback) {
        C9971q.m14633g(responseCallback, "responseCallback");
        if (this.f30277n.compareAndSet(false, true)) {
            m3422f();
            this.f30289z.m9941r().m10086b(new RunnableC13546a(this, responseCallback));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: q */
    public final boolean m3412q() {
        return this.f39400B;
    }

    /* renamed from: r */
    public final C13541c m3411r() {
        return this.f30282s;
    }

    /* renamed from: s */
    public final Request m3410s() {
        return this.f39399A;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response m3409t() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.f30289z
            java.util.List r0 = r0.m9934y()
            kotlin.collections.C9904h.m14832y(r2, r0)
            wj.j r0 = new wj.j
            okhttp3.OkHttpClient r1 = r11.f30289z
            r0.<init>(r1)
            r2.add(r0)
            wj.a r0 = new wj.a
            okhttp3.OkHttpClient r1 = r11.f30289z
            okhttp3.CookieJar r1 = r1.m9942q()
            r0.<init>(r1)
            r2.add(r0)
            tj.a r0 = new tj.a
            okhttp3.OkHttpClient r1 = r11.f30289z
            qj.c r1 = r1.m9949h()
            r0.<init>(r1)
            r2.add(r0)
            vj.a r0 = p389vj.C13539a.f30242a
            r2.add(r0)
            boolean r0 = r11.f39400B
            if (r0 != 0) goto L_0x0046
            okhttp3.OkHttpClient r0 = r11.f30289z
            java.util.List r0 = r0.m9969A()
            kotlin.collections.C9904h.m14832y(r2, r0)
        L_0x0046:
            wj.b r0 = new wj.b
            boolean r1 = r11.f39400B
            r0.<init>(r1)
            r2.add(r0)
            wj.g r9 = new wj.g
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r11.f39399A
            okhttp3.OkHttpClient r0 = r11.f30289z
            int r6 = r0.m9945m()
            okhttp3.OkHttpClient r0 = r11.f30289z
            int r7 = r0.m9961I()
            okhttp3.OkHttpClient r0 = r11.f30289z
            int r8 = r0.m9956N()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.f39399A     // Catch: all -> 0x008a, IOException -> 0x008c
            okhttp3.Response r2 = r9.mo2360a(r2)     // Catch: all -> 0x008a, IOException -> 0x008c
            boolean r3 = r11.mo3420i()     // Catch: all -> 0x008a, IOException -> 0x008c
            if (r3 != 0) goto L_0x007f
            r11.m3406w(r0)
            return r2
        L_0x007f:
            p327rj.C12729c.m5608j(r2)     // Catch: all -> 0x008a, IOException -> 0x008c
            java.io.IOException r2 = new java.io.IOException     // Catch: all -> 0x008a, IOException -> 0x008c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: all -> 0x008a, IOException -> 0x008c
            throw r2     // Catch: all -> 0x008a, IOException -> 0x008c
        L_0x008a:
            r2 = move-exception
            goto L_0x00a1
        L_0x008c:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.m3406w(r1)     // Catch: all -> 0x009d
            if (r1 != 0) goto L_0x009c
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: all -> 0x009d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: all -> 0x009d
            throw r1     // Catch: all -> 0x009d
        L_0x009c:
            throw r1     // Catch: all -> 0x009d
        L_0x009d:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00a1:
            if (r1 != 0) goto L_0x00a6
            r11.m3406w(r0)
        L_0x00a6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p389vj.C13545e.m3409t():okhttp3.Response");
    }

    /* renamed from: u */
    public final C13541c m3408u(C13898g chain) {
        C9971q.m14633g(chain, "chain");
        synchronized (this) {
            if (!this.f30285v) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.f30284u)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f30283t) {
                Unit unit = Unit.f22042a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        C13544d dVar = this.f30279p;
        C9971q.m14636d(dVar);
        C13541c cVar = new C13541c(this, this.f30275l, dVar, dVar.m3439a(this.f30289z, chain));
        this.f30282s = cVar;
        this.f30287x = cVar;
        synchronized (this) {
            this.f30283t = true;
            this.f30284u = true;
        }
        if (!this.f30286w) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:14:0x001d, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043), top: B:46:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:14:0x001d, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043), top: B:46:0x0014 }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E m3407v(p389vj.C13541c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C9971q.m14633g(r3, r0)
            vj.c r0 = r2.f30287x
            boolean r3 = kotlin.jvm.internal.C9971q.m14638b(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f30283t     // Catch: all -> 0x0019
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x005a
        L_0x001b:
            if (r5 == 0) goto L_0x0042
            boolean r1 = r2.f30284u     // Catch: all -> 0x0019
            if (r1 == 0) goto L_0x0042
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f30283t = r3     // Catch: all -> 0x0019
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.f30284u = r3     // Catch: all -> 0x0019
        L_0x0029:
            boolean r4 = r2.f30283t     // Catch: all -> 0x0019
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.f30284u     // Catch: all -> 0x0019
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f30284u     // Catch: all -> 0x0019
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f30285v     // Catch: all -> 0x0019
            if (r4 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r3
        L_0x0040:
            r3 = r5
            goto L_0x0043
        L_0x0042:
            r0 = r3
        L_0x0043:
            kotlin.Unit r4 = kotlin.Unit.f22042a     // Catch: all -> 0x0019
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0052
            r3 = 0
            r2.f30287x = r3
            vj.f r3 = r2.f30280q
            if (r3 == 0) goto L_0x0052
            r3.m3372s()
        L_0x0052:
            if (r0 == 0) goto L_0x0059
            java.io.IOException r3 = r2.m3423e(r6)
            return r3
        L_0x0059:
            return r6
        L_0x005a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p389vj.C13545e.m3407v(vj.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: w */
    public final IOException m3406w(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f30285v) {
                this.f30285v = false;
                if (!this.f30283t && !this.f30284u) {
                    z = true;
                }
            }
            Unit unit = Unit.f22042a;
        }
        if (z) {
            return m3423e(iOException);
        }
        return iOException;
    }

    /* renamed from: x */
    public final String m3405x() {
        return this.f39399A.m9877l().m10035o();
    }

    /* renamed from: y */
    public final Socket m3404y() {
        C13549f fVar = this.f30280q;
        C9971q.m14636d(fVar);
        if (!C12729c.f28589h || Thread.holdsLock(fVar)) {
            List<Reference<C13545e>> n = fVar.m3377n();
            Iterator<Reference<C13545e>> it = n.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C9971q.m14638b(it.next().get(), this)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                n.remove(i);
                this.f30280q = null;
                if (n.isEmpty()) {
                    fVar.m3394C(System.nanoTime());
                    if (this.f30274k.m3362c(fVar)) {
                        return fVar.m3392E();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: z */
    public final boolean m3403z() {
        C13544d dVar = this.f30279p;
        C9971q.m14636d(dVar);
        return dVar.m3435e();
    }
}
