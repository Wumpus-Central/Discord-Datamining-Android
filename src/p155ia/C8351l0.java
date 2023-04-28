package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.l0 */
/* loaded from: classes5.dex */
public final class C8351l0 implements Parcelable.Creator<C8331e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8331e createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        C8318a0 a0Var = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 1) {
                C14321b.m861w(parcel, p);
            } else {
                a0Var = (C8318a0) C14321b.m880d(parcel, p, C8318a0.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8331e(a0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8331e[] newArray(int i) {
        return new C8331e[i];
    }
}
