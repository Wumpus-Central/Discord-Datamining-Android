package za;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: za.n */
/* loaded from: classes3.dex */
public final class C14606n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        double d = 0.0d;
        int i2 = 0;
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
                d = C14321b.m870n(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14605m(i, i2, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C14605m[i];
    }
}
