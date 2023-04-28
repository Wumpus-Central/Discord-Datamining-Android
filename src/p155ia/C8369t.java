package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.t */
/* loaded from: classes5.dex */
public class C8369t extends AbstractC14320a {
    public static final Parcelable.Creator<C8369t> CREATOR = new C8330d1();

    /* renamed from: k */
    private final String f18254k;

    /* renamed from: l */
    private final String f18255l;

    /* renamed from: m */
    private final String f18256m;

    public C8369t(String str, String str2, String str3) {
        this.f18254k = (String) C14004p.m2051j(str);
        this.f18255l = (String) C14004p.m2051j(str2);
        this.f18256m = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8369t)) {
            return false;
        }
        C8369t tVar = (C8369t) obj;
        if (!C13996n.m2071b(this.f18254k, tVar.f18254k) || !C13996n.m2071b(this.f18255l, tVar.f18255l) || !C13996n.m2071b(this.f18256m, tVar.f18256m)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f18254k;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18254k, this.f18255l, this.f18256m);
    }

    /* renamed from: p */
    public String m19899p() {
        return this.f18256m;
    }

    /* renamed from: r */
    public String m19898r() {
        return this.f18255l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 2, getId(), false);
        C14323c.m842p(parcel, 3, m19898r(), false);
        C14323c.m842p(parcel, 4, m19899p(), false);
        C14323c.m856b(parcel, a);
    }
}
