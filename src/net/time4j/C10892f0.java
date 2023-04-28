package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.EnumC10882f;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10814d;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.C10812b;
import net.time4j.base.C10813c;
import p143hj.AbstractC8047c0;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8049d0;
import p143hj.AbstractC8053f0;
import p143hj.AbstractC8056g;
import p143hj.AbstractC8068k;
import p143hj.AbstractC8073m;
import p143hj.AbstractC8074m0;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8082s;
import p143hj.AbstractC8084u;
import p143hj.AbstractC8090y;
import p143hj.AbstractC8091z;
import p143hj.C8059h0;
import p143hj.C8087x;
import p143hj.EnumC8042a0;
import p143hj.EnumC8076n0;
import p161ij.AbstractC8633c;
import p161ij.AbstractC8638h;
import p161ij.C8629b;
import p161ij.EnumC8635e;

@AbstractC8633c("iso8601")
/* renamed from: net.time4j.f0 */
/* loaded from: classes8.dex */
public final class C10892f0 extends AbstractC8073m<AbstractC11032u, C10892f0> implements AbstractC10811a, AbstractC8049d0<EnumC10882f>, AbstractC8638h {

    /* renamed from: A */
    public static final AbstractC10819c<Integer, C10892f0> f38896A;

    /* renamed from: B */
    public static final AbstractC10820c0<EnumC10970m0> f38897B;

    /* renamed from: C */
    public static final AbstractC10820c0<EnumC10809b0> f38898C;

    /* renamed from: D */
    public static final AbstractC10966k0<Integer, C10892f0> f38899D;

    /* renamed from: E */
    public static final AbstractC10966k0<Integer, C10892f0> f38900E;

    /* renamed from: F */
    public static final AbstractC10820c0<EnumC11039x0> f38901F;

    /* renamed from: G */
    public static final AbstractC10966k0<Integer, C10892f0> f38902G;

    /* renamed from: H */
    public static final AbstractC10966k0<Integer, C10892f0> f38903H;

    /* renamed from: I */
    public static final AbstractC10879d0 f38904I;

    /* renamed from: J */
    private static final Map<String, Object> f38905J;

    /* renamed from: K */
    private static final AbstractC8068k<C10892f0> f38906K;

    /* renamed from: L */
    private static final C8059h0<AbstractC11032u, C10892f0> f38907L;
    private static final long serialVersionUID = -6698431452072325688L;

    /* renamed from: v */
    private static final int[] f24170v;

    /* renamed from: w */
    private static final int[] f24171w;

    /* renamed from: x */
    static final AbstractC8079p<C10892f0> f24172x;

    /* renamed from: y */
    public static final AbstractC10880e f24173y;

    /* renamed from: z */
    public static final AbstractC10819c<Integer, C10892f0> f24174z;

    /* renamed from: k */
    private final transient int f24175k;

    /* renamed from: l */
    private final transient byte f24176l;

    /* renamed from: m */
    private final transient byte f24177m;

    /* renamed from: n */
    static final C10892f0 f24162n = new C10892f0(-999999999, 1, 1);

    /* renamed from: o */
    static final C10892f0 f24163o = new C10892f0(999999999, 12, 31);

    /* renamed from: p */
    static final Integer f24164p = -999999999;

    /* renamed from: q */
    static final Integer f24165q = 999999999;

    /* renamed from: r */
    private static final Integer f24166r = 1;

    /* renamed from: s */
    private static final Integer f24167s = 12;

    /* renamed from: t */
    private static final Integer f24168t = 365;

    /* renamed from: u */
    private static final Integer f24169u = 366;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.f0$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10893a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24178a;

        /* renamed from: b */
        static final /* synthetic */ int[] f24179b;

