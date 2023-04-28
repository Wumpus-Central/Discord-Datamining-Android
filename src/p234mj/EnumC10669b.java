package p234mj;

/* renamed from: mj.b */
/* loaded from: classes8.dex */
public enum EnumC10669b {
    PROLEPTIC_JULIAN,
    PROLEPTIC_GREGORIAN,
    SWEDEN,
    INTRODUCTION_ON_1582_10_15,
    SINGLE_CUTOVER_DATE,
    PROLEPTIC_BYZANTINE;

    /* renamed from: mj.b$a */
    /* loaded from: classes8.dex */
    static /* synthetic */ class C10670a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23604a;

        static {
            int[] iArr = new int[EnumC10669b.values().length];
            f23604a = iArr;
            try {
                iArr[EnumC10669b.PROLEPTIC_JULIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23604a[EnumC10669b.PROLEPTIC_GREGORIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23604a[EnumC10669b.SWEDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23604a[EnumC10669b.INTRODUCTION_ON_1582_10_15.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23604a[EnumC10669b.PROLEPTIC_BYZANTINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public int m12673a() {
        int i = C10670a.f23604a[ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 7;
    }
}
