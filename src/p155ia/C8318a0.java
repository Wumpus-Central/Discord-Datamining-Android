package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.a0 */
/* loaded from: classes5.dex */
public class C8318a0 extends AbstractC14320a {
    public static final Parcelable.Creator<C8318a0> CREATOR = new C8343i0();

    /* renamed from: k */
    private final List<C8322b0> f18141k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8318a0(List<C8322b0> list) {
        this.f18141k = list;
    }

    public boolean equals(Object obj) {
        List<C8322b0> list;
        if (!(obj instanceof C8318a0)) {
            return false;
        }
        C8318a0 a0Var = (C8318a0) obj;
        List<C8322b0> list2 = this.f18141k;
        if (list2 == null && a0Var.f18141k == null) {
            return true;
        }
        if (list2 == null || (list = a0Var.f18141k) == null || !list2.containsAll(list) || !a0Var.f18141k.containsAll(this.f18141k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(new HashSet(this.f18141k));
    }

    /* renamed from: p */
    public List<C8322b0> m19964p() {
        return this.f18141k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m838t(parcel, 1, m19964p(), false);
        C14323c.m856b(parcel, a);
    }
}
