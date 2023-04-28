package mg;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import fi.C7309p1;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217lg.C10419g;
import p233mi.C10654q;
import p249nh.C11142f;
import p267of.C11280m;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p324rg.AbstractC12632p;
import p324rg.C12607g0;
import p324rg.C12619l0;
import pg.AbstractC11672g;

/* renamed from: mg.e */
/* loaded from: classes8.dex */
public final class C10604e extends C12607g0 {

    /* renamed from: O */
    public static final C10605a f38801O = new C10605a(null);

    /* renamed from: mg.e$a */
    /* loaded from: classes8.dex */
    public static final class C10605a {
        private C10605a() {
        }

        public /* synthetic */ C10605a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final AbstractC11335j1 m12747b(C10604e eVar, int i, AbstractC11319f1 f1Var) {
            String str;
            String b = f1Var.getName().m10771b();
            C9971q.m14634f(b, "typeParameter.name.asString()");
            if (C9971q.m14638b(b, "T")) {
                str = "instance";
            } else if (C9971q.m14638b(b, "E")) {
                str = "receiver";
            } else {
                str = b.toLowerCase(Locale.ROOT);
                C9971q.m14634f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            AbstractC11672g b2 = AbstractC11672g.f26044g.m9048b();
            C11142f f = C11142f.m10767f(str);
            C9971q.m14634f(f, "identifier(name)");
            AbstractC7304o0 p = f1Var.mo6166p();
            C9971q.m14634f(p, "typeParameter.defaultType");
            AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
            C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
            return new C12619l0(eVar, null, i, b2, f, p, false, false, false, null, NO_SOURCE);
        }

        /* renamed from: a */
        public final C10604e m12748a(C10598b functionClass, boolean z) {
            List<AbstractC11396x0> i;
            List<? extends AbstractC11319f1> i2;
            Iterable<C11280m> J0;
            int t;
            Object g0;
            boolean z2;
            C9971q.m14633g(functionClass, "functionClass");
            List<AbstractC11319f1> r = functionClass.mo6109r();
            C10604e eVar = new C10604e(functionClass, null, AbstractC11301b.EnumC11302a.DECLARATION, z, null);
            AbstractC11396x0 J02 = functionClass.mo6174J0();
            i = C9906j.m14820i();
            i2 = C9906j.m14820i();
            ArrayList arrayList = new ArrayList();
            for (Object obj : r) {
                if (((AbstractC11319f1) obj).mo6392m() == EnumC7338w1.IN_VARIANCE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                arrayList.add(obj);
            }
            J0 = C9914r.m14783J0(arrayList);
            t = C9907k.m14809t(J0, 10);
            ArrayList arrayList2 = new ArrayList(t);
            for (C11280m mVar : J0) {
                arrayList2.add(C10604e.f38801O.m12747b(eVar, mVar.m10277c(), (AbstractC11319f1) mVar.m10276d()));
            }
            g0 = C9914r.m14758g0(r);
            eVar.mo6259R0(null, J02, i, i2, arrayList2, ((AbstractC11319f1) g0).mo6166p(), EnumC11314e0.ABSTRACT, C11373t.f25299e);
            eVar.mo78Z0(true);
            return eVar;
        }
    }

    private C10604e(AbstractC11346m mVar, C10604e eVar, AbstractC11301b.EnumC11302a aVar, boolean z) {
        super(mVar, eVar, AbstractC11672g.f26044g.m9048b(), C10654q.f23559i, aVar, AbstractC11299a1.f25230a);
        m6246f1(true);
        m6243h1(z);
        mo79Y0(false);
    }

    public /* synthetic */ C10604e(AbstractC11346m mVar, C10604e eVar, AbstractC11301b.EnumC11302a aVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, eVar, aVar, z);
    }

    /* renamed from: p1 */
    private final AbstractC11397y m12749p1(List<C11142f> list) {
        int t;
        boolean z;
        C11142f fVar;
        List<Pair> K0;
        boolean z2;
        int size = mo6242i().size() - list.size();
        boolean z3 = true;
        if (size == 0) {
            List<AbstractC11335j1> valueParameters = mo6242i();
            C9971q.m14634f(valueParameters, "valueParameters");
            K0 = C9914r.m14781K0(list, valueParameters);
            if (!(K0 instanceof Collection) || !K0.isEmpty()) {
                for (Pair pair : K0) {
                    if (!C9971q.m14638b((C11142f) pair.m15067a(), ((AbstractC11335j1) pair.m15066b()).getName())) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return this;
            }
        }
        List<AbstractC11335j1> valueParameters2 = mo6242i();
        C9971q.m14634f(valueParameters2, "valueParameters");
        t = C9907k.m14809t(valueParameters2, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11335j1 j1Var : valueParameters2) {
            C11142f name = j1Var.getName();
            C9971q.m14634f(name, "it.name");
            int index = j1Var.getIndex();
            int i = index - size;
            if (i >= 0 && (fVar = list.get(i)) != null) {
                name = fVar;
            }
            arrayList.add(j1Var.mo6300Q(this, name, index));
        }
        AbstractC12632p.C12635c S0 = m6258S0(C7309p1.f15790b);
        if (!list.isEmpty()) {
            for (C11142f fVar2 : list) {
                if (fVar2 == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z3 = false;
        AbstractC12632p.C12635c N = S0.m6228G(z3).mo6210c(arrayList).mo6205h(mo6162a());
        C9971q.m14634f(N, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        AbstractC11397y M0 = super.mo6263M0(N);
        C9971q.m14636d(M0);
        return M0;
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11397y
    /* renamed from: A */
    public boolean mo6274A() {
        return false;
    }

    @Override // p324rg.C12607g0, p324rg.AbstractC12632p
    /* renamed from: L0 */
    protected AbstractC12632p mo71L0(AbstractC11346m newOwner, AbstractC11397y yVar, AbstractC11301b.EnumC11302a kind, C11142f fVar, AbstractC11672g annotations, AbstractC11299a1 source) {
        C9971q.m14633g(newOwner, "newOwner");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(source, "source");
        return new C10604e(newOwner, (C10604e) yVar, kind, isSuspend());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p324rg.AbstractC12632p
    /* renamed from: M0 */
    public AbstractC11397y mo6263M0(AbstractC12632p.C12635c configuration) {
        int t;
        boolean z;
        C9971q.m14633g(configuration, "configuration");
        C10604e eVar = (C10604e) super.mo6263M0(configuration);
        if (eVar == null) {
            return null;
        }
        List<AbstractC11335j1> i = eVar.mo6242i();
        C9971q.m14634f(i, "substituted.valueParameters");
        boolean z2 = true;
        if (!(i instanceof Collection) || !i.isEmpty()) {
            Iterator<T> it = i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC7267g0 type = ((AbstractC11335j1) it.next()).getType();
                C9971q.m14634f(type, "it.type");
                if (C10419g.m13448d(type) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return eVar;
        }
        List<AbstractC11335j1> i2 = eVar.mo6242i();
        C9971q.m14634f(i2, "substituted.valueParameters");
        t = C9907k.m14809t(i2, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11335j1 j1Var : i2) {
            AbstractC7267g0 type2 = j1Var.getType();
            C9971q.m14634f(type2, "it.type");
            arrayList.add(C10419g.m13448d(type2));
        }
        return eVar.m12749p1(arrayList);
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11310d0
    public boolean isExternal() {
        return false;
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11397y
    public boolean isInline() {
        return false;
    }
}
