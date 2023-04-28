package p420x9;

import android.os.Parcel;
import p101fa.AbstractC7099a;
import pa.BinderC11590b;
import pa.C11591c;

/* renamed from: x9.r1 */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC14012r1 extends BinderC11590b implements AbstractC14015s1 {
    public AbstractBinderC14012r1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // pa.BinderC11590b
    /* renamed from: b */
    protected final boolean mo2024b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AbstractC7099a a = mo2029a();
            parcel2.writeNoException();
            C11591c.m9291b(parcel2, a);
        } else if (i != 2) {
            return false;
        } else {
            int d0 = mo2028d0();
            parcel2.writeNoException();
            parcel2.writeInt(d0);
        }
        return true;
    }
}
