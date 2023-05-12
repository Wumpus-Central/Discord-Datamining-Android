package com.discord.bridge;

import com.discord.foreground_service.ForegroundServiceModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$21 extends n implements Function1<ReactApplicationContext, ForegroundServiceModule> {
    public static final DCDPackageList$getPackages$21 INSTANCE = new DCDPackageList$getPackages$21();

    DCDPackageList$getPackages$21() {
        super(1, ForegroundServiceModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ForegroundServiceModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new ForegroundServiceModule(p02);
    }
}
