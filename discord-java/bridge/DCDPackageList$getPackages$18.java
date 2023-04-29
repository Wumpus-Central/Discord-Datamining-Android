package com.discord.bridge;

import com.discord.modules.fastconnectmanager.FastConnectManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$18 extends n implements Function1<ReactApplicationContext, FastConnectManagerModule> {
    public static final DCDPackageList$getPackages$18 INSTANCE = new DCDPackageList$getPackages$18();

    DCDPackageList$getPackages$18() {
        super(1, FastConnectManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final FastConnectManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new FastConnectManagerModule(p02);
    }
}
