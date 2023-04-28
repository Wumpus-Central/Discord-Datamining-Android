package bb;

import android.os.Parcel;
import android.os.Parcelable;
import p365u9.C13215a;
import p420x9.C14008q0;
import p441y9.C14321b;

/* renamed from: bb.m */
/* loaded from: classes3.dex */
public final class C3442m implements Parcelable.Creator<C3441l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3441l createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        C13215a aVar = null;
        C14008q0 q0Var = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                aVar = (C13215a) C14321b.m880d(parcel, p, C13215a.CREATOR);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                q0Var = (C14008q0) C14321b.m880d(parcel, p, C14008q0.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C3441l(i, aVar, q0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3441l[] newArray(int i) {
        return new C3441l[i];
    }
}
