package p319ra;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5378d;
import za.AbstractBinderC14609q;

/* renamed from: ra.c1 */
/* loaded from: classes3.dex */
public final class BinderC12499c1 extends AbstractBinderC14609q {

    /* renamed from: a */
    private final C5378d f28154a;

    /* renamed from: b */
    private boolean f28155b = false;

    public BinderC12499c1(C5378d dVar) {
        this.f28154a = dVar;
    }

    @Override // za.AbstractC14610r
    /* renamed from: I */
    public final synchronized void mo132I(Status status) {
        if (!this.f28155b) {
            this.f28154a.m29054c(new C12496b1(this, status));
            this.f28155b = true;
            return;
        }
        String valueOf = String.valueOf(status);
        Log.wtf("NearbyMessagesCallbackWrapper", "Received multiple statuses: ".concat(valueOf), new Exception());
    }
}
