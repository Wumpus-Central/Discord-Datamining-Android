package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p245n9.C10766f;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

@Deprecated
/* loaded from: classes5.dex */
public final class IdToken extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C10766f();

    /* renamed from: k */
    private final String f10026k;

    /* renamed from: l */
    private final String f10027l;

    public IdToken(String str, String str2) {
        C14004p.m2059b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C14004p.m2059b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f10026k = str;
        this.f10027l = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (!C13996n.m2071b(this.f10026k, idToken.f10026k) || !C13996n.m2071b(this.f10027l, idToken.f10027l)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public String m29184p() {
        return this.f10026k;
    }

    /* renamed from: r */
    public String m29183r() {
        return this.f10027l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 1, m29184p(), false);
        C14323c.m842p(parcel, 2, m29183r(), false);
        C14323c.m856b(parcel, a);
    }
}
