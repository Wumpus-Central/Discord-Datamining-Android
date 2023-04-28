package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import p377v2.AbstractC13391a;
import p377v2.AbstractC13396c;
import p377v2.AbstractC13398d;
import p377v2.AbstractC13400e;
import p377v2.AbstractC13401f;
import p377v2.AbstractC13402g;
import p377v2.C13393b;
import p377v2.C13399d0;

/* loaded from: classes.dex */
public abstract class BillingClient {

    /* renamed from: com.android.billingclient.api.BillingClient$a */
    /* loaded from: classes.dex */
    public static final class C4098a {

        /* renamed from: a */
        private volatile boolean f6758a;

        /* renamed from: b */
        private final Context f6759b;

        /* renamed from: c */
        private volatile AbstractC13401f f6760c;

        /* synthetic */ C4098a(Context context, C13399d0 d0Var) {
            this.f6759b = context;
        }

        /* renamed from: a */
        public BillingClient m32846a() {
            if (this.f6759b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.f6760c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            } else if (!this.f6758a) {
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            } else if (this.f6760c != null) {
                return new C4113a(null, this.f6758a, this.f6759b, this.f6760c, null);
            } else {
                return new C4113a(null, this.f6758a, this.f6759b, null);
            }
        }

        /* renamed from: b */
        public C4098a m32845b() {
            this.f6758a = true;
            return this;
        }

        /* renamed from: c */
        public C4098a m32844c(AbstractC13401f fVar) {
            this.f6760c = fVar;
            return this;
        }
    }

    /* renamed from: f */
    public static C4098a m32847f(Context context) {
        return new C4098a(context, null);
    }

    /* renamed from: a */
    public abstract void mo32711a(C13393b bVar, AbstractC13396c cVar);

    /* renamed from: b */
    public abstract void mo32710b();

    /* renamed from: c */
    public abstract BillingResult mo32709c(String str);

    /* renamed from: d */
    public abstract boolean mo32708d();

    /* renamed from: e */
    public abstract BillingResult mo32707e(Activity activity, BillingFlowParams billingFlowParams);

    /* renamed from: g */
    public abstract void mo32706g(QueryProductDetailsParams queryProductDetailsParams, AbstractC13398d dVar);

    @Deprecated
    /* renamed from: h */
    public abstract void mo32705h(String str, AbstractC13400e eVar);

    @Deprecated
    /* renamed from: i */
    public abstract void mo32704i(SkuDetailsParams skuDetailsParams, AbstractC13402g gVar);

    /* renamed from: j */
    public abstract void mo32703j(AbstractC13391a aVar);
}
