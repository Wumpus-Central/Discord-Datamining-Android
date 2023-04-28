package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: ia.y0 */
/* loaded from: classes5.dex */
public final class C8383y0 implements Parcelable.Creator<C8359p> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8359p createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        C8369t tVar = null;
        C8374v vVar = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        C8344j jVar = null;
        Integer num = null;
        C8380y yVar = null;
        String str = null;
        C8328d dVar = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 2:
                    tVar = (C8369t) C14321b.m880d(parcel, p, C8369t.CREATOR);
                    break;
                case 3:
                    vVar = (C8374v) C14321b.m880d(parcel, p, C8374v.CREATOR);
                    break;
                case 4:
                    bArr = C14321b.m882b(parcel, p);
                    break;
                case 5:
                    arrayList = C14321b.m875i(parcel, p, C8364r.CREATOR);
                    break;
                case 6:
                    d = C14321b.m869o(parcel, p);
                    break;
                case 7:
                    arrayList2 = C14321b.m875i(parcel, p, C8362q.CREATOR);
                    break;
                case 8:
                    jVar = (C8344j) C14321b.m880d(parcel, p, C8344j.CREATOR);
                    break;
                case 9:
                    num = C14321b.m865s(parcel, p);
                    break;
                case 10:
                    yVar = (C8380y) C14321b.m880d(parcel, p, C8380y.CREATOR);
                    break;
                case 11:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 12:
                    dVar = (C8328d) C14321b.m880d(parcel, p, C8328d.CREATOR);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C8359p(tVar, vVar, bArr, arrayList, d, arrayList2, jVar, num, yVar, str, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8359p[] newArray(int i) {
        return new C8359p[i];
    }
}
