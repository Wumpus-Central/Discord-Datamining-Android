package com.discord.bridge;

import com.discord.resource_usage.DeviceResourceUsageManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$13 extends C9968n implements Function1<ReactApplicationContext, DeviceResourceUsageManagerModule> {
    public static final DCDPackageList$getPackages$13 INSTANCE = new DCDPackageList$getPackages$13();

    DCDPackageList$getPackages$13() {
        super(1, DeviceResourceUsageManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final DeviceResourceUsageManagerModule invoke(ReactApplicationContext p0) {
        C9971q.m14633g(p0, "p0");
        return new DeviceResourceUsageManagerModule(p0);
    }
}
