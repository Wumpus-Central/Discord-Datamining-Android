package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p365u9.C13215a;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: classes5.dex */
public final class C5370b implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        C13215a aVar = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 3) {
                pendingIntent = (PendingIntent) C14321b.m880d(parcel, p, PendingIntent.CREATOR);
            } else if (k == 4) {
                aVar = (C13215a) C14321b.m880d(parcel, p, C13215a.CREATOR);
            } else if (k != 1000) {
                C14321b.m861w(parcel, p);
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new Status(i, i2, str, pendingIntent, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
