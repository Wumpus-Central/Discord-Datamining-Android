package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.d1 */
/* loaded from: classes5.dex */
public final class C8330d1 implements Parcelable.Creator<C8369t> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8369t createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 3) {
                str2 = C14321b.m879e(parcel, p);
            } else if (k != 4) {
                C14321b.m861w(parcel, p);
            } else {
                str3 = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8369t(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8369t[] newArray(int i) {
        return new C8369t[i];
    }
}
