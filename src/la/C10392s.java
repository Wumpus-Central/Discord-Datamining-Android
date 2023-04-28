package la;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.C5355a;

/* renamed from: la.s */
/* loaded from: classes3.dex */
public final class C10392s extends C10374a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10392s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* renamed from: e */
    public final void m13523e(AbstractC10391r rVar, C10388o oVar) {
        Parcel b = m13534b();
        C10377d.m13528d(b, rVar);
        C10377d.m13529c(b, oVar);
        m13533c(3, b);
    }

    /* renamed from: e0 */
    public final void m13522e0(AbstractC10391r rVar, C5355a aVar) {
        Parcel b = m13534b();
        C10377d.m13528d(b, rVar);
        C10377d.m13529c(b, aVar);
        m13533c(1, b);
    }

    /* renamed from: f0 */
    public final void m13521f0(AbstractC10391r rVar, C10393t tVar) {
        Parcel b = m13534b();
        C10377d.m13528d(b, rVar);
        C10377d.m13529c(b, tVar);
        m13533c(2, b);
    }
}
