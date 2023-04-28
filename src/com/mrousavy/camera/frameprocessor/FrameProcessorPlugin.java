package com.mrousavy.camera.frameprocessor;

import androidx.annotation.Keep;
import androidx.camera.core.ImageProxy;
import p078e6.AbstractC6709a;

@AbstractC6709a
@Keep
/* loaded from: classes6.dex */
public abstract class FrameProcessorPlugin {
    private final String mName;

    protected FrameProcessorPlugin(String str) {
        this.mName = str;
    }

    public static void register(FrameProcessorPlugin frameProcessorPlugin) {
        FrameProcessorRuntimeManager.f12303c.m26391b().add(frameProcessorPlugin);
    }

    @AbstractC6709a
    @Keep
    public abstract Object callback(ImageProxy imageProxy, Object[] objArr);

    @AbstractC6709a
    @Keep
    public String getName() {
        return this.mName;
    }
}
