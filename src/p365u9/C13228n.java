package p365u9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: u9.n */
/* loaded from: classes5.dex */
public final class C13228n implements Parcelable.Creator<C13215a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13215a createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k == 3) {
                pendingIntent = (PendingIntent) C14321b.m880d(parcel, p, PendingIntent.CREATOR);
            } else if (k != 4) {
                C14321b.m861w(parcel, p);
            } else {
                str = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C13215a(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13215a[] newArray(int i) {
        return new C13215a[i];
    }
}
