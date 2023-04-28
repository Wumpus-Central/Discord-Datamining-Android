package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6426f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.p */
/* loaded from: classes3.dex */
public final class C5488p<TResult> implements AbstractC5491s<TResult> {

    /* renamed from: a */
    private final Executor f10402a;

    /* renamed from: b */
    private final Object f10403b = new Object();

    /* renamed from: c */
    private AbstractC6426f<? super TResult> f10404c;

    public C5488p(Executor executor, AbstractC6426f<? super TResult> fVar) {
        this.f10402a = executor;
        this.f10404c = fVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC5491s
    /* renamed from: b */
    public final void mo28875b(Task<TResult> task) {
        if (task.mo28858o()) {
            synchronized (this.f10403b) {
                if (this.f10404c != null) {
                    this.f10402a.execute(new RunnableC5487o(this, task));
                }
            }
        }
    }
}
