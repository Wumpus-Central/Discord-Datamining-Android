package p325rh;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.C7250f1;
import gi.AbstractC7655b;
import gi.AbstractC7659e;
import gi.AbstractC7661f;
import gi.AbstractC7664g;
import gi.C7654a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9612c;
import p182ji.AbstractC9613d;
import p182ji.AbstractC9614e;
import p182ji.AbstractC9615f;
import p182ji.AbstractC9616g;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9619j;
import p182ji.AbstractC9620k;
import p182ji.AbstractC9621l;
import p182ji.AbstractC9622m;
import p182ji.AbstractC9623n;
import p182ji.AbstractC9624o;
import p182ji.AbstractC9630t;
import p182ji.C9610a;
import p182ji.EnumC9611b;
import p182ji.EnumC9631u;
import p217lg.EnumC10426i;
import p249nh.C11137c;
import p249nh.C11138d;

/* renamed from: rh.l */
/* loaded from: classes8.dex */
public final class C12680l implements AbstractC7655b {

    /* renamed from: a */
    private final Map<AbstractC7268g1, AbstractC7268g1> f28527a;

    /* renamed from: b */
    private final AbstractC7659e.AbstractC7660a f28528b;

    /* renamed from: c */
    private final AbstractC7664g f28529c;

    /* renamed from: d */
    private final AbstractC7661f f28530d;

    /* renamed from: e */
    private final Function2<AbstractC7267g0, AbstractC7267g0, Boolean> f28531e;

    /* renamed from: rh.l$a */
    /* loaded from: classes8.dex */
    public static final class C12681a extends C7250f1 {

        /* renamed from: k */
        final /* synthetic */ C12680l f28532k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12681a(boolean z, boolean z2, C12680l lVar, AbstractC7661f fVar, AbstractC7664g gVar) {
            super(z, z2, true, lVar, fVar, gVar);
            this.f28532k = lVar;
        }

