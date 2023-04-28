package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;
import p394w3.C13740j;

/* renamed from: com.facebook.imagepipeline.producers.u */
/* loaded from: classes7.dex */
public class C5033u implements AbstractC5041v0 {

    /* renamed from: a */
    private final Executor f8624a;

    public C5033u(Executor executor) {
        this.f8624a = (Executor) C13740j.m2834g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5041v0
    /* renamed from: a */
    public void mo30938a(Runnable runnable) {
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5041v0
    /* renamed from: b */
    public void mo30937b(Runnable runnable) {
        this.f8624a.execute(runnable);
    }
}
