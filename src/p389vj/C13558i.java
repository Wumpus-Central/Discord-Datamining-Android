package p389vj;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p307qj.C12248r;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lvj/i;", "", "Lqj/r;", "failedRoute", "", "b", "route", "a", "", "c", "", "Ljava/util/Set;", "failedRoutes", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.i */
/* loaded from: classes8.dex */
public final class C13558i {

    /* renamed from: a */
    private final Set<C12248r> f30328a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m3359a(C12248r route) {
        C9971q.m14633g(route, "route");
        this.f30328a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m3358b(C12248r failedRoute) {
        C9971q.m14633g(failedRoute, "failedRoute");
        this.f30328a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m3357c(C12248r route) {
        C9971q.m14633g(route, "route");
        return this.f30328a.contains(route);
    }
}
