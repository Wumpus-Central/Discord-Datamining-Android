package com.google.android.gms.tasks;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.tasks.b */
/* loaded from: classes3.dex */
public final class C5474b {
    /* renamed from: a */
    public static <TResult> TResult m28897a(Task<TResult> task) {
        C14004p.m2053h();
        C14004p.m2050k(task, "Task must not be null");
        if (task.mo28859n()) {
            return (TResult) m28892f(task);
        }
        C5475c cVar = new C5475c(null);
        m28891g(task, cVar);
        cVar.m28890b();
        return (TResult) m28892f(task);
    }

    /* renamed from: b */
    public static <TResult> TResult m28896b(Task<TResult> task, long j, TimeUnit timeUnit) {
        C14004p.m2053h();
        C14004p.m2050k(task, "Task must not be null");
        C14004p.m2050k(timeUnit, "TimeUnit must not be null");
        if (task.mo28859n()) {
            return (TResult) m28892f(task);
        }
        C5475c cVar = new C5475c(null);
        m28891g(task, cVar);
        if (cVar.m28889d(j, timeUnit)) {
            return (TResult) m28892f(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> Task<TResult> m28895c(Executor executor, Callable<TResult> callable) {
        C14004p.m2050k(executor, "Executor must not be null");
        C14004p.m2050k(callable, "Callback must not be null");
        C5495w wVar = new C5495w();
        executor.execute(new RunnableC5496x(wVar, callable));
        return wVar;
    }

    /* renamed from: d */
    public static <TResult> Task<TResult> m28894d(Exception exc) {
        C5495w wVar = new C5495w();
        wVar.m28856q(exc);
        return wVar;
    }

    /* renamed from: e */
    public static <TResult> Task<TResult> m28893e(TResult tresult) {
        C5495w wVar = new C5495w();
        wVar.m28855r(tresult);
        return wVar;
    }

    /* renamed from: f */
    private static <TResult> TResult m28892f(Task<TResult> task) {
        if (task.mo28858o()) {
            return task.mo28862k();
        }
        if (task.mo28860m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo28863j());
    }

    /* renamed from: g */
    private static <T> void m28891g(Task<T> task, AbstractC5476d<? super T> dVar) {
        Executor executor = C5473a.f10374b;
        task.mo28866g(executor, dVar);
        task.mo28868e(executor, dVar);
        task.mo28872a(executor, dVar);
    }
}
