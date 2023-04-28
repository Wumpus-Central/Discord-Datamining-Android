package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: ia.i0 */
/* loaded from: classes5.dex */
public final class C8343i0 implements Parcelable.Creator<C8318a0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8318a0 createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 1) {
                C14321b.m861w(parcel, p);
            } else {
                arrayList = C14321b.m875i(parcel, p, C8322b0.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8318a0(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8318a0[] newArray(int i) {
        return new C8318a0[i];
    }
}
