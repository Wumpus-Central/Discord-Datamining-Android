package p420x9;

import android.os.Bundle;
import android.os.Parcel;
import pa.BinderC11590b;
import pa.C11591c;

/* renamed from: x9.t0 */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC14017t0 extends BinderC11590b implements AbstractC13987k {
    public AbstractBinderC14017t0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // pa.BinderC11590b
    /* renamed from: b */
    protected final boolean mo2024b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo2081q(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C11591c.m9292a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo2083M(parcel.readInt(), (Bundle) C11591c.m9292a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo2082O(parcel.readInt(), parcel.readStrongBinder(), (C13970e1) C11591c.m9292a(parcel, C13970e1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
