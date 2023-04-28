package com.facebook.yoga;

/* loaded from: classes7.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: k */
    private final int f8830k;

    YogaDirection(int i) {
        this.f8830k = i;
    }

    /* renamed from: a */
    public static YogaDirection m30677a(int i) {
        if (i == 0) {
            return INHERIT;
        }
        if (i == 1) {
            return LTR;
        }
        if (i == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    /* renamed from: b */
    public int m30676b() {
        return this.f8830k;
    }
}
