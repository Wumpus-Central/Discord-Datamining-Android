package p325rh;

import fi.AbstractC7267g0;
import fi.C7232c1;
import fi.C7270h0;
import fi.C7296m1;
import fi.EnumC7338w1;
import java.util.Collections;
import p217lg.C10434k;
import p249nh.C11142f;
import p249nh.C11145i;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p268og.C11373t;
import p268og.C11393x;
import p268og.EnumC11314e0;
import p324rg.C12591c0;
import p324rg.C12597d0;
import p324rg.C12603e0;
import p324rg.C12604f;
import p324rg.C12605f0;
import p324rg.C12607g0;
import p324rg.C12619l0;
import p388vh.C13508c;
import p468zh.C14658b;
import p468zh.C14659c;
import p468zh.C14660d;
import pg.AbstractC11672g;

/* renamed from: rh.d */
/* loaded from: classes8.dex */
public class C12659d {

    /* renamed from: rh.d$a */
    /* loaded from: classes8.dex */
    private static class C12660a extends C12604f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12660a(AbstractC11313e eVar, AbstractC11299a1 a1Var, boolean z) {
            super(eVar, null, AbstractC11672g.f26044g.m9048b(), true, AbstractC11301b.EnumC11302a.DECLARATION, a1Var);
            if (eVar == null) {
                m6067I(0);
            }
            if (a1Var == null) {
                m6067I(1);
            }
            m6369q1(Collections.emptyList(), C12661e.m6043k(eVar, z));
        }

        /* renamed from: I */
        private static /* synthetic */ void m6067I(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m6084a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 12 || i == 23 || i == 25) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static AbstractC11396x0 m6083b(AbstractC11297a aVar, AbstractC7267g0 g0Var, C11142f fVar, AbstractC11672g gVar) {
        if (aVar == null) {
            m6084a(32);
        }
        if (gVar == null) {
            m6084a(33);
        }
        if (g0Var == null) {
            return null;
        }
        return new C12605f0(aVar, new C14659c(aVar, g0Var, fVar, null), gVar);
    }

    /* renamed from: c */
    public static AbstractC11396x0 m6082c(AbstractC11313e eVar, AbstractC7267g0 g0Var, C11142f fVar, AbstractC11672g gVar) {
        if (eVar == null) {
            m6084a(34);
        }
        if (gVar == null) {
            m6084a(35);
        }
        if (g0Var == null) {
            return null;
        }
        return new C12605f0(eVar, new C14658b(eVar, g0Var, fVar, null), gVar);
    }

    /* renamed from: d */
    public static C12597d0 m6081d(AbstractC11388u0 u0Var, AbstractC11672g gVar) {
        if (u0Var == null) {
            m6084a(13);
        }
        if (gVar == null) {
            m6084a(14);
        }
        return m6075j(u0Var, gVar, true, false, false);
    }

    /* renamed from: e */
    public static C12603e0 m6080e(AbstractC11388u0 u0Var, AbstractC11672g gVar, AbstractC11672g gVar2) {
        if (u0Var == null) {
            m6084a(0);
        }
        if (gVar == null) {
            m6084a(1);
        }
        if (gVar2 == null) {
            m6084a(2);
        }
        return m6071n(u0Var, gVar, gVar2, true, false, false, u0Var.mo6102j());
    }

    /* renamed from: f */
    public static AbstractC11388u0 m6079f(AbstractC11313e eVar) {
        if (eVar == null) {
            m6084a(26);
        }
        AbstractC11313e a = C11393x.m10149a(C12661e.m6047g(eVar), C11145i.f24751a.m10752i());
        if (a == null) {
            return null;
        }
        AbstractC11672g.C11673a aVar = AbstractC11672g.f26044g;
        AbstractC11672g b = aVar.m9048b();
        EnumC11314e0 e0Var = EnumC11314e0.FINAL;
        AbstractC11387u uVar = C11373t.f25299e;
        C11142f fVar = C10434k.f22878e;
        AbstractC11301b.EnumC11302a aVar2 = AbstractC11301b.EnumC11302a.SYNTHESIZED;
        C12591c0 O0 = C12591c0.m6452O0(eVar, b, e0Var, uVar, false, fVar, aVar2, eVar.mo6102j(), false, false, false, false, false, false);
        C12597d0 d0Var = new C12597d0(O0, aVar.m9048b(), e0Var, uVar, false, false, false, aVar2, null, eVar.mo6102j());
        O0.m6447U0(d0Var, null);
        O0.m6441b1(C7270h0.m23052h(C7232c1.f15671l.m23149h(), a.mo6111k(), Collections.singletonList(new C7296m1(eVar.mo6166p())), false), Collections.emptyList(), null, null, Collections.emptyList());
        d0Var.m6397Q0(O0.getReturnType());
        return O0;
    }

