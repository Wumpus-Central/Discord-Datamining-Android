package com.discord.bridge;

import com.discord.sounds.SoundManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$49 extends n implements Function1<ReactApplicationContext, SoundManagerModule> {
    public static final DCDPackageList$getPackages$49 INSTANCE = new DCDPackageList$getPackages$49();

    DCDPackageList$getPackages$49() {
        super(1, SoundManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final SoundManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new SoundManagerModule(p02);
    }
}
