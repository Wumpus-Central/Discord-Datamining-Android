package com.discord.bridge;

import com.discord.minimize_app.MinimizeAppModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$31 extends C9674n implements Function1<ReactApplicationContext, MinimizeAppModule> {
    public static final DCDPackageList$getPackages$31 INSTANCE = new DCDPackageList$getPackages$31();

    DCDPackageList$getPackages$31() {
        super(1, MinimizeAppModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final MinimizeAppModule invoke(ReactApplicationContext p0) {
        C9677q.m14633g(p0, "p0");
        return new MinimizeAppModule(p0);
    }
}
