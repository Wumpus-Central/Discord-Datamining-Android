package bb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: bb.i */
/* loaded from: classes3.dex */
public final class C3438i implements Parcelable.Creator<C3437h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3437h createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                arrayList = C14321b.m877g(parcel, p);
            } else if (k != 2) {
                C14321b.m861w(parcel, p);
            } else {
                str = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C3437h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3437h[] newArray(int i) {
        return new C3437h[i];
    }
}
