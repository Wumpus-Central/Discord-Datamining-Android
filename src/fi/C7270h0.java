package fi;

import fi.AbstractC7347z0;
import gi.AbstractC7664g;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p142hi.C8039k;
import p142hi.EnumC8035g;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p324rg.C12646u;
import p388vh.C13508c;
import p448yh.AbstractC14411h;
import th.C13115n;

/* renamed from: fi.h0 */
/* loaded from: classes8.dex */
public final class C7270h0 {

    /* renamed from: a */
    public static final C7270h0 f15735a = new C7270h0();

    /* renamed from: b */
    private static final Function1<AbstractC7664g, AbstractC7304o0> f15736b = C7271a.f15737k;

    /* renamed from: fi.h0$a */
    /* loaded from: classes8.dex */
    static final class C7271a extends AbstractC9973s implements Function1 {

        /* renamed from: k */
        public static final C7271a f15737k = new C7271a();

        C7271a() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(AbstractC7664g gVar) {
            C9971q.m14633g(gVar, "<anonymous parameter 0>");
            return null;
        }
    }

    /* renamed from: fi.h0$b */
    /* loaded from: classes8.dex */
    public static final class C7272b {

        /* renamed from: a */
        private final AbstractC7304o0 f15738a;

        /* renamed from: b */
        private final AbstractC7268g1 f15739b;

        public C7272b(AbstractC7304o0 o0Var, AbstractC7268g1 g1Var) {
            this.f15738a = o0Var;
            this.f15739b = g1Var;
        }

        /* renamed from: a */
        public final AbstractC7304o0 m23046a() {
            return this.f15738a;
        }

        /* renamed from: b */
        public final AbstractC7268g1 m23045b() {
            return this.f15739b;
        }
    }

    /* renamed from: fi.h0$c */
    /* loaded from: classes8.dex */
    public static final class C7273c extends AbstractC9973s implements Function1<AbstractC7664g, AbstractC7304o0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7268g1 f15740k;

        /* renamed from: l */
        final /* synthetic */ List<AbstractC7290k1> f15741l;

        /* renamed from: m */
        final /* synthetic */ C7232c1 f15742m;

        /* renamed from: n */
        final /* synthetic */ boolean f15743n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7273c(AbstractC7268g1 g1Var, List<? extends AbstractC7290k1> list, C7232c1 c1Var, boolean z) {
            super(1);
            this.f15740k = g1Var;
            this.f15741l = list;
            this.f15742m = c1Var;
            this.f15743n = z;
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke(AbstractC7664g refiner) {
            C9971q.m14633g(refiner, "refiner");
            C7272b f = C7270h0.f15735a.m23054f(this.f15740k, refiner, this.f15741l);
            if (f == null) {
                return null;
            }
            AbstractC7304o0 a = f.m23046a();
            if (a != null) {
                return a;
            }
            C7232c1 c1Var = this.f15742m;
            AbstractC7268g1 b = f.m23045b();
            C9971q.m14636d(b);
            return C7270h0.m23051i(c1Var, b, this.f15741l, this.f15743n, refiner);
        }
    }

    /* renamed from: fi.h0$d */
    /* loaded from: classes8.dex */
    public static final class C7274d extends AbstractC9973s implements Function1<AbstractC7664g, AbstractC7304o0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7268g1 f15744k;

        /* renamed from: l */
        final /* synthetic */ List<AbstractC7290k1> f15745l;

        /* renamed from: m */
        final /* synthetic */ C7232c1 f15746m;

        /* renamed from: n */
        final /* synthetic */ boolean f15747n;

