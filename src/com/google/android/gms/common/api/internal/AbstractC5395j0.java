package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* loaded from: classes5.dex */
public abstract class AbstractC5395j0 {

    /* renamed from: a */
    public final int f10176a;

    public AbstractC5395j0(int i) {
        this.f10176a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m29018e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo29022a(Status status);

    /* renamed from: b */
    public abstract void mo29021b(Exception exc);

    /* renamed from: c */
    public abstract void mo29020c(C5411t<?> tVar);

    /* renamed from: d */
    public abstract void mo29019d(C5398l lVar, boolean z);
}
