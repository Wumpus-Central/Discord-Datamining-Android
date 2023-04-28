package p365u9;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: u9.o */
/* loaded from: classes5.dex */
public final class C13229o implements Parcelable.Creator<C13217c> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13217c createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 2) {
                i = C14321b.m866r(parcel, p);
            } else if (k != 3) {
                C14321b.m861w(parcel, p);
            } else {
                j = C14321b.m864t(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C13217c(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13217c[] newArray(int i) {
        return new C13217c[i];
    }
}
