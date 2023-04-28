package za;

import android.os.Parcel;
import p319ra.BinderC12494b;

/* renamed from: za.s */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC14611s extends BinderC12494b implements AbstractC14612t {
    public AbstractBinderC14611s() {
        super("com.google.android.gms.nearby.messages.internal.IPublishCallback");
    }

    @Override // p319ra.BinderC12494b
    /* renamed from: b */
    protected final boolean mo130b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo131a();
        return true;
    }
}
