package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import p377v2.AbstractC13395b0;
import p377v2.AbstractC13401f;
import p377v2.AbstractC13414s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.r */
/* loaded from: classes.dex */
public final class C4130r {

    /* renamed from: a */
    private final Context f6913a;

    /* renamed from: b */
    private final C4129q f6914b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4130r(Context context, AbstractC13414s sVar) {
        this.f6913a = context;
        this.f6914b = new C4129q(this, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC13414s m32673b() {
        C4129q.m32678a(this.f6914b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC13401f m32672c() {
        return C4129q.m32677b(this.f6914b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m32671d() {
        this.f6914b.m32675d(this.f6913a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m32670e() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f6914b.m32676c(this.f6913a, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4130r(Context context, AbstractC13401f fVar, AbstractC13395b0 b0Var) {
        this.f6913a = context;
        this.f6914b = new C4129q(this, fVar, b0Var, null);
    }
}
