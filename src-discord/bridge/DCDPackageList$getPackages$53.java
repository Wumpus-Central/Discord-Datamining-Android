package com.discord.bridge;

import com.discord.user_search_worker.UserSearchWorkerManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$53 extends n implements Function1<ReactApplicationContext, UserSearchWorkerManagerModule> {
    public static final DCDPackageList$getPackages$53 INSTANCE = new DCDPackageList$getPackages$53();

    DCDPackageList$getPackages$53() {
        super(1, UserSearchWorkerManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final UserSearchWorkerManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new UserSearchWorkerManagerModule(p02);
    }
}
