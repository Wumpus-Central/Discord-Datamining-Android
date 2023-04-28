package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.p018os.C2445i;

/* renamed from: androidx.camera.core.impl.utils.q */
/* loaded from: classes.dex */
public final class C1868q {

    /* renamed from: a */
    private static volatile Handler f1849a;

    private C1868q() {
    }

    /* renamed from: a */
    public static Handler m39615a() {
        if (f1849a != null) {
            return f1849a;
        }
        synchronized (C1868q.class) {
            if (f1849a == null) {
                f1849a = C2445i.m37735a(Looper.getMainLooper());
            }
        }
        return f1849a;
    }
}
