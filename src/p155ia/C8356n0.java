package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ia.n0 */
/* loaded from: classes5.dex */
public final class C8356n0 implements Parcelable.Creator<C8334f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8334f createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
                bArr = C14321b.m882b(parcel, p);
            } else if (k == 3) {
                bArr2 = C14321b.m882b(parcel, p);
            } else if (k == 4) {
                bArr3 = C14321b.m882b(parcel, p);
            } else if (k == 5) {
                bArr4 = C14321b.m882b(parcel, p);
            } else if (k != 6) {
                C14321b.m861w(parcel, p);
            } else {
                bArr5 = C14321b.m882b(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C8334f(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8334f[] newArray(int i) {
        return new C8334f[i];
    }
}
