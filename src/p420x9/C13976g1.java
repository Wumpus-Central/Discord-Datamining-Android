package p420x9;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: x9.g1 */
/* loaded from: classes5.dex */
public final class C13976g1 implements Parcelable.Creator<C13968e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13968e createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        C14010r rVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    rVar = (C14010r) C14321b.m880d(parcel, p, C14010r.CREATOR);
                    break;
                case 2:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 3:
                    z2 = C14321b.m872l(parcel, p);
                    break;
                case 4:
                    iArr = C14321b.m881c(parcel, p);
                    break;
                case 5:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 6:
                    iArr2 = C14321b.m881c(parcel, p);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C13968e(rVar, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13968e[] newArray(int i) {
        return new C13968e[i];
    }
}
