package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sa.AbstractC12830b0;

/* loaded from: classes.dex */
public final class ProductDetails {

    /* renamed from: a */
    private final String f6787a;

    /* renamed from: b */
    private final JSONObject f6788b;

    /* renamed from: c */
    private final String f6789c;

    /* renamed from: d */
    private final String f6790d;

    /* renamed from: e */
    private final String f6791e;

    /* renamed from: f */
    private final String f6792f;

    /* renamed from: g */
    private final String f6793g;

    /* renamed from: h */
    private final String f6794h;

    /* renamed from: i */
    private final String f6795i;

    /* renamed from: j */
    private final List f6796j;

    /* renamed from: k */
    private final List f6797k;

    /* renamed from: l */
    private final C4125m f6798l;

    /* renamed from: com.android.billingclient.api.ProductDetails$a */
    /* loaded from: classes.dex */
    public static final class C4105a {

        /* renamed from: a */
        private final String f6799a;

        /* renamed from: b */
        private final long f6800b;

        /* renamed from: c */
        private final String f6801c;

        /* renamed from: d */
        private final String f6802d;

        /* renamed from: e */
        private final String f6803e;

        /* renamed from: f */
        private final AbstractC12830b0 f6804f;

        C4105a(JSONObject jSONObject) {
            this.f6799a = jSONObject.optString("formattedPrice");
            this.f6800b = jSONObject.optLong("priceAmountMicros");
            this.f6801c = jSONObject.optString("priceCurrencyCode");
            this.f6802d = jSONObject.optString("offerIdToken");
            this.f6803e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.f6804f = AbstractC12830b0.m5314t(arrayList);
        }

        /* renamed from: a */
        public String m32785a() {
            return this.f6799a;
        }

        /* renamed from: b */
        public long m32784b() {
            return this.f6800b;
        }

        /* renamed from: c */
        public String m32783c() {
            return this.f6801c;
        }

        /* renamed from: d */
        public final String m32782d() {
            return this.f6802d;
        }
    }

    /* renamed from: com.android.billingclient.api.ProductDetails$b */
    /* loaded from: classes.dex */
    public static final class C4106b {

        /* renamed from: a */
        private final String f6805a;

        /* renamed from: b */
        private final long f6806b;

        /* renamed from: c */
        private final String f6807c;

        /* renamed from: d */
        private final String f6808d;

        /* renamed from: e */
        private final int f6809e;

        /* renamed from: f */
        private final int f6810f;

        C4106b(JSONObject jSONObject) {
            this.f6808d = jSONObject.optString("billingPeriod");
            this.f6807c = jSONObject.optString("priceCurrencyCode");
            this.f6805a = jSONObject.optString("formattedPrice");
            this.f6806b = jSONObject.optLong("priceAmountMicros");
            this.f6810f = jSONObject.optInt("recurrenceMode");
            this.f6809e = jSONObject.optInt("billingCycleCount");
        }

        /* renamed from: a */
        public String m32781a() {
            return this.f6805a;
        }

        /* renamed from: b */
        public long m32780b() {
            return this.f6806b;
        }

        /* renamed from: c */
        public String m32779c() {
            return this.f6807c;
        }
    }

    /* renamed from: com.android.billingclient.api.ProductDetails$c */
    /* loaded from: classes.dex */
    public static class C4107c {

        /* renamed from: a */
        private final List<C4106b> f6811a;

