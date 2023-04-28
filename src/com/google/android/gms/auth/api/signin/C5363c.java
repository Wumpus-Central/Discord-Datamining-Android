package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.auth.api.signin.c */
/* loaded from: classes5.dex */
public final class C5363c implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 3:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 4:
                    str3 = C14321b.m879e(parcel, p);
                    break;
                case 5:
                    str4 = C14321b.m879e(parcel, p);
                    break;
                case 6:
                    uri = (Uri) C14321b.m880d(parcel, p, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C14321b.m879e(parcel, p);
                    break;
                case 8:
                    j = C14321b.m864t(parcel, p);
                    break;
                case 9:
                    str6 = C14321b.m879e(parcel, p);
                    break;
                case 10:
                    arrayList = C14321b.m875i(parcel, p, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C14321b.m879e(parcel, p);
                    break;
                case 12:
                    str8 = C14321b.m879e(parcel, p);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
