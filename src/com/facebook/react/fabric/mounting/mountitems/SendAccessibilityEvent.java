package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.mounting.MountingManager;

/* loaded from: classes7.dex */
public class SendAccessibilityEvent implements MountItem {
    private final String TAG = "Fabric.SendAccessibilityEvent";
    private final int mEventType;
    private final int mReactTag;
    private final int mSurfaceId;

    public SendAccessibilityEvent(int i, int i2, int i3) {
        this.mSurfaceId = i;
        this.mReactTag = i2;
        this.mEventType = i3;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        try {
            mountingManager.sendAccessibilityEvent(this.mSurfaceId, this.mReactTag, this.mEventType);
        } catch (RetryableMountingLayerException e) {
            ReactSoftExceptionLogger.logSoftException("Fabric.SendAccessibilityEvent", e);
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public String toString() {
        return "SendAccessibilityEvent [" + this.mReactTag + "] " + this.mEventType;
    }
}
