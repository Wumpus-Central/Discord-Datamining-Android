package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p365u9.C13215a;
import p420x9.C14004p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* loaded from: classes5.dex */
public final class RunnableC5401m0 implements Runnable {

    /* renamed from: k */
    private final C5397k0 f10187k;

    /* renamed from: l */
    final /* synthetic */ AbstractDialogInterface$OnCancelListenerC5403n0 f10188l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5401m0(AbstractDialogInterface$OnCancelListenerC5403n0 n0Var, C5397k0 k0Var) {
        this.f10188l = n0Var;
        this.f10187k = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10188l.f10191l) {
            C13215a b = this.f10187k.m29016b();
            if (b.m4295u()) {
                AbstractDialogInterface$OnCancelListenerC5403n0 n0Var = this.f10188l;
                n0Var.f10113k.startActivityForResult(GoogleApiActivity.m29118a(n0Var.m29105b(), (PendingIntent) C14004p.m2051j(b.m4296t()), this.f10187k.m29017a(), false), 1);
                return;
            }
            AbstractDialogInterface$OnCancelListenerC5403n0 n0Var2 = this.f10188l;
            if (n0Var2.f10194o.mo4275a(n0Var2.m29105b(), b.m4298p(), null) != null) {
                AbstractDialogInterface$OnCancelListenerC5403n0 n0Var3 = this.f10188l;
                n0Var3.f10194o.m4277t(n0Var3.m29105b(), this.f10188l.f10113k, b.m4298p(), 2, this.f10188l);
            } else if (b.m4298p() == 18) {
                AbstractDialogInterface$OnCancelListenerC5403n0 n0Var4 = this.f10188l;
                Dialog o = n0Var4.f10194o.m4282o(n0Var4.m29105b(), this.f10188l);
                AbstractDialogInterface$OnCancelListenerC5403n0 n0Var5 = this.f10188l;
                n0Var5.f10194o.m4281p(n0Var5.m29105b().getApplicationContext(), new C5399l0(this, o));
            } else {
                this.f10188l.m28996l(b, this.f10187k.m29017a());
            }
        }
    }
}
