package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ca.AbstractC3797d;
import ca.C3798e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p298q9.C12051c;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* loaded from: classes5.dex */
public class GoogleSignInAccount extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C5363c();

    /* renamed from: x */
    public static AbstractC3797d f10044x = C3798e.m33579c();

    /* renamed from: k */
    final int f10045k;

    /* renamed from: l */
    private String f10046l;

    /* renamed from: m */
    private String f10047m;

    /* renamed from: n */
    private String f10048n;

    /* renamed from: o */
    private String f10049o;

    /* renamed from: p */
    private Uri f10050p;

    /* renamed from: q */
    private String f10051q;

    /* renamed from: r */
    private long f10052r;

    /* renamed from: s */
    private String f10053s;

    /* renamed from: t */
    List<Scope> f10054t;

    /* renamed from: u */
    private String f10055u;

    /* renamed from: v */
    private String f10056v;

    /* renamed from: w */
    private Set<Scope> f10057w = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f10045k = i;
        this.f10046l = str;
        this.f10047m = str2;
        this.f10048n = str3;
        this.f10049o = str4;
        this.f10050p = uri;
        this.f10051q = str5;
        this.f10052r = j;
        this.f10053s = str6;
        this.f10054t = list;
        this.f10055u = str7;
        this.f10056v = str8;
    }

    /* renamed from: T */
    public static GoogleSignInAccount m29168T(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), C14004p.m2055f(str7), new ArrayList((Collection) C14004p.m2051j(set)), str5, str6);
    }

    /* renamed from: U */
    public static GoogleSignInAccount m29167U(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount T = m29168T(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        T.f10051q = str7;
        return T;
    }

    /* renamed from: B */
    public Uri m29171B() {
        return this.f10050p;
    }

    /* renamed from: C */
    public Set<Scope> m29170C() {
        HashSet hashSet = new HashSet(this.f10054t);
        hashSet.addAll(this.f10057w);
        return hashSet;
    }

    /* renamed from: M */
    public String m29169M() {
        return this.f10051q;
    }

    /* renamed from: V */
    public final String m29166V() {
        return this.f10053s;
    }

    /* renamed from: W */
    public final String m29165W() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (m29159z() != null) {
                jSONObject.put("tokenId", m29159z());
            }
            if (m29162r() != null) {
                jSONObject.put("email", m29162r());
            }
            if (m29163p() != null) {
                jSONObject.put("displayName", m29163p());
            }
            if (m29160u() != null) {
                jSONObject.put("givenName", m29160u());
            }
            if (m29161t() != null) {
                jSONObject.put("familyName", m29161t());
            }
            Uri B = m29171B();
            if (B != null) {
                jSONObject.put("photoUrl", B.toString());
            }
            if (m29169M() != null) {
                jSONObject.put("serverAuthCode", m29169M());
            }
            jSONObject.put("expirationTime", this.f10052r);
            jSONObject.put("obfuscatedIdentifier", this.f10053s);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f10054t;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C12051c.f27084k);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m29115p());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f10053s.equals(this.f10053s) || !googleSignInAccount.m29170C().equals(m29170C())) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f10046l;
    }

    public int hashCode() {
        return ((this.f10053s.hashCode() + 527) * 31) + m29170C().hashCode();
    }

    /* renamed from: j */
    public Account m29164j() {
        String str = this.f10048n;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    /* renamed from: p */
    public String m29163p() {
        return this.f10049o;
    }

    /* renamed from: r */
    public String m29162r() {
        return this.f10048n;
    }

    /* renamed from: t */
    public String m29161t() {
        return this.f10056v;
    }

    /* renamed from: u */
    public String m29160u() {
        return this.f10055u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10045k);
        C14323c.m842p(parcel, 2, getId(), false);
        C14323c.m842p(parcel, 3, m29159z(), false);
        C14323c.m842p(parcel, 4, m29162r(), false);
        C14323c.m842p(parcel, 5, m29163p(), false);
        C14323c.m844n(parcel, 6, m29171B(), i, false);
        C14323c.m842p(parcel, 7, m29169M(), false);
        C14323c.m845m(parcel, 8, this.f10052r);
        C14323c.m842p(parcel, 9, this.f10053s, false);
        C14323c.m838t(parcel, 10, this.f10054t, false);
        C14323c.m842p(parcel, 11, m29160u(), false);
        C14323c.m842p(parcel, 12, m29161t(), false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public String m29159z() {
        return this.f10047m;
    }
}
