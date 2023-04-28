package com.discord.bridge;

import com.discord.cache.CacheModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$9 extends C9674n implements Function1<ReactApplicationContext, CacheModule> {
    public static final DCDPackageList$getPackages$9 INSTANCE = new DCDPackageList$getPackages$9();

    DCDPackageList$getPackages$9() {
        super(1, CacheModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final CacheModule invoke(ReactApplicationContext p0) {
        C9677q.m14633g(p0, "p0");
        return new CacheModule(p0);
    }
}
