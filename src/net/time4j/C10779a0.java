package net.time4j;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.C10812b;
import net.time4j.base.C10813c;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.AbstractC11027o;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.EnumC10997g;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8053f0;
import p143hj.AbstractC8065i0;
import p143hj.AbstractC8069k0;
import p143hj.AbstractC8070l;
import p143hj.AbstractC8073m;
import p143hj.AbstractC8074m0;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8084u;
import p143hj.AbstractC8085v;
import p143hj.AbstractC8090y;
import p143hj.AbstractC8091z;
import p143hj.C8059h0;
import p143hj.C8066j;
import p143hj.C8081r;
import p143hj.C8087x;
import p143hj.EnumC8042a0;
import p143hj.EnumC8045b0;
import p161ij.AbstractC8633c;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.EnumC8635e;
import p271oj.AbstractC11408b;
import p271oj.AbstractC11414g;
import p271oj.C11410d;
import p271oj.EnumC11413f;

@AbstractC8633c("iso8601")
/* renamed from: net.time4j.a0 */
/* loaded from: classes8.dex */
public final class C10779a0 extends AbstractC8069k0<TimeUnit, C10779a0> implements AbstractC11414g {

    /* renamed from: m */
    private static final long f23931m;

    /* renamed from: n */
    private static final long f23932n;

    /* renamed from: o */
    private static final C10779a0 f23933o;

    /* renamed from: p */
    private static final C10779a0 f23934p;

    /* renamed from: q */
    private static final C10779a0 f23935q;

    /* renamed from: r */
    private static final Set<AbstractC8079p<?>> f23936r;

    /* renamed from: s */
    private static final Map<AbstractC8079p<?>, Integer> f23937s;
    private static final long serialVersionUID = -3192884724477742274L;

    /* renamed from: t */
    private static final Map<TimeUnit, Double> f23938t;

    /* renamed from: u */
    private static final C8059h0<TimeUnit, C10779a0> f23939u;

    /* renamed from: v */
    public static final C10779a0 f23940v;

    /* renamed from: w */
    public static final AbstractC8079p<Long> f23941w;

    /* renamed from: x */
    public static final AbstractC8079p<Integer> f23942x;

    /* renamed from: y */
    public static final AbstractC8079p<TimeUnit> f23943y;

    /* renamed from: z */
    private static final AbstractC8085v<C10779a0> f23944z;

    /* renamed from: k */
    private final transient long f23945k;

    /* renamed from: l */
    private final transient int f23946l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.a0$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10780a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23947a;

        /* renamed from: b */
        static final /* synthetic */ int[] f23948b;

