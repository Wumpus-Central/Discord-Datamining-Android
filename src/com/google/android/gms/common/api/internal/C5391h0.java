package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p365u9.C13217c;
import p384v9.C13456a;
import p400w9.AbstractC13831k;
import p400w9.AbstractC13842t;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: classes5.dex */
public final class C5391h0<ResultT> extends AbstractC13842t {

    /* renamed from: b */
    private final AbstractC5389h<C13456a.AbstractC13457b, ResultT> f10169b;

    /* renamed from: c */
    private final TaskCompletionSource<ResultT> f10170c;

    /* renamed from: d */
    private final AbstractC13831k f10171d;

    public C5391h0(int i, AbstractC5389h<C13456a.AbstractC13457b, ResultT> hVar, TaskCompletionSource<ResultT> taskCompletionSource, AbstractC13831k kVar) {
        super(i);
        this.f10170c = taskCompletionSource;
        this.f10169b = hVar;
        this.f10171d = kVar;
        if (i == 2 && hVar.m29034c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: a */
    public final void mo29022a(Status status) {
        this.f10170c.m28899d(this.f10171d.mo2556a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: b */
    public final void mo29021b(Exception exc) {
        this.f10170c.m28899d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: c */
    public final void mo29020c(C5411t<?> tVar) {
        try {
            this.f10169b.mo29035b(tVar.m28954v(), this.f10170c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo29022a(AbstractC5395j0.m29018e(e2));
        } catch (RuntimeException e3) {
            this.f10170c.m28899d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: d */
    public final void mo29019d(C5398l lVar, boolean z) {
        lVar.m29012d(this.f10170c, z);
    }

    @Override // p400w9.AbstractC13842t
    /* renamed from: f */
    public final boolean mo2541f(C5411t<?> tVar) {
        return this.f10169b.m29034c();
    }

    @Override // p400w9.AbstractC13842t
    /* renamed from: g */
    public final C13217c[] mo2540g(C5411t<?> tVar) {
        return this.f10169b.m29032e();
    }
}
