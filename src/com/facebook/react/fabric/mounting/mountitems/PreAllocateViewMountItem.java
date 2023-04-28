package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.StateWrapper;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class PreAllocateViewMountItem implements MountItem {
    private final String mComponent;
    private final EventEmitterWrapper mEventEmitterWrapper;
    private final boolean mIsLayoutable;
    private final Object mProps;
    private final int mReactTag;
    private final StateWrapper mStateWrapper;
    private final int mSurfaceId;

    public PreAllocateViewMountItem(int i, int i2, String str, Object obj, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        this.mComponent = str;
        this.mSurfaceId = i;
        this.mProps = obj;
        this.mStateWrapper = stateWrapper;
        this.mEventEmitterWrapper = eventEmitterWrapper;
        this.mReactTag = i2;
        this.mIsLayoutable = z;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            String str = FabricUIManager.TAG;
            C13925a.m2288j(str, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.mSurfaceId + "]");
            return;
        }
        surfaceManager.preallocateView(this.mComponent, this.mReactTag, this.mProps, this.mStateWrapper, this.mEventEmitterWrapper, this.mIsLayoutable);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public String toString() {
        return "PreAllocateViewMountItem [" + this.mReactTag + "] - component: " + this.mComponent + " surfaceId: " + this.mSurfaceId + " isLayoutable: " + this.mIsLayoutable;
    }
}
