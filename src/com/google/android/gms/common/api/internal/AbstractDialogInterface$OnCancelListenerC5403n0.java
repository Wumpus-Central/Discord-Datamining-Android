package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.view.C2062h;
import java.util.concurrent.atomic.AtomicReference;
import na.HandlerC10772f;
import p365u9.C13215a;
import p365u9.C13220f;
import p400w9.AbstractC13821f;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* loaded from: classes5.dex */
public abstract class AbstractDialogInterface$OnCancelListenerC5403n0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: l */
    protected volatile boolean f10191l;

    /* renamed from: m */
    protected final AtomicReference<C5397k0> f10192m = new AtomicReference<>(null);

    /* renamed from: n */
    private final Handler f10193n = new HandlerC10772f(Looper.getMainLooper());

    /* renamed from: o */
    protected final C13220f f10194o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractDialogInterface$OnCancelListenerC5403n0(AbstractC13821f fVar, C13220f fVar2) {
        super(fVar);
        this.f10194o = fVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m28996l(C13215a aVar, int i) {
        this.f10192m.set(null);
        mo28995m(aVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m28993o() {
        this.f10192m.set(null);
        mo28994n();
    }

    /* renamed from: p */
    private static final int m28992p(C5397k0 k0Var) {
        if (k0Var == null) {
            return -1;
        }
        return k0Var.m29017a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo29001e(int i, int i2, Intent intent) {
        C5397k0 k0Var = this.f10192m.get();
        if (i != 1) {
            if (i == 2) {
                int e = this.f10194o.mo4271e(m29105b());
                if (e == 0) {
                    m28993o();
                    return;
                } else if (k0Var != null) {
                    if (k0Var.m29016b().m4298p() == 18 && e == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m28993o();
            return;
        } else if (i2 == 0) {
            if (k0Var != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m28996l(new C13215a(i3, null, k0Var.m29016b().toString()), m28992p(k0Var));
                return;
            }
            return;
        }
        if (k0Var != null) {
            m28996l(k0Var.m29016b(), k0Var.m29017a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo29000f(Bundle bundle) {
        C5397k0 k0Var;
        super.mo29000f(bundle);
        if (bundle != null) {
            AtomicReference<C5397k0> atomicReference = this.f10192m;
            if (bundle.getBoolean("resolving_error", false)) {
                k0Var = new C5397k0(new C13215a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                k0Var = null;
            }
            atomicReference.set(k0Var);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo28999i(Bundle bundle) {
        super.mo28999i(bundle);
        C5397k0 k0Var = this.f10192m.get();
        if (k0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", k0Var.m29017a());
            bundle.putInt("failed_status", k0Var.m29016b().m4298p());
            bundle.putParcelable("failed_resolution", k0Var.m29016b().m4296t());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo28998j() {
        super.mo28998j();
        this.f10191l = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public void mo28997k() {
        super.mo28997k();
        this.f10191l = false;
    }

    /* renamed from: m */
    protected abstract void mo28995m(C13215a aVar, int i);

    /* renamed from: n */
    protected abstract void mo28994n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m28996l(new C13215a(13, null), m28992p(this.f10192m.get()));
    }

    /* renamed from: s */
    public final void m28989s(C13215a aVar, int i) {
        C5397k0 k0Var = new C5397k0(aVar, i);
        if (C2062h.m39137a(this.f10192m, null, k0Var)) {
            this.f10193n.post(new RunnableC5401m0(this, k0Var));
        }
    }
}
