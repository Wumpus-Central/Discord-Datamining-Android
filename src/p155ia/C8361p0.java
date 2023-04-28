package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.p0 */
/* loaded from: classes5.dex */
public final class C8361p0 implements Parcelable.Creator<C8340h> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8340h createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
                i = C14321b.m866r(parcel, p);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                str = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8340h(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8340h[] newArray(int i) {
        return new C8340h[i];
    }
}
