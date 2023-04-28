package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.List;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

@Deprecated
/* loaded from: classes5.dex */
public class Credential extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C5357c();

    /* renamed from: k */
    private final String f10003k;

    /* renamed from: l */
    private final String f10004l;

    /* renamed from: m */
    private final Uri f10005m;

    /* renamed from: n */
    private final List f10006n;

    /* renamed from: o */
    private final String f10007o;

    /* renamed from: p */
    private final String f10008p;

    /* renamed from: q */
    private final String f10009q;

    /* renamed from: r */
    private final String f10010r;

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    /* loaded from: classes5.dex */
    public static class C5353a {

        /* renamed from: a */
        private final String f10011a;

        /* renamed from: b */
        private String f10012b;

        /* renamed from: c */
        private Uri f10013c;

        /* renamed from: d */
        private List f10014d;

        /* renamed from: e */
        private String f10015e;

        /* renamed from: f */
        private String f10016f;

        /* renamed from: g */
        private String f10017g;

        /* renamed from: h */
        private String f10018h;

        public C5353a(String str) {
            this.f10011a = str;
        }

        /* renamed from: a */
        public Credential m29195a() {
            return new Credential(this.f10011a, this.f10012b, this.f10013c, this.f10014d, this.f10015e, this.f10016f, this.f10017g, this.f10018h);
        }

        /* renamed from: b */
        public C5353a m29194b(String str) {
            this.f10012b = str;
            return this;
        }

        /* renamed from: c */
        public C5353a m29193c(String str) {
            this.f10015e = str;
            return this;
        }

        /* renamed from: d */
        public C5353a m29192d(Uri uri) {
            this.f10013c = uri;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List list2;
        Boolean bool;
        String trim = ((String) C14004p.m2050k(str, "credential identifier cannot be null")).trim();
        C14004p.m2054g(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                if (TextUtils.isEmpty(str4)) {
                    bool = Boolean.FALSE;
                } else {
                    Uri parse = Uri.parse(str4);
                    if (!parse.isAbsolute() || !parse.isHierarchical() || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority())) {
                        bool = Boolean.FALSE;
                    } else {
                        boolean z = true;
                        if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                if (!bool.booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f10004l = str2;
                this.f10005m = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f10006n = list2;
                this.f10003k = trim;
                this.f10007o = str3;
                this.f10008p = str4;
                this.f10009q = str5;
                this.f10010r = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    /* renamed from: B */
    public String m29202B() {
        return this.f10007o;
    }

    /* renamed from: C */
    public Uri m29201C() {
        return this.f10005m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (!TextUtils.equals(this.f10003k, credential.f10003k) || !TextUtils.equals(this.f10004l, credential.f10004l) || !C13996n.m2071b(this.f10005m, credential.f10005m) || !TextUtils.equals(this.f10007o, credential.f10007o) || !TextUtils.equals(this.f10008p, credential.f10008p)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f10003k;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f10003k, this.f10004l, this.f10005m, this.f10007o, this.f10008p);
    }

    /* renamed from: p */
    public String m29200p() {
        return this.f10008p;
    }

    /* renamed from: r */
    public String m29199r() {
        return this.f10010r;
    }

    /* renamed from: t */
    public String m29198t() {
        return this.f10009q;
    }

    /* renamed from: u */
    public List<IdToken> m29197u() {
        return this.f10006n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 1, getId(), false);
        C14323c.m842p(parcel, 2, m29196z(), false);
        C14323c.m844n(parcel, 3, m29201C(), i, false);
        C14323c.m838t(parcel, 4, m29197u(), false);
        C14323c.m842p(parcel, 5, m29202B(), false);
        C14323c.m842p(parcel, 6, m29200p(), false);
        C14323c.m842p(parcel, 9, m29198t(), false);
        C14323c.m842p(parcel, 10, m29199r(), false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public String m29196z() {
        return this.f10004l;
    }
}
