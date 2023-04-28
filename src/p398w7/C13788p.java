package p398w7;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7518d;
import p119g9.C7557q0;
import p119g9.C7566w;
import p119g9.C7570y;
import p119g9.C7571z;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.p */
/* loaded from: classes7.dex */
public final class C13788p implements AbstractC13782m {

    /* renamed from: a */
    private final C13759d0 f30931a;

    /* renamed from: b */
    private final boolean f30932b;

    /* renamed from: c */
    private final boolean f30933c;

    /* renamed from: g */
    private long f30937g;

    /* renamed from: i */
    private String f30939i;

    /* renamed from: j */
    private AbstractC10500b0 f30940j;

    /* renamed from: k */
    private C13790b f30941k;

    /* renamed from: l */
    private boolean f30942l;

    /* renamed from: m */
    private long f30943m;

    /* renamed from: n */
    private boolean f30944n;

    /* renamed from: h */
    private final boolean[] f30938h = new boolean[3];

    /* renamed from: d */
    private final C13797u f30934d = new C13797u(7, 128);

    /* renamed from: e */
    private final C13797u f30935e = new C13797u(8, 128);

    /* renamed from: f */
    private final C13797u f30936f = new C13797u(6, 128);

    /* renamed from: o */
    private final C7570y f30945o = new C7570y();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7.p$b */
    /* loaded from: classes7.dex */
    public static final class C13790b {

        /* renamed from: a */
        private final AbstractC10500b0 f30946a;

        /* renamed from: b */
        private final boolean f30947b;

        /* renamed from: c */
        private final boolean f30948c;

        /* renamed from: f */
        private final C7571z f30951f;

        /* renamed from: g */
        private byte[] f30952g;

        /* renamed from: h */
        private int f30953h;

        /* renamed from: i */
        private int f30954i;

        /* renamed from: j */
        private long f30955j;

        /* renamed from: k */
        private boolean f30956k;

        /* renamed from: l */
        private long f30957l;

        /* renamed from: o */
        private boolean f30960o;

        /* renamed from: p */
        private long f30961p;

        /* renamed from: q */
        private long f30962q;

        /* renamed from: r */
        private boolean f30963r;

        /* renamed from: d */
        private final SparseArray<C7566w.C7568b> f30949d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C7566w.C7567a> f30950e = new SparseArray<>();

        /* renamed from: m */
        private C13791a f30958m = new C13791a();

        /* renamed from: n */
        private C13791a f30959n = new C13791a();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w7.p$b$a */
        /* loaded from: classes7.dex */
        public static final class C13791a {

            /* renamed from: a */
            private boolean f30964a;

            /* renamed from: b */
            private boolean f30965b;

            /* renamed from: c */
            private C7566w.C7568b f30966c;

            /* renamed from: d */
            private int f30967d;

            /* renamed from: e */
            private int f30968e;

            /* renamed from: f */
            private int f30969f;

            /* renamed from: g */
            private int f30970g;

            /* renamed from: h */
            private boolean f30971h;

            /* renamed from: i */
            private boolean f30972i;

            /* renamed from: j */
            private boolean f30973j;

            /* renamed from: k */
            private boolean f30974k;

            /* renamed from: l */
            private int f30975l;

            /* renamed from: m */
            private int f30976m;

            /* renamed from: n */
            private int f30977n;

            /* renamed from: o */
            private int f30978o;

            /* renamed from: p */
            private int f30979p;

