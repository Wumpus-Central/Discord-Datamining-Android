package p228m7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p030bc.C3452d;
import p041c8.C3778a;
import p079e7.C6728o;
import p080e8.C6750h;
import p119g9.C7569x;
import p119g9.C7570y;
import p228m7.C10527s;
import p459z7.C14576a;

/* renamed from: m7.q */
/* loaded from: classes7.dex */
public final class C10524q {

    /* renamed from: m7.q$a */
    /* loaded from: classes7.dex */
    public static final class C10525a {

        /* renamed from: a */
        public C10527s f23264a;

        public C10525a(C10527s sVar) {
            this.f23264a = sVar;
        }
    }

    /* renamed from: a */
    public static boolean m12961a(AbstractC10515j jVar) {
        C7570y yVar = new C7570y(4);
        jVar.mo12930n(yVar.m22012d(), 0, 4);
        if (yVar.m22027F() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m12960b(AbstractC10515j jVar) {
        jVar.mo12936f();
        C7570y yVar = new C7570y(2);
        jVar.mo12930n(yVar.m22012d(), 0, 2);
        int J = yVar.m22023J();
        if ((J >> 2) == 16382) {
            jVar.mo12936f();
            return J;
        }
        jVar.mo12936f();
        throw new C6728o("First frame does not start with sync code.");
    }

    /* renamed from: c */
    public static C14576a m12959c(AbstractC10515j jVar, boolean z) {
        C6750h.AbstractC6751a aVar;
        if (z) {
            aVar = null;
        } else {
            aVar = C6750h.f14397b;
        }
        C14576a a = new C10531v().m12925a(jVar, aVar);
        if (a == null || a.m183f() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: d */
    public static C14576a m12958d(AbstractC10515j jVar, boolean z) {
        jVar.mo12936f();
        long h = jVar.mo7939h();
        C14576a c = m12959c(jVar, z);
        jVar.mo12932k((int) (jVar.mo7939h() - h));
        return c;
    }

    /* renamed from: e */
    public static boolean m12957e(AbstractC10515j jVar, C10525a aVar) {
        jVar.mo12936f();
        C7569x xVar = new C7569x(new byte[4]);
        jVar.mo12930n(xVar.f16415a, 0, 4);
        boolean g = xVar.m22045g();
        int h = xVar.m22044h(7);
        int h2 = xVar.m22044h(24) + 4;
        if (h == 0) {
            aVar.f23264a = m12953i(jVar);
        } else {
            C10527s sVar = aVar.f23264a;
            if (sVar == null) {
                throw new IllegalArgumentException();
            } else if (h == 3) {
                aVar.f23264a = sVar.m12947c(m12954h(jVar, h2));
            } else if (h == 4) {
                aVar.f23264a = sVar.m12946d(m12951k(jVar, h2));
            } else if (h == 6) {
                aVar.f23264a = sVar.m12948b(Collections.singletonList(m12956f(jVar, h2)));
            } else {
                jVar.mo12932k(h2);
            }
        }
        return g;
    }

    /* renamed from: f */
    private static C3778a m12956f(AbstractC10515j jVar, int i) {
        C7570y yVar = new C7570y(i);
        jVar.readFully(yVar.m22012d(), 0, i);
        yVar.m22016Q(4);
        int n = yVar.m22002n();
        String B = yVar.m22031B(yVar.m22002n(), C3452d.f5593a);
        String A = yVar.m22032A(yVar.m22002n());
        int n2 = yVar.m22002n();
        int n3 = yVar.m22002n();
        int n4 = yVar.m22002n();
        int n5 = yVar.m22002n();
        int n6 = yVar.m22002n();
        byte[] bArr = new byte[n6];
        yVar.m22006j(bArr, 0, n6);
        return new C3778a(n, B, A, n2, n3, n4, n5, bArr);
    }

    /* renamed from: g */
    public static C10527s.C10528a m12955g(C7570y yVar) {
        yVar.m22016Q(1);
        int G = yVar.m22026G();
        long e = yVar.m22011e() + G;
        int i = G / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long w = yVar.m21993w();
            if (w == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = w;
            jArr2[i2] = yVar.m21993w();
            yVar.m22016Q(2);
            i2++;
        }
        yVar.m22016Q((int) (e - yVar.m22011e()));
        return new C10527s.C10528a(jArr, jArr2);
    }

    /* renamed from: h */
    private static C10527s.C10528a m12954h(AbstractC10515j jVar, int i) {
        C7570y yVar = new C7570y(i);
        jVar.readFully(yVar.m22012d(), 0, i);
        return m12955g(yVar);
    }

    /* renamed from: i */
    private static C10527s m12953i(AbstractC10515j jVar) {
        byte[] bArr = new byte[38];
        jVar.readFully(bArr, 0, 38);
        return new C10527s(bArr, 4);
    }

    /* renamed from: j */
    public static void m12952j(AbstractC10515j jVar) {
        C7570y yVar = new C7570y(4);
        jVar.readFully(yVar.m22012d(), 0, 4);
        if (yVar.m22027F() != 1716281667) {
            throw new C6728o("Failed to read FLAC stream marker.");
        }
    }

    /* renamed from: k */
    private static List<String> m12951k(AbstractC10515j jVar, int i) {
        C7570y yVar = new C7570y(i);
        jVar.readFully(yVar.m22012d(), 0, i);
        yVar.m22016Q(4);
        return Arrays.asList(C10505d0.m12989i(yVar, false, false).f23218b);
    }
}
