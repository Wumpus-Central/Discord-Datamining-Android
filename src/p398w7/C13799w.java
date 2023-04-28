package p398w7;

import p119g9.C7510a;
import p119g9.C7544l0;
import p119g9.C7558r;
import p119g9.C7569x;
import p119g9.C7570y;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.w */
/* loaded from: classes7.dex */
public final class C13799w implements AbstractC13772i0 {

    /* renamed from: a */
    private final AbstractC13782m f31054a;

    /* renamed from: b */
    private final C7569x f31055b = new C7569x(new byte[10]);

    /* renamed from: c */
    private int f31056c = 0;

    /* renamed from: d */
    private int f31057d;

    /* renamed from: e */
    private C7544l0 f31058e;

    /* renamed from: f */
    private boolean f31059f;

    /* renamed from: g */
    private boolean f31060g;

    /* renamed from: h */
    private boolean f31061h;

    /* renamed from: i */
    private int f31062i;

    /* renamed from: j */
    private int f31063j;

    /* renamed from: k */
    private boolean f31064k;

    /* renamed from: l */
    private long f31065l;

    public C13799w(AbstractC13782m mVar) {
        this.f31054a = mVar;
    }

    /* renamed from: d */
    private boolean m2641d(C7570y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.m22015a(), i - this.f31057d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.m22016Q(min);
        } else {
            yVar.m22006j(bArr, this.f31057d, min);
        }
        int i2 = this.f31057d + min;
        this.f31057d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m2640e() {
        this.f31055b.m22036p(0);
        int h = this.f31055b.m22044h(24);
        if (h != 1) {
            C7558r.m22104h("PesReader", "Unexpected start code prefix: " + h);
            this.f31063j = -1;
            return false;
        }
        this.f31055b.m22034r(8);
        int h2 = this.f31055b.m22044h(16);
        this.f31055b.m22034r(5);
        this.f31064k = this.f31055b.m22045g();
        this.f31055b.m22034r(2);
        this.f31059f = this.f31055b.m22045g();
        this.f31060g = this.f31055b.m22045g();
        this.f31055b.m22034r(6);
        int h3 = this.f31055b.m22044h(8);
        this.f31062i = h3;
        if (h2 == 0) {
            this.f31063j = -1;
        } else {
            int i = ((h2 + 6) - 9) - h3;
            this.f31063j = i;
            if (i < 0) {
                C7558r.m22104h("PesReader", "Found negative packet payload size: " + this.f31063j);
                this.f31063j = -1;
            }
        }
        return true;
    }

    /* renamed from: f */
    private void m2639f() {
        this.f31055b.m22036p(0);
        this.f31065l = -9223372036854775807L;
        if (this.f31059f) {
            this.f31055b.m22034r(4);
            this.f31055b.m22034r(1);
            this.f31055b.m22034r(1);
            long h = (this.f31055b.m22044h(3) << 30) | (this.f31055b.m22044h(15) << 15) | this.f31055b.m22044h(15);
            this.f31055b.m22034r(1);
            if (!this.f31061h && this.f31060g) {
                this.f31055b.m22034r(4);
                this.f31055b.m22034r(1);
                this.f31055b.m22034r(1);
                this.f31055b.m22034r(1);
                this.f31058e.m22264b((this.f31055b.m22044h(3) << 30) | (this.f31055b.m22044h(15) << 15) | this.f31055b.m22044h(15));
                this.f31061h = true;
            }
            this.f31065l = this.f31058e.m22264b(h);
        }
    }

    /* renamed from: g */
    private void m2638g(int i) {
        this.f31056c = i;
        this.f31057d = 0;
    }

    @Override // p398w7.AbstractC13772i0
    /* renamed from: a */
    public void mo2644a(C7544l0 l0Var, AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        this.f31058e = l0Var;
        this.f31054a.mo2657d(kVar, dVar);
    }

    @Override // p398w7.AbstractC13772i0
    /* renamed from: b */
    public final void mo2643b(C7570y yVar, int i) {
        C7510a.m22364h(this.f31058e);
        if ((i & 1) != 0) {
            int i2 = this.f31056c;
            if (!(i2 == 0 || i2 == 1)) {
                if (i2 == 2) {
                    C7558r.m22104h("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.f31063j != -1) {
                        C7558r.m22104h("PesReader", "Unexpected start indicator: expected " + this.f31063j + " more bytes");
                    }
                    this.f31054a.mo2656e();
                } else {
                    throw new IllegalStateException();
                }
            }
            m2638g(1);
        }
        while (yVar.m22015a() > 0) {
            int i3 = this.f31056c;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (m2641d(yVar, this.f31055b.f16415a, Math.min(10, this.f31062i)) && m2641d(yVar, null, this.f31062i)) {
                            m2639f();
                            if (this.f31064k) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.f31054a.mo2655f(this.f31065l, i);
                            m2638g(3);
                        }
                    } else if (i3 == 3) {
                        int a = yVar.m22015a();
                        int i5 = this.f31063j;
                        if (i5 != -1) {
                            i4 = a - i5;
                        }
                        if (i4 > 0) {
                            a -= i4;
                            yVar.m22018O(yVar.m22011e() + a);
                        }
                        this.f31054a.mo2659b(yVar);
                        int i6 = this.f31063j;
                        if (i6 != -1) {
                            int i7 = i6 - a;
                            this.f31063j = i7;
                            if (i7 == 0) {
                                this.f31054a.mo2656e();
                                m2638g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m2641d(yVar, this.f31055b.f16415a, 9)) {
                    if (m2640e()) {
                        i4 = 2;
                    }
                    m2638g(i4);
                }
            } else {
                yVar.m22016Q(yVar.m22015a());
            }
        }
    }

    @Override // p398w7.AbstractC13772i0
    /* renamed from: c */
    public final void mo2642c() {
        this.f31056c = 0;
        this.f31057d = 0;
        this.f31061h = false;
        this.f31054a.mo2658c();
    }
}
