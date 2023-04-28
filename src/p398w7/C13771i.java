package p398w7;

import java.util.Arrays;
import java.util.Collections;
import p079e7.C6722k;
import p117g7.C7423a;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7569x;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p228m7.C10513h;
import p398w7.AbstractC13772i0;

/* renamed from: w7.i */
/* loaded from: classes7.dex */
public final class C13771i implements AbstractC13782m {

    /* renamed from: v */
    private static final byte[] f30828v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f30829a;

    /* renamed from: b */
    private final C7569x f30830b;

    /* renamed from: c */
    private final C7570y f30831c;

    /* renamed from: d */
    private final String f30832d;

    /* renamed from: e */
    private String f30833e;

    /* renamed from: f */
    private AbstractC10500b0 f30834f;

    /* renamed from: g */
    private AbstractC10500b0 f30835g;

    /* renamed from: h */
    private int f30836h;

    /* renamed from: i */
    private int f30837i;

    /* renamed from: j */
    private int f30838j;

    /* renamed from: k */
    private boolean f30839k;

    /* renamed from: l */
    private boolean f30840l;

    /* renamed from: m */
    private int f30841m;

    /* renamed from: n */
    private int f30842n;

    /* renamed from: o */
    private int f30843o;

    /* renamed from: p */
    private boolean f30844p;

    /* renamed from: q */
    private long f30845q;

    /* renamed from: r */
    private int f30846r;

    /* renamed from: s */
    private long f30847s;

    /* renamed from: t */
    private AbstractC10500b0 f30848t;

    /* renamed from: u */
    private long f30849u;

    public C13771i(boolean z) {
        this(z, null);
    }

    /* renamed from: a */
    private void m2749a() {
        C7510a.m22367e(this.f30834f);
        C7557q0.m22145j(this.f30848t);
        C7557q0.m22145j(this.f30835g);
    }

    /* renamed from: g */
    private void m2748g(C7570y yVar) {
        if (yVar.m22015a() != 0) {
            this.f30830b.f16415a[0] = yVar.m22012d()[yVar.m22011e()];
            this.f30830b.m22036p(2);
            int h = this.f30830b.m22044h(4);
            int i = this.f30842n;
            if (i == -1 || h == i) {
                if (!this.f30840l) {
                    this.f30840l = true;
                    this.f30841m = this.f30843o;
                    this.f30842n = h;
                }
                m2735t();
                return;
            }
            m2738q();
        }
    }

