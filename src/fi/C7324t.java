package fi;

import java.util.HashMap;
import java.util.List;
import ki.C9883a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p324rg.C12617k0;

/* renamed from: fi.t */
/* loaded from: classes8.dex */
public class C7324t {
    /* renamed from: a */
    private static /* synthetic */ void m22918a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static C7309p1 m22917b(List<AbstractC11319f1> list, AbstractC7299n1 n1Var, AbstractC11346m mVar, List<AbstractC11319f1> list2) {
        if (list == null) {
            m22918a(0);
        }
        if (n1Var == null) {
            m22918a(1);
        }
        if (mVar == null) {
            m22918a(2);
        }
        if (list2 == null) {
            m22918a(3);
        }
        C7309p1 c = m22916c(list, n1Var, mVar, list2, null);
        if (c != null) {
            return c;
        }
        throw new AssertionError("Substitution failed");
    }

    /* renamed from: c */
    public static C7309p1 m22916c(List<AbstractC11319f1> list, AbstractC7299n1 n1Var, AbstractC11346m mVar, List<AbstractC11319f1> list2, boolean[] zArr) {
        C7309p1 p1Var;
        if (list == null) {
            m22918a(5);
        }
        if (n1Var == null) {
            m22918a(6);
        }
        if (mVar == null) {
            m22918a(7);
        }
        if (list2 == null) {
            m22918a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        for (AbstractC11319f1 f1Var : list) {
            C12617k0 P0 = C12617k0.m6330P0(mVar, f1Var.getAnnotations(), f1Var.mo6391w(), f1Var.mo6392m(), f1Var.getName(), i, AbstractC11299a1.f25230a, f1Var.mo6394K());
            hashMap.put(f1Var.mo6111k(), new C7296m1(P0.mo6166p()));
            hashMap2.put(f1Var, P0);
            list2.add(P0);
            i++;
        }
        AbstractC7275h1 j = AbstractC7275h1.m23041j(hashMap);
        C7309p1 h = C7309p1.m22978h(n1Var, j);
        C7309p1 h2 = C7309p1.m22978h(n1Var.m23002h(), j);
        for (AbstractC11319f1 f1Var2 : list) {
            C12617k0 k0Var = (C12617k0) hashMap2.get(f1Var2);
            for (AbstractC7267g0 g0Var : f1Var2.getUpperBounds()) {
                AbstractC11326h p = g0Var.mo5172N0().mo4565p();
                if (!(p instanceof AbstractC11319f1) || !C9883a.m15094k((AbstractC11319f1) p)) {
                    p1Var = h2;
                } else {
                    p1Var = h;
                }
                AbstractC7267g0 p2 = p1Var.m22970p(g0Var, EnumC7338w1.OUT_VARIANCE);
                if (p2 == null) {
                    return null;
                }
                if (!(p2 == g0Var || zArr == null)) {
                    zArr[0] = true;
                }
                k0Var.m6333M0(p2);
            }
            k0Var.m6324V0();
        }
        return h;
    }
}
