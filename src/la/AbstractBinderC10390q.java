package la;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: la.q */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC10390q extends BinderC10375b implements AbstractC10391r {
    public AbstractBinderC10390q() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // la.BinderC10375b
    /* renamed from: b */
    protected final boolean mo6629b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C10377d.m13530b(parcel);
            mo13526A((Status) C10377d.m13531a(parcel, Status.CREATOR), (Credential) C10377d.m13531a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            C10377d.m13530b(parcel);
            mo13525d((Status) C10377d.m13531a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            C10377d.m13530b(parcel);
            mo13524z((Status) C10377d.m13531a(parcel, Status.CREATOR), readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
