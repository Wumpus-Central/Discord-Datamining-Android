package p285pd;

import com.facebook.react.views.image.ReactImageView;
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

/* renamed from: pd.d */
/* loaded from: classes3.dex */
public final class C11624d extends AbstractC11631k {

    /* renamed from: c */
    private static final char[] f25917c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f25918d;

    /* renamed from: e */
    private static final int f25919e;

    /* renamed from: a */
    private final StringBuilder f25920a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f25921b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f25918d = iArr;
        f25919e = iArr[47];
    }

    /* renamed from: g */
    private static void m9219g(CharSequence charSequence) {
        int length = charSequence.length();
        m9218h(charSequence, length - 2, 20);
        m9218h(charSequence, length - 1, 15);
    }

    /* renamed from: h */
    private static void m9218h(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f25917c[i3 % 47]) {
            throw C6435d.m25562a();
        }
    }

    /* renamed from: i */
    private static String m9217i(CharSequence charSequence) {
        char c;
        int i;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'a' || charAt > 'd') {
                sb2.append(charAt);
            } else if (i2 < length - 1) {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 - '@';
                            c = (char) i;
                            break;
                        } else {
                            throw C6437f.m25561a();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i = charAt2 + 16;
                        } else if (charAt2 < 'P' || charAt2 > 'S') {
                            if (charAt2 >= 'T' && charAt2 <= 'Z') {
                                c = 127;
                                break;
                            } else {
                                throw C6437f.m25561a();
                            }
                        } else {
                            i = charAt2 + '+';
                        }
                        c = (char) i;
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i = charAt2 - ' ';
                            c = (char) i;
                            break;
                        } else if (charAt2 == 'Z') {
                            c = ':';
                            break;
                        } else {
                            throw C6437f.m25561a();
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 + ' ';
                            c = (char) i;
                            break;
                        } else {
                            throw C6437f.m25561a();
                        }
                    default:
                        c = 0;
                        break;
                }
                sb2.append(c);
            } else {
                throw C6437f.m25561a();
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: j */
    private int[] m9216j(C7996a aVar) {
        int j = aVar.m20932j();
        int f = aVar.m20934f(0);
        Arrays.fill(this.f25921b, 0);
        int[] iArr = this.f25921b;
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
                } else if (m9214l(iArr) == f25919e) {
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

    /* renamed from: k */
    private static char m9215k(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f25918d;
            if (i2 >= iArr.length) {
                throw C6441j.m25551a();
            } else if (iArr[i2] == i) {
                return f25917c[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: l */
    private static int m9214l(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        int[] j;
        int f = aVar.m20934f(m9216j(aVar)[1]);
        int j2 = aVar.m20932j();
        int[] iArr = this.f25921b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f25920a;
        sb2.setLength(0);
        while (true) {
            AbstractC11631k.m9200e(aVar, f, iArr);
            int l = m9214l(iArr);
            if (l >= 0) {
                char k = m9215k(l);
                sb2.append(k);
                int i2 = f;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int f2 = aVar.m20934f(i2);
                if (k == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (f2 == j2 || !aVar.m20936d(f2)) {
                        throw C6441j.m25551a();
                    } else if (sb2.length() >= 2) {
                        m9219g(sb2);
                        sb2.setLength(sb2.length() - 2);
                        float f3 = i;
                        return new Result(m9217i(sb2), null, new C6446o[]{new C6446o((j[1] + j[0]) / 2.0f, f3), new C6446o(f + (i4 / 2.0f), f3)}, EnumC6432a.CODE_93);
                    } else {
                        throw C6441j.m25551a();
                    }
                } else {
                    f = f2;
                }
            } else {
                throw C6441j.m25551a();
            }
        }
    }
}
