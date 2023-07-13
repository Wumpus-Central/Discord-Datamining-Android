package com.discord.bridge;

import com.discord.media.PhotoLibraryHelperModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$37 extends n implements Function1<ReactApplicationContext, PhotoLibraryHelperModule> {
    public static final DCDPackageList$getPackages$37 INSTANCE = new DCDPackageList$getPackages$37();

    DCDPackageList$getPackages$37() {
        super(1, PhotoLibraryHelperModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final PhotoLibraryHelperModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new PhotoLibraryHelperModule(p02);
    }
}
