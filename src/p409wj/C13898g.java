package p409wj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p389vj.C13541c;
import p389vj.C13545e;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000f\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b!\u0010%R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b&\u0010%R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b'\u0010%¨\u0006*"}, m15073d2 = {"Lwj/g;", "Lokhttp3/Interceptor$Chain;", "", "index", "Lvj/c;", "exchange", "Lokhttp3/Request;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "c", "(ILvj/c;Lokhttp3/Request;III)Lwj/g;", "k", "Lokhttp3/Call;", "call", "b", "Lokhttp3/Response;", "a", "I", "calls", "Lvj/e;", "Lvj/e;", "e", "()Lvj/e;", "", "Lokhttp3/Interceptor;", "Ljava/util/List;", "interceptors", "d", "Lvj/c;", "g", "()Lvj/c;", "f", "Lokhttp3/Request;", "i", "()Lokhttp3/Request;", "()I", "h", "j", "<init>", "(Lvj/e;Ljava/util/List;ILvj/c;Lokhttp3/Request;III)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: wj.g */
/* loaded from: classes8.dex */
public final class C13898g implements Interceptor.Chain {

    /* renamed from: a */
    private int f31329a;

    /* renamed from: b */
    private final C13545e f31330b;

    /* renamed from: c */
    private final List<Interceptor> f31331c;

    /* renamed from: d */
    private final int f31332d;

    /* renamed from: e */
    private final C13541c f31333e;

    /* renamed from: f */
    private final Request f31334f;

    /* renamed from: g */
    private final int f31335g;

    /* renamed from: h */
    private final int f31336h;

    /* renamed from: i */
    private final int f31337i;

    /* JADX WARN: Multi-variable type inference failed */
    public C13898g(C13545e call, List<? extends Interceptor> interceptors, int i, C13541c cVar, Request request, int i2, int i3, int i4) {
        C9971q.m14633g(call, "call");
        C9971q.m14633g(interceptors, "interceptors");
        C9971q.m14633g(request, "request");
        this.f31330b = call;
        this.f31331c = interceptors;
        this.f31332d = i;
        this.f31333e = cVar;
        this.f31334f = request;
        this.f31335g = i2;
        this.f31336h = i3;
        this.f31337i = i4;
    }

    /* renamed from: d */
    public static /* synthetic */ C13898g m2357d(C13898g gVar, int i, C13541c cVar, Request request, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = gVar.f31332d;
        }
        if ((i5 & 2) != 0) {
            cVar = gVar.f31333e;
        }
        if ((i5 & 4) != 0) {
            request = gVar.f31334f;
        }
        if ((i5 & 8) != 0) {
            i2 = gVar.f31335g;
        }
        if ((i5 & 16) != 0) {
            i3 = gVar.f31336h;
        }
        if ((i5 & 32) != 0) {
            i4 = gVar.f31337i;
        }
        return gVar.m2358c(i, cVar, request, i2, i3, i4);
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: a */
    public Response mo2360a(Request request) {
        boolean z;
        boolean z2;
        boolean z3;
        C9971q.m14633g(request, "request");
        boolean z4 = false;
        if (this.f31332d < this.f31331c.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f31329a++;
            C13541c cVar = this.f31333e;
            if (cVar != null) {
                if (cVar.m3454j().m3433g(request.m9877l())) {
                    if (this.f31329a == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalStateException(("network interceptor " + this.f31331c.get(this.f31332d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f31331c.get(this.f31332d - 1) + " must retain the same host and port").toString());
                }
            }
            C13898g d = m2357d(this, this.f31332d + 1, null, request, 0, 0, 0, 58, null);
            Interceptor interceptor = this.f31331c.get(this.f31332d);
            Response intercept = interceptor.intercept(d);
            if (intercept != null) {
                if (this.f31333e != null) {
                    if (this.f31332d + 1 >= this.f31331c.size() || d.f31329a == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.m9845b() != null) {
                    z4 = true;
                }
                if (z4) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: b */
    public Request mo2359b() {
        return this.f31334f;
    }

    /* renamed from: c */
    public final C13898g m2358c(int i, C13541c cVar, Request request, int i2, int i3, int i4) {
        C9971q.m14633g(request, "request");
        return new C13898g(this.f31330b, this.f31331c, i, cVar, request, i2, i3, i4);
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.f31330b;
    }

    /* renamed from: e */
    public final C13545e m2356e() {
        return this.f31330b;
    }

    /* renamed from: f */
    public final int m2355f() {
        return this.f31335g;
    }

    /* renamed from: g */
    public final C13541c m2354g() {
        return this.f31333e;
    }

    /* renamed from: h */
    public final int m2353h() {
        return this.f31336h;
    }

    /* renamed from: i */
    public final Request m2352i() {
        return this.f31334f;
    }

    /* renamed from: j */
    public final int m2351j() {
        return this.f31337i;
    }

    /* renamed from: k */
    public int m2350k() {
        return this.f31336h;
    }
}
