package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.AbstractC5389h;
import com.google.android.gms.tasks.TaskCompletionSource;
import p365u9.C13217c;
import p384v9.C13456a;
import p400w9.AbstractC13827i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes5.dex */
public final class C5377c0 extends AbstractC5389h {

    /* renamed from: d */
    final /* synthetic */ AbstractC5389h.C5390a f10139d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5377c0(AbstractC5389h.C5390a aVar, C13217c[] cVarArr, boolean z, int i) {
        super(cVarArr, z, i);
        this.f10139d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC5389h
    /* renamed from: b */
    public final void mo29035b(C13456a.AbstractC13457b bVar, TaskCompletionSource taskCompletionSource) {
        AbstractC13827i iVar;
        iVar = this.f10139d.f10165a;
        iVar.accept(bVar, taskCompletionSource);
    }
}
