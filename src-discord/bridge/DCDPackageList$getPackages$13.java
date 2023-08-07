package com.discord.bridge;

import com.discord.crash_reporting.CrashReportingModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class DCDPackageList$getPackages$13 extends n implements Function1<ReactApplicationContext, CrashReportingModule> {
    public static final DCDPackageList$getPackages$13 INSTANCE = new DCDPackageList$getPackages$13();

    DCDPackageList$getPackages$13() {
        super(1, CrashReportingModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final CrashReportingModule invoke(ReactApplicationContext p02) {
        q.h(p02, "p0");
        return new CrashReportingModule(p02);
    }
}
