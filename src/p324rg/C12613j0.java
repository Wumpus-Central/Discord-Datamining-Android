package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import fi.C7235d0;
import fi.C7309p1;
import fi.C7321s0;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p087ei.AbstractC6939j;
import p087ei.AbstractC6944n;
import p249nh.C11142f;
import p249nh.C11144h;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.EnumC11314e0;
import p325rh.C12659d;
import p468zh.AbstractC14662f;
import p468zh.AbstractC14663g;
import pg.AbstractC11672g;

/* renamed from: rg.j0 */
/* loaded from: classes8.dex */
public final class C12613j0 extends AbstractC12632p implements AbstractC12611i0 {

    /* renamed from: O */
    private final AbstractC6944n f39323O;

    /* renamed from: P */
    private final AbstractC11316e1 f39324P;

    /* renamed from: Q */
    private final AbstractC6939j f39325Q;

    /* renamed from: R */
    private AbstractC11309d f39326R;

    /* renamed from: T */
    static final /* synthetic */ KProperty<Object>[] f39322T = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C12613j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: S */
    public static final C12614a f39321S = new C12614a(null);

    /* renamed from: rg.j0$a */
    /* loaded from: classes8.dex */
    public static final class C12614a {
        private C12614a() {
        }

        public /* synthetic */ C12614a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final C7309p1 m6339c(AbstractC11316e1 e1Var) {
            if (e1Var.mo10216t() == null) {
                return null;
            }
            return C7309p1.m22980f(e1Var.mo10218E());
        }

        /* renamed from: b */
        public final AbstractC12611i0 m6340b(AbstractC6944n storageManager, AbstractC11316e1 typeAliasDescriptor, AbstractC11309d constructor) {
            AbstractC11309d c;
            List<AbstractC11396x0> list;
            List<AbstractC11396x0> i;
            int t;
            C9971q.m14633g(storageManager, "storageManager");
            C9971q.m14633g(typeAliasDescriptor, "typeAliasDescriptor");
            C9971q.m14633g(constructor, "constructor");
            C7309p1 c2 = m6339c(typeAliasDescriptor);
            AbstractC11396x0 x0Var = null;
            if (c2 == null || (c = constructor.mo6167c(c2)) == null) {
                return null;
            }
            AbstractC11672g annotations = constructor.getAnnotations();
            AbstractC11301b.EnumC11302a g = constructor.mo6245g();
            C9971q.m14634f(g, "constructor.kind");
            AbstractC11299a1 j = typeAliasDescriptor.mo6102j();
            C9971q.m14634f(j, "typeAliasDescriptor.source");
            C12613j0 j0Var = new C12613j0(storageManager, typeAliasDescriptor, c, null, annotations, g, j, null);
            List<AbstractC11335j1> O0 = AbstractC12632p.m6261O0(j0Var, constructor.mo6242i(), c2);
            if (O0 == null) {
                return null;
            }
            AbstractC7304o0 c3 = C7235d0.m23143c(c.getReturnType().mo22868Q0());
            AbstractC7304o0 p = typeAliasDescriptor.mo6166p();
            C9971q.m14634f(p, "typeAliasDescriptor.defaultType");
            AbstractC7304o0 j2 = C7321s0.m22948j(c3, p);
            AbstractC11396x0 J = constructor.mo6266J();
            if (J != null) {
                x0Var = C12659d.m6076i(j0Var, c2.m22972n(J.getType(), EnumC7338w1.INVARIANT), AbstractC11672g.f26044g.m9048b());
            }
            AbstractC11313e t2 = typeAliasDescriptor.mo10216t();
            if (t2 != null) {
                List<AbstractC11396x0> u0 = constructor.mo6237u0();
                C9971q.m14634f(u0, "constructor.contextReceiverParameters");
                t = C9907k.m14809t(u0, 10);
                list = new ArrayList<>(t);
                for (AbstractC11396x0 x0Var2 : u0) {
                    AbstractC7267g0 n = c2.m22972n(x0Var2.getType(), EnumC7338w1.INVARIANT);
                    AbstractC14663g value = x0Var2.getValue();
                    C9971q.m14635e(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    list.add(C12659d.m6082c(t2, n, ((AbstractC14662f) value).mo47a(), AbstractC11672g.f26044g.m9048b()));
                }
            } else {
                i = C9906j.m14820i();
                list = i;
            }
            j0Var.mo6259R0(x0Var, null, list, typeAliasDescriptor.mo6109r(), O0, j2, EnumC11314e0.FINAL, typeAliasDescriptor.getVisibility());
            return j0Var;
        }
    }

    /* renamed from: rg.j0$b */
    /* loaded from: classes8.dex */
    static final class C12615b extends AbstractC9973s implements Function0<C12613j0> {

