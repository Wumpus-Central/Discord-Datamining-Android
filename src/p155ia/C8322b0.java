package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.b0 */
/* loaded from: classes5.dex */
public class C8322b0 extends AbstractC14320a {
    public static final Parcelable.Creator<C8322b0> CREATOR = new C8346j0();

    /* renamed from: k */
    private int f18146k;

    /* renamed from: l */
    private short f18147l;

    /* renamed from: m */
    private short f18148m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8322b0(int i, short s, short s2) {
        this.f18146k = i;
        this.f18147l = s;
        this.f18148m = s2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8322b0)) {
            return false;
        }
        C8322b0 b0Var = (C8322b0) obj;
        if (this.f18146k == b0Var.f18146k && this.f18147l == b0Var.f18147l && this.f18148m == b0Var.f18148m) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f18146k), Short.valueOf(this.f18147l), Short.valueOf(this.f18148m));
    }

    /* renamed from: p */
    public short m19962p() {
        return this.f18147l;
    }

    /* renamed from: r */
    public short m19961r() {
        return this.f18148m;
    }

    /* renamed from: t */
    public int m19960t() {
        return this.f18146k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, m19960t());
        C14323c.m843o(parcel, 2, m19962p());
        C14323c.m843o(parcel, 3, m19961r());
        C14323c.m856b(parcel, a);
    }
}
