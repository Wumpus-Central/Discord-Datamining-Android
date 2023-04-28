package p391w0;

import java.util.Arrays;
import p391w0.C13711b;

/* renamed from: w0.a */
/* loaded from: classes.dex */
public class C13710a implements C13711b.AbstractC13712a {

    /* renamed from: l */
    private static float f30611l = 0.001f;

    /* renamed from: b */
    private final C13711b f30613b;

    /* renamed from: c */
    protected final C13713c f30614c;

    /* renamed from: a */
    int f30612a = 0;

    /* renamed from: d */
    private int f30615d = 8;

    /* renamed from: e */
    private C13722h f30616e = null;

    /* renamed from: f */
    private int[] f30617f = new int[8];

    /* renamed from: g */
    private int[] f30618g = new int[8];

    /* renamed from: h */
    private float[] f30619h = new float[8];

    /* renamed from: i */
    private int f30620i = -1;

    /* renamed from: j */
    private int f30621j = -1;

    /* renamed from: k */
    private boolean f30622k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13710a(C13711b bVar, C13713c cVar) {
        this.f30613b = bVar;
        this.f30614c = cVar;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: a */
    public void mo2879a(C13722h hVar, float f, boolean z) {
        float f2 = f30611l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f30620i;
            if (i == -1) {
                this.f30620i = 0;
                this.f30619h[0] = f;
                this.f30617f[0] = hVar.f30670c;
                this.f30618g[0] = -1;
                hVar.f30680m++;
                hVar.m2886a(this.f30613b);
                this.f30612a++;
                if (!this.f30622k) {
                    int i2 = this.f30621j + 1;
                    this.f30621j = i2;
                    int[] iArr = this.f30617f;
                    if (i2 >= iArr.length) {
                        this.f30622k = true;
                        this.f30621j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f30612a; i4++) {
                int i5 = this.f30617f[i];
                int i6 = hVar.f30670c;
                if (i5 == i6) {
                    float[] fArr = this.f30619h;
                    float f3 = fArr[i] + f;
                    float f4 = f30611l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f30620i) {
                            this.f30620i = this.f30618g[i];
                        } else {
                            int[] iArr2 = this.f30618g;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            hVar.m2884c(this.f30613b);
                        }
                        if (this.f30622k) {
                            this.f30621j = i;
                        }
                        hVar.f30680m--;
                        this.f30612a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f30618g[i];
            }
            int i7 = this.f30621j;
            int i8 = i7 + 1;
            if (this.f30622k) {
                int[] iArr3 = this.f30617f;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f30617f;
            if (i7 >= iArr4.length && this.f30612a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f30617f;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f30617f;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f30615d * 2;
                this.f30615d = i10;
                this.f30622k = false;
                this.f30621j = i7 - 1;
                this.f30619h = Arrays.copyOf(this.f30619h, i10);
                this.f30617f = Arrays.copyOf(this.f30617f, this.f30615d);
                this.f30618g = Arrays.copyOf(this.f30618g, this.f30615d);
            }
            this.f30617f[i7] = hVar.f30670c;
            this.f30619h[i7] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f30618g;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f30618g[i7] = this.f30620i;
                this.f30620i = i7;
            }
            hVar.f30680m++;
            hVar.m2886a(this.f30613b);
            this.f30612a++;
            if (!this.f30622k) {
                this.f30621j++;
            }
            int i11 = this.f30621j;
            int[] iArr8 = this.f30617f;
            if (i11 >= iArr8.length) {
                this.f30622k = true;
                this.f30621j = iArr8.length - 1;
            }
        }
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: b */
    public C13722h mo2878b(int i) {
        int i2 = this.f30620i;
        for (int i3 = 0; i2 != -1 && i3 < this.f30612a; i3++) {
            if (i3 == i) {
                return this.f30614c.f30632d[this.f30617f[i2]];
            }
            i2 = this.f30618g[i2];
        }
        return null;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: c */
    public void mo2877c() {
        int i = this.f30620i;
        for (int i2 = 0; i != -1 && i2 < this.f30612a; i2++) {
            float[] fArr = this.f30619h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f30618g[i];
        }
    }

    @Override // p391w0.C13711b.AbstractC13712a
    public final void clear() {
        int i = this.f30620i;
        for (int i2 = 0; i != -1 && i2 < this.f30612a; i2++) {
            C13722h hVar = this.f30614c.f30632d[this.f30617f[i]];
            if (hVar != null) {
                hVar.m2884c(this.f30613b);
            }
            i = this.f30618g[i];
        }
        this.f30620i = -1;
        this.f30621j = -1;
        this.f30622k = false;
        this.f30612a = 0;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: d */
    public int mo2876d() {
        return this.f30612a;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: e */
    public final float mo2875e(C13722h hVar) {
        int i = this.f30620i;
        for (int i2 = 0; i != -1 && i2 < this.f30612a; i2++) {
            if (this.f30617f[i] == hVar.f30670c) {
                return this.f30619h[i];
            }
            i = this.f30618g[i];
        }
        return 0.0f;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: f */
    public final float mo2874f(C13722h hVar, boolean z) {
        if (this.f30616e == hVar) {
            this.f30616e = null;
        }
        int i = this.f30620i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f30612a) {
            if (this.f30617f[i] == hVar.f30670c) {
                if (i == this.f30620i) {
                    this.f30620i = this.f30618g[i];
                } else {
                    int[] iArr = this.f30618g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    hVar.m2884c(this.f30613b);
                }
                hVar.f30680m--;
                this.f30612a--;
                this.f30617f[i] = -1;
                if (this.f30622k) {
                    this.f30621j = i;
                }
                return this.f30619h[i];
            }
            i2++;
            i3 = i;
            i = this.f30618g[i];
        }
        return 0.0f;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: g */
    public float mo2873g(C13711b bVar, boolean z) {
        float e = mo2875e(bVar.f30623a);
        mo2874f(bVar.f30623a, z);
        C13711b.AbstractC13712a aVar = bVar.f30627e;
        int d = aVar.mo2876d();
        for (int i = 0; i < d; i++) {
            C13722h b = aVar.mo2878b(i);
            mo2879a(b, aVar.mo2875e(b) * e, z);
        }
        return e;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: h */
    public float mo2872h(int i) {
        int i2 = this.f30620i;
        for (int i3 = 0; i2 != -1 && i3 < this.f30612a; i3++) {
            if (i3 == i) {
                return this.f30619h[i2];
            }
            i2 = this.f30618g[i2];
        }
        return 0.0f;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: i */
    public final void mo2871i(C13722h hVar, float f) {
        if (f == 0.0f) {
            mo2874f(hVar, true);
            return;
        }
        int i = this.f30620i;
        if (i == -1) {
            this.f30620i = 0;
            this.f30619h[0] = f;
            this.f30617f[0] = hVar.f30670c;
            this.f30618g[0] = -1;
            hVar.f30680m++;
            hVar.m2886a(this.f30613b);
            this.f30612a++;
            if (!this.f30622k) {
                int i2 = this.f30621j + 1;
                this.f30621j = i2;
                int[] iArr = this.f30617f;
                if (i2 >= iArr.length) {
                    this.f30622k = true;
                    this.f30621j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f30612a; i4++) {
            int i5 = this.f30617f[i];
            int i6 = hVar.f30670c;
            if (i5 == i6) {
                this.f30619h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f30618g[i];
        }
        int i7 = this.f30621j;
        int i8 = i7 + 1;
        if (this.f30622k) {
            int[] iArr2 = this.f30617f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f30617f;
        if (i7 >= iArr3.length && this.f30612a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f30617f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f30617f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f30615d * 2;
            this.f30615d = i10;
            this.f30622k = false;
            this.f30621j = i7 - 1;
            this.f30619h = Arrays.copyOf(this.f30619h, i10);
            this.f30617f = Arrays.copyOf(this.f30617f, this.f30615d);
            this.f30618g = Arrays.copyOf(this.f30618g, this.f30615d);
        }
        this.f30617f[i7] = hVar.f30670c;
        this.f30619h[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f30618g;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f30618g[i7] = this.f30620i;
            this.f30620i = i7;
        }
        hVar.f30680m++;
        hVar.m2886a(this.f30613b);
        int i11 = this.f30612a + 1;
        this.f30612a = i11;
        if (!this.f30622k) {
            this.f30621j++;
        }
        int[] iArr7 = this.f30617f;
        if (i11 >= iArr7.length) {
            this.f30622k = true;
        }
        if (this.f30621j >= iArr7.length) {
            this.f30622k = true;
            this.f30621j = iArr7.length - 1;
        }
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: j */
    public boolean mo2870j(C13722h hVar) {
        int i = this.f30620i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f30612a; i2++) {
            if (this.f30617f[i] == hVar.f30670c) {
                return true;
            }
            i = this.f30618g[i];
        }
        return false;
    }

    @Override // p391w0.C13711b.AbstractC13712a
    /* renamed from: k */
    public void mo2869k(float f) {
        int i = this.f30620i;
        for (int i2 = 0; i != -1 && i2 < this.f30612a; i2++) {
            float[] fArr = this.f30619h;
            fArr[i] = fArr[i] / f;
            i = this.f30618g[i];
        }
    }

    public String toString() {
        int i = this.f30620i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f30612a; i2++) {
            str = ((str + " -> ") + this.f30619h[i] + " : ") + this.f30614c.f30632d[this.f30617f[i]];
            i = this.f30618g[i];
        }
        return str;
    }
}
