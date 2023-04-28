package com.google.android.gms.tasks;

import p064db.AbstractC6424d;

/* renamed from: com.google.android.gms.tasks.k */
/* loaded from: classes3.dex */
final class RunnableC5483k implements Runnable {

    /* renamed from: k */
    final /* synthetic */ Task f10390k;

    /* renamed from: l */
    final /* synthetic */ C5484l f10391l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5483k(C5484l lVar, Task task) {
        this.f10391l = lVar;
        this.f10390k = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        AbstractC6424d dVar;
        AbstractC6424d dVar2;
        obj = this.f10391l.f10393b;
        synchronized (obj) {
            C5484l lVar = this.f10391l;
            dVar = lVar.f10394c;
            if (dVar != null) {
                dVar2 = lVar.f10394c;
                dVar2.mo4743a(this.f10390k);
            }
        }
    }
}
