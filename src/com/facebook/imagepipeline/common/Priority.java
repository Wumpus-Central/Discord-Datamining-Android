package com.facebook.imagepipeline.common;

/* loaded from: classes7.dex */
public enum Priority {
    LOW,
    MEDIUM,
    HIGH;

    /* renamed from: a */
    public static Priority m31499a(Priority priority, Priority priority2) {
        return priority.ordinal() > priority2.ordinal() ? priority : priority2;
    }
}
