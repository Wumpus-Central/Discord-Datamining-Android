package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;
import za.C14598f;

/* renamed from: com.google.android.gms.nearby.messages.internal.c0 */
/* loaded from: classes3.dex */
public final class C5438c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        C14598f fVar = null;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        ClientAppContext clientAppContext = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    fVar = (C14598f) C14321b.m880d(parcel, p, C14598f.CREATOR);
                    break;
                case 3:
                    iBinder = C14321b.m867q(parcel, p);
                    break;
                case 4:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 5:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 6:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 7:
                    clientAppContext = (ClientAppContext) C14321b.m880d(parcel, p, ClientAppContext.CREATOR);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C5436b0(i, fVar, iBinder, str, str2, z, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C5436b0[i];
    }
}
