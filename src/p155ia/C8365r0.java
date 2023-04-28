package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p155ia.C8347k;

/* renamed from: ia.r0 */
/* loaded from: classes5.dex */
final class C8365r0 implements Parcelable.Creator<C8347k> {
    /* renamed from: a */
    private static C8347k m19907a(Parcel parcel) {
        try {
            return C8347k.m19937a(parcel.readInt());
        } catch (C8347k.C8348a e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8347k createFromParcel(Parcel parcel) {
        return m19907a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8347k[] newArray(int i) {
        return new C8347k[i];
    }
}
