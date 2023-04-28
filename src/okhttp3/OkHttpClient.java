package okhttp3;

import ck.C4080a;
import dk.AbstractC6521c;
import dk.C6523d;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import p015ak.C1457k;
import p089ek.C6953d;
import p307qj.AbstractC12209b;
import p307qj.AbstractC12235m;
import p307qj.AbstractC12237n;
import p307qj.AbstractC12251t;
import p307qj.C12211c;
import p307qj.C12217e;
import p307qj.C12227i;
import p307qj.C12228j;
import p307qj.EnumC12246q;
import p327rj.C12729c;
import p373uj.C13370e;
import p389vj.C13545e;
import p389vj.C13558i;

@Metadata(m15074d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0090\u0001\tB\u0014\b\u0000\u0012\u0007\u0010\u008b\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001B\u000b\b\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008e\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0015\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168G¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010*\u001a\u00020%8G¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u00100\u001a\u00020+8G¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00106\u001a\u0002018G¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00108\u001a\u00020+8G¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010;\u001a\u00020+8G¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010?\u001a\u00020<8G¢\u0006\f\n\u0004\b(\u0010=\u001a\u0004\b2\u0010>R\u0019\u0010D\u001a\u0004\u0018\u00010@8G¢\u0006\f\n\u0004\b7\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010H\u001a\u00020E8G¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\b9\u0010GR\u0019\u0010N\u001a\u0004\u0018\u00010I8G¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010T\u001a\u00020O8G¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010V\u001a\u0002018G¢\u0006\f\n\u0004\b \u00103\u001a\u0004\bU\u00105R\u0017\u0010\\\u001a\u00020W8G¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0016\u0010_\u001a\u0004\u0018\u00010]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010^R\u0019\u0010d\u001a\u0004\u0018\u00010`8G¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u001c8G¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010!R\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020g0\u001c8G¢\u0006\f\n\u0004\bh\u0010\u001f\u001a\u0004\bi\u0010!R\u0017\u0010n\u001a\u00020k8G¢\u0006\f\n\u0004\bi\u0010l\u001a\u0004\bP\u0010mR\u0017\u0010r\u001a\u00020o8G¢\u0006\f\n\u0004\bL\u0010p\u001a\u0004\b\u0017\u0010qR\u0019\u0010v\u001a\u0004\u0018\u00010s8G¢\u0006\f\n\u0004\bU\u0010t\u001a\u0004\b\u0011\u0010uR\u0017\u0010{\u001a\u00020w8G¢\u0006\f\n\u0004\bR\u0010x\u001a\u0004\by\u0010zR\u0017\u0010|\u001a\u00020w8G¢\u0006\f\n\u0004\bx\u0010x\u001a\u0004\b\u001e\u0010zR\u0017\u0010}\u001a\u00020w8G¢\u0006\f\n\u0004\b.\u0010x\u001a\u0004\bx\u0010zR\u0017\u0010\u007f\u001a\u00020w8G¢\u0006\f\n\u0004\bZ\u0010x\u001a\u0004\b~\u0010zR\u0019\u0010\u0081\u0001\u001a\u00020w8G¢\u0006\r\n\u0005\b\u0080\u0001\u0010x\u001a\u0004\bh\u0010zR\u001a\u0010\u0084\u0001\u001a\u00030\u0082\u00018G¢\u0006\r\n\u0004\b\u0005\u0010.\u001a\u0005\bX\u0010\u0083\u0001R\u001b\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0006¢\u0006\u000e\n\u0005\b~\u0010\u0086\u0001\u001a\u0005\bJ\u0010\u0087\u0001R\u0014\u0010\u008a\u0001\u001a\u00020]8G¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0089\u0001¨\u0006\u0091\u0001"}, m15073d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "", "", "M", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "a", "Lqj/t;", "listener", "Lokhttp3/WebSocket;", "C", "Lokhttp3/OkHttpClient$Builder;", "B", "Lokhttp3/Dispatcher;", "k", "Lokhttp3/Dispatcher;", "r", "()Lokhttp3/Dispatcher;", "dispatcher", "Lqj/i;", "l", "Lqj/i;", "n", "()Lqj/i;", "connectionPool", "", "Lokhttp3/Interceptor;", "m", "Ljava/util/List;", "y", "()Ljava/util/List;", "interceptors", "A", "networkInterceptors", "Lqj/n$c;", "o", "Lqj/n$c;", "t", "()Lqj/n$c;", "eventListenerFactory", "", "p", "Z", "J", "()Z", "retryOnConnectionFailure", "Lqj/b;", "q", "Lqj/b;", "f", "()Lqj/b;", "authenticator", "u", "followRedirects", "s", "v", "followSslRedirects", "Lokhttp3/CookieJar;", "Lokhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "cookieJar", "Lqj/c;", "Lqj/c;", "h", "()Lqj/c;", "cache", "Lqj/m;", "Lqj/m;", "()Lqj/m;", "dns", "Ljava/net/Proxy;", "w", "Ljava/net/Proxy;", "F", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "x", "Ljava/net/ProxySelector;", "H", "()Ljava/net/ProxySelector;", "proxySelector", "G", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "z", "Ljavax/net/SocketFactory;", "K", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "O", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lqj/j;", "connectionSpecs", "Lqj/q;", "D", "E", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lqj/e;", "Lqj/e;", "()Lqj/e;", "certificatePinner", "Ldk/c;", "Ldk/c;", "()Ldk/c;", "certificateChainCleaner", "", "I", "j", "()I", "callTimeoutMillis", "connectTimeoutMillis", "readTimeoutMillis", "N", "writeTimeoutMillis", "L", "pingIntervalMillis", "", "()J", "minWebSocketMessageToCompress", "Lvj/i;", "Lvj/i;", "()Lvj/i;", "routeDatabase", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Q", "Builder", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public class OkHttpClient implements Cloneable, Call.Factory {

    /* renamed from: A */
    private final SSLSocketFactory f39008A;

    /* renamed from: B */
    private final X509TrustManager f39009B;

    /* renamed from: C */
    private final List<C12228j> f39010C;

    /* renamed from: D */
    private final List<EnumC12246q> f39011D;

    /* renamed from: E */
    private final HostnameVerifier f39012E;

    /* renamed from: F */
    private final C12217e f39013F;

    /* renamed from: G */
    private final AbstractC6521c f39014G;

    /* renamed from: H */
    private final int f39015H;

    /* renamed from: I */
    private final int f39016I;

    /* renamed from: J */
    private final int f39017J;

    /* renamed from: K */
    private final int f39018K;

    /* renamed from: L */
    private final int f39019L;

    /* renamed from: M */
    private final long f39020M;

    /* renamed from: N */
    private final C13558i f39021N;

    /* renamed from: k */
    private final Dispatcher f25427k;

    /* renamed from: l */
    private final C12227i f25428l;

    /* renamed from: m */
    private final List<Interceptor> f25429m;

    /* renamed from: n */
    private final List<Interceptor> f25430n;

    /* renamed from: o */
    private final AbstractC12237n.AbstractC12240c f25431o;

    /* renamed from: p */
    private final boolean f25432p;

    /* renamed from: q */
    private final AbstractC12209b f25433q;

    /* renamed from: r */
    private final boolean f25434r;

    /* renamed from: s */
    private final boolean f25435s;

    /* renamed from: t */
    private final CookieJar f25436t;

    /* renamed from: u */
    private final C12211c f25437u;

    /* renamed from: v */
    private final AbstractC12235m f25438v;

    /* renamed from: w */
    private final Proxy f25439w;

    /* renamed from: x */
    private final ProxySelector f25440x;

    /* renamed from: y */
    private final AbstractC12209b f25441y;

    /* renamed from: z */
    private final SocketFactory f25442z;

    /* renamed from: Q */
    public static final C11426a f39007Q = new C11426a(null);

    /* renamed from: O */
    private static final List<EnumC12246q> f39005O = C12729c.m5598t(EnumC12246q.HTTP_2, EnumC12246q.HTTP_1_1);

    /* renamed from: P */
    private static final List<C12228j> f39006P = C12729c.m5598t(C12228j.f27504h, C12228j.f27506j);

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, m15073d2 = {"Lokhttp3/OkHttpClient$a;", "", "", "Lqj/q;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lqj/j;", "DEFAULT_CONNECTION_SPECS", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.OkHttpClient$a */
    /* loaded from: classes8.dex */
    public static final class C11426a {
        private C11426a() {
        }

        public /* synthetic */ C11426a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<C12228j> m9890a() {
            return OkHttpClient.f39006P;
        }

        /* renamed from: b */
        public final List<EnumC12246q> m9889b() {
            return OkHttpClient.f39005O;
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector;
        C9971q.m14633g(builder, "builder");
        this.f25427k = builder.m9898s();
        this.f25428l = builder.m9901p();
        this.f25429m = C12729c.m5625R(builder.m9892y());
        this.f25430n = C12729c.m5625R(builder.m9932A());
        this.f25431o = builder.m9896u();
        this.f25432p = builder.m9925H();
        this.f25433q = builder.m9907j();
        this.f25434r = builder.m9895v();
        this.f25435s = builder.m9894w();
        this.f25436t = builder.m9899r();
        this.f25437u = builder.m9906k();
        this.f25438v = builder.m9897t();
        this.f25439w = builder.m9929D();
        if (builder.m9929D() != null) {
            proxySelector = C4080a.f6706a;
        } else {
            proxySelector = builder.m9927F();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C4080a.f6706a;
            }
        }
        this.f25440x = proxySelector;
        this.f25441y = builder.m9928E();
        this.f25442z = builder.m9923J();
        List<C12228j> q = builder.m9900q();
        this.f39010C = q;
        this.f39011D = builder.m9930C();
        this.f39012E = builder.m9893x();
        this.f39015H = builder.m9905l();
        this.f39016I = builder.m9902o();
        this.f39017J = builder.m9926G();
        this.f39018K = builder.m9921L();
        this.f39019L = builder.m9931B();
        this.f39020M = builder.m9891z();
        C13558i I = builder.m9924I();
        this.f39021N = I == null ? new C13558i() : I;
        boolean z = true;
        if (!(q instanceof Collection) || !q.isEmpty()) {
            Iterator<T> it = q.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C12228j) it.next()).m7340f()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f39008A = null;
            this.f39014G = null;
            this.f39009B = null;
            this.f39013F = C12217e.f27416c;
        } else if (builder.m9922K() != null) {
            this.f39008A = builder.m9922K();
            AbstractC6521c m = builder.m9904m();
            C9971q.m14636d(m);
            this.f39014G = m;
            X509TrustManager M = builder.m9920M();
            C9971q.m14636d(M);
            this.f39009B = M;
            C12217e n = builder.m9903n();
            C9971q.m14636d(m);
            this.f39013F = n.m7366e(m);
        } else {
            C1457k.C1458a aVar = C1457k.f517c;
            X509TrustManager p = aVar.m41079g().mo41086p();
            this.f39009B = p;
            C1457k g = aVar.m41079g();
            C9971q.m14636d(p);
            this.f39008A = g.mo41087o(p);
            AbstractC6521c.C6522a aVar2 = AbstractC6521c.f13666a;
            C9971q.m14636d(p);
            AbstractC6521c a = aVar2.m25375a(p);
            this.f39014G = a;
            C12217e n2 = builder.m9903n();
            C9971q.m14636d(a);
            this.f39013F = n2.m7366e(a);
        }
        m9957M();
    }

    /* renamed from: M */
    private final void m9957M() {
        List<Interceptor> list;
        List<Interceptor> list2;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f25429m != null) {
            boolean z4 = true;
            if (!list.contains(null)) {
                if (this.f25430n == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                } else if (!list2.contains(null)) {
                    List<C12228j> list3 = this.f39010C;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        for (C12228j jVar : list3) {
                            if (jVar.m7340f()) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        if (this.f39008A == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (this.f39014G == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                if (this.f39009B != null) {
                                    z4 = false;
                                }
                                if (!z4) {
                                    throw new IllegalStateException("Check failed.".toString());
                                } else if (!C9971q.m14638b(this.f39013F, C12217e.f27416c)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else if (this.f39008A == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    } else if (this.f39014G == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    } else if (this.f39009B == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                } else {
                    throw new IllegalStateException(("Null network interceptor: " + this.f25430n).toString());
                }
            } else {
                throw new IllegalStateException(("Null interceptor: " + this.f25429m).toString());
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
    }

    /* renamed from: A */
    public final List<Interceptor> m9969A() {
        return this.f25430n;
    }

    /* renamed from: B */
    public Builder m9968B() {
        return new Builder(this);
    }

    /* renamed from: C */
    public WebSocket m9967C(Request request, AbstractC12251t listener) {
        C9971q.m14633g(request, "request");
        C9971q.m14633g(listener, "listener");
        C6953d dVar = new C6953d(C13370e.f29933h, request, listener, new Random(), this.f39019L, null, this.f39020M);
        dVar.m23847p(this);
        return dVar;
    }

    /* renamed from: D */
    public final int m9966D() {
        return this.f39019L;
    }

    /* renamed from: E */
    public final List<EnumC12246q> m9965E() {
        return this.f39011D;
    }

    /* renamed from: F */
    public final Proxy m9964F() {
        return this.f25439w;
    }

    /* renamed from: G */
    public final AbstractC12209b m9963G() {
        return this.f25441y;
    }

    /* renamed from: H */
    public final ProxySelector m9962H() {
        return this.f25440x;
    }

    /* renamed from: I */
    public final int m9961I() {
        return this.f39017J;
    }

    /* renamed from: J */
    public final boolean m9960J() {
        return this.f25432p;
    }

    /* renamed from: K */
    public final SocketFactory m9959K() {
        return this.f25442z;
    }

    /* renamed from: L */
    public final SSLSocketFactory m9958L() {
        SSLSocketFactory sSLSocketFactory = this.f39008A;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: N */
    public final int m9956N() {
        return this.f39018K;
    }

    /* renamed from: O */
    public final X509TrustManager m9955O() {
        return this.f39009B;
    }

    @Override // okhttp3.Call.Factory
    /* renamed from: a */
    public Call mo9954a(Request request) {
        C9971q.m14633g(request, "request");
        return new C13545e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: f */
    public final AbstractC12209b m9950f() {
        return this.f25433q;
    }

    /* renamed from: h */
    public final C12211c m9949h() {
        return this.f25437u;
    }

    /* renamed from: j */
    public final int m9948j() {
        return this.f39015H;
    }

    /* renamed from: k */
    public final AbstractC6521c m9947k() {
        return this.f39014G;
    }

    /* renamed from: l */
    public final C12217e m9946l() {
        return this.f39013F;
    }

    /* renamed from: m */
    public final int m9945m() {
        return this.f39016I;
    }

    /* renamed from: n */
    public final C12227i m9944n() {
        return this.f25428l;
    }

    /* renamed from: o */
    public final List<C12228j> m9943o() {
        return this.f39010C;
    }

    /* renamed from: q */
    public final CookieJar m9942q() {
        return this.f25436t;
    }

    /* renamed from: r */
    public final Dispatcher m9941r() {
        return this.f25427k;
    }

    /* renamed from: s */
    public final AbstractC12235m m9940s() {
        return this.f25438v;
    }

    /* renamed from: t */
    public final AbstractC12237n.AbstractC12240c m9939t() {
        return this.f25431o;
    }

    /* renamed from: u */
    public final boolean m9938u() {
        return this.f25434r;
    }

    /* renamed from: v */
    public final boolean m9937v() {
        return this.f25435s;
    }

    /* renamed from: w */
    public final C13558i m9936w() {
        return this.f39021N;
    }

    /* renamed from: x */
    public final HostnameVerifier m9935x() {
        return this.f39012E;
    }

    /* renamed from: y */
    public final List<Interceptor> m9934y() {
        return this.f25429m;
    }

    /* renamed from: z */
    public final long m9933z() {
        return this.f39020M;
    }

    @Metadata(m15074d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¿\u0001\u0010À\u0001B\u0014\b\u0010\u0012\u0007\u0010Á\u0001\u001a\u00020 ¢\u0006\u0006\b¿\u0001\u0010Â\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0016\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020 R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010/\u001a\u0004\b0\u00101R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\b3\u00101R\"\u0010;\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010<\u001a\u0004\bI\u0010>\"\u0004\bJ\u0010@R\"\u0010M\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010<\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bS\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010o\u001a\u0004\u0018\u00010h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010s\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010C\u001a\u0004\bq\u0010E\"\u0004\br\u0010GR\"\u0010z\u001a\u00020t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR'\u0010\u0082\u0001\u001a\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R+\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R,\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b#\u0010/\u001a\u0004\b|\u00101\"\u0006\b\u008b\u0001\u0010\u008c\u0001R+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b[\u0010/\u001a\u0005\b\u008e\u0001\u00101\"\u0006\b\u008f\u0001\u0010\u008c\u0001R)\u0010\u0096\u0001\u001a\u00030\u0090\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b7\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bI\u0010\u0098\u0001\u001a\u0005\bi\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010¢\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bK\u0010\u009e\u0001\u001a\u0005\ba\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R)\u0010¨\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010¤\u0001\u001a\u0005\bY\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R(\u0010ª\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b0\u0010¤\u0001\u001a\u0005\bp\u0010¥\u0001\"\u0006\b©\u0001\u0010§\u0001R*\u0010®\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¤\u0001\u001a\u0006\b¬\u0001\u0010¥\u0001\"\u0006\b\u00ad\u0001\u0010§\u0001R)\u0010±\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b3\u0010¤\u0001\u001a\u0006\b¯\u0001\u0010¥\u0001\"\u0006\b°\u0001\u0010§\u0001R*\u0010´\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010¤\u0001\u001a\u0006\b²\u0001\u0010¥\u0001\"\u0006\b³\u0001\u0010§\u0001R(\u0010¸\u0001\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u008e\u0001\u0010v\u001a\u0006\b«\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R+\u0010¾\u0001\u001a\u0005\u0018\u00010¹\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bc\u0010º\u0001\u001a\u0006\b¤\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001¨\u0006Ã\u0001"}, m15073d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Dispatcher;", "dispatcher", "g", "Lokhttp3/Interceptor;", "interceptor", "a", "b", "Lqj/n;", "eventListener", "h", "", "followRedirects", "i", "Lokhttp3/CookieJar;", "cookieJar", "f", "Lqj/c;", "cache", "d", "", "Lqj/q;", "protocols", "N", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "e", "O", "P", "Lokhttp3/OkHttpClient;", "c", "Lokhttp3/Dispatcher;", "s", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lqj/i;", "Lqj/i;", "p", "()Lqj/i;", "setConnectionPool$okhttp", "(Lqj/i;)V", "connectionPool", "", "Ljava/util/List;", "y", "()Ljava/util/List;", "interceptors", "A", "networkInterceptors", "Lqj/n$c;", "Lqj/n$c;", "u", "()Lqj/n$c;", "setEventListenerFactory$okhttp", "(Lqj/n$c;)V", "eventListenerFactory", "Z", "H", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "retryOnConnectionFailure", "Lqj/b;", "Lqj/b;", "j", "()Lqj/b;", "setAuthenticator$okhttp", "(Lqj/b;)V", "authenticator", "v", "setFollowRedirects$okhttp", "w", "setFollowSslRedirects$okhttp", "followSslRedirects", "Lokhttp3/CookieJar;", "r", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "k", "Lqj/c;", "()Lqj/c;", "setCache$okhttp", "(Lqj/c;)V", "Lqj/m;", "l", "Lqj/m;", "t", "()Lqj/m;", "setDns$okhttp", "(Lqj/m;)V", "dns", "Ljava/net/Proxy;", "m", "Ljava/net/Proxy;", "D", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxy", "Ljava/net/ProxySelector;", "n", "Ljava/net/ProxySelector;", "F", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "o", "E", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "J", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "q", "Ljavax/net/ssl/SSLSocketFactory;", "K", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "M", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "Lqj/j;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", "C", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "x", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "hostnameVerifier", "Lqj/e;", "Lqj/e;", "()Lqj/e;", "setCertificatePinner$okhttp", "(Lqj/e;)V", "certificatePinner", "Ldk/c;", "Ldk/c;", "()Ldk/c;", "setCertificateChainCleaner$okhttp", "(Ldk/c;)V", "certificateChainCleaner", "", "I", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "z", "G", "setReadTimeout$okhttp", "readTimeout", "L", "setWriteTimeout$okhttp", "writeTimeout", "B", "setPingInterval$okhttp", "pingInterval", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Lvj/i;", "Lvj/i;", "()Lvj/i;", "setRouteDatabase$okhttp", "(Lvj/i;)V", "routeDatabase", "<init>", "()V", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: A */
        private int f39022A;

        /* renamed from: B */
        private int f39023B;

        /* renamed from: C */
        private long f39024C;

        /* renamed from: D */
        private C13558i f39025D;

        /* renamed from: a */
        private Dispatcher f25443a;

        /* renamed from: b */
        private C12227i f25444b;

        /* renamed from: c */
        private final List<Interceptor> f25445c;

        /* renamed from: d */
        private final List<Interceptor> f25446d;

        /* renamed from: e */
        private AbstractC12237n.AbstractC12240c f25447e;

        /* renamed from: f */
        private boolean f25448f;

        /* renamed from: g */
        private AbstractC12209b f25449g;

        /* renamed from: h */
        private boolean f25450h;

        /* renamed from: i */
        private boolean f25451i;

        /* renamed from: j */
        private CookieJar f25452j;

        /* renamed from: k */
        private C12211c f25453k;

        /* renamed from: l */
        private AbstractC12235m f25454l;

        /* renamed from: m */
        private Proxy f25455m;

        /* renamed from: n */
        private ProxySelector f25456n;

        /* renamed from: o */
        private AbstractC12209b f25457o;

        /* renamed from: p */
        private SocketFactory f25458p;

        /* renamed from: q */
        private SSLSocketFactory f25459q;

        /* renamed from: r */
        private X509TrustManager f25460r;

        /* renamed from: s */
        private List<C12228j> f25461s;

        /* renamed from: t */
        private List<? extends EnumC12246q> f25462t;

        /* renamed from: u */
        private HostnameVerifier f25463u;

        /* renamed from: v */
        private C12217e f25464v;

        /* renamed from: w */
        private AbstractC6521c f25465w;

        /* renamed from: x */
        private int f25466x;

        /* renamed from: y */
        private int f25467y;

        /* renamed from: z */
        private int f25468z;

        public Builder() {
            this.f25443a = new Dispatcher();
            this.f25444b = new C12227i();
            this.f25445c = new ArrayList();
            this.f25446d = new ArrayList();
            this.f25447e = C12729c.m5613e(AbstractC12237n.f27542a);
            this.f25448f = true;
            AbstractC12209b bVar = AbstractC12209b.f27381a;
            this.f25449g = bVar;
            this.f25450h = true;
            this.f25451i = true;
            this.f25452j = CookieJar.f25367a;
            this.f25454l = AbstractC12235m.f27540a;
            this.f25457o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C9971q.m14634f(socketFactory, "SocketFactory.getDefault()");
            this.f25458p = socketFactory;
            C11426a aVar = OkHttpClient.f39007Q;
            this.f25461s = aVar.m9890a();
            this.f25462t = aVar.m9889b();
            this.f25463u = C6523d.f13667a;
            this.f25464v = C12217e.f27416c;
            this.f25467y = 10000;
            this.f25468z = 10000;
            this.f39022A = 10000;
            this.f39024C = 1024L;
        }

        /* renamed from: A */
        public final List<Interceptor> m9932A() {
            return this.f25446d;
        }

        /* renamed from: B */
        public final int m9931B() {
            return this.f39023B;
        }

        /* renamed from: C */
        public final List<EnumC12246q> m9930C() {
            return this.f25462t;
        }

        /* renamed from: D */
        public final Proxy m9929D() {
            return this.f25455m;
        }

        /* renamed from: E */
        public final AbstractC12209b m9928E() {
            return this.f25457o;
        }

        /* renamed from: F */
        public final ProxySelector m9927F() {
            return this.f25456n;
        }

        /* renamed from: G */
        public final int m9926G() {
            return this.f25468z;
        }

        /* renamed from: H */
        public final boolean m9925H() {
            return this.f25448f;
        }

        /* renamed from: I */
        public final C13558i m9924I() {
            return this.f39025D;
        }

        /* renamed from: J */
        public final SocketFactory m9923J() {
            return this.f25458p;
        }

        /* renamed from: K */
        public final SSLSocketFactory m9922K() {
            return this.f25459q;
        }

        /* renamed from: L */
        public final int m9921L() {
            return this.f39022A;
        }

        /* renamed from: M */
        public final X509TrustManager m9920M() {
            return this.f25460r;
        }

        /* renamed from: N */
        public final Builder m9919N(List<? extends EnumC12246q> protocols) {
            List F0;
            boolean z;
            C9971q.m14633g(protocols, "protocols");
            F0 = C9914r.m14788F0(protocols);
            EnumC12246q qVar = EnumC12246q.H2_PRIOR_KNOWLEDGE;
            boolean z2 = false;
            if (F0.contains(qVar) || F0.contains(EnumC12246q.HTTP_1_1)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!F0.contains(qVar) || F0.size() <= 1) {
                    z2 = true;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + F0).toString());
                } else if (!(!F0.contains(EnumC12246q.HTTP_1_0))) {
                    throw new IllegalArgumentException(("protocols must not contain http/1.0: " + F0).toString());
                } else if (!F0.contains(null)) {
                    F0.remove(EnumC12246q.SPDY_3);
                    if (!C9971q.m14638b(F0, this.f25462t)) {
                        this.f39025D = null;
                    }
                    List<? extends EnumC12246q> unmodifiableList = Collections.unmodifiableList(F0);
                    C9971q.m14634f(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                    this.f25462t = unmodifiableList;
                    return this;
                } else {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
            } else {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + F0).toString());
            }
        }

        /* renamed from: O */
        public final Builder m9918O(long j, TimeUnit unit) {
            C9971q.m14633g(unit, "unit");
            this.f25468z = C12729c.m5610h("timeout", j, unit);
            return this;
        }

        /* renamed from: P */
        public final Builder m9917P(long j, TimeUnit unit) {
            C9971q.m14633g(unit, "unit");
            this.f39022A = C12729c.m5610h("timeout", j, unit);
            return this;
        }

        /* renamed from: a */
        public final Builder m9916a(Interceptor interceptor) {
            C9971q.m14633g(interceptor, "interceptor");
            this.f25445c.add(interceptor);
            return this;
        }

        /* renamed from: b */
        public final Builder m9915b(Interceptor interceptor) {
            C9971q.m14633g(interceptor, "interceptor");
            this.f25446d.add(interceptor);
            return this;
        }

        /* renamed from: c */
        public final OkHttpClient m9914c() {
            return new OkHttpClient(this);
        }

        /* renamed from: d */
        public final Builder m9913d(C12211c cVar) {
            this.f25453k = cVar;
            return this;
        }

        /* renamed from: e */
        public final Builder m9912e(long j, TimeUnit unit) {
            C9971q.m14633g(unit, "unit");
            this.f25467y = C12729c.m5610h("timeout", j, unit);
            return this;
        }

        /* renamed from: f */
        public final Builder m9911f(CookieJar cookieJar) {
            C9971q.m14633g(cookieJar, "cookieJar");
            this.f25452j = cookieJar;
            return this;
        }

        /* renamed from: g */
        public final Builder m9910g(Dispatcher dispatcher) {
            C9971q.m14633g(dispatcher, "dispatcher");
            this.f25443a = dispatcher;
            return this;
        }

        /* renamed from: h */
        public final Builder m9909h(AbstractC12237n eventListener) {
            C9971q.m14633g(eventListener, "eventListener");
            this.f25447e = C12729c.m5613e(eventListener);
            return this;
        }

        /* renamed from: i */
        public final Builder m9908i(boolean z) {
            this.f25450h = z;
            return this;
        }

        /* renamed from: j */
        public final AbstractC12209b m9907j() {
            return this.f25449g;
        }

        /* renamed from: k */
        public final C12211c m9906k() {
            return this.f25453k;
        }

        /* renamed from: l */
        public final int m9905l() {
            return this.f25466x;
        }

        /* renamed from: m */
        public final AbstractC6521c m9904m() {
            return this.f25465w;
        }

        /* renamed from: n */
        public final C12217e m9903n() {
            return this.f25464v;
        }

        /* renamed from: o */
        public final int m9902o() {
            return this.f25467y;
        }

        /* renamed from: p */
        public final C12227i m9901p() {
            return this.f25444b;
        }

        /* renamed from: q */
        public final List<C12228j> m9900q() {
            return this.f25461s;
        }

        /* renamed from: r */
        public final CookieJar m9899r() {
            return this.f25452j;
        }

        /* renamed from: s */
        public final Dispatcher m9898s() {
            return this.f25443a;
        }

        /* renamed from: t */
        public final AbstractC12235m m9897t() {
            return this.f25454l;
        }

        /* renamed from: u */
        public final AbstractC12237n.AbstractC12240c m9896u() {
            return this.f25447e;
        }

        /* renamed from: v */
        public final boolean m9895v() {
            return this.f25450h;
        }

        /* renamed from: w */
        public final boolean m9894w() {
            return this.f25451i;
        }

        /* renamed from: x */
        public final HostnameVerifier m9893x() {
            return this.f25463u;
        }

        /* renamed from: y */
        public final List<Interceptor> m9892y() {
            return this.f25445c;
        }

        /* renamed from: z */
        public final long m9891z() {
            return this.f39024C;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            C9971q.m14633g(okHttpClient, "okHttpClient");
            this.f25443a = okHttpClient.m9941r();
            this.f25444b = okHttpClient.m9944n();
            C9911o.m14801y(this.f25445c, okHttpClient.m9934y());
            C9911o.m14801y(this.f25446d, okHttpClient.m9969A());
            this.f25447e = okHttpClient.m9939t();
            this.f25448f = okHttpClient.m9960J();
            this.f25449g = okHttpClient.m9950f();
            this.f25450h = okHttpClient.m9938u();
            this.f25451i = okHttpClient.m9937v();
            this.f25452j = okHttpClient.m9942q();
            this.f25453k = okHttpClient.m9949h();
            this.f25454l = okHttpClient.m9940s();
            this.f25455m = okHttpClient.m9964F();
            this.f25456n = okHttpClient.m9962H();
            this.f25457o = okHttpClient.m9963G();
            this.f25458p = okHttpClient.m9959K();
            this.f25459q = okHttpClient.f39008A;
            this.f25460r = okHttpClient.m9955O();
            this.f25461s = okHttpClient.m9943o();
            this.f25462t = okHttpClient.m9965E();
            this.f25463u = okHttpClient.m9935x();
            this.f25464v = okHttpClient.m9946l();
            this.f25465w = okHttpClient.m9947k();
            this.f25466x = okHttpClient.m9948j();
            this.f25467y = okHttpClient.m9945m();
            this.f25468z = okHttpClient.m9961I();
            this.f39022A = okHttpClient.m9956N();
            this.f39023B = okHttpClient.m9966D();
            this.f39024C = okHttpClient.m9933z();
            this.f39025D = okHttpClient.m9936w();
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
