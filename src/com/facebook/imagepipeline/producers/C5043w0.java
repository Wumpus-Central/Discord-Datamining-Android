package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import p394w3.C13740j;

/* renamed from: com.facebook.imagepipeline.producers.w0 */
/* loaded from: classes7.dex */
public class C5043w0 implements AbstractC5041v0 {

    /* renamed from: a */
    private boolean f8649a = false;

    /* renamed from: b */
    private final Deque<Runnable> f8650b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f8651c;

    public C5043w0(Executor executor) {
        this.f8651c = (Executor) C13740j.m2834g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5041v0
    /* renamed from: a */
    public synchronized void mo30938a(Runnable runnable) {
        this.f8650b.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5041v0
    /* renamed from: b */
    public synchronized void mo30937b(Runnable runnable) {
        if (this.f8649a) {
            this.f8650b.add(runnable);
        } else {
            this.f8651c.execute(runnable);
        }
    }
}
