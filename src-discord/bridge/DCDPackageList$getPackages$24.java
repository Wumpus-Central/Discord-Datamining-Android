package com.discord.bridge;

import com.discord.react_strings.I18nModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$24 extends n implements Function1<ReactApplicationContext, I18nModule> {
    public static final DCDPackageList$getPackages$24 INSTANCE = new DCDPackageList$getPackages$24();

    DCDPackageList$getPackages$24() {
        super(1, I18nModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final I18nModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new I18nModule(p02);
    }
}