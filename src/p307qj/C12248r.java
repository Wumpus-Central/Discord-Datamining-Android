package p307qj;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m15073d2 = {"Lqj/r;", "", "", "c", "other", "equals", "", "hashCode", "", "toString", "Lqj/a;", "a", "Lqj/a;", "()Lqj/a;", "address", "Ljava/net/Proxy;", "b", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "Ljava/net/InetSocketAddress;", "d", "()Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lqj/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.r */
/* loaded from: classes8.dex */
public final class C12248r {

    /* renamed from: a */
    private final C12208a f27562a;

    /* renamed from: b */
    private final Proxy f27563b;

    /* renamed from: c */
    private final InetSocketAddress f27564c;

    public C12248r(C12208a address, Proxy proxy, InetSocketAddress socketAddress) {
        C9971q.m14633g(address, "address");
        C9971q.m14633g(proxy, "proxy");
        C9971q.m14633g(socketAddress, "socketAddress");
        this.f27562a = address;
        this.f27563b = proxy;
        this.f27564c = socketAddress;
    }

    /* renamed from: a */
    public final C12208a m7268a() {
        return this.f27562a;
    }

    /* renamed from: b */
    public final Proxy m7267b() {
        return this.f27563b;
    }

    /* renamed from: c */
    public final boolean m7266c() {
        return this.f27562a.m7400k() != null && this.f27563b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress m7265d() {
        return this.f27564c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12248r) {
            C12248r rVar = (C12248r) obj;
            if (C9971q.m14638b(rVar.f27562a, this.f27562a) && C9971q.m14638b(rVar.f27563b, this.f27563b) && C9971q.m14638b(rVar.f27564c, this.f27564c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f27562a.hashCode()) * 31) + this.f27563b.hashCode()) * 31) + this.f27564c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f27564c + '}';
    }
}
