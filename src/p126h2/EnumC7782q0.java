package p126h2;

/* renamed from: h2.q0 */
/* loaded from: classes.dex */
public enum EnumC7782q0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: h2.q0$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C7783a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16973a;

        static {
            int[] iArr = new int[EnumC7782q0.values().length];
            f16973a = iArr;
            try {
                iArr[EnumC7782q0.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16973a[EnumC7782q0.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16973a[EnumC7782q0.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public boolean m21327a(int i, boolean z, int i2) {
        int i3 = C7783a.f16973a[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
