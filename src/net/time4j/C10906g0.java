package net.time4j;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.C10961k;
import net.time4j.base.AbstractC10814d;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;
import net.time4j.base.C10813c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8053f0;
import p143hj.AbstractC8069k0;
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
import p143hj.EnumC8076n0;
import p161ij.AbstractC8633c;
import p161ij.AbstractC8638h;
import p161ij.C8629b;
import p161ij.EnumC8635e;

@AbstractC8633c("iso8601")
/* renamed from: net.time4j.g0 */
/* loaded from: classes8.dex */
public final class C10906g0 extends AbstractC8069k0<AbstractC11034v, C10906g0> implements AbstractC10818g, AbstractC8638h {

    /* renamed from: A */
    public static final AbstractC10821c1<EnumC11044z> f38908A;

    /* renamed from: B */
    public static final AbstractC10819c<Integer, C10906g0> f38909B;

    /* renamed from: C */
    public static final AbstractC10819c<Integer, C10906g0> f38910C;

    /* renamed from: D */
    public static final AbstractC10966k0<Integer, C10906g0> f38911D;

    /* renamed from: E */
    public static final AbstractC10966k0<Integer, C10906g0> f38912E;

    /* renamed from: F */
    public static final AbstractC10966k0<Integer, C10906g0> f38913F;

    /* renamed from: G */
    public static final AbstractC10966k0<Integer, C10906g0> f38914G;

    /* renamed from: H */
    public static final AbstractC10966k0<Integer, C10906g0> f38915H;

    /* renamed from: I */
    public static final AbstractC10966k0<Integer, C10906g0> f38916I;

    /* renamed from: J */
    public static final AbstractC10966k0<Integer, C10906g0> f38917J;

    /* renamed from: K */
    public static final AbstractC10966k0<Integer, C10906g0> f38918K;

    /* renamed from: L */
    public static final AbstractC10966k0<Integer, C10906g0> f38919L;

    /* renamed from: M */
    public static final AbstractC10966k0<Integer, C10906g0> f38920M;

    /* renamed from: N */
    public static final AbstractC10966k0<Integer, C10906g0> f38921N;

    /* renamed from: O */
    public static final AbstractC10966k0<Long, C10906g0> f38922O;

    /* renamed from: P */
    public static final AbstractC10966k0<Long, C10906g0> f38923P;

    /* renamed from: Q */
    public static final AbstractC10821c1<BigDecimal> f38924Q;

    /* renamed from: R */
    public static final AbstractC10821c1<BigDecimal> f38925R;

    /* renamed from: S */
    public static final AbstractC10821c1<BigDecimal> f38926S;

    /* renamed from: T */
    public static final AbstractC8079p<EnumC10899g> f38927T;

    /* renamed from: U */
    private static final Map<String, Object> f38928U;

    /* renamed from: V */
    private static final AbstractC8091z<C10906g0, BigDecimal> f38929V;

    /* renamed from: W */
    private static final AbstractC8091z<C10906g0, BigDecimal> f38930W;

    /* renamed from: X */
    private static final AbstractC8091z<C10906g0, BigDecimal> f38931X;

    /* renamed from: Y */
    private static final C8059h0<AbstractC11034v, C10906g0> f38932Y;

    /* renamed from: o */
    static final char f24197o;

    /* renamed from: p */
    private static final BigDecimal f24198p;

    /* renamed from: q */
    private static final BigDecimal f24199q;

    /* renamed from: r */
    private static final BigDecimal f24200r;

    /* renamed from: s */
    private static final BigDecimal f24201s;
    private static final long serialVersionUID = 2780881537313863339L;

    /* renamed from: t */
    private static final BigDecimal f24202t;

    /* renamed from: u */
    private static final BigDecimal f24203u;

    /* renamed from: v */
    private static final C10906g0[] f24204v;

    /* renamed from: w */
    static final C10906g0 f24205w;

    /* renamed from: x */
    static final C10906g0 f24206x;

    /* renamed from: y */
    static final AbstractC8079p<C10906g0> f24207y;

    /* renamed from: z */
    public static final AbstractC11033u0 f24208z;

    /* renamed from: k */
    private final transient byte f24209k;

    /* renamed from: l */
    private final transient byte f24210l;

    /* renamed from: m */
    private final transient byte f24211m;

    /* renamed from: n */
    private final transient int f24212n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.g0$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10907a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24213a;

