package p307qj;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(m15074d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 92\u00020\u0001:\u00029:B\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020/H\u0016¨\u0006?"}, m15073d2 = {"Lqj/n;", "", "Lokhttp3/Call;", "call", "", "f", "Lokhttp3/HttpUrl;", "url", "p", "", "Ljava/net/Proxy;", "proxies", "o", "", "domainName", "n", "Ljava/net/InetAddress;", "inetAddressList", "m", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "C", "Lqj/o;", "handshake", "B", "Lqj/q;", "protocol", "h", "Ljava/io/IOException;", "ioe", "i", "Lqj/h;", "connection", "k", "l", "u", "Lokhttp3/Request;", "request", "t", "r", "", "byteCount", "q", "s", "z", "Lokhttp3/Response;", "response", "y", "w", "v", "x", "d", "e", "g", "A", "b", "c", "cachedResponse", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.n */
/* loaded from: classes8.dex */
public abstract class AbstractC12237n {

    /* renamed from: b */
    public static final C12239b f27543b = new C12239b(null);

    /* renamed from: a */
    public static final AbstractC12237n f27542a = new C12238a();

    @Metadata(m15074d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m15073d2 = {"qj/n$a", "Lqj/n;", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.n$a */
    /* loaded from: classes8.dex */
    public static final class C12238a extends AbstractC12237n {
        C12238a() {
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lqj/n$b;", "", "Lqj/n;", "NONE", "Lqj/n;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.n$b */
    /* loaded from: classes8.dex */
    public static final class C12239b {
        private C12239b() {
        }

        public /* synthetic */ C12239b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m15073d2 = {"Lqj/n$c;", "", "Lokhttp3/Call;", "call", "Lqj/n;", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.n$c */
    /* loaded from: classes8.dex */
    public interface AbstractC12240c {
        /* renamed from: a */
        AbstractC12237n mo5591a(Call call);
    }

    /* renamed from: A */
    public void m7308A(Call call, Response response) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(response, "response");
    }

    /* renamed from: B */
    public void m7307B(Call call, C12241o oVar) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: C */
    public void m7306C(Call call) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: a */
    public void m7305a(Call call, Response cachedResponse) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(cachedResponse, "cachedResponse");
    }

    /* renamed from: b */
    public void m7304b(Call call, Response response) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(response, "response");
    }

    /* renamed from: c */
    public void m7303c(Call call) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: d */
    public void m7302d(Call call) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: e */
    public void m7301e(Call call, IOException ioe) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(ioe, "ioe");
    }

    /* renamed from: f */
    public void m7300f(Call call) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: g */
    public void m7299g(Call call) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: h */
    public void m7298h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC12246q qVar) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(inetSocketAddress, "inetSocketAddress");
        C9971q.m14633g(proxy, "proxy");
    }

    /* renamed from: i */
    public void m7297i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC12246q qVar, IOException ioe) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(inetSocketAddress, "inetSocketAddress");
        C9971q.m14633g(proxy, "proxy");
        C9971q.m14633g(ioe, "ioe");
    }

    /* renamed from: j */
    public void m7296j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(inetSocketAddress, "inetSocketAddress");
        C9971q.m14633g(proxy, "proxy");
    }

    /* renamed from: k */
    public void m7295k(Call call, AbstractC12226h connection) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(connection, "connection");
    }

    /* renamed from: l */
    public void m7294l(Call call, AbstractC12226h connection) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(connection, "connection");
    }

    /* renamed from: m */
    public void m7293m(Call call, String domainName, List<InetAddress> inetAddressList) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(domainName, "domainName");
        C9971q.m14633g(inetAddressList, "inetAddressList");
    }

    /* renamed from: n */
    public void m7292n(Call call, String domainName) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(domainName, "domainName");
    }

    /* renamed from: o */
    public void m7291o(Call call, HttpUrl url, List<Proxy> proxies) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(url, "url");
        C9971q.m14633g(proxies, "proxies");
    }

    /* renamed from: p */
    public void m7290p(Call call, HttpUrl url) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(url, "url");
    }

    /* renamed from: q */
    public void m7289q(Call call, long j) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: r */
    public void m7288r(Call call) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: s */
    public void m7287s(Call call, IOException ioe) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(ioe, "ioe");
    }

    /* renamed from: t */
    public void m7286t(Call call, Request request) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(request, "request");
    }

    /* renamed from: u */
    public void m7285u(Call call) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: v */
    public void m7284v(Call call, long j) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: w */
    public void m7283w(Call call) {
        C9971q.m14633g(call, "call");
    }

    /* renamed from: x */
    public void m7282x(Call call, IOException ioe) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(ioe, "ioe");
    }

    /* renamed from: y */
    public void m7281y(Call call, Response response) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(response, "response");
    }

    /* renamed from: z */
    public void m7280z(Call call) {
        C9971q.m14633g(call, "call");
    }
}
