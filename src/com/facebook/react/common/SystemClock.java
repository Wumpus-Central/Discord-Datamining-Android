package com.facebook.react.common;

/* loaded from: classes7.dex */
public class SystemClock {
    public static long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static long nanoTime() {
        return System.nanoTime();
    }

    public static long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}
