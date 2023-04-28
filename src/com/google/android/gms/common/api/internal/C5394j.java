package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import p384v9.AbstractC13473g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: classes5.dex */
public final class C5394j implements AbstractC13473g.AbstractC13474a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f10174a;

    /* renamed from: b */
    final /* synthetic */ C5398l f10175b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5394j(C5398l lVar, BasePendingResult basePendingResult) {
        this.f10175b = lVar;
        this.f10174a = basePendingResult;
    }

    @Override // p384v9.AbstractC13473g.AbstractC13474a
    /* renamed from: a */
    public final void mo2080a(Status status) {
        Map map;
        map = this.f10175b.f10181a;
        map.remove(this.f10174a);
    }
}
