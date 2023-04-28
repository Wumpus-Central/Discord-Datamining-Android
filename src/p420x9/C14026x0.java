package p420x9;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: x9.x0 */
/* loaded from: classes5.dex */
public final class C14026x0 implements Parcelable.Creator<C14010r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C14010r createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                z = C14321b.m872l(parcel, p);
            } else if (k == 3) {
                z2 = C14321b.m872l(parcel, p);
            } else if (k == 4) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k != 5) {
                C14321b.m861w(parcel, p);
            } else {
                i3 = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14010r(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C14010r[] newArray(int i) {
        return new C14010r[i];
    }
}
