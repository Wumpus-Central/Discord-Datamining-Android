package com.discord.bridge;

import com.discord.react_asset_fetcher.ReactAssetModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$41 extends n implements Function1<ReactApplicationContext, ReactAssetModule> {
    public static final DCDPackageList$getPackages$41 INSTANCE = new DCDPackageList$getPackages$41();

    DCDPackageList$getPackages$41() {
        super(1, ReactAssetModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ReactAssetModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new ReactAssetModule(p02);
    }
}
