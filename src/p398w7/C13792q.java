package p398w7;

import java.util.Collections;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7518d;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7566w;
import p119g9.C7570y;
import p119g9.C7571z;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.q */
/* loaded from: classes7.dex */
public final class C13792q implements AbstractC13782m {

    /* renamed from: a */
    private final C13759d0 f30980a;

    /* renamed from: b */
    private String f30981b;

    /* renamed from: c */
    private AbstractC10500b0 f30982c;

    /* renamed from: d */
    private C13793a f30983d;

    /* renamed from: e */
    private boolean f30984e;

    /* renamed from: l */
    private long f30991l;

    /* renamed from: m */
    private long f30992m;

    /* renamed from: f */
    private final boolean[] f30985f = new boolean[3];

    /* renamed from: g */
    private final C13797u f30986g = new C13797u(32, 128);

    /* renamed from: h */
    private final C13797u f30987h = new C13797u(33, 128);

    /* renamed from: i */
    private final C13797u f30988i = new C13797u(34, 128);

    /* renamed from: j */
    private final C13797u f30989j = new C13797u(39, 128);

    /* renamed from: k */
    private final C13797u f30990k = new C13797u(40, 128);

    /* renamed from: n */
    private final C7570y f30993n = new C7570y();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7.q$a */
    /* loaded from: classes7.dex */
    public static final class C13793a {

        /* renamed from: a */
        private final AbstractC10500b0 f30994a;

        /* renamed from: b */
        private long f30995b;

        /* renamed from: c */
        private boolean f30996c;

        /* renamed from: d */
        private int f30997d;

        /* renamed from: e */
        private long f30998e;

        /* renamed from: f */
        private boolean f30999f;

        /* renamed from: g */
        private boolean f31000g;

        /* renamed from: h */
        private boolean f31001h;

        /* renamed from: i */
        private boolean f31002i;

        /* renamed from: j */
        private boolean f31003j;

        /* renamed from: k */
        private long f31004k;

        /* renamed from: l */
        private long f31005l;

        /* renamed from: m */
        private boolean f31006m;

        public C13793a(AbstractC10500b0 b0Var) {
            this.f30994a = b0Var;
        }

        /* renamed from: b */
        private static boolean m2674b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* renamed from: c */
        private static boolean m2673c(int i) {
            return i < 32 || i == 40;
        }

        /* renamed from: d */
        private void m2672d(int i) {
            boolean z = this.f31006m;
            this.f30994a.mo12382c(this.f31005l, z ? 1 : 0, (int) (this.f30995b - this.f31004k), i, null);
        }

        /* renamed from: a */
        public void m2675a(long j, int i, boolean z) {
            if (this.f31003j && this.f31000g) {
                this.f31006m = this.f30996c;
                this.f31003j = false;
            } else if (this.f31001h || this.f31000g) {
                if (z && this.f31002i) {
                    m2672d(i + ((int) (j - this.f30995b)));
                }
                this.f31004k = this.f30995b;
                this.f31005l = this.f30998e;
                this.f31006m = this.f30996c;
                this.f31002i = true;
            }
        }

        /* renamed from: e */
        public void m2671e(byte[] bArr, int i, int i2) {
            boolean z;
            if (this.f30999f) {
                int i3 = this.f30997d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    if ((bArr[i4] & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f31000g = z;
                    this.f30999f = false;
                    return;
                }
                this.f30997d = i3 + (i2 - i);
            }
        }

        /* renamed from: f */
        public void m2670f() {
            this.f30999f = false;
            this.f31000g = false;
            this.f31001h = false;
            this.f31002i = false;
            this.f31003j = false;
        }

        /* renamed from: g */
        public void m2669g(long j, int i, int i2, long j2, boolean z) {
            boolean z2;
            boolean z3 = false;
            this.f31000g = false;
            this.f31001h = false;
            this.f30998e = j2;
            this.f30997d = 0;
            this.f30995b = j;
            if (!m2673c(i2)) {
                if (this.f31002i && !this.f31003j) {
                    if (z) {
                        m2672d(i);
                    }
                    this.f31002i = false;
                }
                if (m2674b(i2)) {
                    this.f31001h = !this.f31003j;
                    this.f31003j = true;
                }
            }
            if (i2 < 16 || i2 > 21) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f30996c = z2;
            if (z2 || i2 <= 9) {
                z3 = true;
            }
            this.f30999f = z3;
        }
    }

    public C13792q(C13759d0 d0Var) {
        this.f30980a = d0Var;
    }

