package com.discord.device;

import android.content.Context;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/discord/device/DeviceAccessibilityModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "handleSetPrefersReducedMotion", "", "prefersReducedMotion", "Companion", "device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DeviceAccessibilityModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static String appReducedMotionSetting = "";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/device/DeviceAccessibilityModule$Companion;", "", "()V", "appReducedMotionSetting", "", "isSystemReducedMotionEnabled", "", "context", "Landroid/content/Context;", "useReducedMotion", "device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isSystemReducedMotionEnabled(Context context) {
            float f10;
            try {
                f10 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale");
            } catch (Settings.SettingNotFoundException unused) {
                f10 = 1.0f;
            }
            return f10 == 0.0f;
        }

        public final boolean useReducedMotion(Context context) {
            q.h(context, "context");
            String str = DeviceAccessibilityModule.appReducedMotionSetting;
            if (q.c(str, "reduce")) {
                return true;
            }
            if (q.c(str, "no-preference")) {
                return false;
            }
            return isSystemReducedMotionEnabled(context);
        }
    }

    
    public DeviceAccessibilityModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    @Override 
    public String getName() {
        return "DCDAccessibilityManager";
    }

    @ReactMethod
    public final void handleSetPrefersReducedMotion(String prefersReducedMotion) {
        q.h(prefersReducedMotion, "prefersReducedMotion");
        appReducedMotionSetting = prefersReducedMotion;
    }
}
