package com.discord.bridge;

import com.discord.shortcuts.ShortcutManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$41 extends C9968n implements Function1<ReactApplicationContext, ShortcutManagerModule> {
    public static final DCDPackageList$getPackages$41 INSTANCE = new DCDPackageList$getPackages$41();

    DCDPackageList$getPackages$41() {
        super(1, ShortcutManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final ShortcutManagerModule invoke(ReactApplicationContext p0) {
        C9971q.m14633g(p0, "p0");
        return new ShortcutManagerModule(p0);
    }
}
