package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p155ia.C8347k;
import p155ia.EnumC8371u;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.r */
/* loaded from: classes5.dex */
public class C8364r extends AbstractC14320a {
    public static final Parcelable.Creator<C8364r> CREATOR = new C8323b1();

    /* renamed from: k */
    private final EnumC8371u f18233k;

    /* renamed from: l */
    private final C8347k f18234l;

    public C8364r(String str, int i) {
        C14004p.m2051j(str);
        try {
            this.f18233k = EnumC8371u.m19897a(str);
            C14004p.m2051j(Integer.valueOf(i));
            try {
                this.f18234l = C8347k.m19937a(i);
            } catch (C8347k.C8348a e) {
                throw new IllegalArgumentException(e);
            }
        } catch (EnumC8371u.C8372a e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8364r)) {
            return false;
        }
        C8364r rVar = (C8364r) obj;
        if (!this.f18233k.equals(rVar.f18233k) || !this.f18234l.equals(rVar.f18234l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18233k, this.f18234l);
    }

    /* renamed from: p */
    public int m19909p() {
        return this.f18234l.m19936b();
    }

    /* renamed from: r */
    public String m19908r() {
        return this.f18233k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 2, m19908r(), false);
        C14323c.m846l(parcel, 3, Integer.valueOf(m19909p()), false);
        C14323c.m856b(parcel, a);
    }
}
