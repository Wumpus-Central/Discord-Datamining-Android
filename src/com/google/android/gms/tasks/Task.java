package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p064db.AbstractC6421a;
import p064db.AbstractC6423c;
import p064db.AbstractC6424d;
import p064db.AbstractC6425e;
import p064db.AbstractC6426f;
import p064db.AbstractC6428h;

/* loaded from: classes3.dex */
public abstract class Task<TResult> {
    /* renamed from: a */
    public Task<TResult> mo28872a(Executor executor, AbstractC6423c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public Task<TResult> mo28871b(AbstractC6424d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public Task<TResult> mo28870c(Executor executor, AbstractC6424d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract Task<TResult> mo28869d(AbstractC6425e eVar);

    /* renamed from: e */
    public abstract Task<TResult> mo28868e(Executor executor, AbstractC6425e eVar);

    /* renamed from: f */
    public abstract Task<TResult> mo28867f(AbstractC6426f<? super TResult> fVar);

    /* renamed from: g */
    public abstract Task<TResult> mo28866g(Executor executor, AbstractC6426f<? super TResult> fVar);

    /* renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo28865h(Executor executor, AbstractC6421a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: i */
    public <TContinuationResult> Task<TContinuationResult> mo28864i(Executor executor, AbstractC6421a<TResult, Task<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: j */
    public abstract Exception mo28863j();

    /* renamed from: k */
    public abstract TResult mo28862k();

    /* renamed from: l */
    public abstract <X extends Throwable> TResult mo28861l(Class<X> cls);

    /* renamed from: m */
    public abstract boolean mo28860m();

    /* renamed from: n */
    public abstract boolean mo28859n();

    /* renamed from: o */
    public abstract boolean mo28858o();

    /* renamed from: p */
    public <TContinuationResult> Task<TContinuationResult> mo28857p(Executor executor, AbstractC6428h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
