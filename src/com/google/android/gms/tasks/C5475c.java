package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p064db.C6429i;

/* renamed from: com.google.android.gms.tasks.c */
/* loaded from: classes3.dex */
final class C5475c implements AbstractC5476d {

    /* renamed from: a */
    private final CountDownLatch f10375a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5475c(C6429i iVar) {
    }

    @Override // p064db.AbstractC6426f
    /* renamed from: a */
    public final void mo25576a(Object obj) {
        this.f10375a.countDown();
    }

    /* renamed from: b */
    public final void m28890b() {
        this.f10375a.await();
    }

    @Override // p064db.AbstractC6423c
    /* renamed from: c */
    public final void mo25577c() {
        this.f10375a.countDown();
    }

    /* renamed from: d */
    public final boolean m28889d(long j, TimeUnit timeUnit) {
        return this.f10375a.await(j, timeUnit);
    }

    @Override // p064db.AbstractC6425e
    public final void onFailure(Exception exc) {
        this.f10375a.countDown();
    }
}
