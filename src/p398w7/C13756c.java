package p398w7;

import p079e7.C6722k;
import p117g7.C7426b;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7569x;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.c */
/* loaded from: classes7.dex */
public final class C13756c implements AbstractC13782m {

    /* renamed from: a */
    private final C7569x f30738a;

    /* renamed from: b */
    private final C7570y f30739b;

    /* renamed from: c */
    private final String f30740c;

    /* renamed from: d */
    private String f30741d;

    /* renamed from: e */
    private AbstractC10500b0 f30742e;

    /* renamed from: f */
    private int f30743f;

    /* renamed from: g */
    private int f30744g;

    /* renamed from: h */
    private boolean f30745h;

    /* renamed from: i */
    private long f30746i;

    /* renamed from: j */
    private C6722k f30747j;

    /* renamed from: k */
    private int f30748k;

    /* renamed from: l */
    private long f30749l;

    public C13756c() {
        this(null);
    }

    /* renamed from: a */
    private boolean m2799a(C7570y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.m22015a(), i - this.f30744g);
        yVar.m22006j(bArr, this.f30744g, min);
        int i2 = this.f30744g + min;
        this.f30744g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m2798g() {
        this.f30738a.m22036p(0);
        C7426b.C0232b e = C7426b.m22693e(this.f30738a);
        C6722k kVar = this.f30747j;
        if (kVar == null || e.f16005d != kVar.f37969I || e.f16004c != kVar.f37970J || !C7557q0.m22159c(e.f16002a, kVar.f14329v)) {
            C6722k E = new C6722k.C6724b().m24505S(this.f30741d).m24488e0(e.f16002a).m24516H(e.f16005d).m24486f0(e.f16004c).m24502V(this.f30740c).m24519E();
            this.f30747j = E;
            this.f30742e.mo12388d(E);
        }
        this.f30748k = e.f16006e;
        this.f30746i = (e.f16007f * 1000000) / this.f30747j.f37970J;
    }

    /* renamed from: h */
    private boolean m2797h(C7570y yVar) {
        while (true) {
            boolean z = false;
            if (yVar.m22015a() <= 0) {
                return false;
            }
            if (!this.f30745h) {
                if (yVar.m22029D() == 11) {
                    z = true;
                }
                this.f30745h = z;
            } else {
                int D = yVar.m22029D();
                if (D == 119) {
                    this.f30745h = false;
                    return true;
                }
                if (D == 11) {
                    z = true;
                }
                this.f30745h = z;
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        C7510a.m22364h(this.f30742e);
        while (yVar.m22015a() > 0) {
            int i = this.f30743f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(yVar.m22015a(), this.f30748k - this.f30744g);
                        this.f30742e.mo12386f(yVar, min);
                        int i2 = this.f30744g + min;
                        this.f30744g = i2;
                        int i3 = this.f30748k;
                        if (i2 == i3) {
                            this.f30742e.mo12382c(this.f30749l, 1, i3, 0, null);
                            this.f30749l += this.f30746i;
                            this.f30743f = 0;
                        }
                    }
                } else if (m2799a(yVar, this.f30739b.m22012d(), 128)) {
                    m2798g();
                    this.f30739b.m22017P(0);
                    this.f30742e.mo12386f(this.f30739b, 128);
                    this.f30743f = 2;
                }
            } else if (m2797h(yVar)) {
                this.f30743f = 1;
                this.f30739b.m22012d()[0] = 11;
                this.f30739b.m22012d()[1] = 119;
                this.f30744g = 2;
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f30743f = 0;
        this.f30744g = 0;
        this.f30745h = false;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f30741d = dVar.m2730b();
        this.f30742e = kVar.mo7937e(dVar.m2729c(), 1);
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        this.f30749l = j;
    }

    public C13756c(String str) {
        C7569x xVar = new C7569x(new byte[128]);
        this.f30738a = xVar;
        this.f30739b = new C7570y(xVar.f16415a);
        this.f30743f = 0;
        this.f30740c = str;
    }
}
