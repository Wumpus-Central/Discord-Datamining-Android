package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7299n1;
import fi.AbstractC7304o0;
import fi.C7270h0;
import fi.C7291l;
import fi.C7303o;
import fi.C7309p1;
import fi.C7322s1;
import fi.C7324t;
import fi.EnumC7338w1;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import p087ei.C6920f;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11329h1;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import p268og.AbstractC11387u;
import p268og.AbstractC11396x0;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p325rh.C12661e;
import p388vh.C13508c;
import p448yh.AbstractC14411h;
import p448yh.C14421m;
import pg.AbstractC11672g;

/* renamed from: rg.s */
/* loaded from: classes8.dex */
public class C12641s extends AbstractC12644t {

    /* renamed from: l */
    private final AbstractC12644t f28449l;

    /* renamed from: m */
    private final C7309p1 f28450m;

    /* renamed from: n */
    private C7309p1 f28451n;

    /* renamed from: o */
    private List<AbstractC11319f1> f28452o;

    /* renamed from: p */
    private List<AbstractC11319f1> f28453p;

    /* renamed from: q */
    private AbstractC7268g1 f28454q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rg.s$a */
    /* loaded from: classes8.dex */
    public class C12642a implements Function1<AbstractC11319f1, Boolean> {
        C12642a() {
        }

        /* renamed from: a */
        public Boolean invoke(AbstractC11319f1 f1Var) {
            return Boolean.valueOf(!f1Var.mo6393O());
        }
    }

    /* renamed from: rg.s$b */
    /* loaded from: classes8.dex */
    class C12643b implements Function1<AbstractC7304o0, AbstractC7304o0> {
        C12643b() {
        }

        /* renamed from: a */
        public AbstractC7304o0 invoke(AbstractC7304o0 o0Var) {
            return C12641s.this.m6171M0(o0Var);
        }
    }

    public C12641s(AbstractC12644t tVar, C7309p1 p1Var) {
        this.f28449l = tVar;
        this.f28450m = p1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3 A[ADDED_TO_REGION] */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m6177D0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p324rg.C12641s.m6177D0(int):void");
    }

