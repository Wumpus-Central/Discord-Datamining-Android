package bh;

import ch.C4006b;
import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import fi.C7270h0;
import fi.EnumC7319r1;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9905i;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import p013ah.C1394d;
import p013ah.C1399g;
import p086eh.AbstractC6898j;
import p086eh.AbstractC6913y;
import p268og.AbstractC11299a1;
import p268og.AbstractC11346m;
import p324rg.AbstractC12588b;

/* renamed from: bh.n */
/* loaded from: classes8.dex */
public final class C3555n extends AbstractC12588b {

    /* renamed from: u */
    private final C1399g f5757u;

    /* renamed from: v */
    private final AbstractC6913y f5758v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3555n(C1399g c, AbstractC6913y javaTypeParameter, int i, AbstractC11346m containingDeclaration) {
        super(c.m41170e(), containingDeclaration, new C1394d(c, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), EnumC7338w1.INVARIANT, false, i, AbstractC11299a1.f25230a, c.m41174a().m41188v());
        C9971q.m14633g(c, "c");
        C9971q.m14633g(javaTypeParameter, "javaTypeParameter");
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        this.f5757u = c;
        this.f5758v = javaTypeParameter;
    }

    /* renamed from: M0 */
    private final List<AbstractC7267g0> m34112M0() {
        int t;
        List<AbstractC7267g0> d;
        Collection<AbstractC6898j> upperBounds = this.f5758v.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC7304o0 i = this.f5757u.m41171d().mo6136n().m13387i();
            C9971q.m14634f(i, "c.module.builtIns.anyType");
            AbstractC7304o0 I = this.f5757u.m41171d().mo6136n().m13419I();
            C9971q.m14634f(I, "c.module.builtIns.nullableAnyType");
            d = C9905i.m14825d(C7270h0.m23056d(i, I));
            return d;
        }
        t = C9907k.m14809t(upperBounds, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC6898j jVar : upperBounds) {
            arrayList.add(this.f5757u.m41168g().m33093o(jVar, C4006b.m33109b(EnumC7319r1.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // p324rg.AbstractC12598e
    /* renamed from: G0 */
    protected List<AbstractC7267g0> mo6396G0(List<? extends AbstractC7267g0> bounds) {
        C9971q.m14633g(bounds, "bounds");
        return this.f5757u.m41174a().m41192r().m23229i(this, bounds, this.f5757u);
    }

    @Override // p324rg.AbstractC12598e
    /* renamed from: K0 */
    protected void mo6335K0(AbstractC7267g0 type) {
        C9971q.m14633g(type, "type");
    }

    @Override // p324rg.AbstractC12598e
    /* renamed from: L0 */
    protected List<AbstractC7267g0> mo6334L0() {
        return m34112M0();
    }
}
