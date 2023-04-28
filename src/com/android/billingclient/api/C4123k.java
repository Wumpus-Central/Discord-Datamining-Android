package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.k */
/* loaded from: classes.dex */
public final class C4123k {

    /* renamed from: a */
    static final BillingResult f6882a;

    /* renamed from: b */
    static final BillingResult f6883b;

    /* renamed from: c */
    static final BillingResult f6884c;

    /* renamed from: d */
    static final BillingResult f6885d;

    /* renamed from: e */
    static final BillingResult f6886e;

    /* renamed from: f */
    static final BillingResult f6887f;

    /* renamed from: g */
    static final BillingResult f6888g;

    /* renamed from: h */
    static final BillingResult f6889h;

    /* renamed from: i */
    static final BillingResult f6890i;

    /* renamed from: j */
    static final BillingResult f6891j;

    /* renamed from: k */
    static final BillingResult f6892k;

    /* renamed from: l */
    static final BillingResult f6893l;

    /* renamed from: m */
    static final BillingResult f6894m;

    /* renamed from: n */
    static final BillingResult f6895n;

    /* renamed from: o */
    static final BillingResult f6896o;

    /* renamed from: p */
    static final BillingResult f6897p;

    /* renamed from: q */
    static final BillingResult f6898q;

    /* renamed from: r */
    static final BillingResult f6899r;

    /* renamed from: s */
    static final BillingResult f6900s;

    /* renamed from: t */
    static final BillingResult f6901t;

    /* renamed from: u */
    static final BillingResult f6902u;

    /* renamed from: v */
    static final BillingResult f6903v;

    /* renamed from: w */
    static final BillingResult f6904w;

    /* renamed from: x */
    static final BillingResult f6905x;

    /* renamed from: y */
    static final BillingResult f6906y;

    /* renamed from: z */
    static final BillingResult f6907z;

    static {
        BillingResult.C4104a b = BillingResult.m32800b();
        b.m32795c(3);
        b.m32796b("Google Play In-app Billing API version is less than 3");
        f6882a = b.m32797a();
        BillingResult.C4104a b2 = BillingResult.m32800b();
        b2.m32795c(3);
        b2.m32796b("Google Play In-app Billing API version is less than 9");
        f6883b = b2.m32797a();
        BillingResult.C4104a b3 = BillingResult.m32800b();
        b3.m32795c(3);
        b3.m32796b("Billing service unavailable on device.");
        f6884c = b3.m32797a();
        BillingResult.C4104a b4 = BillingResult.m32800b();
        b4.m32795c(5);
        b4.m32796b("Client is already in the process of connecting to billing service.");
        f6885d = b4.m32797a();
        BillingResult.C4104a b5 = BillingResult.m32800b();
        b5.m32795c(5);
        b5.m32796b("The list of SKUs can't be empty.");
        f6886e = b5.m32797a();
        BillingResult.C4104a b6 = BillingResult.m32800b();
        b6.m32795c(5);
        b6.m32796b("SKU type can't be empty.");
        f6887f = b6.m32797a();
        BillingResult.C4104a b7 = BillingResult.m32800b();
        b7.m32795c(5);
        b7.m32796b("Product type can't be empty.");
        f6888g = b7.m32797a();
        BillingResult.C4104a b8 = BillingResult.m32800b();
        b8.m32795c(-2);
        b8.m32796b("Client does not support extra params.");
        f6889h = b8.m32797a();
        BillingResult.C4104a b9 = BillingResult.m32800b();
        b9.m32795c(5);
        b9.m32796b("Invalid purchase token.");
        f6890i = b9.m32797a();
        BillingResult.C4104a b10 = BillingResult.m32800b();
        b10.m32795c(6);
        b10.m32796b("An internal error occurred.");
        f6891j = b10.m32797a();
        BillingResult.C4104a b11 = BillingResult.m32800b();
        b11.m32795c(5);
        b11.m32796b("SKU can't be null.");
        f6892k = b11.m32797a();
        BillingResult.C4104a b12 = BillingResult.m32800b();
        b12.m32795c(0);
        f6893l = b12.m32797a();
        BillingResult.C4104a b13 = BillingResult.m32800b();
        b13.m32795c(-1);
        b13.m32796b("Service connection is disconnected.");
        f6894m = b13.m32797a();
        BillingResult.C4104a b14 = BillingResult.m32800b();
        b14.m32795c(-3);
        b14.m32796b("Timeout communicating with service.");
        f6895n = b14.m32797a();
        BillingResult.C4104a b15 = BillingResult.m32800b();
        b15.m32795c(-2);
        b15.m32796b("Client does not support subscriptions.");
        f6896o = b15.m32797a();
        BillingResult.C4104a b16 = BillingResult.m32800b();
        b16.m32795c(-2);
        b16.m32796b("Client does not support subscriptions update.");
        f6897p = b16.m32797a();
        BillingResult.C4104a b17 = BillingResult.m32800b();
        b17.m32795c(-2);
        b17.m32796b("Client does not support get purchase history.");
        f6898q = b17.m32797a();
        BillingResult.C4104a b18 = BillingResult.m32800b();
        b18.m32795c(-2);
        b18.m32796b("Client does not support price change confirmation.");
        f6899r = b18.m32797a();
        BillingResult.C4104a b19 = BillingResult.m32800b();
        b19.m32795c(-2);
        b19.m32796b("Play Store version installed does not support cross selling products.");
        f6900s = b19.m32797a();
        BillingResult.C4104a b20 = BillingResult.m32800b();
        b20.m32795c(-2);
        b20.m32796b("Client does not support multi-item purchases.");
        f6901t = b20.m32797a();
        BillingResult.C4104a b21 = BillingResult.m32800b();
        b21.m32795c(-2);
        b21.m32796b("Client does not support offer_id_token.");
        f6902u = b21.m32797a();
        BillingResult.C4104a b22 = BillingResult.m32800b();
        b22.m32795c(-2);
        b22.m32796b("Client does not support ProductDetails.");
        f6903v = b22.m32797a();
        BillingResult.C4104a b23 = BillingResult.m32800b();
        b23.m32795c(-2);
        b23.m32796b("Client does not support in-app messages.");
        f6904w = b23.m32797a();
        BillingResult.C4104a b24 = BillingResult.m32800b();
        b24.m32795c(-2);
        b24.m32796b("Client does not support alternative billing.");
        f6905x = b24.m32797a();
        BillingResult.C4104a b25 = BillingResult.m32800b();
        b25.m32795c(5);
        b25.m32796b("Unknown feature");
        f6906y = b25.m32797a();
        BillingResult.C4104a b26 = BillingResult.m32800b();
        b26.m32795c(-2);
        b26.m32796b("Play Store version installed does not support get billing config.");
        f6907z = b26.m32797a();
    }
}
