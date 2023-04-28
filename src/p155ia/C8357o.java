package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import p441y9.C14325e;

/* renamed from: ia.o */
/* loaded from: classes5.dex */
public class C8357o extends AbstractC14320a {
    public static final Parcelable.Creator<C8357o> CREATOR = new C8385z0();

    /* renamed from: k */
    private final String f18200k;

    /* renamed from: l */
    private final String f18201l;

    /* renamed from: m */
    private final byte[] f18202m;

    /* renamed from: n */
    private final C8337g f18203n;

    /* renamed from: o */
    private final C8334f f18204o;

    /* renamed from: p */
    private final C8340h f18205p;

    /* renamed from: q */
    private final C8331e f18206q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8357o(String str, String str2, byte[] bArr, C8337g gVar, C8334f fVar, C8340h hVar, C8331e eVar) {
        boolean z;
        if ((gVar != null && fVar == null && hVar == null) || ((gVar == null && fVar != null && hVar == null) || (gVar == null && fVar == null && hVar != null))) {
            z = true;
        } else {
            z = false;
        }
        C14004p.m2060a(z);
        this.f18200k = str;
        this.f18201l = str2;
        this.f18202m = bArr;
        this.f18203n = gVar;
        this.f18204o = fVar;
        this.f18205p = hVar;
        this.f18206q = eVar;
    }

    /* renamed from: p */
    public static C8357o m19931p(byte[] bArr) {
        return (C8357o) C14325e.m833a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8357o)) {
            return false;
        }
        C8357o oVar = (C8357o) obj;
        if (!C13996n.m2071b(this.f18200k, oVar.f18200k) || !C13996n.m2071b(this.f18201l, oVar.f18201l) || !Arrays.equals(this.f18202m, oVar.f18202m) || !C13996n.m2071b(this.f18203n, oVar.f18203n) || !C13996n.m2071b(this.f18204o, oVar.f18204o) || !C13996n.m2071b(this.f18205p, oVar.f18205p) || !C13996n.m2071b(this.f18206q, oVar.f18206q)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f18200k;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18200k, this.f18201l, this.f18202m, this.f18204o, this.f18203n, this.f18205p, this.f18206q);
    }

    /* renamed from: r */
    public C8331e m19930r() {
        return this.f18206q;
    }

    /* renamed from: t */
    public byte[] m19929t() {
        return this.f18202m;
    }

    /* renamed from: u */
    public AbstractC8342i m19928u() {
        C8337g gVar = this.f18203n;
        if (gVar != null) {
            return gVar;
        }
        C8334f fVar = this.f18204o;
        if (fVar != null) {
            return fVar;
        }
        C8340h hVar = this.f18205p;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("No response set.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 1, getId(), false);
        C14323c.m842p(parcel, 2, m19927z(), false);
        C14323c.m852f(parcel, 3, m19929t(), false);
        C14323c.m844n(parcel, 4, this.f18203n, i, false);
        C14323c.m844n(parcel, 5, this.f18204o, i, false);
        C14323c.m844n(parcel, 6, this.f18205p, i, false);
        C14323c.m844n(parcel, 7, m19930r(), i, false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public String m19927z() {
        return this.f18201l;
    }
}
