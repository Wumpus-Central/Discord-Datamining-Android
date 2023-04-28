package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p318r9.C12467a;
import p318r9.C12468b;
import p384v9.C13456a;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* loaded from: classes5.dex */
public class GoogleSignInOptions extends AbstractC14320a implements C13456a.AbstractC13459d, ReflectedParcelable {

    /* renamed from: A */
    public static final Scope f37387A;

    /* renamed from: v */
    public static final GoogleSignInOptions f10058v;

    /* renamed from: w */
    public static final GoogleSignInOptions f10059w;

    /* renamed from: k */
    final int f10063k;

    /* renamed from: l */
    private final ArrayList<Scope> f10064l;

    /* renamed from: m */
    private Account f10065m;

    /* renamed from: n */
    private boolean f10066n;

    /* renamed from: o */
    private final boolean f10067o;

    /* renamed from: p */
    private final boolean f10068p;

    /* renamed from: q */
    private String f10069q;

    /* renamed from: r */
    private String f10070r;

    /* renamed from: s */
    private ArrayList<C12467a> f10071s;

    /* renamed from: t */
    private String f10072t;

    /* renamed from: u */
    private Map<Integer, C12467a> f10073u;

    /* renamed from: x */
    public static final Scope f10060x = new Scope("profile");

    /* renamed from: y */
    public static final Scope f10061y = new Scope("email");

    /* renamed from: z */
    public static final Scope f10062z = new Scope("openid");

    /* renamed from: B */
    public static final Scope f37388B = new Scope("https://www.googleapis.com/auth/games");
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C5365e();

