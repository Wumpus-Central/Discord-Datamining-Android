package p391w0;

import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;
import p391w0.C13722h;

/* renamed from: w0.d */
/* loaded from: classes.dex */
public class C13714d {

    /* renamed from: q */
    private static int f30633q = 1000;

    /* renamed from: r */
    public static Metrics f30634r = null;

    /* renamed from: s */
    public static boolean f30635s = true;

    /* renamed from: t */
    public static long f30636t;

    /* renamed from: u */
    public static long f30637u;

    /* renamed from: c */
    private AbstractC13715a f30640c;

    /* renamed from: f */
    C13711b[] f30643f;

    /* renamed from: m */
    final C13713c f30650m;

    /* renamed from: p */
    private AbstractC13715a f30653p;

    /* renamed from: a */
    int f30638a = 0;

    /* renamed from: b */
    private HashMap<String, C13722h> f30639b = null;

    /* renamed from: d */
    private int f30641d = 32;

    /* renamed from: e */
    private int f30642e = 32;

    /* renamed from: g */
    public boolean f30644g = false;

    /* renamed from: h */
    public boolean f30645h = false;

    /* renamed from: i */
    private boolean[] f30646i = new boolean[32];

    /* renamed from: j */
    int f30647j = 1;

    /* renamed from: k */
    int f30648k = 0;

    /* renamed from: l */
    private int f30649l = 32;

    /* renamed from: n */
    private C13722h[] f30651n = new C13722h[f30633q];

    /* renamed from: o */
    private int f30652o = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0.d$a */
    /* loaded from: classes.dex */
    public interface AbstractC13715a {
        /* renamed from: a */
        void mo2900a(AbstractC13715a aVar);

        /* renamed from: b */
        C13722h mo2894b(C13714d dVar, boolean[] zArr);

        /* renamed from: c */
        void mo2893c(C13722h hVar);

        void clear();

        C13722h getKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0.d$b */
    /* loaded from: classes.dex */
    public class C13716b extends C13711b {
        public C13716b(C13713c cVar) {
            this.f30627e = new C13724i(this, cVar);
        }
    }

    public C13714d() {
        this.f30643f = null;
        this.f30643f = new C13711b[32];
        m2928D();
        C13713c cVar = new C13713c();
        this.f30650m = cVar;
        this.f30640c = new C13719g(cVar);
        if (f30635s) {
            this.f30653p = new C13716b(cVar);
        } else {
            this.f30653p = new C13711b(cVar);
        }
    }

