package com.swmansion.reanimated.layoutReanimation;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.ref.WeakReference;
import java.util.Map;
import p078e6.AbstractC6709a;

/* loaded from: classes8.dex */
public class LayoutAnimations {
    private WeakReference<ReactApplicationContext> mContext;
    @AbstractC6709a
    private final HybridData mHybridData = initHybrid();

    static {
        System.loadLibrary("reanimated");
    }

    public LayoutAnimations(ReactApplicationContext reactApplicationContext) {
        this.mContext = new WeakReference<>(reactApplicationContext);
    }

    private native HybridData initHybrid();

    private void notifyAboutEnd(int i, int i2) {
        boolean z;
        ReactApplicationContext reactApplicationContext = this.mContext.get();
        if (reactApplicationContext != null) {
            AnimationsManager animationsManager = ((ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
            if (i2 == 0) {
                z = false;
            } else {
                z = true;
            }
            animationsManager.notifyAboutEnd(i, z);
        }
    }

    private void notifyAboutProgress(Map<String, Object> map, int i) {
        ReactApplicationContext reactApplicationContext = this.mContext.get();
        if (reactApplicationContext != null) {
            ((ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager().notifyAboutProgress(map, Integer.valueOf(i));
        }
    }

    public native boolean isLayoutAnimationEnabled();

    public native void removeConfigForTag(int i);

    public native void startAnimationForTag(int i, String str, Map<String, String> map);
}
