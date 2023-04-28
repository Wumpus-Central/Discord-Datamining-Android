package com.google.android.gms.tasks;

/* loaded from: classes3.dex */
public class TaskCompletionSource<TResult> {

    /* renamed from: a */
    private final C5495w<TResult> f10372a = new C5495w<>();

    /* renamed from: a */
    public Task<TResult> m28902a() {
        return this.f10372a;
    }

    /* renamed from: b */
    public void m28901b(Exception exc) {
        this.f10372a.m28856q(exc);
    }

    /* renamed from: c */
    public void m28900c(TResult tresult) {
        this.f10372a.m28855r(tresult);
    }

    /* renamed from: d */
    public boolean m28899d(Exception exc) {
        return this.f10372a.m28853t(exc);
    }

    /* renamed from: e */
    public boolean m28898e(TResult tresult) {
        return this.f10372a.m28852u(tresult);
    }
}
