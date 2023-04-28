package za;

import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.ArrayList;
import p319ra.BinderC12494b;
import p319ra.C12497c;

/* renamed from: za.o */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC14607o extends BinderC12494b implements AbstractC14608p {
    public AbstractBinderC14607o() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    @Override // p319ra.BinderC12494b
    /* renamed from: b */
    protected final boolean mo130b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C14598f fVar = (C14598f) C12497c.m6615a(parcel, C14598f.CREATOR);
            C12497c.m6614b(parcel);
        } else if (i == 2) {
            C14598f fVar2 = (C14598f) C12497c.m6615a(parcel, C14598f.CREATOR);
            C12497c.m6614b(parcel);
        } else if (i != 4) {
            return false;
        } else {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Update.CREATOR);
            C12497c.m6614b(parcel);
            mo133D(createTypedArrayList);
        }
        return true;
    }
}
