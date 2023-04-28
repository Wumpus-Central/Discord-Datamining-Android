package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ra.h0 */
/* loaded from: classes3.dex */
public final class C12513h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 1) {
                C14321b.m861w(parcel, p);
            } else {
                str = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C12510g0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C12510g0[i];
    }
}
