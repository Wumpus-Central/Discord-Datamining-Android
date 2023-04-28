package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.nearby.messages.internal.h0 */
/* loaded from: classes3.dex */
public final class C5448h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        ClientAppContext clientAppContext = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                clientAppContext = (ClientAppContext) C14321b.m880d(parcel, p, ClientAppContext.CREATOR);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                i2 = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C5446g0(i, clientAppContext, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C5446g0[i];
    }
}
