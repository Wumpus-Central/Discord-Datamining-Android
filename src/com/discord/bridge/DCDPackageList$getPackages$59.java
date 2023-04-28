package com.discord.bridge;

import com.discord.media.engine.MediaEngineModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "it", "Lcom/facebook/react/bridge/ReactApplicationContext;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class DCDPackageList$getPackages$59 extends AbstractC9679s implements Function1<ReactApplicationContext, ReactContextBaseJavaModule> {
    public static final DCDPackageList$getPackages$59 INSTANCE = new DCDPackageList$getPackages$59();

    DCDPackageList$getPackages$59() {
        super(1);
    }

    public final ReactContextBaseJavaModule invoke(ReactApplicationContext it) {
        C9677q.m14633g(it, "it");
        return new MediaEngineModule(it);
    }
}
