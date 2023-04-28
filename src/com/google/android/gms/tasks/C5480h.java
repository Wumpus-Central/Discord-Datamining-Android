package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6421a;
import p064db.AbstractC6423c;
import p064db.AbstractC6425e;
import p064db.AbstractC6426f;

/* renamed from: com.google.android.gms.tasks.h */
/* loaded from: classes3.dex */
final class C5480h<TResult, TContinuationResult> implements AbstractC6426f<TContinuationResult>, AbstractC6425e, AbstractC6423c, AbstractC5491s {

    /* renamed from: a */
    private final Executor f10383a;

    /* renamed from: b */
    private final AbstractC6421a<TResult, Task<TContinuationResult>> f10384b;

    /* renamed from: c */
    private final C5495w<TContinuationResult> f10385c;

    public C5480h(Executor executor, AbstractC6421a<TResult, Task<TContinuationResult>> aVar, C5495w<TContinuationResult> wVar) {
        this.f10383a = executor;
        this.f10384b = aVar;
        this.f10385c = wVar;
    }

    @Override // p064db.AbstractC6426f
    /* renamed from: a */
    public final void mo25576a(TContinuationResult tcontinuationresult) {
        this.f10385c.m28855r(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.AbstractC5491s
    /* renamed from: b */
    public final void mo28875b(Task<TResult> task) {
        this.f10383a.execute(new RunnableC5479g(this, task));
    }

    @Override // p064db.AbstractC6423c
    /* renamed from: c */
    public final void mo25577c() {
        this.f10385c.m28854s();
    }

    @Override // p064db.AbstractC6425e
    public final void onFailure(Exception exc) {
        this.f10385c.m28856q(exc);
    }
}
