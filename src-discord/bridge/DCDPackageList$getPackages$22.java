package com.discord.bridge;

import com.discord.image.fresco.FrescoModuleDiscord;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$22 extends n implements Function1<ReactApplicationContext, FrescoModuleDiscord> {
    public static final DCDPackageList$getPackages$22 INSTANCE = new DCDPackageList$getPackages$22();

    DCDPackageList$getPackages$22() {
        super(1, FrescoModuleDiscord.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final FrescoModuleDiscord invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new FrescoModuleDiscord(p02);
    }
}
