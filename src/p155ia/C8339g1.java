package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p155ia.C8380y;

/* renamed from: ia.g1 */
/* loaded from: classes5.dex */
final class C8339g1 implements Parcelable.Creator<C8380y.EnumC8381a> {
    /* renamed from: a */
    private static C8380y.EnumC8381a m19945a(Parcel parcel) {
        try {
            return C8380y.EnumC8381a.m19883a(parcel.readString());
        } catch (C8380y.C8382b e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8380y.EnumC8381a createFromParcel(Parcel parcel) {
        return m19945a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8380y.EnumC8381a[] newArray(int i) {
        return new C8380y.EnumC8381a[i];
    }
}
