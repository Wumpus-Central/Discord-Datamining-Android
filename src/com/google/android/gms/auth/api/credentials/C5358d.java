package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.auth.api.credentials.d */
/* loaded from: classes5.dex */
public final class C5358d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                z = C14321b.m872l(parcel, p);
            } else if (k == 2) {
                z2 = C14321b.m872l(parcel, p);
            } else if (k == 3) {
                z3 = C14321b.m872l(parcel, p);
            } else if (k == 4) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k != 1000) {
                C14321b.m861w(parcel, p);
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
