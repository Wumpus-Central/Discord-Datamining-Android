package p074e2;

import org.json.JSONObject;

/* renamed from: e2.d1 */
/* loaded from: classes.dex */
public class C6612d1 extends C6697z0 {

    /* renamed from: o */
    private String f13907o;

    public C6612d1(C6607c cVar) {
        this.f13907o = C6629i1.m24947E(cVar.m25123f());
    }

    /* renamed from: b */
    public C6657o m25097b() {
        if (this.f14240a) {
            return null;
        }
        C6657o oVar = new C6657o();
        if ("unity".equals(this.f13907o)) {
            String str = this.f14243d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            oVar.f14095c = str;
            String str3 = this.f14244e;
            if (str3 == null) {
                str3 = str2;
            }
            oVar.f14096d = str3;
            String str4 = this.f14242c;
            if (str4 != null) {
                str2 = str4;
            }
            oVar.f14094b = str2;
            oVar.f14093a = this.f14241b;
            JSONObject jSONObject = this.f14245f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            oVar.f14097e = jSONObject;
        } else {
            oVar.f14095c = this.f14243d;
            oVar.f14096d = this.f14244e;
            oVar.f14094b = this.f14242c;
            oVar.f14093a = this.f14241b;
            oVar.f14097e = this.f14245f;
        }
        return oVar;
    }

    /* renamed from: c */
    public C6659p m25096c() {
        if (!this.f14240a) {
            return null;
        }
        C6659p pVar = new C6659p();
        if ("unity".equals(this.f13907o)) {
            String str = this.f14243d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            pVar.f14099b = str;
            String str3 = this.f14244e;
            if (str3 == null) {
                str3 = str2;
            }
            pVar.f14100c = str3;
            String str4 = this.f14242c;
            if (str4 != null) {
                str2 = str4;
            }
            pVar.f14098a = str2;
            JSONObject jSONObject = this.f14245f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            pVar.f14101d = jSONObject;
        } else {
            pVar.f14099b = this.f14243d;
            pVar.f14100c = this.f14244e;
            pVar.f14098a = this.f14242c;
            pVar.f14101d = this.f14245f;
        }
        return pVar;
    }
}
