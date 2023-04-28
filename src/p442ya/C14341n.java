package p442ya;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ya.n */
/* loaded from: classes3.dex */
public final class C14341n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k != 1000) {
                switch (k) {
                    case 1:
                        i2 = C14321b.m866r(parcel, p);
                        continue;
                    case 2:
                        i3 = C14321b.m866r(parcel, p);
                        continue;
                    case 3:
                        i4 = C14321b.m866r(parcel, p);
                        continue;
                    case 4:
                        z = C14321b.m872l(parcel, p);
                        continue;
                    case 5:
                        i5 = C14321b.m866r(parcel, p);
                        continue;
                    case 6:
                        i6 = C14321b.m866r(parcel, p);
                        continue;
                    case 7:
                        i7 = C14321b.m866r(parcel, p);
                        continue;
                    default:
                        C14321b.m861w(parcel, p);
                        continue;
                }
            } else {
                i = C14321b.m866r(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14335i(i, i2, i3, i4, z, i5, i6, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C14335i[i];
    }
}
