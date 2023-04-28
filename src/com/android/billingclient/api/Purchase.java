package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a */
    private final String f6822a;

    /* renamed from: b */
    private final String f6823b;

    /* renamed from: c */
    private final JSONObject f6824c;

    public Purchase(String str, String str2) {
        this.f6822a = str;
        this.f6823b = str2;
        this.f6824c = new JSONObject(str);
    }

    /* renamed from: h */
    private final ArrayList m32765h() {
        ArrayList arrayList = new ArrayList();
        if (this.f6824c.has("productIds")) {
            JSONArray optJSONArray = this.f6824c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.f6824c.has("productId")) {
            arrayList.add(this.f6824c.optString("productId"));
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m32772a() {
        return this.f6822a;
    }

    /* renamed from: b */
    public String m32771b() {
        return this.f6824c.optString("packageName");
    }

    /* renamed from: c */
    public int m32770c() {
        return this.f6824c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* renamed from: d */
    public String m32769d() {
        JSONObject jSONObject = this.f6824c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: e */
    public String m32768e() {
        return this.f6823b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (!TextUtils.equals(this.f6822a, purchase.m32772a()) || !TextUtils.equals(this.f6823b, purchase.m32768e())) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: f */
    public ArrayList<String> m32767f() {
        return m32765h();
    }

    /* renamed from: g */
    public boolean m32766g() {
        return this.f6824c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f6822a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f6822a));
    }
}
