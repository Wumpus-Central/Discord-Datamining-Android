package p217lg;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7270h0;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.List;
import ki.C9883a;
import kotlin.collections.C9905i;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import p087ei.C6920f;
import p142hi.C8039k;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11319f1;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p324rg.C12617k0;
import p324rg.C12623m;
import p324rg.C12652y;
import pg.AbstractC11672g;

/* renamed from: lg.l */
/* loaded from: classes8.dex */
public final class C10436l {

    /* renamed from: a */
    private static final C12652y f22952a;

    static {
        List<AbstractC11319f1> d;
        C12623m mVar = new C12623m(C8039k.f17408a.m20769i(), C10434k.f22886m);
        EnumC11317f fVar = EnumC11317f.INTERFACE;
        C11142f g = C10434k.f22889p.m10798g();
        AbstractC11299a1 a1Var = AbstractC11299a1.f25230a;
        AbstractC6944n nVar = C6920f.f15067e;
        C12652y yVar = new C12652y(mVar, fVar, false, false, g, a1Var, nVar);
        yVar.m6124M0(EnumC11314e0.ABSTRACT);
        yVar.m6122O0(C11373t.f25299e);
        d = C9905i.m14825d(C12617k0.m6328R0(yVar, AbstractC11672g.f26044g.m9048b(), false, EnumC7338w1.IN_VARIANCE, C11142f.m10767f("T"), 0, nVar));
        yVar.m6123N0(d);
        yVar.m6126K0();
        f22952a = yVar;
    }

    /* renamed from: a */
    public static final AbstractC7304o0 m13322a(AbstractC7267g0 suspendFunType) {
        int t;
        List d;
        List p0;
        AbstractC7304o0 b;
        C9971q.m14633g(suspendFunType, "suspendFunType");
        C10419g.m13435q(suspendFunType);
        AbstractC10420h i = C9883a.m15096i(suspendFunType);
        AbstractC11672g annotations = suspendFunType.getAnnotations();
        AbstractC7267g0 j = C10419g.m13442j(suspendFunType);
        List<AbstractC7267g0> e = C10419g.m13447e(suspendFunType);
        List<AbstractC7290k1> l = C10419g.m13440l(suspendFunType);
        t = C9907k.m14809t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC7290k1 k1Var : l) {
            arrayList.add(k1Var.getType());
        }
        C7232c1 h = C7232c1.f15671l.m23149h();
        AbstractC7268g1 k = f22952a.mo6111k();
        C9971q.m14634f(k, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        d = C9905i.m14825d(C9883a.m15104a(C10419g.m13441k(suspendFunType)));
        p0 = C9914r.m14749p0(arrayList, C7270h0.m23050j(h, k, d, false, null, 16, null));
        AbstractC7304o0 I = C9883a.m15096i(suspendFunType).m13419I();
        C9971q.m14634f(I, "suspendFunType.builtIns.nullableAnyType");
        b = C10419g.m13450b(i, annotations, j, e, p0, null, I, (r17 & 128) != 0 ? false : false);
        return b.mo5166U0(suspendFunType.mo5171O0());
    }
}
