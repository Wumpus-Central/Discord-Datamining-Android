package com.google.android.gms.common.api.internal;

import p384v9.C13456a;

/* renamed from: com.google.android.gms.common.api.internal.r */
/* loaded from: classes5.dex */
final class RunnableC5409r implements Runnable {

    /* renamed from: k */
    final /* synthetic */ C5410s f10200k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5409r(C5410s sVar) {
        this.f10200k = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13456a.AbstractC13463f fVar;
        C13456a.AbstractC13463f fVar2;
        C5411t tVar = this.f10200k.f10201a;
        fVar = tVar.f10203b;
        fVar2 = tVar.f10203b;
        fVar.mo2575b(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