    /* renamed from: C */
    private final int m2929C(AbstractC13715a aVar, boolean z) {
        Metrics metrics = f30634r;
        if (metrics != null) {
            metrics.f2499h++;
        }
        for (int i = 0; i < this.f30647j; i++) {
            this.f30646i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            Metrics metrics2 = f30634r;
            if (metrics2 != null) {
                metrics2.f2500i++;
            }
            i2++;
            if (i2 >= this.f30647j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f30646i[aVar.getKey().f30670c] = true;
            }
            C13722h b = aVar.mo2894b(this, this.f30646i);
            if (b != null) {
                boolean[] zArr = this.f30646i;
                int i3 = b.f30670c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f30648k; i5++) {
                    C13711b bVar = this.f30643f[i5];
                    if (bVar.f30623a.f30677j != C13722h.EnumC13723a.UNRESTRICTED && !bVar.f30628f && bVar.m2938t(b)) {
                        float e = bVar.f30627e.mo2875e(b);
                        if (e < 0.0f) {
                            float f2 = (-bVar.f30624b) / e;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C13711b bVar2 = this.f30643f[i4];
                    bVar2.f30623a.f30671d = -1;
                    Metrics metrics3 = f30634r;
                    if (metrics3 != null) {
                        metrics3.f2501j++;
                    }
                    bVar2.m2933y(b);
                    C13722h hVar = bVar2.f30623a;
                    hVar.f30671d = i4;
                    hVar.m2880g(bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: D */
    private void m2928D() {
        int i = 0;
        if (f30635s) {
            while (true) {
                C13711b[] bVarArr = this.f30643f;
                if (i < bVarArr.length) {
                    C13711b bVar = bVarArr[i];
                    if (bVar != null) {
                        this.f30650m.f30629a.release(bVar);
                    }
                    this.f30643f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C13711b[] bVarArr2 = this.f30643f;
                if (i < bVarArr2.length) {
                    C13711b bVar2 = bVarArr2[i];
                    if (bVar2 != null) {
                        this.f30650m.f30630b.release(bVar2);
                    }
                    this.f30643f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private C13722h m2926a(C13722h.EnumC13723a aVar, String str) {
        C13722h acquire = this.f30650m.f30631c.acquire();
        if (acquire == null) {
            acquire = new C13722h(aVar, str);
            acquire.m2881f(aVar, str);
        } else {
            acquire.m2883d();
            acquire.m2881f(aVar, str);
        }
        int i = this.f30652o;
        int i2 = f30633q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f30633q = i3;
            this.f30651n = (C13722h[]) Arrays.copyOf(this.f30651n, i3);
        }
        C13722h[] hVarArr = this.f30651n;
        int i4 = this.f30652o;
        this.f30652o = i4 + 1;
        hVarArr[i4] = acquire;
        return acquire;
    }

    /* renamed from: l */
    private final void m2915l(C13711b bVar) {
        if (f30635s) {
            C13711b bVar2 = this.f30643f[this.f30648k];
            if (bVar2 != null) {
                this.f30650m.f30629a.release(bVar2);
            }
        } else {
            C13711b bVar3 = this.f30643f[this.f30648k];
            if (bVar3 != null) {
                this.f30650m.f30630b.release(bVar3);
            }
        }
        C13711b[] bVarArr = this.f30643f;
        int i = this.f30648k;
        bVarArr[i] = bVar;
        C13722h hVar = bVar.f30623a;
        hVar.f30671d = i;
        this.f30648k = i + 1;
        hVar.m2880g(bVar);
    }

    /* renamed from: n */
    private void m2913n() {
        for (int i = 0; i < this.f30648k; i++) {
            C13711b bVar = this.f30643f[i];
            bVar.f30623a.f30673f = bVar.f30624b;
        }
    }

    /* renamed from: s */
    public static C13711b m2908s(C13714d dVar, C13722h hVar, C13722h hVar2, float f) {
        return dVar.m2909r().m2948j(hVar, hVar2, f);
    }

    /* renamed from: u */
    private int m2906u(AbstractC13715a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f30648k) {
                z = false;
                break;
            }
            C13711b bVar = this.f30643f[i];
            if (bVar.f30623a.f30677j != C13722h.EnumC13723a.UNRESTRICTED && bVar.f30624b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            Metrics metrics = f30634r;
            if (metrics != null) {
                metrics.f2502k++;
            }
            i2++;
            float f2 = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.f30648k) {
                C13711b bVar2 = this.f30643f[i5];
                if (bVar2.f30623a.f30677j != C13722h.EnumC13723a.UNRESTRICTED && !bVar2.f30628f && bVar2.f30624b < f) {
                    int i7 = 1;
                    while (i7 < this.f30647j) {
                        C13722h hVar = this.f30650m.f30632d[i7];
                        float e = bVar2.f30627e.mo2875e(hVar);
                        if (e > f) {
                            for (int i8 = 0; i8 < 9; i8++) {
                                float f3 = hVar.f30675h[i8] / e;
                                if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                    i4 = i7;
                                    i6 = i8;
                                    f2 = f3;
                                    i3 = i5;
                                }
                            }
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i5++;
                f = 0.0f;
            }
            if (i3 != -1) {
                C13711b bVar3 = this.f30643f[i3];
                bVar3.f30623a.f30671d = -1;
                Metrics metrics2 = f30634r;
                if (metrics2 != null) {
                    metrics2.f2501j++;
                }
                bVar3.m2933y(this.f30650m.f30632d[i4]);
                C13722h hVar2 = bVar3.f30623a;
                hVar2.f30671d = i3;
                hVar2.m2880g(bVar3);
            } else {
                z2 = true;
            }
            if (i2 > this.f30647j / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: x */
    public static Metrics m2903x() {
        return f30634r;
    }

    /* renamed from: z */
    private void m2901z() {
        int i = this.f30641d * 2;
        this.f30641d = i;
        this.f30643f = (C13711b[]) Arrays.copyOf(this.f30643f, i);
        C13713c cVar = this.f30650m;
        cVar.f30632d = (C13722h[]) Arrays.copyOf(cVar.f30632d, this.f30641d);
        int i2 = this.f30641d;
        this.f30646i = new boolean[i2];
        this.f30642e = i2;
        this.f30649l = i2;
        Metrics metrics = f30634r;
        if (metrics != null) {
            metrics.f2495d++;
            metrics.f2506o = Math.max(metrics.f2506o, i2);
            Metrics metrics2 = f30634r;
            metrics2.f2516y = metrics2.f2506o;
        }
    }

    /* renamed from: A */
    public void m2931A() {
        Metrics metrics = f30634r;
        if (metrics != null) {
            metrics.f2496e++;
        }
        if (this.f30644g || this.f30645h) {
            if (metrics != null) {
                metrics.f2508q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f30648k) {
                    z = true;
                    break;
                } else if (!this.f30643f[i].f30628f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                m2930B(this.f30640c);
                return;
            }
            Metrics metrics2 = f30634r;
            if (metrics2 != null) {
                metrics2.f2507p++;
            }
            m2913n();
            return;
        }
        m2930B(this.f30640c);
    }

    /* renamed from: B */
    void m2930B(AbstractC13715a aVar) {
        Metrics metrics = f30634r;
        if (metrics != null) {
            metrics.f2511t++;
            metrics.f2512u = Math.max(metrics.f2512u, this.f30647j);
            Metrics metrics2 = f30634r;
            metrics2.f2513v = Math.max(metrics2.f2513v, this.f30648k);
        }
        m2906u(aVar);
        m2929C(aVar, false);
        m2913n();
    }

    /* renamed from: E */
    public void m2927E() {
        C13713c cVar;
        int i = 0;
        while (true) {
            cVar = this.f30650m;
            C13722h[] hVarArr = cVar.f30632d;
            if (i >= hVarArr.length) {
                break;
            }
            C13722h hVar = hVarArr[i];
            if (hVar != null) {
                hVar.m2883d();
            }
            i++;
        }
        cVar.f30631c.mo2899a(this.f30651n, this.f30652o);
        this.f30652o = 0;
        Arrays.fill(this.f30650m.f30632d, (Object) null);
        HashMap<String, C13722h> hashMap = this.f30639b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f30638a = 0;
        this.f30640c.clear();
        this.f30647j = 1;
        for (int i2 = 0; i2 < this.f30648k; i2++) {
            this.f30643f[i2].f30625c = false;
        }
        m2928D();
        this.f30648k = 0;
        if (f30635s) {
            this.f30653p = new C13716b(this.f30650m);
        } else {
            this.f30653p = new C13711b(this.f30650m);
        }
    }

    /* renamed from: b */
    public void m2925b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        C2125d.EnumC2127b bVar = C2125d.EnumC2127b.LEFT;
        C13722h q = m2910q(constraintWidget.mo38816k(bVar));
        C2125d.EnumC2127b bVar2 = C2125d.EnumC2127b.TOP;
        C13722h q2 = m2910q(constraintWidget.mo38816k(bVar2));
        C2125d.EnumC2127b bVar3 = C2125d.EnumC2127b.RIGHT;
        C13722h q3 = m2910q(constraintWidget.mo38816k(bVar3));
        C2125d.EnumC2127b bVar4 = C2125d.EnumC2127b.BOTTOM;
        C13722h q4 = m2910q(constraintWidget.mo38816k(bVar4));
        C13722h q5 = m2910q(constraintWidget2.mo38816k(bVar));
        C13722h q6 = m2910q(constraintWidget2.mo38816k(bVar2));
        C13722h q7 = m2910q(constraintWidget2.mo38816k(bVar3));
        C13722h q8 = m2910q(constraintWidget2.mo38816k(bVar4));
        C13711b r = m2909r();
        double d = f;
        double d2 = i;
        r.m2941q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        m2923d(r);
        C13711b r2 = m2909r();
        r2.m2941q(q, q3, q5, q7, (float) (Math.cos(d) * d2));
        m2923d(r2);
    }

    /* renamed from: c */
    public void m2924c(C13722h hVar, C13722h hVar2, int i, float f, C13722h hVar3, C13722h hVar4, int i2, int i3) {
        C13711b r = m2909r();
        r.m2950h(hVar, hVar2, i, f, hVar3, hVar4, i2);
        if (i3 != 8) {
            r.m2954d(this, i3);
        }
        m2923d(r);
    }

    /* renamed from: d */
    public void m2923d(C13711b bVar) {
        C13722h w;
        if (bVar != null) {
            Metrics metrics = f30634r;
            if (metrics != null) {
                metrics.f2497f++;
                if (bVar.f30628f) {
                    metrics.f2498g++;
                }
            }
            boolean z = true;
            if (this.f30648k + 1 >= this.f30649l || this.f30647j + 1 >= this.f30642e) {
                m2901z();
            }
            boolean z2 = false;
            if (!bVar.f30628f) {
                bVar.m2955D(this);
                if (!bVar.m2937u()) {
                    bVar.m2940r();
                    if (bVar.m2952f(this)) {
                        C13722h p = m2911p();
                        bVar.f30623a = p;
                        m2915l(bVar);
                        this.f30653p.mo2900a(bVar);
                        m2929C(this.f30653p, true);
                        if (p.f30671d == -1) {
                            if (bVar.f30623a == p && (w = bVar.m2935w(p)) != null) {
                                Metrics metrics2 = f30634r;
                                if (metrics2 != null) {
                                    metrics2.f2501j++;
                                }
                                bVar.m2933y(w);
                            }
                            if (!bVar.f30628f) {
                                bVar.f30623a.m2880g(bVar);
                            }
                            this.f30648k--;
                        }
                    } else {
                        z = false;
                    }
                    if (bVar.m2939s()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                m2915l(bVar);
            }
        }
    }

    /* renamed from: e */
    public C13711b m2922e(C13722h hVar, C13722h hVar2, int i, int i2) {
        if (i2 == 8 && hVar2.f30674g && hVar.f30671d == -1) {
            hVar.m2882e(this, hVar2.f30673f + i);
            return null;
        }
        C13711b r = m2909r();
        r.m2944n(hVar, hVar2, i);
        if (i2 != 8) {
            r.m2954d(this, i2);
        }
        m2923d(r);
        return r;
    }

    /* renamed from: f */
    public void m2921f(C13722h hVar, int i) {
        int i2 = hVar.f30671d;
        if (i2 == -1) {
            hVar.m2882e(this, i);
        } else if (i2 != -1) {
            C13711b bVar = this.f30643f[i2];
            if (bVar.f30628f) {
                bVar.f30624b = i;
            } else if (bVar.f30627e.mo2876d() == 0) {
                bVar.f30628f = true;
                bVar.f30624b = i;
            } else {
                C13711b r = m2909r();
                r.m2945m(hVar, i);
                m2923d(r);
            }
        } else {
            C13711b r2 = m2909r();
            r2.m2949i(hVar, i);
            m2923d(r2);
        }
    }

    /* renamed from: g */
    public void m2920g(C13722h hVar, C13722h hVar2, int i, boolean z) {
        C13711b r = m2909r();
        C13722h t = m2907t();
        t.f30672e = 0;
        r.m2943o(hVar, hVar2, t, i);
        m2923d(r);
    }

    /* renamed from: h */
    public void m2919h(C13722h hVar, C13722h hVar2, int i, int i2) {
        C13711b r = m2909r();
        C13722h t = m2907t();
        t.f30672e = 0;
        r.m2943o(hVar, hVar2, t, i);
        if (i2 != 8) {
            m2914m(r, (int) (r.f30627e.mo2875e(t) * (-1.0f)), i2);
        }
        m2923d(r);
    }

    /* renamed from: i */
    public void m2918i(C13722h hVar, C13722h hVar2, int i, boolean z) {
        C13711b r = m2909r();
        C13722h t = m2907t();
        t.f30672e = 0;
        r.m2942p(hVar, hVar2, t, i);
        m2923d(r);
    }

    /* renamed from: j */
    public void m2917j(C13722h hVar, C13722h hVar2, int i, int i2) {
        C13711b r = m2909r();
        C13722h t = m2907t();
        t.f30672e = 0;
        r.m2942p(hVar, hVar2, t, i);
        if (i2 != 8) {
            m2914m(r, (int) (r.f30627e.mo2875e(t) * (-1.0f)), i2);
        }
        m2923d(r);
    }

    /* renamed from: k */
    public void m2916k(C13722h hVar, C13722h hVar2, C13722h hVar3, C13722h hVar4, float f, int i) {
        C13711b r = m2909r();
        r.m2947k(hVar, hVar2, hVar3, hVar4, f);
        if (i != 8) {
            r.m2954d(this, i);
        }
        m2923d(r);
    }

    /* renamed from: m */
    void m2914m(C13711b bVar, int i, int i2) {
        bVar.m2953e(m2912o(i2, null), i);
    }

    /* renamed from: o */
    public C13722h m2912o(int i, String str) {
        Metrics metrics = f30634r;
        if (metrics != null) {
            metrics.f2503l++;
        }
        if (this.f30647j + 1 >= this.f30642e) {
            m2901z();
        }
        C13722h a = m2926a(C13722h.EnumC13723a.ERROR, str);
        int i2 = this.f30638a + 1;
        this.f30638a = i2;
        this.f30647j++;
        a.f30670c = i2;
        a.f30672e = i;
        this.f30650m.f30632d[i2] = a;
        this.f30640c.mo2893c(a);
        return a;
    }

    /* renamed from: p */
    public C13722h m2911p() {
        Metrics metrics = f30634r;
        if (metrics != null) {
            metrics.f2505n++;
        }
        if (this.f30647j + 1 >= this.f30642e) {
            m2901z();
        }
        C13722h a = m2926a(C13722h.EnumC13723a.SLACK, null);
        int i = this.f30638a + 1;
        this.f30638a = i;
        this.f30647j++;
        a.f30670c = i;
        this.f30650m.f30632d[i] = a;
        return a;
    }

    /* renamed from: q */
    public C13722h m2910q(Object obj) {
        C13722h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f30647j + 1 >= this.f30642e) {
            m2901z();
        }
        if (obj instanceof C2125d) {
            C2125d dVar = (C2125d) obj;
            hVar = dVar.m38835e();
            if (hVar == null) {
                dVar.m38828l(this.f30650m);
                hVar = dVar.m38835e();
            }
            int i = hVar.f30670c;
            if (i == -1 || i > this.f30638a || this.f30650m.f30632d[i] == null) {
                if (i != -1) {
                    hVar.m2883d();
                }
                int i2 = this.f30638a + 1;
                this.f30638a = i2;
                this.f30647j++;
                hVar.f30670c = i2;
                hVar.f30677j = C13722h.EnumC13723a.UNRESTRICTED;
                this.f30650m.f30632d[i2] = hVar;
            }
        }
        return hVar;
    }

    /* renamed from: r */
    public C13711b m2909r() {
        C13711b bVar;
        if (f30635s) {
            bVar = this.f30650m.f30629a.acquire();
            if (bVar == null) {
                bVar = new C13716b(this.f30650m);
                f30637u++;
            } else {
                bVar.m2932z();
            }
        } else {
            bVar = this.f30650m.f30630b.acquire();
            if (bVar == null) {
                bVar = new C13711b(this.f30650m);
                f30636t++;
            } else {
                bVar.m2932z();
            }
        }
        C13722h.m2885b();
        return bVar;
    }

    /* renamed from: t */
    public C13722h m2907t() {
        Metrics metrics = f30634r;
        if (metrics != null) {
            metrics.f2504m++;
        }
        if (this.f30647j + 1 >= this.f30642e) {
            m2901z();
        }
        C13722h a = m2926a(C13722h.EnumC13723a.SLACK, null);
        int i = this.f30638a + 1;
        this.f30638a = i;
        this.f30647j++;
        a.f30670c = i;
        this.f30650m.f30632d[i] = a;
        return a;
    }

    /* renamed from: v */
    public void m2905v(Metrics metrics) {
        f30634r = metrics;
    }

    /* renamed from: w */
    public C13713c m2904w() {
        return this.f30650m;
    }

    /* renamed from: y */
    public int m2902y(Object obj) {
        C13722h e = ((C2125d) obj).m38835e();
        if (e != null) {
            return (int) (e.f30673f + 0.5f);
        }
        return 0;
    }
}
