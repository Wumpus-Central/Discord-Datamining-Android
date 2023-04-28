package p136hc;

import android.content.Context;
import android.text.TextUtils;
import ca.C3805l;
import p420x9.C13996n;
import p420x9.C14004p;
import p420x9.C14013s;

/* renamed from: hc.k */
/* loaded from: classes3.dex */
public final class C7995k {

    /* renamed from: a */
    private final String f17219a;

    /* renamed from: b */
    private final String f17220b;

    /* renamed from: c */
    private final String f17221c;

    /* renamed from: d */
    private final String f17222d;

    /* renamed from: e */
    private final String f17223e;

    /* renamed from: f */
    private final String f17224f;

    /* renamed from: g */
    private final String f17225g;

    private C7995k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14004p.m2048m(!C3805l.m33554a(str), "ApplicationId must be set.");
        this.f17220b = str;
        this.f17219a = str2;
        this.f17221c = str3;
        this.f17222d = str4;
        this.f17223e = str5;
        this.f17224f = str6;
        this.f17225g = str7;
    }

    /* renamed from: a */
    public static C7995k m20943a(Context context) {
        C14013s sVar = new C14013s(context);
        String a = sVar.m2032a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C7995k(a, sVar.m2032a("google_api_key"), sVar.m2032a("firebase_database_url"), sVar.m2032a("ga_trackingId"), sVar.m2032a("gcm_defaultSenderId"), sVar.m2032a("google_storage_bucket"), sVar.m2032a("project_id"));
    }

    /* renamed from: b */
    public String m20942b() {
        return this.f17219a;
    }

    /* renamed from: c */
    public String m20941c() {
        return this.f17220b;
    }

    /* renamed from: d */
    public String m20940d() {
        return this.f17223e;
    }

    /* renamed from: e */
    public String m20939e() {
        return this.f17225g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7995k)) {
            return false;
        }
        C7995k kVar = (C7995k) obj;
        if (!C13996n.m2071b(this.f17220b, kVar.f17220b) || !C13996n.m2071b(this.f17219a, kVar.f17219a) || !C13996n.m2071b(this.f17221c, kVar.f17221c) || !C13996n.m2071b(this.f17222d, kVar.f17222d) || !C13996n.m2071b(this.f17223e, kVar.f17223e) || !C13996n.m2071b(this.f17224f, kVar.f17224f) || !C13996n.m2071b(this.f17225g, kVar.f17225g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f17220b, this.f17219a, this.f17221c, this.f17222d, this.f17223e, this.f17224f, this.f17225g);
    }

    public String toString() {
        return C13996n.m2069d(this).m2068a("applicationId", this.f17220b).m2068a("apiKey", this.f17219a).m2068a("databaseUrl", this.f17221c).m2068a("gcmSenderId", this.f17223e).m2068a("storageBucket", this.f17224f).m2068a("projectId", this.f17225g).toString();
    }
}
