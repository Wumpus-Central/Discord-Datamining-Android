package bb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: bb.c */
/* loaded from: classes3.dex */
public final class C3432c implements Parcelable.Creator<C3431b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3431b createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                intent = (Intent) C14321b.m880d(parcel, p, Intent.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C3431b(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3431b[] newArray(int i) {
        return new C3431b[i];
    }
}
