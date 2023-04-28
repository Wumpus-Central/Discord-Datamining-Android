package si;

import co.discord.media_engine.C4081a;
import com.reactnativecommunity.webview.RNCWebViewManager;
import eg.C6880g;
import eg.C6884j;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b$\b\u0087@\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001OB\u0014\b\u0000\u0012\u0006\u00100\u001a\u00020\u000bø\u0001\u0001¢\u0006\u0004\bN\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010'\u001a\u00020&*\u00060 j\u0002`!2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001d¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00102\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0014\u00105\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0017\u00107\u001a\u00020\u00008Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b6\u0010\u0007R\u001a\u0010:\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b/\u0010+R\u001a\u0010=\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010+R\u001a\u0010@\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010+R\u001a\u0010C\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\bB\u00109\u001a\u0004\bA\u0010+R\u0011\u0010E\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bD\u0010\u0007R\u0011\u0010G\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bF\u0010\u0007R\u0011\u0010I\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bH\u0010\u0007R\u0011\u0010K\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0007R\u0011\u0010M\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bL\u0010\u0007\u0088\u00010\u0092\u0001\u00020\u000bø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006P"}, m15073d2 = {"Lsi/a;", "", "", "z", "(J)Z", "y", "J", "(J)J", "other", "D", "(JJ)J", "", "thisMillis", "otherNanos", "c", "(JJJ)J", "C", "B", "x", "", "g", "(JJ)I", "Lsi/d;", "unit", "", "E", "(JLsi/d;)D", "G", "(JLsi/d;)J", "", "I", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "d", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "F", "v", "(J)I", "", "i", "(JLjava/lang/Object;)Z", "k", "rawValue", "u", "value", "t", "(J)Lsi/d;", "storageUnit", "j", "absoluteValue", "getHoursComponent$annotations", "()V", "hoursComponent", "q", "getMinutesComponent$annotations", "minutesComponent", "s", "getSecondsComponent$annotations", "secondsComponent", "r", "getNanosecondsComponent$annotations", "nanosecondsComponent", "l", "inWholeDays", "m", "inWholeHours", "o", "inWholeMinutes", "p", "inWholeSeconds", "n", "inWholeMilliseconds", "h", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: si.a */
/* loaded from: classes8.dex */
public final class C12905a implements Comparable<C12905a> {

    /* renamed from: l */
    public static final C0415a f28981l = new C0415a(null);

    /* renamed from: m */
    private static final long f28982m = m5130h(0);

    /* renamed from: n */
    private static final long f28983n = C12907c.m5107b(4611686018427387903L);

    /* renamed from: o */
    private static final long f28984o = C12907c.m5107b(-4611686018427387903L);

    /* renamed from: k */
    private final long f28985k;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000f"}, m15073d2 = {"Lsi/a$a;", "", "", "value", "Lsi/a;", "c", "(Ljava/lang/String;)J", "ZERO", "J", "b", "()J", "INFINITE", "a", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: si.a$a */
    /* loaded from: classes8.dex */
    public static final class C0415a {
        private C0415a() {
        }

        public /* synthetic */ C0415a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m5112a() {
            return C12905a.f28983n;
        }

        /* renamed from: b */
        public final long m5111b() {
            return C12905a.f28982m;
        }

