package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.d0 */
/* loaded from: classes5.dex */
public final class C8329d0 implements Parcelable.Creator<C8380y> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8380y createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
                str = C14321b.m879e(parcel, p);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                str2 = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8380y(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8380y[] newArray(int i) {
        return new C8380y[i];
    }
}
