package p365u9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import na.HandlerC10772f;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* renamed from: u9.m */
/* loaded from: classes5.dex */
public final class HandlerC13227m extends HandlerC10772f {

    /* renamed from: a */
    private final Context f29703a;

    /* renamed from: b */
    final /* synthetic */ C13220f f29704b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HandlerC13227m(p365u9.C13220f r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f29704b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f29703a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365u9.HandlerC13227m.<init>(u9.f, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int e = this.f29704b.mo4271e(this.f29703a);
        if (this.f29704b.mo4268h(e)) {
            this.f29704b.m4284m(this.f29703a, e);
        }
    }
}
