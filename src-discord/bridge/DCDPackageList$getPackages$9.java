package com.discord.bridge;

import com.discord.bundle_updater.BundleUpdaterManager;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$9 extends n implements Function1<ReactApplicationContext, BundleUpdaterManager> {
    public static final DCDPackageList$getPackages$9 INSTANCE = new DCDPackageList$getPackages$9();

    DCDPackageList$getPackages$9() {
        super(1, BundleUpdaterManager.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final BundleUpdaterManager invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new BundleUpdaterManager(p02);
    }
}
