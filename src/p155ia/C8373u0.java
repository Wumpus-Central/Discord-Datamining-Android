package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.u0 */
/* loaded from: classes5.dex */
public final class C8373u0 implements Parcelable.Creator<C8368s0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8368s0 createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        long j = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                j = C14321b.m864t(parcel, p);
            } else if (k == 2) {
                bArr = C14321b.m882b(parcel, p);
            } else if (k == 3) {
                bArr2 = C14321b.m882b(parcel, p);
            } else if (k != 4) {
                C14321b.m861w(parcel, p);
            } else {
                bArr3 = C14321b.m882b(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8368s0(j, bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8368s0[] newArray(int i) {
        return new C8368s0[i];
    }
}
