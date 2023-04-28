package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes5.dex */
public final class C5369a implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k != 2) {
                C14321b.m861w(parcel, p);
            } else {
                str = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new Scope(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i) {
        return new Scope[i];
    }
}
