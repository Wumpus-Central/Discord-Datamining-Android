package p318r9;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: r9.p */
/* loaded from: classes5.dex */
public final class C12482p {

    /* renamed from: d */
    private static C12482p f28139d;

    /* renamed from: a */
    final C12469c f28140a;

    /* renamed from: b */
    GoogleSignInAccount f28141b;

    /* renamed from: c */
    GoogleSignInOptions f28142c;

    private C12482p(Context context) {
        C12469c b = C12469c.m6649b(context);
        this.f28140a = b;
        this.f28141b = b.m6648c();
        this.f28142c = b.m6647d();
    }

    /* renamed from: a */
    public static synchronized C12482p m6633a(Context context) {
        C12482p d;
        synchronized (C12482p.class) {
            d = m6630d(context.getApplicationContext());
        }
        return d;
    }

    /* renamed from: d */
    private static synchronized C12482p m6630d(Context context) {
        synchronized (C12482p.class) {
            C12482p pVar = f28139d;
            if (pVar != null) {
                return pVar;
            }
            C12482p pVar2 = new C12482p(context);
            f28139d = pVar2;
            return pVar2;
        }
    }

    /* renamed from: b */
    public final synchronized void m6632b() {
        this.f28140a.m6650a();
        this.f28141b = null;
        this.f28142c = null;
    }

    /* renamed from: c */
    public final synchronized void m6631c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f28140a.m6645f(googleSignInAccount, googleSignInOptions);
        this.f28141b = googleSignInAccount;
        this.f28142c = googleSignInOptions;
    }
}
