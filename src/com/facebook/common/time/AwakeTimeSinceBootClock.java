package com.facebook.common.time;

import android.os.SystemClock;
import p057d4.AbstractC6395b;
import p057d4.AbstractC6396c;
import p394w3.AbstractC13731d;

@AbstractC13731d
/* loaded from: classes7.dex */
public class AwakeTimeSinceBootClock implements AbstractC6395b, AbstractC6396c {
    @AbstractC13731d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @AbstractC13731d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p057d4.AbstractC6395b
    @AbstractC13731d
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @Override // p057d4.AbstractC6396c
    @AbstractC13731d
    public long nowNanos() {
        return System.nanoTime();
    }
}
