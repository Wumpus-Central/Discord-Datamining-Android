package bb;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C14002o0;
import p441y9.C14321b;

/* renamed from: bb.k */
/* loaded from: classes3.dex */
public final class C3440k implements Parcelable.Creator<C3439j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3439j createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        C14002o0 o0Var = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k != 2) {
                C14321b.m861w(parcel, p);
            } else {
                o0Var = (C14002o0) C14321b.m880d(parcel, p, C14002o0.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C3439j(i, o0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3439j[] newArray(int i) {
        return new C3439j[i];
    }
}
