package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* loaded from: classes5.dex */
public class SignInAccount extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C5367g();
    @Deprecated

    /* renamed from: k */
    String f10083k;

    /* renamed from: l */
    private GoogleSignInAccount f10084l;
    @Deprecated

    /* renamed from: m */
    String f10085m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f10084l = googleSignInAccount;
        this.f10083k = C14004p.m2054g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f10085m = C14004p.m2054g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: p */
    public final GoogleSignInAccount m29132p() {
        return this.f10084l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 4, this.f10083k, false);
        C14323c.m844n(parcel, 7, this.f10084l, i, false);
        C14323c.m842p(parcel, 8, this.f10085m, false);
        C14323c.m856b(parcel, a);
    }
}
