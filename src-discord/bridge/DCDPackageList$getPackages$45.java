package com.discord.bridge;

import com.discord.bug_reporter.ScreenshotHelperModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$45 extends n implements Function1<ReactApplicationContext, ScreenshotHelperModule> {
    public static final DCDPackageList$getPackages$45 INSTANCE = new DCDPackageList$getPackages$45();

    DCDPackageList$getPackages$45() {
        super(1, ScreenshotHelperModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ScreenshotHelperModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new ScreenshotHelperModule(p02);
    }
}
