package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ra.i0 */
/* loaded from: classes3.dex */
public final class C12516i0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12516i0> CREATOR = new C12519j0();

    /* renamed from: k */
    private int f28167k;

    private C12516i0() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12516i0) {
            return C13996n.m2071b(Integer.valueOf(this.f28167k), Integer.valueOf(((C12516i0) obj).f28167k));
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f28167k));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f28167k);
        C14323c.m856b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12516i0(int i) {
        this.f28167k = i;
    }
}
