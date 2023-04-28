package com.facebook.common.time;

import android.os.SystemClock;
import p057d4.AbstractC6395b;
import p394w3.AbstractC13731d;

@AbstractC13731d
/* loaded from: classes7.dex */
public class RealtimeSinceBootClock implements AbstractC6395b {

    /* renamed from: a */
    private static final RealtimeSinceBootClock f7584a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @AbstractC13731d
    public static RealtimeSinceBootClock get() {
        return f7584a;
    }

    @Override // p057d4.AbstractC6395b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
