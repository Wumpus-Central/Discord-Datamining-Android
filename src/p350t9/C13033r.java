package p350t9;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: t9.r */
/* loaded from: classes5.dex */
final class C13033r {

    /* renamed from: a */
    private final Messenger f29328a;

    /* renamed from: b */
    private final C13023h f29329b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13033r(IBinder iBinder) {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f29328a = new Messenger(iBinder);
            this.f29329b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f29329b = new C13023h(iBinder);
            this.f29328a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4716a(Message message) {
        Messenger messenger = this.f29328a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C13023h hVar = this.f29329b;
        if (hVar != null) {
            hVar.m4724b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
