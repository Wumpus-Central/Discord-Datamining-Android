package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.auth.api.signin.g */
/* loaded from: classes5.dex */
public final class C5367g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 4) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 7) {
                googleSignInAccount = (GoogleSignInAccount) C14321b.m880d(parcel, p, GoogleSignInAccount.CREATOR);
            } else if (k != 8) {
                C14321b.m861w(parcel, p);
            } else {
                str2 = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
