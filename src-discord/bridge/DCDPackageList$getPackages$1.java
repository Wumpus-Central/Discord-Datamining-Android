package com.discord.bridge;

import com.discord.app_database.AppDatabaseModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$1 extends n implements Function1<ReactApplicationContext, AppDatabaseModule> {
    public static final DCDPackageList$getPackages$1 INSTANCE = new DCDPackageList$getPackages$1();

    DCDPackageList$getPackages$1() {
        super(1, AppDatabaseModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final AppDatabaseModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new AppDatabaseModule(p02);
    }
}