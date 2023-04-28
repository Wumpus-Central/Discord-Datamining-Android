package p319ra;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C2095b;
import java.util.Set;
import p365u9.C13217c;
import p365u9.C13223i;
import p384v9.AbstractC13470f;
import p401wa.C13850b;
import p420x9.AbstractC13974g;
import p420x9.C13964d;
import va.C13484a;
import va.C13485b;

/* renamed from: ra.r */
/* loaded from: classes3.dex */
public final class C12534r extends AbstractC13974g {

    /* renamed from: Y */
    private C12521k0 f39307Y;

    /* renamed from: T */
    private final Set f39302T = new C2095b();

    /* renamed from: U */
    private final Set f39303U = new C2095b();

    /* renamed from: V */
    private final Set f39304V = new C2095b();

    /* renamed from: W */
    private final Set f39305W = new C2095b();

    /* renamed from: X */
    private final Set f39306X = new C2095b();

    /* renamed from: S */
    private final long f39301S = hashCode();

    public C12534r(Context context, Looper looper, C13964d dVar, C13850b bVar, AbstractC13470f.AbstractC13471a aVar, AbstractC13470f.AbstractC13472b bVar2) {
        super(context, looper, 54, dVar, aVar, bVar2);
        C12535r0.m6577b(context.getCacheDir());
    }

    /* renamed from: k0 */
    private final void m6579k0() {
        for (BinderC12526n nVar : this.f39302T) {
            nVar.m6587c();
        }
        for (AbstractC12528o oVar : this.f39303U) {
            oVar.m6583a();
        }
        for (AbstractC12528o oVar2 : this.f39304V) {
            oVar2.m6583a();
        }
        for (AbstractC12528o oVar3 : this.f39305W) {
            oVar3.m6583a();
        }
        for (AbstractC12528o oVar4 : this.f39306X) {
            oVar4.m6583a();
        }
        this.f39302T.clear();
        this.f39303U.clear();
        this.f39304V.clear();
        this.f39305W.clear();
        this.f39306X.clear();
        C12521k0 k0Var = this.f39307Y;
        if (k0Var != null) {
            k0Var.m6592a();
            this.f39307Y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: J */
    public final /* bridge */ /* synthetic */ void mo2185J(IInterface iInterface) {
        super.mo2185J((C12492a0) iInterface);
        this.f39307Y = new C12521k0();
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: L */
    public final void mo2183L(int i) {
        if (i == 1) {
            m6579k0();
            i = 1;
        }
        super.mo2183L(i);
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: Q */
    public final boolean mo2178Q() {
        return true;
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: e */
    public final boolean mo2160e() {
        return C13484a.m3604b(m2146x());
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: l */
    public final void mo2152l() {
        if (m2168a()) {
            try {
                ((C12492a0) m2189C()).m6617e0(new C12509g());
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        m6579k0();
        super.mo2152l();
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (queryLocalInterface instanceof C12492a0) {
            return (C12492a0) queryLocalInterface;
        }
        return new C12492a0(iBinder);
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: u */
    public final C13217c[] mo141u() {
        return new C13217c[]{C13485b.f30099f, C13485b.f30118y, C13485b.f39386B, C13485b.f39385A, C13485b.f39387C, C13485b.f30119z, C13485b.f30100g};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: z */
    public final Bundle mo140z() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.f39301S);
        return bundle;
    }
}
