package p325rh;

import fi.AbstractC7268g1;
import gi.AbstractC7664g;
import java.util.Collection;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11310d0;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p325rh.C12669k;

/* renamed from: rh.c */
/* loaded from: classes8.dex */
public final class C12656c {

    /* renamed from: a */
    public static final C12656c f28488a = new C12656c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.c$a */
    /* loaded from: classes8.dex */
    public static final class C12657a extends AbstractC9973s implements Function2<AbstractC11346m, AbstractC11346m, Boolean> {

        /* renamed from: k */
        public static final C12657a f28489k = new C12657a();

        C12657a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11346m mVar, AbstractC11346m mVar2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.c$b */
    /* loaded from: classes8.dex */
    public static final class C12658b extends AbstractC9973s implements Function2<AbstractC11346m, AbstractC11346m, Boolean> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11297a f28490k;

        /* renamed from: l */
        final /* synthetic */ AbstractC11297a f28491l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12658b(AbstractC11297a aVar, AbstractC11297a aVar2) {
            super(2);
            this.f28490k = aVar;
            this.f28491l = aVar2;
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11346m mVar, AbstractC11346m mVar2) {
            return Boolean.valueOf(C9971q.m14638b(mVar, this.f28490k) && C9971q.m14638b(mVar2, this.f28491l));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.c$c */
    /* loaded from: classes8.dex */
    public static final class C0406c extends AbstractC9973s implements Function2<AbstractC11346m, AbstractC11346m, Boolean> {

        /* renamed from: k */
        public static final C0406c f28492k = new C0406c();

        C0406c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11346m mVar, AbstractC11346m mVar2) {
            return Boolean.FALSE;
        }
    }

