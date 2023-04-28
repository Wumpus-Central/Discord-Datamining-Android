package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.common.api.internal.C5386g;
import com.google.android.gms.tasks.TaskCompletionSource;
import p384v9.C13456a;
import p400w9.AbstractC13827i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.b0 */
/* loaded from: classes5.dex */
public final class C5375b0 extends AbstractC5392i {

    /* renamed from: b */
    final /* synthetic */ C5386g.C5387a f10122b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5375b0(C5386g.C5387a aVar, C5378d.C5379a aVar2) {
        super(aVar2);
        this.f10122b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC5392i
    /* renamed from: b */
    public final void mo29024b(C13456a.AbstractC13457b bVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        AbstractC13827i iVar;
        iVar = this.f10122b.f10155b;
        iVar.accept(bVar, taskCompletionSource);
    }
}
