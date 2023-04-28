package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.z */
/* loaded from: classes5.dex */
public class C8384z extends AbstractC14320a {
    public static final Parcelable.Creator<C8384z> CREATOR = new C8332e0();

    /* renamed from: k */
    private final boolean f18284k;

    public C8384z(boolean z) {
        this.f18284k = z;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C8384z) && this.f18284k == ((C8384z) obj).f18284k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C13996n.m2070c(Boolean.valueOf(this.f18284k));
    }

    /* renamed from: p */
    public boolean m19882p() {
        return this.f18284k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m855c(parcel, 1, m19882p());
        C14323c.m856b(parcel, a);
    }
}
