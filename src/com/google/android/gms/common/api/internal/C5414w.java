package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
import p365u9.C13215a;
import p384v9.C13456a;
import p400w9.AbstractC13818d0;
import p400w9.C13813b;
import p420x9.AbstractC13957c;
import p420x9.AbstractC13983j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes5.dex */
public final class C5414w implements AbstractC13957c.AbstractC0452c, AbstractC13818d0 {

    /* renamed from: a */
    private final C13456a.AbstractC13463f f10219a;

    /* renamed from: b */
    private final C13813b<?> f10220b;

    /* renamed from: c */
    private AbstractC13983j f10221c = null;

    /* renamed from: d */
    private Set<Scope> f10222d = null;

    /* renamed from: e */
    private boolean f10223e = false;

    /* renamed from: f */
    final /* synthetic */ C5376c f10224f;

    public C5414w(C5376c cVar, C13456a.AbstractC13463f fVar, C13813b<?> bVar) {
        this.f10224f = cVar;
        this.f10219a = fVar;
        this.f10220b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m28943h() {
        AbstractC13983j jVar;
        if (this.f10223e && (jVar = this.f10221c) != null) {
            this.f10219a.mo2570i(jVar, this.f10222d);
        }
    }

    @Override // p400w9.AbstractC13818d0
    /* renamed from: a */
    public final void mo2589a(AbstractC13983j jVar, Set<Scope> set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo2588b(new C13215a(4));
            return;
        }
        this.f10221c = jVar;
        this.f10222d = set;
        m28943h();
    }

    @Override // p400w9.AbstractC13818d0
    /* renamed from: b */
    public final void mo2588b(C13215a aVar) {
        Map map;
        map = this.f10224f.f10134v;
        C5411t tVar = (C5411t) map.get(this.f10220b);
        if (tVar != null) {
            tVar.m28980I(aVar);
        }
    }

    @Override // p420x9.AbstractC13957c.AbstractC0452c
    /* renamed from: c */
    public final void mo2144c(C13215a aVar) {
        Handler handler;
        handler = this.f10224f.f10138z;
        handler.post(new RunnableC5413v(this, aVar));
    }
}
