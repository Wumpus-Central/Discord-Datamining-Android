package ec;

import com.facebook.react.uimanager.ViewDefaults;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.math.RoundingMode;
import p103fc.C7115d;

/* renamed from: ec.a */
/* loaded from: classes3.dex */
public final class C6813a {

    /* renamed from: a */
    static final byte[] f14885a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    static final int[] f14886b = {1, 10, 100, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c */
    static final int[] f14887c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, ViewDefaults.NUMBER_OF_LINES};

    /* renamed from: d */
    private static final int[] f14888d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e */
    static int[] f14889e = {ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ec.a$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C0207a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14890a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f14890a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14890a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14890a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14890a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14890a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14890a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14890a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14890a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m24302a(int i) {
        boolean z = false;
        boolean z2 = i > 0;
        if ((i & (i - 1)) == 0) {
            z = true;
        }
        return z2 & z;
    }

    /* renamed from: b */
    static int m24301b(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public static int m24300c(int i, RoundingMode roundingMode) {
        C6816c.m24294b("x", i);
        switch (C0207a.f14890a[roundingMode.ordinal()]) {
            case 1:
                C6816c.m24293c(m24302a(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + m24301b((-1257966797) >>> numberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: d */
    public static int m24299d(int i, int i2) {
        return C7115d.m23359i(i * i2);
    }

    /* renamed from: e */
    public static int m24298e(int i, RoundingMode roundingMode) {
        boolean z;
        int b;
        C6816c.m24295a("x", i);
        int f = m24297f(i);
        switch (C0207a.f14890a[roundingMode.ordinal()]) {
            case 1:
                if (f * f == i) {
                    z = true;
                } else {
                    z = false;
                }
                C6816c.m24293c(z);
                return f;
            case 2:
            case 3:
                return f;
            case 4:
            case 5:
                b = m24301b(f * f, i);
                return f + b;
            case 6:
            case 7:
            case 8:
                b = m24301b((f * f) + f, i);
                return f + b;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: f */
    private static int m24297f(int i) {
        return (int) Math.sqrt(i);
    }
}
