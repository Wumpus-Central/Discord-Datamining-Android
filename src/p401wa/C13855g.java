package p401wa;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: wa.g */
/* loaded from: classes3.dex */
public final class C13855g extends AbstractC14320a {
    public static final Parcelable.Creator<C13855g> CREATOR = new C13856h();

    /* renamed from: k */
    private int f31178k;

    /* renamed from: l */
    private int f31179l;

    /* renamed from: m */
    private int f31180m;

    /* renamed from: n */
    private boolean f31181n;

    private C13855g() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13855g) {
            C13855g gVar = (C13855g) obj;
            if (C13996n.m2071b(Integer.valueOf(this.f31178k), Integer.valueOf(gVar.f31178k)) && C13996n.m2071b(Integer.valueOf(this.f31179l), Integer.valueOf(gVar.f31179l)) && C13996n.m2071b(Integer.valueOf(this.f31180m), Integer.valueOf(gVar.f31180m)) && C13996n.m2071b(Boolean.valueOf(this.f31181n), Boolean.valueOf(gVar.f31181n))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f31178k), Integer.valueOf(this.f31179l), Integer.valueOf(this.f31180m), Boolean.valueOf(this.f31181n));
    }

    public final String toString() {
        int i = this.f31178k;
        int i2 = this.f31179l;
        int i3 = this.f31180m;
        boolean z = this.f31181n;
        return "UwbRangingData{rawDistance=" + i + ", rawAngleOfArrivalAzimuth=" + i2 + ", rawAngleOfArrivalPolar=" + i3 + ", isValidAngleOfArrivalData=" + z + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f31178k);
        C14323c.m848j(parcel, 2, this.f31179l);
        C14323c.m848j(parcel, 3, this.f31180m);
        C14323c.m855c(parcel, 4, this.f31181n);
        C14323c.m856b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13855g(int i, int i2, int i3, boolean z) {
        this.f31178k = i;
        this.f31179l = i2;
        this.f31180m = i3;
        this.f31181n = z;
    }
}
