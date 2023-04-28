package net.time4j;

import net.time4j.base.C10812b;
import net.time4j.base.C10813c;
import p143hj.AbstractC8074m0;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8085v;
import p143hj.AbstractC8091z;
import p143hj.EnumC8042a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.a1 */
/* loaded from: classes8.dex */
public final class C10788a1 extends AbstractC10778a<Integer> {

    /* renamed from: p */
    private static final AbstractC8074m0 f23955p = new C10791c();

    /* renamed from: q */
    static final C10788a1 f23956q = new C10788a1("YEAR_OF_WEEKDATE");
    private static final long serialVersionUID = -6907291758376370420L;

    /* renamed from: n */
    private final transient AbstractC10975o<C10892f0> f23957n = new C10792d(-1);

    /* renamed from: o */
    private final transient AbstractC10975o<C10892f0> f23958o = new C10792d(1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.a1$b */
    /* loaded from: classes8.dex */
    public static class C10790b<T extends AbstractC8080q<T>> implements AbstractC8091z<T, Integer> {
        private C10790b() {
        }

        /* renamed from: a */
        private AbstractC8079p<?> m12251a() {
            return C11045z0.f24547w.m11125n();
        }

        /* renamed from: q */
        private static C10892f0 m12244q(C10892f0 f0Var, int i) {
            int i2;
            int K = C10788a1.m12256K(i);
            int O = C10788a1.m12253O(f0Var);
            long h = EnumC8042a0.UNIX.m20754h(C10812b.m12206j(i, 1, 1), EnumC8042a0.MODIFIED_JULIAN_DATE) + (K - 1) + ((O - 1) * 7) + (f0Var.m11882E0().m11157c(C11045z0.f24547w) - 1);
            if (O == 53) {
                int K2 = C10788a1.m12256K(i + 1);
                if (C10812b.m12211e(i)) {
                    i2 = 366;
                } else {
                    i2 = 365;
                }
                if (((K2 + i2) - K) / 7 < 53) {
                    h -= 7;
                }
            }
            return f0Var.m11863W0(h - 730);
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(T t) {
            return m12251a();
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(T t) {
            return m12251a();
        }

        /* renamed from: i */
        public Integer mo11084d(T t) {
            return C10788a1.f23956q.mo11059f();
        }

        /* renamed from: j */
        public Integer mo11078k(T t) {
            return C10788a1.f23956q.mo11062T();
        }

        /* renamed from: o */
        public Integer mo11076n(T t) {
            C10892f0 f0Var = (C10892f0) t.mo11371r(C10892f0.f24172x);
            int m = f0Var.mo11643m();
            int F0 = f0Var.m11881F0();
            int L = C10788a1.m12255L(f0Var, 0);
            if (L > F0) {
                m--;
            } else if (((F0 - L) / 7) + 1 >= 53 && C10788a1.m12255L(f0Var, 1) + C10788a1.m12254N(f0Var, 0) <= F0) {
                m++;
            }
            return Integer.valueOf(m);
        }

        /* renamed from: p */
        public boolean mo11081h(T t, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= -999999999 && intValue <= 999999999;
        }

        /* renamed from: r */
        public T mo11077m(T t, Integer num, boolean z) {
            if (num != null) {
                AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
                return (T) t.mo15654D(pVar, m12244q((C10892f0) t.mo11371r(pVar), num.intValue()));
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* renamed from: net.time4j.a1$c */
    /* loaded from: classes8.dex */
    private static class C10791c<T extends AbstractC8080q<T>> implements AbstractC8074m0<T> {
        private C10791c() {
        }

        /* renamed from: c */
        public T mo11636b(T t, long j) {
            if (j == 0) {
                return t;
            }
            int g = C10813c.m12196g(C10813c.m12197f(((Integer) t.mo11371r(C10788a1.f23956q)).intValue(), j));
            AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
            C10892f0 f0Var = (C10892f0) t.mo11371r(pVar);
            int I0 = f0Var.m11878I0();
            EnumC11039x0 E0 = f0Var.m11882E0();
            if (I0 == 53) {
                I0 = ((Integer) C10892f0.m11872N0(g, 26, E0).mo11380b(C11045z0.f24547w.m11125n())).intValue();
            }
            return (T) t.mo15654D(pVar, C10892f0.m11872N0(g, I0, E0));
        }

        /* renamed from: d */
        public long mo11637a(T t, T t2) {
            AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
            C10892f0 f0Var = (C10892f0) t.mo11371r(pVar);
            C10892f0 f0Var2 = (C10892f0) t2.mo11371r(pVar);
            C10788a1 a1Var = C10788a1.f23956q;
            long intValue = ((Integer) f0Var2.mo11371r(a1Var)).intValue() - ((Integer) f0Var.mo11371r(a1Var)).intValue();
            int i = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
            if (i == 0) {
                return intValue;
            }
            int O = C10788a1.m12253O(f0Var);
            int O2 = C10788a1.m12253O(f0Var2);
            if (i > 0 && O > O2) {
                intValue--;
            } else if (i < 0 && O < O2) {
                intValue++;
            }
            int i2 = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
            if (i2 == 0 || O != O2) {
                return intValue;
            }
            int b = f0Var.m11882E0().m11158b();
            int b2 = f0Var2.m11882E0().m11158b();
            if (i2 > 0 && b > b2) {
                intValue--;
            } else if (i2 < 0 && b < b2) {
                intValue++;
            }
            int i3 = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
            if (i3 == 0 || b != b2) {
                return intValue;
            }
            AbstractC8079p<C10906g0> pVar2 = C10906g0.f24207y;
            if (!t.mo11377e(pVar2) || !t2.mo11377e(pVar2)) {
                return intValue;
            }
            C10906g0 g0Var = (C10906g0) t.mo11371r(pVar2);
            C10906g0 g0Var2 = (C10906g0) t2.mo11371r(pVar2);
            if (i3 > 0 && g0Var.m11784A0(g0Var2)) {
                return intValue - 1;
            }
            if (i3 >= 0 || !g0Var.m11783B0(g0Var2)) {
                return intValue;
            }
            return intValue + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.a1$d */
    /* loaded from: classes8.dex */
    public static class C10792d extends AbstractC10975o<C10892f0> {

        /* renamed from: m */
        private final long f23959m;

        /* renamed from: n */
        private final AbstractC8085v<C10917h0> f23960n;

        /* renamed from: net.time4j.a1$d$a */
        /* loaded from: classes8.dex */
        class C10793a implements AbstractC8085v<C10917h0> {
            C10793a() {
            }

            /* renamed from: a */
            public C10917h0 apply(C10917h0 h0Var) {
                return (C10917h0) C10788a1.m12252P().mo11636b(h0Var, C10792d.this.f23959m);
            }
        }

        /* renamed from: c */
        public C10892f0 apply(C10892f0 f0Var) {
            return (C10892f0) C10788a1.m12252P().mo11636b(f0Var, this.f23959m);
        }

        private C10792d(long j) {
            super(C10788a1.f23956q, 8);
            this.f23959m = j;
            this.f23960n = new C10793a();
        }
    }

    private C10788a1(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static <T extends AbstractC8080q<T>> AbstractC8091z<T, Integer> m12259H(Class<T> cls) {
        return new C10790b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static int m12256K(int i) {
        EnumC11039x0 f = EnumC11039x0.m11154f(C10812b.m12213c(i, 1, 1));
        C11045z0 z0Var = C11045z0.f24547w;
        int c = f.m11157c(z0Var);
        if (c <= 8 - z0Var.m11132g()) {
            return 2 - c;
        }
        return 9 - c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static int m12255L(C10892f0 f0Var, int i) {
        return m12256K(f0Var.mo11643m() + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static int m12254N(C10892f0 f0Var, int i) {
        return C10812b.m12211e(f0Var.mo11643m() + i) ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static int m12253O(C10892f0 f0Var) {
        int F0 = f0Var.m11881F0();
        int L = m12255L(f0Var, 0);
        if (L <= F0) {
            int i = ((F0 - L) / 7) + 1;
            if (i < 53 || m12255L(f0Var, 1) + m12254N(f0Var, 0) > F0) {
                return i;
            }
            return 1;
        }
        return (((F0 + m12254N(f0Var, -1)) - m12255L(f0Var, -1)) / 7) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static <T extends AbstractC8080q<T>> AbstractC8074m0<T> m12252P() {
        return f23955p;
    }

    private Object readResolve() {
        return f23956q;
    }

    /* renamed from: I */
    public Integer mo11059f() {
        return C10892f0.f24165q;
    }

    /* renamed from: J */
    public Integer mo11062T() {
        return C10892f0.f24164p;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return false;
    }

    @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return 'Y';
    }

    @Override // p143hj.AbstractC8079p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }
}
