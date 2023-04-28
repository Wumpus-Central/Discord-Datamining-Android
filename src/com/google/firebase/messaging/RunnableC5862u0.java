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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p063da.ThreadFactoryC6419b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.u0 */
/* loaded from: classes3.dex */
public class RunnableC5862u0 implements Runnable {

    /* renamed from: k */
    private final long f11630k;

    /* renamed from: l */
    private final PowerManager.WakeLock f11631l;

    /* renamed from: m */
    private final FirebaseMessaging f11632m;

    /* renamed from: n */
    ExecutorService f11633n = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6419b("firebase-iid-executor"));

    /* renamed from: com.google.firebase.messaging.u0$a */
    /* loaded from: classes3.dex */
    static class C5863a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC5862u0 f11634a;

        public C5863a(RunnableC5862u0 u0Var) {
            this.f11634a = u0Var;
        }

        /* renamed from: a */
        public void m27059a() {
            if (RunnableC5862u0.m27062c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f11634a.m27063b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC5862u0 u0Var = this.f11634a;
            if (u0Var != null && u0Var.m27061d()) {
                if (RunnableC5862u0.m27062c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f11634a.f11632m.m27268j(this.f11634a, 0L);
                this.f11634a.m27063b().unregisterReceiver(this);
                this.f11634a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC5862u0(FirebaseMessaging firebaseMessaging, long j) {
        this.f11632m = firebaseMessaging;
        this.f11630k = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m27063b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11631l = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m27062c() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    Context m27063b() {
        return this.f11632m.m27267k();
    }

    /* renamed from: d */
    boolean m27061d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m27063b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    boolean m27060e() {
        try {
            if (this.f11632m.m27269i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            if (C5872z.m27026g(e.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C5853q0.m27088b().m27085e(m27063b())) {
            this.f11631l.acquire();
        }
        try {
            try {
                this.f11632m.m27282A(true);
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                this.f11632m.m27282A(false);
                if (!C5853q0.m27088b().m27085e(m27063b())) {
                    return;
                }
            }
            if (!this.f11632m.m27258t()) {
                this.f11632m.m27282A(false);
                if (C5853q0.m27088b().m27085e(m27063b())) {
                    this.f11631l.release();
                }
            } else if (!C5853q0.m27088b().m27086d(m27063b()) || m27061d()) {
                if (m27060e()) {
                    this.f11632m.m27282A(false);
                } else {
                    this.f11632m.m27279D(this.f11630k);
                }
                if (!C5853q0.m27088b().m27085e(m27063b())) {
                    return;
                }
                this.f11631l.release();
            } else {
                new C5863a(this).m27059a();
                if (C5853q0.m27088b().m27085e(m27063b())) {
                    this.f11631l.release();
                }
            }
        } catch (Throwable th2) {
            if (C5853q0.m27088b().m27085e(m27063b())) {
                this.f11631l.release();
            }
            throw th2;
        }
    }
}
