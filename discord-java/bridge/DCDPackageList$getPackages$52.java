package com.discord.bridge;

import com.discord.wakelock.ScreenWakeLockManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$52 extends n implements Function1<ReactApplicationContext, ScreenWakeLockManagerModule> {
    public static final DCDPackageList$getPackages$52 INSTANCE = new DCDPackageList$getPackages$52();

    DCDPackageList$getPackages$52() {
        super(1, ScreenWakeLockManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ScreenWakeLockManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new ScreenWakeLockManagerModule(p02);
    }
}
