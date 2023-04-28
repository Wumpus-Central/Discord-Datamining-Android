package p325rh;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.C7278i0;
import fi.C7322s1;
import gi.AbstractC7659e;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p142hi.C8039k;
import p217lg.AbstractC10420h;
import p217lg.C10439o;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11144h;
import p268og.AbstractC11297a;
import p268og.AbstractC11301b;
import p268og.AbstractC11304b1;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11342k1;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.AbstractC11365p;
import p268og.AbstractC11367q;
import p268og.AbstractC11368q0;
import p268og.AbstractC11387u;
import p268og.AbstractC11392w0;
import p268og.AbstractC11396x0;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p388vh.C13508c;

/* renamed from: rh.e */
/* loaded from: classes8.dex */
public class C12661e {

    /* renamed from: a */
    public static final C11137c f28493a = new C11137c("kotlin.jvm.JvmName");

    /* renamed from: A */
    public static boolean m6066A(AbstractC11346m mVar) {
        return m6063D(mVar, EnumC11317f.ENUM_CLASS);
    }

    /* renamed from: B */
    public static boolean m6065B(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(36);
        }
        return m6063D(mVar, EnumC11317f.ENUM_ENTRY);
    }

    /* renamed from: C */
    public static boolean m6064C(AbstractC11346m mVar) {
        return m6063D(mVar, EnumC11317f.INTERFACE);
    }

    /* renamed from: D */
    private static boolean m6063D(AbstractC11346m mVar, EnumC11317f fVar) {
        if (fVar == null) {
            m6053a(37);
        }
        if (!(mVar instanceof AbstractC11313e) || ((AbstractC11313e) mVar).mo6116g() != fVar) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m6062E(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(1);
        }
        while (mVar != null) {
            if (m6033u(mVar) || m6029y(mVar)) {
                return true;
            }
            mVar = mVar.mo6104b();
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m6061F(AbstractC7267g0 g0Var, AbstractC11346m mVar) {
        if (g0Var == null) {
            m6053a(30);
        }
        if (mVar == null) {
            m6053a(31);
        }
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p == null) {
            return false;
        }
        AbstractC11346m a = p.mo6162a();
        if (!(a instanceof AbstractC11326h) || !(mVar instanceof AbstractC11326h) || !((AbstractC11326h) mVar).mo6111k().equals(((AbstractC11326h) a).mo6111k())) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m6060G(AbstractC11346m mVar) {
        return (m6063D(mVar, EnumC11317f.CLASS) || m6063D(mVar, EnumC11317f.INTERFACE)) && ((AbstractC11313e) mVar).mo6108s() == EnumC11314e0.SEALED;
    }

    /* renamed from: H */
    public static boolean m6059H(AbstractC11313e eVar, AbstractC11313e eVar2) {
        if (eVar == null) {
            m6053a(28);
        }
        if (eVar2 == null) {
            m6053a(29);
        }
        return m6058I(eVar.mo6166p(), eVar2.mo6162a());
    }

    /* renamed from: I */
    public static boolean m6058I(AbstractC7267g0 g0Var, AbstractC11346m mVar) {
        if (g0Var == null) {
            m6053a(32);
        }
        if (mVar == null) {
            m6053a(33);
        }
        if (m6061F(g0Var, mVar)) {
            return true;
        }
        for (AbstractC7267g0 g0Var2 : g0Var.mo5172N0().mo4568m()) {
            if (m6058I(g0Var2, mVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m6057J(AbstractC11346m mVar) {
        return mVar != null && (mVar.mo6104b() instanceof AbstractC11344l0);
    }

    /* renamed from: K */
    public static boolean m6056K(AbstractC11342k1 k1Var, AbstractC7267g0 g0Var) {
        if (k1Var == null) {
            m6053a(63);
        }
        if (g0Var == null) {
            m6053a(64);
        }
        if (k1Var.mo6277L() || C7278i0.m23035a(g0Var)) {
            return false;
        }
        if (C7322s1.m22945b(g0Var)) {
            return true;
        }
        AbstractC10420h j = C13508c.m3531j(k1Var);
        if (!AbstractC10420h.m13368r0(g0Var)) {
            AbstractC7659e eVar = AbstractC7659e.f16659a;
            if (!eVar.mo21673c(j.m13406W(), g0Var) && !eVar.mo21673c(j.m13417K().mo6166p(), g0Var) && !eVar.mo21673c(j.m13387i(), g0Var) && !C10439o.m13312d(g0Var)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public static <D extends AbstractC11301b> D m6055L(D d) {
        if (d == null) {
            m6053a(59);
        }
        while (d.mo6245g() == AbstractC11301b.EnumC11302a.FAKE_OVERRIDE) {
            Collection<? extends AbstractC11301b> d2 = d.mo6249d();
            if (!d2.isEmpty()) {
                d = (D) ((AbstractC11301b) d2.iterator().next());
            } else {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
        }
        return d;
    }

    /* renamed from: M */
    public static <D extends AbstractC11367q> D m6054M(D d) {
        if (d == null) {
            m6053a(61);
        }
        if (d instanceof AbstractC11301b) {
            return m6055L((AbstractC11301b) d);
        }
        if (d == null) {
            m6053a(62);
        }
        return d;
    }

    /* renamed from: a */
    private static /* synthetic */ void m6053a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: b */
    public static boolean m6052b(AbstractC11346m mVar, AbstractC11346m mVar2) {
        if (mVar == null) {
            m6053a(16);
        }
        if (mVar2 == null) {
            m6053a(17);
        }
        return m6047g(mVar).equals(m6047g(mVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static <D extends AbstractC11297a> void m6051c(D d, Set<D> set) {
        if (d == null) {
            m6053a(70);
        }
        if (set == 0) {
            m6053a(71);
        }
        if (!set.contains(d)) {
            for (AbstractC11297a aVar : d.mo6162a().mo6249d()) {
                AbstractC11297a a = aVar.mo6162a();
                m6051c(a, set);
                set.add(a);
            }
        }
    }

    /* renamed from: d */
    public static <D extends AbstractC11297a> Set<D> m6050d(D d) {
        if (d == null) {
            m6053a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m6051c(d.mo6162a(), linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static AbstractC11313e m6049e(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m6053a(45);
        }
        return m6048f(g0Var.mo5172N0());
    }

    /* renamed from: f */
    public static AbstractC11313e m6048f(AbstractC7268g1 g1Var) {
        if (g1Var == null) {
            m6053a(46);
        }
        AbstractC11313e eVar = (AbstractC11313e) g1Var.mo4565p();
        if (eVar == null) {
            m6053a(47);
        }
        return eVar;
    }

    /* renamed from: g */
    public static AbstractC11327h0 m6047g(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(21);
        }
        AbstractC11327h0 i = m6045i(mVar);
        if (i == null) {
            m6053a(22);
        }
        return i;
    }

    /* renamed from: h */
    public static AbstractC11327h0 m6046h(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m6053a(20);
        }
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p == null) {
            return null;
        }
        return m6045i(p);
    }

    /* renamed from: i */
    public static AbstractC11327h0 m6045i(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(23);
        }
        while (mVar != null) {
            if (mVar instanceof AbstractC11327h0) {
                return (AbstractC11327h0) mVar;
            }
            if (mVar instanceof AbstractC11368q0) {
                return ((AbstractC11368q0) mVar).mo6179z0();
            }
            mVar = mVar.mo6104b();
        }
        return null;
    }

    /* renamed from: j */
    public static AbstractC11304b1 m6044j(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(79);
        }
        if (mVar instanceof AbstractC11392w0) {
            mVar = ((AbstractC11392w0) mVar).mo6459T();
        }
        if (mVar instanceof AbstractC11365p) {
            AbstractC11304b1 b = ((AbstractC11365p) mVar).mo6102j().mo4612b();
            if (b == null) {
                m6053a(80);
            }
            return b;
        }
        AbstractC11304b1 b1Var = AbstractC11304b1.f25237a;
        if (b1Var == null) {
            m6053a(81);
        }
        return b1Var;
    }

    /* renamed from: k */
    public static AbstractC11387u m6043k(AbstractC11313e eVar, boolean z) {
        if (eVar == null) {
            m6053a(48);
        }
        EnumC11317f g = eVar.mo6116g();
        if (g == EnumC11317f.ENUM_CLASS || g.m10214b()) {
            AbstractC11387u uVar = C11373t.f25295a;
            if (uVar == null) {
                m6053a(49);
            }
            return uVar;
        } else if (m6060G(eVar)) {
            if (z) {
                AbstractC11387u uVar2 = C11373t.f25297c;
                if (uVar2 == null) {
                    m6053a(50);
                }
                return uVar2;
            }
            AbstractC11387u uVar3 = C11373t.f25295a;
            if (uVar3 == null) {
                m6053a(51);
            }
            return uVar3;
        } else if (m6033u(eVar)) {
            AbstractC11387u uVar4 = C11373t.f25306l;
            if (uVar4 == null) {
                m6053a(52);
            }
            return uVar4;
        } else {
            AbstractC11387u uVar5 = C11373t.f25299e;
            if (uVar5 == null) {
                m6053a(53);
            }
            return uVar5;
        }
    }

    /* renamed from: l */
    public static AbstractC11396x0 m6042l(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(0);
        }
        if (mVar instanceof AbstractC11313e) {
            return ((AbstractC11313e) mVar).mo6174J0();
        }
        return null;
    }

    /* renamed from: m */
    public static C11138d m6041m(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(2);
        }
        C11137c o = m6039o(mVar);
        if (o != null) {
            return o.m10795j();
        }
        return m6038p(mVar);
    }

    /* renamed from: n */
    public static C11137c m6040n(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(3);
        }
        C11137c o = m6039o(mVar);
        if (o == null) {
            o = m6038p(mVar).m10782l();
        }
        if (o == null) {
            m6053a(4);
        }
        return o;
    }

    /* renamed from: o */
    private static C11137c m6039o(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(5);
        }
        if ((mVar instanceof AbstractC11327h0) || C8039k.m20765m(mVar)) {
            return C11137c.f24718c;
        }
        if (mVar instanceof AbstractC11368q0) {
            return ((AbstractC11368q0) mVar).mo6182e();
        }
        if (mVar instanceof AbstractC11344l0) {
            return ((AbstractC11344l0) mVar).mo6103e();
        }
        return null;
    }

    /* renamed from: p */
    private static C11138d m6038p(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(6);
        }
        C11138d c = m6041m(mVar.mo6104b()).m10791c(mVar.getName());
        if (c == null) {
            m6053a(7);
        }
        return c;
    }

    /* renamed from: q */
    public static <D extends AbstractC11346m> D m6037q(AbstractC11346m mVar, Class<D> cls) {
        if (cls == null) {
            m6053a(18);
        }
        return (D) m6036r(mVar, cls, true);
    }

    /* renamed from: r */
    public static <D extends AbstractC11346m> D m6036r(AbstractC11346m mVar, Class<D> cls, boolean z) {
        if (cls == null) {
            m6053a(19);
        }
        if (mVar == null) {
            return null;
        }
        if (z) {
            mVar = (D) mVar.mo6104b();
        }
        while (mVar != null) {
            if (cls.isInstance(mVar)) {
                return (D) mVar;
            }
            mVar = (D) mVar.mo6104b();
        }
        return null;
    }

    /* renamed from: s */
    public static AbstractC11313e m6035s(AbstractC11313e eVar) {
        if (eVar == null) {
            m6053a(44);
        }
        for (AbstractC7267g0 g0Var : eVar.mo6111k().mo4568m()) {
            AbstractC11313e e = m6049e(g0Var);
            if (e.mo6116g() != EnumC11317f.INTERFACE) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static boolean m6034t(AbstractC11346m mVar) {
        return m6063D(mVar, EnumC11317f.ANNOTATION_CLASS);
    }

    /* renamed from: u */
    public static boolean m6033u(AbstractC11346m mVar) {
        if (mVar == null) {
            m6053a(34);
        }
        if (!m6032v(mVar) || !mVar.getName().equals(C11144h.f24734b)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m6032v(AbstractC11346m mVar) {
        return m6063D(mVar, EnumC11317f.CLASS);
    }

    /* renamed from: w */
    public static boolean m6031w(AbstractC11346m mVar) {
        return m6032v(mVar) || m6066A(mVar);
    }

    /* renamed from: x */
    public static boolean m6030x(AbstractC11346m mVar) {
        return m6063D(mVar, EnumC11317f.OBJECT) && ((AbstractC11313e) mVar).mo6119X();
    }

    /* renamed from: y */
    public static boolean m6029y(AbstractC11346m mVar) {
        if (!(mVar instanceof AbstractC11367q) || ((AbstractC11367q) mVar).getVisibility() != C11373t.f25300f) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m6028z(AbstractC11313e eVar, AbstractC11313e eVar2) {
        if (eVar == null) {
            m6053a(26);
        }
        if (eVar2 == null) {
            m6053a(27);
        }
        for (AbstractC7267g0 g0Var : eVar.mo6111k().mo4568m()) {
            if (m6061F(g0Var, eVar2.mo6162a())) {
                return true;
            }
        }
        return false;
    }
}
