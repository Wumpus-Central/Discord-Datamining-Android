package com.facebook.yoga;

import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    

    /* renamed from: k */
    private final int f8856k;

    YogaLogLevel(int i) {
        this.f8856k = i;
    }

    @AbstractC6709a
    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return WARN;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return VERBOSE;
        }
        if (i == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
