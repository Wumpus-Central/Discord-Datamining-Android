package p015ak;

import dk.AbstractC6521c;
import dk.AbstractC6524e;
import dk.C6519a;
import dk.C6520b;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import okio.Buffer;
import p031bk.C3730e;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u0002H\u0016J\u001a\u0010#\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016¨\u0006/"}, m15073d2 = {"Lak/k;", "", "", "g", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lqj/q;", "protocols", "", "e", "b", "h", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "f", "message", "level", "", "t", "k", "", "j", "closer", "i", "stackTrace", "m", "trustManager", "Ldk/c;", "c", "Ldk/e;", "d", "Ljavax/net/ssl/SSLSocketFactory;", "o", "toString", "<init>", "()V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ak.k */
/* loaded from: classes8.dex */
public class C1457k {

    /* renamed from: a */
    private static volatile C1457k f515a;

    /* renamed from: b */
    private static final Logger f516b = Logger.getLogger(OkHttpClient.class.getName());

    /* renamed from: c */
    public static final C1458a f517c;

    @Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, m15073d2 = {"Lak/k$a;", "", "Lak/k;", "f", "d", "e", "g", "", "Lqj/q;", "protocols", "", "b", "", "c", "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "platform", "Lak/k;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.k$a */
    /* loaded from: classes8.dex */
    public static final class C1458a {
        private C1458a() {
        }

        public /* synthetic */ C1458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final C1457k m41082d() {
            C3730e.f6069c.m33726b();
            C1457k a = C1438b.f486f.m41124a();
            if (a != null) {
                return a;
            }
            C1457k a2 = C1440c.f489g.m41121a();
            C9971q.m14636d(a2);
            return a2;
        }

        /* renamed from: e */
        private final C1457k m41081e() {
            C1455j a;
            C1443d a2;
            C1445e b;
            if (m41076j() && (b = C1445e.f498f.m41114b()) != null) {
                return b;
            }
            if (m41077i() && (a2 = C1443d.f495f.m41118a()) != null) {
                return a2;
            }
            if (m41075k() && (a = C1455j.f513f.m41103a()) != null) {
                return a;
            }
            C1453i a3 = C1453i.f511e.m41106a();
            if (a3 != null) {
                return a3;
            }
            C1457k a4 = C1448f.f501i.m41110a();
            if (a4 != null) {
                return a4;
            }
            return new C1457k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final C1457k m41080f() {
            if (m41078h()) {
                return m41082d();
            }
            return m41081e();
        }

        /* renamed from: i */
        private final boolean m41077i() {
            Provider provider = Security.getProviders()[0];
            C9971q.m14634f(provider, "Security.getProviders()[0]");
            return C9971q.m14638b("BC", provider.getName());
        }

        /* renamed from: j */
        private final boolean m41076j() {
            Provider provider = Security.getProviders()[0];
            C9971q.m14634f(provider, "Security.getProviders()[0]");
            return C9971q.m14638b("Conscrypt", provider.getName());
        }

        /* renamed from: k */
        private final boolean m41075k() {
            Provider provider = Security.getProviders()[0];
            C9971q.m14634f(provider, "Security.getProviders()[0]");
            return C9971q.m14638b("OpenJSSE", provider.getName());
        }

        /* renamed from: b */
        public final List<String> m41084b(List<? extends EnumC12246q> protocols) {
            int t;
            boolean z;
            C9971q.m14633g(protocols, "protocols");
            ArrayList<EnumC12246q> arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((EnumC12246q) obj) != EnumC12246q.HTTP_1_0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            t = C9907k.m14809t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t);
            for (EnumC12246q qVar : arrayList) {
                arrayList2.add(qVar.toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m41083c(List<? extends EnumC12246q> protocols) {
            C9971q.m14633g(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m41084b(protocols)) {
                buffer.writeByte(str.length());
                buffer.mo9750J(str);
            }
            return buffer.mo9732g0();
        }

        /* renamed from: g */
        public final C1457k m41079g() {
            return C1457k.f515a;
        }

        /* renamed from: h */
        public final boolean m41078h() {
            return C9971q.m14638b("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        C1458a aVar = new C1458a(null);
        f517c = aVar;
        f515a = aVar.m41080f();
    }

    /* renamed from: l */
    public static /* synthetic */ void m41090l(C1457k kVar, String str, int i, Throwable th2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th2 = null;
            }
            kVar.m41091k(str, i, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    /* renamed from: b */
    public void mo41100b(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
    }

    /* renamed from: c */
    public AbstractC6521c mo41099c(X509TrustManager trustManager) {
        C9971q.m14633g(trustManager, "trustManager");
        return new C6519a(mo41098d(trustManager));
    }

    /* renamed from: d */
    public AbstractC6524e mo41098d(X509TrustManager trustManager) {
        C9971q.m14633g(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        C9971q.m14634f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C6520b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo41097e(SSLSocket sslSocket, String str, List<EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
    }

    /* renamed from: f */
    public void mo41096f(Socket socket, InetSocketAddress address, int i) {
        C9971q.m14633g(socket, "socket");
        C9971q.m14633g(address, "address");
        socket.connect(address, i);
    }

    /* renamed from: g */
    public final String m41095g() {
        return "OkHttp";
    }

    /* renamed from: h */
    public String mo41094h(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        return null;
    }

    /* renamed from: i */
    public Object mo41093i(String closer) {
        C9971q.m14633g(closer, "closer");
        if (f516b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo41092j(String hostname) {
        C9971q.m14633g(hostname, "hostname");
        return true;
    }

    /* renamed from: k */
    public void m41091k(String message, int i, Throwable th2) {
        Level level;
        C9971q.m14633g(message, "message");
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f516b.log(level, message, th2);
    }

    /* renamed from: m */
    public void mo41089m(String message, Object obj) {
        C9971q.m14633g(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m41091k(message, 5, (Throwable) obj);
    }

    /* renamed from: n */
    public SSLContext mo41088n() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C9971q.m14634f(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: o */
    public SSLSocketFactory mo41087o(X509TrustManager trustManager) {
        C9971q.m14633g(trustManager, "trustManager");
        try {
            SSLContext n = mo41088n();
            n.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = n.getSocketFactory();
            C9971q.m14634f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: p */
    public X509TrustManager mo41086p() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init((KeyStore) null);
        C9971q.m14634f(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        C9971q.m14636d(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C9971q.m14634f(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C9971q.m14634f(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
