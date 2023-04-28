package p318r9;

import android.content.Context;
import android.os.Binder;
import ca.C3806m;
import com.google.android.gms.auth.api.signin.C5361a;
import com.google.android.gms.auth.api.signin.C5362b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: r9.v */
/* loaded from: classes5.dex */
public final class BinderC12488v extends AbstractBinderC12483q {

    /* renamed from: a */
    private final Context f28143a;

    public BinderC12488v(Context context) {
        this.f28143a = context;
    }

    /* renamed from: c */
    private final void m6623c() {
        if (!C3806m.m33553a(this.f28143a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
        }
    }

    @Override // p318r9.AbstractC12484r
    /* renamed from: g */
    public final void mo6622g() {
        m6623c();
        C12482p.m6633a(this.f28143a).m6632b();
    }

    @Override // p318r9.AbstractC12484r
    /* renamed from: j */
    public final void mo6621j() {
        m6623c();
        C12469c b = C12469c.m6649b(this.f28143a);
        GoogleSignInAccount c = b.m6648c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f10058v;
        if (c != null) {
            googleSignInOptions = b.m6647d();
        }
        C5362b a = C5361a.m29131a(this.f28143a, googleSignInOptions);
        if (c != null) {
            a.m29130C();
        } else {
            a.m29129D();
        }
    }
}
