package p228m7;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p079e7.C6728o;
import p119g9.C7557q0;
import p119g9.C7570y;
import p163j$.util.Spliterator;

/* renamed from: m7.p */
/* loaded from: classes7.dex */
public final class C10522p {

    /* renamed from: m7.p$a */
    /* loaded from: classes7.dex */
    public static final class C10523a {

        /* renamed from: a */
        public long f23263a;
    }

    /* renamed from: a */
    private static boolean m12971a(C7570y yVar, C10527s sVar, int i) {
        int j = m12962j(yVar, i);
        if (j == -1 || j > sVar.f23268b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m12970b(C7570y yVar, int i) {
        if (yVar.m22029D() == C7557q0.m22121v(yVar.m22012d(), i, yVar.m22011e() - 1, 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m12969c(C7570y yVar, C10527s sVar, boolean z, C10523a aVar) {
        try {
            long K = yVar.m22022K();
            if (!z) {
                K *= sVar.f23268b;
            }
            aVar.f23263a = K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m12968d(C7570y yVar, C10527s sVar, int i, C10523a aVar) {
        boolean z;
        boolean z2;
        int e = yVar.m22011e();
        long F = yVar.m22027F();
        long j = F >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (int) ((F >> 12) & 15);
        int i3 = (int) ((F >> 8) & 15);
        int i4 = (int) ((F >> 4) & 15);
        int i5 = (int) ((F >> 1) & 7);
        if ((F & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!m12965g(i4, sVar) || !m12966f(i5, sVar) || z2 || !m12969c(yVar, sVar, z, aVar) || !m12971a(yVar, sVar, i2) || !m12967e(yVar, sVar, i3) || !m12970b(yVar, e)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m12967e(C7570y yVar, C10527s sVar, int i) {
        int i2 = sVar.f23271e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            if (i == sVar.f23272f) {
                return true;
            }
            return false;
        } else if (i == 12) {
            if (yVar.m22029D() * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == i2) {
                return true;
            }
            return false;
        } else if (i > 14) {
            return false;
        } else {
            int J = yVar.m22023J();
            if (i == 14) {
                J *= 10;
            }
            if (J == i2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m12966f(int i, C10527s sVar) {
        return i == 0 || i == sVar.f23275i;
    }

    /* renamed from: g */
    private static boolean m12965g(int i, C10527s sVar) {
        if (i <= 7) {
            if (i == sVar.f23273g - 1) {
                return true;
            }
            return false;
        } else if (i > 10 || sVar.f23273g != 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m12964h(AbstractC10515j jVar, C10527s sVar, int i, C10523a aVar) {
        long h = jVar.mo7939h();
        byte[] bArr = new byte[2];
        jVar.mo12930n(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            jVar.mo12936f();
            jVar.mo12934i((int) (h - jVar.getPosition()));
            return false;
        }
        C7570y yVar = new C7570y(16);
        System.arraycopy(bArr, 0, yVar.m22012d(), 0, 2);
        yVar.m22018O(C10518l.m12974a(jVar, yVar.m22012d(), 2, 14));
        jVar.mo12936f();
        jVar.mo12934i((int) (h - jVar.getPosition()));
        return m12968d(yVar, sVar, i, aVar);
    }

    /* renamed from: i */
    public static long m12963i(AbstractC10515j jVar, C10527s sVar) {
        int i;
        jVar.mo12936f();
        boolean z = true;
        jVar.mo12934i(1);
        byte[] bArr = new byte[1];
        jVar.mo12930n(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        jVar.mo12934i(2);
        if (z) {
            i = 7;
        } else {
            i = 6;
        }
        C7570y yVar = new C7570y(i);
        yVar.m22018O(C10518l.m12974a(jVar, yVar.m22012d(), 0, i));
        jVar.mo12936f();
        C10523a aVar = new C10523a();
        if (m12969c(yVar, sVar, z, aVar)) {
            return aVar.f23263a;
        }
        throw new C6728o();
    }

    /* renamed from: j */
    public static int m12962j(C7570y yVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return yVar.m22029D() + 1;
            case 7:
                return yVar.m22023J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return Spliterator.NONNULL << (i - 8);
            default:
                return -1;
        }
    }
}
