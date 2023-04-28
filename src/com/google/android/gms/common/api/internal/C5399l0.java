package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p400w9.AbstractC13840r;

/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* loaded from: classes5.dex */
final class C5399l0 extends AbstractC13840r {

    /* renamed from: a */
    final /* synthetic */ Dialog f10183a;

    /* renamed from: b */
    final /* synthetic */ RunnableC5401m0 f10184b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5399l0(RunnableC5401m0 m0Var, Dialog dialog) {
        this.f10184b = m0Var;
        this.f10183a = dialog;
    }

    @Override // p400w9.AbstractC13840r
    /* renamed from: a */
    public final void mo2544a() {
        this.f10184b.f10188l.m28993o();
        if (this.f10183a.isShowing()) {
            this.f10183a.dismiss();
        }
    }
}
