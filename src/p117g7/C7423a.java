package p117g7;

import p079e7.C6728o;
import p119g9.C7558r;
import p119g9.C7569x;

/* renamed from: g7.a */
/* loaded from: classes7.dex */
public final class C7423a {

    /* renamed from: a */
    private static final int[] f15991a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f15992b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: g7.a$b */
    /* loaded from: classes7.dex */
    public static final class C7424b {

        /* renamed from: a */
        public final int f15993a;

        /* renamed from: b */
        public final int f15994b;

        /* renamed from: c */
        public final String f15995c;

        private C7424b(int i, int i2, String str) {
            this.f15993a = i;
            this.f15994b = i2;
            this.f15995c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m22706a(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f15991a;
            if (i5 >= iArr.length) {
                break;
            }
            if (i == iArr[i5]) {
                i4 = i5;
            }
            i5++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f15992b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m22705b(2, i4, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    /* renamed from: b */
    public static byte[] m22705b(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: c */
    private static int m22704c(C7569x xVar) {
        int h = xVar.m22044h(5);
        if (h == 31) {
            return xVar.m22044h(6) + 32;
        }
        return h;
    }

    /* renamed from: d */
    public static int m22703d(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* renamed from: e */
    private static int m22702e(C7569x xVar) {
        int h = xVar.m22044h(4);
        if (h == 15) {
            return xVar.m22044h(24);
        }
        if (h < 13) {
            return f15991a[h];
        }
        throw new C6728o();
    }

    /* renamed from: f */
    public static C7424b m22701f(C7569x xVar, boolean z) {
        int c = m22704c(xVar);
        int e = m22702e(xVar);
        int h = xVar.m22044h(4);
        String str = "mp4a.40." + c;
        if (c == 5 || c == 29) {
            e = m22702e(xVar);
            c = m22704c(xVar);
            if (c == 22) {
                h = xVar.m22044h(4);
            }
        }
        if (z) {
            if (!(c == 1 || c == 2 || c == 3 || c == 4 || c == 6 || c == 7 || c == 17)) {
                switch (c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C6728o("Unsupported audio object type: " + c);
                }
            }
            m22699h(xVar, c, h);
            switch (c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = xVar.m22044h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw new C6728o("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = f15992b[h];
        if (i != -1) {
            return new C7424b(e, i, str);
        }
        throw new C6728o();
    }

    /* renamed from: g */
    public static C7424b m22700g(byte[] bArr) {
        return m22701f(new C7569x(bArr), false);
    }

    /* renamed from: h */
    private static void m22699h(C7569x xVar, int i, int i2) {
        if (xVar.m22045g()) {
            C7558r.m22104h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xVar.m22045g()) {
            xVar.m22034r(14);
        }
        boolean g = xVar.m22045g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                xVar.m22034r(3);
            }
            if (g) {
                if (i == 22) {
                    xVar.m22034r(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    xVar.m22034r(3);
                }
                xVar.m22034r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
