package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p384v9.C13456a;
import p384v9.C13456a.AbstractC13457b;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes5.dex */
public abstract class AbstractC5392i<A extends C13456a.AbstractC13457b, L> {

    /* renamed from: a */
    private final C5378d.C5379a<L> f10172a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5392i(C5378d.C5379a<L> aVar) {
        this.f10172a = aVar;
    }

    /* renamed from: a */
    public C5378d.C5379a<L> m29025a() {
        return this.f10172a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo29024b(A a, TaskCompletionSource<Boolean> taskCompletionSource);
}
