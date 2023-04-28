package p074e2;

import org.json.JSONObject;

/* renamed from: e2.y */
/* loaded from: classes.dex */
public class C6691y extends C6697z0 {

    /* renamed from: o */
    private String f14231o;

    /* renamed from: p */
    private String f14232p;

    /* renamed from: q */
    private String f14233q;

    public C6691y(C6607c cVar) {
        this.f14231o = cVar.m25116m().get("event_token");
        this.f14232p = cVar.m25116m().get("event_callback_id");
        this.f14233q = C6629i1.m24947E(cVar.m25123f());
    }

    /* renamed from: b */
    public C6635j m24639b() {
        if (this.f14240a) {
            return null;
        }
        C6635j jVar = new C6635j();
        if ("unity".equals(this.f14233q)) {
            String str = this.f14231o;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jVar.f14001e = str;
            String str3 = this.f14243d;
            if (str3 == null) {
                str3 = str2;
            }
            jVar.f13999c = str3;
            String str4 = this.f14244e;
            if (str4 == null) {
                str4 = str2;
            }
            jVar.f14000d = str4;
            String str5 = this.f14242c;
            if (str5 == null) {
                str5 = str2;
            }
            jVar.f13998b = str5;
            String str6 = this.f14232p;
            if (str6 != null) {
                str2 = str6;
            }
            jVar.f14002f = str2;
            jVar.f13997a = this.f14241b;
            JSONObject jSONObject = this.f14245f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jVar.f14003g = jSONObject;
        } else {
            jVar.f14001e = this.f14231o;
            jVar.f13999c = this.f14243d;
            jVar.f14000d = this.f14244e;
            jVar.f13998b = this.f14242c;
            jVar.f14002f = this.f14232p;
            jVar.f13997a = this.f14241b;
            jVar.f14003g = this.f14245f;
        }
        return jVar;
    }

    /* renamed from: c */
    public C6637k m24638c() {
        if (!this.f14240a) {
            return null;
        }
        C6637k kVar = new C6637k();
        if ("unity".equals(this.f14233q)) {
            String str = this.f14231o;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            kVar.f14016d = str;
            String str3 = this.f14243d;
            if (str3 == null) {
                str3 = str2;
            }
            kVar.f14014b = str3;
            String str4 = this.f14244e;
            if (str4 == null) {
                str4 = str2;
            }
            kVar.f14015c = str4;
            String str5 = this.f14242c;
            if (str5 == null) {
                str5 = str2;
            }
            kVar.f14013a = str5;
            String str6 = this.f14232p;
            if (str6 != null) {
                str2 = str6;
            }
            kVar.f14017e = str2;
            JSONObject jSONObject = this.f14245f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            kVar.f14018f = jSONObject;
        } else {
            kVar.f14016d = this.f14231o;
            kVar.f14014b = this.f14243d;
            kVar.f14015c = this.f14244e;
            kVar.f14013a = this.f14242c;
            kVar.f14017e = this.f14232p;
            kVar.f14018f = this.f14245f;
        }
        return kVar;
    }
}
