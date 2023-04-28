package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.m0 */
/* loaded from: classes5.dex */
public final class C8354m0 implements Parcelable.Creator<C8328d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8328d createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        C8355n nVar = null;
        C8370t0 t0Var = null;
        C8384z zVar = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
                nVar = (C8355n) C14321b.m880d(parcel, p, C8355n.CREATOR);
            } else if (k == 3) {
                t0Var = (C8370t0) C14321b.m880d(parcel, p, C8370t0.CREATOR);
            } else if (k != 4) {
                C14321b.m861w(parcel, p);
            } else {
                zVar = (C8384z) C14321b.m880d(parcel, p, C8384z.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8328d(nVar, t0Var, zVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8328d[] newArray(int i) {
        return new C8328d[i];
    }
}
