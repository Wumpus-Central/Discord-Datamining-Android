package p319ra;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ra.n0 */
/* loaded from: classes3.dex */
public class C12527n0 implements Parcelable.Creator {
    /* renamed from: a */
    public C12525m0 mo6584a(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 1) {
                C14321b.m861w(parcel, p);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C14321b.m880d(parcel, p, ParcelFileDescriptor.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C12525m0(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C12525m0[i];
    }
}