    private C12656c() {
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m6097c(C12656c cVar, AbstractC11297a aVar, AbstractC11297a aVar2, boolean z, boolean z2, boolean z3, AbstractC7664g gVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        return cVar.m6098b(aVar, aVar2, z, z2, z3, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m6096d(boolean z, AbstractC11297a a, AbstractC11297a b, AbstractC7268g1 c1, AbstractC7268g1 c2) {
        C9971q.m14633g(a, "$a");
        C9971q.m14633g(b, "$b");
        C9971q.m14633g(c1, "c1");
        C9971q.m14633g(c2, "c2");
        if (C9971q.m14638b(c1, c2)) {
            return true;
        }
        AbstractC11326h p = c1.mo4565p();
        AbstractC11326h p2 = c2.mo4565p();
        if (!(p instanceof AbstractC11319f1) || !(p2 instanceof AbstractC11319f1)) {
            return false;
        }
        return f28488a.m6091i((AbstractC11319f1) p, (AbstractC11319f1) p2, z, new C12658b(a, b));
    }

    /* renamed from: e */
    private final boolean m6095e(AbstractC11313e eVar, AbstractC11313e eVar2) {
        return C9971q.m14638b(eVar.mo6111k(), eVar2.mo6111k());
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m6093g(C12656c cVar, AbstractC11346m mVar, AbstractC11346m mVar2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return cVar.m6094f(mVar, mVar2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static /* synthetic */ boolean m6090j(C12656c cVar, AbstractC11319f1 f1Var, AbstractC11319f1 f1Var2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = C0406c.f28492k;
        }
        return cVar.m6091i(f1Var, f1Var2, z, function2);
    }

    /* renamed from: k */
    private final boolean m6089k(AbstractC11346m mVar, AbstractC11346m mVar2, Function2<? super AbstractC11346m, ? super AbstractC11346m, Boolean> function2, boolean z) {
        AbstractC11346m b = mVar.mo6104b();
        AbstractC11346m b2 = mVar2.mo6104b();
        if ((b instanceof AbstractC11301b) || (b2 instanceof AbstractC11301b)) {
            return function2.invoke(b, b2).booleanValue();
        }
        return m6093g(this, b, b2, z, false, 8, null);
    }

    /* renamed from: l */
    private final AbstractC11299a1 m6088l(AbstractC11297a aVar) {
        Object s0;
        while (aVar instanceof AbstractC11301b) {
            AbstractC11301b bVar = (AbstractC11301b) aVar;
            if (bVar.mo6245g() != AbstractC11301b.EnumC11302a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends AbstractC11301b> overriddenDescriptors = bVar.mo6249d();
            C9971q.m14634f(overriddenDescriptors, "overriddenDescriptors");
            s0 = C9914r.m14746s0(overriddenDescriptors);
            aVar = (AbstractC11301b) s0;
            if (aVar == null) {
                return null;
            }
        }
        return aVar.mo6102j();
    }

    /* renamed from: b */
    public final boolean m6098b(AbstractC11297a a, AbstractC11297a b, boolean z, boolean z2, boolean z3, AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(a, "a");
        C9971q.m14633g(b, "b");
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (C9971q.m14638b(a, b)) {
            return true;
        }
        if (!C9971q.m14638b(a.getName(), b.getName())) {
            return false;
        }
        if (z2 && (a instanceof AbstractC11310d0) && (b instanceof AbstractC11310d0) && ((AbstractC11310d0) a).mo6114h0() != ((AbstractC11310d0) b).mo6114h0()) {
            return false;
        }
        if ((C9971q.m14638b(a.mo6104b(), b.mo6104b()) && (!z || !C9971q.m14638b(m6088l(a), m6088l(b)))) || C12661e.m6062E(a) || C12661e.m6062E(b) || !m6089k(a, b, C12657a.f28489k, z)) {
            return false;
        }
        C12669k i = C12669k.m5997i(kotlinTypeRefiner, new C12655b(z, a, b));
        C9971q.m14634f(i, "create(kotlinTypeRefiner…= a && y == b }\n        }");
        C12669k.C12678i.EnumC12679a c = i.m6013E(a, b, null, !z3).m5969c();
        C12669k.C12678i.EnumC12679a aVar = C12669k.C12678i.EnumC12679a.OVERRIDABLE;
        if (c == aVar && i.m6013E(b, a, null, !z3).m5969c() == aVar) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m6094f(AbstractC11346m mVar, AbstractC11346m mVar2, boolean z, boolean z2) {
        if ((mVar instanceof AbstractC11313e) && (mVar2 instanceof AbstractC11313e)) {
            return m6095e((AbstractC11313e) mVar, (AbstractC11313e) mVar2);
        }
        if ((mVar instanceof AbstractC11319f1) && (mVar2 instanceof AbstractC11319f1)) {
            return m6090j(this, (AbstractC11319f1) mVar, (AbstractC11319f1) mVar2, z, null, 8, null);
        }
        if ((mVar instanceof AbstractC11297a) && (mVar2 instanceof AbstractC11297a)) {
            return m6097c(this, (AbstractC11297a) mVar, (AbstractC11297a) mVar2, z, z2, false, AbstractC7664g.C7665a.f16661a, 16, null);
        }
        if (!(mVar instanceof AbstractC11344l0) || !(mVar2 instanceof AbstractC11344l0)) {
            return C9971q.m14638b(mVar, mVar2);
        }
        return C9971q.m14638b(((AbstractC11344l0) mVar).mo6103e(), ((AbstractC11344l0) mVar2).mo6103e());
    }

    /* renamed from: h */
    public final boolean m6092h(AbstractC11319f1 a, AbstractC11319f1 b, boolean z) {
        C9971q.m14633g(a, "a");
        C9971q.m14633g(b, "b");
        return m6090j(this, a, b, z, null, 8, null);
    }

    /* renamed from: i */
    public final boolean m6091i(AbstractC11319f1 a, AbstractC11319f1 b, boolean z, Function2<? super AbstractC11346m, ? super AbstractC11346m, Boolean> equivalentCallables) {
        C9971q.m14633g(a, "a");
        C9971q.m14633g(b, "b");
        C9971q.m14633g(equivalentCallables, "equivalentCallables");
        if (C9971q.m14638b(a, b)) {
            return true;
        }
        if (!C9971q.m14638b(a.mo6104b(), b.mo6104b()) && m6089k(a, b, equivalentCallables, z) && a.getIndex() == b.getIndex()) {
            return true;
        }
        return false;
    }
}
