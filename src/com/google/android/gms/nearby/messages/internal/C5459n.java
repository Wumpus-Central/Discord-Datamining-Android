package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p384v9.C13465b;
import p400w9.AbstractC13815c;

/* renamed from: com.google.android.gms.nearby.messages.internal.n */
/* loaded from: classes3.dex */
final class C5459n implements AbstractC13815c {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f10341a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5459n(C5467u uVar, TaskCompletionSource taskCompletionSource) {
        this.f10341a = taskCompletionSource;
    }

    @Override // p400w9.AbstractC13815c
    /* renamed from: a */
    public final /* synthetic */ void mo2591a(Object obj) {
        Status status = (Status) obj;
        this.f10341a.m28900c(null);
    }

    @Override // p400w9.AbstractC13815c
    /* renamed from: b */
    public final void mo2590b(Status status) {
        this.f10341a.m28901b(new C13465b(status));
    }
}
