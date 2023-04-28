package ch;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import fi.AbstractC7299n1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7235d0;
import fi.C7270h0;
import fi.C7278i0;
import fi.C7283j1;
import fi.C7296m1;
import fi.C7339x;
import fi.EnumC7319r1;
import fi.EnumC7338w1;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9905i;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11098x;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p217lg.AbstractC10420h;
import p249nh.C11136b;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p388vh.C13508c;
import p448yh.AbstractC14411h;

/* renamed from: ch.g */
/* loaded from: classes8.dex */
public final class C4013g extends AbstractC7299n1 {

    /* renamed from: e */
    public static final C4014a f6599e = new C4014a(null);

    /* renamed from: f */
    private static final C4005a f6600f;

    /* renamed from: g */
    private static final C4005a f6601g;

    /* renamed from: c */
    private final C4011f f6602c;

    /* renamed from: d */
    private final C7283j1 f6603d;

    /* renamed from: ch.g$a */
    /* loaded from: classes8.dex */
    public static final class C4014a {
        private C4014a() {
        }

        public /* synthetic */ C4014a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.g$b */
    /* loaded from: classes8.dex */
    public static final class C4015b extends AbstractC9973s implements Function1<AbstractC7664g, AbstractC7304o0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11313e f6604k;

        /* renamed from: l */
        final /* synthetic */ C4013g f6605l;

        /* renamed from: m */
        final /* synthetic */ AbstractC7304o0 f6606m;

        /* renamed from: n */
        final /* synthetic */ C4005a f6607n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4015b(AbstractC11313e eVar, C4013g gVar, AbstractC7304o0 o0Var, C4005a aVar) {
            super(1);
            this.f6604k = eVar;
            this.f6605l = gVar;
            this.f6606m = o0Var;
            this.f6607n = aVar;
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke(AbstractC7664g kotlinTypeRefiner) {
            C11136b k;
            AbstractC11313e b;
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            AbstractC11313e eVar = this.f6604k;
            if (!(eVar instanceof AbstractC11313e)) {
                eVar = null;
            }
            if (eVar == null || (k = C13508c.m3530k(eVar)) == null || (b = kotlinTypeRefiner.mo21700b(k)) == null || C9971q.m14638b(b, this.f6604k)) {
                return null;
            }
            return (AbstractC7304o0) this.f6605l.m33088j(this.f6606m, b, this.f6607n).m15065c();
        }
    }

    static {
        EnumC7319r1 r1Var = EnumC7319r1.COMMON;
        f6600f = C4006b.m33109b(r1Var, false, true, null, 5, null).m33112l(EnumC4007c.FLEXIBLE_LOWER_BOUND);
        f6601g = C4006b.m33109b(r1Var, false, true, null, 5, null).m33112l(EnumC4007c.FLEXIBLE_UPPER_BOUND);
    }

    public C4013g(C7283j1 j1Var) {
        C4011f fVar = new C4011f();
        this.f6602c = fVar;
        this.f6603d = j1Var == null ? new C7283j1(fVar, null, 2, null) : j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final Pair<AbstractC7304o0, Boolean> m33088j(AbstractC7304o0 o0Var, AbstractC11313e eVar, C4005a aVar) {
        int t;
        List d;
        if (o0Var.mo5172N0().getParameters().isEmpty()) {
            return C11098x.m10921a(o0Var, Boolean.FALSE);
        }
        if (AbstractC10420h.m13397c0(o0Var)) {
            AbstractC7290k1 k1Var = o0Var.mo5174L0().get(0);
            EnumC7338w1 b = k1Var.mo22906b();
            AbstractC7267g0 type = k1Var.getType();
            C9971q.m14634f(type, "componentTypeProjection.type");
            d = C9905i.m14825d(new C7296m1(b, m33087k(type, aVar)));
            return C11098x.m10921a(C7270h0.m23050j(o0Var.mo5173M0(), o0Var.mo5172N0(), d, o0Var.mo5171O0(), null, 16, null), Boolean.FALSE);
        } else if (C7278i0.m23035a(o0Var)) {
            return C11098x.m10921a(C8039k.m20774d(EnumC8038j.ERROR_RAW_TYPE, o0Var.mo5172N0().toString()), Boolean.FALSE);
        } else {
            AbstractC14411h G = eVar.mo6176G(this);
            C9971q.m14634f(G, "declaration.getMemberScope(this)");
            C7232c1 M0 = o0Var.mo5173M0();
            AbstractC7268g1 k = eVar.mo6111k();
            C9971q.m14634f(k, "declaration.typeConstructor");
            List<AbstractC11319f1> parameters = eVar.mo6111k().getParameters();
            C9971q.m14634f(parameters, "declaration.typeConstructor.parameters");
            t = C9907k.m14809t(parameters, 10);
            ArrayList arrayList = new ArrayList(t);
            for (AbstractC11319f1 parameter : parameters) {
                C4011f fVar = this.f6602c;
                C9971q.m14634f(parameter, "parameter");
                arrayList.add(C7339x.m22884b(fVar, parameter, aVar, this.f6603d, null, 8, null));
            }
            return C11098x.m10921a(C7270h0.m23048l(M0, k, arrayList, o0Var.mo5171O0(), G, new C4015b(eVar, this, o0Var, aVar)), Boolean.TRUE);
        }
    }

    /* renamed from: k */
    private final AbstractC7267g0 m33087k(AbstractC7267g0 g0Var, C4005a aVar) {
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p instanceof AbstractC11319f1) {
            return m33087k(this.f6603d.m23020c((AbstractC11319f1) p, aVar.m33114j(true)), aVar);
        }
        if (p instanceof AbstractC11313e) {
            AbstractC11326h p2 = C7235d0.m23142d(g0Var).mo5172N0().mo4565p();
            if (p2 instanceof AbstractC11313e) {
                Pair<AbstractC7304o0, Boolean> j = m33088j(C7235d0.m23143c(g0Var), (AbstractC11313e) p, f6600f);
                AbstractC7304o0 a = j.m15067a();
                boolean booleanValue = j.m15066b().booleanValue();
                Pair<AbstractC7304o0, Boolean> j2 = m33088j(C7235d0.m23142d(g0Var), (AbstractC11313e) p2, f6601g);
                AbstractC7304o0 a2 = j2.m15067a();
                boolean booleanValue2 = j2.m15066b().booleanValue();
                if (booleanValue || booleanValue2) {
                    return new C4016h(a, a2);
                }
                return C7270h0.m23056d(a, a2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + p2 + "\" while for lower it's \"" + p + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + p).toString());
    }

    /* renamed from: l */
    static /* synthetic */ AbstractC7267g0 m33086l(C4013g gVar, AbstractC7267g0 g0Var, C4005a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = new C4005a(EnumC7319r1.COMMON, null, false, false, null, null, 62, null);
        }
        return gVar.m33087k(g0Var, aVar);
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: f */
    public boolean mo22911f() {
        return false;
    }

    /* renamed from: m */
    public C7296m1 mo5147e(AbstractC7267g0 key) {
        C9971q.m14633g(key, "key");
        return new C7296m1(m33086l(this, key, null, 2, null));
    }

    public /* synthetic */ C4013g(C7283j1 j1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : j1Var);
    }
}
