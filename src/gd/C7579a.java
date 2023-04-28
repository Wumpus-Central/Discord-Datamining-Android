package gd;

import id.C8388a;
import id.C8389b;
import p066dd.C6441j;
import p066dd.C6446o;
import p084ed.C6817a;
import p137hd.AbstractC8004i;
import p137hd.C7997b;
import p178jd.C9558a;
import p178jd.C9560c;
import p178jd.C9561d;

/* renamed from: gd.a */
/* loaded from: classes3.dex */
public final class C7579a {

    /* renamed from: g */
    private static final int[] f16436g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C7997b f16437a;

    /* renamed from: b */
    private boolean f16438b;

    /* renamed from: c */
    private int f16439c;

    /* renamed from: d */
    private int f16440d;

    /* renamed from: e */
    private int f16441e;

    /* renamed from: f */
    private int f16442f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gd.a$a */
    /* loaded from: classes3.dex */
    public static final class C0234a {

        /* renamed from: a */
        private final int f16443a;

        /* renamed from: b */
        private final int f16444b;

        C0234a(int i, int i2) {
            this.f16443a = i;
            this.f16444b = i2;
        }

        /* renamed from: a */
        int m21954a() {
            return this.f16443a;
        }

        /* renamed from: b */
        int m21953b() {
            return this.f16444b;
        }

        /* renamed from: c */
        C6446o m21952c() {
            return new C6446o(m21954a(), m21953b());
        }

        public String toString() {
            return "<" + this.f16443a + ' ' + this.f16444b + '>';
        }
    }

    public C7579a(C7997b bVar) {
        this.f16437a = bVar;
    }

    /* renamed from: b */
    private static float m21971b(C6446o oVar, C6446o oVar2) {
        return C8388a.m19878a(oVar.m25545c(), oVar.m25544d(), oVar2.m25545c(), oVar2.m25544d());
    }

    /* renamed from: c */
    private static float m21970c(C0234a aVar, C0234a aVar2) {
        return C8388a.m19877b(aVar.m21954a(), aVar.m21953b(), aVar2.m21954a(), aVar2.m21953b());
    }

    /* renamed from: d */
    private static C6446o[] m21969d(C6446o[] oVarArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float c = oVarArr[0].m25545c() - oVarArr[2].m25545c();
        float d = oVarArr[0].m25544d() - oVarArr[2].m25544d();
        float c2 = (oVarArr[0].m25545c() + oVarArr[2].m25545c()) / 2.0f;
        float d2 = (oVarArr[0].m25544d() + oVarArr[2].m25544d()) / 2.0f;
        float f2 = c * f;
        float f3 = d * f;
        C6446o oVar = new C6446o(c2 + f2, d2 + f3);
        C6446o oVar2 = new C6446o(c2 - f2, d2 - f3);
        float c3 = oVarArr[1].m25545c() - oVarArr[3].m25545c();
        float d3 = oVarArr[1].m25544d() - oVarArr[3].m25544d();
        float c4 = (oVarArr[1].m25545c() + oVarArr[3].m25545c()) / 2.0f;
        float d4 = (oVarArr[1].m25544d() + oVarArr[3].m25544d()) / 2.0f;
        float f4 = c3 * f;
        float f5 = f * d3;
        return new C6446o[]{oVar, new C6446o(c4 + f4, d4 + f5), oVar2, new C6446o(c4 - f4, d4 - f5)};
    }

