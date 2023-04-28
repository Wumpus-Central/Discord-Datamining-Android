package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.d */
/* loaded from: classes5.dex */
public class C8328d extends AbstractC14320a {
    public static final Parcelable.Creator<C8328d> CREATOR = new C8354m0();

    /* renamed from: k */
    private final C8355n f18154k;

    /* renamed from: l */
    private final C8370t0 f18155l;

    /* renamed from: m */
    private final C8384z f18156m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8328d(C8355n nVar, C8370t0 t0Var, C8384z zVar) {
        this.f18154k = nVar;
        this.f18156m = zVar;
        this.f18155l = t0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8328d)) {
            return false;
        }
        C8328d dVar = (C8328d) obj;
        if (!C13996n.m2071b(this.f18154k, dVar.f18154k) || !C13996n.m2071b(this.f18155l, dVar.f18155l) || !C13996n.m2071b(this.f18156m, dVar.f18156m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18154k, this.f18155l, this.f18156m);
    }

    /* renamed from: p */
    public C8355n m19957p() {
        return this.f18154k;
    }

    /* renamed from: r */
    public C8384z m19956r() {
        return this.f18156m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m844n(parcel, 2, m19957p(), i, false);
        C14323c.m844n(parcel, 3, this.f18155l, i, false);
        C14323c.m844n(parcel, 4, m19956r(), i, false);
        C14323c.m856b(parcel, a);
    }
}
