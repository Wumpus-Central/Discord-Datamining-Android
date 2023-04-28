package p420x9;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: x9.a1 */
/* loaded from: classes5.dex */
public final class BinderC13953a1 extends AbstractBinderC14017t0 {

    /* renamed from: a */
    private AbstractC13957c f31454a;

    /* renamed from: b */
    private final int f31455b;

    public BinderC13953a1(AbstractC13957c cVar, int i) {
        this.f31454a = cVar;
        this.f31455b = i;
    }

    @Override // p420x9.AbstractC13987k
    /* renamed from: M */
    public final void mo2083M(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p420x9.AbstractC13987k
    /* renamed from: O */
    public final void mo2082O(int i, IBinder iBinder, C13970e1 e1Var) {
        AbstractC13957c cVar = this.f31454a;
        C14004p.m2050k(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C14004p.m2051j(e1Var);
        AbstractC13957c.m2167a0(cVar, e1Var);
        mo2081q(i, iBinder, e1Var.f31506k);
    }

    @Override // p420x9.AbstractC13987k
    /* renamed from: q */
    public final void mo2081q(int i, IBinder iBinder, Bundle bundle) {
        C14004p.m2050k(this.f31454a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f31454a.m2182M(i, iBinder, bundle, this.f31455b);
        this.f31454a = null;
    }
}
