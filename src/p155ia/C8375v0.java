package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: ia.v0 */
/* loaded from: classes5.dex */
public final class C8375v0 implements Parcelable.Creator<C8370t0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8370t0 createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 1) {
                C14321b.m861w(parcel, p);
            } else {
                arrayList = C14321b.m875i(parcel, p, C8368s0.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8370t0(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8370t0[] newArray(int i) {
        return new C8370t0[i];
    }
}
