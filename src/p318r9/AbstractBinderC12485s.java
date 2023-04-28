package p318r9;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import la.BinderC10375b;
import la.C10377d;

/* renamed from: r9.s */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC12485s extends BinderC10375b implements AbstractC12486t {
    public AbstractBinderC12485s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // la.BinderC10375b
    /* renamed from: b */
    protected final boolean mo6629b(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                C10377d.m13530b(parcel);
                mo6626p((GoogleSignInAccount) C10377d.m13531a(parcel, GoogleSignInAccount.CREATOR), (Status) C10377d.m13531a(parcel, Status.CREATOR));
                break;
            case 102:
                C10377d.m13530b(parcel);
                mo6627d((Status) C10377d.m13531a(parcel, Status.CREATOR));
                break;
            case 103:
                C10377d.m13530b(parcel);
                mo6628Q((Status) C10377d.m13531a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