    /* renamed from: h */
    private boolean m2747h(C7570y yVar, int i) {
        yVar.m22017P(i + 1);
        if (!m2732w(yVar, this.f30830b.f16415a, 1)) {
            return false;
        }
        this.f30830b.m22036p(4);
        int h = this.f30830b.m22044h(1);
        int i2 = this.f30841m;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.f30842n != -1) {
            if (!m2732w(yVar, this.f30830b.f16415a, 1)) {
                return true;
            }
            this.f30830b.m22036p(2);
            if (this.f30830b.m22044h(4) != this.f30842n) {
                return false;
            }
            yVar.m22017P(i + 2);
        }
        if (!m2732w(yVar, this.f30830b.f16415a, 4)) {
            return true;
        }
        this.f30830b.m22036p(14);
        int h2 = this.f30830b.m22044h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] d = yVar.m22012d();
        int f = yVar.m22010f();
        int i3 = i + h2;
        if (i3 >= f) {
            return true;
        }
        byte b = d[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == f) {
                return true;
            }
            if (!m2743l((byte) -1, d[i4]) || ((d[i4] & 8) >> 3) != h) {
                return false;
            }
            return true;
        } else if (b != 73) {
            return false;
        } else {
            int i5 = i3 + 1;
            if (i5 == f) {
                return true;
            }
            if (d[i5] != 68) {
                return false;
            }
            int i6 = i3 + 2;
            if (i6 == f || d[i6] == 51) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: i */
    private boolean m2746i(C7570y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.m22015a(), i - this.f30837i);
        yVar.m22006j(bArr, this.f30837i, min);
        int i2 = this.f30837i + min;
        this.f30837i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m2745j(C7570y yVar) {
        byte[] d = yVar.m22012d();
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        while (e < f) {
            int i = e + 1;
            int i2 = d[e] & 255;
            if (this.f30838j != 512 || !m2743l((byte) -1, (byte) i2) || (!this.f30840l && !m2747h(yVar, i - 2))) {
                int i3 = this.f30838j;
                int i4 = i2 | i3;
                if (i4 == 329) {
                    this.f30838j = 768;
                } else if (i4 == 511) {
                    this.f30838j = 512;
                } else if (i4 == 836) {
                    this.f30838j = Spliterator.IMMUTABLE;
                } else if (i4 == 1075) {
                    m2734u();
                    yVar.m22017P(i);
                    return;
                } else if (i3 != 256) {
                    this.f30838j = Spliterator.NONNULL;
                    i--;
                }
                e = i;
            } else {
                this.f30843o = (i2 & 8) >> 3;
                boolean z = true;
                if ((i2 & 1) != 0) {
                    z = false;
                }
                this.f30839k = z;
                if (!this.f30840l) {
                    m2737r();
                } else {
                    m2735t();
                }
                yVar.m22017P(i);
                return;
            }
        }
        yVar.m22017P(e);
    }

    /* renamed from: l */
    private boolean m2743l(byte b, byte b2) {
        return m2742m(((b & 255) << 8) | (b2 & 255));
    }

    /* renamed from: m */
    public static boolean m2742m(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: n */
    private void m2741n() {
        this.f30830b.m22036p(0);
        if (!this.f30844p) {
            int h = this.f30830b.m22044h(2) + 1;
            if (h != 2) {
                C7558r.m22104h("AdtsReader", "Detected audio object type: " + h + ", but assuming AAC LC.");
                h = 2;
            }
            this.f30830b.m22034r(5);
            byte[] b = C7423a.m22705b(h, this.f30842n, this.f30830b.m22044h(3));
            C7423a.C7424b g = C7423a.m22700g(b);
            C6722k E = new C6722k.C6724b().m24505S(this.f30833e).m24488e0("audio/mp4a-latm").m24515I(g.f15995c).m24516H(g.f15994b).m24486f0(g.f15993a).m24504T(Collections.singletonList(b)).m24502V(this.f30832d).m24519E();
            this.f30845q = 1024000000 / E.f37970J;
            this.f30834f.mo12388d(E);
            this.f30844p = true;
        } else {
            this.f30830b.m22034r(10);
        }
        this.f30830b.m22034r(4);
        int h2 = (this.f30830b.m22044h(13) - 2) - 5;
        if (this.f30839k) {
            h2 -= 2;
        }
        m2733v(this.f30834f, this.f30845q, 0, h2);
    }

    /* renamed from: o */
    private void m2740o() {
        this.f30835g.mo12386f(this.f30831c, 10);
        this.f30831c.m22017P(6);
        m2733v(this.f30835g, 0L, 10, this.f30831c.m22030C() + 10);
    }

    /* renamed from: p */
    private void m2739p(C7570y yVar) {
        int min = Math.min(yVar.m22015a(), this.f30846r - this.f30837i);
        this.f30848t.mo12386f(yVar, min);
        int i = this.f30837i + min;
        this.f30837i = i;
        int i2 = this.f30846r;
        if (i == i2) {
            this.f30848t.mo12382c(this.f30847s, 1, i2, 0, null);
            this.f30847s += this.f30849u;
            m2736s();
        }
    }

    /* renamed from: q */
    private void m2738q() {
        this.f30840l = false;
        m2736s();
    }

    /* renamed from: r */
    private void m2737r() {
        this.f30836h = 1;
        this.f30837i = 0;
    }

    /* renamed from: s */
    private void m2736s() {
        this.f30836h = 0;
        this.f30837i = 0;
        this.f30838j = Spliterator.NONNULL;
    }

    /* renamed from: t */
    private void m2735t() {
        this.f30836h = 3;
        this.f30837i = 0;
    }

    /* renamed from: u */
    private void m2734u() {
        this.f30836h = 2;
        this.f30837i = f30828v.length;
        this.f30846r = 0;
        this.f30831c.m22017P(0);
    }

    /* renamed from: v */
    private void m2733v(AbstractC10500b0 b0Var, long j, int i, int i2) {
        this.f30836h = 4;
        this.f30837i = i;
        this.f30848t = b0Var;
        this.f30849u = j;
        this.f30846r = i2;
    }

    /* renamed from: w */
    private boolean m2732w(C7570y yVar, byte[] bArr, int i) {
        if (yVar.m22015a() < i) {
            return false;
        }
        yVar.m22006j(bArr, 0, i);
        return true;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        int i;
        m2749a();
        while (yVar.m22015a() > 0) {
            int i2 = this.f30836h;
            if (i2 == 0) {
                m2745j(yVar);
            } else if (i2 == 1) {
                m2748g(yVar);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (this.f30839k) {
                        i = 7;
                    } else {
                        i = 5;
                    }
                    if (m2746i(yVar, this.f30830b.f16415a, i)) {
                        m2741n();
                    }
                } else if (i2 == 4) {
                    m2739p(yVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (m2746i(yVar, this.f30831c.m22012d(), 10)) {
                m2740o();
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        m2738q();
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f30833e = dVar.m2730b();
        AbstractC10500b0 e = kVar.mo7937e(dVar.m2729c(), 1);
        this.f30834f = e;
        this.f30848t = e;
        if (this.f30829a) {
            dVar.m2731a();
            AbstractC10500b0 e2 = kVar.mo7937e(dVar.m2729c(), 5);
            this.f30835g = e2;
            e2.mo12388d(new C6722k.C6724b().m24505S(dVar.m2730b()).m24488e0("application/id3").m24519E());
            return;
        }
        this.f30835g = new C10513h();
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        this.f30847s = j;
    }

    /* renamed from: k */
    public long m2744k() {
        return this.f30845q;
    }

    public C13771i(boolean z, String str) {
        this.f30830b = new C7569x(new byte[7]);
        this.f30831c = new C7570y(Arrays.copyOf(f30828v, 10));
        m2736s();
        this.f30841m = -1;
        this.f30842n = -1;
        this.f30845q = -9223372036854775807L;
        this.f30829a = z;
        this.f30832d = str;
    }
}
