package p420x9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: x9.b1 */
/* loaded from: classes5.dex */
public final class ServiceConnectionC13956b1 implements ServiceConnection {

    /* renamed from: k */
    private final int f31458k;

    /* renamed from: l */
    final /* synthetic */ AbstractC13957c f31459l;

    public ServiceConnectionC13956b1(AbstractC13957c cVar, int i) {
        this.f31459l = cVar;
        this.f31458k = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC13990l lVar;
        AbstractC13957c cVar = this.f31459l;
        if (iBinder == null) {
            AbstractC13957c.m2165b0(cVar, 16);
            return;
        }
        obj = cVar.f31473x;
        synchronized (obj) {
            AbstractC13957c cVar2 = this.f31459l;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC13990l)) {
                lVar = new C14019u0(iBinder);
            } else {
                lVar = (AbstractC13990l) queryLocalInterface;
            }
            cVar2.f31474y = lVar;
        }
        this.f31459l.m2163c0(0, null, this.f31458k);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f31459l.f31473x;
        synchronized (obj) {
            this.f31459l.f31474y = null;
        }
        Handler handler = this.f31459l.f31471v;
        handler.sendMessage(handler.obtainMessage(6, this.f31458k, 1));
    }
}
