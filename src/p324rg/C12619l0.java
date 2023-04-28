package p324rg;

import fi.AbstractC7267g0;
import fi.C7309p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11335j1;
import p268og.AbstractC11342k1;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import p268og.AbstractC11387u;
import p268og.C11373t;
import pg.AbstractC11672g;
import th.AbstractC13104g;

/* renamed from: rg.l0 */
/* loaded from: classes8.dex */
public class C12619l0 extends AbstractC12624m0 implements AbstractC11335j1 {

    /* renamed from: v */
    public static final C12620a f28369v = new C12620a(null);

    /* renamed from: p */
    private final int f28370p;

    /* renamed from: q */
    private final boolean f28371q;

    /* renamed from: r */
    private final boolean f28372r;

    /* renamed from: s */
    private final boolean f28373s;

    /* renamed from: t */
    private final AbstractC7267g0 f28374t;

    /* renamed from: u */
    private final AbstractC11335j1 f28375u;

    /* renamed from: rg.l0$a */
    /* loaded from: classes8.dex */
    public static final class C12620a {
        private C12620a() {
        }

        public /* synthetic */ C12620a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12619l0 m6302a(AbstractC11297a containingDeclaration, AbstractC11335j1 j1Var, int i, AbstractC11672g annotations, C11142f name, AbstractC7267g0 outType, boolean z, boolean z2, boolean z3, AbstractC7267g0 g0Var, AbstractC11299a1 source, Function0<? extends List<? extends AbstractC11342k1>> function0) {
            C9971q.m14633g(containingDeclaration, "containingDeclaration");
            C9971q.m14633g(annotations, "annotations");
            C9971q.m14633g(name, "name");
            C9971q.m14633g(outType, "outType");
            C9971q.m14633g(source, "source");
            if (function0 == null) {
                return new C12619l0(containingDeclaration, j1Var, i, annotations, name, outType, z, z2, z3, g0Var, source);
            }
            return new C12621b(containingDeclaration, j1Var, i, annotations, name, outType, z, z2, z3, g0Var, source, function0);
        }
    }

    /* renamed from: rg.l0$b */
    /* loaded from: classes8.dex */
    public static final class C12621b extends C12619l0 {

        /* renamed from: w */
        private final Lazy f28376w;

