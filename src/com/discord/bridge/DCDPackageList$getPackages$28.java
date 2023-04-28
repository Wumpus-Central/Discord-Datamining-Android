package com.discord.bridge;

import com.discord.media.MediaFetcherModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$28 extends C9674n implements Function1<ReactApplicationContext, MediaFetcherModule> {
    public static final DCDPackageList$getPackages$28 INSTANCE = new DCDPackageList$getPackages$28();

    DCDPackageList$getPackages$28() {
        super(1, MediaFetcherModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final MediaFetcherModule invoke(ReactApplicationContext p0) {
        C9677q.m14633g(p0, "p0");
        return new MediaFetcherModule(p0);
    }
}