        static {
            int[] iArr = new int[EnumC10970m0.values().length];
            f24179b = iArr;
            try {
                iArr[EnumC10970m0.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24179b[EnumC10970m0.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC10882f.values().length];
            f24178a = iArr2;
            try {
                iArr2[EnumC10882f.f24148k.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24178a[EnumC10882f.f24149l.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24178a[EnumC10882f.f24150m.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24178a[EnumC10882f.f24151n.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24178a[EnumC10882f.f24152o.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24178a[EnumC10882f.f24153p.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24178a[EnumC10882f.f24154q.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24178a[EnumC10882f.f24155r.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: net.time4j.f0$b */
    /* loaded from: classes8.dex */
    private static class C10894b implements AbstractC8091z<C10892f0, C10892f0> {
        private C10894b() {
        }

        /* synthetic */ C10894b(C10893a aVar) {
            this();
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(C10892f0 f0Var) {
            return null;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(C10892f0 f0Var) {
            return null;
        }

        /* renamed from: f */
        public C10892f0 mo11084d(C10892f0 f0Var) {
            return C10892f0.f24163o;
        }

        /* renamed from: i */
        public C10892f0 mo11078k(C10892f0 f0Var) {
            return C10892f0.f24162n;
        }

        /* renamed from: j */
        public C10892f0 mo11076n(C10892f0 f0Var) {
            return f0Var;
        }

        /* renamed from: o */
        public boolean mo11081h(C10892f0 f0Var, C10892f0 f0Var2) {
            return f0Var2 != null;
        }

        /* renamed from: p */
        public C10892f0 mo11077m(C10892f0 f0Var, C10892f0 f0Var2, boolean z) {
            if (f0Var2 != null) {
                return f0Var2;
            }
            throw new IllegalArgumentException("Missing date value.");
        }
    }

    /* renamed from: net.time4j.f0$c */
    /* loaded from: classes8.dex */
    private static class C10895c<V extends Enum<V>> implements AbstractC8091z<C10892f0, V> {

        /* renamed from: k */
        private final String f24180k;

        /* renamed from: l */
        private final Class<V> f24181l;

        /* renamed from: m */
        private final V f24182m;

        /* renamed from: n */
        private final V f24183n;

        /* renamed from: o */
        private final int f24184o;

        C10895c(String str, Class<V> cls, V v, V v2, int i) {
            this.f24180k = str;
            this.f24181l = cls;
            this.f24182m = v;
            this.f24183n = v2;
            this.f24184o = i;
        }

        /* renamed from: a */
        private AbstractC8079p<?> m11823a() {
            switch (this.f24184o) {
                case 101:
                    return C10892f0.f38900E;
                case 102:
                    return null;
                case 103:
                    return C10892f0.f38903H;
                default:
                    throw new UnsupportedOperationException(this.f24180k);
            }
        }

        /* renamed from: q */
        static <V extends Enum<V>> C10895c<V> m11816q(AbstractC8079p<V> pVar) {
            return new C10895c<>(pVar.name(), pVar.getType(), pVar.mo11062T(), pVar.mo11059f(), ((C10977p) pVar).m11395G());
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(C10892f0 f0Var) {
            return m11823a();
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(C10892f0 f0Var) {
            return m11823a();
        }

        /* renamed from: i */
        public V mo11084d(C10892f0 f0Var) {
            if (this.f24184o == 102 && f0Var.f24175k == 999999999 && f0Var.f24176l == 12 && f0Var.f24177m >= 27) {
                return this.f24181l.cast(EnumC11039x0.FRIDAY);
            }
            return this.f24183n;
        }

        /* renamed from: j */
        public V mo11078k(C10892f0 f0Var) {
            return this.f24182m;
        }

        /* renamed from: o */
        public V mo11076n(C10892f0 f0Var) {
            Object obj;
            switch (this.f24184o) {
                case 101:
                    obj = EnumC10809b0.m12219d(f0Var.f24176l);
                    break;
                case 102:
                    obj = f0Var.m11882E0();
                    break;
                case 103:
                    obj = EnumC10970m0.m11419d(((f0Var.f24176l - 1) / 3) + 1);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f24180k);
            }
            return this.f24181l.cast(obj);
        }

        /* renamed from: p */
        public boolean mo11081h(C10892f0 f0Var, V v) {
            if (v == null) {
                return false;
            }
            if (this.f24184o != 102 || f0Var.f24175k != 999999999) {
                return true;
            }
            try {
                mo11077m(f0Var, v, false);
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        /* renamed from: r */
        public C10892f0 mo11077m(C10892f0 f0Var, V v, boolean z) {
            if (v != null) {
                switch (this.f24184o) {
                    case 101:
                        return f0Var.m11862X0(((EnumC10809b0) EnumC10809b0.class.cast(v)).m12221b());
                    case 102:
                        return f0Var.m11865U0((EnumC11039x0) EnumC11039x0.class.cast(v));
                    case 103:
                        return (C10892f0) f0Var.m20683K(((EnumC10970m0) EnumC10970m0.class.cast(v)).m11421b() - (((f0Var.f24176l - 1) / 3) + 1), EnumC10882f.f24152o);
                    default:
                        throw new UnsupportedOperationException(this.f24180k);
                }
            } else {
                throw new IllegalArgumentException("Missing element value.");
            }
        }
    }

    /* renamed from: net.time4j.f0$d */
    /* loaded from: classes8.dex */
    private static class C10896d implements AbstractC8047c0<C10892f0> {

        /* renamed from: k */
        private final AbstractC8079p<?> f24185k;

        /* renamed from: l */
        private final String f24186l;

        /* renamed from: m */
        private final int f24187m;

        C10896d(AbstractC8079p<Integer> pVar) {
            this(((C10985s) pVar).m11362G(), pVar);
        }

        /* renamed from: a */
        private AbstractC8079p<?> m11814a() {
            switch (this.f24187m) {
                case 14:
                    return C10892f0.f38899D;
                case 15:
                    return C10892f0.f38900E;
                case 16:
                case 17:
                case 18:
                case 19:
                    return null;
                default:
                    throw new UnsupportedOperationException(this.f24186l);
            }
        }

        /* renamed from: o */
        private static int m11807o(C10892f0 f0Var) {
            int i = ((f0Var.f24176l - 1) / 3) + 1;
            if (i == 1) {
                if (C10812b.m12211e(f0Var.f24175k)) {
                    return 91;
                }
                return 90;
            } else if (i == 2) {
                return 91;
            } else {
                return 92;
            }
        }

        /* renamed from: p */
        private int m11806p(C10892f0 f0Var) {
            int d = C10812b.m12212d(f0Var.f24175k, f0Var.f24176l);
            byte b = f0Var.f24177m;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if ((i2 * 7) + b > d) {
                    return (((b + (i * 7)) - 1) / 7) + 1;
                }
                i = i2;
            }
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(C10892f0 f0Var) {
            return m11814a();
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(C10892f0 f0Var) {
            return m11814a();
        }

        /* renamed from: i */
        public int mo11808l(C10892f0 f0Var) {
            switch (this.f24187m) {
                case 14:
                    return f0Var.f24175k;
                case 15:
                    return f0Var.f24176l;
                case 16:
                    return f0Var.f24177m;
                case 17:
                    return f0Var.m11881F0();
                case 18:
                    return f0Var.m11883D0();
                case 19:
                    return ((f0Var.f24177m - 1) / 7) + 1;
                default:
                    throw new UnsupportedOperationException(this.f24186l);
            }
        }

        /* renamed from: j */
        public Integer mo11084d(C10892f0 f0Var) {
            switch (this.f24187m) {
                case 14:
                    return C10892f0.f24165q;
                case 15:
                    return C10892f0.f24167s;
                case 16:
                    return Integer.valueOf(C10812b.m12212d(f0Var.f24175k, f0Var.f24176l));
                case 17:
                    if (C10812b.m12211e(f0Var.f24175k)) {
                        return C10892f0.f24169u;
                    }
                    return C10892f0.f24168t;
                case 18:
                    return Integer.valueOf(m11807o(f0Var));
                case 19:
                    return Integer.valueOf(m11806p(f0Var));
                default:
                    throw new UnsupportedOperationException(this.f24186l);
            }
        }

        /* renamed from: q */
        public Integer mo11078k(C10892f0 f0Var) {
            switch (this.f24187m) {
                case 14:
                    return C10892f0.f24164p;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return C10892f0.f24166r;
                default:
                    throw new UnsupportedOperationException(this.f24186l);
            }
        }

        /* renamed from: r */
        public Integer mo11076n(C10892f0 f0Var) {
            return Integer.valueOf(mo11808l(f0Var));
        }

        /* renamed from: s */
        public boolean m11803s(C10892f0 f0Var, int i) {
            int i2;
            switch (this.f24187m) {
                case 14:
                    if (i < -999999999 || i > 999999999) {
                        return false;
                    }
                    return true;
                case 15:
                    if (i < 1 || i > 12) {
                        return false;
                    }
                    return true;
                case 16:
                    if (i < 1 || i > C10812b.m12212d(f0Var.f24175k, f0Var.f24176l)) {
                        return false;
                    }
                    return true;
                case 17:
                    if (i < 1) {
                        return false;
                    }
                    if (C10812b.m12211e(f0Var.f24175k)) {
                        i2 = 366;
                    } else {
                        i2 = 365;
                    }
                    if (i <= i2) {
                        return true;
                    }
                    return false;
                case 18:
                    if (i < 1 || i > m11807o(f0Var)) {
                        return false;
                    }
                    return true;
                case 19:
                    if (i < 1 || i > m11806p(f0Var)) {
                        return false;
                    }
                    return true;
                default:
                    throw new UnsupportedOperationException(this.f24186l);
            }
        }

        /* renamed from: t */
        public boolean mo11081h(C10892f0 f0Var, Integer num) {
            return num != null && m11803s(f0Var, num.intValue());
        }

        /* renamed from: u */
        public C10892f0 mo11811g(C10892f0 f0Var, int i, boolean z) {
            if (z) {
                return (C10892f0) f0Var.m20683K(C10813c.m12191l(i, mo11808l(f0Var)), (AbstractC11032u) C10892f0.f38907L.m20711L(this.f24185k));
            }
            switch (this.f24187m) {
                case 14:
                    return f0Var.m11860Y0(i);
                case 15:
                    return f0Var.m11862X0(i);
                case 16:
                    return f0Var.m11866T0(i);
                case 17:
                    return f0Var.m11864V0(i);
                case 18:
                    if (i >= 1 && i <= m11807o(f0Var)) {
                        return (C10892f0) f0Var.m20683K(i - f0Var.m11883D0(), EnumC10882f.f24155r);
                    }
                    throw new IllegalArgumentException("Out of range: " + i);
                case 19:
                    if (z || (i >= 1 && i <= m11806p(f0Var))) {
                        return (C10892f0) f0Var.m20683K(i - (((f0Var.f24177m - 1) / 7) + 1), EnumC10882f.f24154q);
                    }
                    throw new IllegalArgumentException("Out of range: " + i);
                default:
                    throw new UnsupportedOperationException(this.f24186l);
            }
        }

        /* renamed from: v */
        public C10892f0 mo11077m(C10892f0 f0Var, Integer num, boolean z) {
            if (num != null) {
                return mo11811g(f0Var, num.intValue(), z);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        C10896d(int i, AbstractC8079p<?> pVar) {
            this.f24185k = pVar;
            this.f24186l = pVar.name();
            this.f24187m = i;
        }
    }

    /* renamed from: net.time4j.f0$e */
    /* loaded from: classes8.dex */
    private static class C10897e implements AbstractC8084u<C10892f0> {

        /* renamed from: k */
        private static final int f24188k = C10812b.m12207i(C10812b.m12204l(EnumC8042a0.MODIFIED_JULIAN_DATE.m20754h(C10813c.m12201b(System.currentTimeMillis(), 86400000), EnumC8042a0.UNIX))) + 20;

        private C10897e() {
        }

        /* synthetic */ C10897e(C10893a aVar) {
            this();
        }

        /* renamed from: e */
        private static void m11798e(AbstractC8080q<?> qVar, String str) {
            EnumC8076n0 n0Var = EnumC8076n0.ERROR_MESSAGE;
            if (qVar.mo15651z(n0Var, str)) {
                qVar.mo15654D(n0Var, str);
            }
        }

        /* renamed from: i */
        private static boolean m11796i(AbstractC8080q<?> qVar, int i, int i2, int i3) {
            if (i3 >= 1 && (i3 <= 28 || i3 <= C10812b.m12212d(i, i2))) {
                return true;
            }
            m11798e(qVar, "DAY_OF_MONTH out of range: " + i3);
            return false;
        }

        /* renamed from: j */
        private static boolean m11795j(AbstractC8080q<?> qVar, boolean z, EnumC10970m0 m0Var, int i) {
            int i2 = C10893a.f24179b[m0Var.ordinal()];
            int i3 = 91;
            if (i2 != 1) {
                if (i2 != 2) {
                    i3 = 92;
                }
            } else if (!z) {
                i3 = 90;
            }
            if (i >= 1 && i <= i3) {
                return true;
            }
            m11798e(qVar, "DAY_OF_QUARTER out of range: " + i);
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r4 > r1) goto L_0x0013;
         */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m11794l(p143hj.AbstractC8080q<?> r2, int r3, int r4) {
            /*
                r0 = 1
                if (r4 < r0) goto L_0x0013
                r1 = 365(0x16d, float:5.11E-43)
                if (r4 <= r1) goto L_0x0012
                boolean r3 = net.time4j.base.C10812b.m12211e(r3)
                if (r3 == 0) goto L_0x000f
                r1 = 366(0x16e, float:5.13E-43)
            L_0x000f:
                if (r4 <= r1) goto L_0x0012
                goto L_0x0013
            L_0x0012:
                return r0
            L_0x0013:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "DAY_OF_YEAR out of range: "
                r3.append(r0)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                m11798e(r2, r3)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10892f0.C10897e.m11794l(hj.q, int, int):boolean");
        }

        /* renamed from: m */
        private static boolean m11793m(AbstractC8080q<?> qVar, int i) {
            if (i >= 1 && i <= 12) {
                return true;
            }
            m11798e(qVar, "MONTH_OF_YEAR out of range: " + i);
            return false;
        }

        /* renamed from: n */
        private static boolean m11792n(AbstractC8080q<?> qVar, int i) {
            if (i >= -999999999 && i <= 999999999) {
                return true;
            }
            m11798e(qVar, "YEAR out of range: " + i);
            return false;
        }

        /* renamed from: a */
        public C10892f0 mo11614k(AbstractC8080q<?> qVar, AbstractC8048d dVar, boolean z, boolean z2) {
            EnumC11039x0 x0Var;
            AbstractC10966k0<Integer, C10892f0> k0Var;
            int s;
            AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
            if (qVar.mo11377e(pVar)) {
                return (C10892f0) qVar.mo11371r(pVar);
            }
            int s2 = qVar.mo11370s(C10892f0.f24174z);
            if (s2 != Integer.MIN_VALUE) {
                AbstractC10966k0<Integer, C10892f0> k0Var2 = C10892f0.f38899D;
                int s3 = qVar.mo11370s(k0Var2);
                if (s3 == Integer.MIN_VALUE) {
                    AbstractC10820c0<EnumC10809b0> c0Var = C10892f0.f38898C;
                    if (qVar.mo11377e(c0Var)) {
                        s3 = ((EnumC10809b0) qVar.mo11371r(c0Var)).m12221b();
                    }
                }
                if (s3 == Integer.MIN_VALUE || (s = qVar.mo11370s((k0Var = C10892f0.f38900E))) == Integer.MIN_VALUE) {
                    AbstractC10966k0<Integer, C10892f0> k0Var3 = C10892f0.f38902G;
                    int s4 = qVar.mo11370s(k0Var3);
                    if (s4 == Integer.MIN_VALUE) {
                        int s5 = qVar.mo11370s(C10892f0.f38903H);
                        if (s5 != Integer.MIN_VALUE) {
                            AbstractC10820c0<EnumC10970m0> c0Var2 = C10892f0.f38897B;
                            if (qVar.mo11377e(c0Var2)) {
                                EnumC10970m0 m0Var = (EnumC10970m0) qVar.mo11371r(c0Var2);
                                boolean e = C10812b.m12211e(s2);
                                int i = (e ? 91 : 90) + s5;
                                if (m0Var == EnumC10970m0.Q1) {
                                    i = s5;
                                } else if (m0Var == EnumC10970m0.Q3) {
                                    i += 91;
                                } else if (m0Var == EnumC10970m0.Q4) {
                                    i += 183;
                                }
                                if (z) {
                                    return (C10892f0) C10892f0.m11876K0(s2, 1).m20660E(k0Var3.mo11163B(Integer.valueOf(i)));
                                }
                                if (!m11792n(qVar, s2) || !m11795j(qVar, e, m0Var, s5)) {
                                    return null;
                                }
                                return C10892f0.m11876K0(s2, i);
                            }
                        }
                    } else if (z) {
                        return (C10892f0) C10892f0.m11876K0(s2, 1).m20660E(k0Var3.mo11163B(Integer.valueOf(s4)));
                    } else {
                        if (!m11792n(qVar, s2) || !m11794l(qVar, s2, s4)) {
                            return null;
                        }
                        return C10892f0.m11876K0(s2, s4);
                    }
                } else if (z) {
                    return (C10892f0) ((C10892f0) C10892f0.m11875L0(s2, 1, 1).m20660E(k0Var2.mo11163B(Integer.valueOf(s3)))).m20660E(k0Var.mo11163B(Integer.valueOf(s)));
                } else {
                    if (!m11792n(qVar, s2) || !m11793m(qVar, s3) || !m11796i(qVar, s2, s3, s)) {
                        return null;
                    }
                    return C10892f0.m11873M0(s2, s3, s, false);
                }
            }
            int s6 = qVar.mo11370s(C10892f0.f38896A);
            if (s6 != Integer.MIN_VALUE) {
                C11045z0 z0Var = C11045z0.f24547w;
                if (qVar.mo11377e(z0Var.m11125n())) {
                    int intValue = ((Integer) qVar.mo11371r(z0Var.m11125n())).intValue();
                    AbstractC10820c0<EnumC11039x0> c0Var3 = C10892f0.f38901F;
                    if (qVar.mo11377e(c0Var3)) {
                        x0Var = (EnumC11039x0) qVar.mo11371r(c0Var3);
                    } else {
                        if (qVar.mo11377e(z0Var.m11130i())) {
                            x0Var = (EnumC11039x0) qVar.mo11371r(z0Var.m11130i());
                        }
                        return null;
                    }
                    if (s6 < -999999999 || s6 > 999999999) {
                        m11798e(qVar, C10892f0.m11856a1(s6));
                        return null;
                    }
                    C10892f0 O0 = C10892f0.m11871O0(s6, intValue, x0Var, false);
                    if (O0 == null) {
                        m11798e(qVar, C10892f0.m11858Z0(intValue));
                    }
                    return O0;
                }
            }
            EnumC8042a0 a0Var = EnumC8042a0.MODIFIED_JULIAN_DATE;
            if (qVar.mo11377e(a0Var)) {
                return (C10892f0) C10892f0.f38906K.mo11790b(EnumC8042a0.UTC.m20754h(((Long) qVar.mo11371r(a0Var)).longValue(), a0Var));
            }
            if (qVar instanceof AbstractC10817f) {
                return C10917h0.m11660V().mo11614k(qVar, dVar, z, z2).m11657Y();
            }
            return null;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: b */
        public AbstractC8053f0 mo11620b() {
            return AbstractC8053f0.f17431a;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: c */
        public C8087x<?> mo11619c() {
            return null;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: d */
        public int mo11618d() {
            return f24188k;
        }

        /* renamed from: f */
        public AbstractC8077o mo11615h(C10892f0 f0Var, AbstractC8048d dVar) {
            return f0Var;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: g */
        public String mo11616g(AbstractC8090y yVar, Locale locale) {
            return C8629b.m18454r(EnumC8635e.m18444b(yVar.mo18445a()), locale);
        }
    }

    /* renamed from: net.time4j.f0$f */
    /* loaded from: classes8.dex */
    private static class C10898f implements AbstractC8068k<C10892f0> {
        private C10898f() {
        }

        /* synthetic */ C10898f(C10893a aVar) {
            this();
        }

        @Override // p143hj.AbstractC8068k
        /* renamed from: a */
        public long mo11791a() {
            return 365241779741L;
        }

        @Override // p143hj.AbstractC8068k
        /* renamed from: d */
        public long mo11788d() {
            return -365243219892L;
        }

        /* renamed from: e */
        public long mo11789c(C10892f0 f0Var) {
            return EnumC8042a0.UTC.m20754h(C10812b.m12205k(f0Var), EnumC8042a0.MODIFIED_JULIAN_DATE);
        }

        /* renamed from: f */
        public C10892f0 mo11790b(long j) {
            if (j == -365243219892L) {
                return C10892f0.f24162n;
            }
            if (j == 365241779741L) {
                return C10892f0.f24163o;
            }
            long l = C10812b.m12204l(EnumC8042a0.MODIFIED_JULIAN_DATE.m20754h(j, EnumC8042a0.UTC));
            return C10892f0.m11875L0(C10812b.m12207i(l), C10812b.m12208h(l), C10812b.m12209g(l));
        }
    }

    static {
        f24170v = r7;
        f24171w = r8;
        int[] iArr = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int[] iArr2 = {31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
        C10916h hVar = C10916h.f24224k;
        f24172x = hVar;
        f24173y = hVar;
        C10985s D = C10985s.m11365D("YEAR", 14, -999999999, 999999999, 'u');
        f24174z = D;
        C10788a1 a1Var = C10788a1.f23956q;
        f38896A = a1Var;
        C10977p pVar = new C10977p("QUARTER_OF_YEAR", EnumC10970m0.class, EnumC10970m0.Q1, EnumC10970m0.Q4, 103, 'Q');
        f38897B = pVar;
        C10977p pVar2 = new C10977p("MONTH_OF_YEAR", EnumC10809b0.class, EnumC10809b0.JANUARY, EnumC10809b0.DECEMBER, 101, 'M');
        f38898C = pVar2;
        C10985s D2 = C10985s.m11365D("MONTH_AS_NUMBER", 15, 1, 12, 'M');
        f38899D = D2;
        C10985s D3 = C10985s.m11365D("DAY_OF_MONTH", 16, 1, 31, 'd');
        f38900E = D3;
        C10977p pVar3 = new C10977p("DAY_OF_WEEK", EnumC11039x0.class, EnumC11039x0.MONDAY, EnumC11039x0.SUNDAY, 102, 'E');
        f38901F = pVar3;
        C10985s D4 = C10985s.m11365D("DAY_OF_YEAR", 17, 1, 365, 'D');
        f38902G = D4;
        C10985s D5 = C10985s.m11365D("DAY_OF_QUARTER", 18, 1, 92, (char) 0);
        f38903H = D5;
        C11043y0 y0Var = C11043y0.f24542n;
        f38904I = y0Var;
        HashMap hashMap = new HashMap();
        m11833x0(hashMap, hVar);
        m11833x0(hashMap, D);
        m11833x0(hashMap, a1Var);
        m11833x0(hashMap, pVar);
        m11833x0(hashMap, pVar2);
        m11833x0(hashMap, D2);
        m11833x0(hashMap, D3);
        m11833x0(hashMap, pVar3);
        m11833x0(hashMap, D4);
        m11833x0(hashMap, D5);
        m11833x0(hashMap, y0Var);
        f38905J = Collections.unmodifiableMap(hashMap);
        C10898f fVar = new C10898f(null);
        f38906K = fVar;
        C8059h0.C8061b j = C8059h0.C8061b.m20699j(AbstractC11032u.class, C10892f0.class, new C10897e(null), fVar);
        C10894b bVar = new C10894b(null);
        EnumC10882f fVar2 = EnumC10882f.f24155r;
        C8059h0.C8061b e = j.m20704e(hVar, bVar, fVar2).m20704e(D, new C10896d(D), EnumC10882f.f24151n).m20704e(a1Var, C10788a1.m12259H(C10892f0.class), C11037w0.f24520k).m20704e(pVar, C10895c.m11816q(pVar), EnumC10882f.f24152o);
        C10895c q = C10895c.m11816q(pVar2);
        EnumC10882f fVar3 = EnumC10882f.f24153p;
        C8059h0.C8061b e2 = e.m20704e(pVar2, q, fVar3).m20704e(D2, new C10896d(D2), fVar3).m20704e(D3, new C10896d(D3), fVar2).m20704e(pVar3, C10895c.m11816q(pVar3), fVar2).m20704e(D4, new C10896d(D4), fVar2).m20704e(D5, new C10896d(D5), fVar2).m20704e(y0Var, new C10896d(19, y0Var), EnumC10882f.f24154q);
        m11867S0(e2);
        m11868R0(e2);
        f38907L = e2.m20701h();
    }

    private C10892f0(int i, int i2, int i3) {
        this.f24175k = i;
        this.f24176l = (byte) i2;
        this.f24177m = (byte) i3;
    }

    /* renamed from: A0 */
    public static C10892f0 m11886A0(AbstractC10811a aVar) {
        if (aVar instanceof C10892f0) {
            return (C10892f0) aVar;
        }
        return m11875L0(aVar.mo11643m(), aVar.mo11642n(), aVar.mo11641o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r11 == 2) goto L_0x007b;
     */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.time4j.C10892f0 m11885B0(net.time4j.C10892f0 r7, long r8, int r10, int r11) {
        /*
            r0 = 5
            r1 = 2
            if (r11 != r0) goto L_0x000d
            byte r0 = r7.f24177m
            int r2 = r7.lengthOfMonth()
            if (r0 != r2) goto L_0x000d
            r11 = r1
        L_0x000d:
            r0 = 12
            long r2 = net.time4j.base.C10813c.m12201b(r8, r0)
            r4 = 1970(0x7b2, double:9.733E-321)
            long r2 = net.time4j.base.C10813c.m12197f(r2, r4)
            int r2 = net.time4j.base.C10813c.m12196g(r2)
            int r0 = net.time4j.base.C10813c.m12199d(r8, r0)
            r3 = 1
            int r0 = r0 + r3
            int r4 = net.time4j.base.C10812b.m12212d(r2, r0)
            if (r10 <= r4) goto L_0x0077
            r5 = 1
            switch(r11) {
                case 0: goto L_0x007b;
                case 1: goto L_0x006e;
                case 2: goto L_0x007b;
                case 3: goto L_0x0064;
                case 4: goto L_0x0045;
                case 5: goto L_0x007b;
                case 6: goto L_0x007b;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Overflow policy not implemented: "
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0045:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 32
            r7.<init>(r8)
            java.lang.String r8 = "Day of month out of range: "
            r7.append(r8)
            m11831z0(r7, r2)
            m11832y0(r7, r0)
            m11832y0(r7, r10)
            hj.r r8 = new hj.r
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0064:
            long r8 = net.time4j.base.C10813c.m12197f(r8, r5)
            int r10 = r10 - r4
            net.time4j.f0 r7 = m11885B0(r7, r8, r10, r11)
            return r7
        L_0x006e:
            long r8 = net.time4j.base.C10813c.m12197f(r8, r5)
            net.time4j.f0 r7 = m11885B0(r7, r8, r3, r11)
            return r7
        L_0x0077:
            if (r10 >= r4) goto L_0x007c
            if (r11 != r1) goto L_0x007c
        L_0x007b:
            r10 = r4
        L_0x007c:
            net.time4j.f0 r7 = m11875L0(r2, r0, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10892f0.m11885B0(net.time4j.f0, long, int, int):net.time4j.f0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public int m11883D0() {
        byte b;
        switch (this.f24176l) {
            case 1:
            case 4:
            case 7:
            case 10:
                return this.f24177m;
            case 2:
            case 8:
            case 11:
                return this.f24177m + 31;
            case 3:
                if (C10812b.m12211e(this.f24175k)) {
                    b = 60;
                } else {
                    b = 59;
                }
                return b + this.f24177m;
            case 5:
                return this.f24177m + 30;
            case 6:
            case 12:
                return this.f24177m + 61;
            case 9:
                return this.f24177m + 62;
            default:
                throw new AssertionError("Unknown month: " + ((int) this.f24176l));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public static Object m11877J0(String str) {
        return f38905J.get(str);
    }

    /* renamed from: K0 */
    public static C10892f0 m11876K0(int i, int i2) {
        int[] iArr;
        int i3;
        if (i2 < 1) {
            throw new IllegalArgumentException("Day of year out of range: " + i2);
        } else if (i2 <= 31) {
            return m11875L0(i, 1, i2);
        } else {
            if (C10812b.m12211e(i)) {
                iArr = f24171w;
            } else {
                iArr = f24170v;
            }
            if (i2 > iArr[6]) {
                i3 = 7;
            } else {
                i3 = 1;
            }
            while (i3 < 12) {
                if (i2 <= iArr[i3]) {
                    return m11873M0(i, i3 + 1, i2 - iArr[i3 - 1], false);
                }
                i3++;
            }
            throw new IllegalArgumentException("Day of year out of range: " + i2);
        }
    }

    /* renamed from: L0 */
    public static C10892f0 m11875L0(int i, int i2, int i3) {
        return m11873M0(i, i2, i3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static C10892f0 m11873M0(int i, int i2, int i3, boolean z) {
        if (z) {
            C10812b.m12215a(i, i2, i3);
        }
        return new C10892f0(i, i2, i3);
    }

    /* renamed from: N0 */
    public static C10892f0 m11872N0(int i, int i2, EnumC11039x0 x0Var) {
        return m11871O0(i, i2, x0Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public static C10892f0 m11871O0(int i, int i2, EnumC11039x0 x0Var, boolean z) {
        int i3;
        if (i2 < 1 || i2 > 53) {
            if (!z) {
                return null;
            }
            throw new IllegalArgumentException(m11858Z0(i2));
        } else if (!z || (i >= f24164p.intValue() && i <= f24165q.intValue())) {
            int b = EnumC11039x0.m11154f(C10812b.m12213c(i, 1, 1)).m11158b();
            if (b <= 4) {
                i3 = 2 - b;
            } else {
                i3 = 9 - b;
            }
            int b2 = ((i3 + ((i2 - 1) * 7)) + x0Var.m11158b()) - 1;
            int i4 = 366;
            if (b2 <= 0) {
                i--;
                if (!C10812b.m12211e(i)) {
                    i4 = 365;
                }
                b2 += i4;
            } else {
                if (!C10812b.m12211e(i)) {
                    i4 = 365;
                }
                if (b2 > i4) {
                    b2 -= i4;
                    i++;
                }
            }
            C10892f0 K0 = m11876K0(i, b2);
            if (i2 != 53 || K0.m11878I0() == 53) {
                return K0;
            }
            if (!z) {
                return null;
            }
            throw new IllegalArgumentException(m11858Z0(i2));
        } else {
            throw new IllegalArgumentException(m11856a1(i));
        }
    }

    /* renamed from: P0 */
    public static C10892f0 m11870P0(int i, EnumC10809b0 b0Var, int i2) {
        return m11873M0(i, b0Var.m12221b(), i2, true);
    }

    /* renamed from: Q0 */
    public static C10892f0 m11869Q0(long j, EnumC8042a0 a0Var) {
        return f38906K.mo11790b(EnumC8042a0.UTC.m20754h(j, a0Var));
    }

    /* renamed from: R0 */
    private static void m11868R0(C8059h0.C8061b<AbstractC11032u, C10892f0> bVar) {
        for (AbstractC8082s sVar : AbstractC10814d.m12187c().mo12183g(AbstractC8082s.class)) {
            if (sVar.mo10714c(C10892f0.class)) {
                bVar.m20703f(sVar);
            }
        }
        bVar.m20703f(new C11035v0());
    }

    /* renamed from: S0 */
    private static void m11867S0(C8059h0.C8061b<AbstractC11032u, C10892f0> bVar) {
        EnumC10882f[] values;
        Set<? extends AbstractC11032u> set;
        Set<? extends AbstractC11032u> range = EnumSet.range(EnumC10882f.f24148k, EnumC10882f.f24153p);
        Set<? extends AbstractC11032u> range2 = EnumSet.range(EnumC10882f.f24154q, EnumC10882f.f24155r);
        for (EnumC10882f fVar : EnumC10882f.values()) {
            AbstractC8074m0<C10892f0> jVar = new EnumC10882f.C10891j<>(fVar);
            double length = fVar.getLength();
            if (fVar.compareTo(EnumC10882f.f24154q) < 0) {
                set = range;
            } else {
                set = range2;
            }
            bVar.m20702g(fVar, jVar, length, set);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public C10892f0 m11866T0(int i) {
        if (this.f24177m == i) {
            return this;
        }
        return m11875L0(this.f24175k, this.f24176l, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public C10892f0 m11865U0(EnumC11039x0 x0Var) {
        EnumC11039x0 E0 = m11882E0();
        if (E0 == x0Var) {
            return this;
        }
        return f38906K.mo11790b(C10813c.m12197f(m11880G0(), x0Var.m11158b() - E0.m11158b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public C10892f0 m11864V0(int i) {
        if (m11881F0() == i) {
            return this;
        }
        return m11876K0(this.f24175k, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public C10892f0 m11862X0(int i) {
        if (this.f24176l == i) {
            return this;
        }
        return m11875L0(this.f24175k, i, Math.min(C10812b.m12212d(this.f24175k, i), (int) this.f24177m));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public C10892f0 m11860Y0(int i) {
        if (this.f24175k == i) {
            return this;
        }
        return m11875L0(i, this.f24176l, Math.min(C10812b.m12212d(i, this.f24176l), (int) this.f24177m));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public static String m11858Z0(int i) {
        return "WEEK_OF_YEAR (ISO) out of range: " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public static String m11856a1(int i) {
        return "YEAR_OF_WEEKDATE (ISO) out of range: " + i;
    }

    /* renamed from: r0 */
    private static C10892f0 m11839r0(C10892f0 f0Var, long j) {
        long f = C10813c.m12197f(f0Var.f24177m, j);
        if (f >= 1 && f <= 28) {
            return m11875L0(f0Var.f24175k, f0Var.f24176l, (int) f);
        }
        long f2 = C10813c.m12197f(f0Var.m11881F0(), j);
        if (f2 >= 1 && f2 <= 365) {
            return m11876K0(f0Var.f24175k, (int) f2);
        }
        return f38906K.mo11790b(C10813c.m12197f(f0Var.m11880G0(), j));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: v0 */
    public static C8059h0<AbstractC11032u, C10892f0> m11835v0() {
        return f38907L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public static C10892f0 m11834w0(EnumC10882f fVar, C10892f0 f0Var, long j, int i) {
        switch (C10893a.f24178a[fVar.ordinal()]) {
            case 1:
                return m11834w0(EnumC10882f.f24153p, f0Var, C10813c.m12194i(j, 12000L), i);
            case 2:
                return m11834w0(EnumC10882f.f24153p, f0Var, C10813c.m12194i(j, 1200L), i);
            case 3:
                return m11834w0(EnumC10882f.f24153p, f0Var, C10813c.m12194i(j, 120L), i);
            case 4:
                return m11834w0(EnumC10882f.f24153p, f0Var, C10813c.m12194i(j, 12L), i);
            case 5:
                return m11834w0(EnumC10882f.f24153p, f0Var, C10813c.m12194i(j, 3L), i);
            case 6:
                return m11885B0(f0Var, C10813c.m12197f(f0Var.m11879H0(), j), f0Var.f24177m, i);
            case 7:
                return m11834w0(EnumC10882f.f24155r, f0Var, C10813c.m12194i(j, 7L), i);
            case 8:
                return m11839r0(f0Var, j);
            default:
                throw new UnsupportedOperationException(fVar.name());
        }
    }

    private Object writeReplace() {
        return new SPX(this, 1);
    }

    /* renamed from: x0 */
    private static void m11833x0(Map<String, Object> map, AbstractC8079p<?> pVar) {
        map.put(pVar.name(), pVar);
    }

    /* renamed from: y0 */
    private static void m11832y0(StringBuilder sb2, int i) {
        sb2.append('-');
        if (i < 10) {
            sb2.append('0');
        }
        sb2.append(i);
    }

    /* renamed from: z0 */
    private static void m11831z0(StringBuilder sb2, int i) {
        int i2;
        if (i < 0) {
            sb2.append('-');
            i2 = C10813c.m12193j(i);
        } else {
            i2 = i;
        }
        if (i2 >= 10000) {
            if (i > 0) {
                sb2.append('+');
            }
        } else if (i2 < 1000) {
            sb2.append('0');
            if (i2 < 100) {
                sb2.append('0');
                if (i2 < 10) {
                    sb2.append('0');
                }
            }
        }
        sb2.append(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C0 */
    public C10892f0 mo11638u() {
        return this;
    }

    /* renamed from: E0 */
    public EnumC11039x0 m11882E0() {
        return EnumC11039x0.m11154f(C10812b.m12213c(this.f24175k, this.f24176l, this.f24177m));
    }

    /* renamed from: F0 */
    public int m11881F0() {
        byte b = this.f24176l;
        if (b == 1) {
            return this.f24177m;
        }
        if (b != 2) {
            return f24170v[b - 2] + this.f24177m + (C10812b.m12211e(this.f24175k) ? 1 : 0);
        }
        return this.f24177m + 31;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8069k0
    /* renamed from: G */
    public C8059h0<AbstractC11032u, C10892f0> mo11639t() {
        return f38907L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public long m11880G0() {
        return f38906K.mo11789c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public long m11879H0() {
        return (((this.f24175k - 1970) * 12) + this.f24176l) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public int m11878I0() {
        return ((Integer) mo11371r(C11045z0.f24547w.m11125n())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8073m
    /* renamed from: M */
    public int mo11874M(AbstractC8056g gVar) {
        if (!(gVar instanceof C10892f0)) {
            return super.mo11874M(gVar);
        }
        C10892f0 f0Var = (C10892f0) gVar;
        int i = this.f24175k - f0Var.f24175k;
        if (i != 0) {
            return i;
        }
        int i2 = this.f24176l - f0Var.f24176l;
        if (i2 == 0) {
            return this.f24177m - f0Var.f24177m;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public C10892f0 m11863W0(long j) {
        return f38906K.mo11790b(j);
    }

    @Override // p143hj.AbstractC8073m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10892f0)) {
            return false;
        }
        C10892f0 f0Var = (C10892f0) obj;
        if (this.f24177m == f0Var.f24177m && this.f24176l == f0Var.f24176l && this.f24175k == f0Var.f24175k) {
            return true;
        }
        return false;
    }

    @Override // p143hj.AbstractC8073m
    public int hashCode() {
        int i = this.f24175k;
        return (((i << 11) + (this.f24176l << 6)) + this.f24177m) ^ (i & (-2048));
    }

    public int lengthOfMonth() {
        return C10812b.m12212d(this.f24175k, this.f24176l);
    }

    @Override // net.time4j.base.AbstractC10811a
    /* renamed from: m */
    public int mo11643m() {
        return this.f24175k;
    }

    @Override // net.time4j.base.AbstractC10811a
    /* renamed from: n */
    public int mo11642n() {
        return this.f24176l;
    }

    @Override // net.time4j.base.AbstractC10811a
    /* renamed from: o */
    public int mo11641o() {
        return this.f24177m;
    }

    /* renamed from: s0 */
    public C10917h0 m11838s0(C10906g0 g0Var) {
        return C10917h0.m11650e0(this, g0Var);
    }

    /* renamed from: t0 */
    public C10917h0 m11837t0() {
        return m11838s0(C10906g0.f24205w);
    }

    @Override // net.time4j.base.AbstractC10811a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        m11831z0(sb2, this.f24175k);
        m11832y0(sb2, this.f24176l);
        m11832y0(sb2, this.f24177m);
        return sb2.toString();
    }

    /* renamed from: u0 */
    public C10917h0 m11836u0(int i, int i2, int i3) {
        return m11838s0(C10906g0.m11773L0(i, i2, i3));
    }
}
