package qa;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: qa.u0 */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC12095u0 extends BinderC12054a implements AbstractC12089r0 {
    public AbstractBinderC12095u0() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // qa.BinderC12054a
    /* renamed from: b */
    protected final boolean mo7853b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo7856w((Status) C12083o0.m7862a(parcel, Status.CREATOR), (PendingIntent) C12083o0.m7862a(parcel, PendingIntent.CREATOR));
        return true;
    }
}
