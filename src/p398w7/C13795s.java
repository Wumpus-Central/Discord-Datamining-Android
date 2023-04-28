package p398w7;

import java.util.Collections;
import p079e7.C6722k;
import p079e7.C6728o;
import p117g7.C7423a;
import p119g9.C7510a;
import p119g9.C7569x;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.s */
/* loaded from: classes7.dex */
public final class C13795s implements AbstractC13782m {

    /* renamed from: a */
    private final String f31013a;

    /* renamed from: b */
    private final C7570y f31014b;

    /* renamed from: c */
    private final C7569x f31015c;

    /* renamed from: d */
    private AbstractC10500b0 f31016d;

    /* renamed from: e */
    private String f31017e;

    /* renamed from: f */
    private C6722k f31018f;

    /* renamed from: g */
    private int f31019g;

    /* renamed from: h */
    private int f31020h;

    /* renamed from: i */
    private int f31021i;

    /* renamed from: j */
    private int f31022j;

    /* renamed from: k */
    private long f31023k;

    /* renamed from: l */
    private boolean f31024l;

    /* renamed from: m */
    private int f31025m;

    /* renamed from: n */
    private int f31026n;

    /* renamed from: o */
    private int f31027o;

    /* renamed from: p */
    private boolean f31028p;

    /* renamed from: q */
    private long f31029q;

    /* renamed from: r */
    private int f31030r;

    /* renamed from: s */
    private long f31031s;

    /* renamed from: t */
    private int f31032t;

    /* renamed from: u */
    private String f31033u;

    public C13795s(String str) {
        this.f31013a = str;
        C7570y yVar = new C7570y((int) Spliterator.IMMUTABLE);
        this.f31014b = yVar;
        this.f31015c = new C7569x(yVar.m22012d());
    }

    /* renamed from: a */
    private static long m2668a(C7569x xVar) {
        return xVar.m22044h((xVar.m22044h(2) + 1) * 8);
    }

    /* renamed from: g */
    private void m2667g(C7569x xVar) {
        if (!xVar.m22045g()) {
            this.f31024l = true;
            m2662l(xVar);
        } else if (!this.f31024l) {
            return;
        }
        if (this.f31025m != 0) {
            throw new C6728o();
        } else if (this.f31026n == 0) {
            m2663k(xVar, m2664j(xVar));
            if (this.f31028p) {
                xVar.m22034r((int) this.f31029q);
            }
        } else {
            throw new C6728o();
        }
    }

    /* renamed from: h */
    private int m2666h(C7569x xVar) {
        int b = xVar.m22050b();
        C7423a.C7424b f = C7423a.m22701f(xVar, true);
        this.f31033u = f.f15995c;
        this.f31030r = f.f15993a;
        this.f31032t = f.f15994b;
        return b - xVar.m22050b();
    }

    /* renamed from: i */
    private void m2665i(C7569x xVar) {
        int h = xVar.m22044h(3);
        this.f31027o = h;
        if (h == 0) {
            xVar.m22034r(8);
        } else if (h == 1) {
            xVar.m22034r(9);
        } else if (h == 3 || h == 4 || h == 5) {
            xVar.m22034r(6);
        } else if (h == 6 || h == 7) {
            xVar.m22034r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    private int m2664j(C7569x xVar) {
        int h;
        if (this.f31027o == 0) {
            int i = 0;
            do {
                h = xVar.m22044h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw new C6728o();
    }

    /* renamed from: k */
    private void m2663k(C7569x xVar, int i) {
        int e = xVar.m22047e();
        if ((e & 7) == 0) {
            this.f31014b.m22017P(e >> 3);
        } else {
            xVar.m22043i(this.f31014b.m22012d(), 0, i * 8);
            this.f31014b.m22017P(0);
        }
        this.f31016d.mo12386f(this.f31014b, i);
        this.f31016d.mo12382c(this.f31023k, 1, i, 0, null);
        this.f31023k += this.f31031s;
    }

    /* renamed from: l */
    private void m2662l(C7569x xVar) {
        int i;
        boolean g;
        int h = xVar.m22044h(1);
        if (h == 1) {
            i = xVar.m22044h(1);
        } else {
            i = 0;
        }
        this.f31025m = i;
        if (i == 0) {
            if (h == 1) {
                m2668a(xVar);
            }
            if (xVar.m22045g()) {
                this.f31026n = xVar.m22044h(6);
                int h2 = xVar.m22044h(4);
                int h3 = xVar.m22044h(3);
                if (h2 == 0 && h3 == 0) {
                    if (h == 0) {
                        int e = xVar.m22047e();
                        int h4 = m2666h(xVar);
                        xVar.m22036p(e);
                        byte[] bArr = new byte[(h4 + 7) / 8];
                        xVar.m22043i(bArr, 0, h4);
                        C6722k E = new C6722k.C6724b().m24505S(this.f31017e).m24488e0("audio/mp4a-latm").m24515I(this.f31033u).m24516H(this.f31032t).m24486f0(this.f31030r).m24504T(Collections.singletonList(bArr)).m24502V(this.f31013a).m24519E();
                        if (!E.equals(this.f31018f)) {
                            this.f31018f = E;
                            this.f31031s = 1024000000 / E.f37970J;
                            this.f31016d.mo12388d(E);
                        }
                    } else {
                        xVar.m22034r(((int) m2668a(xVar)) - m2666h(xVar));
                    }
                    m2665i(xVar);
                    boolean g2 = xVar.m22045g();
                    this.f31028p = g2;
                    this.f31029q = 0L;
                    if (g2) {
                        if (h == 1) {
                            this.f31029q = m2668a(xVar);
                        } else {
                            do {
                                g = xVar.m22045g();
                                this.f31029q = (this.f31029q << 8) + xVar.m22044h(8);
                            } while (g);
                        }
                    }
                    if (xVar.m22045g()) {
                        xVar.m22034r(8);
                        return;
                    }
                    return;
                }
                throw new C6728o();
            }
            throw new C6728o();
        }
        throw new C6728o();
    }

    /* renamed from: m */
    private void m2661m(int i) {
        this.f31014b.m22021L(i);
        this.f31015c.m22038n(this.f31014b.m22012d());
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        C7510a.m22364h(this.f31016d);
        while (yVar.m22015a() > 0) {
            int i = this.f31019g;
            if (i != 0) {
                if (i == 1) {
                    int D = yVar.m22029D();
                    if ((D & 224) == 224) {
                        this.f31022j = D;
                        this.f31019g = 2;
                    } else if (D != 86) {
                        this.f31019g = 0;
                    }
                } else if (i == 2) {
                    int D2 = ((this.f31022j & (-225)) << 8) | yVar.m22029D();
                    this.f31021i = D2;
                    if (D2 > this.f31014b.m22012d().length) {
                        m2661m(this.f31021i);
                    }
                    this.f31020h = 0;
                    this.f31019g = 3;
                } else if (i == 3) {
                    int min = Math.min(yVar.m22015a(), this.f31021i - this.f31020h);
                    yVar.m22006j(this.f31015c.f16415a, this.f31020h, min);
                    int i2 = this.f31020h + min;
                    this.f31020h = i2;
                    if (i2 == this.f31021i) {
                        this.f31015c.m22036p(0);
                        m2667g(this.f31015c);
                        this.f31019g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (yVar.m22029D() == 86) {
                this.f31019g = 1;
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f31019g = 0;
        this.f31024l = false;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f31016d = kVar.mo7937e(dVar.m2729c(), 1);
        this.f31017e = dVar.m2730b();
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        this.f31023k = j;
    }
}
