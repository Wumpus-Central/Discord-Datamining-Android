package com.discord.bridge;

import com.discord.browser_manager.BrowserManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$6 extends n implements Function1<ReactApplicationContext, BrowserManagerModule> {
    public static final DCDPackageList$getPackages$6 INSTANCE = new DCDPackageList$getPackages$6();

    DCDPackageList$getPackages$6() {
        super(1, BrowserManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final BrowserManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new BrowserManagerModule(p02);
    }
}