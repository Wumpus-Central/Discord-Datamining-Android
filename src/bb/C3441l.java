package bb;

import android.os.Parcel;
import android.os.Parcelable;
import p365u9.C13215a;
import p420x9.C14008q0;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: bb.l */
/* loaded from: classes3.dex */
public final class C3441l extends AbstractC14320a {
    public static final Parcelable.Creator<C3441l> CREATOR = new C3442m();

    /* renamed from: k */
    final int f5577k;

    /* renamed from: l */
    private final C13215a f5578l;

    /* renamed from: m */
    private final C14008q0 f5579m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3441l(int i, C13215a aVar, C14008q0 q0Var) {
        this.f5577k = i;
        this.f5578l = aVar;
        this.f5579m = q0Var;
    }

    /* renamed from: p */
    public final C13215a m34383p() {
        return this.f5578l;
    }

    /* renamed from: r */
    public final C14008q0 m34382r() {
        return this.f5579m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f5577k);
        C14323c.m844n(parcel, 2, this.f5578l, i, false);
        C14323c.m844n(parcel, 3, this.f5579m, i, false);
        C14323c.m856b(parcel, a);
    }
}
