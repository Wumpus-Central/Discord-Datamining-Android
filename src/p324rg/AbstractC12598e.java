package p324rg;

import fi.AbstractC7257g;
import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7270h0;
import fi.EnumC7338w1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11311d1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import p325rh.C12656c;
import p388vh.C13508c;
import p448yh.AbstractC14411h;
import p448yh.C14409g;
import p448yh.C14424n;
import pg.AbstractC11672g;

/* renamed from: rg.e */
/* loaded from: classes8.dex */
public abstract class AbstractC12598e extends AbstractC12616k implements AbstractC11319f1 {

    /* renamed from: o */
    private final EnumC7338w1 f28330o;

    /* renamed from: p */
    private final boolean f28331p;

    /* renamed from: q */
    private final int f28332q;

    /* renamed from: r */
    private final AbstractC6938i<AbstractC7268g1> f28333r;

    /* renamed from: s */
    private final AbstractC6938i<AbstractC7304o0> f28334s;

    /* renamed from: t */
    private final AbstractC6944n f28335t;

    /* renamed from: rg.e$a */
    /* loaded from: classes8.dex */
    class C12599a implements Function0<AbstractC7268g1> {

        /* renamed from: k */
        final /* synthetic */ AbstractC6944n f28336k;

        /* renamed from: l */
        final /* synthetic */ AbstractC11311d1 f28337l;

        C12599a(AbstractC6944n nVar, AbstractC11311d1 d1Var) {
            this.f28336k = nVar;
            this.f28337l = d1Var;
        }

