package p391w0;

import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import p391w0.C13711b;

/* renamed from: w0.i */
/* loaded from: classes.dex */
public class C13724i implements C13711b.AbstractC13712a {

    /* renamed from: n */
    private static float f30688n = 0.001f;

    /* renamed from: a */
    private final int f30689a = -1;

    /* renamed from: b */
    private int f30690b = 16;

    /* renamed from: c */
    private int f30691c = 16;

    /* renamed from: d */
    int[] f30692d = new int[16];

    /* renamed from: e */
    int[] f30693e = new int[16];

    /* renamed from: f */
    int[] f30694f = new int[16];

    /* renamed from: g */
    float[] f30695g = new float[16];

    /* renamed from: h */
    int[] f30696h = new int[16];

    /* renamed from: i */
    int[] f30697i = new int[16];

    /* renamed from: j */
    int f30698j = 0;

    /* renamed from: k */
    int f30699k = -1;

    /* renamed from: l */
    private final C13711b f30700l;

    /* renamed from: m */
    protected final C13713c f30701m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13724i(C13711b bVar, C13713c cVar) {
        this.f30700l = bVar;
        this.f30701m = cVar;
        clear();
    }

    /* renamed from: l */
    private void m2868l(C13722h hVar, int i) {
        int[] iArr;
        int i2 = hVar.f30670c % this.f30691c;
        int[] iArr2 = this.f30692d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f30693e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f30693e[i] = -1;
    }

    /* renamed from: m */
    private void m2867m(int i, C13722h hVar, float f) {
        this.f30694f[i] = hVar.f30670c;
        this.f30695g[i] = f;
        this.f30696h[i] = -1;
        this.f30697i[i] = -1;
        hVar.m2886a(this.f30700l);
        hVar.f30680m++;
        this.f30698j++;
    }

