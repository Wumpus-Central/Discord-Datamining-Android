package tg;

import bi.AbstractC3596r;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;

/* renamed from: tg.j */
/* loaded from: classes8.dex */
public final class C13091j implements AbstractC3596r {

    /* renamed from: b */
    public static final C13091j f29399b = new C13091j();

    private C13091j() {
    }

    @Override // bi.AbstractC3596r
    /* renamed from: a */
    public void mo4619a(AbstractC11301b descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // bi.AbstractC3596r
    /* renamed from: b */
    public void mo4618b(AbstractC11313e descriptor, List<String> unresolvedSuperClasses) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
