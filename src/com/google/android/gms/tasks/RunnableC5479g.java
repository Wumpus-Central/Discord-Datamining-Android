package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6421a;
import p064db.C6427g;

/* renamed from: com.google.android.gms.tasks.g */
/* loaded from: classes3.dex */
final class RunnableC5479g implements Runnable {

    /* renamed from: k */
    final /* synthetic */ Task f10381k;

    /* renamed from: l */
    final /* synthetic */ C5480h f10382l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5479g(C5480h hVar, Task task) {
        this.f10382l = hVar;
        this.f10381k = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5495w wVar;
        C5495w wVar2;
        C5495w wVar3;
        AbstractC6421a aVar;
        try {
            aVar = this.f10382l.f10384b;
            Task task = (Task) aVar.mo4702a(this.f10381k);
            if (task == null) {
                this.f10382l.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C5473a.f10374b;
            task.mo28866g(executor, this.f10382l);
            task.mo28868e(executor, this.f10382l);
            task.mo28872a(executor, this.f10382l);
        } catch (C6427g e) {
            if (e.getCause() instanceof Exception) {
                wVar2 = this.f10382l.f10385c;
                wVar2.m28856q((Exception) e.getCause());
                return;
            }
            wVar = this.f10382l.f10385c;
            wVar.m28856q(e);
        } catch (Exception e2) {
            wVar3 = this.f10382l.f10385c;
            wVar3.m28856q(e2);
        }
    }
}
