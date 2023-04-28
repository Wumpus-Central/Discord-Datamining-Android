package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.w0 */
/* loaded from: classes3.dex */
public final class C5867w0 {

    /* renamed from: d */
    private static WeakReference<C5867w0> f11643d;

    /* renamed from: a */
    private final SharedPreferences f11644a;

    /* renamed from: b */
    private C5857s0 f11645b;

    /* renamed from: c */
    private final Executor f11646c;

    private C5867w0(SharedPreferences sharedPreferences, Executor executor) {
        this.f11646c = executor;
        this.f11644a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C5867w0 m27053a(Context context, Executor executor) {
        C5867w0 w0Var;
        synchronized (C5867w0.class) {
            WeakReference<C5867w0> weakReference = f11643d;
            if (weakReference != null) {
                w0Var = weakReference.get();
            } else {
                w0Var = null;
            }
            if (w0Var == null) {
                w0Var = new C5867w0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                w0Var.m27051c();
                f11643d = new WeakReference<>(w0Var);
            }
        }
        return w0Var;
    }

    /* renamed from: c */
    private synchronized void m27051c() {
        this.f11645b = C5857s0.m27080c(this.f11644a, "topic_operation_queue", ",", this.f11646c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C5865v0 m27052b() {
        return C5865v0.m27058a(this.f11645b.m27078e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean m27050d(C5865v0 v0Var) {
        return this.f11645b.m27077f(v0Var.m27054e());
    }
}
