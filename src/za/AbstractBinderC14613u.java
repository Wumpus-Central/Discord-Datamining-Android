package za;

import android.os.Parcel;
import p319ra.BinderC12494b;
import p319ra.C12497c;

/* renamed from: za.u */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC14613u extends BinderC12494b implements AbstractC14614v {
    public AbstractBinderC14613u() {
        super("com.google.android.gms.nearby.messages.internal.IStatusCallback");
    }

    @Override // p319ra.BinderC12494b
    /* renamed from: b */
    protected final boolean mo130b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        boolean d = C12497c.m6612d(parcel);
        C12497c.m6614b(parcel);
        mo129i(d);
        return true;
    }
}
