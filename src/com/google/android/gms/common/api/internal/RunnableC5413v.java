package com.google.android.gms.common.api.internal;

import android.util.Log;
import java.util.Map;
import p365u9.C13215a;
import p384v9.C13456a;
import p400w9.C13813b;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes5.dex */
final class RunnableC5413v implements Runnable {

    /* renamed from: k */
    final /* synthetic */ C13215a f10217k;

    /* renamed from: l */
    final /* synthetic */ C5414w f10218l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5413v(C5414w wVar, C13215a aVar) {
        this.f10218l = wVar;
        this.f10217k = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C13813b bVar;
        C13456a.AbstractC13463f fVar;
        C13456a.AbstractC13463f fVar2;
        C13456a.AbstractC13463f fVar3;
        C13456a.AbstractC13463f fVar4;
        C5414w wVar = this.f10218l;
        map = wVar.f10224f.f10134v;
        bVar = wVar.f10220b;
        C5411t tVar = (C5411t) map.get(bVar);
        if (tVar != null) {
            if (this.f10217k.m4294z()) {
                this.f10218l.f10223e = true;
                fVar = this.f10218l.f10219a;
                if (fVar.mo2156g()) {
                    this.f10218l.m28943h();
                    return;
                }
                try {
                    C5414w wVar2 = this.f10218l;
                    fVar3 = wVar2.f10219a;
                    fVar4 = wVar2.f10219a;
                    fVar3.mo2570i(null, fVar4.mo2111j());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    fVar2 = this.f10218l.f10219a;
                    fVar2.mo2575b("Failed to get service from broker.");
                    tVar.m28981H(new C13215a(10), null);
                }
            } else {
                tVar.m28981H(this.f10217k, null);
            }
        }
    }
}
