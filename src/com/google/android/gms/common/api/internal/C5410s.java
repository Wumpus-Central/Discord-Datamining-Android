package com.google.android.gms.common.api.internal;

import android.os.Handler;
import p420x9.AbstractC13957c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes5.dex */
public final class C5410s implements AbstractC13957c.AbstractC13961e {

    /* renamed from: a */
    final /* synthetic */ C5411t f10201a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5410s(C5411t tVar) {
        this.f10201a = tVar;
    }

    @Override // p420x9.AbstractC13957c.AbstractC13961e
    /* renamed from: a */
    public final void mo2143a() {
        Handler handler;
        handler = this.f10201a.f10214m.f10138z;
        handler.post(new RunnableC5409r(this));
    }
}
