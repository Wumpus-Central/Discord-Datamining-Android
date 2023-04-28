package p104fd;

import com.discord.nearby.NearbyManager;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Arrays;
import p066dd.C6437f;
import p084ed.C6817a;
import p137hd.C7997b;
import p137hd.C8000e;
import p178jd.C9558a;
import p178jd.C9560c;
import p178jd.C9561d;

/* renamed from: fd.a */
/* loaded from: classes3.dex */
public final class C7119a {

    /* renamed from: b */
    private static final String[] f15512b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f15513c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f15514d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f15515e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f15516f = {"CTRL_PS", " ", "0", NearbyManager.PERMISSION_DENIED, "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C6817a f15517a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fd.a$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C0218a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15518a;

        static {
            int[] iArr = new int[EnumC7120b.values().length];
            f15518a = iArr;
            try {
                iArr[EnumC7120b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15518a[EnumC7120b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15518a[EnumC7120b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15518a[EnumC7120b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15518a[EnumC7120b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fd.a$b */
    /* loaded from: classes3.dex */
    public enum EnumC7120b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m23350a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m23343h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m23349b(boolean[] zArr) {
        int i;
        C9558a aVar;
        boolean z;
        boolean z2;
        if (this.f15517a.m24291d() <= 2) {
            aVar = C9558a.f21173j;
            i = 6;
        } else {
            i = 8;
            if (this.f15517a.m24291d() <= 8) {
                aVar = C9558a.f21177n;
            } else if (this.f15517a.m24291d() <= 22) {
                aVar = C9558a.f21172i;
                i = 10;
            } else {
                aVar = C9558a.f21171h;
                i = 12;
            }
        }
        int c = this.f15517a.m24292c();
        int length = zArr.length / i;
        if (length >= c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m23342i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C9560c(aVar).m15987a(iArr, length - c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw C6437f.m25561a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[(c * i) - i4];
                int i7 = 0;
                for (int i8 = 0; i8 < c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        int i10 = (i7 + i) - 1;
                        if (i9 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i7, i10, z);
                        i7 += i - 1;
                    } else {
                        int i11 = i - 1;
                        while (i11 >= 0) {
                            int i12 = i7 + 1;
                            if (((1 << i11) & i9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i7] = z2;
                            i11--;
                            i7 = i12;
                        }
                    }
                }
                return zArr2;
            } catch (C9561d e) {
                throw C6437f.m25560b(e);
            }
        } else {
            throw C6437f.m25561a();
        }
    }

    /* renamed from: d */
    private boolean[] m23347d(C7997b bVar) {
        int i;
        int i2;
        boolean e = this.f15517a.m24290e();
        int d = this.f15517a.m24291d();
        if (e) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (d << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[m23341j(d, e)];
        int i4 = 2;
        if (e) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < d) {
            int i12 = (d - i10) << i4;
            if (e) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i13 = i12 + i2;
            int i14 = i10 << 1;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 << 1;
                int i18 = 0;
                while (i18 < i4) {
                    int i19 = i14 + i18;
                    int i20 = i14 + i16;
                    zArr[i11 + i17 + i18] = bVar.m20923e(iArr[i19], iArr[i20]);
                    int i21 = i15 - i18;
                    zArr[(i13 * 2) + i11 + i17 + i18] = bVar.m20923e(iArr[i20], iArr[i21]);
                    int i22 = i15 - i16;
                    zArr[(i13 * 4) + i11 + i17 + i18] = bVar.m20923e(iArr[i21], iArr[i22]);
                    zArr[(i13 * 6) + i11 + i17 + i18] = bVar.m20923e(iArr[i22], iArr[i19]);
                    i18++;
                    d = d;
                    e = e;
                    i4 = 2;
                }
                i16++;
                i4 = 2;
            }
            i11 += i13 << 3;
            i10++;
            i4 = 2;
        }
        return zArr;
    }

    /* renamed from: e */
    private static String m23346e(EnumC7120b bVar, int i) {
        int i2 = C0218a.f15518a[bVar.ordinal()];
        if (i2 == 1) {
            return f15512b[i];
        }
        if (i2 == 2) {
            return f15513c[i];
        }
        if (i2 == 3) {
            return f15514d[i];
        }
        if (i2 == 4) {
            return f15515e[i];
        }
        if (i2 == 5) {
            return f15516f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: f */
    private static String m23345f(boolean[] zArr) {
        int i;
        int length = zArr.length;
        EnumC7120b bVar = EnumC7120b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        EnumC7120b bVar2 = bVar;
        int i2 = 0;
        while (i2 < length) {
            if (bVar == EnumC7120b.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int i3 = m23342i(zArr, i2, 5);
                i2 += 5;
                if (i3 == 0) {
                    if (length - i2 < 11) {
                        break;
                    }
                    i3 = m23342i(zArr, i2, 11) + 31;
                    i2 += 11;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        break;
                    } else if (length - i2 < 8) {
                        i2 = length;
                        break;
                    } else {
                        sb2.append((char) m23342i(zArr, i2, 8));
                        i2 += 8;
                        i4++;
                    }
                }
                bVar = bVar2;
            } else {
                if (bVar == EnumC7120b.DIGIT) {
                    i = 4;
                } else {
                    i = 5;
                }
                if (length - i2 < i) {
                    break;
                }
                int i5 = m23342i(zArr, i2, i);
                i2 += i;
                String e = m23346e(bVar, i5);
                if (e.startsWith("CTRL_")) {
                    bVar2 = m23344g(e.charAt(5));
                    if (e.charAt(6) != 'L') {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                } else {
                    sb2.append(e);
                }
                bVar = bVar2;
            }
        }
        return sb2.toString();
    }

    /* renamed from: g */
    private static EnumC7120b m23344g(char c) {
        if (c == 'B') {
            return EnumC7120b.BINARY;
        }
        if (c == 'D') {
            return EnumC7120b.DIGIT;
        }
        if (c == 'P') {
            return EnumC7120b.PUNCT;
        }
        if (c == 'L') {
            return EnumC7120b.LOWER;
        }
        if (c != 'M') {
            return EnumC7120b.UPPER;
        }
        return EnumC7120b.MIXED;
    }

    /* renamed from: h */
    private static byte m23343h(boolean[] zArr, int i) {
        int i2;
        int length = zArr.length - i;
        if (length >= 8) {
            i2 = m23342i(zArr, i, 8);
        } else {
            i2 = m23342i(zArr, i, length) << (8 - length);
        }
        return (byte) i2;
    }

    /* renamed from: i */
    private static int m23342i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: j */
    private static int m23341j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: c */
    public C8000e m23348c(C6817a aVar) {
        this.f15517a = aVar;
        boolean[] b = m23349b(m23347d(aVar.m20893a()));
        C8000e eVar = new C8000e(m23350a(b), m23345f(b), null, null);
        eVar.m20895l(b.length);
        return eVar;
    }
}
