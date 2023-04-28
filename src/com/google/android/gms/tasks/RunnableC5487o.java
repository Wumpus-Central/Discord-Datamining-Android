package com.google.android.gms.tasks;

import p064db.AbstractC6426f;

/* renamed from: com.google.android.gms.tasks.o */
/* loaded from: classes3.dex */
final class RunnableC5487o implements Runnable {

    /* renamed from: k */
    final /* synthetic */ Task f10400k;

    /* renamed from: l */
    final /* synthetic */ C5488p f10401l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5487o(C5488p pVar, Task task) {
        this.f10401l = pVar;
        this.f10400k = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        AbstractC6426f fVar;
        AbstractC6426f fVar2;
        obj = this.f10401l.f10403b;
        synchronized (obj) {
            C5488p pVar = this.f10401l;
            fVar = pVar.f10404c;
            if (fVar != null) {
                fVar2 = pVar.f10404c;
                fVar2.mo25576a(this.f10400k.mo28862k());
            }
        }
    }
}
