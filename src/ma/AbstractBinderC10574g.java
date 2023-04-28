package ma;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ma.g */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC10574g extends BinderC10571d implements AbstractC10575h {
    public AbstractBinderC10574g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // ma.BinderC10571d
    /* renamed from: b */
    protected final boolean mo12802b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12801y((Status) C10572e.m12805a(parcel, Status.CREATOR));
        return true;
    }
}
