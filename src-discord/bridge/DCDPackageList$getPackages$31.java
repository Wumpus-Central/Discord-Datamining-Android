package com.discord.bridge;

import com.discord.media_player.MediaPlayerManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$31 extends n implements Function1<ReactApplicationContext, MediaPlayerManagerModule> {
    public static final DCDPackageList$getPackages$31 INSTANCE = new DCDPackageList$getPackages$31();

    DCDPackageList$getPackages$31() {
        super(1, MediaPlayerManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final MediaPlayerManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new MediaPlayerManagerModule(p02);
    }
}
