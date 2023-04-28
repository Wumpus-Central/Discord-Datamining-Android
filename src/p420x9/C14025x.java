package p420x9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: x9.x */
/* loaded from: classes5.dex */
public final class C14025x implements Parcelable.Creator<C14016t> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C14016t createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k != 2) {
                C14321b.m861w(parcel, p);
            } else {
                arrayList = C14321b.m875i(parcel, p, C13993m.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14016t(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C14016t[] newArray(int i) {
        return new C14016t[i];
    }
}