        /* renamed from: o */
        final /* synthetic */ AbstractC14411h f15748o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7274d(AbstractC7268g1 g1Var, List<? extends AbstractC7290k1> list, C7232c1 c1Var, boolean z, AbstractC14411h hVar) {
            super(1);
            this.f15744k = g1Var;
            this.f15745l = list;
            this.f15746m = c1Var;
            this.f15747n = z;
            this.f15748o = hVar;
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke(AbstractC7664g kotlinTypeRefiner) {
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            C7272b f = C7270h0.f15735a.m23054f(this.f15744k, kotlinTypeRefiner, this.f15745l);
            if (f == null) {
                return null;
            }
            AbstractC7304o0 a = f.m23046a();
            if (a != null) {
                return a;
            }
            C7232c1 c1Var = this.f15746m;
            AbstractC7268g1 b = f.m23045b();
            C9971q.m14636d(b);
            return C7270h0.m23049k(c1Var, b, this.f15745l, this.f15747n, this.f15748o);
        }
    }

    private C7270h0() {
    }

    /* renamed from: b */
    public static final AbstractC7304o0 m23058b(AbstractC11316e1 e1Var, List<? extends AbstractC7290k1> arguments) {
        C9971q.m14633g(e1Var, "<this>");
        C9971q.m14633g(arguments, "arguments");
        return new C7340x0(AbstractC7347z0.C7348a.f15841a, false).m22875i(C7344y0.f15836e.m22857a(null, e1Var, arguments), C7232c1.f15671l.m23149h());
    }

    /* renamed from: c */
    private final AbstractC14411h m23057c(AbstractC7268g1 g1Var, List<? extends AbstractC7290k1> list, AbstractC7664g gVar) {
        AbstractC11326h p = g1Var.mo4565p();
        if (p instanceof AbstractC11319f1) {
            return ((AbstractC11319f1) p).mo6166p().mo5161o();
        }
        if (p instanceof AbstractC11313e) {
            if (gVar == null) {
                gVar = C13508c.m3526o(C13508c.m3525p(p));
            }
            if (list.isEmpty()) {
                return C12646u.m6158b((AbstractC11313e) p, gVar);
            }
            return C12646u.m6159a((AbstractC11313e) p, AbstractC7275h1.f15749c.m23039b(g1Var, list), gVar);
        } else if (p instanceof AbstractC11316e1) {
            EnumC8035g gVar2 = EnumC8035g.SCOPE_FOR_ABBREVIATION_TYPE;
            String fVar = ((AbstractC11316e1) p).getName().toString();
            C9971q.m14634f(fVar, "descriptor.name.toString()");
            return C8039k.m20777a(gVar2, true, fVar);
        } else if (g1Var instanceof C7245f0) {
            return ((C7245f0) g1Var).m23109c();
        } else {
            throw new IllegalStateException("Unsupported classifier: " + p + " for constructor: " + g1Var);
        }
    }

    /* renamed from: d */
    public static final AbstractC7335v1 m23056d(AbstractC7304o0 lowerBound, AbstractC7304o0 upperBound) {
        C9971q.m14633g(lowerBound, "lowerBound");
        C9971q.m14633g(upperBound, "upperBound");
        if (C9971q.m14638b(lowerBound, upperBound)) {
            return lowerBound;
        }
        return new C7226b0(lowerBound, upperBound);
    }

