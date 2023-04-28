package fi;

import gi.C7668j;
import java.util.ArrayList;
import java.util.List;
import ki.C9883a;
import kotlin.jvm.functions.Function1;
import li.C10451b;
import p142hi.C8036h;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p217lg.AbstractC10420h;
import p217lg.C10434k;
import p249nh.C11137c;
import p268og.AbstractC11319f1;
import p286pi.C11761c;
import pg.AbstractC11672g;
import pg.C11679k;
import pg.C11682l;
import sh.C12902d;

/* renamed from: fi.p1 */
/* loaded from: classes8.dex */
public class C7309p1 {

    /* renamed from: b */
    public static final C7309p1 f15790b = m22979g(AbstractC7299n1.f15779b);

    /* renamed from: a */
    private final AbstractC7299n1 f15791a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.p1$a */
    /* loaded from: classes8.dex */
    public static class C7310a implements Function1<C11137c, Boolean> {
        C7310a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m22964a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        /* renamed from: b */
        public Boolean invoke(C11137c cVar) {
            if (cVar == null) {
                m22964a(0);
            }
            return Boolean.valueOf(!cVar.equals(C10434k.C10435a.f38791Q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.p1$b */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C7311b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15792a;

        static {
            int[] iArr = new int[EnumC7313d.values().length];
            f15792a = iArr;
            try {
                iArr[EnumC7313d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15792a[EnumC7313d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15792a[EnumC7313d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.p1$c */
    /* loaded from: classes8.dex */
    public static final class C7312c extends Exception {
        public C7312c(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.p1$d */
    /* loaded from: classes8.dex */
    public enum EnumC7313d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected C7309p1(AbstractC7299n1 n1Var) {
        if (n1Var == null) {
            m22985a(7);
        }
        this.f15791a = n1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m22985a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C7309p1.m22985a(int):void");
    }

    /* renamed from: b */
    private static void m22984b(int i, AbstractC7290k1 k1Var, AbstractC7299n1 n1Var) {
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m22971o(k1Var) + "; substitution: " + m22971o(n1Var));
        }
    }

    /* renamed from: c */
    public static EnumC7338w1 m22983c(EnumC7338w1 w1Var, AbstractC7290k1 k1Var) {
        if (w1Var == null) {
            m22985a(35);
        }
        if (k1Var == null) {
            m22985a(36);
        }
        if (!k1Var.mo22907a()) {
            return m22982d(w1Var, k1Var.mo22906b());
        }
        EnumC7338w1 w1Var2 = EnumC7338w1.OUT_VARIANCE;
        if (w1Var2 == null) {
            m22985a(37);
        }
        return w1Var2;
    }

    /* renamed from: d */
    public static EnumC7338w1 m22982d(EnumC7338w1 w1Var, EnumC7338w1 w1Var2) {
        if (w1Var == null) {
            m22985a(38);
        }
        if (w1Var2 == null) {
            m22985a(39);
        }
        EnumC7338w1 w1Var3 = EnumC7338w1.INVARIANT;
        if (w1Var == w1Var3) {
            if (w1Var2 == null) {
                m22985a(40);
            }
            return w1Var2;
        } else if (w1Var2 == w1Var3) {
            if (w1Var == null) {
                m22985a(41);
            }
            return w1Var;
        } else if (w1Var == w1Var2) {
            if (w1Var2 == null) {
                m22985a(42);
            }
            return w1Var2;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + w1Var + "' and projection kind '" + w1Var2 + "' cannot be combined");
        }
    }

    /* renamed from: e */
    private static EnumC7313d m22981e(EnumC7338w1 w1Var, EnumC7338w1 w1Var2) {
        EnumC7338w1 w1Var3 = EnumC7338w1.IN_VARIANCE;
        if (w1Var == w1Var3 && w1Var2 == EnumC7338w1.OUT_VARIANCE) {
            return EnumC7313d.OUT_IN_IN_POSITION;
        }
        if (w1Var == EnumC7338w1.OUT_VARIANCE && w1Var2 == w1Var3) {
            return EnumC7313d.IN_IN_OUT_POSITION;
        }
        return EnumC7313d.NO_CONFLICT;
    }

    /* renamed from: f */
    public static C7309p1 m22980f(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m22985a(6);
        }
        return m22979g(AbstractC7275h1.m23042i(g0Var.mo5172N0(), g0Var.mo5174L0()));
    }

    /* renamed from: g */
    public static C7309p1 m22979g(AbstractC7299n1 n1Var) {
        if (n1Var == null) {
            m22985a(0);
        }
        return new C7309p1(n1Var);
    }

    /* renamed from: h */
    public static C7309p1 m22978h(AbstractC7299n1 n1Var, AbstractC7299n1 n1Var2) {
        if (n1Var == null) {
            m22985a(3);
        }
        if (n1Var2 == null) {
            m22985a(4);
        }
        return m22979g(C7327u.m22909i(n1Var, n1Var2));
    }

    /* renamed from: i */
    private static AbstractC11672g m22977i(AbstractC11672g gVar) {
        if (gVar == null) {
            m22985a(33);
        }
        if (!gVar.mo9037l(C10434k.C10435a.f38791Q)) {
            return gVar;
        }
        return new C11682l(gVar, new C7310a());
    }

    /* renamed from: l */
    private static AbstractC7290k1 m22974l(AbstractC7267g0 g0Var, AbstractC7290k1 k1Var, AbstractC11319f1 f1Var, AbstractC7290k1 k1Var2) {
        if (g0Var == null) {
            m22985a(26);
        }
        if (k1Var == null) {
            m22985a(27);
        }
        if (k1Var2 == null) {
            m22985a(28);
        }
        if (!g0Var.getAnnotations().mo9037l(C10434k.C10435a.f38791Q)) {
            if (k1Var == null) {
                m22985a(29);
            }
            return k1Var;
        }
        AbstractC7268g1 N0 = k1Var.getType().mo5172N0();
        if (!(N0 instanceof C7668j)) {
            return k1Var;
        }
        AbstractC7290k1 b = ((C7668j) N0).mo5160b();
        EnumC7338w1 b2 = b.mo22906b();
        EnumC7313d e = m22981e(k1Var2.mo22906b(), b2);
        EnumC7313d dVar = EnumC7313d.OUT_IN_IN_POSITION;
        if (e == dVar) {
            return new C7296m1(b.getType());
        }
        if (f1Var == null) {
            return k1Var;
        }
        if (m22981e(f1Var.mo6392m(), b2) == dVar) {
            return new C7296m1(b.getType());
        }
        return k1Var;
    }

    /* renamed from: o */
    private static String m22971o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!C11761c.m8674a(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    /* renamed from: r */
    private AbstractC7290k1 m22968r(AbstractC7290k1 k1Var, int i) {
        AbstractC7267g0 g0Var;
        AbstractC7267g0 type = k1Var.getType();
        EnumC7338w1 b = k1Var.mo22906b();
        if (type.mo5172N0().mo4565p() instanceof AbstractC11319f1) {
            return k1Var;
        }
        AbstractC7304o0 b2 = C7321s0.m22956b(type);
        if (b2 != null) {
            g0Var = m22973m().m22970p(b2, EnumC7338w1.INVARIANT);
        } else {
            g0Var = null;
        }
        AbstractC7267g0 b3 = C7305o1.m22998b(type, m22967s(type.mo5172N0().getParameters(), type.mo5174L0(), i), this.f15791a.mo22912d(type.getAnnotations()));
        if ((b3 instanceof AbstractC7304o0) && (g0Var instanceof AbstractC7304o0)) {
            b3 = C7321s0.m22948j((AbstractC7304o0) b3, (AbstractC7304o0) g0Var);
        }
        return new C7296m1(b, b3);
    }

    /* renamed from: s */
    private List<AbstractC7290k1> m22967s(List<AbstractC11319f1> list, List<AbstractC7290k1> list2, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            AbstractC11319f1 f1Var = list.get(i2);
            AbstractC7290k1 k1Var = list2.get(i2);
            AbstractC7290k1 u = m22965u(k1Var, f1Var, i + 1);
            int i3 = C7311b.f15792a[m22981e(f1Var.mo6392m(), u.mo22906b()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                u = C7322s1.m22928s(f1Var);
            } else if (i3 == 3) {
                EnumC7338w1 m = f1Var.mo6392m();
                EnumC7338w1 w1Var = EnumC7338w1.INVARIANT;
                if (m != w1Var && !u.mo22907a()) {
                    u = new C7296m1(w1Var, u.getType());
                }
            }
            if (u != k1Var) {
                z = true;
            }
            arrayList.add(u);
        }
        if (!z) {
            return list2;
        }
        return arrayList;
    }

    /* renamed from: u */
    private AbstractC7290k1 m22965u(AbstractC7290k1 k1Var, AbstractC11319f1 f1Var, int i) {
        AbstractC7290k1 k1Var2;
        AbstractC7267g0 g0Var;
        if (k1Var == null) {
            m22985a(18);
        }
        m22984b(i, k1Var, this.f15791a);
        if (k1Var.mo22907a()) {
            return k1Var;
        }
        AbstractC7267g0 type = k1Var.getType();
        if (type instanceof AbstractC7326t1) {
            AbstractC7326t1 t1Var = (AbstractC7326t1) type;
            AbstractC7335v1 G0 = t1Var.mo22915G0();
            AbstractC7267g0 e0 = t1Var.mo22914e0();
            AbstractC7290k1 u = m22965u(new C7296m1(k1Var.mo22906b(), G0), f1Var, i + 1);
            if (u.mo22907a()) {
                return u;
            }
            return new C7296m1(u.mo22906b(), C7331u1.m22898d(u.getType().mo22868Q0(), m22970p(e0, k1Var.mo22906b())));
        }
        if (!C7336w.m22890a(type) && !(type.mo22868Q0() instanceof AbstractC7298n0)) {
            AbstractC7290k1 e = this.f15791a.mo5147e(type);
            if (e != null) {
                k1Var2 = m22974l(type, e, f1Var, k1Var);
            } else {
                k1Var2 = null;
            }
            EnumC7338w1 b = k1Var.mo22906b();
            if (k1Var2 == null && C7235d0.m23144b(type) && !C7240e1.m23134b(type)) {
                AbstractC7223a0 a = C7235d0.m23145a(type);
                int i2 = i + 1;
                AbstractC7290k1 u2 = m22965u(new C7296m1(b, a.m23170V0()), f1Var, i2);
                AbstractC7290k1 u3 = m22965u(new C7296m1(b, a.m23169W0()), f1Var, i2);
                EnumC7338w1 b2 = u2.mo22906b();
                if (u2.getType() == a.m23170V0() && u3.getType() == a.m23169W0()) {
                    return k1Var;
                }
                return new C7296m1(b2, C7270h0.m23056d(C7305o1.m22999a(u2.getType()), C7305o1.m22999a(u3.getType())));
            } else if (!AbstractC10420h.m13378m0(type) && !C7278i0.m23035a(type)) {
                if (k1Var2 != null) {
                    EnumC7313d e2 = m22981e(b, k1Var2.mo22906b());
                    if (!C12902d.m5152d(type)) {
                        int i3 = C7311b.f15792a[e2.ordinal()];
                        if (i3 == 1) {
                            throw new C7312c("Out-projection in in-position");
                        } else if (i3 == 2) {
                            return new C7296m1(EnumC7338w1.OUT_VARIANCE, type.mo5172N0().mo4567n().m13419I());
                        }
                    }
                    AbstractC7297n a2 = C7240e1.m23135a(type);
                    if (k1Var2.mo22907a()) {
                        return k1Var2;
                    }
                    if (a2 != null) {
                        g0Var = a2.mo22992I(k1Var2.getType());
                    } else {
                        g0Var = C7322s1.m22930q(k1Var2.getType(), type.mo5171O0());
                    }
                    if (!type.getAnnotations().isEmpty()) {
                        g0Var = C9883a.m15083v(g0Var, new C11679k(g0Var.getAnnotations(), m22977i(this.f15791a.mo22912d(type.getAnnotations()))));
                    }
                    if (e2 == EnumC7313d.NO_CONFLICT) {
                        b = m22982d(b, k1Var2.mo22906b());
                    }
                    return new C7296m1(b, g0Var);
                }
                k1Var = m22968r(k1Var, i);
                if (k1Var == null) {
                    m22985a(25);
                }
            }
        }
        return k1Var;
    }

    /* renamed from: j */
    public AbstractC7299n1 m22976j() {
        AbstractC7299n1 n1Var = this.f15791a;
        if (n1Var == null) {
            m22985a(8);
        }
        return n1Var;
    }

    /* renamed from: k */
    public boolean m22975k() {
        return this.f15791a.mo22911f();
    }

    /* renamed from: m */
    public C7309p1 m22973m() {
        AbstractC7299n1 n1Var = this.f15791a;
        if (!(n1Var instanceof C7239e0) || !n1Var.mo5148b()) {
            return this;
        }
        return new C7309p1(new C7239e0(((C7239e0) this.f15791a).m23136j(), ((C7239e0) this.f15791a).m23137i(), false));
    }

    /* renamed from: n */
    public AbstractC7267g0 m22972n(AbstractC7267g0 g0Var, EnumC7338w1 w1Var) {
        if (g0Var == null) {
            m22985a(9);
        }
        if (w1Var == null) {
            m22985a(10);
        }
        if (m22975k()) {
            if (g0Var == null) {
                m22985a(11);
            }
            return g0Var;
        }
        try {
            AbstractC7267g0 type = m22965u(new C7296m1(w1Var, g0Var), null, 0).getType();
            if (type == null) {
                m22985a(12);
            }
            return type;
        } catch (C7312c e) {
            C8036h d = C8039k.m20774d(EnumC8038j.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (d == null) {
                m22985a(13);
            }
            return d;
        }
    }

    /* renamed from: p */
    public AbstractC7267g0 m22970p(AbstractC7267g0 g0Var, EnumC7338w1 w1Var) {
        if (g0Var == null) {
            m22985a(14);
        }
        if (w1Var == null) {
            m22985a(15);
        }
        AbstractC7290k1 q = m22969q(new C7296m1(w1Var, m22976j().mo22910g(g0Var, w1Var)));
        if (q == null) {
            return null;
        }
        return q.getType();
    }

    /* renamed from: q */
    public AbstractC7290k1 m22969q(AbstractC7290k1 k1Var) {
        if (k1Var == null) {
            m22985a(16);
        }
        AbstractC7290k1 t = m22966t(k1Var);
        if (this.f15791a.mo22913a() || this.f15791a.mo5148b()) {
            return C10451b.m13146c(t, this.f15791a.mo5148b());
        }
        return t;
    }

    /* renamed from: t */
    public AbstractC7290k1 m22966t(AbstractC7290k1 k1Var) {
        if (k1Var == null) {
            m22985a(17);
        }
        if (m22975k()) {
            return k1Var;
        }
        try {
            return m22965u(k1Var, null, 0);
        } catch (C7312c unused) {
            return null;
        }
    }
}
