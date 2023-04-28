package com.android.billingclient.api;

import java.util.concurrent.Callable;
import p377v2.AbstractC13400e;
import p377v2.C13415t;
import sa.AbstractC12830b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.f */
/* loaded from: classes.dex */
public final class CallableC4118f implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f6871a;

    /* renamed from: b */
    final /* synthetic */ AbstractC13400e f6872b;

    /* renamed from: c */
    final /* synthetic */ C4113a f6873c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC4118f(C4113a aVar, String str, AbstractC13400e eVar) {
        this.f6873c = aVar;
        this.f6871a = str;
        this.f6872b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C13415t C = C4113a.m32727C(this.f6873c, this.f6871a);
        if (C.m3756b() != null) {
            this.f6872b.mo3760a(C.m3757a(), C.m3756b());
            return null;
        }
        this.f6872b.mo3760a(C.m3757a(), AbstractC12830b0.m5313u());
        return null;
    }
}