            private C13791a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public boolean m2686c(C13791a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f30964a) {
                    return false;
                }
                if (!aVar.f30964a) {
                    return true;
                }
                C7566w.C7568b bVar = (C7566w.C7568b) C7510a.m22364h(this.f30966c);
                C7566w.C7568b bVar2 = (C7566w.C7568b) C7510a.m22364h(aVar.f30966c);
                if (this.f30969f == aVar.f30969f && this.f30970g == aVar.f30970g && this.f30971h == aVar.f30971h && ((!this.f30972i || !aVar.f30972i || this.f30973j == aVar.f30973j) && (((i = this.f30967d) == (i2 = aVar.f30967d) || (i != 0 && i2 != 0)) && (((i3 = bVar.f16412k) != 0 || bVar2.f16412k != 0 || (this.f30976m == aVar.f30976m && this.f30977n == aVar.f30977n)) && ((i3 != 1 || bVar2.f16412k != 1 || (this.f30978o == aVar.f30978o && this.f30979p == aVar.f30979p)) && (z = this.f30974k) == aVar.f30974k && (!z || this.f30975l == aVar.f30975l)))))) {
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            public void m2687b() {
                this.f30965b = false;
                this.f30964a = false;
            }

            /* renamed from: d */
            public boolean m2685d() {
                int i;
                return this.f30965b && ((i = this.f30968e) == 7 || i == 2);
            }

            /* renamed from: e */
            public void m2684e(C7566w.C7568b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f30966c = bVar;
                this.f30967d = i;
                this.f30968e = i2;
                this.f30969f = i3;
                this.f30970g = i4;
                this.f30971h = z;
                this.f30972i = z2;
                this.f30973j = z3;
                this.f30974k = z4;
                this.f30975l = i5;
                this.f30976m = i6;
                this.f30977n = i7;
                this.f30978o = i8;
                this.f30979p = i9;
                this.f30964a = true;
                this.f30965b = true;
            }

            /* renamed from: f */
            public void m2683f(int i) {
                this.f30968e = i;
                this.f30965b = true;
            }
        }

        public C13790b(AbstractC10500b0 b0Var, boolean z, boolean z2) {
            this.f30946a = b0Var;
            this.f30947b = z;
            this.f30948c = z2;
            byte[] bArr = new byte[128];
            this.f30952g = bArr;
            this.f30951f = new C7571z(bArr, 0, 0);
            m2690g();
        }

        /* renamed from: d */
        private void m2693d(int i) {
            boolean z = this.f30963r;
            this.f30946a.mo12382c(this.f30962q, z ? 1 : 0, (int) (this.f30955j - this.f30961p), i, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m2696a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p398w7.C13788p.C13790b.m2696a(byte[], int, int):void");
        }

        /* renamed from: b */
        public boolean m2695b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f30954i == 9 || (this.f30948c && this.f30959n.m2686c(this.f30958m))) {
                if (z && this.f30960o) {
                    m2693d(i + ((int) (j - this.f30955j)));
                }
                this.f30961p = this.f30955j;
                this.f30962q = this.f30957l;
                this.f30963r = false;
                this.f30960o = true;
            }
            if (this.f30947b) {
                z2 = this.f30959n.m2685d();
            }
            boolean z4 = this.f30963r;
            int i2 = this.f30954i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f30963r = z5;
            return z5;
        }

        /* renamed from: c */
        public boolean m2694c() {
            return this.f30948c;
        }

        /* renamed from: e */
        public void m2692e(C7566w.C7567a aVar) {
            this.f30950e.append(aVar.f16399a, aVar);
        }

        /* renamed from: f */
        public void m2691f(C7566w.C7568b bVar) {
            this.f30949d.append(bVar.f16405d, bVar);
        }

        /* renamed from: g */
        public void m2690g() {
            this.f30956k = false;
            this.f30960o = false;
            this.f30959n.m2687b();
        }

        /* renamed from: h */
        public void m2689h(long j, int i, long j2) {
            this.f30954i = i;
            this.f30957l = j2;
            this.f30955j = j;
            if (!this.f30947b || i != 1) {
                if (!this.f30948c) {
                    return;
                }
                if (!(i == 5 || i == 1 || i == 2)) {
                    return;
                }
            }
            C13791a aVar = this.f30958m;
            this.f30958m = this.f30959n;
            this.f30959n = aVar;
            aVar.m2687b();
            this.f30953h = 0;
            this.f30956k = true;
        }
    }

    public C13788p(C13759d0 d0Var, boolean z, boolean z2) {
        this.f30931a = d0Var;
        this.f30932b = z;
        this.f30933c = z2;
    }

    /* renamed from: a */
    private void m2700a() {
        C7510a.m22364h(this.f30940j);
        C7557q0.m22145j(this.f30941k);
    }

