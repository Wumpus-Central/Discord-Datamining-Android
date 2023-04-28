package p318r9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: r9.d */
/* loaded from: classes5.dex */
public final class C12470d implements Parcelable.Creator<C12467a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12467a createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        Bundle bundle = null;
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
                bundle = C14321b.m883a(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C12467a(i, i2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C12467a[] newArray(int i) {
        return new C12467a[i];
    }
}
