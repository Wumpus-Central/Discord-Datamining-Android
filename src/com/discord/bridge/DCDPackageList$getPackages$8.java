package com.discord.bridge;

import com.discord.bundle_updater.BundleUpdaterManager;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$8 extends C9968n implements Function1<ReactApplicationContext, BundleUpdaterManager> {
    public static final DCDPackageList$getPackages$8 INSTANCE = new DCDPackageList$getPackages$8();

    DCDPackageList$getPackages$8() {
        super(1, BundleUpdaterManager.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final BundleUpdaterManager invoke(ReactApplicationContext p0) {
        C9971q.m14633g(p0, "p0");
        return new BundleUpdaterManager(p0);
    }
}
