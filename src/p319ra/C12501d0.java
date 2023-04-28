package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import p401wa.C13855g;
import p441y9.C14321b;

/* renamed from: ra.d0 */
/* loaded from: classes3.dex */
public final class C12501d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        int i = 0;
        C13855g gVar = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 2) {
                i = C14321b.m866r(parcel, p);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                gVar = (C13855g) C14321b.m880d(parcel, p, C13855g.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C12498c0(str, i, gVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C12498c0[i];
    }
}
