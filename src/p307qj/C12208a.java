package p307qj;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.HttpUrl;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020 \u0012\b\u0010*\u001a\u0004\u0018\u00010&\u0012\b\u0010/\u001a\u0004\u0018\u00010+\u0012\b\u00104\u001a\u0004\u0018\u000100\u0012\u0006\u00109\u001a\u000205\u0012\b\u0010=\u001a\u0004\u0018\u00010:\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012\u0012\u0006\u0010A\u001a\u00020>¢\u0006\u0004\bD\u0010EJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8G¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00128G¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010&8\u0007¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010/\u001a\u0004\u0018\u00010+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u0019\u00104\u001a\u0004\u0018\u0001008\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\r\u00103R\u0017\u00109\u001a\u0002058\u0007¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b1\u00108R\u0019\u0010=\u001a\u0004\u0018\u00010:8\u0007¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b,\u0010<R\u0017\u0010A\u001a\u00020>8\u0007¢\u0006\f\n\u0004\b(\u0010?\u001a\u0004\b6\u0010@¨\u0006F"}, m15073d2 = {"Lqj/a;", "", "other", "", "equals", "", "hashCode", "that", "d", "(Lqj/a;)Z", "", "toString", "Lokhttp3/HttpUrl;", "a", "Lokhttp3/HttpUrl;", "l", "()Lokhttp3/HttpUrl;", "url", "", "Lqj/q;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "protocols", "Lqj/j;", "c", "connectionSpecs", "Lqj/m;", "Lqj/m;", "()Lqj/m;", "dns", "Ljavax/net/SocketFactory;", "e", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "g", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lqj/e;", "h", "Lqj/e;", "()Lqj/e;", "certificatePinner", "Lqj/b;", "i", "Lqj/b;", "()Lqj/b;", "proxyAuthenticator", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "proxySelector", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILqj/m;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lqj/e;Lqj/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.a */
/* loaded from: classes8.dex */
public final class C12208a {

    /* renamed from: a */
    private final HttpUrl f27370a;

    /* renamed from: b */
    private final List<EnumC12246q> f27371b;

    /* renamed from: c */
    private final List<C12228j> f27372c;

    /* renamed from: d */
    private final AbstractC12235m f27373d;

    /* renamed from: e */
    private final SocketFactory f27374e;

    /* renamed from: f */
    private final SSLSocketFactory f27375f;

    /* renamed from: g */
    private final HostnameVerifier f27376g;

    /* renamed from: h */
    private final C12217e f27377h;

    /* renamed from: i */
    private final AbstractC12209b f27378i;

    /* renamed from: j */
    private final Proxy f27379j;

    /* renamed from: k */
    private final ProxySelector f27380k;

    public C12208a(String uriHost, int i, AbstractC12235m dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C12217e eVar, AbstractC12209b proxyAuthenticator, Proxy proxy, List<? extends EnumC12246q> protocols, List<C12228j> connectionSpecs, ProxySelector proxySelector) {
        String str;
        C9971q.m14633g(uriHost, "uriHost");
        C9971q.m14633g(dns, "dns");
        C9971q.m14633g(socketFactory, "socketFactory");
        C9971q.m14633g(proxyAuthenticator, "proxyAuthenticator");
        C9971q.m14633g(protocols, "protocols");
        C9971q.m14633g(connectionSpecs, "connectionSpecs");
        C9971q.m14633g(proxySelector, "proxySelector");
        this.f27373d = dns;
        this.f27374e = socketFactory;
        this.f27375f = sSLSocketFactory;
        this.f27376g = hostnameVerifier;
        this.f27377h = eVar;
        this.f27378i = proxyAuthenticator;
        this.f27379j = proxy;
        this.f27380k = proxySelector;
        HttpUrl.C11420a aVar = new HttpUrl.C11420a();
        if (sSLSocketFactory != null) {
            str = "https";
        } else {
            str = "http";
        }
        this.f27370a = aVar.m10016o(str).m10026e(uriHost).m10020k(i).m10030a();
        this.f27371b = C12729c.m5625R(protocols);
        this.f27372c = C12729c.m5625R(connectionSpecs);
    }

    /* renamed from: a */
    public final C12217e m7410a() {
        return this.f27377h;
    }

    /* renamed from: b */
    public final List<C12228j> m7409b() {
        return this.f27372c;
    }

    /* renamed from: c */
    public final AbstractC12235m m7408c() {
        return this.f27373d;
    }

    /* renamed from: d */
    public final boolean m7407d(C12208a that) {
        C9971q.m14633g(that, "that");
        if (!C9971q.m14638b(this.f27373d, that.f27373d) || !C9971q.m14638b(this.f27378i, that.f27378i) || !C9971q.m14638b(this.f27371b, that.f27371b) || !C9971q.m14638b(this.f27372c, that.f27372c) || !C9971q.m14638b(this.f27380k, that.f27380k) || !C9971q.m14638b(this.f27379j, that.f27379j) || !C9971q.m14638b(this.f27375f, that.f27375f) || !C9971q.m14638b(this.f27376g, that.f27376g) || !C9971q.m14638b(this.f27377h, that.f27377h) || this.f27370a.m10037m() != that.f27370a.m10037m()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final HostnameVerifier m7406e() {
        return this.f27376g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12208a) {
            C12208a aVar = (C12208a) obj;
            if (C9971q.m14638b(this.f27370a, aVar.f27370a) && m7407d(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final List<EnumC12246q> m7405f() {
        return this.f27371b;
    }

    /* renamed from: g */
    public final Proxy m7404g() {
        return this.f27379j;
    }

    /* renamed from: h */
    public final AbstractC12209b m7403h() {
        return this.f27378i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f27370a.hashCode()) * 31) + this.f27373d.hashCode()) * 31) + this.f27378i.hashCode()) * 31) + this.f27371b.hashCode()) * 31) + this.f27372c.hashCode()) * 31) + this.f27380k.hashCode()) * 31) + Objects.hashCode(this.f27379j)) * 31) + Objects.hashCode(this.f27375f)) * 31) + Objects.hashCode(this.f27376g)) * 31) + Objects.hashCode(this.f27377h);
    }

    /* renamed from: i */
    public final ProxySelector m7402i() {
        return this.f27380k;
    }

    /* renamed from: j */
    public final SocketFactory m7401j() {
        return this.f27374e;
    }

    /* renamed from: k */
    public final SSLSocketFactory m7400k() {
        return this.f27375f;
    }

    /* renamed from: l */
    public final HttpUrl m7399l() {
        return this.f27370a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f27370a.m10042h());
        sb3.append(':');
        sb3.append(this.f27370a.m10037m());
        sb3.append(", ");
        if (this.f27379j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f27379j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f27380k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
