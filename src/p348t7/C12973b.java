package p348t7;

import android.util.Pair;
import cc.AbstractC3884i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p030bc.AbstractC3454f;
import p079e7.C6722k;
import p099f8.C7079a;
import p099f8.C7087e;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p119g9.C7570y;
import p133h9.C7939a;
import p133h9.C7944c;
import p133h9.C7950f;
import p193k7.C9798l;
import p228m7.C10530u;
import p348t7.AbstractC12971a;
import p459z7.C14576a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t7.b */
/* loaded from: classes7.dex */
public final class C12973b {

    /* renamed from: a */
    private static final byte[] f29069a = C7557q0.m22140l0("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.b$a */
    /* loaded from: classes7.dex */
    public static final class C12974a {

        /* renamed from: a */
        public final int f29070a;

        /* renamed from: b */
        public int f29071b;

        /* renamed from: c */
        public int f29072c;

        /* renamed from: d */
        public long f29073d;

        /* renamed from: e */
        private final boolean f29074e;

        /* renamed from: f */
        private final C7570y f29075f;

        /* renamed from: g */
        private final C7570y f29076g;

        /* renamed from: h */
        private int f29077h;

        /* renamed from: i */
        private int f29078i;

        public C12974a(C7570y yVar, C7570y yVar2, boolean z) {
            this.f29076g = yVar;
            this.f29075f = yVar2;
            this.f29074e = z;
            yVar2.m22017P(12);
            this.f29070a = yVar2.m22025H();
            yVar.m22017P(12);
            this.f29078i = yVar.m22025H();
            C7510a.m22365g(yVar.m22002n() != 1 ? false : true, "first_chunk must be 1");
            this.f29071b = -1;
        }

        /* renamed from: a */
        public boolean m4891a() {
            long j;
            int i;
            int i2 = this.f29071b + 1;
            this.f29071b = i2;
            if (i2 == this.f29070a) {
                return false;
            }
            if (this.f29074e) {
                j = this.f29075f.m22024I();
            } else {
                j = this.f29075f.m22027F();
            }
            this.f29073d = j;
            if (this.f29071b == this.f29077h) {
                this.f29072c = this.f29076g.m22025H();
                this.f29076g.m22016Q(4);
                int i3 = this.f29078i - 1;
                this.f29078i = i3;
                if (i3 > 0) {
                    i = this.f29076g.m22025H() - 1;
                } else {
                    i = -1;
                }
                this.f29077h = i;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.b$b */
    /* loaded from: classes7.dex */
    public interface AbstractC0417b {
        /* renamed from: a */
        int mo4890a();

        /* renamed from: b */
        int mo4889b();

        /* renamed from: c */
        int mo4888c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.b$c */
    /* loaded from: classes7.dex */
    public static final class C12975c {

        /* renamed from: a */
        public final C12999p[] f29079a;

        /* renamed from: b */
        public C6722k f29080b;

        /* renamed from: c */
        public int f29081c;

        /* renamed from: d */
        public int f29082d = 0;

        public C12975c(int i) {
            this.f29079a = new C12999p[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t7.b$d */
    /* loaded from: classes7.dex */
    public static final class C12976d implements AbstractC0417b {

        /* renamed from: a */
        private final int f29083a;

        /* renamed from: b */
        private final int f29084b;

        /* renamed from: c */
        private final C7570y f29085c;

        public C12976d(AbstractC12971a.C12972b bVar, C6722k kVar) {
            C7570y yVar = bVar.f29068b;
            this.f29085c = yVar;
            yVar.m22017P(12);
            int H = yVar.m22025H();
            if ("audio/raw".equals(kVar.f14329v)) {
                int c0 = C7557q0.m22158c0(kVar.f37971K, kVar.f37969I);
                if (H == 0 || H % c0 != 0) {
                    C7558r.m22104h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + c0 + ", stsz sample size: " + H);
                    H = c0;
                }
            }
            this.f29083a = H == 0 ? -1 : H;
            this.f29084b = yVar.m22025H();
        }

        @Override // p348t7.C12973b.AbstractC0417b
        /* renamed from: a */
        public int mo4890a() {
            int i = this.f29083a;
            return i == -1 ? this.f29085c.m22025H() : i;
        }

        @Override // p348t7.C12973b.AbstractC0417b
        /* renamed from: b */
        public int mo4889b() {
            return this.f29083a;
        }

        @Override // p348t7.C12973b.AbstractC0417b
        /* renamed from: c */
        public int mo4888c() {
            return this.f29084b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t7.b$e */
    /* loaded from: classes7.dex */
    public static final class C12977e implements AbstractC0417b {

        /* renamed from: a */
        private final C7570y f29086a;

        /* renamed from: b */
        private final int f29087b;

        /* renamed from: c */
        private final int f29088c;

        /* renamed from: d */
        private int f29089d;

        /* renamed from: e */
        private int f29090e;

        public C12977e(AbstractC12971a.C12972b bVar) {
            C7570y yVar = bVar.f29068b;
            this.f29086a = yVar;
            yVar.m22017P(12);
            this.f29088c = yVar.m22025H() & 255;
            this.f29087b = yVar.m22025H();
        }

        @Override // p348t7.C12973b.AbstractC0417b
        /* renamed from: a */
        public int mo4890a() {
            int i = this.f29088c;
            if (i == 8) {
                return this.f29086a.m22029D();
            }
            if (i == 16) {
                return this.f29086a.m22023J();
            }
            int i2 = this.f29089d;
            this.f29089d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f29090e & 15;
            }
            int D = this.f29086a.m22029D();
            this.f29090e = D;
            return (D & 240) >> 4;
        }

        @Override // p348t7.C12973b.AbstractC0417b
        /* renamed from: b */
        public int mo4889b() {
            return -1;
        }

        @Override // p348t7.C12973b.AbstractC0417b
        /* renamed from: c */
        public int mo4888c() {
            return this.f29087b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.b$f */
    /* loaded from: classes7.dex */
    public static final class C12978f {

        /* renamed from: a */
        private final int f29091a;

        /* renamed from: b */
        private final long f29092b;

        /* renamed from: c */
        private final int f29093c;

        public C12978f(int i, long j, int i2) {
            this.f29091a = i;
            this.f29092b = j;
            this.f29093c = i2;
        }
    }

    /* renamed from: A */
    public static Pair<C14576a, C14576a> m4920A(AbstractC12971a.C12972b bVar) {
        C7570y yVar = bVar.f29068b;
        yVar.m22017P(8);
        C14576a aVar = null;
        C14576a aVar2 = null;
        while (yVar.m22015a() >= 8) {
            int e = yVar.m22011e();
            int n = yVar.m22002n();
            int n2 = yVar.m22002n();
            if (n2 == 1835365473) {
                yVar.m22017P(e);
                aVar = m4919B(yVar, e + n);
            } else if (n2 == 1936553057) {
                yVar.m22017P(e);
                aVar2 = m4898t(yVar, e + n);
            }
            yVar.m22017P(e + n);
        }
        return Pair.create(aVar, aVar2);
    }

    /* renamed from: B */
    private static C14576a m4919B(C7570y yVar, int i) {
        yVar.m22016Q(8);
        m4914d(yVar);
        while (yVar.m22011e() < i) {
            int e = yVar.m22011e();
            int n = yVar.m22002n();
            if (yVar.m22002n() == 1768715124) {
                yVar.m22017P(e);
                return m4907k(yVar, e + n);
            }
            yVar.m22017P(e + n);
        }
        return null;
    }

    /* renamed from: C */
    private static void m4918C(C7570y yVar, int i, int i2, int i3, int i4, int i5, C9798l lVar, C12975c cVar, int i6) {
        String str;
        C9798l lVar2;
        List<byte[]> list;
        boolean z;
        String str2;
        List<byte[]> list2;
        String str3;
        String str4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i7 = i2;
        C9798l lVar3 = lVar;
        yVar.m22017P(i7 + 8 + 8);
        yVar.m22016Q(16);
        int J = yVar.m22023J();
        int J2 = yVar.m22023J();
        yVar.m22016Q(50);
        int e = yVar.m22011e();
        String str5 = null;
        int i8 = i;
        if (i8 == 1701733238) {
            Pair<Integer, C12999p> r = m4900r(yVar, i7, i3);
            if (r != null) {
                i8 = ((Integer) r.first).intValue();
                if (lVar3 == null) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar3.m15331A(((C12999p) r.second).f29199b);
                }
                cVar.f29079a[i6] = (C12999p) r.second;
            }
            yVar.m22017P(e);
        }
        if (i8 == 1831958048) {
            str = "video/mpeg";
        } else {
            str = null;
        }
        float f = 1.0f;
        int i9 = -1;
        boolean z8 = false;
        byte[] bArr = null;
        List<byte[]> list3 = null;
        while (true) {
            if (e - i7 >= i3) {
                lVar2 = lVar3;
                list = list3;
                break;
            }
            yVar.m22017P(e);
            int e2 = yVar.m22011e();
            lVar2 = lVar3;
            int n = yVar.m22002n();
            if (n == 0) {
                list = list3;
                if (yVar.m22011e() - i7 == i3) {
                    break;
                }
            } else {
                list = list3;
            }
            if (n > 0) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22365g(z, "childAtomSize should be positive");
            int n2 = yVar.m22002n();
            if (n2 == 1635148611) {
                if (str == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C7510a.m22366f(z7);
                yVar.m22017P(e2 + 8);
                C7939a b = C7939a.m21116b(yVar);
                list2 = b.f17037a;
                cVar.f29081c = b.f17038b;
                if (!z8) {
                    f = b.f17041e;
                }
                str3 = b.f17042f;
                str2 = "video/avc";
            } else if (n2 == 1752589123) {
                if (str == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                C7510a.m22366f(z6);
                yVar.m22017P(e2 + 8);
                C7950f a = C7950f.m21055a(yVar);
                list2 = a.f17077a;
                cVar.f29081c = a.f17078b;
                str3 = a.f17079c;
                str2 = "video/hevc";
            } else {
                if (n2 == 1685480259 || n2 == 1685485123) {
                    C7944c a2 = C7944c.m21077a(yVar);
                    if (a2 != null) {
                        str5 = a2.f17052c;
                        str = "video/dolby-vision";
                    }
                } else {
                    if (n2 == 1987076931) {
                        if (str == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        C7510a.m22366f(z5);
                        if (i8 == 1987063864) {
                            str4 = "video/x-vnd.on2.vp8";
                        } else {
                            str4 = "video/x-vnd.on2.vp9";
                        }
                    } else if (n2 == 1635135811) {
                        if (str == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        C7510a.m22366f(z4);
                        str4 = "video/av01";
                    } else if (n2 == 1681012275) {
                        if (str == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C7510a.m22366f(z3);
                        str4 = "video/3gpp";
                    } else if (n2 == 1702061171) {
                        if (str == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C7510a.m22366f(z2);
                        Pair<String, byte[]> h = m4910h(yVar, e2);
                        str = (String) h.first;
                        byte[] bArr2 = (byte[]) h.second;
                        if (bArr2 != null) {
                            list3 = AbstractC3884i0.m33398y(bArr2);
                            e += n;
                            i7 = i2;
                            lVar3 = lVar2;
                        }
                    } else {
                        if (n2 == 1885434736) {
                            list3 = list;
                            f = m4902p(yVar, e2);
                            z8 = true;
                        } else if (n2 == 1937126244) {
                            list3 = list;
                            bArr = m4901q(yVar, e2, n);
                        } else if (n2 == 1936995172) {
                            int D = yVar.m22029D();
                            yVar.m22016Q(3);
                            if (D == 0) {
                                int D2 = yVar.m22029D();
                                if (D2 != 0) {
                                    int i10 = 1;
                                    if (D2 != 1) {
                                        i10 = 2;
                                        if (D2 != 2) {
                                            if (D2 == 3) {
                                                list3 = list;
                                                i9 = 3;
                                            }
                                        }
                                    }
                                    i9 = i10;
                                } else {
                                    list3 = list;
                                    i9 = 0;
                                }
                            }
                        }
                        e += n;
                        i7 = i2;
                        lVar3 = lVar2;
                    }
                    list3 = list;
                    str = str4;
                    e += n;
                    i7 = i2;
                    lVar3 = lVar2;
                }
                list3 = list;
                e += n;
                i7 = i2;
                lVar3 = lVar2;
            }
            list3 = list2;
            str = str2;
            str5 = str3;
            e += n;
            i7 = i2;
            lVar3 = lVar2;
        }
        if (str != null) {
            cVar.f29080b = new C6722k.C6724b().m24506R(i4).m24488e0(str).m24515I(str5).m24478j0(J).m24507Q(J2).m24496a0(f).m24490d0(i5).m24494b0(bArr).m24482h0(i9).m24504T(list).m24512L(lVar2).m24519E();
        }
    }

    /* renamed from: a */
    private static boolean m4917a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int r = C7557q0.m22129r(4, 0, length);
        int r2 = C7557q0.m22129r(jArr.length - 4, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[r] || jArr[r2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static int m4916b(C7570y yVar, int i, int i2) {
        boolean z;
        int e = yVar.m22011e();
        while (e - i < i2) {
            yVar.m22017P(e);
            int n = yVar.m22002n();
            if (n > 0) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22365g(z, "childAtomSize should be positive");
            if (yVar.m22002n() == 1702061171) {
                return e;
            }
            e += n;
        }
        return -1;
    }

    /* renamed from: c */
    private static int m4915c(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: d */
    public static void m4914d(C7570y yVar) {
        int e = yVar.m22011e();
        yVar.m22016Q(4);
        if (yVar.m22002n() != 1751411826) {
            e += 4;
        }
        yVar.m22017P(e);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m4913e(p119g9.C7570y r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, p193k7.C9798l r27, p348t7.C12973b.C12975c r28, int r29) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p348t7.C12973b.m4913e(g9.y, int, int, int, int, java.lang.String, boolean, k7.l, t7.b$c, int):void");
    }

    /* renamed from: f */
    static Pair<Integer, C12999p> m4912f(C7570y yVar, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            yVar.m22017P(i3);
            int n = yVar.m22002n();
            int n2 = yVar.m22002n();
            if (n2 == 1718775137) {
                num = Integer.valueOf(yVar.m22002n());
            } else if (n2 == 1935894637) {
                yVar.m22016Q(4);
                str = yVar.m22032A(4);
            } else if (n2 == 1935894633) {
                i4 = i3;
                i5 = n;
            }
            i3 += n;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C7510a.m22363i(num, "frma atom is mandatory");
        if (i4 != -1) {
            z = true;
        }
        C7510a.m22365g(z, "schi atom is mandatory");
        return Pair.create(num, (C12999p) C7510a.m22363i(m4899s(yVar, i4, i5, str), "tenc atom is mandatory"));
    }

    /* renamed from: g */
    private static Pair<long[], long[]> m4911g(AbstractC12971a.C0416a aVar) {
        long j;
        long j2;
        AbstractC12971a.C12972b g = aVar.m4921g(1701606260);
        if (g == null) {
            return null;
        }
        C7570y yVar = g.f29068b;
        yVar.m22017P(8);
        int c = AbstractC12971a.m4925c(yVar.m22002n());
        int H = yVar.m22025H();
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        for (int i = 0; i < H; i++) {
            if (c == 1) {
                j = yVar.m22024I();
            } else {
                j = yVar.m22027F();
            }
            jArr[i] = j;
            if (c == 1) {
                j2 = yVar.m21993w();
            } else {
                j2 = yVar.m22002n();
            }
            jArr2[i] = j2;
            if (yVar.m21990z() == 1) {
                yVar.m22016Q(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: h */
    private static Pair<String, byte[]> m4910h(C7570y yVar, int i) {
        yVar.m22017P(i + 8 + 4);
        yVar.m22016Q(1);
        m4909i(yVar);
        yVar.m22016Q(2);
        int D = yVar.m22029D();
        if ((D & 128) != 0) {
            yVar.m22016Q(2);
        }
        if ((D & 64) != 0) {
            yVar.m22016Q(yVar.m22023J());
        }
        if ((D & 32) != 0) {
            yVar.m22016Q(2);
        }
        yVar.m22016Q(1);
        m4909i(yVar);
        String h = C7562u.m22080h(yVar.m22029D());
        if ("audio/mpeg".equals(h) || "audio/vnd.dts".equals(h) || "audio/vnd.dts.hd".equals(h)) {
            return Pair.create(h, null);
        }
        yVar.m22016Q(12);
        yVar.m22016Q(1);
        int i2 = m4909i(yVar);
        byte[] bArr = new byte[i2];
        yVar.m22006j(bArr, 0, i2);
        return Pair.create(h, bArr);
    }

    /* renamed from: i */
    private static int m4909i(C7570y yVar) {
        int D = yVar.m22029D();
        int i = D & 127;
        while ((D & 128) == 128) {
            D = yVar.m22029D();
            i = (i << 7) | (D & 127);
        }
        return i;
    }

    /* renamed from: j */
    private static int m4908j(C7570y yVar) {
        yVar.m22017P(16);
        return yVar.m22002n();
    }

    /* renamed from: k */
    private static C14576a m4907k(C7570y yVar, int i) {
        yVar.m22016Q(8);
        ArrayList arrayList = new ArrayList();
        while (yVar.m22011e() < i) {
            C14576a.AbstractC14577b c = C12988h.m4829c(yVar);
            if (c != null) {
                arrayList.add(c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C14576a(arrayList);
    }

    /* renamed from: l */
    private static Pair<Long, String> m4906l(C7570y yVar) {
        int i;
        int i2 = 8;
        yVar.m22017P(8);
        int c = AbstractC12971a.m4925c(yVar.m22002n());
        if (c == 0) {
            i = 8;
        } else {
            i = 16;
        }
        yVar.m22016Q(i);
        long F = yVar.m22027F();
        if (c == 0) {
            i2 = 4;
        }
        yVar.m22016Q(i2);
        int J = yVar.m22023J();
        return Pair.create(Long.valueOf(F), "" + ((char) (((J >> 10) & 31) + 96)) + ((char) (((J >> 5) & 31) + 96)) + ((char) ((J & 31) + 96)));
    }

    /* renamed from: m */
    public static C14576a m4905m(AbstractC12971a.C0416a aVar) {
        AbstractC12971a.C12972b g = aVar.m4921g(1751411826);
        AbstractC12971a.C12972b g2 = aVar.m4921g(1801812339);
        AbstractC12971a.C12972b g3 = aVar.m4921g(1768715124);
        if (g == null || g2 == null || g3 == null || m4908j(g.f29068b) != 1835299937) {
            return null;
        }
        C7570y yVar = g2.f29068b;
        yVar.m22017P(12);
        int n = yVar.m22002n();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            int n2 = yVar.m22002n();
            yVar.m22016Q(4);
            strArr[i] = yVar.m22032A(n2 - 8);
        }
        C7570y yVar2 = g3.f29068b;
        yVar2.m22017P(8);
        ArrayList arrayList = new ArrayList();
        while (yVar2.m22015a() > 8) {
            int e = yVar2.m22011e();
            int n3 = yVar2.m22002n();
            int n4 = yVar2.m22002n() - 1;
            if (n4 < 0 || n4 >= n) {
                C7558r.m22104h("AtomParsers", "Skipped metadata with unknown key index: " + n4);
            } else {
                C7079a f = C12988h.m4826f(yVar2, e + n3, strArr[n4]);
                if (f != null) {
                    arrayList.add(f);
                }
            }
            yVar2.m22017P(e + n3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C14576a(arrayList);
    }

    /* renamed from: n */
    private static void m4904n(C7570y yVar, int i, int i2, int i3, C12975c cVar) {
        yVar.m22017P(i2 + 8 + 8);
        if (i == 1835365492) {
            yVar.m21992x();
            String x = yVar.m21992x();
            if (x != null) {
                cVar.f29080b = new C6722k.C6724b().m24506R(i3).m24488e0(x).m24519E();
            }
        }
    }

    /* renamed from: o */
    private static long m4903o(C7570y yVar) {
        int i = 8;
        yVar.m22017P(8);
        if (AbstractC12971a.m4925c(yVar.m22002n()) != 0) {
            i = 16;
        }
        yVar.m22016Q(i);
        return yVar.m22027F();
    }

    /* renamed from: p */
    private static float m4902p(C7570y yVar, int i) {
        yVar.m22017P(i + 8);
        return yVar.m22025H() / yVar.m22025H();
    }

    /* renamed from: q */
    private static byte[] m4901q(C7570y yVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            yVar.m22017P(i3);
            int n = yVar.m22002n();
            if (yVar.m22002n() == 1886547818) {
                return Arrays.copyOfRange(yVar.m22012d(), i3, n + i3);
            }
            i3 += n;
        }
        return null;
    }

    /* renamed from: r */
    private static Pair<Integer, C12999p> m4900r(C7570y yVar, int i, int i2) {
        boolean z;
        Pair<Integer, C12999p> f;
        int e = yVar.m22011e();
        while (e - i < i2) {
            yVar.m22017P(e);
            int n = yVar.m22002n();
            if (n > 0) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22365g(z, "childAtomSize should be positive");
            if (yVar.m22002n() == 1936289382 && (f = m4912f(yVar, e, n)) != null) {
                return f;
            }
            e += n;
        }
        return null;
    }

    /* renamed from: s */
    private static C12999p m4899s(C7570y yVar, int i, int i2, String str) {
        int i3;
        int i4;
        boolean z;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            yVar.m22017P(i5);
            int n = yVar.m22002n();
            if (yVar.m22002n() == 1952804451) {
                int c = AbstractC12971a.m4925c(yVar.m22002n());
                yVar.m22016Q(1);
                if (c == 0) {
                    yVar.m22016Q(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int D = yVar.m22029D();
                    i3 = D & 15;
                    i4 = (D & 240) >> 4;
                }
                if (yVar.m22029D() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int D2 = yVar.m22029D();
                byte[] bArr2 = new byte[16];
                yVar.m22006j(bArr2, 0, 16);
                if (z && D2 == 0) {
                    int D3 = yVar.m22029D();
                    bArr = new byte[D3];
                    yVar.m22006j(bArr, 0, D3);
                }
                return new C12999p(z, str, D2, bArr2, i4, i3, bArr);
            }
            i5 += n;
        }
    }

    /* renamed from: t */
    private static C14576a m4898t(C7570y yVar, int i) {
        float f;
        yVar.m22016Q(12);
        while (yVar.m22011e() < i) {
            int e = yVar.m22011e();
            int n = yVar.m22002n();
            if (yVar.m22002n() != 1935766900) {
                yVar.m22017P(e + n);
            } else if (n < 14) {
                return null;
            } else {
                yVar.m22016Q(5);
                int D = yVar.m22029D();
                if (D != 12 && D != 13) {
                    return null;
                }
                if (D == 12) {
                    f = 240.0f;
                } else {
                    f = 120.0f;
                }
                yVar.m22016Q(1);
                return new C14576a(new C7087e(f, yVar.m22029D()));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0420 A[EDGE_INSN: B:215:0x0420->B:167:0x0420 ?: BREAK  , SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p348t7.C13001r m4897u(p348t7.C12998o r38, p348t7.AbstractC12971a.C0416a r39, p228m7.C10530u r40) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p348t7.C12973b.m4897u(t7.o, t7.a$a, m7.u):t7.r");
    }

    /* renamed from: v */
    private static C12975c m4896v(C7570y yVar, int i, int i2, String str, C9798l lVar, boolean z) {
        boolean z2;
        int i3;
        yVar.m22017P(12);
        int n = yVar.m22002n();
        C12975c cVar = new C12975c(n);
        for (int i4 = 0; i4 < n; i4++) {
            int e = yVar.m22011e();
            int n2 = yVar.m22002n();
            if (n2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7510a.m22365g(z2, "childAtomSize should be positive");
            int n3 = yVar.m22002n();
            if (n3 == 1635148593 || n3 == 1635148595 || n3 == 1701733238 || n3 == 1831958048 || n3 == 1836070006 || n3 == 1752589105 || n3 == 1751479857 || n3 == 1932670515 || n3 == 1987063864 || n3 == 1987063865 || n3 == 1635135537 || n3 == 1685479798 || n3 == 1685479729 || n3 == 1685481573 || n3 == 1685481521) {
                i3 = e;
                m4918C(yVar, n3, i3, n2, i, i2, lVar, cVar, i4);
            } else if (n3 == 1836069985 || n3 == 1701733217 || n3 == 1633889587 || n3 == 1700998451 || n3 == 1633889588 || n3 == 1685353315 || n3 == 1685353317 || n3 == 1685353320 || n3 == 1685353324 || n3 == 1935764850 || n3 == 1935767394 || n3 == 1819304813 || n3 == 1936684916 || n3 == 1953984371 || n3 == 778924082 || n3 == 778924083 || n3 == 1634492771 || n3 == 1634492791 || n3 == 1970037111 || n3 == 1332770163 || n3 == 1716281667) {
                i3 = e;
                m4913e(yVar, n3, e, n2, i, str, z, lVar, cVar, i4);
            } else {
                if (n3 == 1414810956 || n3 == 1954034535 || n3 == 2004251764 || n3 == 1937010800 || n3 == 1664495672) {
                    m4895w(yVar, n3, e, n2, i, str, cVar);
                } else if (n3 == 1835365492) {
                    m4904n(yVar, n3, e, i, cVar);
                } else if (n3 == 1667329389) {
                    cVar.f29080b = new C6722k.C6724b().m24506R(i).m24488e0("application/x-camera-motion").m24519E();
                }
                i3 = e;
            }
            yVar.m22017P(i3 + n2);
        }
        return cVar;
    }

    /* renamed from: w */
    private static void m4895w(C7570y yVar, int i, int i2, int i3, int i4, String str, C12975c cVar) {
        yVar.m22017P(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        AbstractC3884i0 i0Var = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                yVar.m22006j(bArr, 0, i5);
                i0Var = AbstractC3884i0.m33398y(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                cVar.f29082d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f29080b = new C6722k.C6724b().m24506R(i4).m24488e0(str2).m24502V(str).m24480i0(j).m24504T(i0Var).m24519E();
    }

    /* renamed from: x */
    private static C12978f m4894x(C7570y yVar) {
        int i;
        boolean z;
        long j;
        int i2 = 8;
        yVar.m22017P(8);
        int c = AbstractC12971a.m4925c(yVar.m22002n());
        if (c == 0) {
            i = 8;
        } else {
            i = 16;
        }
        yVar.m22016Q(i);
        int n = yVar.m22002n();
        yVar.m22016Q(4);
        int e = yVar.m22011e();
        if (c == 0) {
            i2 = 4;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                z = true;
                break;
            } else if (yVar.m22012d()[e + i4] != -1) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        long j2 = -9223372036854775807L;
        if (z) {
            yVar.m22016Q(i2);
        } else {
            if (c == 0) {
                j = yVar.m22027F();
            } else {
                j = yVar.m22024I();
            }
            if (j != 0) {
                j2 = j;
            }
        }
        yVar.m22016Q(16);
        int n2 = yVar.m22002n();
        int n3 = yVar.m22002n();
        yVar.m22016Q(4);
        int n4 = yVar.m22002n();
        int n5 = yVar.m22002n();
        if (n2 == 0 && n3 == 65536 && n4 == -65536 && n5 == 0) {
            i3 = 90;
        } else if (n2 == 0 && n3 == -65536 && n4 == 65536 && n5 == 0) {
            i3 = 270;
        } else if (n2 == -65536 && n3 == 0 && n4 == 0 && n5 == -65536) {
            i3 = 180;
        }
        return new C12978f(n, j2, i3);
    }

    /* renamed from: y */
    private static C12998o m4893y(AbstractC12971a.C0416a aVar, AbstractC12971a.C12972b bVar, long j, C9798l lVar, boolean z, boolean z2) {
        long j2;
        AbstractC12971a.C12972b bVar2;
        long[] jArr;
        long[] jArr2;
        AbstractC12971a.C0416a f;
        Pair<long[], long[]> g;
        AbstractC12971a.C0416a aVar2 = (AbstractC12971a.C0416a) C7510a.m22367e(aVar.m4922f(1835297121));
        int c = m4915c(m4908j(((AbstractC12971a.C12972b) C7510a.m22367e(aVar2.m4921g(1751411826))).f29068b));
        if (c == -1) {
            return null;
        }
        C12978f x = m4894x(((AbstractC12971a.C12972b) C7510a.m22367e(aVar.m4921g(1953196132))).f29068b);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = x.f29092b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long o = m4903o(bVar2.f29068b);
        if (j2 != -9223372036854775807L) {
            j3 = C7557q0.m22198I0(j2, 1000000L, o);
        }
        Pair<Long, String> l = m4906l(((AbstractC12971a.C12972b) C7510a.m22367e(aVar2.m4921g(1835296868))).f29068b);
        C12975c v = m4896v(((AbstractC12971a.C12972b) C7510a.m22367e(((AbstractC12971a.C0416a) C7510a.m22367e(((AbstractC12971a.C0416a) C7510a.m22367e(aVar2.m4922f(1835626086))).m4922f(1937007212))).m4921g(1937011556))).f29068b, x.f29091a, x.f29093c, (String) l.second, lVar, z2);
        if (z || (f = aVar.m4922f(1701082227)) == null || (g = m4911g(f)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) g.second;
            jArr2 = (long[]) g.first;
        }
        if (v.f29080b == null) {
            return null;
        }
        return new C12998o(x.f29091a, c, ((Long) l.first).longValue(), o, j3, v.f29080b, v.f29082d, v.f29079a, v.f29081c, jArr2, jArr);
    }

    /* renamed from: z */
    public static List<C13001r> m4892z(AbstractC12971a.C0416a aVar, C10530u uVar, long j, C9798l lVar, boolean z, boolean z2, AbstractC3454f<C12998o, C12998o> fVar) {
        C12998o apply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.f29067d.size(); i++) {
            AbstractC12971a.C0416a aVar2 = aVar.f29067d.get(i);
            if (aVar2.f29064a == 1953653099 && (apply = fVar.apply(m4893y(aVar2, (AbstractC12971a.C12972b) C7510a.m22367e(aVar.m4921g(1836476516)), j, lVar, z, z2))) != null) {
                arrayList.add(m4897u(apply, (AbstractC12971a.C0416a) C7510a.m22367e(((AbstractC12971a.C0416a) C7510a.m22367e(((AbstractC12971a.C0416a) C7510a.m22367e(aVar2.m4922f(1835297121))).m4922f(1835626086))).m4922f(1937007212)), uVar));
            }
        }
        return arrayList;
    }
}
