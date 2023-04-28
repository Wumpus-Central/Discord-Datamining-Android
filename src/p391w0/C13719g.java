package p391w0;

import java.util.Arrays;
import java.util.Comparator;
import p391w0.C13711b;

/* renamed from: w0.g */
/* loaded from: classes.dex */
public class C13719g extends C13711b {

    /* renamed from: g */
    private int f30657g = 128;

    /* renamed from: h */
    private C13722h[] f30658h = new C13722h[128];

    /* renamed from: i */
    private C13722h[] f30659i = new C13722h[128];

    /* renamed from: j */
    private int f30660j = 0;

    /* renamed from: k */
    C13721b f30661k = new C13721b(this);

    /* renamed from: l */
    C13713c f30662l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0.g$a */
    /* loaded from: classes.dex */
    public class C13720a implements Comparator<C13722h> {
        C13720a() {
        }

        /* renamed from: b */
        public int compare(C13722h hVar, C13722h hVar2) {
            return hVar.f30670c - hVar2.f30670c;
        }
    }

    /* renamed from: w0.g$b */
    /* loaded from: classes.dex */
    class C13721b implements Comparable {

        /* renamed from: k */
        C13722h f30664k;

        /* renamed from: l */
        C13719g f30665l;

        public C13721b(C13719g gVar) {
            this.f30665l = gVar;
        }

        /* renamed from: a */
        public boolean m2891a(C13722h hVar, float f) {
            boolean z = true;
            if (this.f30664k.f30668a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f30664k.f30676i;
                    float f2 = fArr[i] + (hVar.f30676i[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.f30664k.f30676i[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C13719g.this.m2895G(this.f30664k);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = hVar.f30676i[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.f30664k.f30676i[i2] = f4;
                } else {
                    this.f30664k.f30676i[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void m2890b(C13722h hVar) {
            this.f30664k = hVar;
        }

        /* renamed from: c */
        public final boolean m2889c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f30664k.f30676i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f30664k.f30670c - ((C13722h) obj).f30670c;
        }

        /* renamed from: d */
        public final boolean m2888d(C13722h hVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = hVar.f30676i[i];
                float f2 = this.f30664k.f30676i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m2887e() {
            Arrays.fill(this.f30664k.f30676i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f30664k != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f30664k.f30676i[i] + " ";
                }
            }
            return str + "] " + this.f30664k;
        }
    }

    public C13719g(C13713c cVar) {
        super(cVar);
        this.f30662l = cVar;
    }

    /* renamed from: F */
    private final void m2896F(C13722h hVar) {
        int i;
        int i2 = this.f30660j + 1;
        C13722h[] hVarArr = this.f30658h;
        if (i2 > hVarArr.length) {
            C13722h[] hVarArr2 = (C13722h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f30658h = hVarArr2;
            this.f30659i = (C13722h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        C13722h[] hVarArr3 = this.f30658h;
        int i3 = this.f30660j;
        hVarArr3[i3] = hVar;
        int i4 = i3 + 1;
        this.f30660j = i4;
        if (i4 > 1 && hVarArr3[i4 - 1].f30670c > hVar.f30670c) {
            int i5 = 0;
            while (true) {
                i = this.f30660j;
                if (i5 >= i) {
                    break;
                }
                this.f30659i[i5] = this.f30658h[i5];
                i5++;
            }
            Arrays.sort(this.f30659i, 0, i, new C13720a());
            for (int i6 = 0; i6 < this.f30660j; i6++) {
                this.f30658h[i6] = this.f30659i[i6];
            }
        }
        hVar.f30668a = true;
        hVar.m2886a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5.f30660j = r2 - 1;
        r6.f30668a = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r5.f30660j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 >= (r2 - 1)) goto L_0x001c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r5.f30658h;
        r3 = r1 + 1;
        r2[r1] = r2[r3];
        r1 = r3;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2895G(p391w0.C13722h r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r5.f30660j
            if (r1 >= r2) goto L_0x0026
            w0.h[] r2 = r5.f30658h
            r2 = r2[r1]
            if (r2 != r6) goto L_0x0023
        L_0x000c:
            int r2 = r5.f30660j
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L_0x001c
            w0.h[] r2 = r5.f30658h
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto L_0x000c
        L_0x001c:
            int r2 = r2 + (-1)
            r5.f30660j = r2
            r6.f30668a = r0
            return
        L_0x0023:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p391w0.C13719g.m2895G(w0.h):void");
    }

    @Override // p391w0.C13711b
    /* renamed from: C */
    public void mo2898C(C13711b bVar, boolean z) {
        C13722h hVar = bVar.f30623a;
        if (hVar != null) {
            C13711b.AbstractC13712a aVar = bVar.f30627e;
            int d = aVar.mo2876d();
            for (int i = 0; i < d; i++) {
                C13722h b = aVar.mo2878b(i);
                float h = aVar.mo2872h(i);
                this.f30661k.m2890b(b);
                if (this.f30661k.m2891a(hVar, h)) {
                    m2896F(b);
                }
                this.f30624b += bVar.f30624b * h;
            }
            m2895G(hVar);
        }
    }

    @Override // p391w0.C13711b, p391w0.C13714d.AbstractC13715a
    /* renamed from: b */
    public C13722h mo2894b(C13714d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f30660j; i2++) {
            C13722h hVar = this.f30658h[i2];
            if (!zArr[hVar.f30670c]) {
                this.f30661k.m2890b(hVar);
                if (i == -1) {
                    if (!this.f30661k.m2889c()) {
                    }
                    i = i2;
                } else {
                    if (!this.f30661k.m2888d(this.f30658h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f30658h[i];
    }

    @Override // p391w0.C13711b, p391w0.C13714d.AbstractC13715a
    /* renamed from: c */
    public void mo2893c(C13722h hVar) {
        this.f30661k.m2890b(hVar);
        this.f30661k.m2887e();
        hVar.f30676i[hVar.f30672e] = 1.0f;
        m2896F(hVar);
    }

    @Override // p391w0.C13711b, p391w0.C13714d.AbstractC13715a
    public void clear() {
        this.f30660j = 0;
        this.f30624b = 0.0f;
    }

    @Override // p391w0.C13711b
    public String toString() {
        String str = " goal -> (" + this.f30624b + ") : ";
        for (int i = 0; i < this.f30660j; i++) {
            this.f30661k.m2890b(this.f30658h[i]);
            str = str + this.f30661k + " ";
        }
        return str;
    }
}
