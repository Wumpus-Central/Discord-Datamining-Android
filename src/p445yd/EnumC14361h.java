package p445yd;

/* renamed from: yd.h */
/* loaded from: classes3.dex */
public enum EnumC14361h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: k */
    private final int[] f32510k;

    /* renamed from: l */
    private final int f32511l;

    EnumC14361h(int[] iArr, int i) {
        this.f32510k = iArr;
        this.f32511l = i;
    }

    /* renamed from: a */
    public static EnumC14361h m781a(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int m780b(C14363j jVar) {
        char c;
        int j = jVar.m769j();
        if (j <= 9) {
            c = 0;
        } else if (j <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.f32510k[c];
    }
}
