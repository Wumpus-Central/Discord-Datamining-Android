package com.discord.bridge;

import com.discord.hosts.HostsModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$23 extends n implements Function1<ReactApplicationContext, HostsModule> {
    public static final DCDPackageList$getPackages$23 INSTANCE = new DCDPackageList$getPackages$23();

    DCDPackageList$getPackages$23() {
        super(1, HostsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final HostsModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new HostsModule(p02);
    }
}