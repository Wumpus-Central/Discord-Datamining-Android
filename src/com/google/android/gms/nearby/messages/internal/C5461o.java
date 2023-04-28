package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p064db.AbstractC6424d;

/* renamed from: com.google.android.gms.nearby.messages.internal.o */
/* loaded from: classes3.dex */
final class C5461o implements AbstractC6424d {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f10342a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5461o(C5467u uVar, TaskCompletionSource taskCompletionSource) {
        this.f10342a = taskCompletionSource;
    }

    @Override // p064db.AbstractC6424d
    /* renamed from: a */
    public final void mo4743a(Task task) {
        if (task.mo28858o()) {
            this.f10342a.m28900c(null);
        } else {
            this.f10342a.m28901b(task.mo28863j());
        }
    }
}
