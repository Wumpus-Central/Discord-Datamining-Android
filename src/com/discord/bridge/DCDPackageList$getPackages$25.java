package com.discord.bridge;

import com.discord.image.dominant_color.ImageManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$25 extends C9968n implements Function1<ReactApplicationContext, ImageManagerModule> {
    public static final DCDPackageList$getPackages$25 INSTANCE = new DCDPackageList$getPackages$25();

    DCDPackageList$getPackages$25() {
        super(1, ImageManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ImageManagerModule invoke(ReactApplicationContext p0) {
        C9971q.m14633g(p0, "p0");
        return new ImageManagerModule(p0);
    }
}
