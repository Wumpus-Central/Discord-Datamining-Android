package com.discord.bridge;

import com.discord.modules.compressionmanager.CompressionManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$10 extends C9968n implements Function1<ReactApplicationContext, CompressionManagerModule> {
    public static final DCDPackageList$getPackages$10 INSTANCE = new DCDPackageList$getPackages$10();

    DCDPackageList$getPackages$10() {
        super(1, CompressionManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final CompressionManagerModule invoke(ReactApplicationContext p0) {
        C9971q.m14633g(p0, "p0");
        return new CompressionManagerModule(p0);
    }
}
