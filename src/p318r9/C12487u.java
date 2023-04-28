package p318r9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import la.C10374a;
import la.C10377d;

/* renamed from: r9.u */
/* loaded from: classes5.dex */
public final class C12487u extends C10374a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12487u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: e */
    public final void m6625e(AbstractC12486t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel b = m13534b();
        C10377d.m13528d(b, tVar);
        C10377d.m13529c(b, googleSignInOptions);
        m13533c(103, b);
    }

    /* renamed from: e0 */
    public final void m6624e0(AbstractC12486t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel b = m13534b();
        C10377d.m13528d(b, tVar);
        C10377d.m13529c(b, googleSignInOptions);
        m13533c(102, b);
    }
}
