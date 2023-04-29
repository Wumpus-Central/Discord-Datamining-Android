package com.discord.bridge;

import com.discord.device.DeviceThermalStateManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$15 extends n implements Function1<ReactApplicationContext, DeviceThermalStateManagerModule> {
    public static final DCDPackageList$getPackages$15 INSTANCE = new DCDPackageList$getPackages$15();

    DCDPackageList$getPackages$15() {
        super(1, DeviceThermalStateManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final DeviceThermalStateManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new DeviceThermalStateManagerModule(p02);
    }
}
