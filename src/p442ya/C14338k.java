package p442ya;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p319ra.C12537s0;
import p319ra.C12547x0;
import p441y9.C14321b;
import za.C14596d;

/* renamed from: ya.k */
/* loaded from: classes3.dex */
public final class C14338k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                arrayList = C14321b.m875i(parcel, p, C14596d.CREATOR);
            } else if (k == 2) {
                arrayList2 = C14321b.m875i(parcel, p, C12547x0.CREATOR);
            } else if (k == 3) {
                z = C14321b.m872l(parcel, p);
            } else if (k == 4) {
                arrayList3 = C14321b.m875i(parcel, p, C12537s0.CREATOR);
            } else if (k == 5) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k != 1000) {
                C14321b.m861w(parcel, p);
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14326a(i, arrayList, arrayList2, z, arrayList3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C14326a[i];
    }
}
