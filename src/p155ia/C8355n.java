package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.n */
/* loaded from: classes5.dex */
public class C8355n extends AbstractC14320a {
    public static final Parcelable.Creator<C8355n> CREATOR = new C8379x0();

    /* renamed from: k */
    private final String f18199k;

    public C8355n(String str) {
        this.f18199k = (String) C14004p.m2051j(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8355n)) {
            return false;
        }
        return this.f18199k.equals(((C8355n) obj).f18199k);
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18199k);
    }

    /* renamed from: p */
    public String m19932p() {
        return this.f18199k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 2, m19932p(), false);
        C14323c.m856b(parcel, a);
    }
}
