package la;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: la.t */
/* loaded from: classes3.dex */
public final class C10393t extends AbstractC14320a {
    public static final Parcelable.Creator<C10393t> CREATOR = new C10394u();

    /* renamed from: k */
    private final Credential f22778k;

    public C10393t(Credential credential) {
        this.f22778k = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m844n(parcel, 1, this.f22778k, i, false);
        C14323c.m856b(parcel, a);
    }
}
