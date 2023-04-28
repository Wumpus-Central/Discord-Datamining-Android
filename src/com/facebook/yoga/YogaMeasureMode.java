package com.facebook.yoga;

/* loaded from: classes7.dex */
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    

    /* renamed from: k */
    private final int f8861k;

    YogaMeasureMode(int i) {
        this.f8861k = i;
    }

    /* renamed from: a */
    public static YogaMeasureMode m30672a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
