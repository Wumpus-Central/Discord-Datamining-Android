package com.discord.bridge;

import com.discord.billing.BillingManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$7 extends C9674n implements Function1<ReactApplicationContext, BillingManagerModule> {
    public static final DCDPackageList$getPackages$7 INSTANCE = new DCDPackageList$getPackages$7();

    DCDPackageList$getPackages$7() {
        super(1, BillingManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final BillingManagerModule invoke(ReactApplicationContext p0) {
        C9677q.m14633g(p0, "p0");
        return new BillingManagerModule(p0);
    }
}
