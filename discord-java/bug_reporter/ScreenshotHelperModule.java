package com.discord.bug_reporter;

import android.content.ContentResolver;
import com.discord.bug_reporter.ScreenshotDetector;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/discord/bug_reporter/ScreenshotHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "eventEmitter", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "getEventEmitter", "()Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "addListener", "", "type", "", "appStateChanged", "isAppActive", "", "getName", "initialize", "registerEventListener", "removeEventListener", "removeListeners", "count", "", "Companion", "bug_reporter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScreenshotHelperModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String SCREENSHOT_TAKEN = "screenshotTaken";
    private final ReactApplicationContext reactContext;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/bug_reporter/ScreenshotHelperModule$Companion;", "", "()V", "SCREENSHOT_TAKEN", "", "bug_reporter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        JavaScriptModule jSModule = getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        q.f(jSModule, "reactApplicationContext.…EventEmitter::class.java)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    @ReactMethod
    public final void addListener(String type) {
        q.g(type, "type");
        if (q.b(type, SCREENSHOT_TAKEN)) {
            ScreenshotDetector.Companion.get().setScreenshotListener(new ScreenshotHelperModule$addListener$1(this));
        }
    }

    @ReactMethod
    public final void appStateChanged(boolean z10) {
        ScreenshotDetector.Companion.get().setActive(z10);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ScreenshotHelper";
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        ScreenshotDetector.Companion companion = ScreenshotDetector.Companion;
        ContentResolver contentResolver = this.reactContext.getContentResolver();
        q.f(contentResolver, "reactContext.contentResolver");
        companion.init(contentResolver);
    }

    @ReactMethod
    public final void registerEventListener(String type) {
        q.g(type, "type");
        if (q.b(type, SCREENSHOT_TAKEN)) {
            ScreenshotDetector.Companion.get().setScreenshotListener(new ScreenshotHelperModule$registerEventListener$1(this));
        }
    }

    @ReactMethod
    public final void removeEventListener(String type) {
        q.g(type, "type");
        if (q.b(type, SCREENSHOT_TAKEN)) {
            ScreenshotDetector.Companion.get().setScreenshotListener(null);
        }
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }
}
