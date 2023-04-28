package p319ra;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ra.s0 */
/* loaded from: classes3.dex */
public final class C12537s0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12537s0> CREATOR = new C12539t0();

    /* renamed from: k */
    private final int f28209k;

    /* renamed from: l */
    private final ParcelUuid f28210l;

    /* renamed from: m */
    private final ParcelUuid f28211m;

    /* renamed from: n */
    private final ParcelUuid f28212n;

    /* renamed from: o */
    private final byte[] f28213o;

    /* renamed from: p */
    private final byte[] f28214p;

    /* renamed from: q */
    private final int f28215q;

    /* renamed from: r */
    private final byte[] f28216r;

    /* renamed from: s */
    private final byte[] f28217s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12537s0(int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.f28209k = i;
        this.f28210l = parcelUuid;
        this.f28211m = parcelUuid2;
        this.f28212n = parcelUuid3;
        this.f28213o = bArr;
        this.f28214p = bArr2;
        this.f28215q = i2;
        this.f28216r = bArr3;
        this.f28217s = bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12537s0.class == obj.getClass()) {
            C12537s0 s0Var = (C12537s0) obj;
            if (this.f28215q == s0Var.f28215q && Arrays.equals(this.f28216r, s0Var.f28216r) && Arrays.equals(this.f28217s, s0Var.f28217s) && C13996n.m2071b(this.f28212n, s0Var.f28212n) && Arrays.equals(this.f28213o, s0Var.f28213o) && Arrays.equals(this.f28214p, s0Var.f28214p) && C13996n.m2071b(this.f28210l, s0Var.f28210l) && C13996n.m2071b(this.f28211m, s0Var.f28211m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f28215q), Integer.valueOf(Arrays.hashCode(this.f28216r)), Integer.valueOf(Arrays.hashCode(this.f28217s)), this.f28212n, Integer.valueOf(Arrays.hashCode(this.f28213o)), Integer.valueOf(Arrays.hashCode(this.f28214p)), this.f28210l, this.f28211m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f28209k);
        C14323c.m844n(parcel, 4, this.f28210l, i, false);
        C14323c.m844n(parcel, 5, this.f28211m, i, false);
        C14323c.m844n(parcel, 6, this.f28212n, i, false);
        C14323c.m852f(parcel, 7, this.f28213o, false);
        C14323c.m852f(parcel, 8, this.f28214p, false);
        C14323c.m848j(parcel, 9, this.f28215q);
        C14323c.m852f(parcel, 10, this.f28216r, false);
        C14323c.m852f(parcel, 11, this.f28217s, false);
        C14323c.m856b(parcel, a);
    }
}
