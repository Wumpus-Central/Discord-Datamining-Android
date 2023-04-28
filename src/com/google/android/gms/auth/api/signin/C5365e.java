package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p318r9.C12467a;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.auth.api.signin.e */
/* loaded from: classes5.dex */
public final class C5365e implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    arrayList = C14321b.m875i(parcel, p, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C14321b.m880d(parcel, p, Account.CREATOR);
                    break;
                case 4:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 5:
                    z2 = C14321b.m872l(parcel, p);
                    break;
                case 6:
                    z3 = C14321b.m872l(parcel, p);
                    break;
                case 7:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 8:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 9:
                    arrayList2 = C14321b.m875i(parcel, p, C12467a.CREATOR);
                    break;
                case 10:
                    str3 = C14321b.m879e(parcel, p);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
