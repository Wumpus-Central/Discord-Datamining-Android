package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import p441y9.C14321b;

/* renamed from: ia.a1 */
/* loaded from: classes5.dex */
public final class C8319a1 implements Parcelable.Creator<C8362q> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8362q createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 3) {
                bArr = C14321b.m882b(parcel, p);
            } else if (k != 4) {
                C14321b.m861w(parcel, p);
            } else {
                arrayList = C14321b.m875i(parcel, p, Transport.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8362q(str, bArr, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8362q[] newArray(int i) {
        return new C8362q[i];
    }
}
