package p324rg;

import fi.AbstractC7267g0;
import fi.C7278i0;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p087ei.AbstractC6944n;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11311d1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11346m;
import p325rh.C12661e;
import p388vh.C13508c;
import pg.AbstractC11672g;

/* renamed from: rg.k0 */
/* loaded from: classes8.dex */
public class C12617k0 extends AbstractC12598e {

    /* renamed from: u */
    private final Function1<AbstractC7267g0, Void> f28366u;

    /* renamed from: v */
    private final List<AbstractC7267g0> f28367v;

    /* renamed from: w */
    private boolean f28368w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C12617k0(AbstractC11346m mVar, AbstractC11672g gVar, boolean z, EnumC7338w1 w1Var, C11142f fVar, int i, AbstractC11299a1 a1Var, Function1<AbstractC7267g0, Void> function1, AbstractC11311d1 d1Var, AbstractC6944n nVar) {
        super(nVar, mVar, gVar, fVar, w1Var, z, i, a1Var, d1Var);
        if (mVar == null) {
            m6336I(19);
        }
        if (gVar == null) {
            m6336I(20);
        }
        if (w1Var == null) {
            m6336I(21);
        }
        if (fVar == null) {
            m6336I(22);
        }
        if (a1Var == null) {
            m6336I(23);
        }
        if (d1Var == null) {
            m6336I(24);
        }
        if (nVar == null) {
            m6336I(25);
        }
        this.f28367v = new ArrayList(1);
        this.f28368w = false;
        this.f28366u = function1;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6336I(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 5 || i == 28) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: N0 */
    private void m6332N0() {
        if (!this.f28368w) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + m6325U0());
        }
    }

    /* renamed from: O0 */
    private void m6331O0() {
        if (this.f28368w) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m6325U0());
        }
    }

    /* renamed from: P0 */
    public static C12617k0 m6330P0(AbstractC11346m mVar, AbstractC11672g gVar, boolean z, EnumC7338w1 w1Var, C11142f fVar, int i, AbstractC11299a1 a1Var, AbstractC6944n nVar) {
        if (mVar == null) {
            m6336I(6);
        }
        if (gVar == null) {
            m6336I(7);
        }
        if (w1Var == null) {
            m6336I(8);
        }
        if (fVar == null) {
            m6336I(9);
        }
        if (a1Var == null) {
            m6336I(10);
        }
        if (nVar == null) {
            m6336I(11);
        }
        return m6329Q0(mVar, gVar, z, w1Var, fVar, i, a1Var, null, AbstractC11311d1.C11312a.f25241a, nVar);
    }

    /* renamed from: Q0 */
    public static C12617k0 m6329Q0(AbstractC11346m mVar, AbstractC11672g gVar, boolean z, EnumC7338w1 w1Var, C11142f fVar, int i, AbstractC11299a1 a1Var, Function1<AbstractC7267g0, Void> function1, AbstractC11311d1 d1Var, AbstractC6944n nVar) {
        if (mVar == null) {
            m6336I(12);
        }
        if (gVar == null) {
            m6336I(13);
        }
        if (w1Var == null) {
            m6336I(14);
        }
        if (fVar == null) {
            m6336I(15);
        }
        if (a1Var == null) {
            m6336I(16);
        }
        if (d1Var == null) {
            m6336I(17);
        }
        if (nVar == null) {
            m6336I(18);
        }
        return new C12617k0(mVar, gVar, z, w1Var, fVar, i, a1Var, function1, d1Var, nVar);
    }

    /* renamed from: R0 */
    public static AbstractC11319f1 m6328R0(AbstractC11346m mVar, AbstractC11672g gVar, boolean z, EnumC7338w1 w1Var, C11142f fVar, int i, AbstractC6944n nVar) {
        if (mVar == null) {
            m6336I(0);
        }
        if (gVar == null) {
            m6336I(1);
        }
        if (w1Var == null) {
            m6336I(2);
        }
        if (fVar == null) {
            m6336I(3);
        }
        if (nVar == null) {
            m6336I(4);
        }
        C12617k0 P0 = m6330P0(mVar, gVar, z, w1Var, fVar, i, AbstractC11299a1.f25230a, nVar);
        P0.m6333M0(C13508c.m3531j(mVar).m13356y());
        P0.m6324V0();
        return P0;
    }

    /* renamed from: S0 */
    private void m6327S0(AbstractC7267g0 g0Var) {
        if (!C7278i0.m23035a(g0Var)) {
            this.f28367v.add(g0Var);
        }
    }

    /* renamed from: U0 */
    private String m6325U0() {
        return getName() + " declared in " + C12661e.m6041m(mo6104b());
    }

    @Override // p324rg.AbstractC12598e
    /* renamed from: K0 */
    protected void mo6335K0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m6336I(27);
        }
        Function1<AbstractC7267g0, Void> function1 = this.f28366u;
        if (function1 != null) {
            function1.invoke(g0Var);
        }
    }

    @Override // p324rg.AbstractC12598e
    /* renamed from: L0 */
    protected List<AbstractC7267g0> mo6334L0() {
        m6332N0();
        List<AbstractC7267g0> list = this.f28367v;
        if (list == null) {
            m6336I(28);
        }
        return list;
    }

    /* renamed from: M0 */
    public void m6333M0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m6336I(26);
        }
        m6331O0();
        m6327S0(g0Var);
    }

    /* renamed from: T0 */
    public boolean m6326T0() {
        return this.f28368w;
    }

    /* renamed from: V0 */
    public void m6324V0() {
        m6331O0();
        this.f28368w = true;
    }
}
