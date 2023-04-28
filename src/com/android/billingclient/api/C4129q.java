package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p377v2.AbstractC13395b0;
import p377v2.AbstractC13401f;
import p377v2.AbstractC13414s;
import p377v2.C13397c0;
import sa.AbstractC12830b0;
import sa.C12844k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.q */
/* loaded from: classes.dex */
public final class C4129q extends BroadcastReceiver {

    /* renamed from: a */
    private final AbstractC13401f f6910a;

    /* renamed from: b */
    private boolean f6911b;

    /* renamed from: c */
    final /* synthetic */ C4130r f6912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4129q(C4130r rVar, AbstractC13414s sVar, C13397c0 c0Var) {
        this.f6912c = rVar;
        this.f6910a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ AbstractC13414s m32678a(C4129q qVar) {
        qVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ AbstractC13401f m32677b(C4129q qVar) {
        return qVar.f6910a;
    }

    /* renamed from: c */
    public final void m32676c(Context context, IntentFilter intentFilter) {
        C4129q qVar;
        if (!this.f6911b) {
            qVar = this.f6912c.f6914b;
            context.registerReceiver(qVar, intentFilter);
            this.f6911b = true;
        }
    }

    /* renamed from: d */
    public final void m32675d(Context context) {
        C4129q qVar;
        if (this.f6911b) {
            qVar = this.f6912c.f6914b;
            context.unregisterReceiver(qVar);
            this.f6911b = false;
            return;
        }
        C12844k.m5285m("BillingBroadcastManager", "Receiver is not registered.");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C12844k.m5285m("BillingBroadcastManager", "Bundle is null.");
            AbstractC13401f fVar = this.f6910a;
            if (fVar != null) {
                fVar.mo3759a(C4123k.f6891j, null);
                return;
            }
            return;
        }
        BillingResult h = C12844k.m5290h(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            if (!extras.getBoolean("IS_FIRST_PARTY_PURCHASE", false) && this.f6910a != null) {
                this.f6910a.mo3759a(h, C12844k.m5287k(extras));
                return;
            }
            C12844k.m5285m("BillingBroadcastManager", "Received purchase and no valid listener registered.");
        } else if (!action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
        } else {
            if (h.m32801a() != 0) {
                this.f6910a.mo3759a(h, AbstractC12830b0.m5313u());
                return;
            }
            C12844k.m5285m("BillingBroadcastManager", "AlternativeBillingListener is null.");
            this.f6910a.mo3759a(C4123k.f6891j, AbstractC12830b0.m5313u());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4129q(C4130r rVar, AbstractC13401f fVar, AbstractC13395b0 b0Var, C13397c0 c0Var) {
        this.f6912c = rVar;
        this.f6910a = fVar;
    }
}
