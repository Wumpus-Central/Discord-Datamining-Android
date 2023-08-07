package com.discord.bridge;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$5 extends n implements Function1<ReactApplicationContext, AudioPlayerManagerModule> {
    public static final DCDPackageList$getPackages$5 INSTANCE = new DCDPackageList$getPackages$5();

    DCDPackageList$getPackages$5() {
        super(1, AudioPlayerManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final AudioPlayerManagerModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new AudioPlayerManagerModule(p02);
    }
}
