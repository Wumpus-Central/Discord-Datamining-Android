package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.C5378d;

/* renamed from: com.google.android.gms.nearby.messages.internal.l */
/* loaded from: classes3.dex */
final class BinderC5455l extends BinderC5464r {

    /* renamed from: c */
    final /* synthetic */ C5378d f10337c;

    /* renamed from: d */
    final /* synthetic */ C5467u f10338d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5455l(C5467u uVar, C5378d dVar, C5378d dVar2) {
        super(dVar);
        this.f10338d = uVar;
        this.f10337c = dVar2;
    }

    @Override // com.google.android.gms.nearby.messages.internal.BinderC5464r, za.AbstractC14612t
    /* renamed from: a */
    public final void mo131a() {
        C5378d.C5379a<?> b = this.f10337c.m29055b();
        if (b != null) {
            this.f10338d.m3630n(b);
        }
        super.mo131a();
    }
}
