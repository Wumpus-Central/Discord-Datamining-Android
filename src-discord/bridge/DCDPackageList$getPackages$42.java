package com.discord.bridge;

import com.discord.phone_verification.SmsAutofillManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DCDPackageList$getPackages$42 extends n implements Function1<ReactApplicationContext, SmsAutofillManagerModule> {
    public static final DCDPackageList$getPackages$42 INSTANCE = new DCDPackageList$getPackages$42();

    DCDPackageList$getPackages$42() {
        super(1, SmsAutofillManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    public final SmsAutofillManagerModule invoke(ReactApplicationContext p02) {
        q.g(p02, "p0");
        return new SmsAutofillManagerModule(p02);
    }
}