package fi;

import fi.C7232c1;
import java.util.List;
import kotlin.collections.C9905i;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11346m;
import pg.AbstractC11672g;

/* renamed from: fi.o */
/* loaded from: classes8.dex */
public final class C7303o implements AbstractC7228b1 {

    /* renamed from: a */
    public static final C7303o f15781a = new C7303o();

    private C7303o() {
    }

    @Override // fi.AbstractC7228b1
    /* renamed from: a */
    public C7232c1 mo23000a(AbstractC11672g annotations, AbstractC7268g1 g1Var, AbstractC11346m mVar) {
        List<? extends AbstractC7224a1<?>> d;
        C9971q.m14633g(annotations, "annotations");
        if (annotations.isEmpty()) {
            return C7232c1.f15671l.m23149h();
        }
        C7232c1.C7233a aVar = C7232c1.f15671l;
        d = C9905i.m14825d(new C7280j(annotations));
        return aVar.m23150g(d);
    }
}
