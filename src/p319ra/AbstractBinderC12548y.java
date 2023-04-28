package p319ra;

import android.os.Parcel;

/* renamed from: ra.y */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC12548y extends BinderC12494b implements AbstractC12550z {
    @Override // p319ra.BinderC12494b
    /* renamed from: b */
    protected final boolean mo130b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            C12497c.m6614b(parcel);
            mo6570n((C12504e0) C12497c.m6615a(parcel, C12504e0.CREATOR));
            return true;
        } else if (i == 3) {
            C12497c.m6614b(parcel);
            mo6571W((C12510g0) C12497c.m6615a(parcel, C12510g0.CREATOR));
            return true;
        } else if (i == 4) {
            C12516i0 i0Var = (C12516i0) C12497c.m6615a(parcel, C12516i0.CREATOR);
            C12497c.m6614b(parcel);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            C12497c.m6614b(parcel);
            mo6572C((C12498c0) C12497c.m6615a(parcel, C12498c0.CREATOR));
            return true;
        }
    }
}
