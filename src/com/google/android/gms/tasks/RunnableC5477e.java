package com.google.android.gms.tasks;

import p064db.AbstractC6421a;
import p064db.C6427g;

/* renamed from: com.google.android.gms.tasks.e */
/* loaded from: classes3.dex */
final class RunnableC5477e implements Runnable {

    /* renamed from: k */
    final /* synthetic */ Task f10376k;

    /* renamed from: l */
    final /* synthetic */ C5478f f10377l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5477e(C5478f fVar, Task task) {
        this.f10377l = fVar;
        this.f10376k = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5495w wVar;
        C5495w wVar2;
        C5495w wVar3;
        AbstractC6421a aVar;
        C5495w wVar4;
        C5495w wVar5;
        if (this.f10376k.mo28860m()) {
            wVar5 = this.f10377l.f10380c;
            wVar5.m28854s();
            return;
        }
        try {
            aVar = this.f10377l.f10379b;
            Object a = aVar.mo4702a(this.f10376k);
            wVar4 = this.f10377l.f10380c;
            wVar4.m28855r(a);
        } catch (C6427g e) {
            if (e.getCause() instanceof Exception) {
                wVar2 = this.f10377l.f10380c;
                wVar2.m28856q((Exception) e.getCause());
                return;
            }
            wVar = this.f10377l.f10380c;
            wVar.m28856q(e);
        } catch (Exception e2) {
            wVar3 = this.f10377l.f10380c;
            wVar3.m28856q(e2);
        }
    }
}
