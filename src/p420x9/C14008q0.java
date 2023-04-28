package p420x9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p365u9.C13215a;
import p420x9.AbstractC13983j;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: x9.q0 */
/* loaded from: classes5.dex */
public final class C14008q0 extends AbstractC14320a {
    public static final Parcelable.Creator<C14008q0> CREATOR = new C14011r0();

    /* renamed from: k */
    final int f31586k;

    /* renamed from: l */
    final IBinder f31587l;

    /* renamed from: m */
    private final C13215a f31588m;

    /* renamed from: n */
    private final boolean f31589n;

    /* renamed from: o */
    private final boolean f31590o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14008q0(int i, IBinder iBinder, C13215a aVar, boolean z, boolean z2) {
        this.f31586k = i;
        this.f31587l = iBinder;
        this.f31588m = aVar;
        this.f31589n = z;
        this.f31590o = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14008q0)) {
            return false;
        }
        C14008q0 q0Var = (C14008q0) obj;
        if (!this.f31588m.equals(q0Var.f31588m) || !C13996n.m2071b(m2039r(), q0Var.m2039r())) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final C13215a m2040p() {
        return this.f31588m;
    }

    /* renamed from: r */
    public final AbstractC13983j m2039r() {
        IBinder iBinder = this.f31587l;
        if (iBinder == null) {
            return null;
        }
        return AbstractC13983j.AbstractBinderC13984a.m2094c(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f31586k);
        C14323c.m849i(parcel, 2, this.f31587l, false);
        C14323c.m844n(parcel, 3, this.f31588m, i, false);
        C14323c.m855c(parcel, 4, this.f31589n);
        C14323c.m855c(parcel, 5, this.f31590o);
        C14323c.m856b(parcel, a);
    }
}
