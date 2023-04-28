package ma;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p365u9.C13217c;
import p365u9.C13223i;
import p400w9.AbstractC13817d;
import p400w9.AbstractC13825h;
import p420x9.AbstractC13974g;
import p420x9.C13964d;

/* renamed from: ma.i */
/* loaded from: classes3.dex */
public final class C10576i extends AbstractC13974g<C10573f> {
    public C10576i(Context context, Looper looper, C13964d dVar, AbstractC13817d dVar2, AbstractC13825h hVar) {
        super(context, looper, 126, dVar, dVar2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: Q */
    public final boolean mo2178Q() {
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof C10573f) {
            return (C10573f) queryLocalInterface;
        }
        return new C10573f(iBinder);
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: u */
    public final C13217c[] mo141u() {
        return C10570c.f23420e;
    }
}
