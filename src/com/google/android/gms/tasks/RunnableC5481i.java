package com.google.android.gms.tasks;

import p064db.AbstractC6423c;

/* renamed from: com.google.android.gms.tasks.i */
/* loaded from: classes3.dex */
final class RunnableC5481i implements Runnable {

    /* renamed from: k */
    final /* synthetic */ C5482j f10386k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5481i(C5482j jVar) {
        this.f10386k = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        AbstractC6423c cVar;
        AbstractC6423c cVar2;
        obj = this.f10386k.f10388b;
        synchronized (obj) {
            C5482j jVar = this.f10386k;
            cVar = jVar.f10389c;
            if (cVar != null) {
                cVar2 = jVar.f10389c;
                cVar2.mo25577c();
            }
        }
    }
}
