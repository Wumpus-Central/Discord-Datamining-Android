package com.discord.bridge;

import com.discord.tti_manager.TTIManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$50 extends n implements Function1<ReactApplicationContext, TTIManagerModule> {
    public static final DCDPackageList$getPackages$50 INSTANCE = new DCDPackageList$getPackages$50();

    DCDPackageList$getPackages$50() {
        super(1, TTIManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final TTIManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new TTIManagerModule(p02);
    }
}