package p318r9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: r9.a */
/* loaded from: classes5.dex */
public class C12467a extends AbstractC14320a {
    public static final Parcelable.Creator<C12467a> CREATOR = new C12470d();

    /* renamed from: k */
    final int f28122k;

    /* renamed from: l */
    private int f28123l;

    /* renamed from: m */
    private Bundle f28124m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12467a(int i, int i2, Bundle bundle) {
        this.f28122k = i;
        this.f28123l = i2;
        this.f28124m = bundle;
    }

    /* renamed from: p */
    public int m6654p() {
        return this.f28123l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f28122k);
        C14323c.m848j(parcel, 2, m6654p());
        C14323c.m853e(parcel, 3, this.f28124m, false);
        C14323c.m856b(parcel, a);
    }
}
