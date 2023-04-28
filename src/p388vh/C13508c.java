package p388vh;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import gi.AbstractC7664g;
import gi.AbstractC7694x;
import gi.C7666h;
import gi.C7679p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import p217lg.AbstractC10420h;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11142f;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11329h1;
import p268og.AbstractC11330i;
import p268og.AbstractC11335j1;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.AbstractC11386t0;
import p268og.AbstractC11388u0;
import p268og.C11403z;
import p286pi.C11755b;
import p306qi.C12193m;
import p306qi.C12200o;
import p325rh.C12661e;
import p406wg.AbstractC13878b;
import p448yh.AbstractC14411h;
import pg.AbstractC11666c;

/* renamed from: vh.c */
/* loaded from: classes8.dex */
public final class C13508c {

    /* renamed from: a */
    private static final C11142f f30189a;

    /* renamed from: vh.c$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C13509a extends C9965m implements Function1<AbstractC11335j1, Boolean> {

        /* renamed from: k */
        public static final C13509a f30190k = new C13509a();

        C13509a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(AbstractC11335j1.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        /* renamed from: i */
        public final Boolean invoke(AbstractC11335j1 p0) {
            C9971q.m14633g(p0, "p0");
            return Boolean.valueOf(p0.mo6303y0());
        }
    }

    /* renamed from: vh.c$b */
    /* loaded from: classes8.dex */
    public static final class C13510b extends C11755b.AbstractC0376b<AbstractC11301b, AbstractC11301b> {

        /* renamed from: a */
        final /* synthetic */ Ref$ObjectRef<AbstractC11301b> f30191a;

        /* renamed from: b */
        final /* synthetic */ Function1<AbstractC11301b, Boolean> f30192b;

