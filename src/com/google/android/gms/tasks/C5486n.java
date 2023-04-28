package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6425e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.n */
/* loaded from: classes3.dex */
public final class C5486n<TResult> implements AbstractC5491s<TResult> {

    /* renamed from: a */
    private final Executor f10397a;

    /* renamed from: b */
    private final Object f10398b = new Object();

    /* renamed from: c */
    private AbstractC6425e f10399c;

    public C5486n(Executor executor, AbstractC6425e eVar) {
        this.f10397a = executor;
        this.f10399c = eVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC5491s
    /* renamed from: b */
    public final void mo28875b(Task<TResult> task) {
        if (!task.mo28858o() && !task.mo28860m()) {
            synchronized (this.f10398b) {
                if (this.f10399c != null) {
                    this.f10397a.execute(new RunnableC5485m(this, task));
                }
            }
        }
    }
}
