package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import ca.C3803j;
import com.google.android.gms.tasks.C5474b;
import com.google.firebase.messaging.C5812b;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes3.dex */
class C5821d {

    /* renamed from: a */
    private final ExecutorService f11560a;

    /* renamed from: b */
    private final Context f11561b;

    /* renamed from: c */
    private final C5828f0 f11562c;

    public C5821d(Context context, C5828f0 f0Var, ExecutorService executorService) {
        this.f11560a = executorService;
        this.f11561b = context;
        this.f11562c = f0Var;
    }

    /* renamed from: b */
    private boolean m27206b() {
        if (((KeyguardManager) this.f11561b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C3803j.m33561f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f11561b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m27205c(C5812b.C5813a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f11561b.getSystemService("notification")).notify(aVar.f11552b, aVar.f11553c, aVar.f11551a.m38538g());
    }

    /* renamed from: d */
    private C5814b0 m27204d() {
        C5814b0 i = C5814b0.m27216i(this.f11562c.m27151p("gcm.n.image"));
        if (i != null) {
            i.m27213p(this.f11560a);
        }
        return i;
    }

    /* renamed from: e */
    private void m27203e(NotificationCompat.Builder builder, C5814b0 b0Var) {
        if (b0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) C5474b.m28896b(b0Var.m27215l(), 5L, TimeUnit.SECONDS);
                builder.m38565L(bitmap);
                builder.m38541e0(new NotificationCompat.C2168b().m38487z(bitmap).m38488y(null));
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                b0Var.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                b0Var.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m27207a() {
        if (this.f11562c.m27166a("gcm.n.noui")) {
            return true;
        }
        if (m27206b()) {
            return false;
        }
        C5814b0 d = m27204d();
        C5812b.C5813a d2 = C5812b.m27233d(this.f11561b, this.f11562c);
        m27203e(d2.f11551a, d);
        m27205c(d2);
        return true;
    }
}
