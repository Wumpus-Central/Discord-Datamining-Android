package p285pd;

import com.facebook.react.views.text.TypefaceStyle;
import com.google.zxing.Result;
import java.util.Arrays;
import java.util.Map;
import p066dd.C6435d;
import p066dd.C6437f;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p137hd.C7996a;

/* renamed from: pd.c */
/* loaded from: classes3.dex */
public final class C11623c extends AbstractC11631k {

    /* renamed from: e */
    static final int[] f25912e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, TypefaceStyle.NORMAL, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    private final boolean f25913a;

    /* renamed from: b */
    private final boolean f25914b;

    /* renamed from: c */
    private final StringBuilder f25915c;

    /* renamed from: d */
    private final int[] f25916d;

    public C11623c() {
        this(false);
    }

    /* renamed from: g */
    private static String m9223g(CharSequence charSequence) {
        char c;
        int i;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c = ':';
                                    sb2.append(c);
                                } else {
                                    throw C6437f.m25561a();
                                }
                            }
                            c = 0;
                            sb2.append(c);
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw C6437f.m25561a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 < 'P' || charAt2 > 'T') {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c = '@';
                            } else if (charAt2 == 'W') {
                                c = '`';
                            } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                                c = 127;
                            } else {
                                throw C6437f.m25561a();
                            }
                            sb2.append(c);
                        }
                        c = 0;
                        sb2.append(c);
                    } else {
                        i = charAt2 + '+';
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw C6437f.m25561a();
                } else {
                    i = charAt2 - '@';
                }
                c = (char) i;
                sb2.append(c);
            } else {
                sb2.append(charAt);
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: h */
    private static int[] m9222h(C7996a aVar, int[] iArr) {
        int j = aVar.m20932j();
        int f = aVar.m20934f(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = f;
        while (f < j) {
            if (aVar.m20936d(f) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i != length - 1) {
                    i++;
                } else if (m9220j(iArr) == 148 && aVar.m20931k(Math.max(0, i2 - ((f - i2) / 2)), i2, false)) {
                    return new int[]{i2, f};
                } else {
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            f++;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: i */
    private static char m9221i(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f25912e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw C6441j.m25551a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r1 >= r0) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r3 <= 0) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        r2 = r10[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r2 <= r4) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        if ((r2 << 1) < r6) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return r5;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m9220j(int[] r10) {
        /*
            int r0 = r10.length
            r1 = 0
            r2 = r1
        L_0x0003:
            int r3 = r10.length
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
        L_0x0008:
            if (r5 >= r3) goto L_0x0014
            r6 = r10[r5]
            if (r6 >= r4) goto L_0x0011
            if (r6 <= r2) goto L_0x0011
            r4 = r6
        L_0x0011:
            int r5 = r5 + 1
            goto L_0x0008
        L_0x0014:
            r2 = r1
            r3 = r2
            r5 = r3
            r6 = r5
        L_0x0018:
            if (r2 >= r0) goto L_0x002b
            r7 = r10[r2]
            if (r7 <= r4) goto L_0x0028
            int r8 = r0 + (-1)
            int r8 = r8 - r2
            r9 = 1
            int r8 = r9 << r8
            r5 = r5 | r8
            int r3 = r3 + 1
            int r6 = r6 + r7
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x002b:
            r2 = 3
            r7 = -1
            if (r3 != r2) goto L_0x0042
        L_0x002f:
            if (r1 >= r0) goto L_0x0041
            if (r3 <= 0) goto L_0x0041
            r2 = r10[r1]
            if (r2 <= r4) goto L_0x003e
            int r3 = r3 + (-1)
            int r2 = r2 << 1
            if (r2 < r6) goto L_0x003e
            return r7
        L_0x003e:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x0041:
            return r5
        L_0x0042:
            if (r3 > r2) goto L_0x0045
            return r7
        L_0x0045:
            r2 = r4
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: p285pd.C11623c.m9220j(int[]):int");
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        int[] h;
        String str;
        int[] iArr = this.f25916d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f25915c;
        sb2.setLength(0);
        int f = aVar.m20934f(m9222h(aVar, iArr)[1]);
        int j = aVar.m20932j();
        while (true) {
            AbstractC11631k.m9200e(aVar, f, iArr);
            int j2 = m9220j(iArr);
            if (j2 >= 0) {
                char i2 = m9221i(j2);
                sb2.append(i2);
                int i3 = f;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int f2 = aVar.m20934f(i3);
                if (i2 == '*') {
                    sb2.setLength(sb2.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (f2 - f) - i5;
                    if (f2 == j || (i7 << 1) >= i5) {
                        if (this.f25913a) {
                            int length = sb2.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f25915c.charAt(i9));
                            }
                            if (sb2.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8 % 43)) {
                                sb2.setLength(length);
                            } else {
                                throw C6435d.m25562a();
                            }
                        }
                        if (sb2.length() != 0) {
                            if (this.f25914b) {
                                str = m9223g(sb2);
                            } else {
                                str = sb2.toString();
                            }
                            float f3 = i;
                            return new Result(str, null, new C6446o[]{new C6446o((h[1] + h[0]) / 2.0f, f3), new C6446o(f + (i5 / 2.0f), f3)}, EnumC6432a.CODE_39);
                        }
                        throw C6441j.m25551a();
                    }
                    throw C6441j.m25551a();
                }
                f = f2;
            } else {
                throw C6441j.m25551a();
            }
        }
    }

    public C11623c(boolean z) {
        this(z, false);
    }

    public C11623c(boolean z, boolean z2) {
        this.f25913a = z;
        this.f25914b = z2;
        this.f25915c = new StringBuilder(20);
        this.f25916d = new int[9];
    }
}
