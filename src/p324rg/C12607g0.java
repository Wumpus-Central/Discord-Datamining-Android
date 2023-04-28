package p324rg;

import fi.AbstractC7267g0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p268og.EnumC11314e0;
import pg.AbstractC11672g;

/* renamed from: rg.g0 */
/* loaded from: classes8.dex */
public class C12607g0 extends AbstractC12632p implements AbstractC11404z0 {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12607g0(AbstractC11346m mVar, AbstractC11404z0 z0Var, AbstractC11672g gVar, C11142f fVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var);
        if (mVar == null) {
            m6365I(0);
        }
        if (gVar == null) {
            m6365I(1);
        }
        if (fVar == null) {
            m6365I(2);
        }
        if (aVar == null) {
            m6365I(3);
        }
        if (a1Var == null) {
            m6365I(4);
        }
    }

    /* renamed from: I */
    private static /* synthetic */ void m6365I(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: l1 */
    public static C12607g0 m6363l1(AbstractC11346m mVar, AbstractC11672g gVar, C11142f fVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var) {
        if (mVar == null) {
            m6365I(5);
        }
        if (gVar == null) {
            m6365I(6);
        }
        if (fVar == null) {
            m6365I(7);
        }
        if (aVar == null) {
            m6365I(8);
        }
        if (a1Var == null) {
            m6365I(9);
        }
        return new C12607g0(mVar, null, gVar, fVar, aVar, a1Var);
    }

    @Override // p324rg.AbstractC12632p
    /* renamed from: L0 */
    protected AbstractC12632p mo71L0(AbstractC11346m mVar, AbstractC11397y yVar, AbstractC11301b.EnumC11302a aVar, C11142f fVar, AbstractC11672g gVar, AbstractC11299a1 a1Var) {
        if (mVar == null) {
            m6365I(25);
        }
        if (aVar == null) {
            m6365I(26);
        }
        if (gVar == null) {
            m6365I(27);
        }
        if (a1Var == null) {
            m6365I(28);
        }
        AbstractC11404z0 z0Var = (AbstractC11404z0) yVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new C12607g0(mVar, z0Var, gVar, fVar, aVar, a1Var);
    }

    /* renamed from: k1 */
    public AbstractC11404z0 mo6265K0(AbstractC11346m mVar, EnumC11314e0 e0Var, AbstractC11387u uVar, AbstractC11301b.EnumC11302a aVar, boolean z) {
        AbstractC11404z0 z0Var = (AbstractC11404z0) super.mo6270E0(mVar, e0Var, uVar, aVar, z);
        if (z0Var == null) {
            m6365I(29);
        }
        return z0Var;
    }

    /* renamed from: m1 */
    public AbstractC11404z0 mo6162a() {
        AbstractC11404z0 z0Var = (AbstractC11404z0) super.mo6162a();
        if (z0Var == null) {
            m6365I(24);
        }
        return z0Var;
    }

    /* renamed from: n1 */
    public C12607g0 mo6259R0(AbstractC11396x0 x0Var, AbstractC11396x0 x0Var2, List<AbstractC11396x0> list, List<? extends AbstractC11319f1> list2, List<AbstractC11335j1> list3, AbstractC7267g0 g0Var, EnumC11314e0 e0Var, AbstractC11387u uVar) {
        if (list == null) {
            m6365I(14);
        }
        if (list2 == null) {
            m6365I(15);
        }
        if (list3 == null) {
            m6365I(16);
        }
        if (uVar == null) {
            m6365I(17);
        }
        C12607g0 o1 = mo69o1(x0Var, x0Var2, list, list2, list3, g0Var, e0Var, uVar, null);
        if (o1 == null) {
            m6365I(18);
        }
        return o1;
    }

    /* renamed from: o1 */
    public C12607g0 mo69o1(AbstractC11396x0 x0Var, AbstractC11396x0 x0Var2, List<AbstractC11396x0> list, List<? extends AbstractC11319f1> list2, List<AbstractC11335j1> list3, AbstractC7267g0 g0Var, EnumC11314e0 e0Var, AbstractC11387u uVar, Map<? extends AbstractC11297a.AbstractC0362a<?>, ?> map) {
        if (list == null) {
            m6365I(19);
        }
        if (list2 == null) {
            m6365I(20);
        }
        if (list3 == null) {
            m6365I(21);
        }
        if (uVar == null) {
            m6365I(22);
        }
        super.mo6259R0(x0Var, x0Var2, list, list2, list3, g0Var, e0Var, uVar);
        if (map != null && !map.isEmpty()) {
            this.f39340N = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11397y, p268og.AbstractC11404z0
    /* renamed from: u */
    public AbstractC11397y.AbstractC11398a<? extends AbstractC11404z0> mo6238u() {
        AbstractC11397y.AbstractC11398a u = super.mo6238u();
        if (u == null) {
            m6365I(30);
        }
        return u;
    }
}
