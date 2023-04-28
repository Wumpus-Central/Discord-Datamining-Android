package za;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: za.i */
/* loaded from: classes3.dex */
public final class C14601i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                i3 = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14593a(i, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C14593a[i];
    }
}
