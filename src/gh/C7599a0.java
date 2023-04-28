package gh;

import fi.AbstractC7267g0;
import java.util.Collection;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11313e;

/* renamed from: gh.a0 */
/* loaded from: classes8.dex */
public final class C7599a0 implements AbstractC7653z<AbstractC7625m> {

    /* renamed from: a */
    public static final C7599a0 f16555a = new C7599a0();

    private C7599a0() {
    }

    @Override // gh.AbstractC7653z
    /* renamed from: a */
    public String mo21786a(AbstractC11313e classDescriptor) {
        C9971q.m14633g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // gh.AbstractC7653z
    /* renamed from: b */
    public void mo21785b(AbstractC7267g0 kotlinType, AbstractC11313e descriptor) {
        C9971q.m14633g(kotlinType, "kotlinType");
        C9971q.m14633g(descriptor, "descriptor");
    }

    @Override // gh.AbstractC7653z
    /* renamed from: d */
    public AbstractC7267g0 mo21783d(AbstractC7267g0 kotlinType) {
        C9971q.m14633g(kotlinType, "kotlinType");
        return null;
    }

    @Override // gh.AbstractC7653z
    /* renamed from: e */
    public String mo21782e(AbstractC11313e classDescriptor) {
        C9971q.m14633g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // gh.AbstractC7653z
    /* renamed from: f */
    public AbstractC7267g0 mo21781f(Collection<? extends AbstractC7267g0> types) {
        String e0;
        C9971q.m14633g(types, "types");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("There should be no intersection type in existing descriptors, but found: ");
        e0 = C9914r.m14760e0(types, null, null, null, 0, null, null, 63, null);
        sb2.append(e0);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: g */
    public AbstractC7625m mo21784c(AbstractC11313e classDescriptor) {
        C9971q.m14633g(classDescriptor, "classDescriptor");
        return null;
    }
}
