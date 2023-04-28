package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: com.google.android.gms.nearby.messages.internal.f0 */
/* loaded from: classes3.dex */
public final class C5444f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 3:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 4:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 5:
                    i2 = C14321b.m866r(parcel, p);
                    break;
                case 6:
                    str3 = C14321b.m879e(parcel, p);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new ClientAppContext(i, str, str2, z, i2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientAppContext[i];
    }
}
