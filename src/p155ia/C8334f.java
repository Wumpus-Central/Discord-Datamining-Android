package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.C14323c;
import qa.AbstractC12061d0;
import qa.C12066g;
import qa.C12070i;

/* renamed from: ia.f */
/* loaded from: classes5.dex */
public class C8334f extends AbstractC8342i {
    public static final Parcelable.Creator<C8334f> CREATOR = new C8356n0();

    /* renamed from: k */
    private final byte[] f18158k;

    /* renamed from: l */
    private final byte[] f18159l;

    /* renamed from: m */
    private final byte[] f18160m;

    /* renamed from: n */
    private final byte[] f18161n;

    /* renamed from: o */
    private final byte[] f18162o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8334f(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f18158k = (byte[]) C14004p.m2051j(bArr);
        this.f18159l = (byte[]) C14004p.m2051j(bArr2);
        this.f18160m = (byte[]) C14004p.m2051j(bArr3);
        this.f18161n = (byte[]) C14004p.m2051j(bArr4);
        this.f18162o = bArr5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8334f)) {
            return false;
        }
        C8334f fVar = (C8334f) obj;
        if (!Arrays.equals(this.f18158k, fVar.f18158k) || !Arrays.equals(this.f18159l, fVar.f18159l) || !Arrays.equals(this.f18160m, fVar.f18160m) || !Arrays.equals(this.f18161n, fVar.f18161n) || !Arrays.equals(this.f18162o, fVar.f18162o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(Integer.valueOf(Arrays.hashCode(this.f18158k)), Integer.valueOf(Arrays.hashCode(this.f18159l)), Integer.valueOf(Arrays.hashCode(this.f18160m)), Integer.valueOf(Arrays.hashCode(this.f18161n)), Integer.valueOf(Arrays.hashCode(this.f18162o)));
    }

    @Override // p155ia.AbstractC8342i
    /* renamed from: p */
    public byte[] mo19942p() {
        return this.f18159l;
    }

    /* renamed from: r */
    public byte[] m19953r() {
        return this.f18160m;
    }

    /* renamed from: t */
    public byte[] m19952t() {
        return this.f18158k;
    }

    public String toString() {
        C12070i b = C12066g.m7888a(this).m7881b("keyHandle", AbstractC12061d0.m7889d().m7891b(this.f18158k)).m7881b("clientDataJSON", AbstractC12061d0.m7889d().m7891b(this.f18159l)).m7881b("authenticatorData", AbstractC12061d0.m7889d().m7891b(this.f18160m)).m7881b("signature", AbstractC12061d0.m7889d().m7891b(this.f18161n));
        if (this.f18162o != null) {
            b.m7881b("userHandle", AbstractC12061d0.m7889d().m7891b(this.f18162o));
        }
        return b.toString();
    }

    /* renamed from: u */
    public byte[] m19951u() {
        return this.f18161n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m852f(parcel, 2, m19952t(), false);
        C14323c.m852f(parcel, 3, mo19942p(), false);
        C14323c.m852f(parcel, 4, m19953r(), false);
        C14323c.m852f(parcel, 5, m19951u(), false);
        C14323c.m852f(parcel, 6, m19950z(), false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public byte[] m19950z() {
        return this.f18162o;
    }
}
