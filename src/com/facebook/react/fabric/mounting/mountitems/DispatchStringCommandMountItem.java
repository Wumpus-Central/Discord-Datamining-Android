package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.mounting.MountingManager;

/* loaded from: classes7.dex */
public class DispatchStringCommandMountItem extends DispatchCommandMountItem {
    private final ReadableArray mCommandArgs;
    private final String mCommandId;
    private final int mReactTag;
    private final int mSurfaceId;

    public DispatchStringCommandMountItem(int i, int i2, String str, ReadableArray readableArray) {
        this.mSurfaceId = i;
        this.mReactTag = i2;
        this.mCommandId = str;
        this.mCommandArgs = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.receiveCommand(this.mSurfaceId, this.mReactTag, this.mCommandId, this.mCommandArgs);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public String toString() {
        return "DispatchStringCommandMountItem [" + this.mReactTag + "] " + this.mCommandId;
    }
}
