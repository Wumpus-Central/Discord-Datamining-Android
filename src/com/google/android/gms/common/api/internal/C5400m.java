package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.C2095b;
import p365u9.C13215a;
import p365u9.C13220f;
import p400w9.AbstractC13821f;
import p400w9.C13813b;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes5.dex */
public final class C5400m extends AbstractDialogInterface$OnCancelListenerC5403n0 {

    /* renamed from: p */
    private final C2095b<C13813b<?>> f10185p = new C2095b<>();

    /* renamed from: q */
    private final C5376c f10186q;

    C5400m(AbstractC13821f fVar, C5376c cVar, C13220f fVar2) {
        super(fVar, fVar2);
        this.f10186q = cVar;
        this.f10113k.mo2555a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m29005u(Activity activity, C5376c cVar, C13813b<?> bVar) {
        AbstractC13821f c = LifecycleCallback.m29104c(activity);
        C5400m mVar = (C5400m) c.mo2554b("ConnectionlessLifecycleHelper", C5400m.class);
        if (mVar == null) {
            mVar = new C5400m(c, cVar, C13220f.m4286k());
        }
        C14004p.m2050k(bVar, "ApiKey cannot be null");
        mVar.f10185p.add(bVar);
        cVar.m29079d(mVar);
    }

    /* renamed from: v */
    private final void m29004v() {
        if (!this.f10185p.isEmpty()) {
            this.f10186q.m29079d(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo29007h() {
        super.mo29007h();
        m29004v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC5403n0, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo28998j() {
        super.mo28998j();
        m29004v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC5403n0, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo28997k() {
        super.mo28997k();
        this.f10186q.m29078e(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC5403n0
    /* renamed from: m */
    protected final void mo28995m(C13215a aVar, int i) {
        this.f10186q.m29083J(aVar, i);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC5403n0
    /* renamed from: n */
    protected final void mo28994n() {
        this.f10186q.m29081b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C2095b<C13813b<?>> m29006t() {
        return this.f10185p;
    }
}
