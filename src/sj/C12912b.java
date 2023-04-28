package sj;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import p307qj.AbstractC12209b;
import p307qj.AbstractC12235m;
import p307qj.C12208a;
import p307qj.C12222f;
import p307qj.C12234l;
import p307qj.C12248r;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m15073d2 = {"Lsj/b;", "Lqj/b;", "Ljava/net/Proxy;", "Lokhttp3/HttpUrl;", "url", "Lqj/m;", "dns", "Ljava/net/InetAddress;", "b", "Lqj/r;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "a", "d", "Lqj/m;", "defaultDns", "<init>", "(Lqj/m;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: sj.b */
/* loaded from: classes8.dex */
public final class C12912b implements AbstractC12209b {

    /* renamed from: d */
    private final AbstractC12235m f28998d;

    public C12912b(AbstractC12235m defaultDns) {
        C9971q.m14633g(defaultDns, "defaultDns");
        this.f28998d = defaultDns;
    }

    /* renamed from: b */
    private final InetAddress m5080b(Proxy proxy, HttpUrl httpUrl, AbstractC12235m mVar) {
        Object U;
        Proxy.Type type = proxy.type();
        if (type != null && C12911a.f28997a[type.ordinal()] == 1) {
            U = C9914r.m14770U(mVar.mo7309a(httpUrl.m10042h()));
            return (InetAddress) U;
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            C9971q.m14634f(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    @Override // p307qj.AbstractC12209b
    /* renamed from: a */
    public Request mo5081a(C12248r rVar, Response response) {
        boolean z;
        Proxy proxy;
        boolean t;
        AbstractC12235m mVar;
        PasswordAuthentication passwordAuthentication;
        String str;
        C12208a a;
        C9971q.m14633g(response, "response");
        List<C12222f> i = response.m9840i();
        Request b0 = response.m9844b0();
        HttpUrl l = b0.m9877l();
        if (response.m9839l() == 407) {
            z = true;
        } else {
            z = false;
        }
        if (rVar == null || (proxy = rVar.m7267b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C12222f fVar : i) {
            t = C12718u.m5732t("Basic", fVar.m7356c(), true);
            if (t) {
                if (rVar == null || (a = rVar.m7268a()) == null || (mVar = a.m7408c()) == null) {
                    mVar = this.f28998d;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    if (address != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        String hostName = inetSocketAddress.getHostName();
                        C9971q.m14634f(proxy, "proxy");
                        passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m5080b(proxy, l, mVar), inetSocketAddress.getPort(), l.m10033q(), fVar.m7357b(), fVar.m7356c(), l.m10031s(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    String h = l.m10042h();
                    C9971q.m14634f(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(h, m5080b(proxy, l, mVar), l.m10037m(), l.m10033q(), fVar.m7357b(), fVar.m7356c(), l.m10031s(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    if (z) {
                        str = "Proxy-Authorization";
                    } else {
                        str = "Authorization";
                    }
                    String userName = passwordAuthentication.getUserName();
                    C9971q.m14634f(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    C9971q.m14634f(password, "auth.password");
                    return b0.m9880i().m9872e(str, C12234l.m7310a(userName, new String(password), fVar.m7358a())).m9875b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ C12912b(AbstractC12235m mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AbstractC12235m.f27540a : mVar);
    }
}