        /* renamed from: a */
        public AbstractC7268g1 invoke() {
            return new C12602c(AbstractC12598e.this, this.f28336k, this.f28337l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rg.e$b */
    /* loaded from: classes8.dex */
    public class C12600b implements Function0<AbstractC7304o0> {

        /* renamed from: k */
        final /* synthetic */ C11142f f28339k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: rg.e$b$a */
        /* loaded from: classes8.dex */
        public class C12601a implements Function0<AbstractC14411h> {
            C12601a() {
            }

            /* renamed from: a */
            public AbstractC14411h invoke() {
                return C14424n.m623j("Scope for type parameter " + C12600b.this.f28339k.m10771b(), AbstractC12598e.this.getUpperBounds());
            }
        }

        C12600b(C11142f fVar) {
            this.f28339k = fVar;
        }

        /* renamed from: a */
        public AbstractC7304o0 invoke() {
            return C7270h0.m23049k(C7232c1.f15671l.m23149h(), AbstractC12598e.this.mo6111k(), Collections.emptyList(), false, new C14409g(new C12601a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rg.e$c */
    /* loaded from: classes8.dex */
    public class C12602c extends AbstractC7257g {

        /* renamed from: d */
        private final AbstractC11311d1 f28342d;

        /* renamed from: e */
        final /* synthetic */ AbstractC12598e f28343e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12602c(AbstractC12598e eVar, AbstractC6944n nVar, AbstractC11311d1 d1Var) {
            super(nVar);
            if (nVar == null) {
                m6381v(0);
            }
            this.f28343e = eVar;
            this.f28342d = d1Var;
        }

        /* renamed from: v */
        private static /* synthetic */ void m6381v(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                throw new IllegalStateException(format);
            }
        }

        @Override // fi.AbstractC7294m
        /* renamed from: e */
        protected boolean mo6387e(AbstractC11326h hVar) {
            if (hVar == null) {
                m6381v(9);
            }
            if (!(hVar instanceof AbstractC11319f1) || !C12656c.f28488a.m6092h(this.f28343e, (AbstractC11319f1) hVar, true)) {
                return false;
            }
            return true;
        }

        @Override // fi.AbstractC7268g1
        public List<AbstractC11319f1> getParameters() {
            List<AbstractC11319f1> emptyList = Collections.emptyList();
            if (emptyList == null) {
                m6381v(2);
            }
            return emptyList;
        }

        @Override // fi.AbstractC7257g
        /* renamed from: h */
        protected Collection<AbstractC7267g0> mo6386h() {
            List<AbstractC7267g0> L0 = this.f28343e.mo6334L0();
            if (L0 == null) {
                m6381v(1);
            }
            return L0;
        }

        @Override // fi.AbstractC7257g
        /* renamed from: i */
        protected AbstractC7267g0 mo6385i() {
            return C8039k.m20774d(EnumC8038j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // fi.AbstractC7257g
        /* renamed from: l */
        protected AbstractC11311d1 mo6384l() {
            AbstractC11311d1 d1Var = this.f28342d;
            if (d1Var == null) {
                m6381v(5);
            }
            return d1Var;
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: n */
        public AbstractC10420h mo4567n() {
            AbstractC10420h j = C13508c.m3531j(this.f28343e);
            if (j == null) {
                m6381v(4);
            }
            return j;
        }

        @Override // fi.AbstractC7294m, fi.AbstractC7268g1
        /* renamed from: p */
        public AbstractC11326h mo4565p() {
            AbstractC12598e eVar = this.f28343e;
            if (eVar == null) {
                m6381v(3);
            }
            return eVar;
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: q */
        public boolean mo4564q() {
            return true;
        }

        @Override // fi.AbstractC7257g
        /* renamed from: s */
        protected List<AbstractC7267g0> mo6383s(List<AbstractC7267g0> list) {
            if (list == null) {
                m6381v(7);
            }
            List<AbstractC7267g0> G0 = this.f28343e.mo6396G0(list);
            if (G0 == null) {
                m6381v(8);
            }
            return G0;
        }

        public String toString() {
            return this.f28343e.getName().toString();
        }

        @Override // fi.AbstractC7257g
        /* renamed from: u */
        protected void mo6382u(AbstractC7267g0 g0Var) {
            if (g0Var == null) {
                m6381v(6);
            }
            this.f28343e.mo6335K0(g0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12598e(AbstractC6944n nVar, AbstractC11346m mVar, AbstractC11672g gVar, C11142f fVar, EnumC7338w1 w1Var, boolean z, int i, AbstractC11299a1 a1Var, AbstractC11311d1 d1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (nVar == null) {
            m6395I(0);
        }
        if (mVar == null) {
            m6395I(1);
        }
        if (gVar == null) {
            m6395I(2);
        }
        if (fVar == null) {
            m6395I(3);
        }
        if (w1Var == null) {
            m6395I(4);
        }
        if (a1Var == null) {
            m6395I(5);
        }
        if (d1Var == null) {
            m6395I(6);
        }
        this.f28330o = w1Var;
        this.f28331p = z;
        this.f28332q = i;
        this.f28333r = nVar.mo23898c(new C12599a(nVar, d1Var));
        this.f28334s = nVar.mo23898c(new C12600b(fVar));
        this.f28335t = nVar;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6395I(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return oVar.mo6313l(this, d);
    }

    /* renamed from: G0 */
    protected List<AbstractC7267g0> mo6396G0(List<AbstractC7267g0> list) {
        if (list == null) {
            m6395I(12);
        }
        if (list == null) {
            m6395I(13);
        }
        return list;
    }

    @Override // p268og.AbstractC11319f1
    /* renamed from: K */
    public AbstractC6944n mo6394K() {
        AbstractC6944n nVar = this.f28335t;
        if (nVar == null) {
            m6395I(14);
        }
        return nVar;
    }

    /* renamed from: K0 */
    protected abstract void mo6335K0(AbstractC7267g0 g0Var);

    /* renamed from: L0 */
    protected abstract List<AbstractC7267g0> mo6334L0();

    @Override // p268og.AbstractC11319f1
    /* renamed from: O */
    public boolean mo6393O() {
        return false;
    }

    @Override // p268og.AbstractC11319f1
    public int getIndex() {
        return this.f28332q;
    }

    @Override // p268og.AbstractC11319f1
    public List<AbstractC7267g0> getUpperBounds() {
        List<AbstractC7267g0> r = ((C12602c) mo6111k()).mo4568m();
        if (r == null) {
            m6395I(8);
        }
        return r;
    }

    @Override // p268og.AbstractC11319f1, p268og.AbstractC11326h
    /* renamed from: k */
    public final AbstractC7268g1 mo6111k() {
        AbstractC7268g1 invoke = this.f28333r.invoke();
        if (invoke == null) {
            m6395I(9);
        }
        return invoke;
    }

    @Override // p268og.AbstractC11319f1
    /* renamed from: m */
    public EnumC7338w1 mo6392m() {
        EnumC7338w1 w1Var = this.f28330o;
        if (w1Var == null) {
            m6395I(7);
        }
        return w1Var;
    }

    @Override // p268og.AbstractC11326h
    /* renamed from: p */
    public AbstractC7304o0 mo6166p() {
        AbstractC7304o0 invoke = this.f28334s.invoke();
        if (invoke == null) {
            m6395I(10);
        }
        return invoke;
    }

    @Override // p268og.AbstractC11319f1
    /* renamed from: w */
    public boolean mo6391w() {
        return this.f28331p;
    }

    @Override // p324rg.AbstractC12616k, p324rg.AbstractC12612j, p268og.AbstractC11346m
    /* renamed from: a */
    public AbstractC11319f1 mo6162a() {
        AbstractC11319f1 f1Var = (AbstractC11319f1) super.mo6162a();
        if (f1Var == null) {
            m6395I(11);
        }
        return f1Var;
    }
}
