package p319ra;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p365u9.C13223i;
import p400w9.AbstractC13817d;
import p400w9.AbstractC13825h;
import p420x9.AbstractC13974g;
import p420x9.C13964d;

/* renamed from: ra.v */
/* loaded from: classes3.dex */
public final class C12542v extends AbstractC13974g {
    public C12542v(Context context, Looper looper, AbstractC13817d dVar, AbstractC13825h hVar, C13964d dVar2) {
        super(context, looper, 69, dVar2, dVar, hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
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
    public final /* synthetic */ IInterface mo142r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (queryLocalInterface instanceof C12529o0) {
            return (C12529o0) queryLocalInterface;
        }
        return new C12529o0(iBinder);
    }
}
