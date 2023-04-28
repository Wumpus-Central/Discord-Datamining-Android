package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC5374b;
import p384v9.AbstractC13478k;
import p384v9.C13456a;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* loaded from: classes5.dex */
public final class C5385f0<A extends AbstractC5374b<? extends AbstractC13478k, C13456a.AbstractC13457b>> extends AbstractC5395j0 {

    /* renamed from: b */
    protected final A f10150b;

    public C5385f0(int i, A a) {
        super(i);
        this.f10150b = (A) ((AbstractC5374b) C14004p.m2050k(a, "Null methods are not runnable."));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: a */
    public final void mo29022a(Status status) {
        try {
            this.f10150b.mo2590b(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: b */
    public final void mo29021b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f10150b.mo2590b(new Status(10, sb2.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: c */
    public final void mo29020c(C5411t<?> tVar) {
        try {
            this.f10150b.m29094e(tVar.m28954v());
        } catch (RuntimeException e) {
            mo29021b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: d */
    public final void mo29019d(C5398l lVar, boolean z) {
        lVar.m29013c(this.f10150b, z);
    }
}
