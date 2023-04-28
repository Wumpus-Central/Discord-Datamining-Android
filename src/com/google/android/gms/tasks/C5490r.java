package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6423c;
import p064db.AbstractC6425e;
import p064db.AbstractC6426f;
import p064db.AbstractC6428h;

/* renamed from: com.google.android.gms.tasks.r */
/* loaded from: classes3.dex */
final class C5490r<TResult, TContinuationResult> implements AbstractC6426f<TContinuationResult>, AbstractC6425e, AbstractC6423c, AbstractC5491s {

    /* renamed from: a */
    private final Executor f10407a;

    /* renamed from: b */
    private final AbstractC6428h<TResult, TContinuationResult> f10408b;

    /* renamed from: c */
    private final C5495w<TContinuationResult> f10409c;

    public C5490r(Executor executor, AbstractC6428h<TResult, TContinuationResult> hVar, C5495w<TContinuationResult> wVar) {
        this.f10407a = executor;
        this.f10408b = hVar;
        this.f10409c = wVar;
    }

    @Override // p064db.AbstractC6426f
    /* renamed from: a */
    public final void mo25576a(TContinuationResult tcontinuationresult) {
        this.f10409c.m28855r(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.AbstractC5491s
    /* renamed from: b */
    public final void mo28875b(Task<TResult> task) {
        this.f10407a.execute(new RunnableC5489q(this, task));
    }

    @Override // p064db.AbstractC6423c
    /* renamed from: c */
    public final void mo25577c() {
        this.f10409c.m28854s();
    }

    @Override // p064db.AbstractC6425e
    public final void onFailure(Exception exc) {
        this.f10409c.m28856q(exc);
    }
}
