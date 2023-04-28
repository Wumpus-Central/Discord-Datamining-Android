package bh;

import bh.AbstractC3533j;
import fi.AbstractC7267g0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p013ah.C1399g;
import p086eh.AbstractC6906r;
import p249nh.C11142f;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11388u0;
import p268og.AbstractC11396x0;

/* renamed from: bh.m */
/* loaded from: classes8.dex */
public abstract class AbstractC3554m extends AbstractC3533j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3554m(C1399g c) {
        super(c, null, 2, null);
        C9971q.m14633g(c, "c");
    }

    @Override // bh.AbstractC3533j
    /* renamed from: H */
    protected AbstractC3533j.C3534a mo34115H(AbstractC6906r method, List<? extends AbstractC11319f1> methodTypeParameters, AbstractC7267g0 returnType, List<? extends AbstractC11335j1> valueParameters) {
        List i;
        C9971q.m14633g(method, "method");
        C9971q.m14633g(methodTypeParameters, "methodTypeParameters");
        C9971q.m14633g(returnType, "returnType");
        C9971q.m14633g(valueParameters, "valueParameters");
        i = C9906j.m14820i();
        return new AbstractC3533j.C3534a(returnType, null, valueParameters, methodTypeParameters, false, i);
    }

    @Override // bh.AbstractC3533j
    /* renamed from: s */
    protected void mo34114s(C11142f name, Collection<AbstractC11388u0> result) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(result, "result");
    }

    @Override // bh.AbstractC3533j
    /* renamed from: z */
    protected AbstractC11396x0 mo34113z() {
        return null;
    }
}
