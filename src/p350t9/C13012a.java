package p350t9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: t9.a */
/* loaded from: classes5.dex */
public final class C13012a extends AbstractC14320a {
    public static final Parcelable.Creator<C13012a> CREATOR = new C13018d();

    /* renamed from: k */
    Intent f29288k;

    public C13012a(Intent intent) {
        this.f29288k = intent;
    }

    /* renamed from: p */
    public Intent m4744p() {
        return this.f29288k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m844n(parcel, 1, this.f29288k, i, false);
        C14323c.m856b(parcel, a);
    }
}
