package com.discord.bridge;

import com.discord.share.ShareManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$46 extends n implements Function1<ReactApplicationContext, ShareManagerModule> {
    public static final DCDPackageList$getPackages$46 INSTANCE = new DCDPackageList$getPackages$46();

    DCDPackageList$getPackages$46() {
        super(1, ShareManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ShareManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new ShareManagerModule(p02);
    }
}