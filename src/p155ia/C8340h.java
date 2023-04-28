package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p155ia.EnumC8352m;
import p420x9.C13996n;
import p441y9.C14323c;
import qa.C12066g;
import qa.C12070i;

/* renamed from: ia.h */
/* loaded from: classes5.dex */
public class C8340h extends AbstractC8342i {
    public static final Parcelable.Creator<C8340h> CREATOR = new C8361p0();

    /* renamed from: k */
    private final EnumC8352m f18171k;

    /* renamed from: l */
    private final String f18172l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8340h(int i, String str) {
        try {
            this.f18171k = EnumC8352m.m19933b(i);
            this.f18172l = str;
        } catch (EnumC8352m.C8353a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8340h)) {
            return false;
        }
        C8340h hVar = (C8340h) obj;
        if (!C13996n.m2071b(this.f18171k, hVar.f18171k) || !C13996n.m2071b(this.f18172l, hVar.f18172l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18171k, this.f18172l);
    }

    @Override // p155ia.AbstractC8342i
    /* renamed from: p */
    public byte[] mo19942p() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: r */
    public int m19944r() {
        return this.f18171k.m19934a();
    }

    /* renamed from: t */
    public String m19943t() {
        return this.f18172l;
    }

    public String toString() {
        C12070i a = C12066g.m7888a(this).m7882a("errorCode", this.f18171k.m19934a());
        String str = this.f18172l;
        if (str != null) {
            a.m7881b("errorMessage", str);
        }
        return a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 2, m19944r());
        C14323c.m842p(parcel, 3, m19943t(), false);
        C14323c.m856b(parcel, a);
    }
}
