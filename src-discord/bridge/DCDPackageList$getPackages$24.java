package com.discord.bridge;

import com.discord.friend_finder.FriendFinderManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$24 extends n implements Function1<ReactApplicationContext, FriendFinderManagerModule> {
    public static final DCDPackageList$getPackages$24 INSTANCE = new DCDPackageList$getPackages$24();

    DCDPackageList$getPackages$24() {
        super(1, FriendFinderManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final FriendFinderManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new FriendFinderManagerModule(p02);
    }
}
