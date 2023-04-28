package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ra.h */
/* loaded from: classes3.dex */
public final class C12512h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            C14321b.m873k(p);
            C14321b.m861w(parcel, p);
        }
        C14321b.m874j(parcel, x);
        return new C12509g();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C12509g[i];
    }
}
