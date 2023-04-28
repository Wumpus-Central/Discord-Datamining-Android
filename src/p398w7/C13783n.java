package p398w7;

import android.util.Pair;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7566w;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.n */
/* loaded from: classes7.dex */
public final class C13783n implements AbstractC13782m {

    /* renamed from: q */
    private static final double[] f30883q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f30884a;

    /* renamed from: b */
    private AbstractC10500b0 f30885b;

    /* renamed from: c */
    private final C13780k0 f30886c;

    /* renamed from: d */
    private final C7570y f30887d;

    /* renamed from: e */
    private final C13797u f30888e;

    /* renamed from: f */
    private final boolean[] f30889f;

    /* renamed from: g */
    private final C13784a f30890g;

    /* renamed from: h */
    private long f30891h;

    /* renamed from: i */
    private boolean f30892i;

    /* renamed from: j */
    private boolean f30893j;

    /* renamed from: k */
    private long f30894k;

    /* renamed from: l */
    private long f30895l;

    /* renamed from: m */
    private long f30896m;

    /* renamed from: n */
    private long f30897n;

    /* renamed from: o */
    private boolean f30898o;

    /* renamed from: p */
    private boolean f30899p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7.n$a */
    /* loaded from: classes7.dex */
    public static final class C13784a {

        /* renamed from: e */
        private static final byte[] f30900e = {0, 0, 1};

        /* renamed from: a */
        private boolean f30901a;

        /* renamed from: b */
        public int f30902b;

        /* renamed from: c */
        public int f30903c;

        /* renamed from: d */
        public byte[] f30904d;

        public C13784a(int i) {
            this.f30904d = new byte[i];
        }

        /* renamed from: a */
        public void m2711a(byte[] bArr, int i, int i2) {
            if (this.f30901a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f30904d;
                int length = bArr2.length;
                int i4 = this.f30902b;
                if (length < i4 + i3) {
                    this.f30904d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f30904d, this.f30902b, i3);
                this.f30902b += i3;
            }
        }

