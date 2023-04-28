package p318r9;

import android.os.Parcel;
import la.BinderC10375b;

/* renamed from: r9.q */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC12483q extends BinderC10375b implements AbstractC12484r {
    public AbstractBinderC12483q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // la.BinderC10375b
    /* renamed from: b */
    protected final boolean mo6629b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo6621j();
        } else if (i != 2) {
            return false;
        } else {
            mo6622g();
        }
        return true;
    }
}
