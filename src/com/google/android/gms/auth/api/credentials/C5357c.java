package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
/* loaded from: classes5.dex */
public final class C5357c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 2:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 3:
                    uri = (Uri) C14321b.m880d(parcel, p, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C14321b.m875i(parcel, p, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C14321b.m879e(parcel, p);
                    break;
                case 6:
                    str4 = C14321b.m879e(parcel, p);
                    break;
                case 7:
                case 8:
                default:
                    C14321b.m861w(parcel, p);
                    break;
                case 9:
                    str5 = C14321b.m879e(parcel, p);
                    break;
                case 10:
                    str6 = C14321b.m879e(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}
