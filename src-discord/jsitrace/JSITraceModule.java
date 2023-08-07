package com.discord.jsitrace;

import com.discord.react.utilities.ReactContextExtensionsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = JSITraceModule.NAME)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¨\u0006\u0011"}, d2 = {"Lcom/discord/jsitrace/JSITraceModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "install", "", "isEnabled", "nativeInstall", "", "jsi", "", "setEnabled", ViewProps.ENABLED, "Companion", "jsitrace_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class JSITraceModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "JSITrace";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/jsitrace/JSITraceModule$Companion;", "", "()V", "NAME", "", "jsitrace_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public JSITraceModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    private final native void nativeInstall(long j10);

    @Override 
    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean install() {
        try {
            if (!isEnabled()) {
                return false;
            }
            System.loadLibrary("jsitrace");
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.g(reactApplicationContext, "reactApplicationContext");
            nativeInstall(ReactContextExtensionsKt.jsiId(reactApplicationContext));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean isEnabled() {
        JSITraceCache jSITraceCache = JSITraceCache.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        return jSITraceCache.isEnabled(reactApplicationContext);
    }

    @ReactMethod
    public final void setEnabled(boolean z10) {
        JSITraceCache jSITraceCache = JSITraceCache.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        jSITraceCache.setEnabled(reactApplicationContext, z10);
    }
}
