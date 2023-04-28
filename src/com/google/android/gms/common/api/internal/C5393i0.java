package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p365u9.C13217c;
import p400w9.C13846x;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* loaded from: classes5.dex */
public final class C5393i0 extends AbstractC5381d0<Boolean> {

    /* renamed from: c */
    public final C5378d.C5379a<?> f10173c;

    public C5393i0(C5378d.C5379a<?> aVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f10173c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo29019d(C5398l lVar, boolean z) {
    }

    @Override // p400w9.AbstractC13842t
    /* renamed from: f */
    public final boolean mo2541f(C5411t<?> tVar) {
        C13846x xVar = tVar.m28952x().get(this.f10173c);
        if (xVar == null || !xVar.f31165a.m29045f()) {
            return false;
        }
        return true;
    }

    @Override // p400w9.AbstractC13842t
    /* renamed from: g */
    public final C13217c[] mo2540g(C5411t<?> tVar) {
        C13846x xVar = tVar.m28952x().get(this.f10173c);
        if (xVar == null) {
            return null;
        }
        return xVar.f31165a.m29048c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5381d0
    /* renamed from: h */
    public final void mo29023h(C5411t<?> tVar) {
        C13846x remove = tVar.m28952x().remove(this.f10173c);
        if (remove != null) {
            remove.f31166b.mo29024b(tVar.m28954v(), this.f10145b);
            remove.f31165a.m29050a();
            return;
        }
        this.f10145b.m28898e(Boolean.FALSE);
    }
}
