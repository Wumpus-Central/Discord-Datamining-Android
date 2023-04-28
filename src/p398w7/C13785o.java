package p398w7;

import java.util.Arrays;
import java.util.Collections;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7566w;
import p119g9.C7569x;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.o */
/* loaded from: classes7.dex */
public final class C13785o implements AbstractC13782m {

    /* renamed from: l */
    private static final float[] f30905l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C13780k0 f30906a;

    /* renamed from: b */
    private final C7570y f30907b;

    /* renamed from: c */
    private final boolean[] f30908c = new boolean[4];

    /* renamed from: d */
    private final C13786a f30909d = new C13786a(128);

    /* renamed from: e */
    private final C13797u f30910e;

    /* renamed from: f */
    private C13787b f30911f;

    /* renamed from: g */
    private long f30912g;

    /* renamed from: h */
    private String f30913h;

    /* renamed from: i */
    private AbstractC10500b0 f30914i;

    /* renamed from: j */
    private boolean f30915j;

    /* renamed from: k */
    private long f30916k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7.o$a */
    /* loaded from: classes7.dex */
    public static final class C13786a {

        /* renamed from: f */
        private static final byte[] f30917f = {0, 0, 1};

        /* renamed from: a */
        private boolean f30918a;

        /* renamed from: b */
        private int f30919b;

        /* renamed from: c */
        public int f30920c;

        /* renamed from: d */
        public int f30921d;

        /* renamed from: e */
        public byte[] f30922e;

        public C13786a(int i) {
            this.f30922e = new byte[i];
        }

        /* renamed from: a */
        public void m2707a(byte[] bArr, int i, int i2) {
            if (this.f30918a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f30922e;
                int length = bArr2.length;
                int i4 = this.f30920c;
                if (length < i4 + i3) {
                    this.f30922e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f30922e, this.f30920c, i3);
                this.f30920c += i3;
            }
        }

