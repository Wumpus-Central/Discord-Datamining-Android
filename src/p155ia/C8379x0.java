package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.x0 */
/* loaded from: classes5.dex */
public final class C8379x0 implements Parcelable.Creator<C8355n> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8355n createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 2) {
                C14321b.m861w(parcel, p);
            } else {
                str = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8355n(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8355n[] newArray(int i) {
        return new C8355n[i];
    }
}
