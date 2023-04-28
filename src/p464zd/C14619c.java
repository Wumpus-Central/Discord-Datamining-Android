package p464zd;

import id.C8388a;
import java.util.Map;
import p066dd.AbstractC6447p;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6436e;
import p137hd.AbstractC8004i;
import p137hd.C7997b;
import p137hd.C8002g;
import p137hd.C8006k;
import p445yd.C14363j;

/* renamed from: zd.c */
/* loaded from: classes3.dex */
public class C14619c {

    /* renamed from: a */
    private final C7997b f33096a;

    /* renamed from: b */
    private AbstractC6447p f33097b;

    public C14619c(C7997b bVar) {
        this.f33096a = bVar;
    }

    /* renamed from: b */
    private float m113b(C6446o oVar, C6446o oVar2) {
        float j = m105j((int) oVar.m25545c(), (int) oVar.m25544d(), (int) oVar2.m25545c(), (int) oVar2.m25544d());
        float j2 = m105j((int) oVar2.m25545c(), (int) oVar2.m25544d(), (int) oVar.m25545c(), (int) oVar.m25544d());
        if (Float.isNaN(j)) {
            return j2 / 7.0f;
        }
        if (Float.isNaN(j2)) {
            return j / 7.0f;
        }
        return (j + j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m112c(C6446o oVar, C6446o oVar2, C6446o oVar3, float f) {
        int c = ((C8388a.m19876c(C6446o.m25546b(oVar, oVar2) / f) + C8388a.m19876c(C6446o.m25546b(oVar, oVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: d */
    private static C8006k m111d(C6446o oVar, C6446o oVar2, C6446o oVar3, C6446o oVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = i - 3.5f;
        if (oVar4 != null) {
            f2 = oVar4.m25545c();
            f = oVar4.m25544d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (oVar2.m25545c() - oVar.m25545c()) + oVar3.m25545c();
            f = (oVar2.m25544d() - oVar.m25544d()) + oVar3.m25544d();
            f3 = f4;
        }
        return C8006k.m20877b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, oVar.m25545c(), oVar.m25544d(), oVar2.m25545c(), oVar2.m25544d(), f2, f, oVar3.m25545c(), oVar3.m25544d());
    }

    /* renamed from: h */
    private static C7997b m107h(C7997b bVar, C8006k kVar, int i) {
        return AbstractC8004i.m20887b().mo20885d(bVar, i, i, kVar);
    }

    /* renamed from: i */
    private float m106i(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        C14619c cVar;
        boolean z3;
        boolean z4 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i8 < i6) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i7 < i5) {
            i16 = 1;
        }
        int i17 = i6 + i9;
        int i18 = i8;
        int i19 = i7;
        int i20 = 0;
        while (true) {
            if (i18 == i17) {
                i10 = i17;
                i11 = i14;
                break;
            }
            if (z) {
                i12 = i19;
            } else {
                i12 = i18;
            }
            if (z) {
                i13 = i18;
            } else {
                i13 = i19;
            }
            if (i20 == z4) {
                z2 = z;
                z3 = z4;
                i10 = i17;
                cVar = this;
            } else {
                cVar = this;
                z2 = z;
                i10 = i17;
                z3 = false;
            }
            if (z3 == cVar.f33096a.m20923e(i12, i13)) {
                if (i20 == 2) {
                    return C8388a.m19877b(i18, i19, i8, i7);
                }
                i20++;
            }
            i15 += abs2;
            if (i15 > 0) {
                if (i19 == i5) {
                    i11 = 2;
                    break;
                }
                i19 += i16;
                i15 -= abs;
            }
            i18 += i9;
            i17 = i10;
            z = z2;
            z4 = true;
            i14 = 2;
        }
        if (i20 == i11) {
            return C8388a.m19877b(i10, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m105j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m106i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = i / (i - i6);
            i6 = 0;
        } else if (i6 >= this.f33096a.m20917m()) {
            f = ((this.f33096a.m20917m() - 1) - i) / (i6 - i);
            i6 = this.f33096a.m20917m() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i8 = (int) (f3 - ((i4 - i2) * f));
        if (i8 < 0) {
            f2 = f3 / (i2 - i8);
        } else if (i8 >= this.f33096a.m20920j()) {
            f2 = ((this.f33096a.m20920j() - 1) - i2) / (i8 - i2);
            i7 = this.f33096a.m20920j() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m106i(i, i2, (int) (i + ((i6 - i) * f2)), i7)) - 1.0f;
    }

    /* renamed from: a */
    protected final float m114a(C6446o oVar, C6446o oVar2, C6446o oVar3) {
        return (m113b(oVar, oVar2) + m113b(oVar, oVar3)) / 2.0f;
    }

    /* renamed from: e */
    public final C8002g m110e(Map<EnumC6436e, ?> map) {
        AbstractC6447p pVar;
        if (map == null) {
            pVar = null;
        } else {
            pVar = (AbstractC6447p) map.get(EnumC6436e.NEED_RESULT_POINT_CALLBACK);
        }
        this.f33097b = pVar;
        return m108g(new C14621e(this.f33096a, pVar).m95f(map));
    }

    /* renamed from: f */
    protected final C14617a m109f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f33096a.m20917m() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f33096a.m20920j() - 1, i2 + i3) - max2;
            if (min2 >= f3) {
                return new C14618b(this.f33096a, max, max2, min, min2, f, this.f33097b).m117c();
            }
            throw C6441j.m25551a();
        }
        throw C6441j.m25551a();
    }

    /* renamed from: g */
    protected final C8002g m108g(C14625f fVar) {
        C14617a aVar;
        C14620d b = fVar.m83b();
        C14620d c = fVar.m82c();
        C14620d a = fVar.m84a();
        float a2 = m114a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m112c(b, c, a, a2);
            C14363j g = C14363j.m772g(c2);
            int e = g.m774e() - 7;
            if (g.m775d().length > 0) {
                float c3 = (c.m25545c() - b.m25545c()) + a.m25545c();
                float d = (c.m25544d() - b.m25544d()) + a.m25544d();
                float f = 1.0f - (3.0f / e);
                int c4 = (int) (b.m25545c() + ((c3 - b.m25545c()) * f));
                int d2 = (int) (b.m25544d() + (f * (d - b.m25544d())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        aVar = m109f(a2, c4, d2, i);
                        break;
                    } catch (C6441j unused) {
                    }
                }
            }
            aVar = null;
            return new C8002g(m107h(this.f33096a, m111d(b, c, a, aVar, c2), c2), aVar == null ? new C6446o[]{a, b, c} : new C6446o[]{a, b, c, aVar});
        }
        throw C6441j.m25551a();
    }
}
