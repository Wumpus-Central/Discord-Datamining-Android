package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.s0 */
/* loaded from: classes5.dex */
public final class C8368s0 extends AbstractC14320a {
    public static final Parcelable.Creator<C8368s0> CREATOR = new C8373u0();

    /* renamed from: k */
    private final long f18250k;

    /* renamed from: l */
    private final byte[] f18251l;

    /* renamed from: m */
    private final byte[] f18252m;

    /* renamed from: n */
    private final byte[] f18253n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8368s0(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f18250k = j;
        this.f18251l = (byte[]) C14004p.m2051j(bArr);
        this.f18252m = (byte[]) C14004p.m2051j(bArr2);
        this.f18253n = (byte[]) C14004p.m2051j(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8368s0)) {
            return false;
        }
        C8368s0 s0Var = (C8368s0) obj;
        if (this.f18250k != s0Var.f18250k || !Arrays.equals(this.f18251l, s0Var.f18251l) || !Arrays.equals(this.f18252m, s0Var.f18252m) || !Arrays.equals(this.f18253n, s0Var.f18253n)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C13996n.m2070c(Long.valueOf(this.f18250k), this.f18251l, this.f18252m, this.f18253n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m845m(parcel, 1, this.f18250k);
        C14323c.m852f(parcel, 2, this.f18251l, false);
        C14323c.m852f(parcel, 3, this.f18252m, false);
        C14323c.m852f(parcel, 4, this.f18253n, false);
        C14323c.m856b(parcel, a);
    }
}
