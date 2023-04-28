package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import ua.HandlerC13239a;

/* renamed from: com.google.android.gms.tasks.v */
/* loaded from: classes3.dex */
final class ExecutorC5494v implements Executor {

    /* renamed from: k */
    private final Handler f10413k = new HandlerC13239a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10413k.post(runnable);
    }
}
