package com.google.android.gms.tasks;

import p064db.AbstractC6425e;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.tasks.m */
/* loaded from: classes3.dex */
final class RunnableC5485m implements Runnable {

    /* renamed from: k */
    final /* synthetic */ Task f10395k;

    /* renamed from: l */
    final /* synthetic */ C5486n f10396l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5485m(C5486n nVar, Task task) {
        this.f10396l = nVar;
        this.f10395k = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        AbstractC6425e eVar;
        AbstractC6425e eVar2;
        obj = this.f10396l.f10398b;
        synchronized (obj) {
            C5486n nVar = this.f10396l;
            eVar = nVar.f10399c;
            if (eVar != null) {
                eVar2 = nVar.f10399c;
                eVar2.onFailure((Exception) C14004p.m2051j(this.f10395k.mo28863j()));
            }
        }
    }
}