    /* renamed from: g */
    private void m2699g(long j, int i, int i2, long j2) {
        if (!this.f30942l || this.f30941k.m2694c()) {
            this.f30934d.m2651b(i2);
            this.f30935e.m2651b(i2);
            if (!this.f30942l) {
                if (this.f30934d.m2650c() && this.f30935e.m2650c()) {
                    ArrayList arrayList = new ArrayList();
                    C13797u uVar = this.f30934d;
                    arrayList.add(Arrays.copyOf(uVar.f31049d, uVar.f31050e));
                    C13797u uVar2 = this.f30935e;
                    arrayList.add(Arrays.copyOf(uVar2.f31049d, uVar2.f31050e));
                    C13797u uVar3 = this.f30934d;
                    C7566w.C7568b i3 = C7566w.m22054i(uVar3.f31049d, 3, uVar3.f31050e);
                    C13797u uVar4 = this.f30935e;
                    C7566w.C7567a h = C7566w.m22055h(uVar4.f31049d, 3, uVar4.f31050e);
                    this.f30940j.mo12388d(new C6722k.C6724b().m24505S(this.f30939i).m24488e0("video/avc").m24515I(C7518d.m22350a(i3.f16402a, i3.f16403b, i3.f16404c)).m24478j0(i3.f16406e).m24507Q(i3.f16407f).m24496a0(i3.f16408g).m24504T(arrayList).m24519E());
                    this.f30942l = true;
                    this.f30941k.m2691f(i3);
                    this.f30941k.m2692e(h);
                    this.f30934d.m2649d();
                    this.f30935e.m2649d();
                }
            } else if (this.f30934d.m2650c()) {
                C13797u uVar5 = this.f30934d;
                this.f30941k.m2691f(C7566w.m22054i(uVar5.f31049d, 3, uVar5.f31050e));
                this.f30934d.m2649d();
            } else if (this.f30935e.m2650c()) {
                C13797u uVar6 = this.f30935e;
                this.f30941k.m2692e(C7566w.m22055h(uVar6.f31049d, 3, uVar6.f31050e));
                this.f30935e.m2649d();
            }
        }
        if (this.f30936f.m2651b(i2)) {
            C13797u uVar7 = this.f30936f;
            this.f30945o.m22019N(this.f30936f.f31049d, C7566w.m22052k(uVar7.f31049d, uVar7.f31050e));
            this.f30945o.m22017P(4);
            this.f30931a.m2796a(j2, this.f30945o);
        }
        if (this.f30941k.m2695b(j, i, this.f30942l, this.f30944n)) {
            this.f30944n = false;
        }
    }

    /* renamed from: h */
    private void m2698h(byte[] bArr, int i, int i2) {
        if (!this.f30942l || this.f30941k.m2694c()) {
            this.f30934d.m2652a(bArr, i, i2);
            this.f30935e.m2652a(bArr, i, i2);
        }
        this.f30936f.m2652a(bArr, i, i2);
        this.f30941k.m2696a(bArr, i, i2);
    }

    /* renamed from: i */
    private void m2697i(long j, int i, long j2) {
        if (!this.f30942l || this.f30941k.m2694c()) {
            this.f30934d.m2648e(i);
            this.f30935e.m2648e(i);
        }
        this.f30936f.m2648e(i);
        this.f30941k.m2689h(j, i, j2);
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        int i;
        m2700a();
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        byte[] d = yVar.m22012d();
        this.f30937g += yVar.m22015a();
        this.f30940j.mo12386f(yVar, yVar.m22015a());
        while (true) {
            int c = C7566w.m22060c(d, e, f, this.f30938h);
            if (c == f) {
                m2698h(d, e, f);
                return;
            }
            int f2 = C7566w.m22057f(d, c);
            int i2 = c - e;
            if (i2 > 0) {
                m2698h(d, e, c);
            }
            int i3 = f - c;
            long j = this.f30937g - i3;
            if (i2 < 0) {
                i = -i2;
            } else {
                i = 0;
            }
            m2699g(j, i3, i, this.f30943m);
            m2697i(j, f2, this.f30943m);
            e = c + 3;
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f30937g = 0L;
        this.f30944n = false;
        C7566w.m22062a(this.f30938h);
        this.f30934d.m2649d();
        this.f30935e.m2649d();
        this.f30936f.m2649d();
        C13790b bVar = this.f30941k;
        if (bVar != null) {
            bVar.m2690g();
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f30939i = dVar.m2730b();
        AbstractC10500b0 e = kVar.mo7937e(dVar.m2729c(), 2);
        this.f30940j = e;
        this.f30941k = new C13790b(e, this.f30932b, this.f30933c);
        this.f30931a.m2795b(kVar, dVar);
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        boolean z;
        this.f30943m = j;
        boolean z2 = this.f30944n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f30944n = z2 | z;
    }
}
