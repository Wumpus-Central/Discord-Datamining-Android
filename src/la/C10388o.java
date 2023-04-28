package la;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: la.o */
/* loaded from: classes3.dex */
public final class C10388o extends AbstractC14320a {
    public static final Parcelable.Creator<C10388o> CREATOR = new C10389p();

    /* renamed from: k */
    private final Credential f22777k;

    public C10388o(Credential credential) {
        this.f22777k = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m844n(parcel, 1, this.f22777k, i, false);
        C14323c.m856b(parcel, a);
    }
}
