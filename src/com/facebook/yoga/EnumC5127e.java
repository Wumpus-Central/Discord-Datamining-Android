package com.facebook.yoga;

/* renamed from: com.facebook.yoga.e */
/* loaded from: classes7.dex */
public enum EnumC5127e {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    

    /* renamed from: k */
    private final int f8908k;

    EnumC5127e(int i) {
        this.f8908k = i;
    }

    /* renamed from: a */
    public static EnumC5127e m30595a(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }

    /* renamed from: b */
    public int m30594b() {
        return this.f8908k;
    }
}
