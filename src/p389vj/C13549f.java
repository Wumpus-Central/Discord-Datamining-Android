package p389vj;

import com.facebook.react.uimanager.ViewProps;
import dk.AbstractC6521c;
import dk.C6523d;
import fk.C7366m;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import p015ak.C1457k;
import p089ek.C6953d;
import p307qj.AbstractC12226h;
import p307qj.AbstractC12237n;
import p307qj.C12208a;
import p307qj.C12217e;
import p307qj.C12228j;
import p307qj.C12241o;
import p307qj.C12248r;
import p307qj.EnumC12246q;
import p326ri.C12709n;
import p326ri.C12718u;
import p327rj.C12729c;
import p373uj.C13370e;
import p409wj.AbstractC13895d;
import p409wj.C13898g;
import p430xj.C14172b;
import p450yj.C14448a;
import p450yj.C14457f;
import p450yj.C14475g;
import p450yj.C14481i;
import p450yj.C14492m;
import p450yj.C14494n;
import p450yj.EnumC14449b;

@Metadata(m15074d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001GB\u001c\u0012\b\u0010\u0084\u0001\u001a\u00030\u0080\u0001\u0012\u0007\u0010\u0086\u0001\u001a\u00020\u001b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J>\u0010(\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u0010,\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\u001bH\u0016J\u0006\u0010;\u001a\u00020\u000bJ\b\u0010=\u001a\u00020<H\u0016J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dJ\u0010\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0016J\n\u0010H\u001a\u0004\u0018\u00010 H\u0016J'\u0010L\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020N2\b\u0010\"\u001a\u0004\u0018\u00010JH\u0000¢\u0006\u0004\bO\u0010PJ\b\u0010R\u001a\u00020QH\u0016R\u0018\u0010U\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010TR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010aR\"\u0010h\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010cR\"\u0010o\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010jR\u0016\u0010r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010jR\u0016\u0010t\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010jR#\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0v0u8\u0006¢\u0006\f\n\u0004\bd\u0010w\u001a\u0004\bq\u0010xR\"\u0010\u007f\u001a\u00020z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010{\u001a\u0004\bs\u0010|\"\u0004\b}\u0010~R\u001c\u0010\u0084\u0001\u001a\u00030\u0080\u00018\u0006¢\u0006\u000f\n\u0005\bH\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u0085\u0001R\u0016\u0010\u0088\u0001\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010e¨\u0006\u008b\u0001"}, m15073d2 = {"Lvj/f;", "Lyj/f$d;", "Lqj/h;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/Call;", "call", "Lqj/n;", "eventListener", "", "j", "h", "Lvj/b;", "connectionSpecSelector", "pingIntervalMillis", "m", "F", "i", "Lokhttp3/Request;", "tunnelRequest", "Lokhttp3/HttpUrl;", "url", "k", "l", "", "Lqj/r;", "candidates", "", "B", "G", "Lqj/o;", "handshake", "e", "z", "()V", "y", "s", "connectionRetryEnabled", "f", "Lqj/a;", "address", "routes", "t", "(Lqj/a;Ljava/util/List;)Z", "Lokhttp3/OkHttpClient;", "client", "Lwj/g;", "chain", "Lwj/d;", "w", "(Lokhttp3/OkHttpClient;Lwj/g;)Lwj/d;", "Lvj/c;", "exchange", "Lek/d$d;", "x", "(Lvj/c;)Lek/d$d;", "A", "d", "Ljava/net/Socket;", "E", "doExtensiveChecks", "u", "Lyj/i;", "stream", "b", "Lyj/f;", "connection", "Lyj/m;", "settings", "a", "r", "failedRoute", "Ljava/io/IOException;", "failure", "g", "(Lokhttp3/OkHttpClient;Lqj/r;Ljava/io/IOException;)V", "Lvj/e;", "H", "(Lvj/e;Ljava/io/IOException;)V", "", "toString", "c", "Ljava/net/Socket;", "rawSocket", "socket", "Lqj/o;", "Lqj/q;", "Lqj/q;", "protocol", "Lyj/f;", "http2Connection", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "Lokio/BufferedSink;", "sink", "Z", "p", "()Z", "D", "(Z)V", "noNewExchanges", "noCoalescedConnections", "I", "q", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "successCount", "n", "refusedStreamCount", "o", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "C", "(J)V", "idleAtNs", "Lvj/h;", "Lvj/h;", "getConnectionPool", "()Lvj/h;", "connectionPool", "Lqj/r;", "route", "v", "isMultiplexed", "<init>", "(Lvj/h;Lqj/r;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.f */
/* loaded from: classes8.dex */
public final class C13549f extends C14457f.AbstractC14461d implements AbstractC12226h {

    /* renamed from: t */
    public static final C13550a f30295t = new C13550a(null);

    /* renamed from: c */
    private Socket f30296c;

    /* renamed from: d */
    private Socket f30297d;

    /* renamed from: e */
    private C12241o f30298e;

    /* renamed from: f */
    private EnumC12246q f30299f;

    /* renamed from: g */
    private C14457f f30300g;

    /* renamed from: h */
    private BufferedSource f30301h;

    /* renamed from: i */
    private BufferedSink f30302i;

    /* renamed from: j */
    private boolean f30303j;

    /* renamed from: k */
    private boolean f30304k;

    /* renamed from: l */
    private int f30305l;

    /* renamed from: m */
    private int f30306m;

    /* renamed from: n */
    private int f30307n;

    /* renamed from: o */
    private int f30308o = 1;

    /* renamed from: p */
    private final List<Reference<C13545e>> f30309p = new ArrayList();

    /* renamed from: q */
    private long f30310q = Long.MAX_VALUE;

    /* renamed from: r */
    private final C13555h f30311r;

    /* renamed from: s */
    private final C12248r f30312s;

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m15073d2 = {"Lvj/f$a;", "", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.f$a */
    /* loaded from: classes8.dex */
    public static final class C13550a {
        private C13550a() {
        }

        public /* synthetic */ C13550a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
    /* renamed from: vj.f$b */
    /* loaded from: classes8.dex */
    public static final class C13551b extends AbstractC9973s implements Function0<List<? extends Certificate>> {

        /* renamed from: k */
        final /* synthetic */ C12217e f30313k;

        /* renamed from: l */
        final /* synthetic */ C12241o f30314l;

        /* renamed from: m */
        final /* synthetic */ C12208a f30315m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13551b(C12217e eVar, C12241o oVar, C12208a aVar) {
            super(0);
            this.f30313k = eVar;
            this.f30314l = oVar;
            this.f30315m = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            AbstractC6521c d = this.f30313k.m7367d();
            C9971q.m14636d(d);
            return d.mo25376a(this.f30314l.m7276d(), this.f30315m.m7399l().m10042h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
    /* renamed from: vj.f$c */
    /* loaded from: classes8.dex */
    public static final class C13552c extends AbstractC9973s implements Function0<List<? extends X509Certificate>> {
        C13552c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends X509Certificate> invoke() {
            int t;
            C12241o oVar = C13549f.this.f30298e;
            C9971q.m14636d(oVar);
            List<Certificate> d = oVar.m7276d();
            t = C9907k.m14809t(d, 10);
            ArrayList arrayList = new ArrayList(t);
            for (Certificate certificate : d) {
                if (certificate != null) {
                    arrayList.add((X509Certificate) certificate);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            return arrayList;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"vj/f$d", "Lek/d$d;", "", "close", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.f$d */
    /* loaded from: classes8.dex */
    public static final class C13553d extends C6953d.AbstractC0211d {

        /* renamed from: n */
        final /* synthetic */ C13541c f30317n;

        /* renamed from: o */
        final /* synthetic */ BufferedSource f30318o;

        /* renamed from: p */
        final /* synthetic */ BufferedSink f30319p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13553d(C13541c cVar, BufferedSource bufferedSource, BufferedSink bufferedSink, boolean z, BufferedSource bufferedSource2, BufferedSink bufferedSink2) {
            super(z, bufferedSource2, bufferedSink2);
            this.f30317n = cVar;
            this.f30318o = bufferedSource;
            this.f30319p = bufferedSink;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f30317n.m3463a(-1L, true, true, null);
        }
    }

    public C13549f(C13555h connectionPool, C12248r route) {
        C9971q.m14633g(connectionPool, "connectionPool");
        C9971q.m14633g(route, "route");
        this.f30311r = connectionPool;
        this.f30312s = route;
    }

    /* renamed from: B */
    private final boolean m3395B(List<C12248r> list) {
        boolean z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C12248r rVar : list) {
            if (rVar.m7267b().type() == Proxy.Type.DIRECT && this.f30312s.m7267b().type() == Proxy.Type.DIRECT && C9971q.m14638b(this.f30312s.m7265d(), rVar.m7265d())) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    private final void m3391F(int i) {
        Socket socket = this.f30297d;
        C9971q.m14636d(socket);
        BufferedSource bufferedSource = this.f30301h;
        C9971q.m14636d(bufferedSource);
        BufferedSink bufferedSink = this.f30302i;
        C9971q.m14636d(bufferedSink);
        socket.setSoTimeout(0);
        C14457f a = new C14457f.C14459b(true, C13370e.f29933h).m475m(socket, this.f30312s.m7268a().m7399l().m10042h(), bufferedSource, bufferedSink).m477k(this).m476l(i).m487a();
        this.f30300g = a;
        this.f30308o = C14457f.f39497N.m474a().m351d();
        C14457f.m509b1(a, false, null, 3, null);
    }

    /* renamed from: G */
    private final boolean m3390G(HttpUrl httpUrl) {
        C12241o oVar;
        if (!C12729c.f28589h || Thread.holdsLock(this)) {
            HttpUrl l = this.f30312s.m7268a().m7399l();
            if (httpUrl.m10037m() != l.m10037m()) {
                return false;
            }
            if (C9971q.m14638b(httpUrl.m10042h(), l.m10042h())) {
                return true;
            }
            if (this.f30304k || (oVar = this.f30298e) == null) {
                return false;
            }
            C9971q.m14636d(oVar);
            if (m3386e(httpUrl, oVar)) {
                return true;
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: e */
    private final boolean m3386e(HttpUrl httpUrl, C12241o oVar) {
        List<Certificate> d = oVar.m7276d();
        if (!d.isEmpty()) {
            C6523d dVar = C6523d.f13667a;
            String h = httpUrl.m10042h();
            Certificate certificate = d.get(0);
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } else if (dVar.m25370e(h, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final void m3383h(int i, int i2, Call call, AbstractC12237n nVar) {
        Socket socket;
        int i3;
        Proxy b = this.f30312s.m7267b();
        C12208a a = this.f30312s.m7268a();
        Proxy.Type type = b.type();
        if (type != null && ((i3 = C13554g.f30320a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = a.m7401j().createSocket();
            C9971q.m14636d(socket);
        } else {
            socket = new Socket(b);
        }
        this.f30296c = socket;
        nVar.m7296j(call, this.f30312s.m7265d(), b);
        socket.setSoTimeout(i2);
        try {
            C1457k.f517c.m41079g().mo41096f(socket, this.f30312s.m7265d(), i);
            try {
                this.f30301h = C7366m.m22819d(C7366m.m22810m(socket));
                this.f30302i = C7366m.m22820c(C7366m.m22814i(socket));
            } catch (NullPointerException e) {
                if (C9971q.m14638b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f30312s.m7265d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: i */
    private final void m3382i(C13540b bVar) {
        Throwable th2;
        EnumC12246q qVar;
        String h;
        C12208a a = this.f30312s.m7268a();
        SSLSocketFactory k = a.m7400k();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            C9971q.m14636d(k);
            Socket createSocket = k.createSocket(this.f30296c, a.m7399l().m10042h(), a.m7399l().m10037m(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    C12228j a2 = bVar.m3466a(sSLSocket2);
                    if (a2.m7338h()) {
                        C1457k.f517c.m41079g().mo41097e(sSLSocket2, a.m7399l().m10042h(), a.m7405f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession sslSocketSession = sSLSocket2.getSession();
                    C12241o.C12242a aVar = C12241o.f27544e;
                    C9971q.m14634f(sslSocketSession, "sslSocketSession");
                    C12241o a3 = aVar.m7274a(sslSocketSession);
                    HostnameVerifier e = a.m7406e();
                    C9971q.m14636d(e);
                    if (!e.verify(a.m7399l().m10042h(), sslSocketSession)) {
                        List<Certificate> d = a3.m7276d();
                        if (!d.isEmpty()) {
                            Certificate certificate = d.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\n              |Hostname ");
                            sb2.append(a.m7399l().m10042h());
                            sb2.append(" not verified:\n              |    certificate: ");
                            sb2.append(C12217e.f27417d.m7364a(x509Certificate));
                            sb2.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            C9971q.m14634f(subjectDN, "cert.subjectDN");
                            sb2.append(subjectDN.getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(C6523d.f13667a.m25374a(x509Certificate));
                            sb2.append("\n              ");
                            h = C12709n.m5754h(sb2.toString(), null, 1, null);
                            throw new SSLPeerUnverifiedException(h);
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + a.m7399l().m10042h() + " not verified (no certificates)");
                    }
                    C12217e a4 = a.m7410a();
                    C9971q.m14636d(a4);
                    this.f30298e = new C12241o(a3.m7275e(), a3.m7279a(), a3.m7277c(), new C13551b(a4, a3, a));
                    a4.m7369b(a.m7399l().m10042h(), new C13552c());
                    if (a2.m7338h()) {
                        str = C1457k.f517c.m41079g().mo41094h(sSLSocket2);
                    }
                    this.f30297d = sSLSocket2;
                    this.f30301h = C7366m.m22819d(C7366m.m22810m(sSLSocket2));
                    this.f30302i = C7366m.m22820c(C7366m.m22814i(sSLSocket2));
                    if (str != null) {
                        qVar = EnumC12246q.f27560s.m7269a(str);
                    } else {
                        qVar = EnumC12246q.HTTP_1_1;
                    }
                    this.f30299f = qVar;
                    C1457k.f517c.m41079g().mo41100b(sSLSocket2);
                } catch (Throwable th3) {
                    th2 = th3;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C1457k.f517c.m41079g().mo41100b(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        C12729c.m5607k(sSLSocket);
                    }
                    throw th2;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* renamed from: j */
    private final void m3381j(int i, int i2, int i3, Call call, AbstractC12237n nVar) {
        Request l = m3379l();
        HttpUrl l2 = l.m9877l();
        for (int i4 = 0; i4 < 21; i4++) {
            m3383h(i, i2, call, nVar);
            l = m3380k(i2, i3, l, l2);
            if (l != null) {
                Socket socket = this.f30296c;
                if (socket != null) {
                    C12729c.m5607k(socket);
                }
                this.f30296c = null;
                this.f30302i = null;
                this.f30301h = null;
                nVar.m7298h(call, this.f30312s.m7265d(), this.f30312s.m7267b(), null);
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    private final Request m3380k(int i, int i2, Request request, HttpUrl httpUrl) {
        boolean t;
        String str = "CONNECT " + C12729c.m5627P(httpUrl, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f30301h;
            C9971q.m14636d(bufferedSource);
            BufferedSink bufferedSink = this.f30302i;
            C9971q.m14636d(bufferedSink);
            C14172b bVar = new C14172b(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.timeout().mo9679g(i, timeUnit);
            bufferedSink.timeout().mo9679g(i2, timeUnit);
            bVar.m1459A(request.m9883f(), str);
            bVar.mo468a();
            Response.C11430a g = bVar.mo462g(false);
            C9971q.m14636d(g);
            Response c = g.m9815r(request).m9830c();
            bVar.m1441z(c);
            int l = c.m9839l();
            if (l != 200) {
                if (l == 407) {
                    Request a = this.f30312s.m7268a().m7403h().mo5081a(this.f30312s, c);
                    if (a != null) {
                        t = C12718u.m5732t("close", Response.m9834t(c, "Connection", null, 2, null), true);
                        if (t) {
                            return a;
                        }
                        request = a;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c.m9839l());
                }
            } else if (bufferedSource.mo9734c().mo9731h0() && bufferedSink.mo9747c().mo9731h0()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: l */
    private final Request m3379l() {
        Request b = new Request.Builder().m9864m(this.f30312s.m7268a().m7399l()).m9870g("CONNECT", null).m9872e("Host", C12729c.m5627P(this.f30312s.m7268a().m7399l(), true)).m9872e("Proxy-Connection", "Keep-Alive").m9872e("User-Agent", "okhttp/4.9.2").m9875b();
        Request a = this.f30312s.m7268a().m7403h().mo5081a(this.f30312s, new Response.C11430a().m9815r(b).m9817p(EnumC12246q.HTTP_1_1).m9826g(407).m9820m("Preemptive Authenticate").m9831b(C12729c.f28584c).m9814s(-1L).m9816q(-1L).m9823j("Proxy-Authenticate", "OkHttp-Preemptive").m9830c());
        if (a != null) {
            return a;
        }
        return b;
    }

    /* renamed from: m */
    private final void m3378m(C13540b bVar, int i, Call call, AbstractC12237n nVar) {
        if (this.f30312s.m7268a().m7400k() == null) {
            List<EnumC12246q> f = this.f30312s.m7268a().m7405f();
            EnumC12246q qVar = EnumC12246q.H2_PRIOR_KNOWLEDGE;
            if (f.contains(qVar)) {
                this.f30297d = this.f30296c;
                this.f30299f = qVar;
                m3391F(i);
                return;
            }
            this.f30297d = this.f30296c;
            this.f30299f = EnumC12246q.HTTP_1_1;
            return;
        }
        nVar.m7306C(call);
        m3382i(bVar);
        nVar.m7307B(call, this.f30298e);
        if (this.f30299f == EnumC12246q.HTTP_2) {
            m3391F(i);
        }
    }

    /* renamed from: A */
    public C12248r m3396A() {
        return this.f30312s;
    }

    /* renamed from: C */
    public final void m3394C(long j) {
        this.f30310q = j;
    }

    /* renamed from: D */
    public final void m3393D(boolean z) {
        this.f30303j = z;
    }

    /* renamed from: E */
    public Socket m3392E() {
        Socket socket = this.f30297d;
        C9971q.m14636d(socket);
        return socket;
    }

    /* renamed from: H */
    public final synchronized void m3389H(C13545e call, IOException iOException) {
        C9971q.m14633g(call, "call");
        if (iOException instanceof C14494n) {
            if (((C14494n) iOException).f32875k == EnumC14449b.REFUSED_STREAM) {
                int i = this.f30307n + 1;
                this.f30307n = i;
                if (i > 1) {
                    this.f30303j = true;
                    this.f30305l++;
                }
            } else if (((C14494n) iOException).f32875k != EnumC14449b.CANCEL || !call.mo3420i()) {
                this.f30303j = true;
                this.f30305l++;
            }
        } else if (!m3369v() || (iOException instanceof C14448a)) {
            this.f30303j = true;
            if (this.f30306m == 0) {
                if (iOException != null) {
                    m3384g(call.m3416m(), this.f30312s, iOException);
                }
                this.f30305l++;
            }
        }
    }

    @Override // p450yj.C14457f.AbstractC14461d
    /* renamed from: a */
    public synchronized void mo473a(C14457f connection, C14492m settings) {
        C9971q.m14633g(connection, "connection");
        C9971q.m14633g(settings, "settings");
        this.f30308o = settings.m351d();
    }

    @Override // p450yj.C14457f.AbstractC14461d
    /* renamed from: b */
    public void mo472b(C14481i stream) {
        C9971q.m14633g(stream, "stream");
        stream.m415d(EnumC14449b.REFUSED_STREAM, null);
    }

    /* renamed from: d */
    public final void m3387d() {
        Socket socket = this.f30296c;
        if (socket != null) {
            C12729c.m5607k(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[Catch: IOException -> 0x00fd, TRY_LEAVE, TryCatch #1 {IOException -> 0x00fd, blocks: (B:20:0x009a, B:22:0x00a2), top: B:62:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c A[EDGE_INSN: B:66:0x014c->B:55:0x014c ?: BREAK  ] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3385f(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, p307qj.AbstractC12237n r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p389vj.C13549f.m3385f(int, int, int, int, boolean, okhttp3.Call, qj.n):void");
    }

    /* renamed from: g */
    public final void m3384g(OkHttpClient client, C12248r failedRoute, IOException failure) {
        C9971q.m14633g(client, "client");
        C9971q.m14633g(failedRoute, "failedRoute");
        C9971q.m14633g(failure, "failure");
        if (failedRoute.m7267b().type() != Proxy.Type.DIRECT) {
            C12208a a = failedRoute.m7268a();
            a.m7402i().connectFailed(a.m7399l().m10032r(), failedRoute.m7267b().address(), failure);
        }
        client.m9936w().m3358b(failedRoute);
    }

    /* renamed from: n */
    public final List<Reference<C13545e>> m3377n() {
        return this.f30309p;
    }

    /* renamed from: o */
    public final long m3376o() {
        return this.f30310q;
    }

    /* renamed from: p */
    public final boolean m3375p() {
        return this.f30303j;
    }

    /* renamed from: q */
    public final int m3374q() {
        return this.f30305l;
    }

    /* renamed from: r */
    public C12241o m3373r() {
        return this.f30298e;
    }

    /* renamed from: s */
    public final synchronized void m3372s() {
        this.f30306m++;
    }

    /* renamed from: t */
    public final boolean m3371t(C12208a address, List<C12248r> list) {
        C9971q.m14633g(address, "address");
        if (C12729c.f28589h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        } else if (this.f30309p.size() >= this.f30308o || this.f30303j || !this.f30312s.m7268a().m7407d(address)) {
            return false;
        } else {
            if (C9971q.m14638b(address.m7399l().m10042h(), m3396A().m7268a().m7399l().m10042h())) {
                return true;
            }
            if (this.f30300g == null || list == null || !m3395B(list) || address.m7406e() != C6523d.f13667a || !m3390G(address.m7399l())) {
                return false;
            }
            try {
                C12217e a = address.m7410a();
                C9971q.m14636d(a);
                String h = address.m7399l().m10042h();
                C12241o r = m3373r();
                C9971q.m14636d(r);
                a.m7370a(h, r.m7276d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f30312s.m7268a().m7399l().m10042h());
        sb2.append(':');
        sb2.append(this.f30312s.m7268a().m7399l().m10037m());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.f30312s.m7267b());
        sb2.append(" hostAddress=");
        sb2.append(this.f30312s.m7265d());
        sb2.append(" cipherSuite=");
        C12241o oVar = this.f30298e;
        if (oVar == null || (obj = oVar.m7279a()) == null) {
            obj = ViewProps.NONE;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f30299f);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: u */
    public final boolean m3370u(boolean z) {
        long j;
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f30296c;
            C9971q.m14636d(socket);
            Socket socket2 = this.f30297d;
            C9971q.m14636d(socket2);
            BufferedSource bufferedSource = this.f30301h;
            C9971q.m14636d(bufferedSource);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            C14457f fVar = this.f30300g;
            if (fVar != null) {
                return fVar.m530N0(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.f30310q;
            }
            if (j < 10000000000L || !z) {
                return true;
            }
            return C12729c.m5639D(socket2, bufferedSource);
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

    /* renamed from: v */
    public final boolean m3369v() {
        return this.f30300g != null;
    }

    /* renamed from: w */
    public final AbstractC13895d m3368w(OkHttpClient client, C13898g chain) {
        C9971q.m14633g(client, "client");
        C9971q.m14633g(chain, "chain");
        Socket socket = this.f30297d;
        C9971q.m14636d(socket);
        BufferedSource bufferedSource = this.f30301h;
        C9971q.m14636d(bufferedSource);
        BufferedSink bufferedSink = this.f30302i;
        C9971q.m14636d(bufferedSink);
        C14457f fVar = this.f30300g;
        if (fVar != null) {
            return new C14475g(client, this, chain, fVar);
        }
        socket.setSoTimeout(chain.m2350k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bufferedSource.timeout().mo9679g(chain.m2353h(), timeUnit);
        bufferedSink.timeout().mo9679g(chain.m2351j(), timeUnit);
        return new C14172b(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: x */
    public final C6953d.AbstractC0211d m3367x(C13541c exchange) {
        C9971q.m14633g(exchange, "exchange");
        Socket socket = this.f30297d;
        C9971q.m14636d(socket);
        BufferedSource bufferedSource = this.f30301h;
        C9971q.m14636d(bufferedSource);
        BufferedSink bufferedSink = this.f30302i;
        C9971q.m14636d(bufferedSink);
        socket.setSoTimeout(0);
        m3365z();
        return new C13553d(exchange, bufferedSource, bufferedSink, true, bufferedSource, bufferedSink);
    }

    /* renamed from: y */
    public final synchronized void m3366y() {
        this.f30304k = true;
    }

    /* renamed from: z */
    public final synchronized void m3365z() {
        this.f30303j = true;
    }
}
