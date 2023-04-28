package p015ak;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import dk.AbstractC6521c;
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
import p031bk.C3726c;
import p031bk.C3728d;
import p031bk.C3733h;
import p031bk.C3735i;
import p031bk.C3740k;
import p031bk.C3743l;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m15073d2 = {"Lak/b;", "Lak/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lqj/q;", "protocols", "", "e", "h", "", "j", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ldk/c;", "c", "Lbk/m;", "d", "Ljava/util/List;", "socketAdapters", "<init>", "()V", "f", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ak.b */
/* loaded from: classes8.dex */
public final class C1438b extends C1457k {

    /* renamed from: e */
    private static final boolean f485e;

    /* renamed from: f */
    public static final C1439a f486f = new C1439a(null);

    /* renamed from: d */
    private final List<AbstractC3745m> f487d;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lak/b$a;", "", "Lak/k;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.b$a */
    /* loaded from: classes8.dex */
    public static final class C1439a {
        private C1439a() {
        }

        public /* synthetic */ C1439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1457k m41124a() {
            if (m41123b()) {
                return new C1438b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m41123b() {
            return C1438b.f485e;
        }
    }

    static {
        boolean z;
        if (!C1457k.f517c.m41078h() || Build.VERSION.SDK_INT < 29) {
            z = false;
        } else {
            z = true;
        }
        f485e = z;
    }

    public C1438b() {
        List n;
        n = C9906j.m14815n(C3726c.f6063a.m33730a(), new C3743l(C3733h.f6072g.m33717d()), new C3743l(C3740k.f6086b.m33710a()), new C3743l(C3735i.f6080b.m33715a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : n) {
            if (((AbstractC3745m) obj).mo33706a()) {
                arrayList.add(obj);
            }
        }
        this.f487d = arrayList;
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
    /* renamed from: e */
    public void mo41097e(SSLSocket sslSocket, String str, List<? extends EnumC12246q> protocols) {
        Object obj;
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        Iterator<T> it = this.f487d.iterator();
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
    /* renamed from: h */
    public String mo41094h(SSLSocket sslSocket) {
        Object obj;
        C9971q.m14633g(sslSocket, "sslSocket");
        Iterator<T> it = this.f487d.iterator();
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
    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public boolean mo41092j(String hostname) {
        boolean isCleartextTrafficPermitted;
        C9971q.m14633g(hostname, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        return isCleartextTrafficPermitted;
    }
}
