package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p064db.AbstractC6428h;
import p064db.C6427g;

/* renamed from: com.google.android.gms.tasks.q */
/* loaded from: classes3.dex */
final class RunnableC5489q implements Runnable {

    /* renamed from: k */
    final /* synthetic */ Task f10405k;

    /* renamed from: l */
    final /* synthetic */ C5490r f10406l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5489q(C5490r rVar, Task task) {
        this.f10406l = rVar;
        this.f10405k = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6428h hVar;
        try {
            hVar = this.f10406l.f10408b;
            Task a = hVar.mo4736a(this.f10405k.mo28862k());
            if (a == null) {
                this.f10406l.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C5473a.f10374b;
            a.mo28866g(executor, this.f10406l);
            a.mo28868e(executor, this.f10406l);
            a.mo28872a(executor, this.f10406l);
        } catch (C6427g e) {
            if (e.getCause() instanceof Exception) {
                this.f10406l.onFailure((Exception) e.getCause());
            } else {
                this.f10406l.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f10406l.mo25577c();
        } catch (Exception e2) {
            this.f10406l.onFailure(e2);
        }
    }
}
