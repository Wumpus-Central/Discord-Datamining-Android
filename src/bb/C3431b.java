package bb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p384v9.AbstractC13478k;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: bb.b */
/* loaded from: classes3.dex */
public final class C3431b extends AbstractC14320a implements AbstractC13478k {
    public static final Parcelable.Creator<C3431b> CREATOR = new C3432c();

    /* renamed from: k */
    final int f5570k;

    /* renamed from: l */
    private int f5571l;

    /* renamed from: m */
    private Intent f5572m;

    public C3431b() {
        this(2, 0, null);
    }

    @Override // p384v9.AbstractC13478k
    /* renamed from: b */
    public final Status mo3607b() {
        if (this.f5571l == 0) {
            return Status.f10101p;
        }
        return Status.f10105t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f5570k);
        C14323c.m848j(parcel, 2, this.f5571l);
        C14323c.m844n(parcel, 3, this.f5572m, i, false);
        C14323c.m856b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3431b(int i, int i2, Intent intent) {
        this.f5570k = i;
        this.f5571l = i2;
        this.f5572m = intent;
    }
}