        /* renamed from: b */
        public boolean m2706b(int i, int i2) {
            int i3 = this.f30919b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            } else if (i == 179 || i == 181) {
                                this.f30920c -= i2;
                                this.f30918a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            C7558r.m22104h("H263Reader", "Unexpected start code value");
                            m2705c();
                        } else {
                            this.f30921d = this.f30920c;
                            this.f30919b = 4;
                        }
                    } else if (i > 31) {
                        C7558r.m22104h("H263Reader", "Unexpected start code value");
                        m2705c();
                    } else {
                        this.f30919b = 3;
                    }
                } else if (i != 181) {
                    C7558r.m22104h("H263Reader", "Unexpected start code value");
                    m2705c();
                } else {
                    this.f30919b = 2;
                }
            } else if (i == 176) {
                this.f30919b = 1;
                this.f30918a = true;
            }
            byte[] bArr = f30917f;
            m2707a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m2705c() {
            this.f30918a = false;
            this.f30920c = 0;
            this.f30919b = 0;
        }
    }

    /* renamed from: w7.o$b */
    /* loaded from: classes7.dex */
    private static final class C13787b {

        /* renamed from: a */
        private final AbstractC10500b0 f30923a;

        /* renamed from: b */
        private boolean f30924b;

        /* renamed from: c */
        private boolean f30925c;

        /* renamed from: d */
        private boolean f30926d;

        /* renamed from: e */
        private int f30927e;

        /* renamed from: f */
        private int f30928f;

        /* renamed from: g */
        private long f30929g;

        /* renamed from: h */
        private long f30930h;

        public C13787b(AbstractC10500b0 b0Var) {
            this.f30923a = b0Var;
        }

        /* renamed from: a */
        public void m2704a(byte[] bArr, int i, int i2) {
            boolean z;
            if (this.f30925c) {
                int i3 = this.f30928f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    if (((bArr[i4] & 192) >> 6) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f30926d = z;
                    this.f30925c = false;
                    return;
                }
                this.f30928f = i3 + (i2 - i);
            }
        }

        /* renamed from: b */
        public void m2703b(long j, int i, boolean z) {
            if (this.f30927e == 182 && z && this.f30924b) {
                boolean z2 = this.f30926d;
                this.f30923a.mo12382c(this.f30930h, z2 ? 1 : 0, (int) (j - this.f30929g), i, null);
            }
            if (this.f30927e != 179) {
                this.f30929g = j;
            }
        }

        /* renamed from: c */
        public void m2702c(int i, long j) {
            boolean z;
            this.f30927e = i;
            this.f30926d = false;
            boolean z2 = true;
            if (i == 182 || i == 179) {
                z = true;
            } else {
                z = false;
            }
            this.f30924b = z;
            if (i != 182) {
                z2 = false;
            }
            this.f30925c = z2;
            this.f30928f = 0;
            this.f30930h = j;
        }

        /* renamed from: d */
        public void m2701d() {
            this.f30924b = false;
            this.f30925c = false;
            this.f30926d = false;
            this.f30927e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13785o(C13780k0 k0Var) {
        this.f30906a = k0Var;
        if (k0Var != null) {
            this.f30910e = new C13797u(178, 128);
            this.f30907b = new C7570y();
            return;
        }
        this.f30910e = null;
        this.f30907b = null;
    }

    /* renamed from: a */
    private static C6722k m2708a(C13786a aVar, int i, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f30922e, aVar.f30920c);
        C7569x xVar = new C7569x(copyOf);
        xVar.m22033s(i);
        xVar.m22033s(4);
        xVar.m22035q();
        xVar.m22034r(8);
        if (xVar.m22045g()) {
            xVar.m22034r(4);
            xVar.m22034r(3);
        }
        int h = xVar.m22044h(4);
        float f = 1.0f;
        if (h == 15) {
            int h2 = xVar.m22044h(8);
            int h3 = xVar.m22044h(8);
            if (h3 == 0) {
                C7558r.m22104h("H263Reader", "Invalid aspect ratio");
            } else {
                f = h2 / h3;
            }
        } else {
            float[] fArr = f30905l;
            if (h < fArr.length) {
                f = fArr[h];
            } else {
                C7558r.m22104h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xVar.m22045g()) {
            xVar.m22034r(2);
            xVar.m22034r(1);
            if (xVar.m22045g()) {
                xVar.m22034r(15);
                xVar.m22035q();
                xVar.m22034r(15);
                xVar.m22035q();
                xVar.m22034r(15);
                xVar.m22035q();
                xVar.m22034r(3);
                xVar.m22034r(11);
                xVar.m22035q();
                xVar.m22034r(15);
                xVar.m22035q();
            }
        }
        if (xVar.m22044h(2) != 0) {
            C7558r.m22104h("H263Reader", "Unhandled video object layer shape");
        }
        xVar.m22035q();
        int h4 = xVar.m22044h(16);
        xVar.m22035q();
        if (xVar.m22045g()) {
            if (h4 == 0) {
                C7558r.m22104h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                xVar.m22034r(i2);
            }
        }
        xVar.m22035q();
        int h5 = xVar.m22044h(13);
        xVar.m22035q();
        int h6 = xVar.m22044h(13);
        xVar.m22035q();
        xVar.m22035q();
        return new C6722k.C6724b().m24505S(str).m24488e0("video/mp4v-es").m24478j0(h5).m24507Q(h6).m24496a0(f).m24504T(Collections.singletonList(copyOf)).m24519E();
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        int i;
        C7510a.m22364h(this.f30911f);
        C7510a.m22364h(this.f30914i);
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        byte[] d = yVar.m22012d();
        this.f30912g += yVar.m22015a();
        this.f30914i.mo12386f(yVar, yVar.m22015a());
        while (true) {
            int c = C7566w.m22060c(d, e, f, this.f30908c);
            if (c == f) {
                break;
            }
            int i2 = c + 3;
            int i3 = yVar.m22012d()[i2] & 255;
            int i4 = c - e;
            int i5 = 0;
            if (!this.f30915j) {
                if (i4 > 0) {
                    this.f30909d.m2707a(d, e, c);
                }
                if (i4 < 0) {
                    i = -i4;
                } else {
                    i = 0;
                }
                if (this.f30909d.m2706b(i3, i)) {
                    AbstractC10500b0 b0Var = this.f30914i;
                    C13786a aVar = this.f30909d;
                    b0Var.mo12388d(m2708a(aVar, aVar.f30921d, (String) C7510a.m22367e(this.f30913h)));
                    this.f30915j = true;
                }
            }
            this.f30911f.m2704a(d, e, c);
            C13797u uVar = this.f30910e;
            if (uVar != null) {
                if (i4 > 0) {
                    uVar.m2652a(d, e, c);
                } else {
                    i5 = -i4;
                }
                if (this.f30910e.m2651b(i5)) {
                    C13797u uVar2 = this.f30910e;
                    ((C7570y) C7557q0.m22145j(this.f30907b)).m22019N(this.f30910e.f31049d, C7566w.m22052k(uVar2.f31049d, uVar2.f31050e));
                    ((C13780k0) C7557q0.m22145j(this.f30906a)).m2715a(this.f30916k, this.f30907b);
                }
                if (i3 == 178 && yVar.m22012d()[c + 2] == 1) {
                    this.f30910e.m2648e(i3);
                }
            }
            int i6 = f - c;
            this.f30911f.m2703b(this.f30912g - i6, i6, this.f30915j);
            this.f30911f.m2702c(i3, this.f30916k);
            e = i2;
        }
        if (!this.f30915j) {
            this.f30909d.m2707a(d, e, f);
        }
        this.f30911f.m2704a(d, e, f);
        C13797u uVar3 = this.f30910e;
        if (uVar3 != null) {
            uVar3.m2652a(d, e, f);
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        C7566w.m22062a(this.f30908c);
        this.f30909d.m2705c();
        C13787b bVar = this.f30911f;
        if (bVar != null) {
            bVar.m2701d();
        }
        C13797u uVar = this.f30910e;
        if (uVar != null) {
            uVar.m2649d();
        }
        this.f30912g = 0L;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f30913h = dVar.m2730b();
        AbstractC10500b0 e = kVar.mo7937e(dVar.m2729c(), 2);
        this.f30914i = e;
        this.f30911f = new C13787b(e);
        C13780k0 k0Var = this.f30906a;
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
        this.f30916k = j;
    }
}