    /* renamed from: a */
    private void m2682a() {
        C7510a.m22364h(this.f30982c);
        C7557q0.m22145j(this.f30983d);
    }

    /* renamed from: g */
    private void m2681g(long j, int i, int i2, long j2) {
        this.f30983d.m2675a(j, i, this.f30984e);
        if (!this.f30984e) {
            this.f30986g.m2651b(i2);
            this.f30987h.m2651b(i2);
            this.f30988i.m2651b(i2);
            if (this.f30986g.m2650c() && this.f30987h.m2650c() && this.f30988i.m2650c()) {
                this.f30982c.mo12388d(m2679i(this.f30981b, this.f30986g, this.f30987h, this.f30988i));
                this.f30984e = true;
            }
        }
        if (this.f30989j.m2651b(i2)) {
            C13797u uVar = this.f30989j;
            this.f30993n.m22019N(this.f30989j.f31049d, C7566w.m22052k(uVar.f31049d, uVar.f31050e));
            this.f30993n.m22016Q(5);
            this.f30980a.m2796a(j2, this.f30993n);
        }
        if (this.f30990k.m2651b(i2)) {
            C13797u uVar2 = this.f30990k;
            this.f30993n.m22019N(this.f30990k.f31049d, C7566w.m22052k(uVar2.f31049d, uVar2.f31050e));
            this.f30993n.m22016Q(5);
            this.f30980a.m2796a(j2, this.f30993n);
        }
    }

    /* renamed from: h */
    private void m2680h(byte[] bArr, int i, int i2) {
        this.f30983d.m2671e(bArr, i, i2);
        if (!this.f30984e) {
            this.f30986g.m2652a(bArr, i, i2);
            this.f30987h.m2652a(bArr, i, i2);
            this.f30988i.m2652a(bArr, i, i2);
        }
        this.f30989j.m2652a(bArr, i, i2);
        this.f30990k.m2652a(bArr, i, i2);
    }

    /* renamed from: i */
    private static C6722k m2679i(String str, C13797u uVar, C13797u uVar2, C13797u uVar3) {
        int i = uVar.f31050e;
        byte[] bArr = new byte[uVar2.f31050e + i + uVar3.f31050e];
        System.arraycopy(uVar.f31049d, 0, bArr, 0, i);
        System.arraycopy(uVar2.f31049d, 0, bArr, uVar.f31050e, uVar2.f31050e);
        System.arraycopy(uVar3.f31049d, 0, bArr, uVar.f31050e + uVar2.f31050e, uVar3.f31050e);
        C7571z zVar = new C7571z(uVar2.f31049d, 0, uVar2.f31050e);
        zVar.m21978l(44);
        int e = zVar.m21985e(3);
        zVar.m21979k();
        zVar.m21978l(88);
        zVar.m21978l(8);
        int i2 = 0;
        for (int i3 = 0; i3 < e; i3++) {
            if (zVar.m21986d()) {
                i2 += 89;
            }
            if (zVar.m21986d()) {
                i2 += 8;
            }
        }
        zVar.m21978l(i2);
        if (e > 0) {
            zVar.m21978l((8 - e) * 2);
        }
        zVar.m21982h();
        int h = zVar.m21982h();
        if (h == 3) {
            zVar.m21979k();
        }
        int h2 = zVar.m21982h();
        int h3 = zVar.m21982h();
        if (zVar.m21986d()) {
            int h4 = zVar.m21982h();
            int h5 = zVar.m21982h();
            int h6 = zVar.m21982h();
            int h7 = zVar.m21982h();
            h2 -= ((h == 1 || h == 2) ? 2 : 1) * (h4 + h5);
            h3 -= (h == 1 ? 2 : 1) * (h6 + h7);
        }
        zVar.m21982h();
        zVar.m21982h();
        int h8 = zVar.m21982h();
        for (int i4 = zVar.m21986d() ? 0 : e; i4 <= e; i4++) {
            zVar.m21982h();
            zVar.m21982h();
            zVar.m21982h();
        }
        zVar.m21982h();
        zVar.m21982h();
        zVar.m21982h();
        zVar.m21982h();
        zVar.m21982h();
        zVar.m21982h();
        if (zVar.m21986d() && zVar.m21986d()) {
            m2678j(zVar);
        }
        zVar.m21978l(2);
        if (zVar.m21986d()) {
            zVar.m21978l(8);
            zVar.m21982h();
            zVar.m21982h();
            zVar.m21979k();
        }
        m2677k(zVar);
        if (zVar.m21986d()) {
            for (int i5 = 0; i5 < zVar.m21982h(); i5++) {
                zVar.m21978l(h8 + 4 + 1);
            }
        }
        zVar.m21978l(2);
        float f = 1.0f;
        if (zVar.m21986d()) {
            if (zVar.m21986d()) {
                int e2 = zVar.m21985e(8);
                if (e2 == 255) {
                    int e3 = zVar.m21985e(16);
                    int e4 = zVar.m21985e(16);
                    if (!(e3 == 0 || e4 == 0)) {
                        f = e3 / e4;
                    }
                } else {
                    float[] fArr = C7566w.f16396b;
                    if (e2 < fArr.length) {
                        f = fArr[e2];
                    } else {
                        C7558r.m22104h("H265Reader", "Unexpected aspect_ratio_idc value: " + e2);
                    }
                }
            }
            if (zVar.m21986d()) {
                zVar.m21979k();
            }
            if (zVar.m21986d()) {
                zVar.m21978l(4);
                if (zVar.m21986d()) {
                    zVar.m21978l(24);
                }
            }
            if (zVar.m21986d()) {
                zVar.m21982h();
                zVar.m21982h();
            }
            zVar.m21979k();
            if (zVar.m21986d()) {
                h3 *= 2;
            }
        }
        zVar.m21981i(uVar2.f31049d, 0, uVar2.f31050e);
        zVar.m21978l(24);
        return new C6722k.C6724b().m24505S(str).m24488e0("video/hevc").m24515I(C7518d.m22348c(zVar)).m24478j0(h2).m24507Q(h3).m24496a0(f).m24504T(Collections.singletonList(bArr)).m24519E();
    }

