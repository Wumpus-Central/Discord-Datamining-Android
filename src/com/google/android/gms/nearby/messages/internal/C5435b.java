package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import ca.C3803j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import p319ra.BinderC12493a1;
import p319ra.BinderC12499c1;
import p319ra.BinderC12508f1;
import p319ra.C12511g1;
import p365u9.C13223i;
import p384v9.AbstractC13470f;
import p420x9.AbstractC13974g;
import p420x9.C13964d;
import p442ya.C14330e;
import p442ya.C14332g;
import va.C13484a;
import za.AbstractBinderC14594b;
import za.AbstractBinderC14611s;
import za.C14598f;

/* renamed from: com.google.android.gms.nearby.messages.internal.b */
/* loaded from: classes3.dex */
public final class C5435b extends AbstractC13974g {

    /* renamed from: S */
    private final C12511g1 f37396S = new C12511g1();

    /* renamed from: T */
    private final ClientAppContext f37397T;

    /* renamed from: U */
    private final int f37398U;

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(14)
    public C5435b(Context context, Looper looper, AbstractC13470f.AbstractC13471a aVar, AbstractC13470f.AbstractC13472b bVar, C13964d dVar, C14330e eVar) {
        super(context, looper, 62, dVar, aVar, bVar);
        String f = dVar.m2137f();
        int l0 = m28924l0(context);
        if (eVar != null) {
            this.f37397T = new ClientAppContext(1, f, null, false, l0, null);
            this.f37398U = eVar.f32447l;
        } else {
            this.f37397T = new ClientAppContext(1, f, null, false, l0, null);
            this.f37398U = -1;
        }
        if (l0 == 1 && C3803j.m33566a()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new C5433a(activity, this, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public static int m28924l0(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        if (context instanceof Service) {
            return 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final void m28925k0(C5378d dVar, C5378d dVar2) {
        C5378d.C5379a b = dVar2.m29055b();
        if (b != null) {
            BinderC12499c1 c1Var = new BinderC12499c1(dVar);
            if (!this.f37396S.m6598e(b)) {
                c1Var.mo132I(new Status(0));
                return;
            }
            ((C5454k0) m2189C()).m28912j0(new C5440d0((IBinder) this.f37396S.m6602a(b), c1Var, null));
            this.f37396S.m6599d(b);
        }
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: l */
    public final void mo2152l() {
        try {
            m28923m0(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", e));
            }
        }
        this.f37396S.m6601b();
        super.mo2152l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final void m28923m0(int i) {
        String str;
        if (i != 1) {
            str = "CLIENT_DISCONNECTED";
        } else {
            str = "ACTIVITY_STOPPED";
        }
        if (m2168a()) {
            C5446g0 g0Var = new C5446g0(1, null, i);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", str));
            }
            ((C5454k0) m2189C()).m28917e0(g0Var);
        } else if (Log.isLoggable("NearbyMessagesClient", 3)) {
            Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", str));
        }
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: n */
    public final int mo143n() {
        return C13223i.f29692a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final void m28922n0(C5378d dVar, C14598f fVar, AbstractBinderC14611s sVar, C14332g gVar, int i) {
        ((C5454k0) m2189C()).m28916f0(new C5470x(2, fVar, gVar.m822b(), new BinderC12499c1(dVar), null, null, false, sVar, false, null, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public final void m28921o0(C5378d dVar, C5378d dVar2) {
        C5378d.C5379a b = dVar2.m29055b();
        if (b != null) {
            if (!this.f37396S.m6598e(b)) {
                this.f37396S.m6600c(b, new BinderC12508f1(dVar2));
            }
            C5472z zVar = new C5472z(new BinderC12499c1(dVar), (IBinder) this.f37396S.m6602a(b));
            zVar.f10369n = true;
            ((C5454k0) m2189C()).m28915g0(zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final void m28920p0(C5378d dVar, C5378d dVar2, AbstractBinderC14594b bVar, SubscribeOptions subscribeOptions, byte[] bArr, int i) {
        C5378d.C5379a b = dVar2.m29055b();
        if (b != null) {
            if (!this.f37396S.m6598e(b)) {
                this.f37396S.m6600c(b, new BinderC12493a1(dVar2));
            }
            ((C5454k0) m2189C()).m28914h0(new SubscribeRequest((IBinder) this.f37396S.m6602a(b), subscribeOptions.m28932c(), new BinderC12499c1(dVar), subscribeOptions.m28933b(), null, null, bVar, false, 0, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public final void m28919q0(C5378d dVar, C14598f fVar) {
        ((C5454k0) m2189C()).m28913i0(new C5436b0(1, fVar, new BinderC12499c1(dVar), null, null, false, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo142r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (queryLocalInterface instanceof C5454k0) {
            return (C5454k0) queryLocalInterface;
        }
        return new C5454k0(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public final void m28918r0(C5378d dVar, C5378d dVar2) {
        C5378d.C5379a b = dVar2.m29055b();
        if (b != null) {
            BinderC12499c1 c1Var = new BinderC12499c1(dVar);
            if (!this.f37396S.m6598e(b)) {
                c1Var.mo132I(new Status(0));
                return;
            }
            C5472z zVar = new C5472z(c1Var, (IBinder) this.f37396S.m6602a(b));
            zVar.f10369n = false;
            ((C5454k0) m2189C()).m28915g0(zVar);
            this.f37396S.m6599d(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: z */
    public final Bundle mo140z() {
        Bundle z = super.mo140z();
        z.putInt("NearbyPermissions", this.f37398U);
        z.putParcelable("ClientAppContext", this.f37397T);
        return z;
    }
}
