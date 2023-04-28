package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;
import p155ia.EnumC8371u;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import qa.AbstractC12081n0;
import qa.AbstractC12096v;
import qa.C12085p0;

/* renamed from: ia.q */
/* loaded from: classes5.dex */
public class C8362q extends AbstractC14320a {

    /* renamed from: k */
    private final EnumC8371u f18230k;

    /* renamed from: l */
    private final byte[] f18231l;

    /* renamed from: m */
    private final List<Transport> f18232m;

    /* renamed from: n */
    private static AbstractC12096v<AbstractC12081n0> f18229n = AbstractC12096v.m7850p(C12085p0.f27122a, C12085p0.f27123b);
    public static final Parcelable.Creator<C8362q> CREATOR = new C8319a1();

    public C8362q(String str, byte[] bArr, List<Transport> list) {
        C14004p.m2051j(str);
        try {
            this.f18230k = EnumC8371u.m19897a(str);
            this.f18231l = (byte[]) C14004p.m2051j(bArr);
            this.f18232m = list;
        } catch (EnumC8371u.C8372a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        List<Transport> list;
        if (!(obj instanceof C8362q)) {
            return false;
        }
        C8362q qVar = (C8362q) obj;
        if (!this.f18230k.equals(qVar.f18230k) || !Arrays.equals(this.f18231l, qVar.f18231l)) {
            return false;
        }
        List<Transport> list2 = this.f18232m;
        if (list2 == null && qVar.f18232m == null) {
            return true;
        }
        if (list2 == null || (list = qVar.f18232m) == null || !list2.containsAll(list) || !qVar.f18232m.containsAll(this.f18232m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18230k, Integer.valueOf(Arrays.hashCode(this.f18231l)), this.f18232m);
    }

    /* renamed from: p */
    public byte[] m19912p() {
        return this.f18231l;
    }

    /* renamed from: r */
    public List<Transport> m19911r() {
        return this.f18232m;
    }

    /* renamed from: t */
    public String m19910t() {
        return this.f18230k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 2, m19910t(), false);
        C14323c.m852f(parcel, 3, m19912p(), false);
        C14323c.m838t(parcel, 4, m19911r(), false);
        C14323c.m856b(parcel, a);
    }
}
