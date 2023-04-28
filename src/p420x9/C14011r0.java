package p420x9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p365u9.C13215a;
import p441y9.C14321b;

/* renamed from: x9.r0 */
/* loaded from: classes5.dex */
public final class C14011r0 implements Parcelable.Creator<C14008q0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C14008q0 createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        C13215a aVar = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                iBinder = C14321b.m867q(parcel, p);
            } else if (k == 3) {
                aVar = (C13215a) C14321b.m880d(parcel, p, C13215a.CREATOR);
            } else if (k == 4) {
                z = C14321b.m872l(parcel, p);
            } else if (k != 5) {
                C14321b.m861w(parcel, p);
            } else {
                z2 = C14321b.m872l(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14008q0(i, iBinder, aVar, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C14008q0[] newArray(int i) {
        return new C14008q0[i];
    }
}
