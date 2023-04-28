package p420x9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p441y9.C14321b;

/* renamed from: x9.p0 */
/* loaded from: classes5.dex */
public final class C14005p0 implements Parcelable.Creator<C14002o0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C14002o0 createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                i = C14321b.m866r(parcel, p);
            } else if (k == 2) {
                account = (Account) C14321b.m880d(parcel, p, Account.CREATOR);
            } else if (k == 3) {
                i2 = C14321b.m866r(parcel, p);
            } else if (k != 4) {
                C14321b.m861w(parcel, p);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C14321b.m880d(parcel, p, GoogleSignInAccount.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C14002o0(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C14002o0[] newArray(int i) {
        return new C14002o0[i];
    }
}
