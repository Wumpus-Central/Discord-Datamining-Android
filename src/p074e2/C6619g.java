package p074e2;

import java.io.ObjectStreamField;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: e2.g */
/* loaded from: classes.dex */
public class C6619g implements Serializable {

    /* renamed from: v */
    private static final ObjectStreamField[] f13923v = {new ObjectStreamField("trackerToken", String.class), new ObjectStreamField("trackerName", String.class), new ObjectStreamField("network", String.class), new ObjectStreamField("campaign", String.class), new ObjectStreamField("adgroup", String.class), new ObjectStreamField("creative", String.class), new ObjectStreamField("clickLabel", String.class), new ObjectStreamField("adid", String.class), new ObjectStreamField("costType", String.class), new ObjectStreamField("costAmount", Double.class), new ObjectStreamField("costCurrency", String.class)};

    /* renamed from: k */
    public String f13924k;

    /* renamed from: l */
    public String f13925l;

    /* renamed from: m */
    public String f13926m;

    /* renamed from: n */
    public String f13927n;

    /* renamed from: o */
    public String f13928o;

    /* renamed from: p */
    public String f13929p;

    /* renamed from: q */
    public String f13930q;

    /* renamed from: r */
    public String f13931r;

    /* renamed from: s */
    public String f13932s;

    /* renamed from: t */
    public Double f13933t;

    /* renamed from: u */
    public String f13934u;

    /* renamed from: a */
    public static C6619g m25013a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return null;
        }
        C6619g gVar = new C6619g();
        if ("unity".equals(str2)) {
            gVar.f13924k = jSONObject.optString("tracker_token", "");
            gVar.f13925l = jSONObject.optString("tracker_name", "");
            gVar.f13926m = jSONObject.optString("network", "");
            gVar.f13927n = jSONObject.optString("campaign", "");
            gVar.f13928o = jSONObject.optString("adgroup", "");
            gVar.f13929p = jSONObject.optString("creative", "");
            gVar.f13930q = jSONObject.optString("click_label", "");
            if (str == null) {
                str = "";
            }
            gVar.f13931r = str;
            gVar.f13932s = jSONObject.optString("cost_type", "");
            gVar.f13933t = Double.valueOf(jSONObject.optDouble("cost_amount", 0.0d));
            gVar.f13934u = jSONObject.optString("cost_currency", "");
        } else {
            gVar.f13924k = jSONObject.optString("tracker_token");
            gVar.f13925l = jSONObject.optString("tracker_name");
            gVar.f13926m = jSONObject.optString("network");
            gVar.f13927n = jSONObject.optString("campaign");
            gVar.f13928o = jSONObject.optString("adgroup");
            gVar.f13929p = jSONObject.optString("creative");
            gVar.f13930q = jSONObject.optString("click_label");
            gVar.f13931r = str;
            gVar.f13932s = jSONObject.optString("cost_type");
            gVar.f13933t = Double.valueOf(jSONObject.optDouble("cost_amount"));
            gVar.f13934u = jSONObject.optString("cost_currency");
        }
        return gVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6619g gVar = (C6619g) obj;
        if (C6629i1.m24908j(this.f13924k, gVar.f13924k) && C6629i1.m24908j(this.f13925l, gVar.f13925l) && C6629i1.m24908j(this.f13926m, gVar.f13926m) && C6629i1.m24908j(this.f13927n, gVar.f13927n) && C6629i1.m24908j(this.f13928o, gVar.f13928o) && C6629i1.m24908j(this.f13929p, gVar.f13929p) && C6629i1.m24908j(this.f13930q, gVar.f13930q) && C6629i1.m24908j(this.f13931r, gVar.f13931r) && C6629i1.m24908j(this.f13932s, gVar.f13932s) && C6629i1.m24907k(this.f13933t, gVar.f13933t) && C6629i1.m24908j(this.f13934u, gVar.f13934u)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((629 + C6629i1.m24936P(this.f13924k)) * 37) + C6629i1.m24936P(this.f13925l)) * 37) + C6629i1.m24936P(this.f13926m)) * 37) + C6629i1.m24936P(this.f13927n)) * 37) + C6629i1.m24936P(this.f13928o)) * 37) + C6629i1.m24936P(this.f13929p)) * 37) + C6629i1.m24936P(this.f13930q)) * 37) + C6629i1.m24936P(this.f13931r)) * 37) + C6629i1.m24936P(this.f13932s)) * 37) + C6629i1.m24940L(this.f13933t)) * 37) + C6629i1.m24936P(this.f13934u);
    }

    public String toString() {
        return C6629i1.m24906l("tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s adid:%s ct:%s ca:%.2f cc:%s", this.f13924k, this.f13925l, this.f13926m, this.f13927n, this.f13928o, this.f13929p, this.f13930q, this.f13931r, this.f13932s, this.f13933t, this.f13934u);
    }
}