        static {
            int[] iArr = new int[EnumC10899g.values().length];
            f24213a = iArr;
            try {
                iArr[EnumC10899g.f24189k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24213a[EnumC10899g.f24190l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24213a[EnumC10899g.f24191m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24213a[EnumC10899g.f24192n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24213a[EnumC10899g.f24193o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24213a[EnumC10899g.f24194p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: net.time4j.g0$b */
    /* loaded from: classes8.dex */
    private static class C10908b implements AbstractC8091z<C10906g0, BigDecimal> {

        /* renamed from: k */
        private final AbstractC8079p<BigDecimal> f24214k;

        /* renamed from: l */
        private final BigDecimal f24215l;

        C10908b(AbstractC8079p<BigDecimal> pVar, BigDecimal bigDecimal) {
            this.f24214k = pVar;
            this.f24215l = bigDecimal;
        }

        /* renamed from: a */
        private static BigDecimal m11728a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.divide(bigDecimal2, 16, RoundingMode.FLOOR);
        }

        /* renamed from: q */
        private static int m11721q(BigDecimal bigDecimal) {
            return Math.min(999999999, bigDecimal.movePointRight(9).setScale(0, RoundingMode.HALF_UP).intValue());
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(C10906g0 g0Var) {
            return null;
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(C10906g0 g0Var) {
            return null;
        }

        /* renamed from: i */
        public BigDecimal mo11084d(C10906g0 g0Var) {
            AbstractC8079p<BigDecimal> pVar;
            if (g0Var.f24209k == 24 && ((pVar = this.f24214k) == C10906g0.f38925R || pVar == C10906g0.f38926S)) {
                return BigDecimal.ZERO;
            }
            return this.f24215l;
        }

        /* renamed from: j */
        public BigDecimal mo11078k(C10906g0 g0Var) {
            return BigDecimal.ZERO;
        }

        /* renamed from: o */
        public BigDecimal mo11076n(C10906g0 g0Var) {
            BigDecimal bigDecimal;
            AbstractC8079p<BigDecimal> pVar = this.f24214k;
            if (pVar == C10906g0.f38924Q) {
                if (g0Var.equals(C10906g0.f24205w)) {
                    return BigDecimal.ZERO;
                }
                if (g0Var.f24209k == 24) {
                    return C10906g0.f24201s;
                }
                bigDecimal = BigDecimal.valueOf(g0Var.f24209k).add(m11728a(BigDecimal.valueOf(g0Var.f24210l), C10906g0.f24198p)).add(m11728a(BigDecimal.valueOf(g0Var.f24211m), C10906g0.f24199q)).add(m11728a(BigDecimal.valueOf(g0Var.f24212n), C10906g0.f24199q.multiply(C10906g0.f24200r)));
            } else if (pVar == C10906g0.f38925R) {
                if (g0Var.m11782C0()) {
                    return BigDecimal.ZERO;
                }
                bigDecimal = BigDecimal.valueOf(g0Var.f24210l).add(m11728a(BigDecimal.valueOf(g0Var.f24211m), C10906g0.f24198p)).add(m11728a(BigDecimal.valueOf(g0Var.f24212n), C10906g0.f24198p.multiply(C10906g0.f24200r)));
            } else if (pVar != C10906g0.f38926S) {
                throw new UnsupportedOperationException(this.f24214k.name());
            } else if (g0Var.m11781D0()) {
                return BigDecimal.ZERO;
            } else {
                bigDecimal = BigDecimal.valueOf(g0Var.f24211m).add(m11728a(BigDecimal.valueOf(g0Var.f24212n), C10906g0.f24200r));
            }
            return bigDecimal.setScale(15, RoundingMode.FLOOR).stripTrailingZeros();
        }

        /* renamed from: p */
        public boolean mo11081h(C10906g0 g0Var, BigDecimal bigDecimal) {
            AbstractC8079p<BigDecimal> pVar;
            if (bigDecimal == null) {
                return false;
            }
            if (g0Var.f24209k == 24 && ((pVar = this.f24214k) == C10906g0.f38925R || pVar == C10906g0.f38926S)) {
                if (BigDecimal.ZERO.compareTo(bigDecimal) == 0) {
                    return true;
                }
                return false;
            } else if (BigDecimal.ZERO.compareTo(bigDecimal) > 0 || this.f24215l.compareTo(bigDecimal) < 0) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: r */
        public C10906g0 mo11077m(C10906g0 g0Var, BigDecimal bigDecimal, boolean z) {
            int i;
            long j;
            int i2;
            int i3;
            int i4;
            int i5;
            if (bigDecimal != null) {
                AbstractC8079p<BigDecimal> pVar = this.f24214k;
                if (pVar == C10906g0.f38924Q) {
                    BigDecimal scale = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply = bigDecimal.subtract(scale).multiply(C10906g0.f24198p);
                    BigDecimal scale2 = multiply.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply2 = multiply.subtract(scale2).multiply(C10906g0.f24198p);
                    BigDecimal scale3 = multiply2.setScale(0, RoundingMode.FLOOR);
                    j = scale.longValueExact();
                    i = scale2.intValue();
                    i2 = scale3.intValue();
                    i3 = m11721q(multiply2.subtract(scale3));
                } else if (pVar == C10906g0.f38925R) {
                    BigDecimal scale4 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply3 = bigDecimal.subtract(scale4).multiply(C10906g0.f24198p);
                    BigDecimal scale5 = multiply3.setScale(0, RoundingMode.FLOOR);
                    int intValue = scale5.intValue();
                    int q = m11721q(multiply3.subtract(scale5));
                    long longValueExact = scale4.longValueExact();
                    long j2 = g0Var.f24209k;
                    if (z) {
                        j2 += C10813c.m12201b(longValueExact, 60);
                        i = C10813c.m12199d(longValueExact, 60);
                    } else {
                        C10906g0.m11741n0(longValueExact);
                        i = (int) longValueExact;
                    }
                    i3 = q;
                    i2 = intValue;
                    j = j2;
                } else if (pVar == C10906g0.f38926S) {
                    BigDecimal scale6 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    int q2 = m11721q(bigDecimal.subtract(scale6));
                    long longValueExact2 = scale6.longValueExact();
                    long j3 = g0Var.f24209k;
                    i = g0Var.f24210l;
                    if (z) {
                        i5 = C10813c.m12199d(longValueExact2, 60);
                        long b = i + C10813c.m12201b(longValueExact2, 60);
                        j3 += C10813c.m12201b(b, 60);
                        i = C10813c.m12199d(b, 60);
                    } else {
                        C10906g0.m11739p0(longValueExact2);
                        i5 = (int) longValueExact2;
                    }
                    j = j3;
                    i2 = i5;
                    i3 = q2;
                } else {
                    throw new UnsupportedOperationException(this.f24214k.name());
                }
                if (z) {
                    i4 = C10813c.m12199d(j, 24);
                    if (j > 0 && (i4 | i | i2 | i3) == 0) {
                        return C10906g0.f24206x;
                    }
                } else if (j < 0 || j > 24) {
                    throw new IllegalArgumentException("Value out of range: " + bigDecimal);
                } else {
                    i4 = (int) j;
                }
                return C10906g0.m11771M0(i4, i, i2, i3);
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.g0$c */
    /* loaded from: classes8.dex */
    public static class C10909c implements AbstractC8074m0<C10906g0> {

        /* renamed from: a */
        private final EnumC10899g f24216a;

        /* synthetic */ C10909c(EnumC10899g gVar, C10907a aVar) {
            this(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static C10959j m11717e(C10906g0 g0Var, long j, EnumC10899g gVar) {
            if (j != 0 || g0Var.f24209k >= 24) {
                return (C10959j) m11715g(C10959j.class, gVar, g0Var, j);
            }
            return new C10959j(0L, g0Var);
        }

        /* renamed from: g */
        private static <R> R m11715g(Class<R> cls, EnumC10899g gVar, C10906g0 g0Var, long j) {
            long j2;
            C10906g0 g0Var2;
            int i = g0Var.f24210l;
            int i2 = g0Var.f24211m;
            int i3 = g0Var.f24212n;
            switch (C10907a.f24213a[gVar.ordinal()]) {
                case 1:
                    j2 = C10813c.m12197f(g0Var.f24209k, j);
                    break;
                case 2:
                    long f = C10813c.m12197f(g0Var.f24210l, j);
                    j2 = C10813c.m12197f(g0Var.f24209k, C10813c.m12201b(f, 60));
                    i = C10813c.m12199d(f, 60);
                    break;
                case 3:
                    long f2 = C10813c.m12197f(g0Var.f24211m, j);
                    long f3 = C10813c.m12197f(g0Var.f24210l, C10813c.m12201b(f2, 60));
                    j2 = C10813c.m12197f(g0Var.f24209k, C10813c.m12201b(f3, 60));
                    int d = C10813c.m12199d(f3, 60);
                    i2 = C10813c.m12199d(f2, 60);
                    i = d;
                    break;
                case 4:
                    return (R) m11715g(cls, EnumC10899g.f24194p, g0Var, C10813c.m12194i(j, 1000000L));
                case 5:
                    return (R) m11715g(cls, EnumC10899g.f24194p, g0Var, C10813c.m12194i(j, 1000L));
                case 6:
                    long f4 = C10813c.m12197f(g0Var.f24212n, j);
                    long f5 = C10813c.m12197f(g0Var.f24211m, C10813c.m12201b(f4, 1000000000));
                    long f6 = C10813c.m12197f(g0Var.f24210l, C10813c.m12201b(f5, 60));
                    j2 = C10813c.m12197f(g0Var.f24209k, C10813c.m12201b(f6, 60));
                    int d2 = C10813c.m12199d(f6, 60);
                    int d3 = C10813c.m12199d(f5, 60);
                    int d4 = C10813c.m12199d(f4, 1000000000);
                    i = d2;
                    i2 = d3;
                    i3 = d4;
                    break;
                default:
                    throw new UnsupportedOperationException(gVar.name());
            }
            int d5 = C10813c.m12199d(j2, 24);
            if ((d5 | i | i2 | i3) != 0) {
                g0Var2 = C10906g0.m11771M0(d5, i, i2, i3);
            } else if (j <= 0 || cls != C10906g0.class) {
                g0Var2 = C10906g0.f24205w;
            } else {
                g0Var2 = C10906g0.f24206x;
            }
            if (cls == C10906g0.class) {
                return cls.cast(g0Var2);
            }
            return cls.cast(new C10959j(C10813c.m12201b(j2, 24), g0Var2));
        }

        /* renamed from: d */
        public C10906g0 mo11636b(C10906g0 g0Var, long j) {
            return j == 0 ? g0Var : (C10906g0) m11715g(C10906g0.class, this.f24216a, g0Var, j);
        }

        /* renamed from: f */
        public long mo11637a(C10906g0 g0Var, C10906g0 g0Var2) {
            long j;
            long y0 = g0Var2.m11730y0() - g0Var.m11730y0();
            switch (C10907a.f24213a[this.f24216a.ordinal()]) {
                case 1:
                    j = 3600000000000L;
                    break;
                case 2:
                    j = 60000000000L;
                    break;
                case 3:
                    j = 1000000000;
                    break;
                case 4:
                    j = 1000000;
                    break;
                case 5:
                    j = 1000;
                    break;
                case 6:
                    j = 1;
                    break;
                default:
                    throw new UnsupportedOperationException(this.f24216a.name());
            }
            return y0 / j;
        }

        private C10909c(EnumC10899g gVar) {
            this.f24216a = gVar;
        }
    }

    /* renamed from: net.time4j.g0$d */
    /* loaded from: classes8.dex */
    private static class C10910d implements AbstractC8091z<C10906g0, Integer> {

        /* renamed from: k */
        private final AbstractC8079p<Integer> f24217k;

        /* renamed from: l */
        private final int f24218l;

        /* renamed from: m */
        private final int f24219m;

        /* renamed from: n */
        private final int f24220n;

        C10910d(AbstractC8079p<Integer> pVar, int i, int i2) {
            this.f24217k = pVar;
            if (pVar instanceof C10989t) {
                this.f24218l = ((C10989t) pVar).m11344H();
            } else {
                this.f24218l = -1;
            }
            this.f24219m = i;
            this.f24220n = i2;
        }

        /* renamed from: a */
        private AbstractC8079p<?> m11714a(C10906g0 g0Var) {
            switch (this.f24218l) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return C10906g0.f38914G;
                case 6:
                case 7:
                    return C10906g0.f38916I;
                case 8:
                case 9:
                    return C10906g0.f38920M;
                default:
                    return null;
            }
        }

        /* renamed from: p */
        private static boolean m11708p(C10906g0 g0Var) {
            return g0Var.f24209k < 12 || g0Var.f24209k == 24;
        }

        /* renamed from: s */
        private C10906g0 m11705s(C10906g0 g0Var, int i) {
            AbstractC8079p<Integer> pVar = this.f24217k;
            if (pVar == C10906g0.f38913F || pVar == C10906g0.f38912E || pVar == C10906g0.f38911D) {
                return g0Var.m20683K(C10813c.m12191l(i, ((Integer) g0Var.mo11371r(pVar)).intValue()), EnumC10899g.f24189k);
            }
            if (pVar == C10906g0.f38914G) {
                return g0Var.m20683K(C10813c.m12191l(i, g0Var.f24210l), EnumC10899g.f24190l);
            }
            if (pVar == C10906g0.f38916I) {
                return g0Var.m20683K(C10813c.m12191l(i, g0Var.f24211m), EnumC10899g.f24191m);
            }
            AbstractC10966k0<Integer, C10906g0> k0Var = C10906g0.f38918K;
            if (pVar == k0Var) {
                return g0Var.m20683K(C10813c.m12191l(i, ((Integer) g0Var.mo11371r(k0Var)).intValue()), EnumC10899g.f24192n);
            }
            AbstractC10966k0<Integer, C10906g0> k0Var2 = C10906g0.f38919L;
            if (pVar == k0Var2) {
                return g0Var.m20683K(C10813c.m12191l(i, ((Integer) g0Var.mo11371r(k0Var2)).intValue()), EnumC10899g.f24193o);
            }
            if (pVar == C10906g0.f38920M) {
                return g0Var.m20683K(C10813c.m12191l(i, g0Var.f24212n), EnumC10899g.f24194p);
            }
            if (pVar == C10906g0.f38921N) {
                int c = C10813c.m12200c(i, 86400000);
                int i2 = g0Var.f24212n % 1000000;
                if (c != 0 || i2 != 0) {
                    return C10906g0.m11736s0(c, i2);
                }
                if (i > 0) {
                    return C10906g0.f24206x;
                }
                return C10906g0.f24205w;
            } else if (pVar == C10906g0.f38915H) {
                int c2 = C10813c.m12200c(i, 1440);
                if (c2 != 0 || !g0Var.m11781D0()) {
                    return mo11077m(g0Var, Integer.valueOf(c2), false);
                }
                if (i > 0) {
                    return C10906g0.f24206x;
                }
                return C10906g0.f24205w;
            } else if (pVar == C10906g0.f38917J) {
                int c3 = C10813c.m12200c(i, 86400);
                if (c3 != 0 || g0Var.f24212n != 0) {
                    return mo11077m(g0Var, Integer.valueOf(c3), false);
                }
                if (i > 0) {
                    return C10906g0.f24206x;
                }
                return C10906g0.f24205w;
            } else {
                throw new UnsupportedOperationException(this.f24217k.name());
            }
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(C10906g0 g0Var) {
            return m11714a(g0Var);
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(C10906g0 g0Var) {
            return m11714a(g0Var);
        }

        /* renamed from: i */
        public Integer mo11084d(C10906g0 g0Var) {
            if (g0Var.f24209k == 24) {
                switch (this.f24218l) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return 0;
                }
            }
            if (g0Var.m11729z0(this.f24217k)) {
                return Integer.valueOf(this.f24220n - 1);
            }
            return Integer.valueOf(this.f24220n);
        }

        /* renamed from: j */
        public Integer mo11078k(C10906g0 g0Var) {
            return Integer.valueOf(this.f24219m);
        }

        /* renamed from: o */
        public Integer mo11076n(C10906g0 g0Var) {
            byte b;
            int i;
            int i2 = 24;
            switch (this.f24218l) {
                case 1:
                    i2 = g0Var.f24209k % 12;
                    if (i2 == 0) {
                        i2 = 12;
                        break;
                    }
                    break;
                case 2:
                    int i3 = g0Var.f24209k % 24;
                    if (i3 != 0) {
                        i2 = i3;
                        break;
                    }
                    break;
                case 3:
                    i2 = g0Var.f24209k % 12;
                    break;
                case 4:
                    i2 = g0Var.f24209k % 24;
                    break;
                case 5:
                    i2 = g0Var.f24209k;
                    break;
                case 6:
                    i2 = g0Var.f24210l;
                    break;
                case 7:
                    i = g0Var.f24209k * 60;
                    b = g0Var.f24210l;
                    i2 = i + b;
                    break;
                case 8:
                    i2 = g0Var.f24211m;
                    break;
                case 9:
                    i = (g0Var.f24209k * 3600) + (g0Var.f24210l * 60);
                    b = g0Var.f24211m;
                    i2 = i + b;
                    break;
                case 10:
                    i2 = g0Var.f24212n / 1000000;
                    break;
                case 11:
                    i2 = g0Var.f24212n / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    break;
                case 12:
                    i2 = g0Var.f24212n;
                    break;
                case 13:
                    i2 = (int) (g0Var.m11730y0() / 1000000);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f24217k.name());
            }
            return Integer.valueOf(i2);
        }

        /* renamed from: q */
        public boolean mo11081h(C10906g0 g0Var, Integer num) {
            int intValue;
            int i;
            if (num == null || (intValue = num.intValue()) < this.f24219m || intValue > (i = this.f24220n)) {
                return false;
            }
            if (intValue == i) {
                int i2 = this.f24218l;
                if (i2 == 5) {
                    return g0Var.m11782C0();
                }
                if (i2 == 7) {
                    return g0Var.m11781D0();
                }
                if (i2 != 9) {
                    if (i2 == 13) {
                        if (g0Var.f24212n % 1000000 == 0) {
                            return true;
                        }
                        return false;
                    }
                } else if (g0Var.f24212n == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            if (g0Var.f24209k == 24) {
                switch (this.f24218l) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        if (intValue == 0) {
                            return true;
                        }
                        return false;
                }
            }
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
            if (m11708p(r7) != false) goto L_0x006c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
            r8 = r8 + 12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
            if (m11708p(r7) != false) goto L_0x006c;
         */
        /* renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public net.time4j.C10906g0 mo11077m(net.time4j.C10906g0 r7, java.lang.Integer r8, boolean r9) {
            /*
                r6 = this;
                if (r8 == 0) goto L_0x00a6
                if (r9 == 0) goto L_0x000d
                int r8 = r8.intValue()
                net.time4j.g0 r7 = r6.m11705s(r7, r8)
                return r7
            L_0x000d:
                boolean r9 = r6.mo11081h(r7, r8)
                if (r9 == 0) goto L_0x008f
                byte r9 = net.time4j.C10906g0.m11747h0(r7)
                byte r0 = net.time4j.C10906g0.m11746i0(r7)
                byte r1 = net.time4j.C10906g0.m11745j0(r7)
                int r2 = net.time4j.C10906g0.m11772M(r7)
                int r8 = r8.intValue()
                int r3 = r6.f24218l
                r4 = 0
                r5 = 1000000(0xf4240, float:1.401298E-39)
                switch(r3) {
                    case 1: goto L_0x007e;
                    case 2: goto L_0x0078;
                    case 3: goto L_0x006e;
                    case 4: goto L_0x006c;
                    case 5: goto L_0x006c;
                    case 6: goto L_0x006a;
                    case 7: goto L_0x0065;
                    case 8: goto L_0x0063;
                    case 9: goto L_0x005a;
                    case 10: goto L_0x0051;
                    case 11: goto L_0x0048;
                    case 12: goto L_0x0046;
                    case 13: goto L_0x003c;
                    default: goto L_0x0030;
                }
            L_0x0030:
                java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
                hj.p<java.lang.Integer> r8 = r6.f24217k
                java.lang.String r8 = r8.name()
                r7.<init>(r8)
                throw r7
            L_0x003c:
                int r7 = net.time4j.C10906g0.m11772M(r7)
                int r7 = r7 % r5
                net.time4j.g0 r7 = net.time4j.C10906g0.m11770N(r8, r7)
                return r7
            L_0x0046:
                r2 = r8
                goto L_0x008a
            L_0x0048:
                int r8 = r8 * 1000
                int r7 = net.time4j.C10906g0.m11772M(r7)
                int r7 = r7 % 1000
                goto L_0x0057
            L_0x0051:
                int r8 = r8 * r5
                int r7 = net.time4j.C10906g0.m11772M(r7)
                int r7 = r7 % r5
            L_0x0057:
                int r2 = r8 + r7
                goto L_0x008a
            L_0x005a:
                int r9 = r8 / 3600
                int r8 = r8 % 3600
                int r0 = r8 / 60
                int r1 = r8 % 60
                goto L_0x008a
            L_0x0063:
                r1 = r8
                goto L_0x008a
            L_0x0065:
                int r9 = r8 / 60
                int r0 = r8 % 60
                goto L_0x008a
            L_0x006a:
                r0 = r8
                goto L_0x008a
            L_0x006c:
                r9 = r8
                goto L_0x008a
            L_0x006e:
                boolean r7 = m11708p(r7)
                if (r7 == 0) goto L_0x0075
                goto L_0x006c
            L_0x0075:
                int r8 = r8 + 12
                goto L_0x006c
            L_0x0078:
                r7 = 24
                if (r8 != r7) goto L_0x006c
                r9 = r4
                goto L_0x008a
            L_0x007e:
                r9 = 12
                if (r8 != r9) goto L_0x0083
                r8 = r4
            L_0x0083:
                boolean r7 = m11708p(r7)
                if (r7 == 0) goto L_0x0075
                goto L_0x006c
            L_0x008a:
                net.time4j.g0 r7 = net.time4j.C10906g0.m11771M0(r9, r0, r1, r2)
                return r7
            L_0x008f:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Value out of range: "
                r9.append(r0)
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                r7.<init>(r8)
                throw r7
            L_0x00a6:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "Missing element value."
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10906g0.C10910d.mo11077m(net.time4j.g0, java.lang.Integer, boolean):net.time4j.g0");
        }
    }

    /* renamed from: net.time4j.g0$e */
    /* loaded from: classes8.dex */
    private static class C10911e implements AbstractC8091z<C10906g0, Long> {

        /* renamed from: k */
        private final AbstractC8079p<Long> f24221k;

        /* renamed from: l */
        private final long f24222l;

        /* renamed from: m */
        private final long f24223m;

        C10911e(AbstractC8079p<Long> pVar, long j, long j2) {
            this.f24221k = pVar;
            this.f24222l = j;
            this.f24223m = j2;
        }

        /* renamed from: q */
        private C10906g0 m11697q(C10906g0 g0Var, long j) {
            if (this.f24221k == C10906g0.f38922O) {
                long w0 = C10906g0.m11732w0(j, 86400000000L);
                int i = g0Var.f24212n % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                if (w0 == 0 && i == 0 && j > 0) {
                    return C10906g0.f24206x;
                }
                return C10906g0.m11737r0(w0, i);
            }
            long w02 = C10906g0.m11732w0(j, 86400000000000L);
            if (w02 != 0 || j <= 0) {
                return C10906g0.m11735t0(w02);
            }
            return C10906g0.f24206x;
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(C10906g0 g0Var) {
            return null;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(C10906g0 g0Var) {
            return null;
        }

        /* renamed from: f */
        public Long mo11084d(C10906g0 g0Var) {
            if (this.f24221k != C10906g0.f38922O || g0Var.f24212n % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
                return Long.valueOf(this.f24223m);
            }
            return Long.valueOf(this.f24223m - 1);
        }

        /* renamed from: i */
        public Long mo11078k(C10906g0 g0Var) {
            return Long.valueOf(this.f24222l);
        }

        /* renamed from: j */
        public Long mo11076n(C10906g0 g0Var) {
            long j;
            if (this.f24221k == C10906g0.f38922O) {
                j = g0Var.m11730y0() / 1000;
            } else {
                j = g0Var.m11730y0();
            }
            return Long.valueOf(j);
        }

        /* renamed from: o */
        public boolean mo11081h(C10906g0 g0Var, Long l) {
            if (l == null) {
                return false;
            }
            if (this.f24221k == C10906g0.f38922O && l.longValue() == this.f24223m) {
                if (g0Var.f24212n % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
                    return true;
                }
                return false;
            } else if (this.f24222l > l.longValue() || l.longValue() > this.f24223m) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: p */
        public C10906g0 mo11077m(C10906g0 g0Var, Long l, boolean z) {
            if (l == null) {
                throw new IllegalArgumentException("Missing element value.");
            } else if (z) {
                return m11697q(g0Var, l.longValue());
            } else {
                if (mo11081h(g0Var, l)) {
                    long longValue = l.longValue();
                    if (this.f24221k == C10906g0.f38922O) {
                        return C10906g0.m11737r0(longValue, g0Var.f24212n % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                    }
                    return C10906g0.m11735t0(longValue);
                }
                throw new IllegalArgumentException("Value out of range: " + l);
            }
        }
    }

    /* renamed from: net.time4j.g0$f */
    /* loaded from: classes8.dex */
    private static class C10912f implements AbstractC8084u<C10906g0> {
        private C10912f() {
        }

        /* synthetic */ C10912f(C10907a aVar) {
            this();
        }

        /* renamed from: e */
        private static void m11695e(AbstractC8080q<?> qVar, String str) {
            EnumC8076n0 n0Var = EnumC8076n0.ERROR_MESSAGE;
            if (qVar.mo15651z(n0Var, str)) {
                qVar.mo15654D(n0Var, str);
            }
        }

        /* renamed from: i */
        private static int m11693i(AbstractC8080q<?> qVar) {
            int s = qVar.mo11370s(C10906g0.f38912E);
            if (s != Integer.MIN_VALUE) {
                return s;
            }
            int s2 = qVar.mo11370s(C10906g0.f38910C);
            if (s2 == 0) {
                return -1;
            }
            int i = 0;
            if (s2 == 24) {
                return 0;
            }
            if (s2 != Integer.MIN_VALUE) {
                return s2;
            }
            AbstractC10821c1<EnumC11044z> c1Var = C10906g0.f38908A;
            if (qVar.mo11377e(c1Var)) {
                EnumC11044z zVar = (EnumC11044z) qVar.mo11371r(c1Var);
                int s3 = qVar.mo11370s(C10906g0.f38909B);
                if (s3 == Integer.MIN_VALUE) {
                    int s4 = qVar.mo11370s(C10906g0.f38911D);
                    if (s4 != Integer.MIN_VALUE) {
                        if (zVar == EnumC11044z.AM) {
                            return s4;
                        }
                        return s4 + 12;
                    }
                } else if (s3 != 0) {
                    if (s3 != 12) {
                        i = s3;
                    }
                    if (zVar == EnumC11044z.AM) {
                        return i;
                    }
                    return i + 12;
                } else if (zVar == EnumC11044z.AM) {
                    return -1;
                } else {
                    return -2;
                }
            }
            return Integer.MIN_VALUE;
        }

        /* renamed from: j */
        private static C10906g0 m11692j(AbstractC8080q<?> qVar) {
            int i;
            int i2;
            int i3;
            AbstractC10966k0<Long, C10906g0> k0Var = C10906g0.f38923P;
            if (qVar.mo11377e(k0Var)) {
                long longValue = ((Long) qVar.mo11371r(k0Var)).longValue();
                if (longValue >= 0 && longValue <= 86400000000000L) {
                    return C10906g0.m11735t0(longValue);
                }
                m11695e(qVar, "NANO_OF_DAY out of range: " + longValue);
                return null;
            }
            AbstractC10966k0<Long, C10906g0> k0Var2 = C10906g0.f38922O;
            int i4 = 0;
            if (qVar.mo11377e(k0Var2)) {
                AbstractC10966k0<Integer, C10906g0> k0Var3 = C10906g0.f38920M;
                if (qVar.mo11377e(k0Var3)) {
                    i4 = ((Integer) qVar.mo11371r(k0Var3)).intValue() % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                }
                return C10906g0.m11737r0(((Long) qVar.mo11371r(k0Var2)).longValue(), i4);
            }
            AbstractC10966k0<Integer, C10906g0> k0Var4 = C10906g0.f38921N;
            if (qVar.mo11377e(k0Var4)) {
                AbstractC10966k0<Integer, C10906g0> k0Var5 = C10906g0.f38920M;
                if (qVar.mo11377e(k0Var5)) {
                    int intValue = ((Integer) qVar.mo11371r(k0Var5)).intValue();
                    if (intValue < 0 || intValue >= 1000000000) {
                        m11695e(qVar, "NANO_OF_SECOND out of range: " + intValue);
                        return null;
                    }
                    i4 = intValue % 1000000;
                } else {
                    AbstractC10966k0<Integer, C10906g0> k0Var6 = C10906g0.f38919L;
                    if (qVar.mo11377e(k0Var6)) {
                        int intValue2 = ((Integer) qVar.mo11371r(k0Var6)).intValue();
                        if (intValue2 < 0 || intValue2 >= 1000000) {
                            m11695e(qVar, "MICRO_OF_SECOND out of range: " + intValue2);
                            return null;
                        }
                        i4 = intValue2 % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    }
                }
                int intValue3 = ((Integer) qVar.mo11371r(k0Var4)).intValue();
                if (intValue3 >= 0 && intValue3 <= 86400000) {
                    return C10906g0.m11736s0(intValue3, i4);
                }
                m11695e(qVar, "MILLI_OF_DAY out of range: " + intValue3);
                return null;
            }
            AbstractC10966k0<Integer, C10906g0> k0Var7 = C10906g0.f38917J;
            if (qVar.mo11377e(k0Var7)) {
                AbstractC10966k0<Integer, C10906g0> k0Var8 = C10906g0.f38920M;
                if (qVar.mo11377e(k0Var8)) {
                    i3 = ((Integer) qVar.mo11371r(k0Var8)).intValue();
                } else {
                    AbstractC10966k0<Integer, C10906g0> k0Var9 = C10906g0.f38919L;
                    if (qVar.mo11377e(k0Var9)) {
                        i3 = ((Integer) qVar.mo11371r(k0Var9)).intValue() * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    } else {
                        AbstractC10966k0<Integer, C10906g0> k0Var10 = C10906g0.f38918K;
                        if (qVar.mo11377e(k0Var10)) {
                            i3 = ((Integer) qVar.mo11371r(k0Var10)).intValue() * 1000000;
                        } else {
                            i3 = 0;
                        }
                    }
                }
                return (C10906g0) C10906g0.m11771M0(0, 0, 0, i3).mo15654D(k0Var7, qVar.mo11371r(k0Var7));
            }
            AbstractC10966k0<Integer, C10906g0> k0Var11 = C10906g0.f38915H;
            if (!qVar.mo11377e(k0Var11)) {
                return null;
            }
            AbstractC10966k0<Integer, C10906g0> k0Var12 = C10906g0.f38920M;
            if (qVar.mo11377e(k0Var12)) {
                i = ((Integer) qVar.mo11371r(k0Var12)).intValue();
            } else {
                AbstractC10966k0<Integer, C10906g0> k0Var13 = C10906g0.f38919L;
                if (qVar.mo11377e(k0Var13)) {
                    i = ((Integer) qVar.mo11371r(k0Var13)).intValue() * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                } else {
                    AbstractC10966k0<Integer, C10906g0> k0Var14 = C10906g0.f38918K;
                    if (qVar.mo11377e(k0Var14)) {
                        i = ((Integer) qVar.mo11371r(k0Var14)).intValue() * 1000000;
                    } else {
                        i = 0;
                    }
                }
            }
            AbstractC10966k0<Integer, C10906g0> k0Var15 = C10906g0.f38916I;
            if (qVar.mo11377e(k0Var15)) {
                i2 = ((Integer) qVar.mo11371r(k0Var15)).intValue();
            } else {
                i2 = 0;
            }
            return (C10906g0) C10906g0.m11771M0(0, 0, i2, i).mo15654D(k0Var11, qVar.mo11371r(k0Var11));
        }

        /* renamed from: a */
        public C10906g0 mo11614k(AbstractC8080q<?> qVar, AbstractC8048d dVar, boolean z, boolean z2) {
            if (qVar instanceof AbstractC10817f) {
                return C10917h0.m11660V().mo11614k(qVar, dVar, z, z2).m11654a0();
            }
            AbstractC8079p<?> pVar = C10906g0.f24207y;
            if (qVar.mo11377e(pVar)) {
                return (C10906g0) qVar.mo11371r(pVar);
            }
            AbstractC10821c1<BigDecimal> c1Var = C10906g0.f38924Q;
            if (qVar.mo11377e(c1Var)) {
                return C10906g0.m11768O0((BigDecimal) qVar.mo11371r(c1Var));
            }
            int s = qVar.mo11370s(C10906g0.f38913F);
            if (s == Integer.MIN_VALUE) {
                s = m11693i(qVar);
                if (s == Integer.MIN_VALUE) {
                    return m11692j(qVar);
                }
                if (s == -1 || s == -2) {
                    if (z) {
                        s = s == -1 ? 0 : 12;
                    } else {
                        m11695e(qVar, "Clock hour cannot be zero.");
                        return null;
                    }
                } else if (s == 24 && !z) {
                    m11695e(qVar, "Time 24:00 not allowed, use lax mode or element HOUR_FROM_0_TO_24 instead.");
                    return null;
                }
            }
            AbstractC10821c1<BigDecimal> c1Var2 = C10906g0.f38925R;
            if (qVar.mo11377e(c1Var2)) {
                return (C10906g0) C10906g0.f38930W.mo11077m(C10906g0.m11775J0(s), qVar.mo11371r(c1Var2), false);
            }
            int s2 = qVar.mo11370s(C10906g0.f38914G);
            if (s2 == Integer.MIN_VALUE) {
                s2 = 0;
            }
            AbstractC10821c1<BigDecimal> c1Var3 = C10906g0.f38926S;
            if (qVar.mo11377e(c1Var3)) {
                return (C10906g0) C10906g0.f38931X.mo11077m(C10906g0.m11774K0(s, s2), qVar.mo11371r(c1Var3), false);
            }
            int s3 = qVar.mo11370s(C10906g0.f38916I);
            if (s3 == Integer.MIN_VALUE) {
                s3 = 0;
            }
            int s4 = qVar.mo11370s(C10906g0.f38920M);
            if (s4 == Integer.MIN_VALUE) {
                int s5 = qVar.mo11370s(C10906g0.f38919L);
                if (s5 == Integer.MIN_VALUE) {
                    int s6 = qVar.mo11370s(C10906g0.f38918K);
                    if (s6 == Integer.MIN_VALUE) {
                        s4 = 0;
                    } else {
                        s4 = C10813c.m12195h(s6, 1000000);
                    }
                } else {
                    s4 = C10813c.m12195h(s5, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                }
            }
            if (z) {
                long f = C10813c.m12197f(C10813c.m12194i(C10813c.m12197f(C10813c.m12197f(C10813c.m12194i(s, 3600L), C10813c.m12194i(s2, 60L)), s3), 1000000000L), s4);
                long w0 = C10906g0.m11732w0(f, 86400000000000L);
                long v0 = C10906g0.m11733v0(f, 86400000000000L);
                int i = (v0 > 0L ? 1 : (v0 == 0L ? 0 : -1));
                if (i != 0) {
                    AbstractC8079p<Long> pVar2 = C11038x.f24521q;
                    if (qVar.m20658y(pVar2, v0)) {
                        qVar.m20661C(pVar2, v0);
                    }
                }
                if (w0 != 0 || i <= 0) {
                    return C10906g0.m11735t0(w0);
                }
                return C10906g0.f24206x;
            } else if ((s >= 0 && s2 >= 0 && s3 >= 0 && s4 >= 0 && s == 24 && (s2 | s3 | s4) == 0) || (s < 24 && s2 <= 59 && s3 <= 59 && s4 <= 1000000000)) {
                return C10906g0.m11769N0(s, s2, s3, s4, false);
            } else {
                m11695e(qVar, "Time component out of range.");
                return null;
            }
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
            return C10892f0.m11835v0().mo11618d();
        }

        /* renamed from: f */
        public AbstractC8077o mo11615h(C10906g0 g0Var, AbstractC8048d dVar) {
            return g0Var;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: g */
        public String mo11616g(AbstractC8090y yVar, Locale locale) {
            return C8629b.m18452t(EnumC8635e.m18444b(yVar.mo18445a()), locale);
        }
    }

    /* renamed from: net.time4j.g0$g */
    /* loaded from: classes8.dex */
    private static class C10913g implements AbstractC8091z<C10906g0, EnumC11044z> {
        private C10913g() {
        }

        /* synthetic */ C10913g(C10907a aVar) {
            this();
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(C10906g0 g0Var) {
            return C10906g0.f38911D;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(C10906g0 g0Var) {
            return C10906g0.f38911D;
        }

        /* renamed from: f */
        public EnumC11044z mo11084d(C10906g0 g0Var) {
            return EnumC11044z.PM;
        }

        /* renamed from: i */
        public EnumC11044z mo11078k(C10906g0 g0Var) {
            return EnumC11044z.AM;
        }

        /* renamed from: j */
        public EnumC11044z mo11076n(C10906g0 g0Var) {
            return EnumC11044z.m11140c(g0Var.f24209k);
        }

        /* renamed from: o */
        public boolean mo11081h(C10906g0 g0Var, EnumC11044z zVar) {
            return zVar != null;
        }

        /* renamed from: p */
        public C10906g0 mo11077m(C10906g0 g0Var, EnumC11044z zVar, boolean z) {
            int i;
            if (g0Var.f24209k == 24) {
                i = 0;
            } else {
                i = g0Var.f24209k;
            }
            if (zVar != null) {
                if (zVar == EnumC11044z.AM) {
                    if (i >= 12) {
                        i -= 12;
                    }
                } else if (zVar == EnumC11044z.PM && i < 12) {
                    i += 12;
                }
                return C10906g0.m11771M0(i, g0Var.f24210l, g0Var.f24211m, g0Var.f24212n);
            }
            throw new IllegalArgumentException("Missing am/pm-value.");
        }
    }

    /* renamed from: net.time4j.g0$h */
    /* loaded from: classes8.dex */
    private static class C10914h implements AbstractC8091z<C10906g0, EnumC10899g> {
        private C10914h() {
        }

        /* synthetic */ C10914h(C10907a aVar) {
            this();
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(C10906g0 g0Var) {
            return null;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(C10906g0 g0Var) {
            return null;
        }

        /* renamed from: f */
        public EnumC10899g mo11084d(C10906g0 g0Var) {
            return EnumC10899g.f24194p;
        }

        /* renamed from: i */
        public EnumC10899g mo11078k(C10906g0 g0Var) {
            return EnumC10899g.f24189k;
        }

        /* renamed from: j */
        public EnumC10899g mo11076n(C10906g0 g0Var) {
            if (g0Var.f24212n != 0) {
                if (g0Var.f24212n % 1000000 == 0) {
                    return EnumC10899g.f24192n;
                }
                if (g0Var.f24212n % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
                    return EnumC10899g.f24193o;
                }
                return EnumC10899g.f24194p;
            } else if (g0Var.f24211m != 0) {
                return EnumC10899g.f24191m;
            } else {
                if (g0Var.f24210l != 0) {
                    return EnumC10899g.f24190l;
                }
                return EnumC10899g.f24189k;
            }
        }

        /* renamed from: o */
        public boolean mo11081h(C10906g0 g0Var, EnumC10899g gVar) {
            return gVar != null;
        }

        /* renamed from: p */
        public C10906g0 mo11077m(C10906g0 g0Var, EnumC10899g gVar, boolean z) {
            if (gVar == null) {
                throw new IllegalArgumentException("Missing precision value.");
            } else if (gVar.ordinal() >= mo11076n(g0Var).ordinal()) {
                return g0Var;
            } else {
                switch (C10907a.f24213a[gVar.ordinal()]) {
                    case 1:
                        return C10906g0.m11775J0(g0Var.f24209k);
                    case 2:
                        return C10906g0.m11774K0(g0Var.f24209k, g0Var.f24210l);
                    case 3:
                        return C10906g0.m11773L0(g0Var.f24209k, g0Var.f24210l, g0Var.f24211m);
                    case 4:
                        return C10906g0.m11771M0(g0Var.f24209k, g0Var.f24210l, g0Var.f24211m, (g0Var.f24212n / 1000000) * 1000000);
                    case 5:
                        return C10906g0.m11771M0(g0Var.f24209k, g0Var.f24210l, g0Var.f24211m, (g0Var.f24212n / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                    case 6:
                        return g0Var;
                    default:
                        throw new UnsupportedOperationException(gVar.name());
                }
            }
        }
    }

    /* renamed from: net.time4j.g0$i */
    /* loaded from: classes8.dex */
    private static class C10915i implements AbstractC8091z<C10906g0, C10906g0> {
        private C10915i() {
        }

        /* synthetic */ C10915i(C10907a aVar) {
            this();
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(C10906g0 g0Var) {
            return null;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(C10906g0 g0Var) {
            return null;
        }

        /* renamed from: f */
        public C10906g0 mo11084d(C10906g0 g0Var) {
            return C10906g0.f24206x;
        }

        /* renamed from: i */
        public C10906g0 mo11078k(C10906g0 g0Var) {
            return C10906g0.f24205w;
        }

        /* renamed from: j */
        public C10906g0 mo11076n(C10906g0 g0Var) {
            return g0Var;
        }

        /* renamed from: o */
        public boolean mo11081h(C10906g0 g0Var, C10906g0 g0Var2) {
            return g0Var2 != null;
        }

        /* renamed from: p */
        public C10906g0 mo11077m(C10906g0 g0Var, C10906g0 g0Var2, boolean z) {
            if (g0Var2 != null) {
                return g0Var2;
            }
            throw new IllegalArgumentException("Missing time value.");
        }
    }

    static {
        char c;
        if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
            c = '.';
        } else {
            c = ',';
        }
        f24197o = c;
        f24198p = new BigDecimal(60);
        f24199q = new BigDecimal(3600);
        f24200r = new BigDecimal(1000000000);
        f24201s = new BigDecimal("24");
        f24202t = new BigDecimal("23.999999999999999");
        f24203u = new BigDecimal("59.999999999999999");
        f24204v = new C10906g0[25];
        for (int i = 0; i <= 24; i++) {
            f24204v[i] = new C10906g0(i, 0, 0, 0, false);
        }
        C10906g0[] g0VarArr = f24204v;
        C10906g0 g0Var = g0VarArr[0];
        f24205w = g0Var;
        C10906g0 g0Var2 = g0VarArr[24];
        f24206x = g0Var2;
        C10982q0 q0Var = C10982q0.f24395k;
        f24207y = q0Var;
        f24208z = q0Var;
        EnumC10878d dVar = EnumC10878d.AM_PM_OF_DAY;
        f38908A = dVar;
        C10989t D = C10989t.m11348D("CLOCK_HOUR_OF_AMPM", false);
        f38909B = D;
        C10989t D2 = C10989t.m11348D("CLOCK_HOUR_OF_DAY", true);
        f38910C = D2;
        C10989t E = C10989t.m11347E("DIGITAL_HOUR_OF_AMPM", 3, 0, 11, 'K');
        f38911D = E;
        C10989t E2 = C10989t.m11347E("DIGITAL_HOUR_OF_DAY", 4, 0, 23, 'H');
        f38912E = E2;
        C10989t E3 = C10989t.m11347E("HOUR_FROM_0_TO_24", 5, 0, 23, 'H');
        f38913F = E3;
        C10989t E4 = C10989t.m11347E("MINUTE_OF_HOUR", 6, 0, 59, 'm');
        f38914G = E4;
        C10989t E5 = C10989t.m11347E("MINUTE_OF_DAY", 7, 0, 1439, f24197o);
        f38915H = E5;
        C10989t E6 = C10989t.m11347E("SECOND_OF_MINUTE", 8, 0, 59, 's');
        f38916I = E6;
        C10989t E7 = C10989t.m11347E("SECOND_OF_DAY", 9, 0, 86399, f24197o);
        f38917J = E7;
        C10989t E8 = C10989t.m11347E("MILLI_OF_SECOND", 10, 0, 999, f24197o);
        f38918K = E8;
        C10989t E9 = C10989t.m11347E("MICRO_OF_SECOND", 11, 0, 999999, f24197o);
        f38919L = E9;
        C10989t E10 = C10989t.m11347E("NANO_OF_SECOND", 12, 0, 999999999, 'S');
        f38920M = E10;
        C10989t E11 = C10989t.m11347E("MILLI_OF_DAY", 13, 0, 86399999, 'A');
        f38921N = E11;
        C11038x D3 = C11038x.m11162D("MICRO_OF_DAY", 0L, 86399999999L);
        f38922O = D3;
        C11038x D4 = C11038x.m11162D("NANO_OF_DAY", 0L, 86399999999999L);
        f38923P = D4;
        C10967l lVar = new C10967l("DECIMAL_HOUR", f24202t);
        f38924Q = lVar;
        BigDecimal bigDecimal = f24203u;
        C10967l lVar2 = new C10967l("DECIMAL_MINUTE", bigDecimal);
        f38925R = lVar2;
        C10967l lVar3 = new C10967l("DECIMAL_SECOND", bigDecimal);
        f38926S = lVar3;
        AbstractC8079p<EnumC10899g> pVar = C10958i0.f24317n;
        f38927T = pVar;
        HashMap hashMap = new HashMap();
        m11734u0(hashMap, q0Var);
        m11734u0(hashMap, dVar);
        m11734u0(hashMap, D);
        m11734u0(hashMap, D2);
        m11734u0(hashMap, E);
        m11734u0(hashMap, E2);
        m11734u0(hashMap, E3);
        m11734u0(hashMap, E4);
        m11734u0(hashMap, E5);
        m11734u0(hashMap, E6);
        m11734u0(hashMap, E7);
        m11734u0(hashMap, E8);
        m11734u0(hashMap, E9);
        m11734u0(hashMap, E10);
        m11734u0(hashMap, E11);
        m11734u0(hashMap, D3);
        m11734u0(hashMap, D4);
        m11734u0(hashMap, lVar);
        m11734u0(hashMap, lVar2);
        m11734u0(hashMap, lVar3);
        f38928U = Collections.unmodifiableMap(hashMap);
        C10908b bVar = new C10908b(lVar, f24201s);
        f38929V = bVar;
        C10908b bVar2 = new C10908b(lVar2, bigDecimal);
        f38930W = bVar2;
        C10908b bVar3 = new C10908b(lVar3, bigDecimal);
        f38931X = bVar3;
        C8059h0.C8061b d = C8059h0.C8061b.m20698k(AbstractC11034v.class, C10906g0.class, new C10912f(null), g0Var, g0Var2).m20705d(q0Var, new C10915i(null)).m20705d(dVar, new C10913g(null));
        C10910d dVar2 = new C10910d(D, 1, 12);
        EnumC10899g gVar = EnumC10899g.f24189k;
        C8059h0.C8061b e = d.m20704e(D, dVar2, gVar).m20704e(D2, new C10910d(D2, 1, 24), gVar).m20704e(E, new C10910d(E, 0, 11), gVar).m20704e(E2, new C10910d(E2, 0, 23), gVar).m20704e(E3, new C10910d(E3, 0, 24), gVar);
        C10910d dVar3 = new C10910d(E4, 0, 59);
        EnumC10899g gVar2 = EnumC10899g.f24190l;
        C8059h0.C8061b e2 = e.m20704e(E4, dVar3, gVar2).m20704e(E5, new C10910d(E5, 0, 1440), gVar2);
        C10910d dVar4 = new C10910d(E6, 0, 59);
        EnumC10899g gVar3 = EnumC10899g.f24191m;
        C8059h0.C8061b e3 = e2.m20704e(E6, dVar4, gVar3).m20704e(E7, new C10910d(E7, 0, 86400), gVar3);
        C10910d dVar5 = new C10910d(E8, 0, 999);
        EnumC10899g gVar4 = EnumC10899g.f24192n;
        C8059h0.C8061b e4 = e3.m20704e(E8, dVar5, gVar4);
        C10910d dVar6 = new C10910d(E9, 0, 999999);
        EnumC10899g gVar5 = EnumC10899g.f24193o;
        C8059h0.C8061b e5 = e4.m20704e(E9, dVar6, gVar5);
        C10910d dVar7 = new C10910d(E10, 0, 999999999);
        EnumC10899g gVar6 = EnumC10899g.f24194p;
        C8059h0.C8061b d2 = e5.m20704e(E10, dVar7, gVar6).m20704e(E11, new C10910d(E11, 0, 86400000), gVar4).m20704e(D3, new C10911e(D3, 0L, 86400000000L), gVar5).m20704e(D4, new C10911e(D4, 0L, 86400000000000L), gVar6).m20705d(lVar, bVar).m20705d(lVar2, bVar2).m20705d(lVar3, bVar3).m20705d(pVar, new C10914h(null));
        m11765Q0(d2);
        m11763R0(d2);
        f38932Y = d2.m20701h();
    }

    private C10906g0(int i, int i2, int i3, int i4, boolean z) {
        if (z) {
            m11742m0(i);
            m11741n0(i2);
            m11739p0(i3);
            m11740o0(i4);
            if (i == 24 && (i2 | i3 | i4) != 0) {
                throw new IllegalArgumentException("T24:00:00 exceeded.");
            }
        }
        this.f24209k = (byte) i;
        this.f24210l = (byte) i2;
        this.f24211m = (byte) i3;
        this.f24212n = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public boolean m11782C0() {
        return ((this.f24210l | this.f24211m) | this.f24212n) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public boolean m11781D0() {
        return (this.f24211m | this.f24212n) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public static Object m11778G0(String str) {
        return f38928U.get(str);
    }

    /* renamed from: H0 */
    public static C10906g0 m11777H0() {
        return f24206x;
    }

    /* renamed from: I0 */
    public static C10906g0 m11776I0() {
        return f24205w;
    }

    /* renamed from: J0 */
    public static C10906g0 m11775J0(int i) {
        m11742m0(i);
        return f24204v[i];
    }

    /* renamed from: K0 */
    public static C10906g0 m11774K0(int i, int i2) {
        if (i2 == 0) {
            return m11775J0(i);
        }
        return new C10906g0(i, i2, 0, 0, true);
    }

    /* renamed from: L0 */
    public static C10906g0 m11773L0(int i, int i2, int i3) {
        if ((i2 | i3) == 0) {
            return m11775J0(i);
        }
        return new C10906g0(i, i2, i3, 0, true);
    }

    /* renamed from: M0 */
    public static C10906g0 m11771M0(int i, int i2, int i3, int i4) {
        return m11769N0(i, i2, i3, i4, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static C10906g0 m11769N0(int i, int i2, int i3, int i4, boolean z) {
        if ((i2 | i3 | i4) != 0) {
            return new C10906g0(i, i2, i3, i4, z);
        }
        if (z) {
            return m11775J0(i);
        }
        return f24204v[i];
    }

    /* renamed from: O0 */
    public static C10906g0 m11768O0(BigDecimal bigDecimal) {
        return f38929V.mo11077m(null, bigDecimal, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public static void m11767P0(StringBuilder sb2, int i) {
        int i2;
        sb2.append(f24197o);
        String num = Integer.toString(i);
        if (i % 1000000 == 0) {
            i2 = 3;
        } else if (i % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
            i2 = 6;
        } else {
            i2 = 9;
        }
        for (int length = num.length(); length < 9; length++) {
            sb2.append('0');
        }
        int length2 = (i2 + num.length()) - 9;
        for (int i3 = 0; i3 < length2; i3++) {
            sb2.append(num.charAt(i3));
        }
    }

    /* renamed from: Q0 */
    private static void m11765Q0(C8059h0.C8061b<AbstractC11034v, C10906g0> bVar) {
        for (AbstractC8082s sVar : AbstractC10814d.m12187c().mo12183g(AbstractC8082s.class)) {
            if (sVar.mo10714c(C10906g0.class)) {
                bVar.m20703f(sVar);
            }
        }
        bVar.m20703f(new C10961k.C10964c());
    }

    /* renamed from: R0 */
    private static void m11763R0(C8059h0.C8061b<AbstractC11034v, C10906g0> bVar) {
        EnumC10899g[] values;
        Set<? extends AbstractC11034v> allOf = EnumSet.allOf(EnumC10899g.class);
        for (EnumC10899g gVar : EnumC10899g.values()) {
            bVar.m20702g(gVar, new C10909c(gVar, null), gVar.getLength(), allOf);
        }
    }

    /* renamed from: k0 */
    private static void m11744k0(int i, StringBuilder sb2) {
        if (i < 10) {
            sb2.append('0');
        }
        sb2.append(i);
    }

    /* renamed from: l0 */
    public static C8059h0<AbstractC11034v, C10906g0> m11743l0() {
        return f38932Y;
    }

    /* renamed from: m0 */
    private static void m11742m0(long j) {
        if (j < 0 || j > 24) {
            throw new IllegalArgumentException("HOUR_OF_DAY out of range: " + j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static void m11741n0(long j) {
        if (j < 0 || j > 59) {
            throw new IllegalArgumentException("MINUTE_OF_HOUR out of range: " + j);
        }
    }

    /* renamed from: o0 */
    private static void m11740o0(int i) {
        if (i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException("NANO_OF_SECOND out of range: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static void m11739p0(long j) {
        if (j < 0 || j > 59) {
            throw new IllegalArgumentException("SECOND_OF_MINUTE out of range: " + j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static C10906g0 m11737r0(long j, int i) {
        int i2 = (((int) (j % 1000000)) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) + i;
        int i3 = (int) (j / 1000000);
        int i4 = i3 % 60;
        int i5 = i3 / 60;
        return m11771M0(i5 / 60, i5 % 60, i4, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static C10906g0 m11736s0(int i, int i2) {
        int i3 = ((i % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * 1000000) + i2;
        int i4 = i / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        int i5 = i4 % 60;
        int i6 = i4 / 60;
        return m11771M0(i6 / 60, i6 % 60, i5, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static C10906g0 m11735t0(long j) {
        int i = (int) (j / 1000000000);
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 % 60;
        return m11771M0(i3 / 60, i4, i2, (int) (j % 1000000000));
    }

    /* renamed from: u0 */
    private static void m11734u0(Map<String, Object> map, AbstractC8079p<?> pVar) {
        map.put(pVar.name(), pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static long m11733v0(long j, long j2) {
        if (j >= 0) {
            return j / j2;
        }
        return ((j + 1) / j2) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static long m11732w0(long j, long j2) {
        long j3;
        if (j >= 0) {
            j3 = j / j2;
        } else {
            j3 = ((j + 1) / j2) - 1;
        }
        Long.signum(j2);
        return j - (j2 * j3);
    }

    private Object writeReplace() {
        return new SPX(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public long m11730y0() {
        return this.f24212n + (this.f24211m * 1000000000) + (this.f24210l * 60 * 1000000000) + (this.f24209k * 3600 * 1000000000);
    }

    /* renamed from: A0 */
    public boolean m11784A0(C10906g0 g0Var) {
        return compareTo(g0Var) > 0;
    }

    /* renamed from: B0 */
    public boolean m11783B0(C10906g0 g0Var) {
        return compareTo(g0Var) < 0;
    }

    /* renamed from: E0 */
    public boolean m11780E0() {
        return m11782C0() && this.f24209k % 24 == 0;
    }

    /* renamed from: F0 */
    public boolean m11779F0(C10906g0 g0Var) {
        return compareTo(g0Var) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8069k0
    /* renamed from: G */
    public C8059h0<AbstractC11034v, C10906g0> mo11639t() {
        return f38932Y;
    }

    /* renamed from: S0 */
    public C10959j m11762S0(long j, EnumC10899g gVar) {
        return C10909c.m11717e(this, j, gVar);
    }

    @Override // net.time4j.base.AbstractC10818g
    /* renamed from: a */
    public int mo11655a() {
        return this.f24212n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10906g0)) {
            return false;
        }
        C10906g0 g0Var = (C10906g0) obj;
        if (this.f24209k == g0Var.f24209k && this.f24210l == g0Var.f24210l && this.f24211m == g0Var.f24211m && this.f24212n == g0Var.f24212n) {
            return true;
        }
        return false;
    }

    @Override // net.time4j.base.AbstractC10818g
    /* renamed from: g */
    public int mo11648g() {
        return this.f24211m;
    }

    public int hashCode() {
        return this.f24209k + (this.f24210l * 60) + (this.f24211m * 3600) + (this.f24212n * 37);
    }

    @Override // net.time4j.base.AbstractC10818g
    /* renamed from: j */
    public int mo11644j() {
        return this.f24210l;
    }

    @Override // net.time4j.base.AbstractC10818g
    /* renamed from: p */
    public int mo11640p() {
        return this.f24209k;
    }

    /* renamed from: q0 */
    public int compareTo(C10906g0 g0Var) {
        int i = this.f24209k - g0Var.f24209k;
        if (i == 0 && (i = this.f24210l - g0Var.f24210l) == 0 && (i = this.f24211m - g0Var.f24211m) == 0) {
            i = this.f24212n - g0Var.f24212n;
        }
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append('T');
        m11744k0(this.f24209k, sb2);
        if ((this.f24210l | this.f24211m | this.f24212n) != 0) {
            sb2.append(':');
            m11744k0(this.f24210l, sb2);
            if ((this.f24211m | this.f24212n) != 0) {
                sb2.append(':');
                m11744k0(this.f24211m, sb2);
                int i = this.f24212n;
                if (i != 0) {
                    m11767P0(sb2, i);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x0 */
    public C10906g0 mo11638u() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public boolean m11729z0(AbstractC8079p<?> pVar) {
        if ((pVar != f38921N || this.f24212n % 1000000 == 0) && ((pVar != f38913F || m11782C0()) && ((pVar != f38915H || m11781D0()) && ((pVar != f38917J || this.f24212n == 0) && (pVar != f38922O || this.f24212n % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0))))) {
            return false;
        }
        return true;
    }
}
