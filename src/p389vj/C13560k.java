package p389vj;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9911o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.HttpUrl;
import p307qj.AbstractC12237n;
import p307qj.C12208a;
import p307qj.C12248r;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002\u0010\fB'\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, m15073d2 = {"Lvj/k;", "", "Lokhttp3/HttpUrl;", "url", "Ljava/net/Proxy;", "proxy", "", "g", "", "c", "e", "f", "b", "Lvj/k$b;", "d", "", "a", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "", "Lqj/r;", "postponedRoutes", "Lqj/a;", "Lqj/a;", "address", "Lvj/i;", "Lvj/i;", "routeDatabase", "Lokhttp3/Call;", "Lokhttp3/Call;", "call", "Lqj/n;", "h", "Lqj/n;", "eventListener", "<init>", "(Lqj/a;Lvj/i;Lokhttp3/Call;Lqj/n;)V", "i", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.k */
/* loaded from: classes8.dex */
public final class C13560k {

    /* renamed from: i */
    public static final C13561a f30331i = new C13561a(null);

    /* renamed from: a */
    private List<? extends Proxy> f30332a;

    /* renamed from: b */
    private int f30333b;

    /* renamed from: c */
    private List<? extends InetSocketAddress> f30334c;

    /* renamed from: d */
    private final List<C12248r> f30335d = new ArrayList();

    /* renamed from: e */
    private final C12208a f30336e;

    /* renamed from: f */
    private final C13558i f30337f;

    /* renamed from: g */
    private final Call f30338g;

    /* renamed from: h */
    private final AbstractC12237n f30339h;

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m15073d2 = {"Lvj/k$a;", "", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.k$a */
    /* loaded from: classes8.dex */
    public static final class C13561a {
        private C13561a() {
        }

        public /* synthetic */ C13561a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m3346a(InetSocketAddress socketHost) {
            C9971q.m14633g(socketHost, "$this$socketHost");
            InetAddress address = socketHost.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                C9971q.m14634f(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = socketHost.getHostName();
            C9971q.m14634f(hostName, "hostName");
            return hostName;
        }
    }

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lvj/k$b;", "", "", "b", "Lqj/r;", "c", "", "a", "I", "nextRouteIndex", "", "Ljava/util/List;", "()Ljava/util/List;", "routes", "<init>", "(Ljava/util/List;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.k$b */
    /* loaded from: classes8.dex */
    public static final class C13562b {

        /* renamed from: a */
        private int f30340a;

        /* renamed from: b */
        private final List<C12248r> f30341b;

        public C13562b(List<C12248r> routes) {
            C9971q.m14633g(routes, "routes");
            this.f30341b = routes;
        }

        /* renamed from: a */
        public final List<C12248r> m3345a() {
            return this.f30341b;
        }

        /* renamed from: b */
        public final boolean m3344b() {
            return this.f30340a < this.f30341b.size();
        }

        /* renamed from: c */
        public final C12248r m3343c() {
            if (m3344b()) {
                List<C12248r> list = this.f30341b;
                int i = this.f30340a;
                this.f30340a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"selectProxies", "", "Ljava/net/Proxy;", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
    /* renamed from: vj.k$c */
    /* loaded from: classes8.dex */
    public static final class C13563c extends AbstractC9973s implements Function0<List<? extends Proxy>> {

        /* renamed from: l */
        final /* synthetic */ Proxy f30343l;

        /* renamed from: m */
        final /* synthetic */ HttpUrl f30344m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13563c(Proxy proxy, HttpUrl httpUrl) {
            super(0);
            this.f30343l = proxy;
            this.f30344m = httpUrl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Proxy> invoke() {
            List<? extends Proxy> d;
            Proxy proxy = this.f30343l;
            if (proxy != null) {
                d = C9905i.m14825d(proxy);
                return d;
            }
            URI r = this.f30344m.m10032r();
            if (r.getHost() == null) {
                return C12729c.m5598t(Proxy.NO_PROXY);
            }
            List<Proxy> select = C13560k.this.f30336e.m7402i().select(r);
            return select == null || select.isEmpty() ? C12729c.m5598t(Proxy.NO_PROXY) : C12729c.m5625R(select);
        }
    }

    public C13560k(C12208a address, C13558i routeDatabase, Call call, AbstractC12237n eventListener) {
        List<? extends Proxy> i;
        List<? extends InetSocketAddress> i2;
        C9971q.m14633g(address, "address");
        C9971q.m14633g(routeDatabase, "routeDatabase");
        C9971q.m14633g(call, "call");
        C9971q.m14633g(eventListener, "eventListener");
        this.f30336e = address;
        this.f30337f = routeDatabase;
        this.f30338g = call;
        this.f30339h = eventListener;
        i = C9906j.m14820i();
        this.f30332a = i;
        i2 = C9906j.m14820i();
        this.f30334c = i2;
        m3347g(address.m7399l(), address.m7404g());
    }

    /* renamed from: c */
    private final boolean m3351c() {
        return this.f30333b < this.f30332a.size();
    }

    /* renamed from: e */
    private final Proxy m3349e() {
        if (m3351c()) {
            List<? extends Proxy> list = this.f30332a;
            int i = this.f30333b;
            this.f30333b = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m3348f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f30336e.m7399l().m10042h() + "; exhausted proxy configurations: " + this.f30332a);
    }

    /* renamed from: f */
    private final void m3348f(Proxy proxy) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        this.f30334c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f30336e.m7399l().m10042h();
            i = this.f30336e.m7399l().m10037m();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f30331i.m3346a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i || 65535 < i) {
            throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f30339h.m7292n(this.f30338g, str);
            List<InetAddress> a = this.f30336e.m7408c().mo7309a(str);
            if (!a.isEmpty()) {
                this.f30339h.m7293m(this.f30338g, str, a);
                for (InetAddress inetAddress : a) {
                    arrayList.add(new InetSocketAddress(inetAddress, i));
                }
                return;
            }
            throw new UnknownHostException(this.f30336e.m7408c() + " returned no addresses for " + str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private final void m3347g(HttpUrl httpUrl, Proxy proxy) {
        C13563c cVar = new C13563c(proxy, httpUrl);
        this.f30339h.m7290p(this.f30338g, httpUrl);
        List<? extends Proxy> invoke = cVar.invoke();
        this.f30332a = invoke;
        this.f30333b = 0;
        this.f30339h.m7291o(this.f30338g, httpUrl, invoke);
    }

    /* renamed from: b */
    public final boolean m3352b() {
        return m3351c() || (this.f30335d.isEmpty() ^ true);
    }

    /* renamed from: d */
    public final C13562b m3350d() {
        if (m3352b()) {
            ArrayList arrayList = new ArrayList();
            while (m3351c()) {
                Proxy e = m3349e();
                for (InetSocketAddress inetSocketAddress : this.f30334c) {
                    C12248r rVar = new C12248r(this.f30336e, e, inetSocketAddress);
                    if (this.f30337f.m3357c(rVar)) {
                        this.f30335d.add(rVar);
                    } else {
                        arrayList.add(rVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                C9911o.m14801y(arrayList, this.f30335d);
                this.f30335d.clear();
            }
            return new C13562b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
