package bb;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import na.BinderC10768b;
import na.C10769c;
import p365u9.C13215a;

/* renamed from: bb.e */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3434e extends BinderC10768b implements AbstractC3435f {
    public AbstractBinderC3434e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // na.BinderC10768b
    /* renamed from: e0 */
    protected final boolean mo12359e0(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                C13215a aVar = (C13215a) C10769c.m12358a(parcel, C13215a.CREATOR);
                C3431b bVar = (C3431b) C10769c.m12358a(parcel, C3431b.CREATOR);
                break;
            case 4:
                Status status = (Status) C10769c.m12358a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) C10769c.m12358a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C10769c.m12358a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C10769c.m12358a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo2583E((C3441l) C10769c.m12358a(parcel, C3441l.CREATOR));
                break;
            case 9:
                C3437h hVar = (C3437h) C10769c.m12358a(parcel, C3437h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
