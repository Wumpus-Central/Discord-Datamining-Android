package com.discord.bridge;

import com.discord.chat.input.ChatInputManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "it", "Lcom/facebook/react/bridge/ReactApplicationContext;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class DCDPackageList$getPackages$54 extends AbstractC9973s implements Function1<ReactApplicationContext, ReactContextBaseJavaModule> {
    public static final DCDPackageList$getPackages$54 INSTANCE = new DCDPackageList$getPackages$54();

    DCDPackageList$getPackages$54() {
        super(1);
    }

    public final ReactContextBaseJavaModule invoke(ReactApplicationContext it) {
        C9971q.m14633g(it, "it");
        return new ChatInputManagerModule(it);
    }
}