        /* JADX WARN: Multi-variable type inference failed */
        C13510b(Ref$ObjectRef<AbstractC11301b> ref$ObjectRef, Function1<? super AbstractC11301b, Boolean> function1) {
            this.f30191a = ref$ObjectRef;
            this.f30192b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public void mo3516b(AbstractC11301b current) {
            C9971q.m14633g(current, "current");
            if (this.f30191a.f22069k == null && this.f30192b.invoke(current).booleanValue()) {
                this.f30191a.f22069k = current;
            }
        }

        /* renamed from: e */
        public boolean mo3515c(AbstractC11301b current) {
            C9971q.m14633g(current, "current");
            if (this.f30191a.f22069k == null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public AbstractC11301b mo3517a() {
            return this.f30191a.f22069k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vh.c$c */
    /* loaded from: classes8.dex */
    public static final class C0444c extends AbstractC9973s implements Function1<AbstractC11346m, AbstractC11346m> {

        /* renamed from: k */
        public static final C0444c f30193k = new C0444c();

        C0444c() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11346m invoke(AbstractC11346m it) {
            C9971q.m14633g(it, "it");
            return it.mo6104b();
        }
    }

    static {
        C11142f f = C11142f.m10767f("value");
        C9971q.m14634f(f, "identifier(\"value\")");
        f30189a = f;
    }

    /* renamed from: c */
    public static final boolean m3538c(AbstractC11335j1 j1Var) {
        List d;
        C9971q.m14633g(j1Var, "<this>");
        d = C9905i.m14825d(j1Var);
        Boolean e = C11755b.m8678e(d, C13506a.f30187a, C13509a.f30190k);
        C9971q.m14634f(e, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Iterable m3537d(AbstractC11335j1 j1Var) {
        int t;
        Collection<AbstractC11335j1> d = j1Var.mo6249d();
        t = C9907k.m14809t(d, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11335j1 j1Var2 : d) {
            arrayList.add(j1Var2.mo6162a());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final AbstractC11301b m3536e(AbstractC11301b bVar, boolean z, Function1<? super AbstractC11301b, Boolean> predicate) {
        List d;
        C9971q.m14633g(bVar, "<this>");
        C9971q.m14633g(predicate, "predicate");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        d = C9905i.m14825d(bVar);
        return (AbstractC11301b) C11755b.m8681b(d, new C13507b(z), new C13510b(ref$ObjectRef, predicate));
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC11301b m3535f(AbstractC11301b bVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m3536e(bVar, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final Iterable m3534g(boolean z, AbstractC11301b bVar) {
        List i;
        Collection<? extends AbstractC11301b> collection = null;
        if (z) {
            if (bVar != null) {
                bVar = bVar.mo6162a();
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            collection = bVar.mo6249d();
        }
        if (collection != null) {
            return collection;
        }
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: h */
    public static final C11137c m3533h(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        C11138d m = m3528m(mVar);
        if (!m.m10788f()) {
            m = null;
        }
        if (m != null) {
            return m.m10782l();
        }
        return null;
    }

    /* renamed from: i */
    public static final AbstractC11313e m3532i(AbstractC11666c cVar) {
        C9971q.m14633g(cVar, "<this>");
        AbstractC11326h p = cVar.getType().mo5172N0().mo4565p();
        if (p instanceof AbstractC11313e) {
            return (AbstractC11313e) p;
        }
        return null;
    }

    /* renamed from: j */
    public static final AbstractC10420h m3531j(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        return m3525p(mVar).mo6136n();
    }

    /* renamed from: k */
    public static final C11136b m3530k(AbstractC11326h hVar) {
        AbstractC11346m b;
        C11136b k;
        if (hVar == null || (b = hVar.mo6104b()) == null) {
            return null;
        }
        if (b instanceof AbstractC11344l0) {
            return new C11136b(((AbstractC11344l0) b).mo6103e(), hVar.getName());
        }
        if (!(b instanceof AbstractC11330i) || (k = m3530k((AbstractC11326h) b)) == null) {
            return null;
        }
        return k.m10814d(hVar.getName());
    }

    /* renamed from: l */
    public static final C11137c m3529l(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        C11137c n = C12661e.m6040n(mVar);
        C9971q.m14634f(n, "getFqNameSafe(this)");
        return n;
    }

    /* renamed from: m */
    public static final C11138d m3528m(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        C11138d m = C12661e.m6041m(mVar);
        C9971q.m14634f(m, "getFqName(this)");
        return m;
    }

    /* renamed from: n */
    public static final C11403z<AbstractC7304o0> m3527n(AbstractC11313e eVar) {
        AbstractC11329h1<AbstractC7304o0> S = eVar != null ? eVar.mo6121S() : null;
        if (S instanceof C11403z) {
            return (C11403z) S;
        }
        return null;
    }

    /* renamed from: o */
    public static final AbstractC7664g m3526o(AbstractC11327h0 h0Var) {
        AbstractC7694x xVar;
        C9971q.m14633g(h0Var, "<this>");
        C7679p pVar = (C7679p) h0Var.mo6133v0(C7666h.m21692a());
        if (pVar != null) {
            xVar = (AbstractC7694x) pVar.m21666a();
        } else {
            xVar = null;
        }
        if (xVar instanceof AbstractC7694x.C7695a) {
            return ((AbstractC7694x.C7695a) xVar).m21644b();
        }
        return AbstractC7664g.C7665a.f16661a;
    }

    /* renamed from: p */
    public static final AbstractC11327h0 m3525p(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        AbstractC11327h0 g = C12661e.m6047g(mVar);
        C9971q.m14634f(g, "getContainingModule(this)");
        return g;
    }

    /* renamed from: q */
    public static final Sequence<AbstractC11346m> m3524q(AbstractC11346m mVar) {
        Sequence<AbstractC11346m> o;
        C9971q.m14633g(mVar, "<this>");
        o = C12200o.m7430o(m3523r(mVar), 1);
        return o;
    }

    /* renamed from: r */
    public static final Sequence<AbstractC11346m> m3523r(AbstractC11346m mVar) {
        Sequence<AbstractC11346m> h;
        C9971q.m14633g(mVar, "<this>");
        h = C12193m.m7445h(mVar, C0444c.f30193k);
        return h;
    }

    /* renamed from: s */
    public static final AbstractC11301b m3522s(AbstractC11301b bVar) {
        C9971q.m14633g(bVar, "<this>");
        if (!(bVar instanceof AbstractC11386t0)) {
            return bVar;
        }
        AbstractC11388u0 correspondingProperty = ((AbstractC11386t0) bVar).mo6459T();
        C9971q.m14634f(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }

    /* renamed from: t */
    public static final AbstractC11313e m3521t(AbstractC11313e eVar) {
        C9971q.m14633g(eVar, "<this>");
        for (AbstractC7267g0 g0Var : eVar.mo6166p().mo5172N0().mo4568m()) {
            if (!AbstractC10420h.m13399b0(g0Var)) {
                AbstractC11326h p = g0Var.mo5172N0().mo4565p();
                if (C12661e.m6031w(p)) {
                    C9971q.m14635e(p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (AbstractC11313e) p;
                }
            }
        }
        return null;
    }

    /* renamed from: u */
    public static final boolean m3520u(AbstractC11327h0 h0Var) {
        AbstractC7694x xVar;
        C9971q.m14633g(h0Var, "<this>");
        C7679p pVar = (C7679p) h0Var.mo6133v0(C7666h.m21692a());
        if (pVar == null || (xVar = (AbstractC7694x) pVar.m21666a()) == null || !xVar.m21645a()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static final AbstractC11313e m3519v(AbstractC11327h0 h0Var, C11137c topLevelClassFqName, AbstractC13878b location) {
        C9971q.m14633g(h0Var, "<this>");
        C9971q.m14633g(topLevelClassFqName, "topLevelClassFqName");
        C9971q.m14633g(location, "location");
        topLevelClassFqName.m10801d();
        C11137c e = topLevelClassFqName.m10800e();
        C9971q.m14634f(e, "topLevelClassFqName.parent()");
        AbstractC14411h o = h0Var.mo6135n0(e).mo6180o();
        C11142f g = topLevelClassFqName.m10798g();
        C9971q.m14634f(g, "topLevelClassFqName.shortName()");
        AbstractC11326h e2 = o.mo636e(g, location);
        if (e2 instanceof AbstractC11313e) {
            return (AbstractC11313e) e2;
        }
        return null;
    }
}
