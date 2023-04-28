package p080e8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7569x;
import p119g9.C7570y;
import p459z7.AbstractC14585h;
import p459z7.C14576a;
import p459z7.C14582e;

/* renamed from: e8.h */
/* loaded from: classes7.dex */
public final class C6750h extends AbstractC14585h {

    /* renamed from: b */
    public static final AbstractC6751a f14397b = new AbstractC6751a() { // from class: e8.g
        @Override // p080e8.C6750h.AbstractC6751a
        /* renamed from: a */
        public final boolean mo5442a(int i, int i2, int i3, int i4, int i5) {
            boolean z;
            z = C6750h.m24383z(i, i2, i3, i4, i5);
            return z;
        }
    };

    /* renamed from: a */
    private final AbstractC6751a f14398a;

    /* renamed from: e8.h$a */
    /* loaded from: classes7.dex */
    public interface AbstractC6751a {
        /* renamed from: a */
        boolean mo5442a(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e8.h$b */
    /* loaded from: classes7.dex */
    public static final class C6752b {

        /* renamed from: a */
        private final int f14399a;

        /* renamed from: b */
        private final boolean f14400b;

        /* renamed from: c */
        private final int f14401c;

        public C6752b(int i, boolean z, int i2) {
            this.f14399a = i;
            this.f14400b = z;
            this.f14401c = i2;
        }
    }

    public C6750h() {
        this(null);
    }

    /* renamed from: A */
    private static int m24408A(C7570y yVar, int i) {
        byte[] d = yVar.m22012d();
        int e = yVar.m22011e();
        int i2 = e;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= e + i) {
                return i;
            }
            if ((d[i2] & 255) == 255 && d[i3] == 0) {
                System.arraycopy(d, i2 + 2, d, i3, (i - (i2 - e)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if ((r10 & 128) != 0) goto L_0x008b;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m24407B(p119g9.C7570y r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m22011e()
        L_0x0008:
            int r3 = r18.m22015a()     // Catch: all -> 0x00af
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.m22002n()     // Catch: all -> 0x00af
            long r8 = r18.m22027F()     // Catch: all -> 0x00af
            int r10 = r18.m22023J()     // Catch: all -> 0x00af
            goto L_0x002c
        L_0x0022:
            int r7 = r18.m22026G()     // Catch: all -> 0x00af
            int r8 = r18.m22026G()     // Catch: all -> 0x00af
            long r8 = (long) r8
            r10 = r6
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.m22017P(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            r1.m22017P(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007b
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = r4
            goto L_0x0074
        L_0x0073:
            r3 = r6
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r4 = r6
            goto L_0x008b
        L_0x007b:
            if (r0 != r3) goto L_0x0089
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0083
            r3 = r4
            goto L_0x0084
        L_0x0083:
            r3 = r6
        L_0x0084:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0089:
            r3 = r6
            r4 = r3
        L_0x008b:
            if (r4 == 0) goto L_0x008f
            int r3 = r3 + 4
        L_0x008f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0098
            r1.m22017P(r2)
            return r6
        L_0x0098:
            int r3 = r18.m22015a()     // Catch: all -> 0x00af
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a5
            r1.m22017P(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.m22016Q(r3)     // Catch: all -> 0x00af
            goto L_0x0008
        L_0x00ab:
            r1.m22017P(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.m22017P(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e8.C6750h.m24407B(g9.y, int, int, boolean):boolean");
    }

    /* renamed from: d */
    private static byte[] m24405d(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C7557q0.f16373f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: f */
    private static C6738a m24403f(C7570y yVar, int i, int i2) {
        int i3;
        String str;
        int D = yVar.m22029D();
        String v = m24387v(D);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        yVar.m22006j(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + C7557q0.m22174U0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m24384y(bArr, 0);
            String U0 = C7557q0.m22174U0(new String(bArr, 0, i3, "ISO-8859-1"));
            if (U0.indexOf(47) == -1) {
                str = "image/" + U0;
            } else {
                str = U0;
            }
        }
        int i5 = i3 + 2;
        int x = m24385x(bArr, i5, D);
        return new C6738a(str, new String(bArr, i5, x - i5, v), bArr[i3 + 1] & 255, m24405d(bArr, x + m24388u(D), i4));
    }

    /* renamed from: g */
    private static C6739b m24402g(C7570y yVar, int i, String str) {
        byte[] bArr = new byte[i];
        yVar.m22006j(bArr, 0, i);
        return new C6739b(str, bArr);
    }

    /* renamed from: h */
    private static C6741c m24401h(C7570y yVar, int i, int i2, boolean z, int i3, AbstractC6751a aVar) {
        long j;
        long j2;
        int e = yVar.m22011e();
        int y = m24384y(yVar.m22012d(), e);
        String str = new String(yVar.m22012d(), e, y - e, "ISO-8859-1");
        yVar.m22017P(y + 1);
        int n = yVar.m22002n();
        int n2 = yVar.m22002n();
        long F = yVar.m22027F();
        if (F == 4294967295L) {
            j = -1;
        } else {
            j = F;
        }
        long F2 = yVar.m22027F();
        if (F2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = F2;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = e + i;
        while (yVar.m22011e() < i4) {
            AbstractC6753i k = m24398k(i2, yVar, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C6741c(str, n, n2, j, j2, (AbstractC6753i[]) arrayList.toArray(new AbstractC6753i[0]));
    }

    /* renamed from: i */
    private static C6743d m24400i(C7570y yVar, int i, int i2, boolean z, int i3, AbstractC6751a aVar) {
        boolean z2;
        boolean z3;
        int e = yVar.m22011e();
        int y = m24384y(yVar.m22012d(), e);
        String str = new String(yVar.m22012d(), e, y - e, "ISO-8859-1");
        yVar.m22017P(y + 1);
        int D = yVar.m22029D();
        if ((D & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((D & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int D2 = yVar.m22029D();
        String[] strArr = new String[D2];
        for (int i4 = 0; i4 < D2; i4++) {
            int e2 = yVar.m22011e();
            int y2 = m24384y(yVar.m22012d(), e2);
            strArr[i4] = new String(yVar.m22012d(), e2, y2 - e2, "ISO-8859-1");
            yVar.m22017P(y2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = e + i;
        while (yVar.m22011e() < i5) {
            AbstractC6753i k = m24398k(i2, yVar, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C6743d(str, z2, z3, strArr, (AbstractC6753i[]) arrayList.toArray(new AbstractC6753i[0]));
    }

    /* renamed from: j */
    private static C6745e m24399j(C7570y yVar, int i) {
        if (i < 4) {
            return null;
        }
        int D = yVar.m22029D();
        String v = m24387v(D);
        byte[] bArr = new byte[3];
        yVar.m22006j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yVar.m22006j(bArr2, 0, i2);
        int x = m24385x(bArr2, 0, D);
        String str2 = new String(bArr2, 0, x, v);
        int u = x + m24388u(D);
        return new C6745e(str, str2, m24393p(bArr2, u, m24385x(bArr2, u, D), v));
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p080e8.AbstractC6753i m24398k(int r19, p119g9.C7570y r20, boolean r21, int r22, p080e8.C6750h.AbstractC6751a r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e8.C6750h.m24398k(int, g9.y, boolean, int, e8.h$a):e8.i");
    }

    /* renamed from: l */
    private static C6747f m24397l(C7570y yVar, int i) {
        int D = yVar.m22029D();
        String v = m24387v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.m22006j(bArr, 0, i2);
        int y = m24384y(bArr, 0);
        String str = new String(bArr, 0, y, "ISO-8859-1");
        int i3 = y + 1;
        int x = m24385x(bArr, i3, D);
        String p = m24393p(bArr, i3, x, v);
        int u = x + m24388u(D);
        int x2 = m24385x(bArr, u, D);
        return new C6747f(str, p, m24393p(bArr, u, x2, v), m24405d(bArr, x2 + m24388u(D), i2));
    }

    /* renamed from: m */
    private static C6752b m24396m(C7570y yVar) {
        int G;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (yVar.m22015a() < 10) {
            C7558r.m22104h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        boolean z5 = false;
        if (yVar.m22026G() != 4801587) {
            C7558r.m22104h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(G)));
            return null;
        }
        int D = yVar.m22029D();
        yVar.m22016Q(1);
        int D2 = yVar.m22029D();
        int C = yVar.m22030C();
        if (D == 2) {
            if ((D2 & 64) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                C7558r.m22104h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (D == 3) {
            if ((D2 & 64) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int n = yVar.m22002n();
                yVar.m22016Q(n);
                C -= n + 4;
            }
        } else if (D == 4) {
            if ((D2 & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int C2 = yVar.m22030C();
                yVar.m22016Q(C2 - 4);
                C -= C2;
            }
            if ((D2 & 16) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C -= 10;
            }
        } else {
            C7558r.m22104h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + D);
            return null;
        }
        if (D < 4 && (D2 & 128) != 0) {
            z5 = true;
        }
        return new C6752b(D, z5, C);
    }

    /* renamed from: n */
    private static C6756k m24395n(C7570y yVar, int i) {
        int J = yVar.m22023J();
        int G = yVar.m22026G();
        int G2 = yVar.m22026G();
        int D = yVar.m22029D();
        int D2 = yVar.m22029D();
        C7569x xVar = new C7569x();
        xVar.m22039m(yVar);
        int i2 = ((i - 10) * 8) / (D + D2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = xVar.m22044h(D);
            int h2 = xVar.m22044h(D2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new C6756k(J, G, G2, iArr, iArr2);
    }

    /* renamed from: o */
    private static C6758l m24394o(C7570y yVar, int i) {
        byte[] bArr = new byte[i];
        yVar.m22006j(bArr, 0, i);
        int y = m24384y(bArr, 0);
        return new C6758l(new String(bArr, 0, y, "ISO-8859-1"), m24405d(bArr, y + 1, i));
    }

    /* renamed from: p */
    private static String m24393p(byte[] bArr, int i, int i2, String str) {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* renamed from: q */
    private static C6760m m24392q(C7570y yVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int D = yVar.m22029D();
        String v = m24387v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.m22006j(bArr, 0, i2);
        return new C6760m(str, null, new String(bArr, 0, m24385x(bArr, 0, D), v));
    }

    /* renamed from: r */
    private static C6760m m24391r(C7570y yVar, int i) {
        if (i < 1) {
            return null;
        }
        int D = yVar.m22029D();
        String v = m24387v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.m22006j(bArr, 0, i2);
        int x = m24385x(bArr, 0, D);
        String str = new String(bArr, 0, x, v);
        int u = x + m24388u(D);
        return new C6760m("TXXX", str, m24393p(bArr, u, m24385x(bArr, u, D), v));
    }

    /* renamed from: s */
    private static C6762n m24390s(C7570y yVar, int i, String str) {
        byte[] bArr = new byte[i];
        yVar.m22006j(bArr, 0, i);
        return new C6762n(str, null, new String(bArr, 0, m24384y(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: t */
    private static C6762n m24389t(C7570y yVar, int i) {
        if (i < 1) {
            return null;
        }
        int D = yVar.m22029D();
        String v = m24387v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.m22006j(bArr, 0, i2);
        int x = m24385x(bArr, 0, D);
        String str = new String(bArr, 0, x, v);
        int u = x + m24388u(D);
        return new C6762n("WXXX", str, m24393p(bArr, u, m24384y(bArr, u), "ISO-8859-1"));
    }

    /* renamed from: u */
    private static int m24388u(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: v */
    private static String m24387v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: w */
    private static String m24386w(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: x */
    private static int m24385x(byte[] bArr, int i, int i2) {
        int y = m24384y(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return y;
        }
        while (y < bArr.length - 1) {
            if (y % 2 == 0 && bArr[y + 1] == 0) {
                return y;
            }
            y = m24384y(bArr, y + 1);
        }
        return bArr.length;
    }

    /* renamed from: y */
    private static int m24384y(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ boolean m24383z(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // p459z7.AbstractC14585h
    /* renamed from: b */
    protected C14576a mo161b(C14582e eVar, ByteBuffer byteBuffer) {
        return m24404e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public C14576a m24404e(byte[] bArr, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        C7570y yVar = new C7570y(bArr, i);
        C6752b m = m24396m(yVar);
        if (m == null) {
            return null;
        }
        int e = yVar.m22011e();
        if (m.f14399a == 2) {
            i2 = 6;
        } else {
            i2 = 10;
        }
        int i3 = m.f14401c;
        if (m.f14400b) {
            i3 = m24408A(yVar, m.f14401c);
        }
        yVar.m22018O(e + i3);
        boolean z = false;
        if (!m24407B(yVar, m.f14399a, i2, false)) {
            if (m.f14399a != 4 || !m24407B(yVar, 4, i2, true)) {
                C7558r.m22104h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m.f14399a);
                return null;
            }
            z = true;
        }
        while (yVar.m22015a() >= i2) {
            AbstractC6753i k = m24398k(m.f14399a, yVar, z, i2, this.f14398a);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C14576a(arrayList);
    }

    public C6750h(AbstractC6751a aVar) {
        this.f14398a = aVar;
    }
}
