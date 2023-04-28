package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6424d;

/* renamed from: com.google.android.gms.tasks.l */
/* loaded from: classes3.dex */
final class C5484l<TResult> implements AbstractC5491s<TResult> {

    /* renamed from: a */
    private final Executor f10392a;

    /* renamed from: b */
    private final Object f10393b = new Object();

    /* renamed from: c */
    private AbstractC6424d<TResult> f10394c;

    public C5484l(Executor executor, AbstractC6424d<TResult> dVar) {
        this.f10392a = executor;
        this.f10394c = dVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC5491s
    /* renamed from: b */
    public final void mo28875b(Task<TResult> task) {
        synchronized (this.f10393b) {
            if (this.f10394c != null) {
                this.f10392a.execute(new RunnableC5483k(this, task));
            }
        }
    }
}
