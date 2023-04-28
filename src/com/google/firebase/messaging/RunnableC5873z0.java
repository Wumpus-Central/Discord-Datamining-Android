package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.z0 */
/* loaded from: classes3.dex */
public class RunnableC5873z0 implements Runnable {

    /* renamed from: p */
    private static final Object f11668p = new Object();

    /* renamed from: q */
    private static Boolean f11669q;

    /* renamed from: r */
    private static Boolean f11670r;

    /* renamed from: k */
    private final Context f11671k;

    /* renamed from: l */
    private final C5825e0 f11672l;

    /* renamed from: m */
    private final PowerManager.WakeLock f11673m;

    /* renamed from: n */
    private final C5871y0 f11674n;

    /* renamed from: o */
    private final long f11675o;

    /* renamed from: com.google.firebase.messaging.z0$a */
    /* loaded from: classes3.dex */
    class C5874a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC5873z0 f11676a;

        public C5874a(RunnableC5873z0 z0Var) {
            this.f11676a = z0Var;
        }

        /* renamed from: a */
        public void m27010a() {
            if (RunnableC5873z0.m27011j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC5873z0.this.f11671k.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC5873z0 z0Var = this.f11676a;
            if (z0Var != null) {
                if (z0Var.m27012i()) {
                    if (RunnableC5873z0.m27011j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f11676a.f11674n.m27038l(this.f11676a, 0L);
                    context.unregisterReceiver(this);
                    this.f11676a = null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5873z0(C5871y0 y0Var, Context context, C5825e0 e0Var, long j) {
        this.f11674n = y0Var;
        this.f11671k = context;
        this.f11675o = j;
        this.f11672l = e0Var;
        this.f11673m = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m27016e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m27015f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f11668p) {
            Boolean bool = f11670r;
            if (bool == null) {
                z = m27014g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f11670r = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    private static boolean m27014g(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m27016e(str));
        }
        return z;
    }

    /* renamed from: h */
    private static boolean m27013h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f11668p) {
            Boolean bool = f11669q;
            if (bool == null) {
                z = m27014g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f11669q = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m27012i() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f11671k.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m27011j() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m27013h(this.f11671k)) {
            this.f11673m.acquire(C5816c.f11558a);
        }
        try {
            try {
                try {
                    this.f11674n.m27037m(true);
                } catch (Throwable th2) {
                    if (m27013h(this.f11671k)) {
                        try {
                            this.f11673m.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                this.f11674n.m27037m(false);
                if (m27013h(this.f11671k)) {
                    wakeLock = this.f11673m;
                } else {
                    return;
                }
            }
            if (!this.f11672l.m27168g()) {
                this.f11674n.m27037m(false);
                if (m27013h(this.f11671k)) {
                    try {
                        this.f11673m.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!m27015f(this.f11671k) || m27012i()) {
                if (this.f11674n.m27034p()) {
                    this.f11674n.m27037m(false);
                } else {
                    this.f11674n.m27033q(this.f11675o);
                }
                if (m27013h(this.f11671k)) {
                    wakeLock = this.f11673m;
                    wakeLock.release();
                }
            } else {
                new C5874a(this).m27010a();
                if (m27013h(this.f11671k)) {
                    try {
                        this.f11673m.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
