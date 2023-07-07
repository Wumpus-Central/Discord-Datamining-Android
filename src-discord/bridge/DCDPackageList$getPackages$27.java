package com.discord.bridge;

import com.discord.image.dominant_color.ImageManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$27 extends n implements Function1<ReactApplicationContext, ImageManagerModule> {
    public static final DCDPackageList$getPackages$27 INSTANCE = new DCDPackageList$getPackages$27();

    DCDPackageList$getPackages$27() {
        super(1, ImageManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ImageManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new ImageManagerModule(p02);
    }
}
