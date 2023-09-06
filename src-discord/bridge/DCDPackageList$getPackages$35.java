package com.discord.bridge;

import com.discord.password_manager.PasswordManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$35 extends n implements Function1<ReactApplicationContext, PasswordManagerModule> {
    public static final DCDPackageList$getPackages$35 INSTANCE = new DCDPackageList$getPackages$35();

    DCDPackageList$getPackages$35() {
        super(1, PasswordManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final PasswordManagerModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new PasswordManagerModule(p02);
    }
}
