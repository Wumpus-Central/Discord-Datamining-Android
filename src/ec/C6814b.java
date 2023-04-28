package ec;

import com.facebook.react.uimanager.ViewDefaults;
import java.math.RoundingMode;

/* renamed from: ec.b */
/* loaded from: classes3.dex */
public final class C6814b {

    /* renamed from: a */
    static final byte[] f14891a = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* renamed from: b */
    static final long[] f14892b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: c */
    static final long[] f14893c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* renamed from: d */
    static final long[] f14894d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* renamed from: e */
    static final int[] f14895e = {ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* renamed from: f */
    static final int[] f14896f = {ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* renamed from: g */
    private static final long[][] f14897g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* renamed from: ec.b$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C6815a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14898a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f14898a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14898a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14898a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14898a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14898a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14898a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14898a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14898a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r11 > 0) goto L_0x0062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r9 > 0) goto L_0x0062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r9 < 0) goto L_0x0062;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m24296a(long r9, long r11, java.math.RoundingMode r13) {
        /*
            p030bc.C3457i.m34352i(r13)
            long r0 = r9 / r11
            long r2 = r11 * r0
            long r2 = r9 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0010
            return r0
        L_0x0010:
            long r9 = r9 ^ r11
            r7 = 63
            long r9 = r9 >> r7
            int r9 = (int) r9
            r10 = 1
            r9 = r9 | r10
            int[] r7 = ec.C6814b.C6815a.f14898a
            int r8 = r13.ordinal()
            r7 = r7[r8]
            r8 = 0
            switch(r7) {
                case 1: goto L_0x005a;
                case 2: goto L_0x0061;
                case 3: goto L_0x0057;
                case 4: goto L_0x0062;
                case 5: goto L_0x0054;
                case 6: goto L_0x0029;
                case 7: goto L_0x0029;
                case 8: goto L_0x0029;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x0029:
            long r2 = java.lang.Math.abs(r2)
            long r11 = java.lang.Math.abs(r11)
            long r11 = r11 - r2
            long r2 = r2 - r11
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x0051
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            if (r13 != r11) goto L_0x003d
            r11 = r10
            goto L_0x003e
        L_0x003d:
            r11 = r8
        L_0x003e:
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r12) goto L_0x0044
            r12 = r10
            goto L_0x0045
        L_0x0044:
            r12 = r8
        L_0x0045:
            r2 = 1
            long r2 = r2 & r0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r10 = r8
        L_0x004e:
            r10 = r10 & r12
            r10 = r10 | r11
            goto L_0x0062
        L_0x0051:
            if (r11 <= 0) goto L_0x0061
            goto L_0x0062
        L_0x0054:
            if (r9 <= 0) goto L_0x0061
            goto L_0x0062
        L_0x0057:
            if (r9 >= 0) goto L_0x0061
            goto L_0x0062
        L_0x005a:
            if (r6 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r10 = r8
        L_0x005e:
            ec.C6816c.m24293c(r10)
        L_0x0061:
            r10 = r8
        L_0x0062:
            if (r10 == 0) goto L_0x0066
            long r9 = (long) r9
            long r0 = r0 + r9
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.C6814b.m24296a(long, long, java.math.RoundingMode):long");
    }
}
