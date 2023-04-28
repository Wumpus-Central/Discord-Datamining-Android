package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import p119g9.C7558r;

/* renamed from: com.google.android.exoplayer2.w0 */
/* loaded from: classes7.dex */
final class C5333w0 {

    /* renamed from: a */
    private final PowerManager f9903a;

    /* renamed from: b */
    private PowerManager.WakeLock f9904b;

    /* renamed from: c */
    private boolean f9905c;

    /* renamed from: d */
    private boolean f9906d;

    public C5333w0(Context context) {
        this.f9903a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: c */
    private void m29456c() {
        PowerManager.WakeLock wakeLock = this.f9904b;
        if (wakeLock != null) {
            if (!this.f9905c || !this.f9906d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    /* renamed from: a */
    public void m29458a(boolean z) {
        if (z && this.f9904b == null) {
            PowerManager powerManager = this.f9903a;
            if (powerManager == null) {
                C7558r.m22104h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f9904b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f9905c = z;
        m29456c();
    }

    /* renamed from: b */
    public void m29457b(boolean z) {
        this.f9906d = z;
        m29456c();
    }
}