        /* renamed from: rg.l0$b$a */
        /* loaded from: classes8.dex */
        static final class C12622a extends AbstractC9973s implements Function0<List<? extends AbstractC11342k1>> {
            C12622a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC11342k1> invoke() {
                return C12621b.this.m6301N0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12621b(AbstractC11297a containingDeclaration, AbstractC11335j1 j1Var, int i, AbstractC11672g annotations, C11142f name, AbstractC7267g0 outType, boolean z, boolean z2, boolean z3, AbstractC7267g0 g0Var, AbstractC11299a1 source, Function0<? extends List<? extends AbstractC11342k1>> destructuringVariables) {
            super(containingDeclaration, j1Var, i, annotations, name, outType, z, z2, z3, g0Var, source);
            Lazy a;
            C9971q.m14633g(containingDeclaration, "containingDeclaration");
            C9971q.m14633g(annotations, "annotations");
            C9971q.m14633g(name, "name");
            C9971q.m14633g(outType, "outType");
            C9971q.m14633g(source, "source");
            C9971q.m14633g(destructuringVariables, "destructuringVariables");
            a = C11084n.m10945a(destructuringVariables);
            this.f28376w = a;
        }

        /* renamed from: N0 */
        public final List<AbstractC11342k1> m6301N0() {
            return (List) this.f28376w.getValue();
        }

        @Override // p324rg.C12619l0, p268og.AbstractC11335j1
        /* renamed from: Q */
        public AbstractC11335j1 mo6300Q(AbstractC11297a newOwner, C11142f newName, int i) {
            C9971q.m14633g(newOwner, "newOwner");
            C9971q.m14633g(newName, "newName");
            AbstractC11672g annotations = getAnnotations();
            C9971q.m14634f(annotations, "annotations");
            AbstractC7267g0 type = getType();
            C9971q.m14634f(type, "type");
            boolean y0 = mo6303y0();
            boolean o0 = mo6305o0();
            boolean l0 = mo6306l0();
            AbstractC7267g0 r0 = mo6304r0();
            AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
            C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
            return new C12621b(newOwner, null, i, annotations, newName, type, y0, o0, l0, r0, NO_SOURCE, new C12622a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12619l0(AbstractC11297a containingDeclaration, AbstractC11335j1 j1Var, int i, AbstractC11672g annotations, C11142f name, AbstractC7267g0 outType, boolean z, boolean z2, boolean z3, AbstractC7267g0 g0Var, AbstractC11299a1 source) {
        super(containingDeclaration, annotations, name, outType, source);
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(outType, "outType");
        C9971q.m14633g(source, "source");
        this.f28370p = i;
        this.f28371q = z;
        this.f28372r = z2;
        this.f28373s = z3;
        this.f28374t = g0Var;
        this.f28375u = j1Var == null ? this : j1Var;
    }

    /* renamed from: K0 */
    public static final C12619l0 m6309K0(AbstractC11297a aVar, AbstractC11335j1 j1Var, int i, AbstractC11672g gVar, C11142f fVar, AbstractC7267g0 g0Var, boolean z, boolean z2, boolean z3, AbstractC7267g0 g0Var2, AbstractC11299a1 a1Var, Function0<? extends List<? extends AbstractC11342k1>> function0) {
        return f28369v.m6302a(aVar, j1Var, i, gVar, fVar, g0Var, z, z2, z3, g0Var2, a1Var, function0);
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> visitor, D d) {
        C9971q.m14633g(visitor, "visitor");
        return visitor.mo6315j(this, d);
    }

    @Override // p268og.AbstractC11342k1
    /* renamed from: L */
    public boolean mo6277L() {
        return false;
    }

    /* renamed from: L0 */
    public Void m6308L0() {
        return null;
    }

    /* renamed from: M0 */
    public AbstractC11335j1 mo6167c(C7309p1 substitutor) {
        C9971q.m14633g(substitutor, "substitutor");
        if (substitutor.m22975k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p268og.AbstractC11335j1
    /* renamed from: Q */
    public AbstractC11335j1 mo6300Q(AbstractC11297a newOwner, C11142f newName, int i) {
        C9971q.m14633g(newOwner, "newOwner");
        C9971q.m14633g(newName, "newName");
        AbstractC11672g annotations = getAnnotations();
        C9971q.m14634f(annotations, "annotations");
        AbstractC7267g0 type = getType();
        C9971q.m14634f(type, "type");
        boolean y0 = mo6303y0();
        boolean o0 = mo6305o0();
        boolean l0 = mo6306l0();
        AbstractC7267g0 r0 = mo6304r0();
        AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
        C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
        return new C12619l0(newOwner, null, i, annotations, newName, type, y0, o0, l0, r0, NO_SOURCE);
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: d */
    public Collection<AbstractC11335j1> mo6249d() {
        int t;
        Collection<? extends AbstractC11297a> d = mo6104b().mo6249d();
        C9971q.m14634f(d, "containingDeclaration.overriddenDescriptors");
        t = C9907k.m14809t(d, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11297a aVar : d) {
            arrayList.add(aVar.mo6242i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // p268og.AbstractC11335j1
    public int getIndex() {
        return this.f28370p;
    }

    @Override // p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u LOCAL = C11373t.f25300f;
        C9971q.m14634f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // p268og.AbstractC11342k1
    /* renamed from: k0 */
    public /* bridge */ /* synthetic */ AbstractC13104g mo6275k0() {
        return (AbstractC13104g) m6308L0();
    }

    @Override // p268og.AbstractC11335j1
    /* renamed from: l0 */
    public boolean mo6306l0() {
        return this.f28373s;
    }

    @Override // p268og.AbstractC11335j1
    /* renamed from: o0 */
    public boolean mo6305o0() {
        return this.f28372r;
    }

    @Override // p268og.AbstractC11335j1
    /* renamed from: r0 */
    public AbstractC7267g0 mo6304r0() {
        return this.f28374t;
    }

    @Override // p268og.AbstractC11335j1
    /* renamed from: y0 */
    public boolean mo6303y0() {
        if (this.f28371q) {
            AbstractC11297a b = mo6104b();
            C9971q.m14635e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((AbstractC11301b) b).mo6245g().m10224a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p324rg.AbstractC12616k, p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11297a mo6104b() {
        AbstractC11346m b = super.mo6104b();
        C9971q.m14635e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (AbstractC11297a) b;
    }

    @Override // p324rg.AbstractC12616k, p324rg.AbstractC12612j, p268og.AbstractC11346m
    /* renamed from: a */
    public AbstractC11335j1 mo6162a() {
        AbstractC11335j1 j1Var = this.f28375u;
        return j1Var == this ? this : j1Var.mo6162a();
    }
}
