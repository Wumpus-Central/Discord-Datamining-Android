package com.shopify.reactnative.skia;

import android.util.Log;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.lang.ref.WeakReference;

@ReactModule(name = RNSkiaModule.NAME)
/* loaded from: classes8.dex */
public class RNSkiaModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String NAME = "RNSkia";
    private SkiaManager skiaManager;
    private final WeakReference<ReactApplicationContext> weakReactContext;

    public RNSkiaModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.weakReactContext = new WeakReference<>(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public SkiaManager getSkiaManager() {
        return this.skiaManager;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        if (this.skiaManager != null) {
            return true;
        }
        try {
            System.loadLibrary("rnskia");
            ReactApplicationContext reactApplicationContext = this.weakReactContext.get();
            if (reactApplicationContext == null) {
                Log.e(NAME, "React Application Context was null!");
                return false;
            }
            this.skiaManager = new SkiaManager(reactApplicationContext);
            return true;
        } catch (Exception e) {
            Log.e(NAME, "Failed to initialize Skia Manager!", e);
            return false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        if (getReactApplicationContext() != null) {
            getReactApplicationContext().removeLifecycleEventListener(this);
        }
        SkiaManager skiaManager = this.skiaManager;
        if (skiaManager != null) {
            skiaManager.invalidate();
            this.skiaManager.destroy();
            this.skiaManager = null;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        SkiaManager skiaManager = this.skiaManager;
        if (skiaManager != null) {
            skiaManager.onHostPause();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        SkiaManager skiaManager = this.skiaManager;
        if (skiaManager != null) {
            skiaManager.onHostResume();
        }
    }
}
