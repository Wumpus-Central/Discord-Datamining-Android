package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p365u9.C13217c;
import p400w9.C13846x;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: classes5.dex */
public final class C5388g0 extends AbstractC5381d0<Void> {

    /* renamed from: c */
    public final C13846x f10161c;

    public C5388g0(C13846x xVar, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f10161c = xVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5395j0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo29019d(C5398l lVar, boolean z) {
    }

    @Override // p400w9.AbstractC13842t
    /* renamed from: f */
    public final boolean mo2541f(C5411t<?> tVar) {
        return this.f10161c.f31165a.m29045f();
    }

    @Override // p400w9.AbstractC13842t
    /* renamed from: g */
    public final C13217c[] mo2540g(C5411t<?> tVar) {
        return this.f10161c.f31165a.m29048c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5381d0
    /* renamed from: h */
    public final void mo29023h(C5411t<?> tVar) {
        this.f10161c.f31165a.mo29047d(tVar.m28954v(), this.f10145b);
        C5378d.C5379a<?> b = this.f10161c.f31165a.m29049b();
        if (b != null) {
            tVar.m28952x().put(b, this.f10161c);
        }
    }
}
