package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import p377v2.C13420y;

@Deprecated
/* loaded from: classes.dex */
public class SkuDetailsParams {

    /* renamed from: a */
    private String f6833a;

    /* renamed from: b */
    private List f6834b;

    /* renamed from: com.android.billingclient.api.SkuDetailsParams$a */
    /* loaded from: classes.dex */
    public static class C4112a {

        /* renamed from: a */
        private String f6835a;

        /* renamed from: b */
        private List f6836b;

        /* synthetic */ C4112a(C13420y yVar) {
        }

        /* renamed from: a */
        public SkuDetailsParams m32732a() {
            String str = this.f6835a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.f6836b != null) {
                SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
                skuDetailsParams.f6833a = str;
                skuDetailsParams.f6834b = this.f6836b;
                return skuDetailsParams;
            } else {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
        }

        /* renamed from: b */
        public C4112a m32731b(List<String> list) {
            this.f6836b = new ArrayList(list);
            return this;
        }

        /* renamed from: c */
        public C4112a m32730c(String str) {
            this.f6835a = str;
            return this;
        }
    }

    /* renamed from: c */
    public static C4112a m32735c() {
        return new C4112a(null);
    }

    /* renamed from: a */
    public String m32737a() {
        return this.f6833a;
    }

    /* renamed from: b */
    public List<String> m32736b() {
        return this.f6834b;
    }
}