        /* renamed from: c */
        public final long m5110c(String value) {
            C9971q.m14633g(value, "value");
            try {
                return C12907c.m5101h(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }
    }

    private /* synthetic */ C12905a(long j) {
        this.f28985k = j;
    }

    /* renamed from: B */
    public static final boolean m5146B(long j) {
        return j == f28983n || j == f28984o;
    }

    /* renamed from: C */
    public static final boolean m5145C(long j) {
        return j < 0;
    }

    /* renamed from: D */
    public static final long m5144D(long j, long j2) {
        if (m5146B(j)) {
            if (m5115x(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (m5146B(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long u = m5117u(j) + m5117u(j2);
                if (m5113z(j)) {
                    return C12907c.m5104e(u);
                }
                return C12907c.m5106c(u);
            } else if (m5114y(j)) {
                return m5135c(j, m5117u(j), m5117u(j2));
            } else {
                return m5135c(j, m5117u(j2), m5117u(j));
            }
        }
    }

    /* renamed from: E */
    public static final double m5143E(long j, EnumC12908d unit) {
        C9971q.m14633g(unit, "unit");
        if (j == f28983n) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f28984o) {
            return Double.NEGATIVE_INFINITY;
        }
        return C12909e.m5086a(m5117u(j), m5118t(j), unit);
    }

    /* renamed from: F */
    public static final String m5142F(long j) {
        boolean z;
        boolean z2;
        StringBuilder sb2 = new StringBuilder();
        if (m5145C(j)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long j2 = m5128j(j);
        long m = m5125m(j2);
        int q = m5121q(j2);
        int s = m5119s(j2);
        int r = m5120r(j2);
        if (m5146B(j)) {
            m = 9999999999999L;
        }
        boolean z3 = true;
        if (m != 0) {
            z = true;
        } else {
            z = false;
        }
        if (s == 0 && r == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (q == 0 && (!z2 || !z)) {
            z3 = false;
        }
        if (z) {
            sb2.append(m);
            sb2.append('H');
        }
        if (z3) {
            sb2.append(q);
            sb2.append('M');
        }
        if (z2 || (!z && !z3)) {
            m5134d(j, sb2, s, r, 9, "S", true);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: G */
    public static final long m5141G(long j, EnumC12908d unit) {
        C9971q.m14633g(unit, "unit");
        if (j == f28983n) {
            return Long.MAX_VALUE;
        }
        if (j == f28984o) {
            return Long.MIN_VALUE;
        }
        return C12909e.m5085b(m5117u(j), m5118t(j), unit);
    }

    /* renamed from: I */
    public static String m5140I(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (j == 0) {
            return "0s";
        }
        if (j == f28983n) {
            return "Infinity";
        }
        if (j == f28984o) {
            return "-Infinity";
        }
        boolean C = m5145C(j);
        StringBuilder sb2 = new StringBuilder();
        if (C) {
            sb2.append('-');
        }
        long j2 = m5128j(j);
        long l = m5126l(j2);
        int k = m5127k(j2);
        int q = m5121q(j2);
        int s = m5119s(j2);
        int r = m5120r(j2);
        int i = 0;
        if (l != 0) {
            z = true;
        } else {
            z = false;
        }
        if (k != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (q != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (s == 0 && r == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            sb2.append(l);
            sb2.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(k);
            sb2.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(q);
            sb2.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            if (s != 0 || z || z2 || z3) {
                m5134d(j, sb2, s, r, 9, "s", false);
            } else if (r >= 1000000) {
                m5134d(j, sb2, r / 1000000, r % 1000000, 6, "ms", false);
            } else if (r >= 1000) {
                m5134d(j, sb2, r / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, r % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 3, "us", false);
            } else {
                sb2.append(r);
                sb2.append("ns");
            }
            i = i4;
        }
        if (C && i > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: J */
    public static final long m5139J(long j) {
        return C12907c.m5108a(-m5117u(j), ((int) j) & 1);
    }

    /* renamed from: c */
    private static final long m5135c(long j, long j2, long j3) {
        long k;
        long g = C12907c.m5102g(j3);
        long j4 = j2 + g;
        if (new C6880g(-4611686018426L, 4611686018426L).m23981j(j4)) {
            return C12907c.m5105d(C12907c.m5103f(j4) + (j3 - C12907c.m5103f(g)));
        }
        k = C6884j.m23953k(j4, -4611686018427387903L, 4611686018427387903L);
        return C12907c.m5107b(k);
    }

    /* renamed from: d */
    private static final void m5134d(long j, StringBuilder sb2, int i, int i2, int i3, String str, boolean z) {
        String j0;
        boolean z2;
        sb2.append(i);
        if (i2 != 0) {
            sb2.append('.');
            j0 = C12719v.m5676j0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = j0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (j0.charAt(length) != '0') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb2.append((CharSequence) j0, 0, ((i6 + 2) / 3) * 3);
                C9971q.m14634f(sb2, "this.append(value, startIndex, endIndex)");
            } else {
                sb2.append((CharSequence) j0, 0, i6);
                C9971q.m14634f(sb2, "this.append(value, startIndex, endIndex)");
            }
        }
        sb2.append(str);
    }

    /* renamed from: e */
    public static final /* synthetic */ C12905a m5133e(long j) {
        return new C12905a(j);
    }

    /* renamed from: g */
    public static int m5131g(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return C9971q.m14630j(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        if (m5145C(j)) {
            return -i;
        }
        return i;
    }

    /* renamed from: h */
    public static long m5130h(long j) {
        if (C12906b.m5109a()) {
            if (m5113z(j)) {
                if (!new C6880g(-4611686018426999999L, 4611686018426999999L).m23981j(m5117u(j))) {
                    throw new AssertionError(m5117u(j) + " ns is out of nanoseconds range");
                }
            } else if (!new C6880g(-4611686018427387903L, 4611686018427387903L).m23981j(m5117u(j))) {
                throw new AssertionError(m5117u(j) + " ms is out of milliseconds range");
            } else if (new C6880g(-4611686018426L, 4611686018426L).m23981j(m5117u(j))) {
                throw new AssertionError(m5117u(j) + " ms is denormalized");
            }
        }
        return j;
    }

    /* renamed from: i */
    public static boolean m5129i(long j, Object obj) {
        return (obj instanceof C12905a) && j == ((C12905a) obj).m5138K();
    }

    /* renamed from: j */
    public static final long m5128j(long j) {
        return m5145C(j) ? m5139J(j) : j;
    }

    /* renamed from: k */
    public static final int m5127k(long j) {
        if (m5146B(j)) {
            return 0;
        }
        return (int) (m5125m(j) % 24);
    }

    /* renamed from: l */
    public static final long m5126l(long j) {
        return m5141G(j, EnumC12908d.DAYS);
    }

    /* renamed from: m */
    public static final long m5125m(long j) {
        return m5141G(j, EnumC12908d.HOURS);
    }

    /* renamed from: n */
    public static final long m5124n(long j) {
        return (!m5114y(j) || !m5115x(j)) ? m5141G(j, EnumC12908d.MILLISECONDS) : m5117u(j);
    }

    /* renamed from: o */
    public static final long m5123o(long j) {
        return m5141G(j, EnumC12908d.MINUTES);
    }

    /* renamed from: p */
    public static final long m5122p(long j) {
        return m5141G(j, EnumC12908d.SECONDS);
    }

    /* renamed from: q */
    public static final int m5121q(long j) {
        if (m5146B(j)) {
            return 0;
        }
        return (int) (m5123o(j) % 60);
    }

    /* renamed from: r */
    public static final int m5120r(long j) {
        long j2;
        if (m5146B(j)) {
            return 0;
        }
        if (m5114y(j)) {
            j2 = C12907c.m5103f(m5117u(j) % ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
        } else {
            j2 = m5117u(j) % 1000000000;
        }
        return (int) j2;
    }

    /* renamed from: s */
    public static final int m5119s(long j) {
        if (m5146B(j)) {
            return 0;
        }
        return (int) (m5122p(j) % 60);
    }

    /* renamed from: t */
    private static final EnumC12908d m5118t(long j) {
        return m5113z(j) ? EnumC12908d.NANOSECONDS : EnumC12908d.MILLISECONDS;
    }

    /* renamed from: u */
    private static final long m5117u(long j) {
        return j >> 1;
    }

    /* renamed from: v */
    public static int m5116v(long j) {
        return C4081a.m32873a(j);
    }

    /* renamed from: x */
    public static final boolean m5115x(long j) {
        return !m5146B(j);
    }

    /* renamed from: y */
    private static final boolean m5114y(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: z */
    private static final boolean m5113z(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: K */
    public final /* synthetic */ long m5138K() {
        return this.f28985k;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C12905a aVar) {
        return m5132f(aVar.m5138K());
    }

    public boolean equals(Object obj) {
        return m5129i(this.f28985k, obj);
    }

    /* renamed from: f */
    public int m5132f(long j) {
        return m5131g(this.f28985k, j);
    }

    public int hashCode() {
        return m5116v(this.f28985k);
    }

    public String toString() {
        return m5140I(this.f28985k);
    }
}
