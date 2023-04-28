package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import p119g9.C7558r;

/* renamed from: com.google.android.exoplayer2.x0 */
/* loaded from: classes7.dex */
final class C5335x0 {

    /* renamed from: a */
    private final WifiManager f9909a;

    /* renamed from: b */
    private WifiManager.WifiLock f9910b;

    /* renamed from: c */
    private boolean f9911c;

    /* renamed from: d */
    private boolean f9912d;

    public C5335x0(Context context) {
        this.f9909a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: c */
    private void m29453c() {
        WifiManager.WifiLock wifiLock = this.f9910b;
        if (wifiLock != null) {
            if (!this.f9911c || !this.f9912d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    /* renamed from: a */
    public void m29455a(boolean z) {
        if (z && this.f9910b == null) {
            WifiManager wifiManager = this.f9909a;
            if (wifiManager == null) {
                C7558r.m22104h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f9910b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f9911c = z;
        m29453c();
    }

    /* renamed from: b */
    public void m29454b(boolean z) {
        this.f9912d = z;
        m29453c();
    }
}