        /* renamed from: l */
        final /* synthetic */ AbstractC11309d f28363l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12615b(AbstractC11309d dVar) {
            super(0);
            this.f28363l = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final C12613j0 invoke() {
            int t;
            AbstractC6944n K = C12613j0.this.m6351K();
            AbstractC11316e1 o1 = C12613j0.this.m6343o1();
            AbstractC11309d dVar = this.f28363l;
            C12613j0 j0Var = C12613j0.this;
            AbstractC11672g annotations = dVar.getAnnotations();
            AbstractC11301b.EnumC11302a g = this.f28363l.mo6245g();
            C9971q.m14634f(g, "underlyingConstructorDescriptor.kind");
            AbstractC11299a1 j = C12613j0.this.m6343o1().mo6102j();
            C9971q.m14634f(j, "typeAliasDescriptor.source");
            C12613j0 j0Var2 = new C12613j0(K, o1, dVar, j0Var, annotations, g, j, null);
            C12613j0 j0Var3 = C12613j0.this;
            AbstractC11309d dVar2 = this.f28363l;
            C7309p1 c = C12613j0.f39321S.m6339c(j0Var3.m6343o1());
            AbstractC11396x0 x0Var = null;
            if (c == null) {
                return null;
            }
            AbstractC11396x0 J = dVar2.mo6266J();
            if (J != null) {
                x0Var = J.mo6167c(c);
            }
            List<AbstractC11396x0> u0 = dVar2.mo6237u0();
            C9971q.m14634f(u0, "underlyingConstructorDes…contextReceiverParameters");
            t = C9907k.m14809t(u0, 10);
            ArrayList arrayList = new ArrayList(t);
            for (AbstractC11396x0 x0Var2 : u0) {
                arrayList.add(x0Var2.mo6167c(c));
            }
            j0Var2.mo6259R0(null, x0Var, arrayList, j0Var3.m6343o1().mo6109r(), j0Var3.mo6242i(), j0Var3.getReturnType(), EnumC11314e0.FINAL, j0Var3.m6343o1().getVisibility());
            return j0Var2;
        }
    }

    private C12613j0(AbstractC6944n nVar, AbstractC11316e1 e1Var, AbstractC11309d dVar, AbstractC12611i0 i0Var, AbstractC11672g gVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var) {
        super(e1Var, i0Var, gVar, C11144h.f24742j, aVar, a1Var);
        this.f39323O = nVar;
        this.f39324P = e1Var;
        m6255V0(m6343o1().mo6120V());
        this.f39325Q = nVar.mo23896e(new C12615b(dVar));
        this.f39326R = dVar;
    }

    public /* synthetic */ C12613j0(AbstractC6944n nVar, AbstractC11316e1 e1Var, AbstractC11309d dVar, AbstractC12611i0 i0Var, AbstractC11672g gVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, e1Var, dVar, i0Var, gVar, aVar, a1Var);
    }

    /* renamed from: K */
    public final AbstractC6944n m6351K() {
        return this.f39323O;
    }

    @Override // p324rg.AbstractC12611i0
    /* renamed from: P */
    public AbstractC11309d mo6350P() {
        return this.f39326R;
    }

    @Override // p268og.AbstractC11343l
    /* renamed from: Z */
    public boolean mo6349Z() {
        return mo6350P().mo6349Z();
    }

    @Override // p268og.AbstractC11343l
    /* renamed from: a0 */
    public AbstractC11313e mo6348a0() {
        AbstractC11313e a0 = mo6350P().mo6348a0();
        C9971q.m14634f(a0, "underlyingConstructorDescriptor.constructedClass");
        return a0;
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11297a
    public AbstractC7267g0 getReturnType() {
        AbstractC7267g0 returnType = super.getReturnType();
        C9971q.m14636d(returnType);
        return returnType;
    }

    /* renamed from: k1 */
    public AbstractC12611i0 mo6265K0(AbstractC11346m newOwner, EnumC11314e0 modality, AbstractC11387u visibility, AbstractC11301b.EnumC11302a kind, boolean z) {
        C9971q.m14633g(newOwner, "newOwner");
        C9971q.m14633g(modality, "modality");
        C9971q.m14633g(visibility, "visibility");
        C9971q.m14633g(kind, "kind");
        AbstractC11397y build = mo6238u().mo6194s(newOwner).mo6209d(modality).mo6203j(visibility).mo6196q(kind).mo6201l(z).build();
        C9971q.m14635e(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (AbstractC12611i0) build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public C12613j0 mo71L0(AbstractC11346m newOwner, AbstractC11397y yVar, AbstractC11301b.EnumC11302a kind, C11142f fVar, AbstractC11672g annotations, AbstractC11299a1 source) {
        C9971q.m14633g(newOwner, "newOwner");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(source, "source");
        AbstractC11301b.EnumC11302a aVar = AbstractC11301b.EnumC11302a.DECLARATION;
        if (kind != aVar) {
            AbstractC11301b.EnumC11302a aVar2 = AbstractC11301b.EnumC11302a.SYNTHESIZED;
        }
        return new C12613j0(this.f39323O, m6343o1(), mo6350P(), this, annotations, aVar, source);
    }

    /* renamed from: m1 */
    public AbstractC11316e1 mo6104b() {
        return m6343o1();
    }

    /* renamed from: n1 */
    public AbstractC12611i0 mo6162a() {
        AbstractC11397y a = super.mo6162a();
        C9971q.m14635e(a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (AbstractC12611i0) a;
    }

    /* renamed from: o1 */
    public AbstractC11316e1 m6343o1() {
        return this.f39324P;
    }

    /* renamed from: p1 */
    public AbstractC12611i0 mo6167c(C7309p1 substitutor) {
        C9971q.m14633g(substitutor, "substitutor");
        AbstractC11397y c = super.mo6167c(substitutor);
        C9971q.m14635e(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C12613j0 j0Var = (C12613j0) c;
        C7309p1 f = C7309p1.m22980f(j0Var.getReturnType());
        C9971q.m14634f(f, "create(substitutedTypeAliasConstructor.returnType)");
        AbstractC11309d c2 = mo6350P().mo6162a().mo6167c(f);
        if (c2 == null) {
            return null;
        }
        j0Var.f39326R = c2;
        return j0Var;
    }
}
