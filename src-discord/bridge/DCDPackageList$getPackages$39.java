package com.discord.bridge;

import com.discord.notifications.react.PushNotificationModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$39 extends n implements Function1<ReactApplicationContext, PushNotificationModule> {
    public static final DCDPackageList$getPackages$39 INSTANCE = new DCDPackageList$getPackages$39();

    DCDPackageList$getPackages$39() {
        super(1, PushNotificationModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final PushNotificationModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new PushNotificationModule(p02);
    }
}
