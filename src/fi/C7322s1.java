package fi;

import gi.AbstractC7664g;
import gi.AbstractC7677n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import p142hi.C8036h;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p286pi.C11773f;
import p448yh.AbstractC14411h;

/* renamed from: fi.s1 */
/* loaded from: classes8.dex */
public class C7322s1 {

    /* renamed from: a */
    public static final AbstractC7304o0 f15805a = C8039k.m20774d(EnumC8038j.DONT_CARE, new String[0]);

    /* renamed from: b */
    public static final AbstractC7304o0 f15806b = C8039k.m20774d(EnumC8038j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c */
    public static final AbstractC7304o0 f15807c = new C7323a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final AbstractC7304o0 f15808d = new C7323a("UNIT_EXPECTED_TYPE");

    /* renamed from: fi.s1$a */
    /* loaded from: classes8.dex */
    public static class C7323a extends AbstractC7317r {

        /* renamed from: l */
        private final String f15809l;

        public C7323a(String str) {
            this.f15809l = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
        /* renamed from: Z0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m22920Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L_0x0009
                if (r9 == r0) goto L_0x0009
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L_0x000b
            L_0x0009:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            L_0x000b:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L_0x0013
                if (r9 == r0) goto L_0x0013
                r5 = r3
                goto L_0x0014
            L_0x0013:
                r5 = r4
            L_0x0014:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L_0x0030
                if (r9 == r4) goto L_0x002b
                if (r9 == r3) goto L_0x0026
                if (r9 == r0) goto L_0x0030
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L_0x0032
            L_0x0026:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L_0x0032
            L_0x002b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L_0x0032
            L_0x0030:
                r5[r7] = r6
            L_0x0032:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L_0x003e
                if (r9 == r0) goto L_0x003b
                r5[r1] = r6
                goto L_0x0042
            L_0x003b:
                r5[r1] = r7
                goto L_0x0042
            L_0x003e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L_0x0042:
                if (r9 == r1) goto L_0x0056
                if (r9 == r4) goto L_0x0052
                if (r9 == r3) goto L_0x004f
                if (r9 == r0) goto L_0x0056
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L_0x0056
            L_0x004f:
                r5[r4] = r7
                goto L_0x0056
            L_0x0052:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L_0x0056:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L_0x0064
                if (r9 == r0) goto L_0x0064
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L_0x0069
            L_0x0064:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L_0x0069:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: fi.C7322s1.C7323a.m22920Z0(int):void");
        }

        @Override // fi.AbstractC7304o0
        /* renamed from: U0 */
        public AbstractC7304o0 mo5169R0(boolean z) {
            throw new IllegalStateException(this.f15809l);
        }

        @Override // fi.AbstractC7304o0
        /* renamed from: V0 */
        public AbstractC7304o0 mo5167T0(C7232c1 c1Var) {
            if (c1Var == null) {
                m22920Z0(0);
            }
            throw new IllegalStateException(this.f15809l);
        }

        @Override // fi.AbstractC7317r
        /* renamed from: W0 */
        protected AbstractC7304o0 mo22923W0() {
            throw new IllegalStateException(this.f15809l);
        }

        @Override // fi.AbstractC7317r
        /* renamed from: Y0 */
        public AbstractC7317r mo22921Y0(AbstractC7304o0 o0Var) {
            if (o0Var == null) {
                m22920Z0(2);
            }
            throw new IllegalStateException(this.f15809l);
        }

        /* renamed from: a1 */
        public C7323a mo22922X0(AbstractC7664g gVar) {
            if (gVar == null) {
                m22920Z0(3);
            }
            return this;
        }

        @Override // fi.AbstractC7304o0
        public String toString() {
            String str = this.f15809l;
            if (str == null) {
                m22920Z0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0178  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m22946a(int r24) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C7322s1.m22946a(int):void");
    }

    /* renamed from: b */
    public static boolean m22945b(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(28);
        }
        if (g0Var.mo5171O0()) {
            return true;
        }
        if (!C7235d0.m23144b(g0Var) || !m22945b(C7235d0.m23145a(g0Var).m23169W0())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m22944c(AbstractC7267g0 g0Var, Function1<AbstractC7335v1, Boolean> function1) {
        if (function1 == null) {
            m22946a(43);
        }
        return m22943d(g0Var, function1, null);
    }

    /* renamed from: d */
    private static boolean m22943d(AbstractC7267g0 g0Var, Function1<AbstractC7335v1, Boolean> function1, C11773f<AbstractC7267g0> fVar) {
        AbstractC7223a0 a0Var;
        if (function1 == null) {
            m22946a(44);
        }
        if (g0Var == null) {
            return false;
        }
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        if (m22924w(g0Var)) {
            return function1.invoke(Q0).booleanValue();
        }
        if (fVar != null && fVar.contains(g0Var)) {
            return false;
        }
        if (function1.invoke(Q0).booleanValue()) {
            return true;
        }
        if (fVar == null) {
            fVar = C11773f.m8658a();
        }
        fVar.add(g0Var);
        if (Q0 instanceof AbstractC7223a0) {
            a0Var = (AbstractC7223a0) Q0;
        } else {
            a0Var = null;
        }
        if (a0Var != null && (m22943d(a0Var.m23170V0(), function1, fVar) || m22943d(a0Var.m23169W0(), function1, fVar))) {
            return true;
        }
        if ((Q0 instanceof C7306p) && m22943d(((C7306p) Q0).m22991Z0(), function1, fVar)) {
            return true;
        }
        AbstractC7268g1 N0 = g0Var.mo5172N0();
        if (N0 instanceof C7245f0) {
            for (AbstractC7267g0 g0Var2 : ((C7245f0) N0).mo4568m()) {
                if (m22943d(g0Var2, function1, fVar)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC7290k1 k1Var : g0Var.mo5174L0()) {
            if (!k1Var.mo22907a()) {
                if (m22943d(k1Var.getType(), function1, fVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static AbstractC7267g0 m22942e(AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2, C7309p1 p1Var) {
        if (g0Var == null) {
            m22946a(20);
        }
        if (g0Var2 == null) {
            m22946a(21);
        }
        if (p1Var == null) {
            m22946a(22);
        }
        AbstractC7267g0 p = p1Var.m22970p(g0Var2, EnumC7338w1.INVARIANT);
        if (p != null) {
            return m22930q(p, g0Var.mo5171O0());
        }
        return null;
    }

    /* renamed from: f */
    public static AbstractC11313e m22941f(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(30);
        }
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p instanceof AbstractC11313e) {
            return (AbstractC11313e) p;
        }
        return null;
    }

    /* renamed from: g */
    public static List<AbstractC7290k1> m22940g(List<AbstractC11319f1> list) {
        List<AbstractC7290k1> D0;
        if (list == null) {
            m22946a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC11319f1 f1Var : list) {
            arrayList.add(new C7296m1(f1Var.mo6166p()));
        }
        D0 = C9914r.m14790D0(arrayList);
        if (D0 == null) {
            m22946a(17);
        }
        return D0;
    }

    /* renamed from: h */
    public static List<AbstractC7267g0> m22939h(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(18);
        }
        C7309p1 f = C7309p1.m22980f(g0Var);
        Collection<AbstractC7267g0> m = g0Var.mo5172N0().mo4568m();
        ArrayList arrayList = new ArrayList(m.size());
        for (AbstractC7267g0 g0Var2 : m) {
            AbstractC7267g0 e = m22942e(g0Var, g0Var2, f);
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static AbstractC11319f1 m22938i(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(63);
        }
        if (g0Var.mo5172N0().mo4565p() instanceof AbstractC11319f1) {
            return (AbstractC11319f1) g0Var.mo5172N0().mo4565p();
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m22937j(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(29);
        }
        if (g0Var.mo5172N0().mo4565p() instanceof AbstractC11313e) {
            return false;
        }
        for (AbstractC7267g0 g0Var2 : m22939h(g0Var)) {
            if (m22935l(g0Var2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m22936k(AbstractC7267g0 g0Var) {
        return g0Var != null && g0Var.mo5172N0() == f15805a.mo5172N0();
    }

    /* renamed from: l */
    public static boolean m22935l(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(27);
        }
        if (g0Var.mo5171O0()) {
            return true;
        }
        if (C7235d0.m23144b(g0Var) && m22935l(C7235d0.m23145a(g0Var).m23169W0())) {
            return true;
        }
        if (C7321s0.m22955c(g0Var)) {
            return false;
        }
        if (m22934m(g0Var)) {
            return m22937j(g0Var);
        }
        if (g0Var instanceof AbstractC7237e) {
            AbstractC11319f1 a = ((AbstractC7237e) g0Var).m23139W0().m21668a();
            if (a == null || m22937j(a.mo6166p())) {
                return true;
            }
            return false;
        }
        AbstractC7268g1 N0 = g0Var.mo5172N0();
        if (N0 instanceof C7245f0) {
            for (AbstractC7267g0 g0Var2 : N0.mo4568m()) {
                if (m22935l(g0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m22934m(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(60);
        }
        if (m22938i(g0Var) != null || (g0Var.mo5172N0() instanceof AbstractC7677n)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static AbstractC7267g0 m22933n(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(2);
        }
        return m22931p(g0Var, false);
    }

    /* renamed from: o */
    public static AbstractC7267g0 m22932o(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(1);
        }
        return m22931p(g0Var, true);
    }

    /* renamed from: p */
    public static AbstractC7267g0 m22931p(AbstractC7267g0 g0Var, boolean z) {
        if (g0Var == null) {
            m22946a(3);
        }
        AbstractC7335v1 R0 = g0Var.mo22868Q0().mo5169R0(z);
        if (R0 == null) {
            m22946a(4);
        }
        return R0;
    }

    /* renamed from: q */
    public static AbstractC7267g0 m22930q(AbstractC7267g0 g0Var, boolean z) {
        if (g0Var == null) {
            m22946a(8);
        }
        if (z) {
            return m22932o(g0Var);
        }
        if (g0Var == null) {
            m22946a(9);
        }
        return g0Var;
    }

    /* renamed from: r */
    public static AbstractC7304o0 m22929r(AbstractC7304o0 o0Var, boolean z) {
        if (o0Var == null) {
            m22946a(5);
        }
        if (z) {
            AbstractC7304o0 U0 = o0Var.mo5166U0(true);
            if (U0 == null) {
                m22946a(6);
            }
            return U0;
        }
        if (o0Var == null) {
            m22946a(7);
        }
        return o0Var;
    }

    /* renamed from: s */
    public static AbstractC7290k1 m22928s(AbstractC11319f1 f1Var) {
        if (f1Var == null) {
            m22946a(45);
        }
        return new C7329u0(f1Var);
    }

    /* renamed from: t */
    public static AbstractC7290k1 m22927t(AbstractC11319f1 f1Var, C7343y yVar) {
        if (f1Var == null) {
            m22946a(46);
        }
        if (yVar.mo22864b() == EnumC7319r1.SUPERTYPE) {
            return new C7296m1(C7333v0.m22891b(f1Var));
        }
        return new C7329u0(f1Var);
    }

    /* renamed from: u */
    public static AbstractC7304o0 m22926u(AbstractC7268g1 g1Var, AbstractC14411h hVar, Function1<AbstractC7664g, AbstractC7304o0> function1) {
        if (g1Var == null) {
            m22946a(12);
        }
        if (hVar == null) {
            m22946a(13);
        }
        if (function1 == null) {
            m22946a(14);
        }
        AbstractC7304o0 l = C7270h0.m23048l(C7232c1.f15671l.m23149h(), g1Var, m22940g(g1Var.getParameters()), false, hVar, function1);
        if (l == null) {
            m22946a(15);
        }
        return l;
    }

    /* renamed from: v */
    public static AbstractC7304o0 m22925v(AbstractC11326h hVar, AbstractC14411h hVar2, Function1<AbstractC7664g, AbstractC7304o0> function1) {
        if (!C8039k.m20765m(hVar)) {
            return m22926u(hVar.mo6111k(), hVar2, function1);
        }
        C8036h d = C8039k.m20774d(EnumC8038j.UNABLE_TO_SUBSTITUTE_TYPE, hVar.toString());
        if (d == null) {
            m22946a(11);
        }
        return d;
    }

    /* renamed from: w */
    public static boolean m22924w(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22946a(0);
        }
        if (g0Var == f15807c || g0Var == f15808d) {
            return true;
        }
        return false;
    }
}
