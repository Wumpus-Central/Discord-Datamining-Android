package com.discord.bridge;

import com.discord.intents.IntentsSendModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$44 extends n implements Function1<ReactApplicationContext, IntentsSendModule> {
    public static final DCDPackageList$getPackages$44 INSTANCE = new DCDPackageList$getPackages$44();

    DCDPackageList$getPackages$44() {
        super(1, IntentsSendModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final IntentsSendModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new IntentsSendModule(p02);
    }
}