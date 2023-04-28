package p245n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.IdToken;
import p441y9.C14321b;

/* renamed from: n9.f */
/* loaded from: classes5.dex */
public final class C10766f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                str = C14321b.m879e(parcel, p);
            } else if (k != 2) {
                C14321b.m861w(parcel, p);
            } else {
                str2 = C14321b.m879e(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new IdToken(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IdToken[i];
    }
}
