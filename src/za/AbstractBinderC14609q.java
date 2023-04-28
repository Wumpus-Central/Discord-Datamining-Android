package za;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p319ra.BinderC12494b;
import p319ra.C12497c;

/* renamed from: za.q */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC14609q extends BinderC12494b implements AbstractC14610r {
    public AbstractBinderC14609q() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    @Override // p319ra.BinderC12494b
    /* renamed from: b */
    protected final boolean mo130b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C12497c.m6614b(parcel);
        mo132I((Status) C12497c.m6615a(parcel, Status.CREATOR));
        return true;
    }
}