    /* renamed from: K0 */
    private C7309p1 m6173K0() {
        List<AbstractC11319f1> Q;
        if (this.f28451n == null) {
            if (this.f28450m.m22975k()) {
                this.f28451n = this.f28450m;
            } else {
                List<AbstractC11319f1> parameters = this.f28449l.mo6111k().getParameters();
                this.f28452o = new ArrayList(parameters.size());
                this.f28451n = C7324t.m22917b(parameters, this.f28450m.m22976j(), this, this.f28452o);
                Q = C9914r.m14774Q(this.f28452o, new C12642a());
                this.f28453p = Q;
            }
        }
        return this.f28451n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public AbstractC7304o0 m6171M0(AbstractC7304o0 o0Var) {
        if (o0Var == null || this.f28450m.m22975k()) {
            return o0Var;
        }
        return (AbstractC7304o0) m6173K0().m22970p(o0Var, EnumC7338w1.INVARIANT);
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: B */
    public AbstractC11309d mo6129B() {
        return this.f28449l.mo6129B();
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return oVar.mo6316h(this, d);
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: G */
    public AbstractC14411h mo6176G(AbstractC7299n1 n1Var) {
        if (n1Var == null) {
            m6177D0(10);
        }
        AbstractC14411h I = mo6163I(n1Var, C13508c.m3526o(C12661e.m6047g(this)));
        if (I == null) {
            m6177D0(11);
        }
        return I;
    }

    @Override // p324rg.AbstractC12644t
    /* renamed from: I */
    public AbstractC14411h mo6163I(AbstractC7299n1 n1Var, AbstractC7664g gVar) {
        if (n1Var == null) {
            m6177D0(5);
        }
        if (gVar == null) {
            m6177D0(6);
        }
        AbstractC14411h I = this.f28449l.mo6163I(n1Var, gVar);
        if (!this.f28450m.m22975k()) {
            return new C14421m(I, m6173K0());
        }
        if (I == null) {
            m6177D0(7);
        }
        return I;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: I0 */
    public boolean mo6127I0() {
        return this.f28449l.mo6127I0();
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: J0 */
    public AbstractC11396x0 mo6174J0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: L0 */
    public AbstractC11313e mo6167c(C7309p1 p1Var) {
        if (p1Var == null) {
            m6177D0(23);
        }
        if (p1Var.m22975k()) {
            return this;
        }
        return new C12641s(this, C7309p1.m22978h(p1Var.m22976j(), m6173K0().m22976j()));
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: R */
    public AbstractC14411h mo6170R() {
        AbstractC14411h R = this.f28449l.mo6170R();
        if (R == null) {
            m6177D0(28);
        }
        return R;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: S */
    public AbstractC11329h1<AbstractC7304o0> mo6121S() {
        AbstractC11329h1<AbstractC7304o0> S = this.f28449l.mo6121S();
        if (S == null) {
            return null;
        }
        return S.m10203b(new C12643b());
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: U */
    public AbstractC14411h mo6169U() {
        AbstractC14411h e0 = mo6117e0(C13508c.m3526o(C12661e.m6047g(this.f28449l)));
        if (e0 == null) {
            m6177D0(12);
        }
        return e0;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: V */
    public boolean mo6120V() {
        return this.f28449l.mo6120V();
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: W */
    public List<AbstractC11396x0> mo6168W() {
        List<AbstractC11396x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6177D0(17);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: X */
    public boolean mo6119X() {
        return this.f28449l.mo6119X();
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11358n, p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11346m mo6104b() {
        AbstractC11346m b = this.f28449l.mo6104b();
        if (b == null) {
            m6177D0(22);
        }
        return b;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: b0 */
    public boolean mo6118b0() {
        return this.f28449l.mo6118b0();
    }

    @Override // p324rg.AbstractC12644t
    /* renamed from: e0 */
    public AbstractC14411h mo6117e0(AbstractC7664g gVar) {
        if (gVar == null) {
            m6177D0(13);
        }
        AbstractC14411h e0 = this.f28449l.mo6117e0(gVar);
        if (!this.f28450m.m22975k()) {
            return new C14421m(e0, m6173K0());
        }
        if (e0 == null) {
            m6177D0(14);
        }
        return e0;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g */
    public EnumC11317f mo6116g() {
        EnumC11317f g = this.f28449l.mo6116g();
        if (g == null) {
            m6177D0(25);
        }
        return g;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g0 */
    public boolean mo6115g0() {
        return this.f28449l.mo6115g0();
    }

    @Override // pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        AbstractC11672g annotations = this.f28449l.getAnnotations();
        if (annotations == null) {
            m6177D0(19);
        }
        return annotations;
    }

    @Override // p268og.AbstractC11334j0
    public C11142f getName() {
        C11142f name = this.f28449l.getName();
        if (name == null) {
            m6177D0(20);
        }
        return name;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u visibility = this.f28449l.getVisibility();
        if (visibility == null) {
            m6177D0(27);
        }
        return visibility;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: h0 */
    public boolean mo6114h0() {
        return this.f28449l.mo6114h0();
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: i0 */
    public AbstractC14411h mo6113i0() {
        AbstractC14411h i0 = this.f28449l.mo6113i0();
        if (i0 == null) {
            m6177D0(15);
        }
        return i0;
    }

    @Override // p268og.AbstractC11310d0
    public boolean isExternal() {
        return this.f28449l.isExternal();
    }

    @Override // p268og.AbstractC11313e
    public boolean isInline() {
        return this.f28449l.isInline();
    }

    @Override // p268og.AbstractC11365p
    /* renamed from: j */
    public AbstractC11299a1 mo6102j() {
        AbstractC11299a1 a1Var = AbstractC11299a1.f25230a;
        if (a1Var == null) {
            m6177D0(29);
        }
        return a1Var;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: j0 */
    public AbstractC11313e mo6112j0() {
        return this.f28449l.mo6112j0();
    }

    @Override // p268og.AbstractC11326h
    /* renamed from: k */
    public AbstractC7268g1 mo6111k() {
        AbstractC7268g1 k = this.f28449l.mo6111k();
        if (this.f28450m.m22975k()) {
            if (k == null) {
                m6177D0(0);
            }
            return k;
        }
        if (this.f28454q == null) {
            C7309p1 K0 = m6173K0();
            Collection<AbstractC7267g0> m = k.mo4568m();
            ArrayList arrayList = new ArrayList(m.size());
            for (AbstractC7267g0 g0Var : m) {
                arrayList.add(K0.m22970p(g0Var, EnumC7338w1.INVARIANT));
            }
            this.f28454q = new C7291l(this, this.f28452o, arrayList, C6920f.f15067e);
        }
        AbstractC7268g1 g1Var = this.f28454q;
        if (g1Var == null) {
            m6177D0(1);
        }
        return g1Var;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: l */
    public Collection<AbstractC11309d> mo6110l() {
        Collection<AbstractC11309d> l = this.f28449l.mo6110l();
        ArrayList arrayList = new ArrayList(l.size());
        for (AbstractC11309d dVar : l) {
            arrayList.add(((AbstractC11309d) dVar.mo6238u().mo6205h(dVar.mo6162a()).mo6209d(dVar.mo6108s()).mo6203j(dVar.getVisibility()).mo6196q(dVar.mo6245g()).mo6201l(false).build()).mo6167c(m6173K0()));
        }
        return arrayList;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11326h
    /* renamed from: p */
    public AbstractC7304o0 mo6166p() {
        AbstractC7304o0 k = C7270h0.m23049k(C7303o.f15781a.mo23000a(getAnnotations(), null, null), mo6111k(), C7322s1.m22940g(mo6111k().getParameters()), false, mo6169U());
        if (k == null) {
            m6177D0(16);
        }
        return k;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11330i
    /* renamed from: r */
    public List<AbstractC11319f1> mo6109r() {
        m6173K0();
        List<AbstractC11319f1> list = this.f28453p;
        if (list == null) {
            m6177D0(30);
        }
        return list;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11310d0
    /* renamed from: s */
    public EnumC11314e0 mo6108s() {
        EnumC11314e0 s = this.f28449l.mo6108s();
        if (s == null) {
            m6177D0(26);
        }
        return s;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: x */
    public Collection<AbstractC11313e> mo6107x() {
        Collection<AbstractC11313e> x = this.f28449l.mo6107x();
        if (x == null) {
            m6177D0(31);
        }
        return x;
    }

    @Override // p268og.AbstractC11330i
    /* renamed from: y */
    public boolean mo6106y() {
        return this.f28449l.mo6106y();
    }

    @Override // p324rg.AbstractC12644t, p268og.AbstractC11313e, p268og.AbstractC11346m
    /* renamed from: a */
    public AbstractC11313e mo6162a() {
        AbstractC11313e a = this.f28449l.mo6162a();
        if (a == null) {
            m6177D0(21);
        }
        return a;
    }
}
