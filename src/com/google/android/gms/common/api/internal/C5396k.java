package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import p064db.AbstractC6424d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes5.dex */
public final class C5396k implements AbstractC6424d {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f10177a;

    /* renamed from: b */
    final /* synthetic */ C5398l f10178b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5396k(C5398l lVar, TaskCompletionSource taskCompletionSource) {
        this.f10178b = lVar;
        this.f10177a = taskCompletionSource;
    }

    @Override // p064db.AbstractC6424d
    /* renamed from: a */
    public final void mo4743a(Task task) {
        Map map;
        map = this.f10178b.f10182b;
        map.remove(this.f10177a);
    }
}
