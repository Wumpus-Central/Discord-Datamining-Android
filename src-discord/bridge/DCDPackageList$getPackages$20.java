package com.discord.bridge;

import com.discord.react.FontModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$20 extends n implements Function1<ReactApplicationContext, FontModule> {
    public static final DCDPackageList$getPackages$20 INSTANCE = new DCDPackageList$getPackages$20();

    DCDPackageList$getPackages$20() {
        super(1, FontModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final FontModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new FontModule(p02);
    }
}
