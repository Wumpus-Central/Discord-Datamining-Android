package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p384v9.AbstractC13470f;
import p384v9.AbstractC13478k;
import p384v9.C13456a;
import p384v9.C13456a.AbstractC13457b;
import p400w9.AbstractC13815c;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes5.dex */
public abstract class AbstractC5374b<R extends AbstractC13478k, A extends C13456a.AbstractC13457b> extends BasePendingResult<R> implements AbstractC13815c<R> {

    /* renamed from: a */
    private final C13456a.C13458c<A> f10120a;

    /* renamed from: b */
    private final C13456a<?> f10121b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5374b(C13456a<?> aVar, AbstractC13470f fVar) {
        super((AbstractC13470f) C14004p.m2050k(fVar, "GoogleApiClient must not be null"));
        C14004p.m2050k(aVar, "Api must not be null");
        this.f10120a = (C13456a.C13458c<A>) aVar.m3646b();
        this.f10121b = aVar;
    }

    /* renamed from: f */
    private void m29093f(RemoteException remoteException) {
        mo2590b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p400w9.AbstractC13815c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2591a(Object obj) {
        super.setResult((AbstractC13478k) obj);
    }

    @Override // p400w9.AbstractC13815c
    /* renamed from: b */
    public final void mo2590b(Status status) {
        C14004p.m2059b(!status.m29108z(), "Failed result must not be success");
        R createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        m29095d(createFailedResult);
    }

    /* renamed from: c */
    protected abstract void mo6637c(A a);

    /* renamed from: d */
    protected void m29095d(R r) {
    }

    /* renamed from: e */
    public final void m29094e(A a) {
        try {
            mo6637c(a);
        } catch (DeadObjectException e) {
            m29093f(e);
            throw e;
        } catch (RemoteException e2) {
            m29093f(e2);
        }
    }
}