    /* renamed from: e */
    private void m21968e(C6446o[] oVarArr) {
        long j;
        long j2;
        if (!m21958o(oVarArr[0]) || !m21958o(oVarArr[1]) || !m21958o(oVarArr[2]) || !m21958o(oVarArr[3])) {
            throw C6441j.m25551a();
        }
        int i = this.f16441e * 2;
        int[] iArr = {m21955r(oVarArr[0], oVarArr[1], i), m21955r(oVarArr[1], oVarArr[2], i), m21955r(oVarArr[2], oVarArr[3], i), m21955r(oVarArr[3], oVarArr[0], i)};
        this.f16442f = m21960m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f16442f + i2) % 4];
            if (this.f16438b) {
                j2 = j3 << 7;
                j = (i3 >> 1) & 127;
            } else {
                j2 = j3 << 10;
                j = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
            }
            j3 = j2 + j;
        }
        int h = m21965h(j3, this.f16438b);
        if (this.f16438b) {
            this.f16439c = (h >> 6) + 1;
            this.f16440d = (h & 63) + 1;
            return;
        }
        this.f16439c = (h >> 11) + 1;
        this.f16440d = (h & 2047) + 1;
    }

    /* renamed from: f */
    private C6446o[] m21967f(C0234a aVar) {
        boolean z;
        this.f16441e = 1;
        C0234a aVar2 = aVar;
        C0234a aVar3 = aVar2;
        C0234a aVar4 = aVar3;
        boolean z2 = true;
        while (this.f16441e < 9) {
            C0234a j = m21963j(aVar, z2, 1, -1);
            C0234a j2 = m21963j(aVar2, z2, 1, 1);
            C0234a j3 = m21963j(aVar3, z2, -1, 1);
            C0234a j4 = m21963j(aVar4, z2, -1, -1);
            if (this.f16441e > 2) {
                double c = (m21970c(j4, j) * this.f16441e) / (m21970c(aVar4, aVar) * (this.f16441e + 2));
                if (c < 0.75d || c > 1.25d || !m21957p(j, j2, j3, j4)) {
                    break;
                }
            }
            z2 = !z2;
            this.f16441e++;
            aVar4 = j4;
            aVar = j;
            aVar2 = j2;
            aVar3 = j3;
        }
        int i = this.f16441e;
        if (i == 5 || i == 7) {
            if (i == 5) {
                z = true;
            } else {
                z = false;
            }
            this.f16438b = z;
            C6446o[] oVarArr = {new C6446o(aVar.m21954a() + 0.5f, aVar.m21953b() - 0.5f), new C6446o(aVar2.m21954a() + 0.5f, aVar2.m21953b() + 0.5f), new C6446o(aVar3.m21954a() - 0.5f, aVar3.m21953b() + 0.5f), new C6446o(aVar4.m21954a() - 0.5f, aVar4.m21953b() - 0.5f)};
            int i2 = this.f16441e;
            return m21969d(oVarArr, (i2 * 2) - 3, i2 * 2);
        }
        throw C6441j.m25551a();
    }

    /* renamed from: g */
    private int m21966g(C0234a aVar, C0234a aVar2) {
        float c = m21970c(aVar, aVar2);
        float a = (aVar2.m21954a() - aVar.m21954a()) / c;
        float b = (aVar2.m21953b() - aVar.m21953b()) / c;
        float a2 = aVar.m21954a();
        float b2 = aVar.m21953b();
        boolean e = this.f16437a.m20923e(aVar.m21954a(), aVar.m21953b());
        int ceil = (int) Math.ceil(c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f16437a.m20923e(C8388a.m19876c(a2), C8388a.m19876c(b2)) != e) {
                i++;
            }
        }
        float f = i / c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        if (z == e) {
            return 1;
        }
        return -1;
    }

    /* renamed from: h */
    private static int m21965h(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C9560c(C9558a.f21174k).m15987a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C9561d unused) {
            throw C6441j.m25551a();
        }
    }

    /* renamed from: i */
    private int m21964i() {
        if (this.f16438b) {
            return (this.f16439c * 4) + 11;
        }
        int i = this.f16439c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C0234a m21963j(C0234a aVar, boolean z, int i, int i2) {
        int a = aVar.m21954a() + i;
        int b = aVar.m21953b();
        while (true) {
            b += i2;
            if (!m21959n(a, b) || this.f16437a.m20923e(a, b) != z) {
                break;
            }
            a += i;
        }
        int i3 = a - i;
        int i4 = b - i2;
        while (m21959n(i3, i4) && this.f16437a.m20923e(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m21959n(i5, i4) && this.f16437a.m20923e(i5, i4) == z) {
            i4 += i2;
        }
        return new C0234a(i5, i4 - i2);
    }

    /* renamed from: k */
    private C0234a m21962k() {
        C6446o oVar;
        C6446o oVar2;
        C6446o oVar3;
        C6446o oVar4;
        C6446o oVar5;
        C6446o oVar6;
        C6446o oVar7;
        C6446o oVar8;
        try {
            C6446o[] c = new C8389b(this.f16437a).m19872c();
            oVar3 = c[0];
            oVar2 = c[1];
            oVar = c[2];
            oVar4 = c[3];
        } catch (C6441j unused) {
            int m = this.f16437a.m20917m() / 2;
            int j = this.f16437a.m20920j() / 2;
            int i = m + 7;
            int i2 = j - 7;
            C6446o c2 = m21963j(new C0234a(i, i2), false, 1, -1).m21952c();
            int i3 = j + 7;
            C6446o c3 = m21963j(new C0234a(i, i3), false, 1, 1).m21952c();
            int i4 = m - 7;
            C6446o c4 = m21963j(new C0234a(i4, i3), false, -1, 1).m21952c();
            oVar4 = m21963j(new C0234a(i4, i2), false, -1, -1).m21952c();
            oVar = c4;
            oVar3 = c2;
            oVar2 = c3;
        }
        int c5 = C8388a.m19876c((((oVar3.m25545c() + oVar4.m25545c()) + oVar2.m25545c()) + oVar.m25545c()) / 4.0f);
        int c6 = C8388a.m19876c((((oVar3.m25544d() + oVar4.m25544d()) + oVar2.m25544d()) + oVar.m25544d()) / 4.0f);
        try {
            C6446o[] c7 = new C8389b(this.f16437a, 15, c5, c6).m19872c();
            oVar6 = c7[0];
            oVar5 = c7[1];
            oVar7 = c7[2];
            oVar8 = c7[3];
        } catch (C6441j unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            oVar6 = m21963j(new C0234a(i5, i6), false, 1, -1).m21952c();
            int i7 = c6 + 7;
            oVar5 = m21963j(new C0234a(i5, i7), false, 1, 1).m21952c();
            int i8 = c5 - 7;
            oVar7 = m21963j(new C0234a(i8, i7), false, -1, 1).m21952c();
            oVar8 = m21963j(new C0234a(i8, i6), false, -1, -1).m21952c();
        }
        return new C0234a(C8388a.m19876c((((oVar6.m25545c() + oVar8.m25545c()) + oVar5.m25545c()) + oVar7.m25545c()) / 4.0f), C8388a.m19876c((((oVar6.m25544d() + oVar8.m25544d()) + oVar5.m25544d()) + oVar7.m25544d()) / 4.0f));
    }

    /* renamed from: l */
    private C6446o[] m21961l(C6446o[] oVarArr) {
        return m21969d(oVarArr, this.f16441e * 2, m21964i());
    }

    /* renamed from: m */
    private static int m21960m(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f16436g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C6441j.m25551a();
    }

    /* renamed from: n */
    private boolean m21959n(int i, int i2) {
        return i >= 0 && i < this.f16437a.m20917m() && i2 > 0 && i2 < this.f16437a.m20920j();
    }

    /* renamed from: o */
    private boolean m21958o(C6446o oVar) {
        return m21959n(C8388a.m19876c(oVar.m25545c()), C8388a.m19876c(oVar.m25544d()));
    }

    /* renamed from: p */
    private boolean m21957p(C0234a aVar, C0234a aVar2, C0234a aVar3, C0234a aVar4) {
        C0234a aVar5 = new C0234a(aVar.m21954a() - 3, aVar.m21953b() + 3);
        C0234a aVar6 = new C0234a(aVar2.m21954a() - 3, aVar2.m21953b() - 3);
        C0234a aVar7 = new C0234a(aVar3.m21954a() + 3, aVar3.m21953b() - 3);
        C0234a aVar8 = new C0234a(aVar4.m21954a() + 3, aVar4.m21953b() + 3);
        int g = m21966g(aVar8, aVar5);
        if (g != 0 && m21966g(aVar5, aVar6) == g && m21966g(aVar6, aVar7) == g && m21966g(aVar7, aVar8) == g) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private C7997b m21956q(C7997b bVar, C6446o oVar, C6446o oVar2, C6446o oVar3, C6446o oVar4) {
        AbstractC8004i b = AbstractC8004i.m20887b();
        int i = m21964i();
        float f = i / 2.0f;
        int i2 = this.f16441e;
        float f2 = f - i2;
        float f3 = f + i2;
        return b.mo20886c(bVar, i, i, f2, f2, f3, f2, f3, f3, f2, f3, oVar.m25545c(), oVar.m25544d(), oVar2.m25545c(), oVar2.m25544d(), oVar3.m25545c(), oVar3.m25544d(), oVar4.m25545c(), oVar4.m25544d());
    }

    /* renamed from: r */
    private int m21955r(C6446o oVar, C6446o oVar2, int i) {
        float b = m21971b(oVar, oVar2);
        float f = b / i;
        float c = oVar.m25545c();
        float d = oVar.m25544d();
        float c2 = ((oVar2.m25545c() - oVar.m25545c()) * f) / b;
        float d2 = (f * (oVar2.m25544d() - oVar.m25544d())) / b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f16437a.m20923e(C8388a.m19876c((f2 * c2) + c), C8388a.m19876c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C6817a m21972a(boolean z) {
        C6446o[] f = m21967f(m21962k());
        if (z) {
            C6446o oVar = f[0];
            f[0] = f[2];
            f[2] = oVar;
        }
        m21968e(f);
        C7997b bVar = this.f16437a;
        int i = this.f16442f;
        return new C6817a(m21956q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), m21961l(f), this.f16438b, this.f16440d, this.f16439c);
    }
}
