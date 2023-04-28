package p196ka;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import p230m9.C10562b;
import p230m9.C10563c;
import p365u9.C13223i;
import p400w9.AbstractC13817d;
import p400w9.AbstractC13825h;
import p420x9.AbstractC13974g;
import p420x9.C13964d;

/* renamed from: ka.b */
/* loaded from: classes3.dex */
public final class C9844b extends AbstractC13974g<C9845c> {

    /* renamed from: S */
    private final Bundle f38747S;

    public C9844b(Context context, Looper looper, C13964d dVar, C10563c cVar, AbstractC13817d dVar2, AbstractC13825h hVar) {
        super(context, looper, 16, dVar, dVar2, hVar);
        Bundle bundle;
        if (cVar == null) {
            bundle = new Bundle();
        } else {
            bundle = cVar.m12808a();
        }
        this.f38747S = bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: Q */
    public final boolean mo2178Q() {
        return true;
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: g */
    public final boolean mo2156g() {
        C13964d h0 = m2113h0();
        if (TextUtils.isEmpty(h0.m2141b()) || h0.m2138e(C10562b.f23408a).isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: n */
    public final int mo143n() {
        return C13223i.f29692a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ IInterface mo142r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C9845c) {
            return (C9845c) queryLocalInterface;
        }
        return new C9845c(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: z */
    public final Bundle mo140z() {
        return this.f38747S;
    }
}
