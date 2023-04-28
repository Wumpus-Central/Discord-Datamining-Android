package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.z0 */
/* loaded from: classes5.dex */
public final class C8385z0 implements Parcelable.Creator<C8357o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8357o createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        C8337g gVar = null;
        C8334f fVar = null;
        C8340h hVar = null;
        C8331e eVar = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 2:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 3:
                    bArr = C14321b.m882b(parcel, p);
                    break;
                case 4:
                    gVar = (C8337g) C14321b.m880d(parcel, p, C8337g.CREATOR);
                    break;
                case 5:
                    fVar = (C8334f) C14321b.m880d(parcel, p, C8334f.CREATOR);
                    break;
                case 6:
                    hVar = (C8340h) C14321b.m880d(parcel, p, C8340h.CREATOR);
                    break;
                case 7:
                    eVar = (C8331e) C14321b.m880d(parcel, p, C8331e.CREATOR);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C8357o(str, str2, bArr, gVar, fVar, hVar, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8357o[] newArray(int i) {
        return new C8357o[i];
    }
}