        C4107c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new C4106b(optJSONObject));
                    }
                }
            }
            this.f6811a = arrayList;
        }

        /* renamed from: a */
        public List<C4106b> m32778a() {
            return this.f6811a;
        }
    }

    /* renamed from: com.android.billingclient.api.ProductDetails$d */
    /* loaded from: classes.dex */
    public static final class C4108d {

        /* renamed from: a */
        private final String f6812a;

        /* renamed from: b */
        private final String f6813b;

        /* renamed from: c */
        private final String f6814c;

        /* renamed from: d */
        private final C4107c f6815d;

        /* renamed from: e */
        private final List f6816e;

        /* renamed from: f */
        private final C4124l f6817f;

        C4108d(JSONObject jSONObject) {
            this.f6812a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            C4124l lVar = null;
            this.f6813b = true == optString.isEmpty() ? null : optString;
            this.f6814c = jSONObject.getString("offerIdToken");
            this.f6815d = new C4107c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f6817f = optJSONObject != null ? new C4124l(optJSONObject) : lVar;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.f6816e = arrayList;
        }

        /* renamed from: a */
        public String m32777a() {
            return this.f6813b;
        }

        /* renamed from: b */
        public String m32776b() {
            return this.f6814c;
        }

        /* renamed from: c */
        public C4107c m32775c() {
            return this.f6815d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProductDetails(String str) {
        ArrayList arrayList;
        this.f6787a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f6788b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f6789c = optString;
        String optString2 = jSONObject.optString("type");
        this.f6790d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        } else if (!TextUtils.isEmpty(optString2)) {
            this.f6791e = jSONObject.optString("title");
            this.f6792f = jSONObject.optString("name");
            this.f6793g = jSONObject.optString("description");
            this.f6794h = jSONObject.optString("skuDetailsToken");
            this.f6795i = jSONObject.optString("serializedDocid");
            JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList2.add(new C4108d(optJSONArray.getJSONObject(i)));
                }
                this.f6796j = arrayList2;
            } else {
                if (optString2.equals("subs") || optString2.equals("play_pass_subs")) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                this.f6796j = arrayList;
            }
            JSONObject optJSONObject = this.f6788b.optJSONObject("oneTimePurchaseOfferDetails");
            JSONArray optJSONArray2 = this.f6788b.optJSONArray("oneTimePurchaseOfferDetailsList");
            ArrayList arrayList3 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    arrayList3.add(new C4105a(optJSONArray2.getJSONObject(i2)));
                }
                this.f6797k = arrayList3;
            } else if (optJSONObject != null) {
                arrayList3.add(new C4105a(optJSONObject));
                this.f6797k = arrayList3;
            } else {
                this.f6797k = null;
            }
            JSONObject optJSONObject2 = this.f6788b.optJSONObject("limitedQuantityInfo");
            if (optJSONObject2 != null) {
                this.f6798l = new C4125m(optJSONObject2);
            } else {
                this.f6798l = null;
            }
        } else {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
    }

    /* renamed from: a */
    public String m32794a() {
        return this.f6793g;
    }

    /* renamed from: b */
    public C4105a m32793b() {
        List list = this.f6797k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C4105a) this.f6797k.get(0);
    }

    /* renamed from: c */
    public String m32792c() {
        return this.f6789c;
    }

    /* renamed from: d */
    public String m32791d() {
        return this.f6790d;
    }

    /* renamed from: e */
    public List<C4108d> m32790e() {
        return this.f6796j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetails)) {
            return false;
        }
        return TextUtils.equals(this.f6787a, ((ProductDetails) obj).f6787a);
    }

    /* renamed from: f */
    public String m32789f() {
        return this.f6791e;
    }

    /* renamed from: g */
    public final String m32788g() {
        return this.f6788b.optString("packageName");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final String m32787h() {
        return this.f6794h;
    }

    public int hashCode() {
        return this.f6787a.hashCode();
    }

    /* renamed from: i */
    public String m32786i() {
        return this.f6795i;
    }

    public String toString() {
        String str = this.f6787a;
        String obj = this.f6788b.toString();
        String str2 = this.f6789c;
        String str3 = this.f6790d;
        String str4 = this.f6791e;
        String str5 = this.f6794h;
        String valueOf = String.valueOf(this.f6796j);
        return "ProductDetails{jsonString='" + str + "', parsedJson=" + obj + ", productId='" + str2 + "', productType='" + str3 + "', title='" + str4 + "', productDetailsToken='" + str5 + "', subscriptionOfferDetails=" + valueOf + "}";
    }
}
