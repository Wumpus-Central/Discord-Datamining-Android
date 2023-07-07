package com.discord.foreground_service.utils;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/foreground_service/utils/Wakelocks;", "", "tag", "", "timeout", "", "(Ljava/lang/String;J)V", "wakeLockPartial", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "wakeLockWifi", "Landroid/net/wifi/WifiManager$WifiLock;", "Landroid/net/wifi/WifiManager;", "acquire", "", "context", "Landroid/content/Context;", "release", "foreground_service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Wakelocks {
    private final String tag;
    private final long timeout;
    private PowerManager.WakeLock wakeLockPartial;
    private WifiManager.WifiLock wakeLockWifi;

    public Wakelocks(String tag, long j10) {
        q.g(tag, "tag");
        this.tag = tag;
        this.timeout = j10;
    }

    public final void acquire(Context context) {
        q.g(context, "context");
        WifiManager wifiManager = (WifiManager) a.i(context, WifiManager.class);
        if (wifiManager != null) {
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, this.tag);
            this.wakeLockWifi = createWifiLock;
            if (createWifiLock != null) {
                createWifiLock.acquire();
            }
        }
        PowerManager powerManager = (PowerManager) a.i(context, PowerManager.class);
        boolean z10 = false;
        if (powerManager != null && powerManager.isWakeLockLevelSupported(1)) {
            z10 = true;
        }
        if (z10) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, this.tag);
            this.wakeLockPartial = newWakeLock;
            if (newWakeLock != null) {
                newWakeLock.acquire(this.timeout);
            }
        }
    }

    public final void release() {
        boolean z10;
        PowerManager.WakeLock wakeLock = this.wakeLockPartial;
        boolean z11 = true;
        if (wakeLock == null || !wakeLock.isHeld()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            PowerManager.WakeLock wakeLock2 = this.wakeLockPartial;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
            this.wakeLockPartial = null;
        }
        WifiManager.WifiLock wifiLock = this.wakeLockWifi;
        if (wifiLock == null || !wifiLock.isHeld()) {
            z11 = false;
        }
        if (z11) {
            WifiManager.WifiLock wifiLock2 = this.wakeLockWifi;
            if (wifiLock2 != null) {
                wifiLock2.release();
            }
            this.wakeLockWifi = null;
        }
    }

    public /* synthetic */ Wakelocks(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? 3600000L : j10);
    }
}
