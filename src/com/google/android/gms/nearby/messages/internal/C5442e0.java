package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Message;
import p319ra.C12543v0;
import p441y9.C14321b;
import za.C14593a;
import za.C14605m;

/* renamed from: com.google.android.gms.nearby.messages.internal.e0 */
/* loaded from: classes3.dex */
public final class C5442e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        Message message = null;
        C14605m mVar = null;
        C14593a aVar = null;
        C12543v0 v0Var = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    i2 = C14321b.m866r(parcel, p);
                    break;
                case 3:
                    message = (Message) C14321b.m880d(parcel, p, Message.CREATOR);
                    break;
                case 4:
                    mVar = (C14605m) C14321b.m880d(parcel, p, C14605m.CREATOR);
                    break;
                case 5:
                    aVar = (C14593a) C14321b.m880d(parcel, p, C14593a.CREATOR);
                    break;
                case 6:
                    v0Var = (C12543v0) C14321b.m880d(parcel, p, C12543v0.CREATOR);
                    break;
                case 7:
                    bArr = C14321b.m882b(parcel, p);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new Update(i, i2, message, mVar, aVar, v0Var, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Update[i];
    }
}
