package com.discord.wakelock;

import android.app.Activity;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/discord/wakelock/ScreenWakeLock;", "", "()V", "keys", "", "", "getKeys", "()Ljava/util/Set;", "setKeys", "(Ljava/util/Set;)V", "releaseLock", "", "activity", "Landroid/app/Activity;", "key", "requestLock", "wakelock_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenWakeLock {
    public static final ScreenWakeLock INSTANCE = new ScreenWakeLock();
    private static Set<String> keys = new LinkedHashSet();

    private ScreenWakeLock() {
    }

    public final Set<String> getKeys() {
        return keys;
    }

    public final void releaseLock(final Activity activity, final String key) {
        q.g(activity, "activity");
        q.g(key, "key");
        if (ThreadUtilsKt.isOnMainThread()) {
            ScreenWakeLock screenWakeLock = INSTANCE;
            screenWakeLock.getKeys().remove(key);
            if (screenWakeLock.getKeys().isEmpty()) {
                activity.getWindow().clearFlags(128);
                return;
            }
            return;
        }
        ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.wakelock.ScreenWakeLock$releaseLock$$inlined$postOrRunOnMainThread$1
            @Override // java.lang.Runnable
            public final void run() {
                ScreenWakeLock screenWakeLock2 = ScreenWakeLock.INSTANCE;
                screenWakeLock2.getKeys().remove(key);
                if (screenWakeLock2.getKeys().isEmpty()) {
                    activity.getWindow().clearFlags(128);
                }
            }
        });
    }

    public final void requestLock(final Activity activity, final String key) {
        q.g(activity, "activity");
        q.g(key, "key");
        if (!ThreadUtilsKt.isOnMainThread()) {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.wakelock.ScreenWakeLock$requestLock$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ScreenWakeLock.INSTANCE.getKeys().add(key)) {
                        activity.getWindow().addFlags(128);
                    }
                }
            });
        } else if (INSTANCE.getKeys().add(key)) {
            activity.getWindow().addFlags(128);
        }
    }

    public final void setKeys(Set<String> set) {
        q.g(set, "<set-?>");
        keys = set;
    }
}
