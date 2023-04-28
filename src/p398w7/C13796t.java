package p398w7;

import p079e7.C6722k;
import p117g7.C7466l0;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.t */
/* loaded from: classes7.dex */
public final class C13796t implements AbstractC13782m {

    /* renamed from: a */
    private final C7570y f31034a;

    /* renamed from: b */
    private final C7466l0.C7467a f31035b;

    /* renamed from: c */
    private final String f31036c;

    /* renamed from: d */
    private AbstractC10500b0 f31037d;

    /* renamed from: e */
    private String f31038e;

    /* renamed from: f */
    private int f31039f;

    /* renamed from: g */
    private int f31040g;

    /* renamed from: h */
    private boolean f31041h;

    /* renamed from: i */
    private boolean f31042i;

    /* renamed from: j */
    private long f31043j;

    /* renamed from: k */
    private int f31044k;

    /* renamed from: l */
    private long f31045l;

    public C13796t() {
        this(null);
    }

    /* renamed from: a */
    private void m2660a(C7570y yVar) {
        boolean z;
        boolean z2;
        byte[] d = yVar.m22012d();
        int f = yVar.m22010f();
        for (int e = yVar.m22011e(); e < f; e++) {
            byte b = d[e];
            if ((b & 255) == 255) {
                z = true;
            } else {
                z = false;
            }
            if (!this.f31042i || (b & 224) != 224) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f31042i = z;
            if (z2) {
                yVar.m22017P(e + 1);
                this.f31042i = false;
                this.f31034a.m22012d()[1] = d[e];
                this.f31040g = 2;
                this.f31039f = 1;
                return;
            }
        }
        yVar.m22017P(f);
    }

    /* renamed from: g */
    private void m2654g(C7570y yVar) {
        int min = Math.min(yVar.m22015a(), this.f31044k - this.f31040g);
        this.f31037d.mo12386f(yVar, min);
        int i = this.f31040g + min;
        this.f31040g = i;
        int i2 = this.f31044k;
        if (i >= i2) {
            this.f31037d.mo12382c(this.f31045l, 1, i2, 0, null);
            this.f31045l += this.f31043j;
            this.f31040g = 0;
            this.f31039f = 0;
        }
    }

    /* renamed from: h */
    private void m2653h(C7570y yVar) {
        int min = Math.min(yVar.m22015a(), 4 - this.f31040g);
        yVar.m22006j(this.f31034a.m22012d(), this.f31040g, min);
        int i = this.f31040g + min;
        this.f31040g = i;
        if (i >= 4) {
            this.f31034a.m22017P(0);
            if (!this.f31035b.m22563a(this.f31034a.m22002n())) {
                this.f31040g = 0;
                this.f31039f = 1;
                return;
            }
            C7466l0.C7467a aVar = this.f31035b;
            this.f31044k = aVar.f16116c;
            if (!this.f31041h) {
                this.f31043j = (aVar.f16120g * 1000000) / aVar.f16117d;
                this.f31037d.mo12388d(new C6722k.C6724b().m24505S(this.f31038e).m24488e0(this.f31035b.f16115b).m24501W(4096).m24516H(this.f31035b.f16118e).m24486f0(this.f31035b.f16117d).m24502V(this.f31036c).m24519E());
                this.f31041h = true;
            }
            this.f31034a.m22017P(0);
            this.f31037d.mo12386f(this.f31034a, 4);
            this.f31039f = 2;
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        C7510a.m22364h(this.f31037d);
        while (yVar.m22015a() > 0) {
            int i = this.f31039f;
            if (i == 0) {
                m2660a(yVar);
            } else if (i == 1) {
                m2653h(yVar);
            } else if (i == 2) {
                m2654g(yVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f31039f = 0;
        this.f31040g = 0;
        this.f31042i = false;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f31038e = dVar.m2730b();
        this.f31037d = kVar.mo7937e(dVar.m2729c(), 1);
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        this.f31045l = j;
    }

    public C13796t(String str) {
        this.f31039f = 0;
        C7570y yVar = new C7570y(4);
        this.f31034a = yVar;
        yVar.m22012d()[0] = -1;
        this.f31035b = new C7466l0.C7467a();
        this.f31036c = str;
    }
}