        /* renamed from: c */
        static final /* synthetic */ int[] f23949c;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f23949c = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23949c[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23949c[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23949c[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23949c[TimeUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23949c[TimeUnit.MICROSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23949c[TimeUnit.NANOSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC10974n0.values().length];
            f23948b = iArr2;
            try {
                iArr2[EnumC10974n0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23948b[EnumC10974n0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[EnumC11413f.values().length];
            f23947a = iArr3;
            try {
                iArr3[EnumC11413f.POSIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23947a[EnumC11413f.UTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23947a[EnumC11413f.TAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23947a[EnumC11413f.GPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23947a[EnumC11413f.TT.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23947a[EnumC11413f.UT.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: net.time4j.a0$b */
    /* loaded from: classes8.dex */
    private static class C10781b implements AbstractC8065i0<C10779a0> {
        private C10781b() {
        }

        /* synthetic */ C10781b(C10780a aVar) {
            this();
        }

        /* renamed from: b */
        public int compare(C10779a0 a0Var, C10779a0 a0Var2) {
            return a0Var.compareTo(a0Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.a0$c */
    /* loaded from: classes8.dex */
    public enum EnumC10782c implements AbstractC8079p<Integer>, AbstractC8091z<C10779a0, Integer> {
        FRACTION;

        /* renamed from: D */
        public Integer mo11078k(C10779a0 a0Var) {
            return mo11062T();
        }

        /* renamed from: E */
        public Integer mo11076n(C10779a0 a0Var) {
            return Integer.valueOf(a0Var.mo11327a());
        }

        /* renamed from: F */
        public boolean mo11081h(C10779a0 a0Var, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 0 && intValue < 1000000000;
        }

        /* renamed from: G */
        public C10779a0 mo11077m(C10779a0 a0Var, Integer num, boolean z) {
            if (num == null) {
                throw new IllegalArgumentException("Missing fraction value.");
            } else if (!C11410d.m10131A().m10127G()) {
                return C10779a0.m12308o0(a0Var.mo11325h(), num.intValue(), EnumC11413f.POSIX);
            } else {
                EnumC11413f fVar = EnumC11413f.UTC;
                return C10779a0.m12308o0(a0Var.mo10105i(fVar), num.intValue(), fVar);
            }
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: M */
        public boolean mo11063M() {
            return false;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: U */
        public boolean mo11061U() {
            return false;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: a */
        public char mo11060a() {
            return (char) 0;
        }

        @Override // p143hj.AbstractC8079p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: i */
        public boolean mo11088i() {
            return false;
        }

        /* renamed from: o */
        public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
            return ((Integer) oVar.mo11371r(this)).compareTo((Integer) oVar2.mo11371r(this));
        }

        /* renamed from: q */
        public AbstractC8079p<?> mo11086b(C10779a0 a0Var) {
            return null;
        }

        /* renamed from: s */
        public AbstractC8079p<?> mo11085c(C10779a0 a0Var) {
            return null;
        }

        /* renamed from: v */
        public Integer mo11059f() {
            return 999999999;
        }

        /* renamed from: x */
        public Integer mo11062T() {
            return 0;
        }

        /* renamed from: y */
        public Integer mo11084d(C10779a0 a0Var) {
            return mo11059f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.a0$d */
    /* loaded from: classes8.dex */
    public enum EnumC10783d implements AbstractC8079p<Long>, AbstractC8091z<C10779a0, Long> {
        POSIX_TIME;

        /* renamed from: D */
        public Long mo11078k(C10779a0 a0Var) {
            return Long.valueOf(C10779a0.f23931m);
        }

        /* renamed from: E */
        public Long mo11076n(C10779a0 a0Var) {
            return Long.valueOf(a0Var.mo11325h());
        }

        /* renamed from: F */
        public boolean mo11081h(C10779a0 a0Var, Long l) {
            if (l == null) {
                return false;
            }
            long longValue = l.longValue();
            if (longValue < C10779a0.f23931m || longValue > C10779a0.f23932n) {
                return false;
            }
            return true;
        }

        /* renamed from: G */
        public C10779a0 mo11077m(C10779a0 a0Var, Long l, boolean z) {
            if (l != null) {
                return C10779a0.m12308o0(l.longValue(), a0Var.mo11327a(), EnumC11413f.POSIX);
            }
            throw new IllegalArgumentException("Missing elapsed seconds.");
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: M */
        public boolean mo11063M() {
            return false;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: U */
        public boolean mo11061U() {
            return false;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: a */
        public char mo11060a() {
            return (char) 0;
        }

        @Override // p143hj.AbstractC8079p
        public Class<Long> getType() {
            return Long.class;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: i */
        public boolean mo11088i() {
            return false;
        }

        /* renamed from: o */
        public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
            return ((Long) oVar.mo11371r(this)).compareTo((Long) oVar2.mo11371r(this));
        }

        /* renamed from: q */
        public AbstractC8079p<?> mo11086b(C10779a0 a0Var) {
            return EnumC10782c.FRACTION;
        }

        /* renamed from: s */
        public AbstractC8079p<?> mo11085c(C10779a0 a0Var) {
            return EnumC10782c.FRACTION;
        }

        /* renamed from: v */
        public Long mo11059f() {
            return Long.valueOf(C10779a0.f23932n);
        }

        /* renamed from: x */
        public Long mo11062T() {
            return Long.valueOf(C10779a0.f23931m);
        }

        /* renamed from: y */
        public Long mo11084d(C10779a0 a0Var) {
            return Long.valueOf(C10779a0.f23932n);
        }
    }

    /* renamed from: net.time4j.a0$e */
    /* loaded from: classes8.dex */
    private static class C10784e implements AbstractC8084u<C10779a0> {
        private C10784e() {
        }

        /* synthetic */ C10784e(C10780a aVar) {
            this();
        }

        /* renamed from: a */
        public C10779a0 mo11614k(AbstractC8080q<?> qVar, AbstractC8048d dVar, boolean z, boolean z2) {
            C10917h0 h0Var;
            AbstractC11001k kVar;
            C10779a0 a0Var;
            C11028p pVar;
            C10779a0 a0Var2;
            EnumC10997g gVar;
            EnumC11413f fVar = (EnumC11413f) dVar.mo15674c(C8627a.f19074w, EnumC11413f.UTC);
            if (qVar instanceof AbstractC10817f) {
                return C10779a0.m12319d0((AbstractC10817f) AbstractC10817f.class.cast(qVar)).m12299x0(fVar);
            }
            EnumC10783d dVar2 = EnumC10783d.POSIX_TIME;
            int i = 0;
            if (qVar.mo11377e(dVar2)) {
                long longValue = ((Long) qVar.mo11371r(dVar2)).longValue();
                EnumC10782c cVar = EnumC10782c.FRACTION;
                if (qVar.mo11377e(cVar)) {
                    i = ((Integer) qVar.mo11371r(cVar)).intValue();
                }
                return C10779a0.m12308o0(longValue, i, EnumC11413f.POSIX).m12299x0(fVar);
            }
            if (qVar.mo11377e(EnumC8045b0.LEAP_SECOND)) {
                qVar.mo15655B(C10906g0.f38916I, 60);
                i = 1;
            }
            AbstractC8079p<?> K = C10917h0.m11660V().m20712K();
            if (qVar.mo11377e(K)) {
                h0Var = (C10917h0) qVar.mo11371r(K);
            } else {
                h0Var = C10917h0.m11660V().mo11614k(qVar, dVar, z, z2);
            }
            if (h0Var == null) {
                return null;
            }
            if (qVar.mo11376f()) {
                kVar = qVar.mo11372q();
            } else {
                AbstractC8046c<AbstractC11001k> cVar2 = C8627a.f19055d;
                if (dVar.mo15676a(cVar2)) {
                    kVar = (AbstractC11001k) dVar.mo15675b(cVar2);
                } else {
                    kVar = null;
                }
            }
            if (kVar != null) {
                EnumC8045b0 b0Var = EnumC8045b0.DAYLIGHT_SAVING;
                if (qVar.mo11377e(b0Var)) {
                    boolean booleanValue = ((Boolean) qVar.mo11371r(b0Var)).booleanValue();
                    AbstractC11027o oVar = (AbstractC11027o) dVar.mo15674c(C8627a.f19056e, AbstractC11002l.f24453n);
                    if (booleanValue) {
                        gVar = EnumC10997g.EARLIER_OFFSET;
                    } else {
                        gVar = EnumC10997g.LATER_OFFSET;
                    }
                    a0Var = h0Var.m11653b0(AbstractC11002l.m11310N(kVar).mo11307Q(oVar.mo11198a(gVar)));
                } else {
                    AbstractC8046c<AbstractC11027o> cVar3 = C8627a.f19056e;
                    if (dVar.mo15676a(cVar3)) {
                        a0Var = h0Var.m11653b0(AbstractC11002l.m11310N(kVar).mo11307Q((AbstractC11027o) dVar.mo15675b(cVar3)));
                    } else {
                        a0Var = h0Var.m11652c0(kVar);
                    }
                }
            } else {
                a0Var = null;
            }
            if (a0Var == null) {
                return null;
            }
            if (i != 0) {
                if (kVar instanceof C11028p) {
                    pVar = (C11028p) kVar;
                } else {
                    pVar = AbstractC11002l.m11310N(kVar).mo11322B(a0Var);
                }
                if (pVar.m11188i() == 0 && pVar.m11189h() % 60 == 0) {
                    if (a0Var.m12317f0().mo11643m() >= 1972) {
                        a0Var2 = a0Var.m12306q0(1L, EnumC10974n0.SECONDS);
                    } else {
                        a0Var2 = new C10779a0(a0Var.mo11327a(), a0Var.mo11325h() + 1, (C10780a) null);
                    }
                    if (!z) {
                        if (C11410d.m10131A().m10127G()) {
                            if (!a0Var2.m12309n0()) {
                                throw new IllegalArgumentException("SECOND_OF_MINUTE parsed as invalid leapsecond before " + a0Var2);
                            }
                        }
                    }
                    a0Var = a0Var2;
                } else {
                    throw new IllegalArgumentException("Leap second is only allowed  with timezone-offset in full minutes: " + pVar);
                }
            }
            return a0Var.m12299x0(fVar);
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: b */
        public AbstractC8053f0 mo11620b() {
            return AbstractC8053f0.f17431a;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: c */
        public C8087x<?> mo11619c() {
            return C10917h0.m11660V();
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: d */
        public int mo11618d() {
            return C10892f0.m11835v0().mo11618d();
        }

        /* renamed from: e */
        public AbstractC8077o mo11615h(C10779a0 a0Var, AbstractC8048d dVar) {
            AbstractC8046c<AbstractC11001k> cVar = C8627a.f19055d;
            if (dVar.mo15676a(cVar)) {
                return a0Var.m12298y0((EnumC11413f) dVar.mo15674c(C8627a.f19074w, EnumC11413f.UTC)).m12312k0((AbstractC11001k) dVar.mo15675b(cVar));
            }
            throw new IllegalArgumentException("Cannot print moment without timezone.");
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: g */
        public String mo11616g(AbstractC8090y yVar, Locale locale) {
            EnumC8635e b = EnumC8635e.m18444b(yVar.mo18445a());
            return C8629b.m18453s(b, b, locale);
        }
    }

    /* renamed from: net.time4j.a0$f */
    /* loaded from: classes8.dex */
    private static class C10785f implements AbstractC8085v<C10779a0> {
        private C10785f() {
        }

        /* synthetic */ C10785f(C10780a aVar) {
            this();
        }

        /* renamed from: a */
        public C10779a0 apply(C10779a0 a0Var) {
            AbstractC11408b D;
            C11410d A = C11410d.m10131A();
            if (!A.m10127G() || (D = A.m10130D(a0Var.mo10105i(EnumC11413f.UTC))) == null) {
                return null;
            }
            return C10892f0.m11886A0(D.mo10113c()).m11836u0(23, 59, 59).m11661U().m12306q0(D.mo10115a(), EnumC10974n0.SECONDS);
        }
    }

    /* renamed from: net.time4j.a0$g */
    /* loaded from: classes8.dex */
    private static class C10786g implements AbstractC8091z<C10779a0, TimeUnit> {
        private C10786g() {
        }

        /* synthetic */ C10786g(C10780a aVar) {
            this();
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(C10779a0 a0Var) {
            return null;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(C10779a0 a0Var) {
            return null;
        }

        /* renamed from: f */
        public TimeUnit mo11084d(C10779a0 a0Var) {
            return TimeUnit.NANOSECONDS;
        }

        /* renamed from: i */
        public TimeUnit mo11078k(C10779a0 a0Var) {
            return TimeUnit.DAYS;
        }

        /* renamed from: j */
        public TimeUnit mo11076n(C10779a0 a0Var) {
            int a = a0Var.mo11327a();
            if (a == 0) {
                long j = a0Var.f23945k;
                if (C10813c.m12199d(j, 86400) == 0) {
                    return TimeUnit.DAYS;
                }
                if (C10813c.m12199d(j, 3600) == 0) {
                    return TimeUnit.HOURS;
                }
                if (C10813c.m12199d(j, 60) == 0) {
                    return TimeUnit.MINUTES;
                }
                return TimeUnit.SECONDS;
            } else if (a % 1000000 == 0) {
                return TimeUnit.MILLISECONDS;
            } else {
                if (a % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
                    return TimeUnit.MICROSECONDS;
                }
                return TimeUnit.NANOSECONDS;
            }
        }

        /* renamed from: o */
        public boolean mo11081h(C10779a0 a0Var, TimeUnit timeUnit) {
            return timeUnit != null;
        }

        /* renamed from: p */
        public C10779a0 mo11077m(C10779a0 a0Var, TimeUnit timeUnit, boolean z) {
            C10779a0 a0Var2;
            if (timeUnit != null) {
                switch (C10780a.f23949c[timeUnit.ordinal()]) {
                    case 1:
                        return C10779a0.m12307p0(C10813c.m12201b(a0Var.f23945k, 86400) * 86400, EnumC11413f.POSIX);
                    case 2:
                        return C10779a0.m12307p0(C10813c.m12201b(a0Var.f23945k, 3600) * 3600, EnumC11413f.POSIX);
                    case 3:
                        return C10779a0.m12307p0(C10813c.m12201b(a0Var.f23945k, 60) * 60, EnumC11413f.POSIX);
                    case 4:
                        a0Var2 = C10779a0.m12308o0(a0Var.f23945k, 0, EnumC11413f.POSIX);
                        break;
                    case 5:
                        a0Var2 = C10779a0.m12308o0(a0Var.f23945k, (a0Var.mo11327a() / 1000000) * 1000000, EnumC11413f.POSIX);
                        break;
                    case 6:
                        a0Var2 = C10779a0.m12308o0(a0Var.f23945k, (a0Var.mo11327a() / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, EnumC11413f.POSIX);
                        break;
                    case 7:
                        return a0Var;
                    default:
                        throw new UnsupportedOperationException(timeUnit.name());
                }
                if (!a0Var.m12310m0() || !C11410d.m10131A().m10127G()) {
                    return a0Var2;
                }
                return a0Var2.m12306q0(1L, EnumC10974n0.SECONDS);
            }
            throw new IllegalArgumentException("Missing precision.");
        }
    }

    /* renamed from: net.time4j.a0$h */
    /* loaded from: classes8.dex */
    private static class C10787h implements AbstractC8074m0<C10779a0> {

        /* renamed from: a */
        private final TimeUnit f23954a;

        C10787h(TimeUnit timeUnit) {
            this.f23954a = timeUnit;
        }

        /* renamed from: c */
        public C10779a0 mo11636b(C10779a0 a0Var, long j) {
            if (this.f23954a.compareTo(TimeUnit.SECONDS) >= 0) {
                return C10779a0.m12308o0(C10813c.m12197f(a0Var.mo11325h(), C10813c.m12194i(j, this.f23954a.toSeconds(1L))), a0Var.mo11327a(), EnumC11413f.POSIX);
            }
            long f = C10813c.m12197f(a0Var.mo11327a(), C10813c.m12194i(j, this.f23954a.toNanos(1L)));
            return C10779a0.m12308o0(C10813c.m12197f(a0Var.mo11325h(), C10813c.m12201b(f, 1000000000)), C10813c.m12199d(f, 1000000000), EnumC11413f.POSIX);
        }

        /* renamed from: d */
        public long mo11637a(C10779a0 a0Var, C10779a0 a0Var2) {
            long j;
            if (this.f23954a.compareTo(TimeUnit.SECONDS) >= 0) {
                j = a0Var2.mo11325h() - a0Var.mo11325h();
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i < 0) {
                    if (a0Var2.mo11327a() > a0Var.mo11327a()) {
                        j++;
                    }
                } else if (i > 0 && a0Var2.mo11327a() < a0Var.mo11327a()) {
                    j--;
                }
            } else {
                j = C10813c.m12197f(C10813c.m12194i(C10813c.m12190m(a0Var2.mo11325h(), a0Var.mo11325h()), 1000000000L), a0Var2.mo11327a() - a0Var.mo11327a());
            }
            switch (C10780a.f23949c[this.f23954a.ordinal()]) {
                case 1:
                    return j / 86400;
                case 2:
                    return j / 3600;
                case 3:
                    return j / 60;
                case 4:
                case 7:
                    return j;
                case 5:
                    return j / 1000000;
                case 6:
                    return j / 1000;
                default:
                    throw new UnsupportedOperationException(this.f23954a.name());
            }
        }
    }

    static {
        TimeUnit[] values;
        long j = C10812b.m12206j(-999999999, 1, 1);
        long j2 = C10812b.m12206j(999999999, 12, 31);
        EnumC8042a0 a0Var = EnumC8042a0.UNIX;
        EnumC8042a0 a0Var2 = EnumC8042a0.MODIFIED_JULIAN_DATE;
        long h = a0Var.m20754h(j, a0Var2) * 86400;
        f23931m = h;
        long h2 = (a0Var.m20754h(j2, a0Var2) * 86400) + 86399;
        f23932n = h2;
        EnumC11413f fVar = EnumC11413f.POSIX;
        C10779a0 a0Var3 = new C10779a0(h, 0, fVar);
        f23933o = a0Var3;
        C10779a0 a0Var4 = new C10779a0(h2, 999999999, fVar);
        f23934p = a0Var4;
        f23935q = new C10779a0(63158400L, 0, fVar);
        HashSet hashSet = new HashSet();
        hashSet.add(C10906g0.f38913F);
        hashSet.add(C10906g0.f38912E);
        hashSet.add(C10906g0.f38911D);
        hashSet.add(C10906g0.f38910C);
        hashSet.add(C10906g0.f38909B);
        hashSet.add(C10906g0.f38908A);
        hashSet.add(C10906g0.f38914G);
        hashSet.add(C10906g0.f38915H);
        f23936r = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        hashMap.put(C10906g0.f38916I, 1);
        hashMap.put(C10906g0.f38917J, 1);
        AbstractC10966k0<Integer, C10906g0> k0Var = C10906g0.f38918K;
        Integer valueOf = Integer.valueOf((int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        hashMap.put(k0Var, valueOf);
        hashMap.put(C10906g0.f38921N, valueOf);
        hashMap.put(C10906g0.f38919L, 1000000);
        hashMap.put(C10906g0.f38922O, 1000000);
        hashMap.put(C10906g0.f38920M, 1000000000);
        hashMap.put(C10906g0.f38923P, 1000000000);
        f23937s = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(TimeUnit.class);
        enumMap.put((EnumMap) TimeUnit.DAYS, (TimeUnit) Double.valueOf(86400.0d));
        enumMap.put((EnumMap) TimeUnit.HOURS, (TimeUnit) Double.valueOf(3600.0d));
        enumMap.put((EnumMap) TimeUnit.MINUTES, (TimeUnit) Double.valueOf(60.0d));
        enumMap.put((EnumMap) TimeUnit.SECONDS, (TimeUnit) Double.valueOf(1.0d));
        enumMap.put((EnumMap) TimeUnit.MILLISECONDS, (TimeUnit) Double.valueOf(0.001d));
        enumMap.put((EnumMap) TimeUnit.MICROSECONDS, (TimeUnit) Double.valueOf(1.0E-6d));
        enumMap.put((EnumMap) TimeUnit.NANOSECONDS, (TimeUnit) Double.valueOf(1.0E-9d));
        f23938t = Collections.unmodifiableMap(enumMap);
        C8059h0.C8061b k = C8059h0.C8061b.m20698k(TimeUnit.class, C10779a0.class, new C10784e(null), a0Var3, a0Var4);
        for (TimeUnit timeUnit : TimeUnit.values()) {
            C10787h hVar = new C10787h(timeUnit);
            Map<TimeUnit, Double> map = f23938t;
            k.m20702g(timeUnit, hVar, map.get(timeUnit).doubleValue(), map.keySet());
        }
        EnumC10783d dVar = EnumC10783d.POSIX_TIME;
        k.m20704e(dVar, dVar, TimeUnit.SECONDS);
        EnumC10782c cVar = EnumC10782c.FRACTION;
        k.m20704e(cVar, cVar, TimeUnit.NANOSECONDS);
        AbstractC8079p<TimeUnit> pVar = C10958i0.f24318o;
        k.m20705d(pVar, new C10786g(null));
        f23939u = k.m20697l(new C10781b(null)).m20701h();
        f23940v = new C10779a0(0L, 0, EnumC11413f.POSIX);
        f23941w = dVar;
        f23942x = cVar;
        f23943y = pVar;
        f23944z = new C10785f(null);
    }

    /* synthetic */ C10779a0(int i, long j, C10780a aVar) {
        this(i, j);
    }

    /* renamed from: W */
    public static C8059h0<TimeUnit, C10779a0> m12326W() {
        return f23939u;
    }

    /* renamed from: X */
    static void m12325X(C10779a0 a0Var) {
        if (a0Var.f23945k < 63072000) {
            throw new UnsupportedOperationException("Cannot calculate SI-duration before 1972-01-01.");
        }
    }

    /* renamed from: Y */
    private static void m12324Y(int i) {
        if (i >= 1000000000 || i < 0) {
            throw new IllegalArgumentException("Nanosecond out of range: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static void m12323Z(long j, C10917h0 h0Var) {
        C11410d A = C11410d.m10131A();
        if (A.m10124J() && A.m10125I(A.m10120s(j)) > j) {
            throw new C8081r("Illegal local timestamp due to negative leap second: " + h0Var);
        }
    }

    /* renamed from: a0 */
    private static void m12322a0(long j) {
        if (j > f23932n || j < f23931m) {
            throw new IllegalArgumentException("UNIX time (UT) out of supported range: " + j);
        }
    }

    /* renamed from: c0 */
    private static void m12320c0(int i, int i2, StringBuilder sb2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2 - 1; i4++) {
            i3 *= 10;
        }
        while (i < i3 && i3 >= 10) {
            sb2.append('0');
            i3 /= 10;
        }
        sb2.append(String.valueOf(i));
    }

    /* renamed from: d0 */
    public static C10779a0 m12319d0(AbstractC10817f fVar) {
        if (fVar instanceof C10779a0) {
            return (C10779a0) C10779a0.class.cast(fVar);
        }
        if (!(fVar instanceof AbstractC11414g) || !C11410d.m10131A().m10127G()) {
            return m12308o0(fVar.mo11325h(), fVar.mo11327a(), EnumC11413f.POSIX);
        }
        AbstractC11414g gVar = (AbstractC11414g) AbstractC11414g.class.cast(fVar);
        EnumC11413f fVar2 = EnumC11413f.UTC;
        return m12308o0(gVar.mo10105i(fVar2), gVar.mo10106d(fVar2), fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public C10892f0 m12317f0() {
        return C10892f0.m11869Q0(C10813c.m12201b(this.f23945k, 86400), EnumC8042a0.UNIX);
    }

    /* renamed from: g0 */
    private long m12316g0() {
        if (!C11410d.m10131A().m10127G()) {
            return this.f23945k - 63072000;
        }
        long s = C11410d.m10131A().m10120s(this.f23945k);
        if (m12309n0()) {
            return s + 1;
        }
        return s;
    }

    /* renamed from: h0 */
    private double m12315h0() {
        double g0 = ((m12316g0() + 42.184d) + (mo11327a() / 1.0E9d)) - EnumC11413f.m10107c(m12317f0());
        long floor = (long) Math.floor(g0);
        if (Double.compare(1.0E9d - ((g0 - floor) * 1.0E9d), 1.0d) < 0) {
            return floor + 1;
        }
        return g0;
    }

    /* renamed from: i0 */
    private static int m12314i0(C10779a0 a0Var) {
        return C10813c.m12199d(a0Var.f23945k, 86400);
    }

    /* renamed from: j0 */
    private C10917h0 m12313j0(AbstractC11002l lVar) {
        return C10917h0.m11658X(this, lVar.mo11322B(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public boolean m12309n0() {
        return (this.f23946l >>> 30) != 0;
    }

    /* renamed from: o0 */
    public static C10779a0 m12308o0(long j, int i, EnumC11413f fVar) {
        if (j == 0 && i == 0 && fVar == EnumC11413f.POSIX) {
            return f23940v;
        }
        return new C10779a0(j, i, fVar);
    }

    /* renamed from: p0 */
    public static C10779a0 m12307p0(long j, EnumC11413f fVar) {
        return m12308o0(j, 0, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public static C10779a0 m12305r0(DataInput dataInput, boolean z, boolean z2) {
        int i;
        String str;
        long readLong = dataInput.readLong();
        if (z2) {
            i = dataInput.readInt();
        } else {
            i = 0;
        }
        if (readLong == 0) {
            if (z) {
                throw new InvalidObjectException("UTC epoch is no leap second.");
            } else if (i == 0) {
                return f23940v;
            }
        }
        if (readLong == f23931m && i == 0) {
            if (!z) {
                return f23933o;
            }
            throw new InvalidObjectException("Minimum is no leap second.");
        } else if (readLong != f23932n || i != 999999999) {
            m12324Y(i);
            if (z) {
                C11410d A = C11410d.m10131A();
                if (!A.m10127G() || A.m10126H(A.m10120s(readLong) + 1)) {
                    i |= 1073741824;
                } else {
                    long l = C10812b.m12204l(readLong);
                    int h = C10812b.m12208h(l);
                    int g = C10812b.m12209g(l);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Not registered as leap second event: ");
                    sb2.append(C10812b.m12207i(l));
                    sb2.append("-");
                    String str2 = "0";
                    if (h < 10) {
                        str = str2;
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(h);
                    if (g >= 10) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    sb2.append(g);
                    sb2.append(" [Please check leap second configurations ");
                    sb2.append("either of emitter vm or this target vm]");
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            return new C10779a0(i, readLong);
        } else if (!z) {
            return f23934p;
        } else {
            throw new InvalidObjectException("Maximum is no leap second.");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: u0 */
    private static int m12302u0(double d, long j) {
        try {
            return (int) ((d * 1.0E9d) - C10813c.m12194i(j, 1000000000L));
        } catch (ArithmeticException unused) {
            return (int) ((d - j) * 1.0E9d);
        }
    }

    /* renamed from: v0 */
    private String m12301v0(boolean z) {
        C10892f0 f0 = m12317f0();
        int i0 = m12314i0(this);
        int i = i0 / 60;
        int i2 = i / 60;
        int i3 = i % 60;
        int E = (i0 % 60) + C11410d.m10131A().m10129E(m12316g0());
        int a = mo11327a();
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(f0);
        sb2.append('T');
        m12320c0(i2, 2, sb2);
        if (z || (i3 | E | a) != 0) {
            sb2.append(':');
            m12320c0(i3, 2, sb2);
            if (z || (E | a) != 0) {
                sb2.append(':');
                m12320c0(E, 2, sb2);
                if (a > 0) {
                    sb2.append(',');
                    m12320c0(a, 9, sb2);
                }
            }
        }
        sb2.append('Z');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new SPX(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public C10779a0 m12299x0(EnumC11413f fVar) {
        if (fVar == EnumC11413f.UTC) {
            return this;
        }
        if (!m12310m0()) {
            int i = C10780a.f23947a[fVar.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 3) {
                return new C10779a0(C10813c.m12190m(this.f23945k, -378691200L), mo11327a(), fVar);
            }
            if (i == 4) {
                return new C10779a0(C10813c.m12190m(this.f23945k, 315964800L), mo11327a(), fVar);
            }
            if (i == 5 || i == 6) {
                return new C10779a0(C10813c.m12190m(this.f23945k, 63072000L), mo11327a(), fVar);
            }
            throw new UnsupportedOperationException(fVar.name());
        }
        throw new IllegalArgumentException("Leap seconds do not exist on continuous time scale: " + fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public C10779a0 m12298y0(EnumC11413f fVar) {
        switch (C10780a.f23947a[fVar.ordinal()]) {
            case 1:
                if (m12310m0()) {
                    return new C10779a0(mo11327a(), this.f23945k);
                }
                return this;
            case 2:
                return this;
            case 3:
                return new C10779a0(mo10106d(fVar), C10813c.m12197f(mo10105i(fVar), -378691200L));
            case 4:
                return new C10779a0(mo11327a(), C10813c.m12197f(mo10105i(EnumC11413f.GPS), 315964800L));
            case 5:
            case 6:
                return new C10779a0(mo10106d(fVar), C10813c.m12197f(mo10105i(fVar), 63072000L));
            default:
                throw new UnsupportedOperationException(fVar.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8069k0
    /* renamed from: G */
    public C8059h0<TimeUnit, C10779a0> mo11639t() {
        return f23939u;
    }

    @Override // net.time4j.base.AbstractC10817f
    /* renamed from: a */
    public int mo11327a() {
        return this.f23946l & (-1073741825);
    }

    /* renamed from: b0 */
    public int compareTo(C10779a0 a0Var) {
        int a;
        int i = (m12316g0() > a0Var.m12316g0() ? 1 : (m12316g0() == a0Var.m12316g0() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i <= 0 && (a = mo11327a() - a0Var.mo11327a()) <= 0) {
            if (a < 0) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    @Override // p271oj.AbstractC11414g
    /* renamed from: d */
    public int mo10106d(EnumC11413f fVar) {
        long j;
        int i;
        int i2;
        switch (C10780a.f23947a[fVar.ordinal()]) {
            case 1:
            case 2:
                return mo11327a();
            case 3:
                if (m12316g0() < 0) {
                    double a = (mo11327a() / 1.0E9d) + EnumC11413f.m10107c(m12317f0()) + (this.f23945k - 63072000);
                    long floor = (long) Math.floor(a);
                    if (Double.compare(1.0E9d - ((a - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                        i2 = 0;
                    } else {
                        i2 = m12302u0(a, floor);
                    }
                    j = (floor - 32) + 441763200;
                    i = i2 - 184000000;
                    if (i < 0) {
                        j--;
                        i += 1000000000;
                    }
                } else {
                    j = m12316g0() + 441763200;
                    i = mo11327a();
                }
                if (j >= 0) {
                    return i;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                if (C11410d.m10131A().m10125I(m12316g0()) >= 315964800) {
                    return mo11327a();
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f23945k < 63072000) {
                    double c = EnumC11413f.m10107c(m12317f0()) + (this.f23945k - 63072000) + (mo11327a() / 1.0E9d);
                    long floor2 = (long) Math.floor(c);
                    if (Double.compare(1.0E9d - ((c - floor2) * 1.0E9d), 1.0d) < 0) {
                        return 0;
                    }
                    return m12302u0(c, floor2);
                }
                int a2 = mo11327a() + 184000000;
                if (a2 >= 1000000000) {
                    return a2 - 1000000000;
                }
                return a2;
            case 6:
                if (this.f23945k < 63072000) {
                    return mo11327a();
                }
                double h0 = m12315h0();
                return m12302u0(h0, (long) Math.floor(h0));
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e0 */
    public C10779a0 mo11638u() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10779a0)) {
            return false;
        }
        C10779a0 a0Var = (C10779a0) obj;
        if (this.f23945k != a0Var.f23945k) {
            return false;
        }
        if (C11410d.m10131A().m10127G()) {
            if (this.f23946l == a0Var.f23946l) {
                return true;
            }
            return false;
        } else if (mo11327a() == a0Var.mo11327a()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // net.time4j.base.AbstractC10817f
    /* renamed from: h */
    public long mo11325h() {
        return this.f23945k;
    }

    public int hashCode() {
        long j = this.f23945k;
        return (((int) (j ^ (j >>> 32))) * 19) + (mo11327a() * 37);
    }

    @Override // p271oj.AbstractC11414g
    /* renamed from: i */
    public long mo10105i(EnumC11413f fVar) {
        long j;
        int i;
        switch (C10780a.f23947a[fVar.ordinal()]) {
            case 1:
                return this.f23945k;
            case 2:
                return m12316g0();
            case 3:
                if (m12316g0() < 0) {
                    double a = (mo11327a() / 1.0E9d) + EnumC11413f.m10107c(m12317f0()) + (this.f23945k - 63072000);
                    long floor = (long) Math.floor(a);
                    if (Double.compare(1.0E9d - ((a - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                        i = 0;
                    } else {
                        i = m12302u0(a, floor);
                    }
                    j = (floor - 32) + 441763200;
                    if (i - 184000000 < 0) {
                        j--;
                    }
                } else {
                    j = m12316g0() + 441763200 + 10;
                }
                if (j >= 0) {
                    return j;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                long g0 = m12316g0();
                if (C11410d.m10131A().m10125I(g0) >= 315964800) {
                    if (!C11410d.m10131A().m10127G()) {
                        g0 += 9;
                    }
                    return g0 - 252892809;
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f23945k < 63072000) {
                    double c = EnumC11413f.m10107c(m12317f0()) + (this.f23945k - 63072000) + (mo11327a() / 1.0E9d);
                    long floor2 = (long) Math.floor(c);
                    if (Double.compare(1.0E9d - ((c - floor2) * 1.0E9d), 1.0d) < 0) {
                        return floor2 + 1;
                    }
                    return floor2;
                }
                long g02 = m12316g0() + 42;
                if (mo11327a() + 184000000 >= 1000000000) {
                    return g02 + 1;
                }
                return g02;
            case 6:
                long j2 = this.f23945k;
                if (j2 < 63072000) {
                    return j2 - 63072000;
                }
                return (long) Math.floor(m12315h0());
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + fVar);
        }
    }

    /* renamed from: k0 */
    public C10810b1 m12312k0(AbstractC11001k kVar) {
        return C10810b1.m12216j(this, AbstractC11002l.m11310N(kVar));
    }

    /* renamed from: l0 */
    public boolean m12311l0(AbstractC11414g gVar) {
        if (compareTo(m12319d0(gVar)) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    public boolean m12310m0() {
        return m12309n0() && C11410d.m10131A().m10127G();
    }

    /* renamed from: q0 */
    public C10779a0 m12306q0(long j, EnumC10974n0 n0Var) {
        C10779a0 a0Var;
        m12325X(this);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return this;
        }
        try {
            int i2 = C10780a.f23948b[n0Var.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    long f = C10813c.m12197f(mo11327a(), j);
                    int d = C10813c.m12199d(f, 1000000000);
                    long b = C10813c.m12201b(f, 1000000000);
                    if (C11410d.m10131A().m10127G()) {
                        a0Var = new C10779a0(C10813c.m12197f(m12316g0(), b), d, EnumC11413f.UTC);
                    } else {
                        a0Var = m12308o0(C10813c.m12197f(this.f23945k, b), d, EnumC11413f.POSIX);
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            } else if (C11410d.m10131A().m10127G()) {
                a0Var = new C10779a0(C10813c.m12197f(m12316g0(), j), mo11327a(), EnumC11413f.UTC);
            } else {
                a0Var = m12308o0(C10813c.m12197f(this.f23945k, j), mo11327a(), EnumC11413f.POSIX);
            }
            if (i < 0) {
                m12325X(a0Var);
            }
            return a0Var;
        } catch (IllegalArgumentException e) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e);
            throw arithmeticException;
        }
    }

    /* renamed from: s0 */
    public <C extends AbstractC8070l<C>> C10983r<C> m12304s0(C8066j<C> jVar, String str, AbstractC11001k kVar, AbstractC8053f0 f0Var) {
        C10917h0 w0 = m12300w0(kVar);
        return C10983r.m11379c(w0.m20684J(f0Var.mo20737b(w0.m11657Y(), kVar), EnumC10899g.f24191m).m11657Y().m20667V(jVar.m20648q(), str), w0.m11654a0());
    }

    /* renamed from: t0 */
    public <C extends AbstractC8073m<?, C>> C10983r<C> m12303t0(C8087x<C> xVar, AbstractC11001k kVar, AbstractC8053f0 f0Var) {
        C10917h0 w0 = m12300w0(kVar);
        return C10983r.m11378d(w0.m20684J(f0Var.mo20737b(w0.m11657Y(), kVar), EnumC10899g.f24191m).m11657Y().m20666W(xVar.m20648q()), w0.m11654a0());
    }

    public String toString() {
        return m12301v0(true);
    }

    /* renamed from: w0 */
    public C10917h0 m12300w0(AbstractC11001k kVar) {
        return m12313j0(AbstractC11002l.m11310N(kVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void m12297z0(DataOutput dataOutput) {
        int i;
        if (m12309n0()) {
            i = 65;
        } else {
            i = 64;
        }
        int a = mo11327a();
        if (a > 0) {
            i |= 2;
        }
        dataOutput.writeByte(i);
        dataOutput.writeLong(this.f23945k);
        if (a > 0) {
            dataOutput.writeInt(a);
        }
    }

    private C10779a0(long j, int i, EnumC11413f fVar) {
        long j2;
        long s;
        long j3 = j;
        int i2 = i;
        if (fVar == EnumC11413f.POSIX) {
            this.f23945k = j3;
            this.f23946l = i2;
        } else {
            C11410d A = C11410d.m10131A();
            if (A.m10127G()) {
                if (fVar != EnumC11413f.UTC) {
                    if (fVar == EnumC11413f.TAI) {
                        if (j3 < 0) {
                            throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + j3);
                        } else if (j3 < 441763200) {
                            long f = C10813c.m12197f(j3, -441763168L);
                            int e = C10813c.m12198e(i2, 184000000);
                            if (e >= 1000000000) {
                                f = C10813c.m12197f(f, 1L);
                                e = C10813c.m12191l(e, 1000000000);
                            }
                            double d = f + (e / 1.0E9d);
                            double c = d - EnumC11413f.m10107c(C10892f0.m11869Q0(C10813c.m12201b((long) (d - 42.184d), 86400), EnumC8042a0.UTC));
                            j2 = (long) Math.floor(c);
                            i2 = m12302u0(c, j2);
                        } else {
                            i2 = i2;
                            j2 = C10813c.m12190m(j3, 441763210L);
                        }
                    } else if (fVar == EnumC11413f.GPS) {
                        long f2 = C10813c.m12197f(j3, 252892809L);
                        if (f2 >= 252892809) {
                            i2 = i2;
                            j2 = f2;
                        } else {
                            throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + j3);
                        }
                    } else if (fVar == EnumC11413f.TT) {
                        int i3 = (j3 > 42L ? 1 : (j3 == 42L ? 0 : -1));
                        if (i3 < 0 || (i3 == 0 && i2 < 184000000)) {
                            double d2 = j3 + (i2 / 1.0E9d);
                            double c2 = d2 - EnumC11413f.m10107c(C10892f0.m11869Q0(C10813c.m12201b((long) (d2 - 42.184d), 86400), EnumC8042a0.UTC));
                            j2 = (long) Math.floor(c2);
                            i2 = m12302u0(c2, j2);
                        } else {
                            j3 = C10813c.m12190m(j3, 42L);
                            i2 = C10813c.m12191l(i2, 184000000);
                            if (i2 < 0) {
                                j3 = C10813c.m12190m(j3, 1L);
                                i2 = C10813c.m12198e(i2, 1000000000);
                            }
                        }
                    } else if (fVar != EnumC11413f.UT) {
                        throw new UnsupportedOperationException("Not yet implemented: " + fVar.name());
                    } else if (j3 >= 0) {
                        double c3 = ((j3 + (i2 / 1.0E9d)) + EnumC11413f.m10107c(C10892f0.m11869Q0(C10813c.m12201b(j3, 86400), EnumC8042a0.UTC))) - 42.184d;
                        j2 = (long) Math.floor(c3);
                        i2 = m12302u0(c3, j2);
                    }
                    long I = A.m10125I(j2);
                    s = j2 - A.m10120s(I);
                    this.f23945k = I;
                    if (s != 0 || I == f23932n) {
                        this.f23946l = i2;
                    } else if (s == 1) {
                        this.f23946l = 1073741824 | i2;
                    } else {
                        throw new IllegalStateException("Cannot handle leap shift of " + j3 + ".");
                    }
                    i2 = i2;
                }
                j2 = j3;
                long I2 = A.m10125I(j2);
                s = j2 - A.m10120s(I2);
                this.f23945k = I2;
                if (s != 0) {
                }
                this.f23946l = i2;
                i2 = i2;
            } else {
                throw new IllegalStateException("Leap seconds are not supported by configuration.");
            }
        }
        m12322a0(this.f23945k);
        m12324Y(i2);
    }

    private C10779a0(int i, long j) {
        m12322a0(j);
        this.f23945k = j;
        this.f23946l = i;
    }
}
