package com.discord.bridge;

import com.discord.minimize_app.MinimizeAppModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$33 extends n implements Function1<ReactApplicationContext, MinimizeAppModule> {
    public static final DCDPackageList$getPackages$33 INSTANCE = new DCDPackageList$getPackages$33();

    DCDPackageList$getPackages$33() {
        super(1, MinimizeAppModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final MinimizeAppModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new MinimizeAppModule(p02);
    }
}
