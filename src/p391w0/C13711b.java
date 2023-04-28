package p391w0;

import java.util.ArrayList;
import java.util.Iterator;
import p391w0.C13714d;
import p391w0.C13722h;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public class C13711b implements C13714d.AbstractC13715a {

    /* renamed from: e */
    public AbstractC13712a f30627e;

    /* renamed from: a */
    C13722h f30623a = null;

    /* renamed from: b */
    float f30624b = 0.0f;

    /* renamed from: c */
    boolean f30625c = false;

    /* renamed from: d */
    ArrayList<C13722h> f30626d = new ArrayList<>();

    /* renamed from: f */
    boolean f30628f = false;

    /* renamed from: w0.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC13712a {
        /* renamed from: a */
        void mo2879a(C13722h hVar, float f, boolean z);

        /* renamed from: b */
        C13722h mo2878b(int i);

        /* renamed from: c */
        void mo2877c();

        void clear();

        /* renamed from: d */
        int mo2876d();

        /* renamed from: e */
        float mo2875e(C13722h hVar);

        /* renamed from: f */
        float mo2874f(C13722h hVar, boolean z);

        /* renamed from: g */
        float mo2873g(C13711b bVar, boolean z);

        /* renamed from: h */
        float mo2872h(int i);

        /* renamed from: i */
        void mo2871i(C13722h hVar, float f);

        /* renamed from: j */
        boolean mo2870j(C13722h hVar);

        /* renamed from: k */
        void mo2869k(float f);
    }

    public C13711b() {
    }

    /* renamed from: v */
    private boolean m2936v(C13722h hVar, C13714d dVar) {
        return hVar.f30680m <= 1;
    }

    /* renamed from: x */
    private C13722h m2934x(boolean[] zArr, C13722h hVar) {
        C13722h.EnumC13723a aVar;
        int d = this.f30627e.mo2876d();
        C13722h hVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float h = this.f30627e.mo2872h(i);
            if (h < 0.0f) {
                C13722h b = this.f30627e.mo2878b(i);
                if ((zArr == null || !zArr[b.f30670c]) && b != hVar && (((aVar = b.f30677j) == C13722h.EnumC13723a.SLACK || aVar == C13722h.EnumC13723a.ERROR) && h < f)) {
                    f = h;
                    hVar2 = b;
                }
            }
        }
        return hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m2957A() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p391w0.C13711b.m2957A():java.lang.String");
    }

    /* renamed from: B */
    public void m2956B(C13714d dVar, C13722h hVar, boolean z) {
        if (hVar.f30674g) {
            this.f30624b += hVar.f30673f * this.f30627e.mo2875e(hVar);
            this.f30627e.mo2874f(hVar, z);
            if (z) {
                hVar.m2884c(this);
            }
        }
    }

    /* renamed from: C */
    public void mo2898C(C13711b bVar, boolean z) {
        this.f30624b += bVar.f30624b * this.f30627e.mo2873g(bVar, z);
        if (z) {
            bVar.f30623a.m2884c(this);
        }
    }

    /* renamed from: D */
    public void m2955D(C13714d dVar) {
        if (dVar.f30643f.length != 0) {
            boolean z = false;
            while (!z) {
                int d = this.f30627e.mo2876d();
                for (int i = 0; i < d; i++) {
                    C13722h b = this.f30627e.mo2878b(i);
                    if (b.f30671d != -1 || b.f30674g) {
                        this.f30626d.add(b);
                    }
                }
                if (this.f30626d.size() > 0) {
                    Iterator<C13722h> it = this.f30626d.iterator();
                    while (it.hasNext()) {
                        C13722h next = it.next();
                        if (next.f30674g) {
                            m2956B(dVar, next, true);
                        } else {
                            mo2898C(dVar.f30643f[next.f30671d], true);
                        }
                    }
                    this.f30626d.clear();
                } else {
                    z = true;
                }
            }
        }
    }

    @Override // p391w0.C13714d.AbstractC13715a
    /* renamed from: a */
    public void mo2900a(C13714d.AbstractC13715a aVar) {
        if (aVar instanceof C13711b) {
            C13711b bVar = (C13711b) aVar;
            this.f30623a = null;
            this.f30627e.clear();
            for (int i = 0; i < bVar.f30627e.mo2876d(); i++) {
                this.f30627e.mo2879a(bVar.f30627e.mo2878b(i), bVar.f30627e.mo2872h(i), true);
            }
        }
    }

    @Override // p391w0.C13714d.AbstractC13715a
    /* renamed from: b */
    public C13722h mo2894b(C13714d dVar, boolean[] zArr) {
        return m2934x(zArr, null);
    }

    @Override // p391w0.C13714d.AbstractC13715a
    /* renamed from: c */
    public void mo2893c(C13722h hVar) {
        int i = hVar.f30672e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f30627e.mo2871i(hVar, f);
    }

    @Override // p391w0.C13714d.AbstractC13715a
    public void clear() {
        this.f30627e.clear();
        this.f30623a = null;
        this.f30624b = 0.0f;
    }

    /* renamed from: d */
    public C13711b m2954d(C13714d dVar, int i) {
        this.f30627e.mo2871i(dVar.m2912o(i, "ep"), 1.0f);
        this.f30627e.mo2871i(dVar.m2912o(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C13711b m2953e(C13722h hVar, int i) {
        this.f30627e.mo2871i(hVar, i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m2952f(C13714d dVar) {
        boolean z;
        C13722h g = m2951g(dVar);
        if (g == null) {
            z = true;
        } else {
            m2933y(g);
            z = false;
        }
        if (this.f30627e.mo2876d() == 0) {
            this.f30628f = true;
        }
        return z;
    }

    /* renamed from: g */
    C13722h m2951g(C13714d dVar) {
        boolean v;
        boolean v2;
        int d = this.f30627e.mo2876d();
        C13722h hVar = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C13722h hVar2 = null;
        for (int i = 0; i < d; i++) {
            float h = this.f30627e.mo2872h(i);
            C13722h b = this.f30627e.mo2878b(i);
            if (b.f30677j == C13722h.EnumC13723a.UNRESTRICTED) {
                if (hVar == null) {
                    v2 = m2936v(b, dVar);
                } else if (f > h) {
                    v2 = m2936v(b, dVar);
                } else if (!z && m2936v(b, dVar)) {
                    f = h;
                    hVar = b;
                    z = true;
                }
                z = v2;
                f = h;
                hVar = b;
            } else if (hVar == null && h < 0.0f) {
                if (hVar2 == null) {
                    v = m2936v(b, dVar);
                } else if (f2 > h) {
                    v = m2936v(b, dVar);
                } else if (!z2 && m2936v(b, dVar)) {
                    f2 = h;
                    hVar2 = b;
                    z2 = true;
                }
                z2 = v;
                f2 = h;
                hVar2 = b;
            }
        }
        if (hVar != null) {
            return hVar;
        }
        return hVar2;
    }

    @Override // p391w0.C13714d.AbstractC13715a
    public C13722h getKey() {
        return this.f30623a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C13711b m2950h(C13722h hVar, C13722h hVar2, int i, float f, C13722h hVar3, C13722h hVar4, int i2) {
        if (hVar2 == hVar3) {
            this.f30627e.mo2871i(hVar, 1.0f);
            this.f30627e.mo2871i(hVar4, 1.0f);
            this.f30627e.mo2871i(hVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f30627e.mo2871i(hVar, 1.0f);
            this.f30627e.mo2871i(hVar2, -1.0f);
            this.f30627e.mo2871i(hVar3, -1.0f);
            this.f30627e.mo2871i(hVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f30624b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f30627e.mo2871i(hVar, -1.0f);
            this.f30627e.mo2871i(hVar2, 1.0f);
            this.f30624b = i;
        } else if (f >= 1.0f) {
            this.f30627e.mo2871i(hVar4, -1.0f);
            this.f30627e.mo2871i(hVar3, 1.0f);
            this.f30624b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.f30627e.mo2871i(hVar, f2 * 1.0f);
            this.f30627e.mo2871i(hVar2, f2 * (-1.0f));
            this.f30627e.mo2871i(hVar3, (-1.0f) * f);
            this.f30627e.mo2871i(hVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f30624b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C13711b m2949i(C13722h hVar, int i) {
        this.f30623a = hVar;
        float f = i;
        hVar.f30673f = f;
        this.f30624b = f;
        this.f30628f = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C13711b m2948j(C13722h hVar, C13722h hVar2, float f) {
        this.f30627e.mo2871i(hVar, -1.0f);
        this.f30627e.mo2871i(hVar2, f);
        return this;
    }

    /* renamed from: k */
    public C13711b m2947k(C13722h hVar, C13722h hVar2, C13722h hVar3, C13722h hVar4, float f) {
        this.f30627e.mo2871i(hVar, -1.0f);
        this.f30627e.mo2871i(hVar2, 1.0f);
        this.f30627e.mo2871i(hVar3, f);
        this.f30627e.mo2871i(hVar4, -f);
        return this;
    }

    /* renamed from: l */
    public C13711b m2946l(float f, float f2, float f3, C13722h hVar, C13722h hVar2, C13722h hVar3, C13722h hVar4) {
        this.f30624b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f30627e.mo2871i(hVar, 1.0f);
            this.f30627e.mo2871i(hVar2, -1.0f);
            this.f30627e.mo2871i(hVar4, 1.0f);
            this.f30627e.mo2871i(hVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f30627e.mo2871i(hVar, 1.0f);
            this.f30627e.mo2871i(hVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f30627e.mo2871i(hVar3, 1.0f);
            this.f30627e.mo2871i(hVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f30627e.mo2871i(hVar, 1.0f);
            this.f30627e.mo2871i(hVar2, -1.0f);
            this.f30627e.mo2871i(hVar4, f4);
            this.f30627e.mo2871i(hVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C13711b m2945m(C13722h hVar, int i) {
        if (i < 0) {
            this.f30624b = i * (-1);
            this.f30627e.mo2871i(hVar, 1.0f);
        } else {
            this.f30624b = i;
            this.f30627e.mo2871i(hVar, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C13711b m2944n(C13722h hVar, C13722h hVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f30624b = i;
        }
        if (!z) {
            this.f30627e.mo2871i(hVar, -1.0f);
            this.f30627e.mo2871i(hVar2, 1.0f);
        } else {
            this.f30627e.mo2871i(hVar, 1.0f);
            this.f30627e.mo2871i(hVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C13711b m2943o(C13722h hVar, C13722h hVar2, C13722h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f30624b = i;
        }
        if (!z) {
            this.f30627e.mo2871i(hVar, -1.0f);
            this.f30627e.mo2871i(hVar2, 1.0f);
            this.f30627e.mo2871i(hVar3, 1.0f);
        } else {
            this.f30627e.mo2871i(hVar, 1.0f);
            this.f30627e.mo2871i(hVar2, -1.0f);
            this.f30627e.mo2871i(hVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C13711b m2942p(C13722h hVar, C13722h hVar2, C13722h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f30624b = i;
        }
        if (!z) {
            this.f30627e.mo2871i(hVar, -1.0f);
            this.f30627e.mo2871i(hVar2, 1.0f);
            this.f30627e.mo2871i(hVar3, -1.0f);
        } else {
            this.f30627e.mo2871i(hVar, 1.0f);
            this.f30627e.mo2871i(hVar2, -1.0f);
            this.f30627e.mo2871i(hVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C13711b m2941q(C13722h hVar, C13722h hVar2, C13722h hVar3, C13722h hVar4, float f) {
        this.f30627e.mo2871i(hVar3, 0.5f);
        this.f30627e.mo2871i(hVar4, 0.5f);
        this.f30627e.mo2871i(hVar, -0.5f);
        this.f30627e.mo2871i(hVar2, -0.5f);
        this.f30624b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m2940r() {
        float f = this.f30624b;
        if (f < 0.0f) {
            this.f30624b = f * (-1.0f);
            this.f30627e.mo2877c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m2939s() {
        C13722h hVar = this.f30623a;
        return hVar != null && (hVar.f30677j == C13722h.EnumC13723a.UNRESTRICTED || this.f30624b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m2938t(C13722h hVar) {
        return this.f30627e.mo2870j(hVar);
    }

    public String toString() {
        return m2957A();
    }

    /* renamed from: u */
    public boolean m2937u() {
        return this.f30623a == null && this.f30624b == 0.0f && this.f30627e.mo2876d() == 0;
    }

    /* renamed from: w */
    public C13722h m2935w(C13722h hVar) {
        return m2934x(null, hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m2933y(C13722h hVar) {
        C13722h hVar2 = this.f30623a;
        if (hVar2 != null) {
            this.f30627e.mo2871i(hVar2, -1.0f);
            this.f30623a = null;
        }
        float f = this.f30627e.mo2874f(hVar, true) * (-1.0f);
        this.f30623a = hVar;
        if (f != 1.0f) {
            this.f30624b /= f;
            this.f30627e.mo2869k(f);
        }
    }

    /* renamed from: z */
    public void m2932z() {
        this.f30623a = null;
        this.f30627e.clear();
        this.f30624b = 0.0f;
        this.f30628f = false;
    }

    public C13711b(C13713c cVar) {
        this.f30627e = new C13710a(this, cVar);
    }
}
