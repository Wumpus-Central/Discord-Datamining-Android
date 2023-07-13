package com.discord.bridge;

import com.discord.shortcuts.ShortcutManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$43 extends n implements Function1<ReactApplicationContext, ShortcutManagerModule> {
    public static final DCDPackageList$getPackages$43 INSTANCE = new DCDPackageList$getPackages$43();

    DCDPackageList$getPackages$43() {
        super(1, ShortcutManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ShortcutManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new ShortcutManagerModule(p02);
    }
}
