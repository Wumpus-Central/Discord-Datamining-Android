package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6423c;

/* renamed from: com.google.android.gms.tasks.j */
/* loaded from: classes3.dex */
final class C5482j<TResult> implements AbstractC5491s<TResult> {

    /* renamed from: a */
    private final Executor f10387a;

    /* renamed from: b */
    private final Object f10388b = new Object();

    /* renamed from: c */
    private AbstractC6423c f10389c;

    public C5482j(Executor executor, AbstractC6423c cVar) {
        this.f10387a = executor;
        this.f10389c = cVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC5491s
    /* renamed from: b */
    public final void mo28875b(Task<TResult> task) {
        if (task.mo28860m()) {
            synchronized (this.f10388b) {
                if (this.f10389c != null) {
                    this.f10387a.execute(new RunnableC5481i(this));
                }
            }
        }
    }
}