    /* renamed from: C */
    private static Comparator<Scope> f37389C = new C5364d();

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f37387A = scope;
        C5360a aVar = new C5360a();
        aVar.m29136b();
        aVar.m29135c();
        f10058v = aVar.m29137a();
        C5360a aVar2 = new C5360a();
        aVar2.m29134d(scope, new Scope[0]);
        f10059w = aVar2.m29137a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<C12467a> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m29144e0(arrayList2), str3);
    }

    /* renamed from: T */
    public static GoogleSignInOptions m29155T(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, str3, str4, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static Map<Integer, C12467a> m29144e0(List<C12467a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (C12467a aVar : list) {
            hashMap.put(Integer.valueOf(aVar.m6654p()), aVar);
        }
        return hashMap;
    }

    /* renamed from: B */
    public boolean m29158B() {
        return this.f10066n;
    }

    /* renamed from: C */
    public boolean m29157C() {
        return this.f10067o;
    }

    /* renamed from: X */
    public final String m29151X() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f10064l, f37389C);
            Iterator<Scope> it = this.f10064l.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m29115p());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f10065m;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f10066n);
            jSONObject.put("forceCodeForRefreshToken", this.f10068p);
            jSONObject.put("serverAuthRequested", this.f10067o);
            if (!TextUtils.isEmpty(this.f10069q)) {
                jSONObject.put("serverClientId", this.f10069q);
            }
            if (!TextUtils.isEmpty(this.f10070r)) {
                jSONObject.put("hostedDomain", this.f10070r);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.equals(r4.m29143j()) != false) goto L_0x004a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: ClassCastException -> 0x0090
            java.util.ArrayList<r9.a> r1 = r3.f10071s     // Catch: ClassCastException -> 0x0090
            int r1 = r1.size()     // Catch: ClassCastException -> 0x0090
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList<r9.a> r1 = r4.f10071s     // Catch: ClassCastException -> 0x0090
            int r1 = r1.size()     // Catch: ClassCastException -> 0x0090
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f10064l     // Catch: ClassCastException -> 0x0090
            int r1 = r1.size()     // Catch: ClassCastException -> 0x0090
            java.util.ArrayList r2 = r4.m29140t()     // Catch: ClassCastException -> 0x0090
            int r2 = r2.size()     // Catch: ClassCastException -> 0x0090
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f10064l     // Catch: ClassCastException -> 0x0090
            java.util.ArrayList r2 = r4.m29140t()     // Catch: ClassCastException -> 0x0090
            boolean r1 = r1.containsAll(r2)     // Catch: ClassCastException -> 0x0090
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f10065m     // Catch: ClassCastException -> 0x0090
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.m29143j()     // Catch: ClassCastException -> 0x0090
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.m29143j()     // Catch: ClassCastException -> 0x0090
            boolean r1 = r1.equals(r2)     // Catch: ClassCastException -> 0x0090
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f10069q     // Catch: ClassCastException -> 0x0090
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: ClassCastException -> 0x0090
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.m29139u()     // Catch: ClassCastException -> 0x0090
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: ClassCastException -> 0x0090
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f10069q     // Catch: ClassCastException -> 0x0090
            java.lang.String r2 = r4.m29139u()     // Catch: ClassCastException -> 0x0090
            boolean r1 = r1.equals(r2)     // Catch: ClassCastException -> 0x0090
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f10068p     // Catch: ClassCastException -> 0x0090
            boolean r2 = r4.m29138z()     // Catch: ClassCastException -> 0x0090
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f10066n     // Catch: ClassCastException -> 0x0090
            boolean r2 = r4.m29158B()     // Catch: ClassCastException -> 0x0090
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f10067o     // Catch: ClassCastException -> 0x0090
            boolean r2 = r4.m29157C()     // Catch: ClassCastException -> 0x0090
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f10072t     // Catch: ClassCastException -> 0x0090
            java.lang.String r4 = r4.m29141r()     // Catch: ClassCastException -> 0x0090
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: ClassCastException -> 0x0090
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f10064l;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).m29115p());
        }
        Collections.sort(arrayList);
        C12468b bVar = new C12468b();
        bVar.m6653a(arrayList);
        bVar.m6653a(this.f10065m);
        bVar.m6653a(this.f10069q);
        bVar.m6651c(this.f10068p);
        bVar.m6651c(this.f10066n);
        bVar.m6651c(this.f10067o);
        bVar.m6653a(this.f10072t);
        return bVar.m6652b();
    }

    /* renamed from: j */
    public Account m29143j() {
        return this.f10065m;
    }

    /* renamed from: p */
    public ArrayList<C12467a> m29142p() {
        return this.f10071s;
    }

    /* renamed from: r */
    public String m29141r() {
        return this.f10072t;
    }

    /* renamed from: t */
    public ArrayList<Scope> m29140t() {
        return new ArrayList<>(this.f10064l);
    }

    /* renamed from: u */
    public String m29139u() {
        return this.f10069q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10063k);
        C14323c.m838t(parcel, 2, m29140t(), false);
        C14323c.m844n(parcel, 3, m29143j(), i, false);
        C14323c.m855c(parcel, 4, m29158B());
        C14323c.m855c(parcel, 5, m29157C());
        C14323c.m855c(parcel, 6, m29138z());
        C14323c.m842p(parcel, 7, m29139u(), false);
        C14323c.m842p(parcel, 8, this.f10070r, false);
        C14323c.m838t(parcel, 9, m29142p(), false);
        C14323c.m842p(parcel, 10, m29141r(), false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public boolean m29138z() {
        return this.f10068p;
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* loaded from: classes5.dex */
    public static final class C5360a {

        /* renamed from: a */
        private Set<Scope> f10074a;

        /* renamed from: b */
        private boolean f10075b;

        /* renamed from: c */
        private boolean f10076c;

        /* renamed from: d */
        private boolean f10077d;

        /* renamed from: e */
        private String f10078e;

        /* renamed from: f */
        private Account f10079f;

        /* renamed from: g */
        private String f10080g;

        /* renamed from: h */
        private Map<Integer, C12467a> f10081h;

        /* renamed from: i */
        private String f10082i;

        public C5360a() {
            this.f10074a = new HashSet();
            this.f10081h = new HashMap();
        }

        /* renamed from: a */
        public GoogleSignInOptions m29137a() {
            if (this.f10074a.contains(GoogleSignInOptions.f37388B)) {
                Set<Scope> set = this.f10074a;
                Scope scope = GoogleSignInOptions.f37387A;
                if (set.contains(scope)) {
                    this.f10074a.remove(scope);
                }
            }
            if (this.f10077d && (this.f10079f == null || !this.f10074a.isEmpty())) {
                m29136b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f10074a), this.f10079f, this.f10077d, this.f10075b, this.f10076c, this.f10078e, this.f10080g, this.f10081h, this.f10082i);
        }

        /* renamed from: b */
        public C5360a m29136b() {
            this.f10074a.add(GoogleSignInOptions.f10062z);
            return this;
        }

        /* renamed from: c */
        public C5360a m29135c() {
            this.f10074a.add(GoogleSignInOptions.f10060x);
            return this;
        }

        /* renamed from: d */
        public C5360a m29134d(Scope scope, Scope... scopeArr) {
            this.f10074a.add(scope);
            this.f10074a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: e */
        public C5360a m29133e(String str) {
            this.f10082i = str;
            return this;
        }

        public C5360a(GoogleSignInOptions googleSignInOptions) {
            this.f10074a = new HashSet();
            this.f10081h = new HashMap();
            C14004p.m2051j(googleSignInOptions);
            this.f10074a = new HashSet(googleSignInOptions.f10064l);
            this.f10075b = googleSignInOptions.f10067o;
            this.f10076c = googleSignInOptions.f10068p;
            this.f10077d = googleSignInOptions.f10066n;
            this.f10078e = googleSignInOptions.f10069q;
            this.f10079f = googleSignInOptions.f10065m;
            this.f10080g = googleSignInOptions.f10070r;
            this.f10081h = GoogleSignInOptions.m29144e0(googleSignInOptions.f10071s);
            this.f10082i = googleSignInOptions.f10072t;
        }
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, C12467a> map, String str3) {
        this.f10063k = i;
        this.f10064l = arrayList;
        this.f10065m = account;
        this.f10066n = z;
        this.f10067o = z2;
        this.f10068p = z3;
        this.f10069q = str;
        this.f10070r = str2;
        this.f10071s = new ArrayList<>(map.values());
        this.f10073u = map;
        this.f10072t = str3;
    }
}
