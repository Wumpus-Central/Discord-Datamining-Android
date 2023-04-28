package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.j0 */
/* loaded from: classes5.dex */
public final class C8346j0 implements Parcelable.Creator<C8322b0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8322b0 createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        short s = 0;
        short s2 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                s = C14321b.m863u(parcel, p);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                s2 = C14321b.m863u(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8322b0(i, s, s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8322b0[] newArray(int i) {
        return new C8322b0[i];
    }
}
