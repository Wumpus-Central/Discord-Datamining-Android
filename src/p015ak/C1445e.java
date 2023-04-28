package p015ak;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m15073d2 = {"Lak/e;", "Lak/k;", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lqj/q;", "protocols", "", "e", "h", "trustManager", "Ljavax/net/ssl/SSLSocketFactory;", "o", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "<init>", "()V", "f", "a", "b", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ak.e */
/* loaded from: classes8.dex */
public final class C1445e extends C1457k {

    /* renamed from: e */
    private static final boolean f497e;

    /* renamed from: f */
    public static final C1446a f498f;

    /* renamed from: d */
    private final Provider f499d;

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m15073d2 = {"Lak/e$a;", "", "Lak/e;", "b", "", "major", "minor", "patch", "", "a", "isSupported", "Z", "c", "()Z", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.e$a */
    /* loaded from: classes8.dex */
    public static final class C1446a {
        private C1446a() {
        }

        public /* synthetic */ C1446a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m41115a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i) {
                if (version.major() > i) {
                    return true;
                }
                return false;
            } else if (version.minor() != i2) {
                if (version.minor() > i2) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i3) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public final C1445e m41114b() {
            if (m41113c()) {
                return new C1445e(null);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m41113c() {
            return C1445e.f497e;
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lak/e$b;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.e$b */
    /* loaded from: classes8.dex */
    public static final class C1447b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C1447b f500a = new C1447b();

        private C1447b() {
        }
    }

    static {
        C1446a aVar = new C1446a(null);
        f498f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.m41115a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f497e = z;
    }

    private C1445e() {
        Provider newProvider = Conscrypt.newProvider();
        C9971q.m14634f(newProvider, "Conscrypt.newProvider()");
        this.f499d = newProvider;
    }

    @Override // p015ak.C1457k
    /* renamed from: e */
    public void mo41097e(SSLSocket sslSocket, String str, List<EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        if (Conscrypt.isConscrypt(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = C1457k.f517c.m41084b(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.mo41097e(sslSocket, str, protocols);
    }

    @Override // p015ak.C1457k
    /* renamed from: h */
    public String mo41094h(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return super.mo41094h(sslSocket);
    }

    @Override // p015ak.C1457k
    /* renamed from: n */
    public SSLContext mo41088n() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f499d);
        C9971q.m14634f(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    @Override // p015ak.C1457k
    /* renamed from: o */
    public SSLSocketFactory mo41087o(X509TrustManager trustManager) {
        C9971q.m14633g(trustManager, "trustManager");
        SSLContext n = mo41088n();
        n.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = n.getSocketFactory();
        C9971q.m14634f(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p015ak.C1457k
    /* renamed from: p */
    public X509TrustManager mo41086p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        C9971q.m14634f(instance, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = instance.getTrustManagers();
        C9971q.m14636d(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C1447b.f500a);
                return x509TrustManager;
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

    public /* synthetic */ C1445e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
