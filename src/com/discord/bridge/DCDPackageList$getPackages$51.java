package com.discord.bridge;

import com.discord.user_search_worker.UserSearchWorkerManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$51 extends C9674n implements Function1<ReactApplicationContext, UserSearchWorkerManagerModule> {
    public static final DCDPackageList$getPackages$51 INSTANCE = new DCDPackageList$getPackages$51();

    DCDPackageList$getPackages$51() {
        super(1, UserSearchWorkerManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final UserSearchWorkerManagerModule invoke(ReactApplicationContext p0) {
        C9677q.m14633g(p0, "p0");
        return new UserSearchWorkerManagerModule(p0);
    }
}
