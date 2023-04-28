package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ra.g0 */
/* loaded from: classes3.dex */
public final class C12510g0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12510g0> CREATOR = new C12513h0();

    /* renamed from: k */
    private String f28163k;

    private C12510g0() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12510g0) {
            return C13996n.m2071b(this.f28163k, ((C12510g0) obj).f28163k);
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f28163k);
    }

    /* renamed from: p */
    public final String m6603p() {
        return this.f28163k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 1, this.f28163k, false);
        C14323c.m856b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12510g0(String str) {
        this.f28163k = str;
    }
}
