package com.discord.bridge;

import com.discord.modules.proximitysensor.ProximitySensorManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$38 extends C9968n implements Function1<ReactApplicationContext, ProximitySensorManagerModule> {
    public static final DCDPackageList$getPackages$38 INSTANCE = new DCDPackageList$getPackages$38();

    DCDPackageList$getPackages$38() {
        super(1, ProximitySensorManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ProximitySensorManagerModule invoke(ReactApplicationContext p0) {
        C9971q.m14633g(p0, "p0");
        return new ProximitySensorManagerModule(p0);
    }
}
