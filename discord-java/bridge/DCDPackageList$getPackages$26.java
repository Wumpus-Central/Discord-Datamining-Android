package com.discord.bridge;

import com.discord.analytics.InstallReferrerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$26 extends n implements Function1<ReactApplicationContext, InstallReferrerModule> {
    public static final DCDPackageList$getPackages$26 INSTANCE = new DCDPackageList$getPackages$26();

    DCDPackageList$getPackages$26() {
        super(1, InstallReferrerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final InstallReferrerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new InstallReferrerModule(p02);
    }
}