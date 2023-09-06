package com.discord.bridge;

import com.discord.dynamic_link.DynamicLinkManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$17 extends n implements Function1<ReactApplicationContext, DynamicLinkManagerModule> {
    public static final DCDPackageList$getPackages$17 INSTANCE = new DCDPackageList$getPackages$17();

    DCDPackageList$getPackages$17() {
        super(1, DynamicLinkManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final DynamicLinkManagerModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new DynamicLinkManagerModule(p02);
    }
}
