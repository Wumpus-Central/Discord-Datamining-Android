package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.nearby.messages.internal.a0 */
/* loaded from: classes3.dex */
public final class C5434a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        ClientAppContext clientAppContext = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    iBinder = C14321b.m867q(parcel, p);
                    break;
                case 3:
                    iBinder2 = C14321b.m867q(parcel, p);
                    break;
                case 4:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 5:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 6:
                    clientAppContext = (ClientAppContext) C14321b.m880d(parcel, p, ClientAppContext.CREATOR);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C5472z(i, iBinder, iBinder2, z, str, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C5472z[i];
    }
}
