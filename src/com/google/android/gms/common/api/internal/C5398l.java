package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p163j$.util.DesugarCollections;
import p384v9.AbstractC13478k;
import p384v9.C13465b;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes5.dex */
public final class C5398l {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f10181a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<TaskCompletionSource<?>, Boolean> f10182b = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m29008h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f10181a) {
            hashMap = new HashMap(this.f10181a);
        }
        synchronized (this.f10182b) {
            hashMap2 = new HashMap(this.f10182b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).m28899d(new C13465b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m29013c(BasePendingResult<? extends AbstractC13478k> basePendingResult, boolean z) {
        this.f10181a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.addStatusListener(new C5394j(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void m29012d(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.f10182b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.m28902a().mo28871b(new C5396k(this, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m29011e(int i, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        m29008h(true, new Status(20, sb2.toString()));
    }

    /* renamed from: f */
    public final void m29010f() {
        m29008h(false, C5376c.f37390B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m29009g() {
        return !this.f10181a.isEmpty() || !this.f10182b.isEmpty();
    }
}
