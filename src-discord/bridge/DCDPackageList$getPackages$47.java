package com.discord.bridge;

import com.discord.samsung.SamsungModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$47 extends n implements Function1<ReactApplicationContext, SamsungModule> {
    public static final DCDPackageList$getPackages$47 INSTANCE = new DCDPackageList$getPackages$47();

    DCDPackageList$getPackages$47() {
        super(1, SamsungModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final SamsungModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new SamsungModule(p02);
    }
}
