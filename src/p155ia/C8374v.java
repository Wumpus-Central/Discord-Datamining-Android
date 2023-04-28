package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.v */
/* loaded from: classes5.dex */
public class C8374v extends AbstractC14320a {
    public static final Parcelable.Creator<C8374v> CREATOR = new C8336f1();

    /* renamed from: k */
    private final byte[] f18261k;

    /* renamed from: l */
    private final String f18262l;

    /* renamed from: m */
    private final String f18263m;

    /* renamed from: n */
    private final String f18264n;

    public C8374v(byte[] bArr, String str, String str2, String str3) {
        this.f18261k = (byte[]) C14004p.m2051j(bArr);
        this.f18262l = (String) C14004p.m2051j(str);
        this.f18263m = str2;
        this.f18264n = (String) C14004p.m2051j(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8374v)) {
            return false;
        }
        C8374v vVar = (C8374v) obj;
        if (!Arrays.equals(this.f18261k, vVar.f18261k) || !C13996n.m2071b(this.f18262l, vVar.f18262l) || !C13996n.m2071b(this.f18263m, vVar.f18263m) || !C13996n.m2071b(this.f18264n, vVar.f18264n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18261k, this.f18262l, this.f18263m, this.f18264n);
    }

    /* renamed from: p */
    public String m19896p() {
        return this.f18264n;
    }

    /* renamed from: r */
    public String m19895r() {
        return this.f18263m;
    }

    /* renamed from: t */
    public byte[] m19894t() {
        return this.f18261k;
    }

    /* renamed from: u */
    public String m19893u() {
        return this.f18262l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m852f(parcel, 2, m19894t(), false);
        C14323c.m842p(parcel, 3, m19893u(), false);
        C14323c.m842p(parcel, 4, m19895r(), false);
        C14323c.m842p(parcel, 5, m19896p(), false);
        C14323c.m856b(parcel, a);
    }
}
