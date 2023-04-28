package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.C14323c;
import qa.AbstractC12061d0;
import qa.C12066g;

/* renamed from: ia.g */
/* loaded from: classes5.dex */
public class C8337g extends AbstractC8342i {
    public static final Parcelable.Creator<C8337g> CREATOR = new C8358o0();

    /* renamed from: k */
    private final byte[] f18163k;

    /* renamed from: l */
    private final byte[] f18164l;

    /* renamed from: m */
    private final byte[] f18165m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8337g(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f18163k = (byte[]) C14004p.m2051j(bArr);
        this.f18164l = (byte[]) C14004p.m2051j(bArr2);
        this.f18165m = (byte[]) C14004p.m2051j(bArr3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8337g)) {
            return false;
        }
        C8337g gVar = (C8337g) obj;
        if (!Arrays.equals(this.f18163k, gVar.f18163k) || !Arrays.equals(this.f18164l, gVar.f18164l) || !Arrays.equals(this.f18165m, gVar.f18165m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(Integer.valueOf(Arrays.hashCode(this.f18163k)), Integer.valueOf(Arrays.hashCode(this.f18164l)), Integer.valueOf(Arrays.hashCode(this.f18165m)));
    }

    @Override // p155ia.AbstractC8342i
    /* renamed from: p */
    public byte[] mo19942p() {
        return this.f18164l;
    }

    /* renamed from: r */
    public byte[] m19948r() {
        return this.f18165m;
    }

    /* renamed from: t */
    public byte[] m19947t() {
        return this.f18163k;
    }

    public String toString() {
        return C12066g.m7888a(this).m7881b("keyHandle", AbstractC12061d0.m7889d().m7891b(this.f18163k)).m7881b("clientDataJSON", AbstractC12061d0.m7889d().m7891b(this.f18164l)).m7881b("attestationObject", AbstractC12061d0.m7889d().m7891b(this.f18165m)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m852f(parcel, 2, m19947t(), false);
        C14323c.m852f(parcel, 3, mo19942p(), false);
        C14323c.m852f(parcel, 4, m19948r(), false);
        C14323c.m856b(parcel, a);
    }
}
