package bb;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p012ab.AbstractC1356f;
import p318r9.C12469c;
import p365u9.C13215a;
import p365u9.C13223i;
import p384v9.AbstractC13470f;
import p420x9.AbstractC13957c;
import p420x9.AbstractC13974g;
import p420x9.C13964d;
import p420x9.C14002o0;
import p420x9.C14004p;

/* renamed from: bb.a */
/* loaded from: classes3.dex */
public class C3430a extends AbstractC13974g<C3436g> implements AbstractC1356f {

    /* renamed from: W */
    public static final /* synthetic */ int f35812W = 0;

    /* renamed from: S */
    private final boolean f35813S = true;

    /* renamed from: T */
    private final C13964d f35814T;

    /* renamed from: U */
    private final Bundle f35815U;

    /* renamed from: V */
    private final Integer f35816V;

    public C3430a(Context context, Looper looper, boolean z, C13964d dVar, Bundle bundle, AbstractC13470f.AbstractC13471a aVar, AbstractC13470f.AbstractC13472b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f35814T = dVar;
        this.f35815U = bundle;
        this.f35816V = dVar.m2134i();
    }

    /* renamed from: k0 */
    public static Bundle m34386k0(C13964d dVar) {
        dVar.m2135h();
        Integer i = dVar.m2134i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.m2142a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: g */
    public final boolean mo2156g() {
        return this.f35813S;
    }

    @Override // p012ab.AbstractC1356f
    /* renamed from: h */
    public final void mo34387h() {
        m2158f(new AbstractC13957c.C13960d());
    }

    @Override // p012ab.AbstractC1356f
    /* renamed from: m */
    public final void mo34385m(AbstractC3435f fVar) {
        GoogleSignInAccount googleSignInAccount;
        C14004p.m2050k(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f35814T.m2140c();
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = C12469c.m6649b(m2146x()).m6648c();
            } else {
                googleSignInAccount = null;
            }
            ((C3436g) m2189C()).m34384e0(new C3439j(1, new C14002o0(c, ((Integer) C14004p.m2051j(this.f35816V)).intValue(), googleSignInAccount)), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.mo2583E(new C3441l(1, new C13215a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: n */
    public final int mo143n() {
        return C13223i.f29692a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo142r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C3436g) {
            return (C3436g) queryLocalInterface;
        }
        return new C3436g(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: z */
    public final Bundle mo140z() {
        if (!m2146x().getPackageName().equals(this.f35814T.m2137f())) {
            this.f35815U.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f35814T.m2137f());
        }
        return this.f35815U;
    }
}
