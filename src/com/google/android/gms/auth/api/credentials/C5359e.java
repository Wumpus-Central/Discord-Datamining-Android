package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
/* loaded from: classes5.dex */
public final class C5359e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k != 1000) {
                switch (k) {
                    case 1:
                        z = C14321b.m872l(parcel, p);
                        continue;
                    case 2:
                        strArr = C14321b.m878f(parcel, p);
                        continue;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C14321b.m880d(parcel, p, CredentialPickerConfig.CREATOR);
                        continue;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C14321b.m880d(parcel, p, CredentialPickerConfig.CREATOR);
                        continue;
                    case 5:
                        z2 = C14321b.m872l(parcel, p);
                        continue;
                    case 6:
                        str = C14321b.m879e(parcel, p);
                        continue;
                    case 7:
                        str2 = C14321b.m879e(parcel, p);
                        continue;
                    case 8:
                        z3 = C14321b.m872l(parcel, p);
                        continue;
                    default:
                        C14321b.m861w(parcel, p);
                        continue;
                }
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C5355a(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C5355a[i];
    }
}