    /* renamed from: j */
    private static void m2678j(C7571z zVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!zVar.m21986d()) {
                    zVar.m21982h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        zVar.m21983g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        zVar.m21983g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: k */
    private static void m2677k(C7571z zVar) {
        int h = zVar.m21982h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = zVar.m21986d();
            }
            if (z) {
                zVar.m21979k();
                zVar.m21982h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (zVar.m21986d()) {
                        zVar.m21979k();
                    }
                }
            } else {
                int h2 = zVar.m21982h();
                int h3 = zVar.m21982h();
                int i4 = h2 + h3;
                for (int i5 = 0; i5 < h2; i5++) {
                    zVar.m21982h();
                    zVar.m21979k();
                }
                for (int i6 = 0; i6 < h3; i6++) {
                    zVar.m21982h();
                    zVar.m21979k();
                }
                i = i4;
            }
        }
    }

    /* renamed from: l */
    private void m2676l(long j, int i, int i2, long j2) {
        this.f30983d.m2669g(j, i, i2, j2, this.f30984e);
        if (!this.f30984e) {
            this.f30986g.m2648e(i2);
            this.f30987h.m2648e(i2);
            this.f30988i.m2648e(i2);
        }
        this.f30989j.m2648e(i2);
        this.f30990k.m2648e(i2);
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        int i;
        m2682a();
        while (yVar.m22015a() > 0) {
            int e = yVar.m22011e();
            int f = yVar.m22010f();
            byte[] d = yVar.m22012d();
            this.f30991l += yVar.m22015a();
            this.f30982c.mo12386f(yVar, yVar.m22015a());
            while (e < f) {
                int c = C7566w.m22060c(d, e, f, this.f30985f);
                if (c == f) {
                    m2680h(d, e, f);
                    return;
                }
                int e2 = C7566w.m22058e(d, c);
                int i2 = c - e;
                if (i2 > 0) {
                    m2680h(d, e, c);
                }
                int i3 = f - c;
                long j = this.f30991l - i3;
                if (i2 < 0) {
                    i = -i2;
                } else {
                    i = 0;
                }
                m2681g(j, i3, i, this.f30992m);
                m2676l(j, i3, e2, this.f30992m);
                e = c + 3;
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f30991l = 0L;
        C7566w.m22062a(this.f30985f);
        this.f30986g.m2649d();
        this.f30987h.m2649d();
        this.f30988i.m2649d();
        this.f30989j.m2649d();
        this.f30990k.m2649d();
        C13793a aVar = this.f30983d;
        if (aVar != null) {
            aVar.m2670f();
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f30981b = dVar.m2730b();
        AbstractC10500b0 e = kVar.mo7937e(dVar.m2729c(), 2);
        this.f30982c = e;
        this.f30983d = new C13793a(e);
        this.f30980a.m2795b(kVar, dVar);
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        this.f30992m = j;
    }
}
