package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.x */
/* loaded from: classes3.dex */
public final class RunnableC5496x implements Runnable {

    /* renamed from: k */
    final /* synthetic */ C5495w f10420k;

    /* renamed from: l */
    final /* synthetic */ Callable f10421l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5496x(C5495w wVar, Callable callable) {
        this.f10420k = wVar;
        this.f10421l = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10420k.m28855r(this.f10421l.call());
        } catch (Exception e) {
            this.f10420k.m28856q(e);
        } catch (Throwable th2) {
            this.f10420k.m28856q(new RuntimeException(th2));
        }
    }
}
