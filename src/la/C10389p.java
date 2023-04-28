package la;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import p441y9.C14321b;

/* renamed from: la.p */
/* loaded from: classes3.dex */
public final class C10389p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 1) {
                C14321b.m861w(parcel, p);
            } else {
                credential = (Credential) C14321b.m880d(parcel, p, Credential.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C10388o(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C10388o[i];
    }
}
