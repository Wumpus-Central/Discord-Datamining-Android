package bb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p384v9.AbstractC13478k;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: bb.h */
/* loaded from: classes3.dex */
public final class C3437h extends AbstractC14320a implements AbstractC13478k {
    public static final Parcelable.Creator<C3437h> CREATOR = new C3438i();

    /* renamed from: k */
    private final List<String> f5573k;

    /* renamed from: l */
    private final String f5574l;

    public C3437h(List<String> list, String str) {
        this.f5573k = list;
        this.f5574l = str;
    }

    @Override // p384v9.AbstractC13478k
    /* renamed from: b */
    public final Status mo3607b() {
        if (this.f5574l != null) {
            return Status.f10101p;
        }
        return Status.f10105t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m840r(parcel, 1, this.f5573k, false);
        C14323c.m842p(parcel, 2, this.f5574l, false);
        C14323c.m856b(parcel, a);
    }
}
