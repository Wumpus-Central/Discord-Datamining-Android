package p368ud;

import java.math.BigInteger;
import java.util.Arrays;
import p066dd.C6437f;
import td.C13056c;

/* renamed from: ud.e */
/* loaded from: classes3.dex */
final class C13261e {

    /* renamed from: a */
    private static final char[] f29770a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f29771b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f29772c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.e$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C13262a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29773a;

        static {
            int[] iArr = new int[EnumC13263b.values().length];
            f29773a = iArr;
            try {
                iArr[EnumC13263b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29773a[EnumC13263b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29773a[EnumC13263b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29773a[EnumC13263b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29773a[EnumC13263b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29773a[EnumC13263b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ud.e$b */
    /* loaded from: classes3.dex */
    public enum EnumC13263b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f29772c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f29772c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m4176a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p368ud.C13261e.m4176a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p137hd.C8000e m4175b(int[] r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            td.c r3 = new td.c
            r3.<init>()
            r4 = 2
        L_0x0012:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L_0x006d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L_0x0058
            switch(r2) {
                case 900: goto L_0x0053;
                case 901: goto L_0x004e;
                case 902: goto L_0x0049;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r2) {
                case 922: goto L_0x0044;
                case 923: goto L_0x0044;
                case 924: goto L_0x004e;
                case 925: goto L_0x0041;
                case 926: goto L_0x003e;
                case 927: goto L_0x002d;
                case 928: goto L_0x0028;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r4 = r4 + (-1)
            int r2 = m4170g(r6, r4, r0)
            goto L_0x0060
        L_0x0028:
            int r2 = m4173d(r6, r4, r3)
            goto L_0x0060
        L_0x002d:
            int r2 = r4 + 1
            r1 = r6[r4]
            hd.d r1 = p137hd.EnumC7999d.m20907a(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L_0x0060
        L_0x003e:
            int r2 = r4 + 2
            goto L_0x0060
        L_0x0041:
            int r2 = r4 + 1
            goto L_0x0060
        L_0x0044:
            dd.f r6 = p066dd.C6437f.m25561a()
            throw r6
        L_0x0049:
            int r2 = m4171f(r6, r4, r0)
            goto L_0x0060
        L_0x004e:
            int r2 = m4176a(r2, r6, r1, r4, r0)
            goto L_0x0060
        L_0x0053:
            int r2 = m4170g(r6, r4, r0)
            goto L_0x0060
        L_0x0058:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L_0x0060:
            int r4 = r6.length
            if (r2 >= r4) goto L_0x0068
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L_0x0012
        L_0x0068:
            dd.f r6 = p066dd.C6437f.m25561a()
            throw r6
        L_0x006d:
            int r6 = r0.length()
            if (r6 == 0) goto L_0x0081
            hd.e r6 = new hd.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.m20894m(r3)
            return r6
        L_0x0081:
            dd.f r6 = p066dd.C6437f.m25561a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p368ud.C13261e.m4175b(int[], java.lang.String):hd.e");
    }

    /* renamed from: c */
    private static String m4174c(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f29772c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C6437f.m25561a();
    }

    /* renamed from: d */
    static int m4173d(int[] iArr, int i, C13056c cVar) {
        int i2;
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i3 = 0;
            while (i3 < 2) {
                iArr2[i3] = iArr[i];
                i3++;
                i++;
            }
            cVar.m4682j(Integer.parseInt(m4174c(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int g = m4170g(iArr, i, sb2);
            cVar.m4688d(sb2.toString());
            if (iArr[g] == 923) {
                i2 = g + 1;
            } else {
                i2 = -1;
            }
            while (g < iArr[0]) {
                int i4 = iArr[g];
                if (i4 == 922) {
                    g++;
                    cVar.m4685g(true);
                } else if (i4 == 923) {
                    int i5 = g + 1;
                    switch (iArr[i5]) {
                        case 0:
                            StringBuilder sb3 = new StringBuilder();
                            g = m4170g(iArr, i5 + 1, sb3);
                            cVar.m4687e(sb3.toString());
                            continue;
                        case 1:
                            StringBuilder sb4 = new StringBuilder();
                            g = m4171f(iArr, i5 + 1, sb4);
                            cVar.m4683i(Integer.parseInt(sb4.toString()));
                            continue;
                        case 2:
                            StringBuilder sb5 = new StringBuilder();
                            g = m4171f(iArr, i5 + 1, sb5);
                            cVar.m4680l(Long.parseLong(sb5.toString()));
                            continue;
                        case 3:
                            StringBuilder sb6 = new StringBuilder();
                            g = m4170g(iArr, i5 + 1, sb6);
                            cVar.m4681k(sb6.toString());
                            continue;
                        case 4:
                            StringBuilder sb7 = new StringBuilder();
                            g = m4170g(iArr, i5 + 1, sb7);
                            cVar.m4690b(sb7.toString());
                            continue;
                        case 5:
                            StringBuilder sb8 = new StringBuilder();
                            g = m4171f(iArr, i5 + 1, sb8);
                            cVar.m4686f(Long.parseLong(sb8.toString()));
                            continue;
                        case 6:
                            StringBuilder sb9 = new StringBuilder();
                            g = m4171f(iArr, i5 + 1, sb9);
                            cVar.m4689c(Integer.parseInt(sb9.toString()));
                            continue;
                        default:
                            throw C6437f.m25561a();
                    }
                } else {
                    throw C6437f.m25561a();
                }
            }
            if (i2 != -1) {
                int i6 = g - i2;
                if (cVar.m4691a()) {
                    i6--;
                }
                cVar.m4684h(Arrays.copyOfRange(iArr, i2, i6 + i2));
            }
            return g;
        }
        throw C6437f.m25561a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static void m4172e(int[] iArr, int[] iArr2, int i, StringBuilder sb2) {
        EnumC13263b bVar;
        int i2;
        EnumC13263b bVar2 = EnumC13263b.ALPHA;
        EnumC13263b bVar3 = bVar2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c = ' ';
            switch (C13262a.f29773a[bVar2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 == 900) {
                            bVar2 = EnumC13263b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    bVar2 = EnumC13263b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = EnumC13263b.MIXED;
                                    break;
                                case 29:
                                    bVar = EnumC13263b.PUNCT_SHIFT;
                                    c = 0;
                                    bVar3 = bVar2;
                                    bVar2 = bVar;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 == 900) {
                            bVar2 = EnumC13263b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    bVar = EnumC13263b.ALPHA_SHIFT;
                                    c = 0;
                                    bVar3 = bVar2;
                                    bVar2 = bVar;
                                    break;
                                case 28:
                                    bVar2 = EnumC13263b.MIXED;
                                    break;
                                case 29:
                                    bVar = EnumC13263b.PUNCT_SHIFT;
                                    c = 0;
                                    bVar3 = bVar2;
                                    bVar2 = bVar;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                case 3:
                    if (i4 < 25) {
                        c = f29771b[i4];
                        break;
                    } else {
                        if (i4 == 900) {
                            bVar2 = EnumC13263b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 25:
                                    bVar2 = EnumC13263b.PUNCT;
                                    break;
                                case 27:
                                    bVar2 = EnumC13263b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = EnumC13263b.ALPHA;
                                    break;
                                case 29:
                                    bVar = EnumC13263b.PUNCT_SHIFT;
                                    c = 0;
                                    bVar3 = bVar2;
                                    bVar2 = bVar;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                case 4:
                    if (i4 < 29) {
                        c = f29770a[i4];
                        break;
                    } else {
                        if (i4 == 29) {
                            bVar2 = EnumC13263b.ALPHA;
                        } else if (i4 == 900) {
                            bVar2 = EnumC13263b.ALPHA;
                        } else if (i4 == 913) {
                            sb2.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                case 5:
                    if (i4 >= 26) {
                        if (i4 != 26) {
                            if (i4 != 900) {
                                bVar2 = bVar3;
                            } else {
                                bVar2 = EnumC13263b.ALPHA;
                            }
                            c = 0;
                            break;
                        }
                    } else {
                        c = (char) (i4 + 65);
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i4 >= 29) {
                        if (i4 == 29) {
                            bVar2 = EnumC13263b.ALPHA;
                        } else if (i4 != 900) {
                            if (i4 == 913) {
                                sb2.append((char) iArr2[i3]);
                            }
                            c = 0;
                        } else {
                            bVar2 = EnumC13263b.ALPHA;
                        }
                        c = 0;
                        break;
                    } else {
                        c = f29770a[i4];
                    }
                    bVar2 = bVar3;
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                sb2.append(c);
            }
        }
    }

    /* renamed from: f */
    private static int m4171f(int[] iArr, int i, StringBuilder sb2) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (!(i5 == 900 || i5 == 901 || i5 == 928)) {
                        switch (i5) {
                        }
                    }
                    i4--;
                    z = true;
                }
                if ((i2 % 15 == 0 || i5 == 902 || z) && i2 > 0) {
                    sb2.append(m4174c(iArr2, i2));
                    i2 = 0;
                }
                i = i4;
            }
        }
        return i;
    }

    /* renamed from: g */
    private static int m4170g(int[] iArr, int i, StringBuilder sb2) {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) << 1];
        int[] iArr3 = new int[(i2 - i) << 1];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                            }
                    }
                }
                i = i4 - 1;
                z = true;
            } else {
                iArr2[i3] = 913;
                i = i4 + 1;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        m4172e(iArr2, iArr3, i3, sb2);
        return i;
    }
}
