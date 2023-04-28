package gh;

import fi.EnumC7338w1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gh.b0 */
/* loaded from: classes8.dex */
public final class C7604b0 {

    /* renamed from: l */
    public static final C7604b0 f16565l;

    /* renamed from: m */
    public static final C7604b0 f16566m;

    /* renamed from: o */
    public static final C7604b0 f16568o;

    /* renamed from: p */
    public static final C7604b0 f16569p;

    /* renamed from: q */
    public static final C7604b0 f16570q;

    /* renamed from: r */
    public static final C7604b0 f16571r;

    /* renamed from: s */
    public static final C7604b0 f16572s;

    /* renamed from: t */
    public static final C7604b0 f16573t;

    /* renamed from: a */
    private final boolean f16574a;

    /* renamed from: b */
    private final boolean f16575b;

    /* renamed from: c */
    private final boolean f16576c;

    /* renamed from: d */
    private final boolean f16577d;

    /* renamed from: e */
    private final boolean f16578e;

    /* renamed from: f */
    private final C7604b0 f16579f;

    /* renamed from: g */
    private final boolean f16580g;

    /* renamed from: h */
    private final C7604b0 f16581h;

    /* renamed from: i */
    private final C7604b0 f16582i;

    /* renamed from: j */
    private final boolean f16583j;

    /* renamed from: k */
    public static final C7605a f16564k = new C7605a(null);

    /* renamed from: n */
    public static final C7604b0 f16567n = new C7604b0(false, true, false, false, false, null, false, null, null, false, 1021, null);

    /* renamed from: gh.b0$a */
    /* loaded from: classes8.dex */
    public static final class C7605a {
        private C7605a() {
        }

        public /* synthetic */ C7605a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: gh.b0$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7606b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16584a;

        static {
            int[] iArr = new int[EnumC7338w1.values().length];
            try {
                iArr[EnumC7338w1.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7338w1.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16584a = iArr;
        }
    }

    static {
        C7604b0 b0Var = new C7604b0(false, false, false, false, false, null, false, null, null, false, 1023, null);
        f16565l = b0Var;
        C7604b0 b0Var2 = new C7604b0(false, false, false, false, false, null, false, null, null, true, 511, null);
        f16566m = b0Var2;
        f16568o = new C7604b0(false, false, false, false, false, b0Var, false, null, null, false, 988, null);
        f16569p = new C7604b0(false, false, false, false, false, b0Var2, false, null, null, true, 476, null);
        f16570q = new C7604b0(false, true, false, false, false, b0Var, false, null, null, false, 988, null);
        f16571r = new C7604b0(false, false, false, true, false, b0Var, false, null, null, false, 983, null);
        f16572s = new C7604b0(false, false, false, true, false, b0Var, false, null, null, false, 919, null);
        f16573t = new C7604b0(false, false, true, false, false, b0Var, false, null, null, false, 984, null);
    }

    public C7604b0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C7604b0 b0Var, boolean z6, C7604b0 b0Var2, C7604b0 b0Var3, boolean z7) {
        this.f16574a = z;
        this.f16575b = z2;
        this.f16576c = z3;
        this.f16577d = z4;
        this.f16578e = z5;
        this.f16579f = b0Var;
        this.f16580g = z6;
        this.f16581h = b0Var2;
        this.f16582i = b0Var3;
        this.f16583j = z7;
    }

    /* renamed from: a */
    public final boolean m21911a() {
        return this.f16580g;
    }

    /* renamed from: b */
    public final boolean m21910b() {
        return this.f16583j;
    }

    /* renamed from: c */
    public final boolean m21909c() {
        return this.f16575b;
    }

    /* renamed from: d */
    public final boolean m21908d() {
        return this.f16574a;
    }

    /* renamed from: e */
    public final boolean m21907e() {
        return this.f16576c;
    }

    /* renamed from: f */
    public final C7604b0 m21906f(EnumC7338w1 effectiveVariance, boolean z) {
        C9971q.m14633g(effectiveVariance, "effectiveVariance");
        if (!z || !this.f16576c) {
            int i = C7606b.f16584a[effectiveVariance.ordinal()];
            if (i == 1) {
                C7604b0 b0Var = this.f16581h;
                if (b0Var != null) {
                    return b0Var;
                }
            } else if (i != 2) {
                C7604b0 b0Var2 = this.f16579f;
                if (b0Var2 != null) {
                    return b0Var2;
                }
            } else {
                C7604b0 b0Var3 = this.f16582i;
                if (b0Var3 != null) {
                    return b0Var3;
                }
            }
        }
        return this;
    }

    /* renamed from: g */
    public final C7604b0 m21905g() {
        return new C7604b0(this.f16574a, true, this.f16576c, this.f16577d, this.f16578e, this.f16579f, this.f16580g, this.f16581h, this.f16582i, false, 512, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C7604b0(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, gh.C7604b0 r17, boolean r18, gh.C7604b0 r19, gh.C7604b0 r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0018
            r4 = r5
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x001f
            r6 = r5
            goto L_0x0020
        L_0x001f:
            r6 = r15
        L_0x0020:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0026
            r7 = r5
            goto L_0x0028
        L_0x0026:
            r7 = r16
        L_0x0028:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002e
            r8 = 0
            goto L_0x0030
        L_0x002e:
            r8 = r17
        L_0x0030:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r2 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r8
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r8
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.C7604b0.<init>(boolean, boolean, boolean, boolean, boolean, gh.b0, boolean, gh.b0, gh.b0, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
