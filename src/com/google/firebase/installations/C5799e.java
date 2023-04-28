package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p403wc.AbstractC13864d;

/* renamed from: com.google.firebase.installations.e */
/* loaded from: classes3.dex */
class C5799e implements AbstractC5803h {

    /* renamed from: a */
    private final C5804i f11492a;

    /* renamed from: b */
    private final TaskCompletionSource<AbstractC5801g> f11493b;

    public C5799e(C5804i iVar, TaskCompletionSource<AbstractC5801g> taskCompletionSource) {
        this.f11492a = iVar;
        this.f11493b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.AbstractC5803h
    /* renamed from: a */
    public boolean mo27294a(Exception exc) {
        this.f11493b.m28899d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.AbstractC5803h
    /* renamed from: b */
    public boolean mo27293b(AbstractC13864d dVar) {
        if (!dVar.m2502k() || this.f11492a.m27287f(dVar)) {
            return false;
        }
        this.f11493b.m28900c(AbstractC5801g.m27302a().mo27297b(dVar.mo2511b()).mo27295d(dVar.mo2510c()).mo27296c(dVar.mo2505h()).mo27298a());
        return true;
    }
}
