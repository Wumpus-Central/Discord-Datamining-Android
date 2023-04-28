package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* renamed from: com.reactnativecommunity.netinfo.a */
/* loaded from: classes6.dex */
public class C6128a {

    /* renamed from: b */
    private final Context f12479b;

    /* renamed from: c */
    private final AbstractC6129b f12480c;

    /* renamed from: e */
    private Handler f12482e;

    /* renamed from: a */
    private final C6131d f12478a = new C6131d();

    /* renamed from: d */
    private final Runnable f12481d = new RunnableC6130c();

    /* renamed from: f */
    private boolean f12483f = false;

    /* renamed from: com.reactnativecommunity.netinfo.a$b */
    /* loaded from: classes6.dex */
    public interface AbstractC6129b {
        void onAmazonFireDeviceConnectivityChanged(boolean z);
    }

    /* renamed from: com.reactnativecommunity.netinfo.a$c */
    /* loaded from: classes6.dex */
    private class RunnableC6130c implements Runnable {
        private RunnableC6130c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6128a.this.f12483f) {
                C6128a.this.f12479b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                C6128a.this.f12482e.postDelayed(C6128a.this.f12481d, 10000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.reactnativecommunity.netinfo.a$d */
    /* loaded from: classes6.dex */
    public class C6131d extends BroadcastReceiver {

        /* renamed from: a */
        boolean f12485a;

        /* renamed from: b */
        private Boolean f12486b;

        private C6131d() {
            this.f12485a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            boolean z;
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(str)) {
                z = false;
            } else if ("com.amazon.tv.networkmonitor.INTERNET_UP".equals(str)) {
                z = true;
            } else {
                return;
            }
            Boolean bool = this.f12486b;
            if (bool == null || bool.booleanValue() != z) {
                this.f12486b = Boolean.valueOf(z);
                C6128a.this.f12480c.onAmazonFireDeviceConnectivityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6128a(Context context, AbstractC6129b bVar) {
        this.f12479b = context;
        this.f12480c = bVar;
    }

    /* renamed from: f */
    private boolean m26210f() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m26208h() {
        if (!this.f12478a.f12485a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
            intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
            this.f12479b.registerReceiver(this.f12478a, intentFilter);
            this.f12478a.f12485a = true;
        }
    }

    /* renamed from: i */
    private void m26207i() {
        if (!this.f12483f) {
            Handler handler = new Handler();
            this.f12482e = handler;
            this.f12483f = true;
            handler.post(this.f12481d);
        }
    }

    /* renamed from: j */
    private void m26206j() {
        if (this.f12483f) {
            this.f12483f = false;
            this.f12482e.removeCallbacksAndMessages(null);
            this.f12482e = null;
        }
    }

    /* renamed from: l */
    private void m26204l() {
        C6131d dVar = this.f12478a;
        if (dVar.f12485a) {
            this.f12479b.unregisterReceiver(dVar);
            this.f12478a.f12485a = false;
        }
    }

    /* renamed from: g */
    public void m26209g() {
        if (m26210f()) {
            m26208h();
            m26207i();
        }
    }

    /* renamed from: k */
    public void m26205k() {
        if (m26210f()) {
            m26206j();
            m26204l();
        }
    }
}
