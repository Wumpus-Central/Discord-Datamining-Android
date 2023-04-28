package la;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p230m9.C10561a;
import p384v9.AbstractC13470f;
import p420x9.AbstractC13974g;
import p420x9.C13964d;

/* renamed from: la.n */
/* loaded from: classes3.dex */
public final class C10387n extends AbstractC13974g {

    /* renamed from: S */
    private final C10561a.C0338a f38763S;

    public C10387n(Context context, Looper looper, C13964d dVar, C10561a.C0338a aVar, AbstractC13470f.AbstractC13471a aVar2, AbstractC13470f.AbstractC13472b bVar) {
        super(context, looper, 68, dVar, aVar2, bVar);
        C10561a.C0338a.C0339a aVar3 = new C10561a.C0338a.C0339a(aVar == null ? C10561a.C0338a.f23402n : aVar);
        aVar3.m12809a(C10376c.m13532a());
        this.f38763S = new C10561a.C0338a(aVar3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: n */
    public final int mo143n() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo142r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C10392s) {
            return (C10392s) queryLocalInterface;
        }
        return new C10392s(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: z */
    public final Bundle mo140z() {
        return this.f38763S.m12813a();
    }
}
