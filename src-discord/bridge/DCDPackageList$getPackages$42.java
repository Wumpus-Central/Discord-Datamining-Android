package com.discord.bridge;

import com.discord.security_key.SecurityKeyManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$42 extends n implements Function1<ReactApplicationContext, SecurityKeyManagerModule> {
    public static final DCDPackageList$getPackages$42 INSTANCE = new DCDPackageList$getPackages$42();

    DCDPackageList$getPackages$42() {
        super(1, SecurityKeyManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final SecurityKeyManagerModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new SecurityKeyManagerModule(p02);
    }
}
