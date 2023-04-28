package p319ra;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ra.t0 */
/* loaded from: classes3.dex */
public final class C12539t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        ParcelUuid parcelUuid = null;
        ParcelUuid parcelUuid2 = null;
        ParcelUuid parcelUuid3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k != 1) {
                switch (k) {
                    case 4:
                        parcelUuid = (ParcelUuid) C14321b.m880d(parcel, p, ParcelUuid.CREATOR);
                        continue;
                    case 5:
                        parcelUuid2 = (ParcelUuid) C14321b.m880d(parcel, p, ParcelUuid.CREATOR);
                        continue;
                    case 6:
                        parcelUuid3 = (ParcelUuid) C14321b.m880d(parcel, p, ParcelUuid.CREATOR);
                        continue;
                    case 7:
                        bArr = C14321b.m882b(parcel, p);
                        continue;
                    case 8:
                        bArr2 = C14321b.m882b(parcel, p);
                        continue;
                    case 9:
                        i2 = C14321b.m866r(parcel, p);
                        continue;
                    case 10:
                        bArr3 = C14321b.m882b(parcel, p);
                        continue;
                    case 11:
                        bArr4 = C14321b.m882b(parcel, p);
                        continue;
                    default:
                        C14321b.m861w(parcel, p);
                        continue;
                }
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C12537s0(i, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i2, bArr3, bArr4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C12537s0[i];
    }
}
