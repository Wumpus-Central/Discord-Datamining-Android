package com.facebook.yoga;

/* loaded from: classes7.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    

    /* renamed from: k */
    private final int f8885k;

    YogaUnit(int i) {
        this.f8885k = i;
    }

    /* renamed from: a */
    public static YogaUnit m30603a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return POINT;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    /* renamed from: b */
    public int m30602b() {
        return this.f8885k;
    }
}
