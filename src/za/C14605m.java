package za;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Distance;
import java.util.Locale;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: za.m */
/* loaded from: classes3.dex */
public final class C14605m extends AbstractC14320a implements Distance {
    public static final Parcelable.Creator<C14605m> CREATOR = new C14606n();

    /* renamed from: k */
    final int f33077k;

    /* renamed from: l */
    public final int f33078l;

    /* renamed from: m */
    public final double f33079m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14605m(int i, int i2, double d) {
        this.f33077k = i;
        this.f33078l = i2;
        this.f33079m = d;
    }

    @Override // com.google.android.gms.nearby.messages.Distance
    /* renamed from: S */
    public final double mo135S() {
        return this.f33079m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14605m)) {
            return false;
        }
        C14605m mVar = (C14605m) obj;
        if (this.f33078l == mVar.f33078l && compareTo(mVar) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f33078l), Double.valueOf(this.f33079m));
    }

    /* renamed from: p */
    public final int compareTo(Distance distance) {
        if (!Double.isNaN(this.f33079m) || !Double.isNaN(distance.mo135S())) {
            return Double.compare(this.f33079m, distance.mo135S());
        }
        return 0;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.f33079m);
        objArr[1] = this.f33078l != 1 ? "UNKNOWN" : "LOW";
        return String.format(locale, "(%.1fm, %s)", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f33077k);
        C14323c.m848j(parcel, 2, this.f33078l);
        C14323c.m851g(parcel, 3, this.f33079m);
        C14323c.m856b(parcel, a);
    }
}
