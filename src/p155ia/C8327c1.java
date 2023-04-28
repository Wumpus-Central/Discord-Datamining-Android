package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: ia.c1 */
/* loaded from: classes5.dex */
public final class C8327c1 implements Parcelable.Creator<C8366s> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8366s createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        byte[] bArr = null;
        Double d = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        C8380y yVar = null;
        String str2 = null;
        C8328d dVar = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 2:
                    bArr = C14321b.m882b(parcel, p);
                    break;
                case 3:
                    d = C14321b.m869o(parcel, p);
                    break;
                case 4:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 5:
                    arrayList = C14321b.m875i(parcel, p, C8362q.CREATOR);
                    break;
                case 6:
                    num = C14321b.m865s(parcel, p);
                    break;
                case 7:
                    yVar = (C8380y) C14321b.m880d(parcel, p, C8380y.CREATOR);
                    break;
                case 8:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 9:
                    dVar = (C8328d) C14321b.m880d(parcel, p, C8328d.CREATOR);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C8366s(bArr, d, str, arrayList, num, yVar, str2, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8366s[] newArray(int i) {
        return new C8366s[i];
    }
}
