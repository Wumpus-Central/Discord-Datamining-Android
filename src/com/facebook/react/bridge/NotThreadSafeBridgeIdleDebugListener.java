package com.facebook.react.bridge;

/* loaded from: classes7.dex */
public interface NotThreadSafeBridgeIdleDebugListener {
    void onBridgeDestroyed();

    void onTransitionToBridgeBusy();

    void onTransitionToBridgeIdle();
}