        /* renamed from: b */
        public boolean m2710b(int i, int i2) {
            if (this.f30901a) {
                int i3 = this.f30902b - i2;
                this.f30902b = i3;
                if (this.f30903c == 0 && i == 181) {
                    this.f30903c = i3;
                } else {
                    this.f30901a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f30901a = true;
            }
            byte[] bArr = f30900e;
            m2711a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m2709c() {
            this.f30901a = false;
            this.f30902b = 0;
            this.f30903c = 0;
        }
    }

    public C13783n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<p079e7.C6722k, java.lang.Long> m2712a(p398w7.C13783n.C13784a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f30904d
            int r1 = r8.f30902b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            byte r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003d
            r7 = 3
            if (r6 == r7) goto L_0x0037
            if (r6 == r1) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0031:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0042
        L_0x0037:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0042
        L_0x003d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0042:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0044:
            e7.k$b r6 = new e7.k$b
            r6.<init>()
            e7.k$b r9 = r6.m24505S(r9)
            java.lang.String r6 = "video/mpeg2"
            e7.k$b r9 = r9.m24488e0(r6)
            e7.k$b r9 = r9.m24478j0(r2)
            e7.k$b r9 = r9.m24507Q(r4)
            e7.k$b r9 = r9.m24496a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            e7.k$b r9 = r9.m24504T(r1)
            e7.k r9 = r9.m24519E()
            byte r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L_0x0098
            double[] r2 = p398w7.C13783n.f30883q
            int r4 = r2.length
            if (r1 >= r4) goto L_0x0098
            r1 = r2[r1]
            int r8 = r8.f30903c
            int r8 = r8 + 9
            byte r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L_0x0090
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0090:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L_0x009a
        L_0x0098:
            r0 = 0
        L_0x009a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p398w7.C13783n.m2712a(w7.n$a, java.lang.String):android.util.Pair");
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        int i;
        int i2;
        C7510a.m22364h(this.f30885b);
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        byte[] d = yVar.m22012d();
        this.f30891h += yVar.m22015a();
        this.f30885b.mo12386f(yVar, yVar.m22015a());
        while (true) {
            int c = C7566w.m22060c(d, e, f, this.f30889f);
            if (c == f) {
                break;
            }
            int i3 = c + 3;
            int i4 = yVar.m22012d()[i3] & 255;
            int i5 = c - e;
            boolean z = false;
            if (!this.f30893j) {
                if (i5 > 0) {
                    this.f30890g.m2711a(d, e, c);
                }
                if (i5 < 0) {
                    i2 = -i5;
                } else {
                    i2 = 0;
                }
                if (this.f30890g.m2710b(i4, i2)) {
                    Pair<C6722k, Long> a = m2712a(this.f30890g, (String) C7510a.m22367e(this.f30884a));
                    this.f30885b.mo12388d((C6722k) a.first);
                    this.f30894k = ((Long) a.second).longValue();
                    this.f30893j = true;
                }
            }
            C13797u uVar = this.f30888e;
            if (uVar != null) {
                if (i5 > 0) {
                    uVar.m2652a(d, e, c);
                    i = 0;
                } else {
                    i = -i5;
                }
                if (this.f30888e.m2651b(i)) {
                    C13797u uVar2 = this.f30888e;
                    ((C7570y) C7557q0.m22145j(this.f30887d)).m22019N(this.f30888e.f31049d, C7566w.m22052k(uVar2.f31049d, uVar2.f31050e));
                    ((C13780k0) C7557q0.m22145j(this.f30886c)).m2715a(this.f30897n, this.f30887d);
                }
                if (i4 == 178 && yVar.m22012d()[c + 2] == 1) {
                    this.f30888e.m2648e(i4);
                }
            }
            if (i4 == 0 || i4 == 179) {
                int i6 = f - c;
                if (this.f30892i && this.f30899p && this.f30893j) {
                    this.f30885b.mo12382c(this.f30897n, this.f30898o ? 1 : 0, ((int) (this.f30891h - this.f30896m)) - i6, i6, null);
                }
                boolean z2 = this.f30892i;
                if (!z2 || this.f30899p) {
                    this.f30896m = this.f30891h - i6;
                    long j = this.f30895l;
                    if (j == -9223372036854775807L) {
                        if (z2) {
                            j = this.f30897n + this.f30894k;
                        } else {
                            j = 0;
                        }
                    }
                    this.f30897n = j;
                    this.f30898o = false;
                    this.f30895l = -9223372036854775807L;
                    this.f30892i = true;
                }
                if (i4 == 0) {
                    z = true;
                }
                this.f30899p = z;
            } else if (i4 == 184) {
                this.f30898o = true;
            }
            e = i3;
        }
        if (!this.f30893j) {
            this.f30890g.m2711a(d, e, f);
        }
        C13797u uVar3 = this.f30888e;
        if (uVar3 != null) {
            uVar3.m2652a(d, e, f);
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        C7566w.m22062a(this.f30889f);
        this.f30890g.m2709c();
        C13797u uVar = this.f30888e;
        if (uVar != null) {
            uVar.m2649d();
        }
        this.f30891h = 0L;
        this.f30892i = false;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f30884a = dVar.m2730b();
        this.f30885b = kVar.mo7937e(dVar.m2729c(), 2);
        C13780k0 k0Var = this.f30886c;
        if (k0Var != null) {
            k0Var.m2714b(kVar, dVar);
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        this.f30895l = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13783n(C13780k0 k0Var) {
        this.f30886c = k0Var;
        this.f30889f = new boolean[4];
        this.f30890g = new C13784a(128);
        if (k0Var != null) {
            this.f30888e = new C13797u(178, 128);
            this.f30887d = new C7570y();
            return;
        }
        this.f30888e = null;
        this.f30887d = null;
    }
}
