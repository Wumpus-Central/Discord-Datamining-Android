package com.discord.bridge;

import com.discord.nearby.NearbyHelperModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$33 extends n implements Function1<ReactApplicationContext, NearbyHelperModule> {
    public static final DCDPackageList$getPackages$33 INSTANCE = new DCDPackageList$getPackages$33();

    DCDPackageList$getPackages$33() {
        super(1, NearbyHelperModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final NearbyHelperModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new NearbyHelperModule(p02);
    }
}