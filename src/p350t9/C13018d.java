package p350t9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: t9.d */
/* loaded from: classes5.dex */
public final class C13018d implements Parcelable.Creator<C13012a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13012a createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 1) {
                C14321b.m861w(parcel, p);
            } else {
                intent = (Intent) C14321b.m880d(parcel, p, Intent.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C13012a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13012a[] newArray(int i) {
        return new C13012a[i];
    }
}
