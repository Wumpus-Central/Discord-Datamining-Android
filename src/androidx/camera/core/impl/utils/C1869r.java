package androidx.camera.core.impl.utils;

import android.os.Looper;
import androidx.core.util.C2517g;

/* renamed from: androidx.camera.core.impl.utils.r */
/* loaded from: classes.dex */
public final class C1869r {
    /* renamed from: a */
    public static void m39614a() {
        C2517g.m37585j(m39613b(), "Not in application's main thread");
    }

    /* renamed from: b */
    public static boolean m39613b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
