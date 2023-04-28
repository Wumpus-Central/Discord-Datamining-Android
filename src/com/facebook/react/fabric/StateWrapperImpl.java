package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.StateWrapper;
import p078e6.AbstractC6709a;
import p414x3.C13925a;

@AbstractC6709a
@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes7.dex */
public class StateWrapperImpl implements StateWrapper {
    private static final String TAG = "StateWrapperImpl";
    private volatile boolean mDestroyed = false;
    @AbstractC6709a
    private final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    private StateWrapperImpl() {
    }

    private native ReadableNativeMap getStateDataImpl();

    private native ReadableMapBuffer getStateMapBufferDataImpl();

    private static native HybridData initHybrid();

    @Override // com.facebook.react.uimanager.StateWrapper
    public void destroyState() {
        if (!this.mDestroyed) {
            this.mDestroyed = true;
            this.mHybridData.resetNative();
        }
    }

    @Override // com.facebook.react.uimanager.StateWrapper
    public ReadableNativeMap getStateData() {
        if (!this.mDestroyed) {
            return getStateDataImpl();
        }
        C13925a.m2288j(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    @Override // com.facebook.react.uimanager.StateWrapper
    public ReadableMapBuffer getStateDataMapBuffer() {
        if (!this.mDestroyed) {
            return getStateMapBufferDataImpl();
        }
        C13925a.m2288j(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    @Override // com.facebook.react.uimanager.StateWrapper
    public void updateState(WritableMap writableMap) {
        if (this.mDestroyed) {
            C13925a.m2288j(TAG, "Race between StateWrapperImpl destruction and updateState");
        } else {
            updateStateImpl((NativeMap) writableMap);
        }
    }

    public native void updateStateImpl(NativeMap nativeMap);
}
