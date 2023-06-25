package com.discord.skia;

import com.discord.codegen.BuildConfig;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.shopify.reactnative.skia.RNSkiaModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = RNSkiaModule.NAME)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/discord/skia/RNSkiaModuleDummy;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "()V", "getName", "", "install", "Companion", "skia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RNSkiaModuleDummy extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String ERROR_INSTRUCTIONS = "Skia has not been included in the compilation of the app.  \nBecause this dependency takes a long time to compile, it is not enabled by default.  To enabled it you can either: \n\n# Set `skiaEnabled=true` within discord_android_rn/android/gradle.properties \n# Set `skiaEnabled=true` in your workspace level gradle file ~/gradle.properties \n(recommended as it's not source controlled and thus can remain on indefinitely)\n# Set the env variable  `ORG_GRADLE_PROJECT_skiaEnabled=true`";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/skia/RNSkiaModuleDummy$Companion;", "", "()V", "ERROR_INSTRUCTIONS", "", "skia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNSkiaModule.NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    public final String install() {
        return ERROR_INSTRUCTIONS;
    }
}
