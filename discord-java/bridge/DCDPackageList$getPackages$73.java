package com.discord.bridge;

import com.discord.keyboard.KeyboardManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/facebook/react/bridge/NativeModule;", "it", "Lcom/facebook/react/bridge/ReactApplicationContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DCDPackageList$getPackages$73 extends s implements Function1<ReactApplicationContext, NativeModule> {
    public static final DCDPackageList$getPackages$73 INSTANCE = new DCDPackageList$getPackages$73();

    DCDPackageList$getPackages$73() {
        super(1);
    }

    public final NativeModule invoke(ReactApplicationContext it) {
        q.g(it, "it");
        return KeyboardManagerModule.Companion.create(it);
    }
}