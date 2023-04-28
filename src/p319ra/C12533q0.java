package p319ra;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ra.q0 */
/* loaded from: classes3.dex */
public final class C12533q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        boolean z = false;
        byte[] bArr = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        C12525m0 m0Var = null;
        String str2 = null;
        String str3 = null;
        long j4 = -1;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    j = C14321b.m864t(parcel, p);
                    break;
                case 2:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 3:
                    bArr = C14321b.m882b(parcel, p);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) C14321b.m880d(parcel, p, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 6:
                    j4 = C14321b.m864t(parcel, p);
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) C14321b.m880d(parcel, p, ParcelFileDescriptor.CREATOR);
                    break;
                case 8:
                    uri = (Uri) C14321b.m880d(parcel, p, Uri.CREATOR);
                    break;
                case 9:
                    j2 = C14321b.m864t(parcel, p);
                    break;
                case 10:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 11:
                    m0Var = (C12525m0) C14321b.m880d(parcel, p, C12525m0.CREATOR);
                    break;
                case 12:
                    j3 = C14321b.m864t(parcel, p);
                    break;
                case 13:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 14:
                    str3 = C14321b.m879e(parcel, p);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C12531p0(j, i, bArr, parcelFileDescriptor, str, j4, parcelFileDescriptor2, uri, j2, z, m0Var, j3, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C12531p0[i];
    }
}
