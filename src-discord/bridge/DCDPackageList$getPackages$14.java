package com.discord.bridge;

import com.discord.device.DeviceAccessibilityModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$14 extends n implements Function1<ReactApplicationContext, DeviceAccessibilityModule> {
    public static final DCDPackageList$getPackages$14 INSTANCE = new DCDPackageList$getPackages$14();

    DCDPackageList$getPackages$14() {
        super(1, DeviceAccessibilityModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final DeviceAccessibilityModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new DeviceAccessibilityModule(p02);
    }
}