    /* renamed from: e */
    public static final AbstractC7304o0 m23055e(C7232c1 attributes, C13115n constructor, boolean z) {
        List i;
        C9971q.m14633g(attributes, "attributes");
        C9971q.m14633g(constructor, "constructor");
        i = C9906j.m14820i();
        return m23049k(attributes, constructor, i, z, C8039k.m20777a(EnumC8035g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* renamed from: f */
    public final C7272b m23054f(AbstractC7268g1 g1Var, AbstractC7664g gVar, List<? extends AbstractC7290k1> list) {
        AbstractC11326h f;
        AbstractC11326h p = g1Var.mo4565p();
        if (p == null || (f = gVar.mo21696f(p)) == null) {
            return null;
        }
        if (f instanceof AbstractC11316e1) {
            return new C7272b(m23058b((AbstractC11316e1) f, list), null);
        }
        AbstractC7268g1 o = f.mo6111k().mo4566o(gVar);
        C9971q.m14634f(o, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new C7272b(null, o);
    }

    /* renamed from: g */
    public static final AbstractC7304o0 m23053g(C7232c1 attributes, AbstractC11313e descriptor, List<? extends AbstractC7290k1> arguments) {
        C9971q.m14633g(attributes, "attributes");
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(arguments, "arguments");
        AbstractC7268g1 k = descriptor.mo6111k();
        C9971q.m14634f(k, "descriptor.typeConstructor");
        return m23050j(attributes, k, arguments, false, null, 16, null);
    }

    /* renamed from: h */
    public static final AbstractC7304o0 m23052h(C7232c1 attributes, AbstractC7268g1 constructor, List<? extends AbstractC7290k1> arguments, boolean z) {
        C9971q.m14633g(attributes, "attributes");
        C9971q.m14633g(constructor, "constructor");
        C9971q.m14633g(arguments, "arguments");
        return m23050j(attributes, constructor, arguments, z, null, 16, null);
    }

    /* renamed from: i */
    public static final AbstractC7304o0 m23051i(C7232c1 attributes, AbstractC7268g1 constructor, List<? extends AbstractC7290k1> arguments, boolean z, AbstractC7664g gVar) {
        C9971q.m14633g(attributes, "attributes");
        C9971q.m14633g(constructor, "constructor");
        C9971q.m14633g(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z || constructor.mo4565p() == null) {
            return m23048l(attributes, constructor, arguments, z, f15735a.m23057c(constructor, arguments, gVar), new C7273c(constructor, arguments, attributes, z));
        }
        AbstractC11326h p = constructor.mo4565p();
        C9971q.m14636d(p);
        AbstractC7304o0 p2 = p.mo6166p();
        C9971q.m14634f(p2, "constructor.declarationDescriptor!!.defaultType");
        return p2;
    }

    /* renamed from: j */
    public static /* synthetic */ AbstractC7304o0 m23050j(C7232c1 c1Var, AbstractC7268g1 g1Var, List list, boolean z, AbstractC7664g gVar, int i, Object obj) {
        if ((i & 16) != 0) {
            gVar = null;
        }
        return m23051i(c1Var, g1Var, list, z, gVar);
    }

    /* renamed from: k */
    public static final AbstractC7304o0 m23049k(C7232c1 attributes, AbstractC7268g1 constructor, List<? extends AbstractC7290k1> arguments, boolean z, AbstractC14411h memberScope) {
        C9971q.m14633g(attributes, "attributes");
        C9971q.m14633g(constructor, "constructor");
        C9971q.m14633g(arguments, "arguments");
        C9971q.m14633g(memberScope, "memberScope");
        C7308p0 p0Var = new C7308p0(constructor, arguments, z, memberScope, new C7274d(constructor, arguments, attributes, z, memberScope));
        if (attributes.isEmpty()) {
            return p0Var;
        }
        return new C7315q0(p0Var, attributes);
    }

    /* renamed from: l */
    public static final AbstractC7304o0 m23048l(C7232c1 attributes, AbstractC7268g1 constructor, List<? extends AbstractC7290k1> arguments, boolean z, AbstractC14411h memberScope, Function1<? super AbstractC7664g, ? extends AbstractC7304o0> refinedTypeFactory) {
        C9971q.m14633g(attributes, "attributes");
        C9971q.m14633g(constructor, "constructor");
        C9971q.m14633g(arguments, "arguments");
        C9971q.m14633g(memberScope, "memberScope");
        C9971q.m14633g(refinedTypeFactory, "refinedTypeFactory");
        C7308p0 p0Var = new C7308p0(constructor, arguments, z, memberScope, refinedTypeFactory);
        if (attributes.isEmpty()) {
            return p0Var;
        }
        return new C7315q0(p0Var, attributes);
    }
}
