package com.discord.bridge;

import com.discord.audio.AudioManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$4 extends n implements Function1<ReactApplicationContext, AudioManagerModule> {
    public static final DCDPackageList$getPackages$4 INSTANCE = new DCDPackageList$getPackages$4();

    DCDPackageList$getPackages$4() {
        super(1, AudioManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final AudioManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new AudioManagerModule(p02);
    }
}
