package com.discord.bridge;

import com.discord.external_pip.ExternalPipModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$17 extends C9968n implements Function1<ReactApplicationContext, ExternalPipModule> {
    public static final DCDPackageList$getPackages$17 INSTANCE = new DCDPackageList$getPackages$17();

    DCDPackageList$getPackages$17() {
        super(1, ExternalPipModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ExternalPipModule invoke(ReactApplicationContext p0) {
        C9971q.m14633g(p0, "p0");
        return new ExternalPipModule(p0);
    }
}
