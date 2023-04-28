package p318r9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import la.C10376c;
import p365u9.C13223i;
import p384v9.AbstractC13470f;
import p420x9.AbstractC13974g;
import p420x9.C13964d;

/* renamed from: r9.i */
/* loaded from: classes5.dex */
public final class C12475i extends AbstractC13974g {

    /* renamed from: S */
    private final GoogleSignInOptions f39300S;

    public C12475i(Context context, Looper looper, C13964d dVar, GoogleSignInOptions googleSignInOptions, AbstractC13470f.AbstractC13471a aVar, AbstractC13470f.AbstractC13472b bVar) {
        super(context, looper, 91, dVar, aVar, bVar);
        GoogleSignInOptions.C5360a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.C5360a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.C5360a();
        }
        aVar2.m29133e(C10376c.m13532a());
        if (!dVar.m2139d().isEmpty()) {
            for (Scope scope : dVar.m2139d()) {
                aVar2.m29134d(scope, new Scope[0]);
            }
        }
        this.f39300S = aVar2.m29137a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: k0 */
    public final GoogleSignInOptions m6638k0() {
        return this.f39300S;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C12487u) {
            return (C12487u) queryLocalInterface;
        }
        return new C12487u(iBinder);
    }
}
