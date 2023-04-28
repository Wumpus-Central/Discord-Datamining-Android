package p076e4;

/* renamed from: e4.e */
/* loaded from: classes7.dex */
public enum EnumC6704e {
    YES,
    NO,
    UNSET;

    /* renamed from: e4.e$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C6705a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14261a;

        static {
            int[] iArr = new int[EnumC6704e.values().length];
            f14261a = iArr;
            try {
                iArr[EnumC6704e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14261a[EnumC6704e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14261a[EnumC6704e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: c */
    public static EnumC6704e m24610c(boolean z) {
        return z ? YES : NO;
    }

    /* renamed from: a */
    public boolean m24612a() {
        int i = C6705a.f14261a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
    }

    /* renamed from: b */
    public boolean m24611b() {
        return this != UNSET;
    }
}
