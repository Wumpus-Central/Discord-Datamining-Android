package p318r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import p441y9.C14321b;

/* renamed from: r9.w */
/* loaded from: classes5.dex */
public final class C12489w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 2) {
                str = C14321b.m879e(parcel, p);
            } else if (k != 5) {
                C14321b.m861w(parcel, p);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C14321b.m880d(parcel, p, GoogleSignInOptions.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
