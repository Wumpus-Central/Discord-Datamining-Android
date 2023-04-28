package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.C5378d;

/* renamed from: com.google.android.gms.nearby.messages.internal.m */
/* loaded from: classes3.dex */
final class BinderC5457m extends BinderC5466t {

    /* renamed from: c */
    final /* synthetic */ C5378d f10339c;

    /* renamed from: d */
    final /* synthetic */ C5467u f10340d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5457m(C5467u uVar, C5378d dVar, C5378d dVar2) {
        super(dVar);
        this.f10340d = uVar;
        this.f10339c = dVar2;
    }

    @Override // com.google.android.gms.nearby.messages.internal.BinderC5466t, za.AbstractC14595c
    /* renamed from: a */
    public final void mo137a() {
        C5378d.C5379a<?> b = this.f10339c.m29055b();
        if (b != null) {
            this.f10340d.m3630n(b);
        }
        super.mo137a();
    }
}
