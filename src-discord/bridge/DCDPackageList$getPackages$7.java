package com.discord.bridge;

import com.discord.billing.BillingManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$7 extends n implements Function1<ReactApplicationContext, BillingManagerModule> {
    public static final DCDPackageList$getPackages$7 INSTANCE = new DCDPackageList$getPackages$7();

    DCDPackageList$getPackages$7() {
        super(1, BillingManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final BillingManagerModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new BillingManagerModule(p02);
    }
}