        @Override // fi.C7250f1
        /* renamed from: f */
        public boolean mo5879f(AbstractC9618i subType, AbstractC9618i superType) {
            C9971q.m14633g(subType, "subType");
            C9971q.m14633g(superType, "superType");
            if (!(subType instanceof AbstractC7267g0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (superType instanceof AbstractC7267g0) {
                return ((Boolean) this.f28532k.f28531e.invoke(subType, superType)).booleanValue();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12680l(Map<AbstractC7268g1, ? extends AbstractC7268g1> map, AbstractC7659e.AbstractC7660a equalityAxioms, AbstractC7664g kotlinTypeRefiner, AbstractC7661f kotlinTypePreparator, Function2<? super AbstractC7267g0, ? super AbstractC7267g0, Boolean> function2) {
        C9971q.m14633g(equalityAxioms, "equalityAxioms");
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        C9971q.m14633g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f28527a = map;
        this.f28528b = equalityAxioms;
        this.f28529c = kotlinTypeRefiner;
        this.f28530d = kotlinTypePreparator;
        this.f28531e = function2;
    }

    /* renamed from: H0 */
    private final boolean m5951H0(AbstractC7268g1 g1Var, AbstractC7268g1 g1Var2) {
        if (this.f28528b.mo5979a(g1Var, g1Var2)) {
            return true;
        }
        Map<AbstractC7268g1, AbstractC7268g1> map = this.f28527a;
        if (map == null) {
            return false;
        }
        AbstractC7268g1 g1Var3 = map.get(g1Var);
        AbstractC7268g1 g1Var4 = this.f28527a.get(g1Var2);
        if (g1Var3 != null && C9971q.m14638b(g1Var3, g1Var2)) {
            return true;
        }
        if (g1Var4 == null || !C9971q.m14638b(g1Var4, g1Var)) {
            return false;
        }
        return true;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: A */
    public boolean mo5966A(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21766M(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: A0 */
    public int mo5965A0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21737h0(this, nVar);
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: B */
    public C11138d mo5964B(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21722p(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: B0 */
    public EnumC9611b mo5963B0(AbstractC9613d dVar) {
        return AbstractC7655b.C7656a.m21730l(this, dVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: C */
    public boolean mo5962C(AbstractC9618i iVar) {
        AbstractC9615f fVar;
        C9971q.m14633g(iVar, "<this>");
        AbstractC9616g I = mo5950I(iVar);
        if (I != null) {
            fVar = mo5887w(I);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            return true;
        }
        return false;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: C0 */
    public List<AbstractC9624o> mo5961C0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21718r(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: D */
    public AbstractC9622m mo5960D(AbstractC9612c cVar) {
        return AbstractC7655b.C7656a.m21733j0(this, cVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: D0 */
    public AbstractC9622m mo5959D0(AbstractC9618i iVar, int i) {
        return AbstractC7655b.C7656a.m21726n(this, iVar, i);
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: E */
    public boolean mo5958E(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21749b0(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: E0 */
    public boolean mo5957E0(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        if (mo5880z0(mo5907m(iVar)) != mo5880z0(mo5891u(iVar))) {
            return true;
        }
        return false;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: F */
    public boolean mo5956F(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21772G(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: F0 */
    public boolean mo5955F0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21762Q(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: G */
    public AbstractC9620k mo5954G(AbstractC9620k kVar, EnumC9611b bVar) {
        return AbstractC7655b.C7656a.m21732k(this, kVar, bVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: H */
    public boolean mo5952H(AbstractC9620k kVar) {
        C9971q.m14633g(kVar, "<this>");
        return mo5966A(mo5931a(kVar));
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: I */
    public AbstractC9616g mo5950I(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21740g(this, iVar);
    }

    /* renamed from: I0 */
    public C7250f1 m5949I0(boolean z, boolean z2) {
        if (this.f28531e != null) {
            return new C12681a(z, z2, this, this.f28530d, this.f28529c);
        }
        return C7654a.m21780a(z, z2, this, this.f28530d, this.f28529c);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: J */
    public boolean mo5948J(AbstractC9622m mVar) {
        return AbstractC7655b.C7656a.m21755X(this, mVar);
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: K */
    public AbstractC9618i mo5947K(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21711y(this, iVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: L */
    public AbstractC9618i mo5946L(AbstractC9618i iVar, boolean z) {
        return AbstractC7655b.C7656a.m21721p0(this, iVar, z);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: M */
    public AbstractC9619j mo5945M(AbstractC9616g gVar) {
        return AbstractC7655b.C7656a.m21738h(this, gVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: N */
    public boolean mo5944N(AbstractC9618i iVar) {
        AbstractC9614e eVar;
        C9971q.m14633g(iVar, "<this>");
        AbstractC9620k f = mo5921f(iVar);
        if (f != null) {
            eVar = mo5895s(f);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return true;
        }
        return false;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: O */
    public AbstractC9623n mo5943O(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        AbstractC9620k f = mo5921f(iVar);
        if (f == null) {
            f = mo5907m(iVar);
        }
        return mo5931a(f);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: P */
    public AbstractC9624o mo5942P(AbstractC9623n nVar, int i) {
        return AbstractC7655b.C7656a.m21720q(this, nVar, i);
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: Q */
    public EnumC10426i mo5941Q(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21716t(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: R */
    public AbstractC9618i mo5940R(AbstractC9613d dVar) {
        return AbstractC7655b.C7656a.m21745d0(this, dVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: S */
    public List<AbstractC9622m> mo5939S(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21724o(this, iVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: T */
    public boolean mo5938T(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21768K(this, iVar);
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: U */
    public AbstractC9618i mo5937U(AbstractC9624o oVar) {
        return AbstractC7655b.C7656a.m21715u(this, oVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: V */
    public int mo5936V(AbstractC9621l lVar) {
        C9971q.m14633g(lVar, "<this>");
        if (lVar instanceof AbstractC9620k) {
            return mo5900p0((AbstractC9618i) lVar);
        }
        if (lVar instanceof C9610a) {
            return ((C9610a) lVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + C9951f0.m14684b(lVar.getClass())).toString());
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: W */
    public boolean mo5935W(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        if (!(iVar instanceof AbstractC9620k) || !mo5880z0((AbstractC9620k) iVar)) {
            return false;
        }
        return true;
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: X */
    public boolean mo5934X(AbstractC9618i iVar, C11137c cVar) {
        return AbstractC7655b.C7656a.m21776C(this, iVar, cVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: Y */
    public C7250f1.AbstractC7253c mo5933Y(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21731k0(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: Z */
    public AbstractC9618i mo5932Z(AbstractC9622m mVar) {
        return AbstractC7655b.C7656a.m21714v(this, mVar);
    }

    @Override // gi.AbstractC7655b, p182ji.AbstractC9625p
    /* renamed from: a */
    public AbstractC9623n mo5931a(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21725n0(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: a0 */
    public boolean mo5930a0(AbstractC9613d dVar) {
        return AbstractC7655b.C7656a.m21760S(this, dVar);
    }

    @Override // gi.AbstractC7655b, p182ji.AbstractC9625p
    /* renamed from: b */
    public AbstractC9613d mo5929b(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21746d(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: b0 */
    public AbstractC9624o mo5928b0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21712x(this, nVar);
    }

    @Override // gi.AbstractC7655b, p182ji.AbstractC9625p
    /* renamed from: c */
    public AbstractC9620k mo5927c(AbstractC9616g gVar) {
        return AbstractC7655b.C7656a.m21723o0(this, gVar);
    }

    @Override // gi.AbstractC7655b
    /* renamed from: c0 */
    public AbstractC9618i mo5926c0(AbstractC9620k kVar, AbstractC9620k kVar2) {
        return AbstractC7655b.C7656a.m21728m(this, kVar, kVar2);
    }

    @Override // gi.AbstractC7655b, p182ji.AbstractC9625p
    /* renamed from: d */
    public AbstractC9620k mo5925d(AbstractC9620k kVar, boolean z) {
        return AbstractC7655b.C7656a.m21719q0(this, kVar, z);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: d0 */
    public boolean mo5924d0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21771H(this, nVar);
    }

    @Override // gi.AbstractC7655b, p182ji.AbstractC9625p
    /* renamed from: e */
    public AbstractC9620k mo5923e(AbstractC9616g gVar) {
        return AbstractC7655b.C7656a.m21747c0(this, gVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: e0 */
    public AbstractC9622m mo5922e0(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21734j(this, iVar);
    }

    @Override // gi.AbstractC7655b, p182ji.AbstractC9625p
    /* renamed from: f */
    public AbstractC9620k mo5921f(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21736i(this, iVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: f0 */
    public AbstractC9618i mo5920f0(List<? extends AbstractC9618i> list) {
        return AbstractC7655b.C7656a.m21773F(this, list);
    }

    @Override // gi.AbstractC7655b, p182ji.AbstractC9625p
    /* renamed from: g */
    public boolean mo5919g(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21757V(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: g0 */
    public boolean mo5918g0(AbstractC9624o oVar, AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21775D(this, oVar, nVar);
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: h */
    public AbstractC9618i mo5917h(AbstractC9618i iVar) {
        AbstractC9620k d;
        C9971q.m14633g(iVar, "<this>");
        AbstractC9620k f = mo5921f(iVar);
        if (f == null || (d = mo5925d(f, true)) == null) {
            return iVar;
        }
        return d;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: h0 */
    public boolean mo5916h0(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21759T(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: i */
    public AbstractC9620k mo5915i(AbstractC9614e eVar) {
        return AbstractC7655b.C7656a.m21739g0(this, eVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: i0 */
    public boolean mo5914i0(AbstractC9620k kVar) {
        C9971q.m14633g(kVar, "<this>");
        return mo5924d0(mo5931a(kVar));
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: j */
    public boolean mo5913j(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21754Y(this, kVar);
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: j0 */
    public boolean mo5912j0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21767L(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: k */
    public AbstractC9622m mo5911k(AbstractC9621l lVar, int i) {
        C9971q.m14633g(lVar, "<this>");
        if (lVar instanceof AbstractC9620k) {
            return mo5959D0((AbstractC9618i) lVar, i);
        }
        if (lVar instanceof C9610a) {
            AbstractC9622m mVar = ((C9610a) lVar).get(i);
            C9971q.m14634f(mVar, "get(index)");
            return mVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + C9951f0.m14684b(lVar.getClass())).toString());
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: k0 */
    public EnumC9631u mo5910k0(AbstractC9624o oVar) {
        return AbstractC7655b.C7656a.m21777B(this, oVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: l */
    public AbstractC9618i mo5909l(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21743e0(this, iVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: l0 */
    public boolean mo5908l0(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21761R(this, iVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: m */
    public AbstractC9620k mo5907m(AbstractC9618i iVar) {
        AbstractC9620k e;
        C9971q.m14633g(iVar, "<this>");
        AbstractC9616g I = mo5950I(iVar);
        if (I != null && (e = mo5923e(I)) != null) {
            return e;
        }
        AbstractC9620k f = mo5921f(iVar);
        C9971q.m14636d(f);
        return f;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: m0 */
    public Collection<AbstractC9618i> mo5906m0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21729l0(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: n */
    public boolean mo5905n(AbstractC9618i iVar) {
        AbstractC9613d dVar;
        C9971q.m14633g(iVar, "<this>");
        AbstractC9620k f = mo5921f(iVar);
        if (f != null) {
            dVar = mo5929b(f);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return true;
        }
        return false;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: n0 */
    public boolean mo5904n0(AbstractC9613d dVar) {
        return AbstractC7655b.C7656a.m21758U(this, dVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: o */
    public boolean mo5903o(AbstractC9623n c1, AbstractC9623n c2) {
        C9971q.m14633g(c1, "c1");
        C9971q.m14633g(c2, "c2");
        if (!(c1 instanceof AbstractC7268g1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(c2 instanceof AbstractC7268g1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (AbstractC7655b.C7656a.m21752a(this, c1, c2) || m5951H0((AbstractC7268g1) c1, (AbstractC7268g1) c2)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: o0 */
    public boolean mo5902o0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21769J(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: p */
    public boolean mo5901p(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        if (!mo5955F0(mo5943O(iVar)) || mo5908l0(iVar)) {
            return false;
        }
        return true;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: p0 */
    public int mo5900p0(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21750b(this, iVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: q */
    public AbstractC9612c mo5899q(AbstractC9613d dVar) {
        return AbstractC7655b.C7656a.m21727m0(this, dVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: q0 */
    public AbstractC9622m mo5898q0(AbstractC9620k kVar, int i) {
        C9971q.m14633g(kVar, "<this>");
        boolean z = false;
        if (i >= 0 && i < mo5900p0(kVar)) {
            z = true;
        }
        if (z) {
            return mo5959D0(kVar, i);
        }
        return null;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: r */
    public List<AbstractC9618i> mo5897r(AbstractC9624o oVar) {
        return AbstractC7655b.C7656a.m21710z(this, oVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: r0 */
    public AbstractC9621l mo5896r0(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21748c(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: s */
    public AbstractC9614e mo5895s(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21744e(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: s0 */
    public AbstractC9624o mo5894s0(AbstractC9630t tVar) {
        return AbstractC7655b.C7656a.m21713w(this, tVar);
    }

    @Override // p182ji.AbstractC9629s
    /* renamed from: t */
    public boolean mo5893t(AbstractC9620k kVar, AbstractC9620k kVar2) {
        return AbstractC7655b.C7656a.m21774E(this, kVar, kVar2);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: t0 */
    public Collection<AbstractC9618i> mo5892t0(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21735i0(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: u */
    public AbstractC9620k mo5891u(AbstractC9618i iVar) {
        AbstractC9620k c;
        C9971q.m14633g(iVar, "<this>");
        AbstractC9616g I = mo5950I(iVar);
        if (I != null && (c = mo5927c(I)) != null) {
            return c;
        }
        AbstractC9620k f = mo5921f(iVar);
        C9971q.m14636d(f);
        return f;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: u0 */
    public AbstractC9620k mo5890u0(AbstractC9620k kVar) {
        AbstractC9620k i;
        C9971q.m14633g(kVar, "<this>");
        AbstractC9614e s = mo5895s(kVar);
        if (s == null || (i = mo5915i(s)) == null) {
            return kVar;
        }
        return i;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: v */
    public boolean mo5889v(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21753Z(this, kVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: v0 */
    public boolean mo5888v0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21770I(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: w */
    public AbstractC9615f mo5887w(AbstractC9616g gVar) {
        return AbstractC7655b.C7656a.m21742f(this, gVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: w0 */
    public boolean mo5886w0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21765N(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: x */
    public EnumC9631u mo5885x(AbstractC9622m mVar) {
        return AbstractC7655b.C7656a.m21778A(this, mVar);
    }

    @Override // fi.AbstractC7316q1
    /* renamed from: x0 */
    public EnumC10426i mo5884x0(AbstractC9623n nVar) {
        return AbstractC7655b.C7656a.m21717s(this, nVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: y */
    public boolean mo5883y(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21751a0(this, iVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: y0 */
    public boolean mo5882y0(AbstractC9618i iVar) {
        return AbstractC7655b.C7656a.m21763P(this, iVar);
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: z */
    public List<AbstractC9620k> mo5881z(AbstractC9620k kVar, AbstractC9623n constructor) {
        C9971q.m14633g(kVar, "<this>");
        C9971q.m14633g(constructor, "constructor");
        return null;
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: z0 */
    public boolean mo5880z0(AbstractC9620k kVar) {
        return AbstractC7655b.C7656a.m21764O(this, kVar);
    }
}
