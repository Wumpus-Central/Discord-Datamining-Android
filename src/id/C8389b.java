package id;

import p066dd.C6441j;
import p066dd.C6446o;
import p137hd.C7997b;

/* renamed from: id.b */
/* loaded from: classes3.dex */
public final class C8389b {

    /* renamed from: a */
    private final C7997b f18285a;

    /* renamed from: b */
    private final int f18286b;

    /* renamed from: c */
    private final int f18287c;

    /* renamed from: d */
    private final int f18288d;

    /* renamed from: e */
    private final int f18289e;

    /* renamed from: f */
    private final int f18290f;

    /* renamed from: g */
    private final int f18291g;

    public C8389b(C7997b bVar) {
        this(bVar, 10, bVar.m20917m() / 2, bVar.m20920j() / 2);
    }

    /* renamed from: a */
    private C6446o[] m19874a(C6446o oVar, C6446o oVar2, C6446o oVar3, C6446o oVar4) {
        float c = oVar.m25545c();
        float d = oVar.m25544d();
        float c2 = oVar2.m25545c();
        float d2 = oVar2.m25544d();
        float c3 = oVar3.m25545c();
        float d3 = oVar3.m25544d();
        float c4 = oVar4.m25545c();
        float d4 = oVar4.m25544d();
        return c < ((float) this.f18287c) / 2.0f ? new C6446o[]{new C6446o(c4 - 1.0f, d4 + 1.0f), new C6446o(c2 + 1.0f, d2 + 1.0f), new C6446o(c3 - 1.0f, d3 - 1.0f), new C6446o(c + 1.0f, d - 1.0f)} : new C6446o[]{new C6446o(c4 + 1.0f, d4 + 1.0f), new C6446o(c2 + 1.0f, d2 - 1.0f), new C6446o(c3 - 1.0f, d3 + 1.0f), new C6446o(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m19873b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f18285a.m20923e(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f18285a.m20923e(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C6446o m19871d(float f, float f2, float f3, float f4) {
        int c = C8388a.m19876c(C8388a.m19878a(f, f2, f3, f4));
        float f5 = c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = i;
            int c2 = C8388a.m19876c((f8 * f6) + f);
            int c3 = C8388a.m19876c((f8 * f7) + f2);
            if (this.f18285a.m20923e(c2, c3)) {
                return new C6446o(c2, c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C6446o[] m19872c() {
        int i = this.f18288d;
        int i2 = this.f18289e;
        int i3 = this.f18291g;
        int i4 = this.f18290f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean z9 = true;
            while (true) {
                if ((z9 || !z2) && i2 < this.f18287c) {
                    z9 = m19873b(i3, i4, i2, false);
                    if (z9) {
                        i2++;
                        z2 = true;
                        z8 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f18287c) {
                boolean z10 = true;
                while (true) {
                    if ((z10 || !z3) && i4 < this.f18286b) {
                        z10 = m19873b(i, i2, i4, true);
                        if (z10) {
                            i4++;
                            z3 = true;
                            z8 = true;
                        } else if (!z3) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f18286b) {
                    boolean z11 = true;
                    while (true) {
                        if ((z11 || !z4) && i >= 0) {
                            z11 = m19873b(i3, i4, i, false);
                            if (z11) {
                                i--;
                                z4 = true;
                                z8 = true;
                            } else if (!z4) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z7 = z8;
                        boolean z12 = true;
                        while (true) {
                            if ((z12 || !z6) && i3 >= 0) {
                                z12 = m19873b(i, i2, i3, true);
                                if (z12) {
                                    i3--;
                                    z7 = true;
                                    z6 = true;
                                } else if (!z6) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 >= 0) {
                            if (z7) {
                                z5 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z || !z5) {
            throw C6441j.m25551a();
        }
        int i5 = i2 - i;
        C6446o oVar = null;
        C6446o oVar2 = null;
        for (int i6 = 1; oVar2 == null && i6 < i5; i6++) {
            oVar2 = m19871d(i, i4 - i6, i + i6, i4);
        }
        if (oVar2 != null) {
            C6446o oVar3 = null;
            for (int i7 = 1; oVar3 == null && i7 < i5; i7++) {
                oVar3 = m19871d(i, i3 + i7, i + i7, i3);
            }
            if (oVar3 != null) {
                C6446o oVar4 = null;
                for (int i8 = 1; oVar4 == null && i8 < i5; i8++) {
                    oVar4 = m19871d(i2, i3 + i8, i2 - i8, i3);
                }
                if (oVar4 != null) {
                    for (int i9 = 1; oVar == null && i9 < i5; i9++) {
                        oVar = m19871d(i2, i4 - i9, i2 - i9, i4);
                    }
                    if (oVar != null) {
                        return m19874a(oVar, oVar2, oVar4, oVar3);
                    }
                    throw C6441j.m25551a();
                }
                throw C6441j.m25551a();
            }
            throw C6441j.m25551a();
        }
        throw C6441j.m25551a();
    }

    public C8389b(C7997b bVar, int i, int i2, int i3) {
        this.f18285a = bVar;
        int j = bVar.m20920j();
        this.f18286b = j;
        int m = bVar.m20917m();
        this.f18287c = m;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f18288d = i5;
        int i6 = i2 + i4;
        this.f18289e = i6;
        int i7 = i3 - i4;
        this.f18291g = i7;
        int i8 = i3 + i4;
        this.f18290f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= j || i6 >= m) {
            throw C6441j.m25551a();
        }
    }
}
