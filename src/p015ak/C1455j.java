package p015ak;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m15073d2 = {"Lak/j;", "Lak/k;", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lqj/q;", "protocols", "", "e", "h", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "<init>", "()V", "f", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ak.j */
/* loaded from: classes8.dex */
public final class C1455j extends C1457k {

    /* renamed from: e */
    private static final boolean f512e;

    /* renamed from: f */
    public static final C1456a f513f;

    /* renamed from: d */
    private final Provider f514d;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lak/j$a;", "", "Lak/j;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.j$a */
    /* loaded from: classes8.dex */
    public static final class C1456a {
        private C1456a() {
        }

        public /* synthetic */ C1456a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1455j m41103a() {
            if (m41102b()) {
                return new C1455j(null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m41102b() {
            return C1455j.f512e;
        }
    }

    static {
        C1456a aVar = new C1456a(null);
        f513f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f512e = z;
    }

    private C1455j() {
        this.f514d = new OpenJSSE();
    }

    @Override // p015ak.C1457k
    /* renamed from: e */
    public void mo41097e(SSLSocket sslSocket, String str, List<EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket = (org.openjsse.javax.net.ssl.SSLSocket) sslSocket;
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = C1457k.f517c.m41084b(protocols).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.mo41097e(sslSocket, str, protocols);
    }

    @Override // p015ak.C1457k
    /* renamed from: h */
    public String mo41094h(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.mo41094h(sslSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // p015ak.C1457k
    /* renamed from: n */
    public SSLContext mo41088n() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f514d);
        C9971q.m14634f(instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    @Override // p015ak.C1457k
    /* renamed from: p */
    public X509TrustManager mo41086p() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f514d);
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

    public /* synthetic */ C1455j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
