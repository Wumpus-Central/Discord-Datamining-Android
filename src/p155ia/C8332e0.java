package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.e0 */
/* loaded from: classes5.dex */
public final class C8332e0 implements Parcelable.Creator<C8384z> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8384z createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 1) {
                C14321b.m861w(parcel, p);
            } else {
                z = C14321b.m872l(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8384z(z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8384z[] newArray(int i) {
        return new C8384z[i];
    }
}
