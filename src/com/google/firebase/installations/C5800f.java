package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p403wc.AbstractC13864d;

/* renamed from: com.google.firebase.installations.f */
/* loaded from: classes3.dex */
class C5800f implements AbstractC5803h {

    /* renamed from: a */
    final TaskCompletionSource<String> f11494a;

    public C5800f(TaskCompletionSource<String> taskCompletionSource) {
        this.f11494a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.AbstractC5803h
    /* renamed from: a */
    public boolean mo27294a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.AbstractC5803h
    /* renamed from: b */
    public boolean mo27293b(AbstractC13864d dVar) {
        if (!dVar.m2501l() && !dVar.m2502k() && !dVar.m2504i()) {
            return false;
        }
        this.f11494a.m28898e(dVar.mo2509d());
        return true;
    }
}
