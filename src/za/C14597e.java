package za;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: za.e */
/* loaded from: classes3.dex */
public final class C14597e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 2) {
                str2 = C14321b.m879e(parcel, p);
            } else if (k != 1000) {
                C14321b.m861w(parcel, p);
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14596d(i, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C14596d[i];
    }
}
