package za;

import android.os.Parcel;
import p319ra.BinderC12494b;

/* renamed from: za.b */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC14594b extends BinderC12494b implements AbstractC14595c {
    public AbstractBinderC14594b() {
        super("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
    }

    @Override // p319ra.BinderC12494b
    /* renamed from: b */
    protected final boolean mo130b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo137a();
        return true;
    }
}
