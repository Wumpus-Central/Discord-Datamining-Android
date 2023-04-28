package com.discord.bridge;

import com.discord.timers.TimersModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$49 extends C9674n implements Function1<ReactApplicationContext, TimersModule> {
    public static final DCDPackageList$getPackages$49 INSTANCE = new DCDPackageList$getPackages$49();

    DCDPackageList$getPackages$49() {
        super(1, TimersModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final TimersModule invoke(ReactApplicationContext p0) {
        C9677q.m14633g(p0, "p0");
        return new TimersModule(p0);
    }
}
