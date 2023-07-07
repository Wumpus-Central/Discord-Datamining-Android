package com.discord.mobile_voice_overlay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.discord.codegen.NativeMobileVoiceOverlaySpec;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import gf.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;", "Lcom/discord/codegen/NativeMobileVoiceOverlaySpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mobileVoiceOverlay", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;", "getMobileVoiceOverlay", "()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;", "mobileVoiceOverlay$delegate", "Lkotlin/Lazy;", "enableOverlay", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "", "hideOverlay", "setData", "data", "Lcom/facebook/react/bridge/ReadableMap;", "showOverlay", "assets", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MobileVoiceOverlayManagerModule extends NativeMobileVoiceOverlaySpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNMobileVoiceOverlay";
    public static final int OVERLAY_REQUEST_CODE = 234780;
    private final Lazy mobileVoiceOverlay$delegate;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$Companion;", "", "()V", "NAME", "", "OVERLAY_REQUEST_CODE", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.g(reactContext, "reactContext");
            return new MobileVoiceOverlayManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlayManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Lazy b10;
        q.g(reactContext, "reactContext");
        b10 = n.b(new MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2(this));
        this.mobileVoiceOverlay$delegate = b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MobileVoiceOverlay getMobileVoiceOverlay() {
        return (MobileVoiceOverlay) this.mobileVoiceOverlay$delegate.getValue();
    }

    @Override // com.discord.codegen.NativeMobileVoiceOverlaySpec
    public void enableOverlay(final Promise promise) {
        q.g(promise, "promise");
        WindowUtils windowUtils = WindowUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        if (windowUtils.canDrawOverlay(reactApplicationContext)) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        getReactApplicationContext().addActivityEventListener(new ActivityEventListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlayManagerModule$enableOverlay$listener$1
            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
                ReactApplicationContext reactApplicationContext2;
                ReactApplicationContext reactApplicationContext3;
                if (i10 == 234780) {
                    reactApplicationContext2 = MobileVoiceOverlayManagerModule.this.getReactApplicationContext();
                    reactApplicationContext2.removeActivityEventListener(this);
                    Promise promise2 = promise;
                    WindowUtils windowUtils2 = WindowUtils.INSTANCE;
                    reactApplicationContext3 = MobileVoiceOverlayManagerModule.this.getReactApplicationContext();
                    q.f(reactApplicationContext3, "reactApplicationContext");
                    promise2.resolve(Boolean.valueOf(windowUtils2.canDrawOverlay(reactApplicationContext3)));
                }
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
            }
        });
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        String packageName = getReactApplicationContext().getPackageName();
        reactApplicationContext2.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + packageName)), OVERLAY_REQUEST_CODE, Bundle.EMPTY);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.discord.codegen.NativeMobileVoiceOverlaySpec
    public void hideOverlay() {
        if (ThreadUtilsKt.isOnMainThread()) {
            getMobileVoiceOverlay().hideOverlay$mobile_voice_overlay_release();
        } else {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlayManagerModule$hideOverlay$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    MobileVoiceOverlayManagerModule.this.getMobileVoiceOverlay().hideOverlay$mobile_voice_overlay_release();
                }
            });
        }
    }

    @Override // com.discord.codegen.NativeMobileVoiceOverlaySpec
    public void setData(ReadableMap readableMap) {
        if (readableMap != null) {
            Json json = NativeMapExtensionsKt.getJson();
            String jsonString = NativeMapExtensionsKt.toJsonString(readableMap);
            json.a();
            final MobileVoiceOverlayData mobileVoiceOverlayData = (MobileVoiceOverlayData) json.b(MobileVoiceOverlayData.Companion.serializer(), jsonString);
            if (mobileVoiceOverlayData != null) {
                if (ThreadUtilsKt.isOnMainThread()) {
                    getMobileVoiceOverlay().setData$mobile_voice_overlay_release(mobileVoiceOverlayData);
                } else {
                    ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlayManagerModule$setData$$inlined$postOrRunOnMainThread$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MobileVoiceOverlayManagerModule.this.getMobileVoiceOverlay().setData$mobile_voice_overlay_release(mobileVoiceOverlayData);
                        }
                    });
                }
            }
        }
    }

    @Override // com.discord.codegen.NativeMobileVoiceOverlaySpec
    public void showOverlay(ReadableMap readableMap) {
        if (readableMap != null) {
            Json json = NativeMapExtensionsKt.getJson();
            String jsonString = NativeMapExtensionsKt.toJsonString(readableMap);
            json.a();
            final MobileVoiceOverlayAssets mobileVoiceOverlayAssets = (MobileVoiceOverlayAssets) json.b(MobileVoiceOverlayAssets.Companion.serializer(), jsonString);
            if (mobileVoiceOverlayAssets != null) {
                if (ThreadUtilsKt.isOnMainThread()) {
                    getMobileVoiceOverlay().showOverlay$mobile_voice_overlay_release(mobileVoiceOverlayAssets);
                } else {
                    ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlayManagerModule$showOverlay$$inlined$postOrRunOnMainThread$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MobileVoiceOverlayManagerModule.this.getMobileVoiceOverlay().showOverlay$mobile_voice_overlay_release(mobileVoiceOverlayAssets);
                        }
                    });
                }
            }
        }
    }
}
