package p163j$.time.temporal;

import p163j$.time.C9203g;
import p163j$.time.EnumC9168c;
import p163j$.time.chrono.AbstractC9169a;
import p163j$.time.chrono.AbstractC9175g;
import p163j$.time.chrono.C9176h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: j$.time.temporal.g */
/* loaded from: classes2.dex */
abstract class EnumC9219g extends Enum implements AbstractC9224l {
    public static final EnumC9219g DAY_OF_QUARTER;
    public static final EnumC9219g QUARTER_OF_YEAR;
    public static final EnumC9219g WEEK_BASED_YEAR;
    public static final EnumC9219g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a */
    private static final int[] f20229a = {0, 90, 181, 273, 0, 91, 182, 274};

    /* renamed from: b */
    private static final /* synthetic */ EnumC9219g[] f20230b;

    static {
        EnumC9219g cVar = new EnumC9219g() { // from class: j$.time.temporal.c
            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: a */
            public final boolean mo16630a(AbstractC9223k kVar) {
                return kVar.mo16634b(EnumC9213a.DAY_OF_YEAR) && kVar.mo16634b(EnumC9213a.MONTH_OF_YEAR) && kVar.mo16634b(EnumC9213a.YEAR) && EnumC9219g.m16652g(kVar);
            }

            @Override // p163j$.time.temporal.EnumC9219g, p163j$.time.temporal.AbstractC9224l
            /* renamed from: b */
            public final C9229q mo16629b(AbstractC9223k kVar) {
                if (mo16630a(kVar)) {
                    long c = kVar.mo16633c(EnumC9219g.QUARTER_OF_YEAR);
                    if (c != 1) {
                        return c == 2 ? C9229q.m16615i(1L, 91L) : (c == 3 || c == 4) ? C9229q.m16615i(1L, 92L) : mo16627d();
                    }
                    long c2 = kVar.mo16633c(EnumC9213a.YEAR);
                    C9176h.f20141a.getClass();
                    return C9176h.m16727a(c2) ? C9229q.m16615i(1L, 91L) : C9229q.m16615i(1L, 90L);
                }
                throw new C9228p("Unsupported field: DayOfQuarter");
            }

            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: d */
            public final C9229q mo16627d() {
                return C9229q.m16614j(90L, 92L);
            }

            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: f */
            public final long mo16625f(AbstractC9223k kVar) {
                int[] iArr;
                if (mo16630a(kVar)) {
                    int e = kVar.mo16631e(EnumC9213a.DAY_OF_YEAR);
                    int e2 = kVar.mo16631e(EnumC9213a.MONTH_OF_YEAR);
                    long c = kVar.mo16633c(EnumC9213a.YEAR);
                    iArr = EnumC9219g.f20229a;
                    int i = (e2 - 1) / 3;
                    C9176h.f20141a.getClass();
                    return e - iArr[i + (C9176h.m16727a(c) ? 4 : 0)];
                }
                throw new C9228p("Unsupported field: DayOfQuarter");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = cVar;
        EnumC9219g dVar = new EnumC9219g() { // from class: j$.time.temporal.d
            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: a */
            public final boolean mo16630a(AbstractC9223k kVar) {
                return kVar.mo16634b(EnumC9213a.MONTH_OF_YEAR) && EnumC9219g.m16652g(kVar);
            }

            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: d */
            public final C9229q mo16627d() {
                return C9229q.m16615i(1L, 4L);
            }

            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: f */
            public final long mo16625f(AbstractC9223k kVar) {
                if (mo16630a(kVar)) {
                    return (kVar.mo16633c(EnumC9213a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new C9228p("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = dVar;
        EnumC9219g eVar = new EnumC9219g() { // from class: j$.time.temporal.e
            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: a */
            public final boolean mo16630a(AbstractC9223k kVar) {
                return kVar.mo16634b(EnumC9213a.EPOCH_DAY) && EnumC9219g.m16652g(kVar);
            }

            @Override // p163j$.time.temporal.EnumC9219g, p163j$.time.temporal.AbstractC9224l
            /* renamed from: b */
            public final C9229q mo16629b(AbstractC9223k kVar) {
                C9229q m;
                if (mo16630a(kVar)) {
                    m = EnumC9219g.m16646m(C9203g.m16682h(kVar));
                    return m;
                }
                throw new C9228p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: d */
            public final C9229q mo16627d() {
                return C9229q.m16614j(52L, 53L);
            }

            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: f */
            public final long mo16625f(AbstractC9223k kVar) {
                if (mo16630a(kVar)) {
                    return EnumC9219g.m16649j(C9203g.m16682h(kVar));
                }
                throw new C9228p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = eVar;
        EnumC9219g fVar = new EnumC9219g() { // from class: j$.time.temporal.f
            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: a */
            public final boolean mo16630a(AbstractC9223k kVar) {
                return kVar.mo16634b(EnumC9213a.EPOCH_DAY) && EnumC9219g.m16652g(kVar);
            }

            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: d */
            public final C9229q mo16627d() {
                return EnumC9213a.YEAR.mo16627d();
            }

            @Override // p163j$.time.temporal.AbstractC9224l
            /* renamed from: f */
            public final long mo16625f(AbstractC9223k kVar) {
                int l;
                if (mo16630a(kVar)) {
                    l = EnumC9219g.m16647l(C9203g.m16682h(kVar));
                    return l;
                }
                throw new C9228p("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar;
        f20230b = new EnumC9219g[]{cVar, dVar, eVar, fVar};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EnumC9219g(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m16652g(AbstractC9223k kVar) {
        if (kVar != null) {
            Object obj = (AbstractC9175g) kVar.mo16632d(AbstractC9222j.f20237b);
            if (obj == null) {
                obj = C9176h.f20141a;
            }
            return ((AbstractC9169a) obj).equals(C9176h.f20141a);
        }
        throw new NullPointerException("temporal");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.m16677m())) == false) goto L_0x004d;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m16649j(p163j$.time.C9203g r5) {
        /*
            j$.time.c r0 = r5.m16680j()
            int r0 = r0.ordinal()
            int r1 = r5.m16679k()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L_0x001c
            int r0 = r0 + 7
        L_0x001c:
            if (r1 >= r0) goto L_0x0032
            j$.time.g r5 = r5.m16672r()
            r0 = -1
            j$.time.g r5 = r5.m16674p(r0)
            j$.time.temporal.q r5 = m16646m(r5)
            long r0 = r5.m16620d()
            int r5 = (int) r0
            goto L_0x004e
        L_0x0032:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L_0x004c
            if (r0 == r3) goto L_0x0048
            r3 = -2
            if (r0 != r3) goto L_0x0046
            boolean r5 = r5.m16677m()
            if (r5 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r5 = 0
            goto L_0x0049
        L_0x0048:
            r5 = r2
        L_0x0049:
            if (r5 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r2 = r1
        L_0x004d:
            r5 = r2
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.time.temporal.EnumC9219g.m16649j(j$.time.g):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m16647l(C9203g gVar) {
        int l = gVar.m16678l();
        int k = gVar.m16679k();
        if (k <= 3) {
            return k - gVar.m16680j().ordinal() < -2 ? l - 1 : l;
        }
        if (k < 363) {
            return l;
        }
        return ((k - 363) - (gVar.m16677m() ? 1 : 0)) - gVar.m16680j().ordinal() >= 0 ? l + 1 : l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static C9229q m16646m(C9203g gVar) {
        C9203g n = C9203g.m16676n(m16647l(gVar), 1, 1);
        return C9229q.m16615i(1L, (n.m16680j() == EnumC9168c.THURSDAY || (n.m16680j() == EnumC9168c.WEDNESDAY && n.m16677m())) ? 53 : 52);
    }

    public static EnumC9219g valueOf(String str) {
        return (EnumC9219g) Enum.valueOf(EnumC9219g.class, str);
    }

    public static EnumC9219g[] values() {
        return (EnumC9219g[]) f20230b.clone();
    }

    /* renamed from: b */
    public C9229q mo16629b(AbstractC9223k kVar) {
        return mo16627d();
    }

    @Override // p163j$.time.temporal.AbstractC9224l
    /* renamed from: c */
    public final boolean mo16628c() {
        return true;
    }

    @Override // p163j$.time.temporal.AbstractC9224l
    /* renamed from: e */
    public final boolean mo16626e() {
        return false;
    }
}
