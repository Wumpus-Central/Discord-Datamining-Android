package p389vj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.Interceptor;
import okhttp3.Response;
import p409wj.C13898g;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m15073d2 = {"Lvj/a;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.a */
/* loaded from: classes8.dex */
public final class C13539a implements Interceptor {

    /* renamed from: a */
    public static final C13539a f30242a = new C13539a();

    private C13539a() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        C9971q.m14633g(chain, "chain");
        C13898g gVar = (C13898g) chain;
        return C13898g.m2357d(gVar, 0, gVar.m2356e().m3408u(gVar), null, 0, 0, 0, 61, null).mo2360a(gVar.m2352i());
    }
}
