package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.android.core.internal.util.C8753k;

/* renamed from: io.sentry.android.core.internal.util.l */
/* loaded from: classes8.dex */
public final /* synthetic */ class C8757l {
    /* renamed from: a */
    public static void m18193a(C8753k.AbstractC8756c cVar, Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
        window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
    }

    /* renamed from: b */
    public static void m18192b(C8753k.AbstractC8756c cVar, Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
    }
}
