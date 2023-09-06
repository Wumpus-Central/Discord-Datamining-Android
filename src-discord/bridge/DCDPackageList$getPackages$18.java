package com.discord.bridge;

import com.discord.external_pip.ExternalPipModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$18 extends n implements Function1<ReactApplicationContext, ExternalPipModule> {
    public static final DCDPackageList$getPackages$18 INSTANCE = new DCDPackageList$getPackages$18();

    DCDPackageList$getPackages$18() {
        super(1, ExternalPipModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ExternalPipModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new ExternalPipModule(p02);
    }
}
