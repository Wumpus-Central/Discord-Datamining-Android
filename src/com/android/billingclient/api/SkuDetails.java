package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a */
    private final String f6831a;

    /* renamed from: b */
    private final JSONObject f6832b;

    public SkuDetails(String str) {
        this.f6831a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f6832b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    /* renamed from: a */
    public String m32750a() {
        return this.f6832b.optString("description");
    }

    /* renamed from: b */
    public String m32749b() {
        return this.f6832b.optString("price");
    }

    /* renamed from: c */
    public long m32748c() {
        return this.f6832b.optLong("price_amount_micros");
    }

    /* renamed from: d */
    public String m32747d() {
        return this.f6832b.optString("price_currency_code");
    }

    /* renamed from: e */
    public String m32746e() {
        return this.f6832b.optString("productId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f6831a, ((SkuDetails) obj).f6831a);
    }

    /* renamed from: f */
    public String m32745f() {
        return this.f6832b.optString("title");
    }

    /* renamed from: g */
    public String m32744g() {
        return this.f6832b.optString("type");
    }

    /* renamed from: h */
    public int m32743h() {
        return this.f6832b.optInt("offer_type");
    }

    public int hashCode() {
        return this.f6831a.hashCode();
    }

    /* renamed from: i */
    public String m32742i() {
        return this.f6832b.optString("offer_id");
    }

    /* renamed from: j */
    public String m32741j() {
        String optString = this.f6832b.optString("offerIdToken");
        if (optString.isEmpty()) {
            return this.f6832b.optString("offer_id_token");
        }
        return optString;
    }

    /* renamed from: k */
    public final String m32740k() {
        return this.f6832b.optString("packageName");
    }

    /* renamed from: l */
    public String m32739l() {
        return this.f6832b.optString("serializedDocid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final String m32738m() {
        return this.f6832b.optString("skuDetailsToken");
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f6831a));
    }
}
