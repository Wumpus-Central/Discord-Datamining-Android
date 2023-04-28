package qa;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p384v9.AbstractC13470f;
import p420x9.AbstractC13974g;
import p420x9.C13964d;

/* renamed from: qa.f */
/* loaded from: classes3.dex */
public final class C12064f extends AbstractC13974g<AbstractC12056b> {
    public C12064f(Context context, Looper looper, C13964d dVar, AbstractC13470f.AbstractC13471a aVar, AbstractC13470f.AbstractC13472b bVar) {
        super(context, looper, 119, dVar, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        if (queryLocalInterface instanceof AbstractC12056b) {
            return (AbstractC12056b) queryLocalInterface;
        }
        return new C12060d(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: z */
    public final Bundle mo140z() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }
}
