package com.facebook.react.fabric.mounting.mountitems;

/* loaded from: classes7.dex */
public abstract class DispatchCommandMountItem implements MountItem {
    private int mNumRetries = 0;

    public int getRetries() {
        return this.mNumRetries;
    }

    public void incrementRetries() {
        this.mNumRetries++;
    }
}
