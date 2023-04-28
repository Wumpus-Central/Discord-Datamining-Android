package p117g7;

/* renamed from: g7.l0 */
/* loaded from: classes7.dex */
public final class C7466l0 {

    /* renamed from: a */
    private static final String[] f16107a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    private static final int[] f16108b = {44100, 48000, 32000};

    /* renamed from: c */
    private static final int[] f16109c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    private static final int[] f16110d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    private static final int[] f16111e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    private static final int[] f16112f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    private static final int[] f16113g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: g7.l0$a */
    /* loaded from: classes7.dex */
    public static final class C7467a {

        /* renamed from: a */
        public int f16114a;

        /* renamed from: b */
        public String f16115b;

        /* renamed from: c */
        public int f16116c;

        /* renamed from: d */
        public int f16117d;

        /* renamed from: e */
        public int f16118e;

        /* renamed from: f */
        public int f16119f;

        /* renamed from: g */
        public int f16120g;

        /* renamed from: a */
        public boolean m22563a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            if (!C7466l0.m22565l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f16114a = i2;
            this.f16115b = C7466l0.f16107a[3 - i3];
            int i8 = C7466l0.f16108b[i5];
            this.f16117d = i8;
            int i9 = 2;
            if (i2 == 2) {
                this.f16117d = i8 / 2;
            } else if (i2 == 0) {
                this.f16117d = i8 / 4;
            }
            int i10 = (i >>> 9) & 1;
            this.f16120g = C7466l0.m22566k(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i7 = C7466l0.f16109c[i4 - 1];
                } else {
                    i7 = C7466l0.f16110d[i4 - 1];
                }
                this.f16119f = i7;
                this.f16116c = (((i7 * 12) / this.f16117d) + i10) * 4;
            } else {
                int i11 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = C7466l0.f16111e[i4 - 1];
                    } else {
                        i6 = C7466l0.f16112f[i4 - 1];
                    }
                    this.f16119f = i6;
                    this.f16116c = ((i6 * 144) / this.f16117d) + i10;
                } else {
                    int i12 = C7466l0.f16113g[i4 - 1];
                    this.f16119f = i12;
                    if (i3 == 1) {
                        i11 = 72;
                    }
                    this.f16116c = ((i11 * i12) / this.f16117d) + i10;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i9 = 1;
            }
            this.f16118e = i9;
            return true;
        }
    }

    /* renamed from: j */
    public static int m22567j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!m22565l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f16108b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = f16109c[i4 - 1];
            } else {
                i7 = f16110d[i4 - 1];
            }
            return (((i7 * 12) / i8) + i9) * 4;
        }
        if (i2 != 3) {
            i6 = f16113g[i4 - 1];
        } else if (i3 == 2) {
            i6 = f16111e[i4 - 1];
        } else {
            i6 = f16112f[i4 - 1];
        }
        int i10 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i8) + i9;
        }
        if (i3 == 1) {
            i10 = 72;
        }
        return ((i10 * i6) / i8) + i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m22566k(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m22565l(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* renamed from: m */
    public static int m22564m(int i) {
        int i2;
        int i3;
        if (!m22565l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m22566k(i2, i3);
    }
}
