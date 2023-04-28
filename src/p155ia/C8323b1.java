package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.b1 */
/* loaded from: classes5.dex */
public final class C8323b1 implements Parcelable.Creator<C8364r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8364r createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
                str = C14321b.m879e(parcel, p);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                num = C14321b.m865s(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8364r(str, num.intValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8364r[] newArray(int i) {
        return new C8364r[i];
    }
}
