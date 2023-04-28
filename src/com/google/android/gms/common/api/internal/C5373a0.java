package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C5386g;
import com.google.android.gms.tasks.TaskCompletionSource;
import p365u9.C13217c;
import p384v9.C13456a;
import p400w9.AbstractC13827i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* loaded from: classes5.dex */
public final class C5373a0 extends AbstractC5384f {

    /* renamed from: e */
    final /* synthetic */ C5386g.C5387a f10119e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5373a0(C5386g.C5387a aVar, C5378d dVar, C13217c[] cVarArr, boolean z, int i) {
        super(dVar, cVarArr, z, i);
        this.f10119e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC5384f
    /* renamed from: d */
    public final void mo29047d(C13456a.AbstractC13457b bVar, TaskCompletionSource<Void> taskCompletionSource) {
        AbstractC13827i iVar;
        iVar = this.f10119e.f10154a;
        iVar.accept(bVar, taskCompletionSource);
    }
}
