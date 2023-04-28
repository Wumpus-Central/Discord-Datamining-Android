package com.mrousavy.camera.frameprocessor;

import com.facebook.jni.HybridData;
import java.util.concurrent.ExecutorService;
import p078e6.AbstractC6709a;

/* loaded from: classes6.dex */
public class VisionCameraScheduler {

    /* renamed from: a */
    private final ExecutorService f12308a;
    @AbstractC6709a
    private final HybridData mHybridData = initHybrid();

    public VisionCameraScheduler(ExecutorService executorService) {
        this.f12308a = executorService;
    }

    private native HybridData initHybrid();

    @AbstractC6709a
    private void scheduleTrigger() {
        this.f12308a.submit(new Runnable() { // from class: com.mrousavy.camera.frameprocessor.d
            @Override // java.lang.Runnable
            public final void run() {
                VisionCameraScheduler.this.triggerUI();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void triggerUI();
}