    /* renamed from: g */
    public static AbstractC11404z0 m6078g(AbstractC11313e eVar) {
        if (eVar == null) {
            m6084a(24);
        }
        AbstractC11672g.C11673a aVar = AbstractC11672g.f26044g;
        C12607g0 l1 = C12607g0.m6363l1(eVar, aVar.m9048b(), C10434k.f22879f, AbstractC11301b.EnumC11302a.SYNTHESIZED, eVar.mo6102j());
        C12607g0 n1 = l1.mo6259R0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C12619l0(l1, null, 0, aVar.m9048b(), C11142f.m10767f("value"), C13508c.m3531j(eVar).m13406W(), false, false, false, null, eVar.mo6102j())), eVar.mo6166p(), EnumC11314e0.FINAL, C11373t.f25299e);
        if (n1 == null) {
            m6084a(25);
        }
        return n1;
    }

    /* renamed from: h */
    public static AbstractC11404z0 m6077h(AbstractC11313e eVar) {
        if (eVar == null) {
            m6084a(22);
        }
        C12607g0 n1 = C12607g0.m6363l1(eVar, AbstractC11672g.f26044g.m9048b(), C10434k.f22877d, AbstractC11301b.EnumC11302a.SYNTHESIZED, eVar.mo6102j()).mo6259R0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C13508c.m3531j(eVar).m13381l(EnumC7338w1.INVARIANT, eVar.mo6166p()), EnumC11314e0.FINAL, C11373t.f25299e);
        if (n1 == null) {
            m6084a(23);
        }
        return n1;
    }

    /* renamed from: i */
    public static AbstractC11396x0 m6076i(AbstractC11297a aVar, AbstractC7267g0 g0Var, AbstractC11672g gVar) {
        if (aVar == null) {
            m6084a(30);
        }
        if (gVar == null) {
            m6084a(31);
        }
        if (g0Var == null) {
            return null;
        }
        return new C12605f0(aVar, new C14660d(aVar, g0Var, null), gVar);
    }

    /* renamed from: j */
    public static C12597d0 m6075j(AbstractC11388u0 u0Var, AbstractC11672g gVar, boolean z, boolean z2, boolean z3) {
        if (u0Var == null) {
            m6084a(15);
        }
        if (gVar == null) {
            m6084a(16);
        }
        return m6074k(u0Var, gVar, z, z2, z3, u0Var.mo6102j());
    }

    /* renamed from: k */
    public static C12597d0 m6074k(AbstractC11388u0 u0Var, AbstractC11672g gVar, boolean z, boolean z2, boolean z3, AbstractC11299a1 a1Var) {
        if (u0Var == null) {
            m6084a(17);
        }
        if (gVar == null) {
            m6084a(18);
        }
        if (a1Var == null) {
            m6084a(19);
        }
        return new C12597d0(u0Var, gVar, u0Var.mo6108s(), u0Var.getVisibility(), z, z2, z3, AbstractC11301b.EnumC11302a.DECLARATION, null, a1Var);
    }

    /* renamed from: l */
    public static C12604f m6073l(AbstractC11313e eVar, AbstractC11299a1 a1Var) {
        if (eVar == null) {
            m6084a(20);
        }
        if (a1Var == null) {
            m6084a(21);
        }
        return new C12660a(eVar, a1Var, false);
    }

    /* renamed from: m */
    public static C12603e0 m6072m(AbstractC11388u0 u0Var, AbstractC11672g gVar, AbstractC11672g gVar2, boolean z, boolean z2, boolean z3, AbstractC11387u uVar, AbstractC11299a1 a1Var) {
        if (u0Var == null) {
            m6084a(7);
        }
        if (gVar == null) {
            m6084a(8);
        }
        if (gVar2 == null) {
            m6084a(9);
        }
        if (uVar == null) {
            m6084a(10);
        }
        if (a1Var == null) {
            m6084a(11);
        }
        C12603e0 e0Var = new C12603e0(u0Var, gVar, u0Var.mo6108s(), uVar, z, z2, z3, AbstractC11301b.EnumC11302a.DECLARATION, null, a1Var);
        e0Var.m6376R0(C12603e0.m6378P0(e0Var, u0Var.getType(), gVar2));
        return e0Var;
    }

    /* renamed from: n */
    public static C12603e0 m6071n(AbstractC11388u0 u0Var, AbstractC11672g gVar, AbstractC11672g gVar2, boolean z, boolean z2, boolean z3, AbstractC11299a1 a1Var) {
        if (u0Var == null) {
            m6084a(3);
        }
        if (gVar == null) {
            m6084a(4);
        }
        if (gVar2 == null) {
            m6084a(5);
        }
        if (a1Var == null) {
            m6084a(6);
        }
        return m6072m(u0Var, gVar, gVar2, z, z2, z3, u0Var.getVisibility(), a1Var);
    }

    /* renamed from: o */
    private static boolean m6070o(AbstractC11397y yVar) {
        if (yVar == null) {
            m6084a(29);
        }
        if (yVar.mo6245g() != AbstractC11301b.EnumC11302a.SYNTHESIZED || !C12661e.m6066A(yVar.mo6104b())) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m6069p(AbstractC11397y yVar) {
        if (yVar == null) {
            m6084a(28);
        }
        if (!yVar.getName().equals(C10434k.f22879f) || !m6070o(yVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m6068q(AbstractC11397y yVar) {
        if (yVar == null) {
            m6084a(27);
        }
        if (!yVar.getName().equals(C10434k.f22877d) || !m6070o(yVar)) {
            return false;
        }
        return true;
    }
}
