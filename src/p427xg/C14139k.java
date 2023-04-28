package p427xg;

import p217lg.C10414c;
import p217lg.C10415d;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11391w;
import p325rh.C12661e;

/* renamed from: xg.k */
/* loaded from: classes8.dex */
public final class C14139k {
    /* renamed from: a */
    private static /* synthetic */ void m1535a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static boolean m1534b(AbstractC11301b bVar) {
        AbstractC11391w t0;
        if (bVar == null) {
            m1535a(3);
        }
        if (!(bVar instanceof AbstractC11388u0) || (t0 = ((AbstractC11388u0) bVar).mo6435t0()) == null || !t0.getAnnotations().mo9037l(C14106a0.f31834b)) {
            return bVar.getAnnotations().mo9037l(C14106a0.f31834b);
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m1533c(AbstractC11346m mVar) {
        if (mVar == null) {
            m1535a(1);
        }
        if (!C12661e.m6030x(mVar) || !C12661e.m6031w(mVar.mo6104b()) || m1532d((AbstractC11313e) mVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m1532d(AbstractC11313e eVar) {
        if (eVar == null) {
            m1535a(2);
        }
        return C10415d.m13454a(C10414c.f22824a, eVar);
    }

    /* renamed from: e */
    public static boolean m1531e(AbstractC11388u0 u0Var) {
        if (u0Var == null) {
            m1535a(0);
        }
        if (u0Var.mo6245g() == AbstractC11301b.EnumC11302a.FAKE_OVERRIDE) {
            return false;
        }
        if (m1533c(u0Var.mo6104b())) {
            return true;
        }
        if (!C12661e.m6030x(u0Var.mo6104b()) || !m1534b(u0Var)) {
            return false;
        }
        return true;
    }
}
