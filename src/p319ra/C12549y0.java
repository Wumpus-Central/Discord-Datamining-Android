package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ra.y0 */
/* loaded from: classes3.dex */
public final class C12549y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                bArr = C14321b.m882b(parcel, p);
            } else if (k == 3) {
                z = C14321b.m872l(parcel, p);
            } else if (k != 1000) {
                C14321b.m861w(parcel, p);
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C12547x0(i, i2, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C12547x0[i];
    }
}
