package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.o0 */
/* loaded from: classes5.dex */
public final class C8358o0 implements Parcelable.Creator<C8337g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8337g createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
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
        return new C8337g(bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8337g[] newArray(int i) {
        return new C8337g[i];
    }
}
