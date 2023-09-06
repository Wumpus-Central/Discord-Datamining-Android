package com.discord.bridge;

import com.discord.media.MediaFetcherModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$29 extends n implements Function1<ReactApplicationContext, MediaFetcherModule> {
    public static final DCDPackageList$getPackages$29 INSTANCE = new DCDPackageList$getPackages$29();

    DCDPackageList$getPackages$29() {
        super(1, MediaFetcherModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final MediaFetcherModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new MediaFetcherModule(p02);
    }
}
