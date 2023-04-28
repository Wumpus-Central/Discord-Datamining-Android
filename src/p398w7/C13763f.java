package p398w7;

import p079e7.C6722k;
import p117g7.C7429c;
import p119g9.C7510a;
import p119g9.C7569x;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.f */
/* loaded from: classes7.dex */
public final class C13763f implements AbstractC13782m {

    /* renamed from: a */
    private final C7569x f30766a;

    /* renamed from: b */
    private final C7570y f30767b;

    /* renamed from: c */
    private final String f30768c;

    /* renamed from: d */
    private String f30769d;

    /* renamed from: e */
    private AbstractC10500b0 f30770e;

    /* renamed from: f */
    private int f30771f;

    /* renamed from: g */
    private int f30772g;

    /* renamed from: h */
    private boolean f30773h;

    /* renamed from: i */
    private boolean f30774i;

    /* renamed from: j */
    private long f30775j;

    /* renamed from: k */
    private C6722k f30776k;

    /* renamed from: l */
    private int f30777l;

    /* renamed from: m */
    private long f30778m;

    public C13763f() {
        this(null);
    }

    /* renamed from: a */
    private boolean m2791a(C7570y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.m22015a(), i - this.f30772g);
        yVar.m22006j(bArr, this.f30772g, min);
        int i2 = this.f30772g + min;
        this.f30772g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m2790g() {
        this.f30766a.m22036p(0);
        C7429c.C7431b d = C7429c.m22684d(this.f30766a);
        C6722k kVar = this.f30776k;
        if (kVar == null || d.f16011c != kVar.f37969I || d.f16010b != kVar.f37970J || !"audio/ac4".equals(kVar.f14329v)) {
            C6722k E = new C6722k.C6724b().m24505S(this.f30769d).m24488e0("audio/ac4").m24516H(d.f16011c).m24486f0(d.f16010b).m24502V(this.f30768c).m24519E();
            this.f30776k = E;
            this.f30770e.mo12388d(E);
        }
        this.f30777l = d.f16012d;
        this.f30775j = (d.f16013e * 1000000) / this.f30776k.f37970J;
    }

    /* renamed from: h */
    private boolean m2789h(C7570y yVar) {
        boolean z;
        int D;
        boolean z2;
        while (true) {
            z = false;
            if (yVar.m22015a() <= 0) {
                return false;
            }
            if (!this.f30773h) {
                if (yVar.m22029D() == 172) {
                    z = true;
                }
                this.f30773h = z;
            } else {
                D = yVar.m22029D();
                if (D == 172) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f30773h = z2;
                if (D == 64 || D == 65) {
                    break;
                }
            }
        }
        if (D == 65) {
            z = true;
        }
        this.f30774i = z;
        return true;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        int i;
        C7510a.m22364h(this.f30770e);
        while (yVar.m22015a() > 0) {
            int i2 = this.f30771f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(yVar.m22015a(), this.f30777l - this.f30772g);
                        this.f30770e.mo12386f(yVar, min);
                        int i3 = this.f30772g + min;
                        this.f30772g = i3;
                        int i4 = this.f30777l;
                        if (i3 == i4) {
                            this.f30770e.mo12382c(this.f30778m, 1, i4, 0, null);
                            this.f30778m += this.f30775j;
                            this.f30771f = 0;
                        }
                    }
                } else if (m2791a(yVar, this.f30767b.m22012d(), 16)) {
                    m2790g();
                    this.f30767b.m22017P(0);
                    this.f30770e.mo12386f(this.f30767b, 16);
                    this.f30771f = 2;
                }
            } else if (m2789h(yVar)) {
                this.f30771f = 1;
                this.f30767b.m22012d()[0] = -84;
                byte[] d = this.f30767b.m22012d();
                if (this.f30774i) {
                    i = 65;
                } else {
                    i = 64;
                }
                d[1] = (byte) i;
                this.f30772g = 2;
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f30771f = 0;
        this.f30772g = 0;
        this.f30773h = false;
        this.f30774i = false;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f30769d = dVar.m2730b();
        this.f30770e = kVar.mo7937e(dVar.m2729c(), 1);
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        this.f30778m = j;
    }

    public C13763f(String str) {
        C7569x xVar = new C7569x(new byte[16]);
        this.f30766a = xVar;
        this.f30767b = new C7570y(xVar.f16415a);
        this.f30771f = 0;
        this.f30772g = 0;
        this.f30773h = false;
        this.f30774i = false;
        this.f30768c = str;
    }
}
