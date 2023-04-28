package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: io.sentry.android.core.q0 */
/* loaded from: classes8.dex */
final class C8778q0 {

    /* renamed from: a */
    private final Handler f19390a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8778q0() {
        this(Looper.getMainLooper());
    }

    /* renamed from: a */
    public Thread m18099a() {
        return this.f19390a.getLooper().getThread();
    }

    /* renamed from: b */
    public void m18098b(Runnable runnable) {
        this.f19390a.post(runnable);
    }

    C8778q0(Looper looper) {
        this.f19390a = new Handler(looper);
    }
}
