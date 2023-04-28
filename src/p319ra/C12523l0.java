package p319ra;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: ra.l0 */
/* loaded from: classes3.dex */
final class C12523l0 extends C12527n0 {
    @Override // p319ra.C12527n0
    /* renamed from: a */
    public final C12525m0 mo6584a(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        C12525m0 a = super.mo6584a(parcel);
        parcelFileDescriptor = a.f28191l;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor2 = a.f28191l;
            a.f28190k = C12525m0.m6589t(parcelFileDescriptor2);
        }
        return a;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo6584a(parcel);
    }
}
