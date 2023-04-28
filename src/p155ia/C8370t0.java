package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.t0 */
/* loaded from: classes5.dex */
public final class C8370t0 extends AbstractC14320a {
    public static final Parcelable.Creator<C8370t0> CREATOR = new C8375v0();

    /* renamed from: k */
    private final List<C8368s0> f18257k;

    public C8370t0(List<C8368s0> list) {
        this.f18257k = (List) C14004p.m2051j(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8370t0)) {
            return false;
        }
        C8370t0 t0Var = (C8370t0) obj;
        if (!this.f18257k.containsAll(t0Var.f18257k) || !t0Var.f18257k.containsAll(this.f18257k)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C13996n.m2070c(new HashSet(this.f18257k));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m838t(parcel, 1, this.f18257k, false);
        C14323c.m856b(parcel, a);
    }
}
