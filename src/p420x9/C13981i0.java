package p420x9;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: x9.i0 */
/* loaded from: classes5.dex */
public final class C13981i0 implements Parcelable.Creator<C13993m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13993m createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        int i5 = -1;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    i2 = C14321b.m866r(parcel, p);
                    break;
                case 3:
                    i3 = C14321b.m866r(parcel, p);
                    break;
                case 4:
                    j = C14321b.m864t(parcel, p);
                    break;
                case 5:
                    j2 = C14321b.m864t(parcel, p);
                    break;
                case 6:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 7:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 8:
                    i4 = C14321b.m866r(parcel, p);
                    break;
                case 9:
                    i5 = C14321b.m866r(parcel, p);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C13993m(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13993m[] newArray(int i) {
        return new C13993m[i];
    }
}