    /* renamed from: n */
    private int m2866n() {
        for (int i = 0; i < this.f30690b; i++) {
            if (this.f30694f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m2865o() {
        int i = this.f30690b * 2;
        this.f30694f = Arrays.copyOf(this.f30694f, i);
        this.f30695g = Arrays.copyOf(this.f30695g, i);
        this.f30696h = Arrays.copyOf(this.f30696h, i);
        this.f30697i = Arrays.copyOf(this.f30697i, i);
        this.f30693e = Arrays.copyOf(this.f30693e, i);
        for (int i2 = this.f30690b; i2 < i; i2++) {
            this.f30694f[i2] = -1;
            this.f30693e[i2] = -1;
        }
        this.f30690b = i;
    }

    /* renamed from: q */
    private void m2863q(int i, C13722h hVar, float f) {
        int n = m2866n();
        m2867m(n, hVar, f);
        if (i != -1) {
            this.f30696h[n] = i;
            int[] iArr = this.f30697i;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f30696h[n] = -1;
            if (this.f30698j > 0) {
                this.f30697i[n] = this.f30699k;
                this.f30699k = n;
            } else {
                this.f30697i[n] = -1;
            }
        }
        int i2 = this.f30697i[n];
        if (i2 != -1) {
            this.f30696h[i2] = n;
        }
        m2868l(hVar, n);
    }

    /* renamed from: r */
    private void m2862r(C13722h hVar) {
        int[] iArr;
        int i;
        int i2 = hVar.f30670c;
        int i3 = i2 % this.f30691c;
        int[] iArr2 = this.f30692d;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.f30694f[i4] == i2) {
                int[] iArr3 = this.f30693e;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
                return;
            }
            while (true) {
                iArr = this.f30693e;
                i = iArr[i4];
                if (i == -1 || this.f30694f[i] == i2) {
                    break;
                }
                i4 = i;
            }
            if (i != -1 && this.f30694f[i] == i2) {
                iArr[i4] = iArr[i];
                iArr[i] = -1;
            }
        }
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: a */
    public void mo2879a(C13722h hVar, float f, boolean z) {
        float f2 = f30688n;
        if (f <= (-f2) || f >= f2) {
            int p = m2864p(hVar);
            if (p == -1) {
                mo2871i(hVar, f);
                return;
            }
            float[] fArr = this.f30695g;
            float f3 = fArr[p] + f;
            fArr[p] = f3;
            float f4 = f30688n;
            if (f3 > (-f4) && f3 < f4) {
                fArr[p] = 0.0f;
                mo2874f(hVar, z);
            }
        }
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: b */
    public C13722h mo2878b(int i) {
        int i2 = this.f30698j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f30699k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f30701m.f30632d[this.f30694f[i3]];
            }
            i3 = this.f30697i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: c */
    public void mo2877c() {
        int i = this.f30698j;
        int i2 = this.f30699k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f30695g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f30697i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p391w0.C13711b.AbstractC13712a
    public void clear() {
        int i = this.f30698j;
        for (int i2 = 0; i2 < i; i2++) {
            C13722h b = mo2878b(i2);
            if (b != null) {
                b.m2884c(this.f30700l);
            }
        }
        for (int i3 = 0; i3 < this.f30690b; i3++) {
            this.f30694f[i3] = -1;
            this.f30693e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f30691c; i4++) {
            this.f30692d[i4] = -1;
        }
        this.f30698j = 0;
        this.f30699k = -1;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: d */
    public int mo2876d() {
        return this.f30698j;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: e */
    public float mo2875e(C13722h hVar) {
        int p = m2864p(hVar);
        if (p != -1) {
            return this.f30695g[p];
        }
        return 0.0f;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: f */
    public float mo2874f(C13722h hVar, boolean z) {
        int p = m2864p(hVar);
        if (p == -1) {
            return 0.0f;
        }
        m2862r(hVar);
        float f = this.f30695g[p];
        if (this.f30699k == p) {
            this.f30699k = this.f30697i[p];
        }
        this.f30694f[p] = -1;
        int[] iArr = this.f30696h;
        int i = iArr[p];
        if (i != -1) {
            int[] iArr2 = this.f30697i;
            iArr2[i] = iArr2[p];
        }
        int i2 = this.f30697i[p];
        if (i2 != -1) {
            iArr[i2] = iArr[p];
        }
        this.f30698j--;
        hVar.f30680m--;
        if (z) {
            hVar.m2884c(this.f30700l);
        }
        return f;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: g */
    public float mo2873g(C13711b bVar, boolean z) {
        float e = mo2875e(bVar.f30623a);
        mo2874f(bVar.f30623a, z);
        C13724i iVar = (C13724i) bVar.f30627e;
        int d = iVar.mo2876d();
        int i = 0;
        int i2 = 0;
        while (i < d) {
            int i3 = iVar.f30694f[i2];
            if (i3 != -1) {
                mo2879a(this.f30701m.f30632d[i3], iVar.f30695g[i2] * e, z);
                i++;
            }
            i2++;
        }
        return e;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: h */
    public float mo2872h(int i) {
        int i2 = this.f30698j;
        int i3 = this.f30699k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f30695g[i3];
            }
            i3 = this.f30697i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: i */
    public void mo2871i(C13722h hVar, float f) {
        float f2 = f30688n;
        if (f <= (-f2) || f >= f2) {
            if (this.f30698j == 0) {
                m2867m(0, hVar, f);
                m2868l(hVar, 0);
                this.f30699k = 0;
                return;
            }
            int p = m2864p(hVar);
            if (p != -1) {
                this.f30695g[p] = f;
                return;
            }
            if (this.f30698j + 1 >= this.f30690b) {
                m2865o();
            }
            int i = this.f30698j;
            int i2 = this.f30699k;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = this.f30694f[i2];
                int i6 = hVar.f30670c;
                if (i5 == i6) {
                    this.f30695g[i2] = f;
                    return;
                }
                if (i5 < i6) {
                    i3 = i2;
                }
                i2 = this.f30697i[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m2863q(i3, hVar, f);
            return;
        }
        mo2874f(hVar, true);
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: j */
    public boolean mo2870j(C13722h hVar) {
        return m2864p(hVar) != -1;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: k */
    public void mo2869k(float f) {
        int i = this.f30698j;
        int i2 = this.f30699k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f30695g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f30697i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    /* renamed from: p */
    public int m2864p(C13722h hVar) {
        if (this.f30698j == 0) {
            return -1;
        }
        int i = hVar.f30670c;
        int i2 = this.f30692d[i % this.f30691c];
        if (i2 == -1) {
            return -1;
        }
        if (this.f30694f[i2] == i) {
            return i2;
        }
        do {
            i2 = this.f30693e[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f30694f[i2] != i);
        if (i2 != -1 && this.f30694f[i2] == i) {
            return i2;
        }
        return -1;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f30698j;
        for (int i2 = 0; i2 < i; i2++) {
            C13722h b = mo2878b(i2);
            if (b != null) {
                String str4 = str3 + b + " = " + mo2872h(i2) + " ";
                int p = m2864p(b);
                String str5 = str4 + "[p: ";
                if (this.f30696h[p] != -1) {
                    str = str5 + this.f30701m.f30632d[this.f30694f[this.f30696h[p]]];
                } else {
                    str = str5 + ViewProps.NONE;
                }
                String str6 = str + ", n: ";
                if (this.f30697i[p] != -1) {
                    str2 = str6 + this.f30701m.f30632d[this.f30694f[this.f30697i[p]]];
                } else {
                    str2 = str6 + ViewProps.NONE;
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
