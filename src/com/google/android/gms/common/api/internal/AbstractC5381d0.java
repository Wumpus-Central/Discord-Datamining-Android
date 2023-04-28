package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p384v9.C13465b;
import p400w9.AbstractC13842t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.d0 */
/* loaded from: classes5.dex */
public abstract class AbstractC5381d0<T> extends AbstractC13842t {

    /* renamed from: b */
    protected final TaskCompletionSource<T> f10145b;

    public AbstractC5381d0(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.f10145b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: a */
    public final void mo29022a(Status status) {
        this.f10145b.m28899d(new C13465b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: b */
    public final void mo29021b(Exception exc) {
        this.f10145b.m28899d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: c */
    public final void mo29020c(C5411t<?> tVar) {
        try {
            mo29023h(tVar);
        } catch (DeadObjectException e) {
            mo29022a(AbstractC5395j0.m29018e(e));
            throw e;
        } catch (RemoteException e2) {
            mo29022a(AbstractC5395j0.m29018e(e2));
        } catch (RuntimeException e3) {
            this.f10145b.m28899d(e3);
        }
    }

    /* renamed from: h */
    protected abstract void mo29023h(C5411t<?> tVar);
}
