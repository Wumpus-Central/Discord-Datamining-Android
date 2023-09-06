package com.discord.bridge;

import com.discord.cache.CacheModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$9 extends n implements Function1<ReactApplicationContext, CacheModule> {
    public static final DCDPackageList$getPackages$9 INSTANCE = new DCDPackageList$getPackages$9();

    DCDPackageList$getPackages$9() {
        super(1, CacheModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final CacheModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new CacheModule(p02);
    }
}
