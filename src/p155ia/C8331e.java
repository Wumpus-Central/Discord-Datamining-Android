package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.e */
/* loaded from: classes5.dex */
public class C8331e extends AbstractC14320a {
    public static final Parcelable.Creator<C8331e> CREATOR = new C8351l0();

    /* renamed from: k */
    private C8318a0 f18157k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8331e(C8318a0 a0Var) {
        this.f18157k = a0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8331e)) {
            return false;
        }
        return C13996n.m2071b(this.f18157k, ((C8331e) obj).f18157k);
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18157k);
    }

    /* renamed from: p */
    public C8318a0 m19955p() {
        return this.f18157k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m844n(parcel, 1, m19955p(), i, false);
        C14323c.m856b(parcel, a);
    }
}
