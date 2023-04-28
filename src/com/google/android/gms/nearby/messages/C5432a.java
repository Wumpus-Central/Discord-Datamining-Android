package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import p319ra.C12543v0;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.nearby.messages.a */
/* loaded from: classes3.dex */
public final class C5432a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        C12543v0[] v0VarArr = null;
        long j = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                bArr = C14321b.m882b(parcel, p);
            } else if (k == 2) {
                str2 = C14321b.m879e(parcel, p);
            } else if (k == 3) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 4) {
                v0VarArr = (C12543v0[]) C14321b.m876h(parcel, p, C12543v0.CREATOR);
            } else if (k == 5) {
                j = C14321b.m864t(parcel, p);
            } else if (k != 1000) {
                C14321b.m861w(parcel, p);
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new Message(i, bArr, str, str2, v0VarArr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Message[i];
    }
}
