package p427xg;

import java.util.Collection;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p268og.AbstractC11301b;
import p388vh.C13508c;

/* renamed from: xg.i */
/* loaded from: classes8.dex */
public final class C14130i {

    /* renamed from: a */
    public static final C14130i f31917a = new C14130i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xg.i$a */
    /* loaded from: classes8.dex */
    public static final class C14131a extends AbstractC9973s implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        public static final C14131a f31918k = new C14131a();

        C14131a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11301b it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(C14130i.f31917a.m1568b(it));
        }
    }

    private C14130i() {
    }

    /* renamed from: c */
    private final boolean m1567c(AbstractC11301b bVar) {
        boolean M;
        M = C9914r.m14778M(C14122g.f31903a.m1590c(), C13508c.m3533h(bVar));
        if (M && bVar.mo6242i().isEmpty()) {
            return true;
        }
        if (!AbstractC10420h.m13391f0(bVar)) {
            return false;
        }
        Collection<? extends AbstractC11301b> overriddenDescriptors = bVar.mo6249d();
        C9971q.m14634f(overriddenDescriptors, "overriddenDescriptors");
        if (!overriddenDescriptors.isEmpty()) {
            for (AbstractC11301b it : overriddenDescriptors) {
                C14130i iVar = f31917a;
                C9971q.m14634f(it, "it");
                if (iVar.m1568b(it)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String m1569a(AbstractC11301b bVar) {
        C11142f fVar;
        C9971q.m14633g(bVar, "<this>");
        AbstractC10420h.m13391f0(bVar);
        AbstractC11301b f = C13508c.m3535f(C13508c.m3522s(bVar), false, C14131a.f31918k, 1, null);
        if (f == null || (fVar = C14122g.f31903a.m1592a().get(C13508c.m3529l(f))) == null) {
            return null;
        }
        return fVar.m10771b();
    }

    /* renamed from: b */
    public final boolean m1568b(AbstractC11301b callableMemberDescriptor) {
        C9971q.m14633g(callableMemberDescriptor, "callableMemberDescriptor");
        if (!C14122g.f31903a.m1589d().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        return m1567c(callableMemberDescriptor);
    }
}
