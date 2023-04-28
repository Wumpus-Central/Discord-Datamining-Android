package p389vj;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p307qj.AbstractC12237n;
import p307qj.C12208a;
import p307qj.C12248r;
import p327rj.C12729c;
import p389vj.C13560k;
import p409wj.AbstractC13895d;
import p409wj.C13898g;
import p450yj.C14448a;
import p450yj.C14494n;
import p450yj.EnumC14449b;

@Metadata(m15074d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\b8\u00109J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J0\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010/\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b$\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m15073d2 = {"Lvj/d;", "", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lvj/f;", "c", "b", "Lqj/r;", "f", "Lokhttp3/OkHttpClient;", "client", "Lwj/g;", "chain", "Lwj/d;", "a", "Ljava/io/IOException;", "e", "", "h", "Lokhttp3/HttpUrl;", "url", "g", "Lvj/k$b;", "Lvj/k$b;", "routeSelection", "Lvj/k;", "Lvj/k;", "routeSelector", "I", "refusedStreamCount", "d", "connectionShutdownCount", "otherFailureCount", "Lqj/r;", "nextRouteToTry", "Lvj/h;", "Lvj/h;", "connectionPool", "Lqj/a;", "Lqj/a;", "()Lqj/a;", "address", "Lvj/e;", "i", "Lvj/e;", "call", "Lqj/n;", "j", "Lqj/n;", "eventListener", "<init>", "(Lvj/h;Lqj/a;Lvj/e;Lqj/n;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.d */
/* loaded from: classes8.dex */
public final class C13544d {

    /* renamed from: a */
    private C13560k.C13562b f30264a;

    /* renamed from: b */
    private C13560k f30265b;

    /* renamed from: c */
    private int f30266c;

    /* renamed from: d */
    private int f30267d;

    /* renamed from: e */
    private int f30268e;

    /* renamed from: f */
    private C12248r f30269f;

    /* renamed from: g */
    private final C13555h f30270g;

    /* renamed from: h */
    private final C12208a f30271h;

    /* renamed from: i */
    private final C13545e f30272i;

    /* renamed from: j */
    private final AbstractC12237n f30273j;

    public C13544d(C13555h connectionPool, C12208a address, C13545e call, AbstractC12237n eventListener) {
        C9971q.m14633g(connectionPool, "connectionPool");
        C9971q.m14633g(address, "address");
        C9971q.m14633g(call, "call");
        C9971q.m14633g(eventListener, "eventListener");
        this.f30270g = connectionPool;
        this.f30271h = address;
        this.f30272i = call;
        this.f30273j = eventListener;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p389vj.C13549f m3438b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p389vj.C13544d.m3438b(int, int, int, int, boolean):vj.f");
    }

    /* renamed from: c */
    private final C13549f m3437c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        boolean z3;
        while (true) {
            C13549f b = m3438b(i, i2, i3, i4, z);
            if (b.m3370u(z2)) {
                return b;
            }
            b.m3365z();
            if (this.f30269f == null) {
                C13560k.C13562b bVar = this.f30264a;
                boolean z4 = true;
                if (bVar != null) {
                    z3 = bVar.m3344b();
                } else {
                    z3 = true;
                }
                if (!z3) {
                    C13560k kVar = this.f30265b;
                    if (kVar != null) {
                        z4 = kVar.m3352b();
                    }
                    if (!z4) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: f */
    private final C12248r m3434f() {
        C13549f n;
        if (this.f30266c > 1 || this.f30267d > 1 || this.f30268e > 0 || (n = this.f30272i.m3415n()) == null) {
            return null;
        }
        synchronized (n) {
            if (n.m3374q() != 0) {
                return null;
            }
            if (!C12729c.m5611g(n.m3396A().m7268a().m7399l(), this.f30271h.m7399l())) {
                return null;
            }
            return n.m3396A();
        }
    }

    /* renamed from: a */
    public final AbstractC13895d m3439a(OkHttpClient client, C13898g chain) {
        C9971q.m14633g(client, "client");
        C9971q.m14633g(chain, "chain");
        try {
            return m3437c(chain.m2355f(), chain.m2353h(), chain.m2351j(), client.m9966D(), client.m9960J(), !C9971q.m14638b(chain.m2352i().m9881h(), "GET")).m3368w(client, chain);
        } catch (IOException e) {
            m3432h(e);
            throw new C13559j(e);
        } catch (C13559j e2) {
            m3432h(e2.m3354c());
            throw e2;
        }
    }

    /* renamed from: d */
    public final C12208a m3436d() {
        return this.f30271h;
    }

    /* renamed from: e */
    public final boolean m3435e() {
        C13560k kVar;
        if (this.f30266c == 0 && this.f30267d == 0 && this.f30268e == 0) {
            return false;
        }
        if (this.f30269f != null) {
            return true;
        }
        C12248r f = m3434f();
        if (f != null) {
            this.f30269f = f;
            return true;
        }
        C13560k.C13562b bVar = this.f30264a;
        if ((bVar == null || !bVar.m3344b()) && (kVar = this.f30265b) != null) {
            return kVar.m3352b();
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m3433g(HttpUrl url) {
        C9971q.m14633g(url, "url");
        HttpUrl l = this.f30271h.m7399l();
        if (url.m10037m() != l.m10037m() || !C9971q.m14638b(url.m10042h(), l.m10042h())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void m3432h(IOException e) {
        C9971q.m14633g(e, "e");
        this.f30269f = null;
        if ((e instanceof C14494n) && ((C14494n) e).f32875k == EnumC14449b.REFUSED_STREAM) {
            this.f30266c++;
        } else if (e instanceof C14448a) {
            this.f30267d++;
        } else {
            this.f30268e++;
        }
    }
}
