package com.discord.bridge;

import com.discord.timers.TimersModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$49 extends n implements Function1<ReactApplicationContext, TimersModule> {
    public static final DCDPackageList$getPackages$49 INSTANCE = new DCDPackageList$getPackages$49();

    DCDPackageList$getPackages$49() {
        super(1, TimersModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final TimersModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new TimersModule(p02);
    }
}