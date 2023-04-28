package p119g9;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p163j$.util.Spliterator;

/* renamed from: g9.w */
/* loaded from: classes5.dex */
public final class C7566w {

    /* renamed from: a */
    public static final byte[] f16395a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f16396b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f16397c = new Object();

    /* renamed from: d */
    private static int[] f16398d = new int[10];

    /* renamed from: g9.w$a */
    /* loaded from: classes5.dex */
    public static final class C7567a {

        /* renamed from: a */
        public final int f16399a;

        /* renamed from: b */
        public final int f16400b;

        /* renamed from: c */
        public final boolean f16401c;

        public C7567a(int i, int i2, boolean z) {
            this.f16399a = i;
            this.f16400b = i2;
            this.f16401c = z;
        }
    }

    /* renamed from: g9.w$b */
    /* loaded from: classes5.dex */
    public static final class C7568b {

        /* renamed from: a */
        public final int f16402a;

        /* renamed from: b */
        public final int f16403b;

        /* renamed from: c */
        public final int f16404c;

        /* renamed from: d */
        public final int f16405d;

        /* renamed from: e */
        public final int f16406e;

        /* renamed from: f */
        public final int f16407f;

        /* renamed from: g */
        public final float f16408g;

        /* renamed from: h */
        public final boolean f16409h;

        /* renamed from: i */
        public final boolean f16410i;

        /* renamed from: j */
        public final int f16411j;

        /* renamed from: k */
        public final int f16412k;

        /* renamed from: l */
        public final int f16413l;

        /* renamed from: m */
        public final boolean f16414m;

        public C7568b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f16402a = i;
            this.f16403b = i2;
            this.f16404c = i3;
            this.f16405d = i4;
            this.f16406e = i5;
            this.f16407f = i6;
            this.f16408g = f;
            this.f16409h = z;
            this.f16410i = z2;
            this.f16411j = i7;
            this.f16412k = i8;
            this.f16413l = i9;
            this.f16414m = z3;
        }
    }

    /* renamed from: a */
    public static void m22062a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m22061b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: c */
    public static int m22060c(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i2 - i;
        boolean z4 = false;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m22062a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m22062a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m22062a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z2 = false;
            } else {
                z2 = true;
            }
            zArr[0] = z2;
            if (i3 <= 1 ? !zArr[2] || bArr[i4] != 0 : !(bArr[i2 - 2] == 0 && bArr[i4] == 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            zArr[1] = z3;
            if (bArr[i4] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i2;
        } else {
            m22062a(zArr);
            return i - 1;
        }
    }

    /* renamed from: d */
    private static int m22059d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m22058e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m22057f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m22056g(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static C7567a m22055h(byte[] bArr, int i, int i2) {
        C7571z zVar = new C7571z(bArr, i, i2);
        zVar.m21978l(8);
        int h = zVar.m21982h();
        int h2 = zVar.m21982h();
        zVar.m21979k();
        return new C7567a(h, h2, zVar.m21986d());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p119g9.C7566w.C7568b m22054i(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p119g9.C7566w.m22054i(byte[], int, int):g9.w$b");
    }

    /* renamed from: j */
    private static void m22053j(C7571z zVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((zVar.m21983g() + i3) + Spliterator.NONNULL) % Spliterator.NONNULL;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: k */
    public static int m22052k(byte[] bArr, int i) {
        int i2;
        synchronized (f16397c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m22059d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = f16398d;
                        if (iArr.length <= i4) {
                            f16398d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f16398d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f16398d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
