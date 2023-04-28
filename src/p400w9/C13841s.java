package p400w9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: w9.s */
/* loaded from: classes5.dex */
public final class C13841s extends BroadcastReceiver {

    /* renamed from: a */
    Context f31157a;

    /* renamed from: b */
    private final AbstractC13840r f31158b;

    public C13841s(AbstractC13840r rVar) {
        this.f31158b = rVar;
    }

    /* renamed from: a */
    public final void m2543a(Context context) {
        this.f31157a = context;
    }

    /* renamed from: b */
    public final synchronized void m2542b() {
        Context context = this.f31157a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f31157a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f31158b.mo2544a();
            m2542b();
        }
    }
}
