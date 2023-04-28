package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import p401wa.C13855g;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ra.c0 */
/* loaded from: classes3.dex */
public final class C12498c0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12498c0> CREATOR = new C12501d0();

    /* renamed from: k */
    private String f28151k;

    /* renamed from: l */
    private int f28152l;

    /* renamed from: m */
    private C13855g f28153m;

    private C12498c0() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12498c0) {
            C12498c0 c0Var = (C12498c0) obj;
            if (C13996n.m2071b(this.f28151k, c0Var.f28151k) && C13996n.m2071b(Integer.valueOf(this.f28152l), Integer.valueOf(c0Var.f28152l)) && C13996n.m2071b(this.f28153m, c0Var.f28153m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f28151k, Integer.valueOf(this.f28152l), this.f28153m);
    }

    /* renamed from: p */
    public final int m6611p() {
        return this.f28152l;
    }

    /* renamed from: r */
    public final C13855g m6610r() {
        return this.f28153m;
    }

    /* renamed from: t */
    public final String m6609t() {
        return this.f28151k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 1, this.f28151k, false);
        C14323c.m848j(parcel, 2, this.f28152l);
        C14323c.m844n(parcel, 3, this.f28153m, i, false);
        C14323c.m856b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12498c0(String str, int i, C13855g gVar) {
        this.f28151k = str;
        this.f28152l = i;
        this.f28153m = gVar;
    }
}
