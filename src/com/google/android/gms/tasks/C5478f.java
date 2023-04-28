package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6421a;

/* renamed from: com.google.android.gms.tasks.f */
/* loaded from: classes3.dex */
final class C5478f<TResult, TContinuationResult> implements AbstractC5491s<TResult> {

    /* renamed from: a */
    private final Executor f10378a;

    /* renamed from: b */
    private final AbstractC6421a<TResult, TContinuationResult> f10379b;

    /* renamed from: c */
    private final C5495w<TContinuationResult> f10380c;

    public C5478f(Executor executor, AbstractC6421a<TResult, TContinuationResult> aVar, C5495w<TContinuationResult> wVar) {
        this.f10378a = executor;
        this.f10379b = aVar;
        this.f10380c = wVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC5491s
    /* renamed from: b */
    public final void mo28875b(Task<TResult> task) {
        this.f10378a.execute(new RunnableC5477e(this, task));
    }
}
