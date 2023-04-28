package qa;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ga.C7573b;
import p365u9.C13217c;
import p384v9.AbstractC13470f;
import p420x9.AbstractC13974g;
import p420x9.C13964d;

/* renamed from: qa.q0 */
/* loaded from: classes3.dex */
public final class C12087q0 extends AbstractC13974g<AbstractC12093t0> {
    public C12087q0(Context context, Looper looper, C13964d dVar, AbstractC13470f.AbstractC13471a aVar, AbstractC13470f.AbstractC13472b bVar) {
        super(context, looper, 148, dVar, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: n */
    public final int mo143n() {
        return 13000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo142r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof AbstractC12093t0) {
            return (AbstractC12093t0) queryLocalInterface;
        }
        return new C12097v0(iBinder);
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: u */
    public final C13217c[] mo141u() {
        return new C13217c[]{C7573b.f16429a};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: z */
    public final Bundle mo140z() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }
}
