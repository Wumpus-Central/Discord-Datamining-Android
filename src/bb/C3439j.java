package bb;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C14002o0;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: bb.j */
/* loaded from: classes3.dex */
public final class C3439j extends AbstractC14320a {
    public static final Parcelable.Creator<C3439j> CREATOR = new C3440k();

    /* renamed from: k */
    final int f5575k;

    /* renamed from: l */
    final C14002o0 f5576l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3439j(int i, C14002o0 o0Var) {
        this.f5575k = i;
        this.f5576l = o0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f5575k);
        C14323c.m844n(parcel, 2, this.f5576l, i, false);
        C14323c.m856b(parcel, a);
    }
}
