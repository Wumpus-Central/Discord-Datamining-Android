package p420x9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: x9.o0 */
/* loaded from: classes5.dex */
public final class C14002o0 extends AbstractC14320a {
    public static final Parcelable.Creator<C14002o0> CREATOR = new C14005p0();

    /* renamed from: k */
    final int f31573k;

    /* renamed from: l */
    private final Account f31574l;

    /* renamed from: m */
    private final int f31575m;

    /* renamed from: n */
    private final GoogleSignInAccount f31576n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14002o0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f31573k = i;
        this.f31574l = account;
        this.f31575m = i2;
        this.f31576n = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f31573k);
        C14323c.m844n(parcel, 2, this.f31574l, i, false);
        C14323c.m848j(parcel, 3, this.f31575m);
        C14323c.m844n(parcel, 4, this.f31576n, i, false);
        C14323c.m856b(parcel, a);
    }

    public C14002o0(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
