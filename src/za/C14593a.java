package za;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.BleSignal;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: za.a */
/* loaded from: classes3.dex */
public final class C14593a extends AbstractC14320a implements BleSignal {
    public static final Parcelable.Creator<C14593a> CREATOR = new C14601i();

    /* renamed from: k */
    final int f33068k;

    /* renamed from: l */
    final int f33069l;

    /* renamed from: m */
    final int f33070m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14593a(int i, int i2, int i3) {
        this.f33068k = i;
        this.f33069l = i2;
        i3 = Integer.MIN_VALUE;
        if (i3 <= -169 || i3 >= 87) {
        }
        this.f33070m = i3;
    }

    @Override // com.google.android.gms.nearby.messages.BleSignal
    /* renamed from: a */
    public final int mo139a() {
        return this.f33070m;
    }

    @Override // com.google.android.gms.nearby.messages.BleSignal
    /* renamed from: e */
    public final int mo138e() {
        return this.f33069l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSignal)) {
            return false;
        }
        BleSignal bleSignal = (BleSignal) obj;
        if (this.f33069l == bleSignal.mo138e() && this.f33070m == bleSignal.mo139a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f33069l), Integer.valueOf(this.f33070m));
    }

    public final String toString() {
        int i = this.f33069l;
        int i2 = this.f33070m;
        return "BleSignal{rssi=" + i + ", txPower=" + i2 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f33068k);
        C14323c.m848j(parcel, 2, this.f33069l);
        C14323c.m848j(parcel, 3, this.f33070m);
        C14323c.m856b(parcel, a);
    }
}
