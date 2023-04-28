package p467zg;

import fi.AbstractC7267g0;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9906j;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11346m;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p324rg.C12604f;
import p325rh.C12659d;
import pg.AbstractC11672g;

/* renamed from: zg.b */
/* loaded from: classes8.dex */
public class C14647b extends C12604f implements AbstractC14646a {

    /* renamed from: P */
    private Boolean f39519P;

    /* renamed from: Q */
    private Boolean f39520Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C14647b(AbstractC11313e eVar, C14647b bVar, AbstractC11672g gVar, boolean z, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var) {
        super(eVar, bVar, gVar, z, aVar, a1Var);
        if (eVar == null) {
            m80I(0);
        }
        if (gVar == null) {
            m80I(1);
        }
        if (aVar == null) {
            m80I(2);
        }
        if (a1Var == null) {
            m80I(3);
        }
        this.f39519P = null;
        this.f39520Q = null;
    }

    /* renamed from: I */
    private static /* synthetic */ void m80I(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 11 || i == 18) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: t1 */
    public static C14647b m75t1(AbstractC11313e eVar, AbstractC11672g gVar, boolean z, AbstractC11299a1 a1Var) {
        if (eVar == null) {
            m80I(4);
        }
        if (gVar == null) {
            m80I(5);
        }
        if (a1Var == null) {
            m80I(6);
        }
        return new C14647b(eVar, null, gVar, z, AbstractC11301b.EnumC11302a.DECLARATION, a1Var);
    }

    @Override // p324rg.AbstractC12632p
    /* renamed from: Q0 */
    public boolean mo70Q0() {
        return this.f39519P.booleanValue();
    }

    @Override // p324rg.AbstractC12632p
    /* renamed from: Y0 */
    public void mo79Y0(boolean z) {
        this.f39519P = Boolean.valueOf(z);
    }

    @Override // p324rg.AbstractC12632p
    /* renamed from: Z0 */
    public void mo78Z0(boolean z) {
        this.f39520Q = Boolean.valueOf(z);
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11297a
    /* renamed from: d0 */
    public boolean mo57d0() {
        return this.f39520Q.booleanValue();
    }

    /* renamed from: s1 */
    protected C14647b m76s1(AbstractC11313e eVar, C14647b bVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var, AbstractC11672g gVar) {
        if (eVar == null) {
            m80I(12);
        }
        if (aVar == null) {
            m80I(13);
        }
        if (a1Var == null) {
            m80I(14);
        }
        if (gVar == null) {
            m80I(15);
        }
        return new C14647b(eVar, bVar, gVar, this.f39320O, aVar, a1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u1 */
    public C14647b mo77o1(AbstractC11346m mVar, AbstractC11397y yVar, AbstractC11301b.EnumC11302a aVar, C11142f fVar, AbstractC11672g gVar, AbstractC11299a1 a1Var) {
        if (mVar == null) {
            m80I(7);
        }
        if (aVar == null) {
            m80I(8);
        }
        if (gVar == null) {
            m80I(9);
        }
        if (a1Var == null) {
            m80I(10);
        }
        if (aVar == AbstractC11301b.EnumC11302a.DECLARATION || aVar == AbstractC11301b.EnumC11302a.SYNTHESIZED) {
            C14647b s1 = m76s1((AbstractC11313e) mVar, (C14647b) yVar, aVar, a1Var, gVar);
            s1.mo79Y0(mo70Q0());
            s1.mo78Z0(mo57d0());
            return s1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    /* renamed from: v1 */
    public C14647b mo62H0(AbstractC7267g0 g0Var, List<AbstractC7267g0> list, AbstractC7267g0 g0Var2, Pair<AbstractC11297a.AbstractC0362a<?>, ?> pair) {
        AbstractC11396x0 x0Var;
        List<AbstractC11396x0> i;
        if (list == null) {
            m80I(16);
        }
        if (g0Var2 == null) {
            m80I(17);
        }
        C14647b u1 = mo77o1(mo6104b(), null, mo6245g(), null, getAnnotations(), mo6102j());
        if (g0Var == null) {
            x0Var = null;
        } else {
            x0Var = C12659d.m6076i(u1, g0Var, AbstractC11672g.f26044g.m9048b());
        }
        AbstractC11396x0 J = mo6266J();
        i = C9906j.m14820i();
        u1.mo6259R0(x0Var, J, i, getTypeParameters(), C14656h.m53a(list, mo6242i(), u1), g0Var2, mo6108s(), getVisibility());
        if (pair != null) {
            u1.m6256U0(pair.m15065c(), pair.m15064d());
        }
        return u1;
    }
}
