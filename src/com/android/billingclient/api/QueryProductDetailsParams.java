package com.android.billingclient.api;

import java.util.HashSet;
import java.util.List;
import p377v2.C13416u;
import p377v2.C13417v;
import p377v2.C13418w;
import p377v2.C13419x;
import sa.AbstractC12830b0;

/* loaded from: classes.dex */
public final class QueryProductDetailsParams {

    /* renamed from: a */
    private final AbstractC12830b0 f6825a;

    /* renamed from: com.android.billingclient.api.QueryProductDetailsParams$a */
    /* loaded from: classes.dex */
    public static class C4109a {

        /* renamed from: a */
        private AbstractC12830b0 f6826a;

        /* synthetic */ C4109a(C13416u uVar) {
        }

        /* renamed from: a */
        public QueryProductDetailsParams m32761a() {
            return new QueryProductDetailsParams(this, null);
        }

        /* renamed from: b */
        public C4109a m32760b(List<C4110b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (C4110b bVar : list) {
                if (!"play_pass_subs".equals(bVar.m32756c())) {
                    hashSet.add(bVar.m32756c());
                }
            }
            if (hashSet.size() <= 1) {
                this.f6826a = AbstractC12830b0.m5314t(list);
                return this;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
    }

    /* renamed from: com.android.billingclient.api.QueryProductDetailsParams$b */
    /* loaded from: classes.dex */
    public static class C4110b {

        /* renamed from: a */
        private final String f6827a;

        /* renamed from: b */
        private final String f6828b;

        /* renamed from: com.android.billingclient.api.QueryProductDetailsParams$b$a */
        /* loaded from: classes.dex */
        public static class C4111a {

            /* renamed from: a */
            private String f6829a;

            /* renamed from: b */
            private String f6830b;

            /* synthetic */ C4111a(C13417v vVar) {
            }

            /* renamed from: a */
            public C4110b m32755a() {
                if ("first_party".equals(this.f6830b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                } else if (this.f6829a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                } else if (this.f6830b != null) {
                    return new C4110b(this, null);
                } else {
                    throw new IllegalArgumentException("Product type must be provided.");
                }
            }

            /* renamed from: b */
            public C4111a m32754b(String str) {
                this.f6829a = str;
                return this;
            }

            /* renamed from: c */
            public C4111a m32753c(String str) {
                this.f6830b = str;
                return this;
            }
        }

        /* synthetic */ C4110b(C4111a aVar, C13418w wVar) {
            this.f6827a = aVar.f6829a;
            this.f6828b = aVar.f6830b;
        }

        /* renamed from: a */
        public static C4111a m32758a() {
            return new C4111a(null);
        }

        /* renamed from: b */
        public final String m32757b() {
            return this.f6827a;
        }

        /* renamed from: c */
        public final String m32756c() {
            return this.f6828b;
        }
    }

    /* synthetic */ QueryProductDetailsParams(C4109a aVar, C13419x xVar) {
        this.f6825a = aVar.f6826a;
    }

    /* renamed from: a */
    public static C4109a m32764a() {
        return new C4109a(null);
    }

    /* renamed from: b */
    public final AbstractC12830b0 m32763b() {
        return this.f6825a;
    }

    /* renamed from: c */
    public final String m32762c() {
        return ((C4110b) this.f6825a.get(0)).m32756c();
    }
}
