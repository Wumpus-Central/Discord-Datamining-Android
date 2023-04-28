package com.mkuczera;

import android.os.Vibrator;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes6.dex */
public class RNReactNativeHapticFeedbackModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public RNReactNativeHapticFeedbackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNReactNativeHapticFeedback";
    }

    @ReactMethod
    public void trigger(String str, ReadableMap readableMap) {
        boolean z = readableMap.getBoolean("ignoreAndroidSystemSettings");
        int i = Settings.System.getInt(this.reactContext.getContentResolver(), "haptic_feedback_enabled", 0);
        if (z || i != 0) {
            Vibrator vibrator = (Vibrator) this.reactContext.getSystemService("vibrator");
            AbstractC6015b a = C6016c.m26435a(str);
            if (vibrator != null && a != null) {
                a.mo26433a(vibrator);
            }
        }
    }
}
