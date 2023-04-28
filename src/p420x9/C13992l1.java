package p420x9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x9.l1 */
/* loaded from: classes5.dex */
public final class C13992l1 implements Handler.Callback {

    /* renamed from: k */
    final /* synthetic */ C13995m1 f31553k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C13992l1(C13995m1 m1Var, C13989k1 k1Var) {
        this.f31553k = m1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.f31553k.f31563f;
            synchronized (hashMap) {
                C13982i1 i1Var = (C13982i1) message.obj;
                hashMap2 = this.f31553k.f31563f;
                ServiceConnectionC13986j1 j1Var = (ServiceConnectionC13986j1) hashMap2.get(i1Var);
                if (j1Var != null && j1Var.m2085i()) {
                    if (j1Var.m2084j()) {
                        j1Var.m2087g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f31553k.f31563f;
                    hashMap3.remove(i1Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            hashMap4 = this.f31553k.f31563f;
            synchronized (hashMap4) {
                C13982i1 i1Var2 = (C13982i1) message.obj;
                hashMap5 = this.f31553k.f31563f;
                ServiceConnectionC13986j1 j1Var2 = (ServiceConnectionC13986j1) hashMap5.get(i1Var2);
                if (j1Var2 != null && j1Var2.m2093a() == 3) {
                    String valueOf = String.valueOf(i1Var2);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName b = j1Var2.m2092b();
                    if (b == null) {
                        b = i1Var2.m2097b();
                    }
                    if (b == null) {
                        String d = i1Var2.m2095d();
                        C14004p.m2051j(d);
                        b = new ComponentName(d, "unknown");
                    }
                    j1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
