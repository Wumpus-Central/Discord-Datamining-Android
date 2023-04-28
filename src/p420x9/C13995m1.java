package p420x9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import ba.C3429b;
import java.util.HashMap;
import java.util.concurrent.Executor;
import pa.HandlerC11593e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x9.m1 */
/* loaded from: classes5.dex */
public final class C13995m1 extends AbstractC13977h {

    /* renamed from: g */
    private final Context f31564g;

    /* renamed from: h */
    private volatile Handler f31565h;

    /* renamed from: i */
    private final C13992l1 f31566i;

    /* renamed from: f */
    private final HashMap<C13982i1, ServiceConnectionC13986j1> f31563f = new HashMap<>();

    /* renamed from: j */
    private final C3429b f31567j = C3429b.m34394b();

    /* renamed from: k */
    private final long f31568k = 5000;

    /* renamed from: l */
    private final long f31569l = 300000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13995m1(Context context, Looper looper) {
        C13992l1 l1Var = new C13992l1(this, null);
        this.f31566i = l1Var;
        this.f31564g = context.getApplicationContext();
        this.f31565h = new HandlerC11593e(looper, l1Var);
    }

    @Override // p420x9.AbstractC13977h
    /* renamed from: d */
    protected final void mo2079d(C13982i1 i1Var, ServiceConnection serviceConnection, String str) {
        C14004p.m2050k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f31563f) {
            ServiceConnectionC13986j1 j1Var = this.f31563f.get(i1Var);
            if (j1Var == null) {
                String obj = i1Var.toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(obj);
                throw new IllegalStateException(sb2.toString());
            } else if (j1Var.m2086h(serviceConnection)) {
                j1Var.m2088f(serviceConnection, str);
                if (j1Var.m2085i()) {
                    this.f31565h.sendMessageDelayed(this.f31565h.obtainMessage(0, i1Var), this.f31568k);
                }
            } else {
                String obj2 = i1Var.toString();
                StringBuilder sb3 = new StringBuilder(obj2.length() + 76);
                sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb3.append(obj2);
                throw new IllegalStateException(sb3.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13977h
    /* renamed from: f */
    public final boolean mo2078f(C13982i1 i1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        C14004p.m2050k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f31563f) {
            ServiceConnectionC13986j1 j1Var = this.f31563f.get(i1Var);
            if (j1Var == null) {
                j1Var = new ServiceConnectionC13986j1(this, i1Var);
                j1Var.m2090d(serviceConnection, serviceConnection, str);
                j1Var.m2089e(str, executor);
                this.f31563f.put(i1Var, j1Var);
            } else {
                this.f31565h.removeMessages(0, i1Var);
                if (!j1Var.m2086h(serviceConnection)) {
                    j1Var.m2090d(serviceConnection, serviceConnection, str);
                    int a = j1Var.m2093a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(j1Var.m2092b(), j1Var.m2091c());
                    } else if (a == 2) {
                        j1Var.m2089e(str, executor);
                    }
                } else {
                    String obj = i1Var.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            j = j1Var.m2084j();
        }
        return j;
    }
}
