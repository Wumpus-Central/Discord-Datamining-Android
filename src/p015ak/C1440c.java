package p015ak;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import dk.AbstractC6521c;
import dk.AbstractC6524e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031bk.AbstractC3745m;
import p031bk.C3728d;
import p031bk.C3733h;
import p031bk.C3735i;
import p031bk.C3738j;
import p031bk.C3740k;
import p031bk.C3743l;
import p031bk.C3746n;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b'\u0010(J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006,"}, m15073d2 = {"Lak/c;", "Lak/k;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "", "f", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lqj/q;", "protocols", "e", "h", "closer", "", "i", "message", "stackTrace", "m", "", "j", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ldk/c;", "c", "Ldk/e;", "d", "Lbk/m;", "Ljava/util/List;", "socketAdapters", "Lbk/j;", "Lbk/j;", "closeGuard", "<init>", "()V", "g", "a", "b", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ak.c */
/* loaded from: classes8.dex */
public final class C1440c extends C1457k {

    /* renamed from: f */
    private static final boolean f488f;

    /* renamed from: g */
    public static final C1441a f489g = new C1441a(null);

    /* renamed from: d */
    private final List<AbstractC3745m> f490d;

    /* renamed from: e */
    private final C3738j f491e;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lak/c$a;", "", "Lak/k;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.c$a */
    /* loaded from: classes8.dex */
    public static final class C1441a {
        private C1441a() {
        }

        public /* synthetic */ C1441a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1457k m41121a() {
            if (m41120b()) {
                return new C1440c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m41120b() {
            return C1440c.f488f;
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lak/c$b;", "Ldk/e;", "Ljava/security/cert/X509Certificate;", "cert", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.c$b */
    /* loaded from: classes8.dex */
    public static final class C1442b implements AbstractC6524e {

        /* renamed from: a */
        private final X509TrustManager f492a;

        /* renamed from: b */
        private final Method f493b;

        public C1442b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            C9971q.m14633g(trustManager, "trustManager");
            C9971q.m14633g(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f492a = trustManager;
            this.f493b = findByIssuerAndSignatureMethod;
        }

        @Override // dk.AbstractC6524e
        /* renamed from: a */
        public X509Certificate mo25366a(X509Certificate cert) {
            C9971q.m14633g(cert, "cert");
            try {
                Object invoke = this.f493b.invoke(this.f492a, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1442b)) {
                return false;
            }
            C1442b bVar = (C1442b) obj;
            return C9971q.m14638b(this.f492a, bVar.f492a) && C9971q.m14638b(this.f493b, bVar.f493b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f492a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f493b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f492a + ", findByIssuerAndSignatureMethod=" + this.f493b + ")";
        }
    }

    static {
        boolean z = false;
        if (C1457k.f517c.m41078h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f488f = z;
    }

    public C1440c() {
        List n;
        n = C9906j.m14815n(C3746n.C3747a.m33701b(C3746n.f6089j, null, 1, null), new C3743l(C3733h.f6072g.m33717d()), new C3743l(C3740k.f6086b.m33710a()), new C3743l(C3735i.f6080b.m33715a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : n) {
            if (((AbstractC3745m) obj).mo33706a()) {
                arrayList.add(obj);
            }
        }
        this.f490d = arrayList;
        this.f491e = C3738j.f6081d.m33712a();
    }

    @Override // p015ak.C1457k
    /* renamed from: c */
    public AbstractC6521c mo41099c(X509TrustManager trustManager) {
        C9971q.m14633g(trustManager, "trustManager");
        C3728d a = C3728d.f6064d.m33728a(trustManager);
        if (a != null) {
            return a;
        }
        return super.mo41099c(trustManager);
    }

    @Override // p015ak.C1457k
    /* renamed from: d */
    public AbstractC6524e mo41098d(X509TrustManager trustManager) {
        C9971q.m14633g(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            C9971q.m14634f(method, "method");
            method.setAccessible(true);
            return new C1442b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo41098d(trustManager);
        }
    }

    @Override // p015ak.C1457k
    /* renamed from: e */
    public void mo41097e(SSLSocket sslSocket, String str, List<EnumC12246q> protocols) {
        Object obj;
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        Iterator<T> it = this.f490d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC3745m) obj).mo33705b(sslSocket)) {
                break;
            }
        }
        AbstractC3745m mVar = (AbstractC3745m) obj;
        if (mVar != null) {
            mVar.mo33703d(sslSocket, str, protocols);
        }
    }

    @Override // p015ak.C1457k
    /* renamed from: f */
    public void mo41096f(Socket socket, InetSocketAddress address, int i) {
        C9971q.m14633g(socket, "socket");
        C9971q.m14633g(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @Override // p015ak.C1457k
    /* renamed from: h */
    public String mo41094h(SSLSocket sslSocket) {
        Object obj;
        C9971q.m14633g(sslSocket, "sslSocket");
        Iterator<T> it = this.f490d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC3745m) obj).mo33705b(sslSocket)) {
                break;
            }
        }
        AbstractC3745m mVar = (AbstractC3745m) obj;
        if (mVar != null) {
            return mVar.mo33704c(sslSocket);
        }
        return null;
    }

    @Override // p015ak.C1457k
    /* renamed from: i */
    public Object mo41093i(String closer) {
        C9971q.m14633g(closer, "closer");
        return this.f491e.m33714a(closer);
    }

    @Override // p015ak.C1457k
    /* renamed from: j */
    public boolean mo41092j(String hostname) {
        boolean isCleartextTrafficPermitted;
        C9971q.m14633g(hostname, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
            return isCleartextTrafficPermitted;
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        C9971q.m14634f(instance, "NetworkSecurityPolicy.getInstance()");
        return instance.isCleartextTrafficPermitted();
    }

    @Override // p015ak.C1457k
    /* renamed from: m */
    public void mo41089m(String message, Object obj) {
        C9971q.m14633g(message, "message");
        if (!this.f491e.m33713b(obj)) {
            C1457k.m41090l(this, message, 5, null, 4, null);
        }
    }
}
