package com.mrousavy.camera.frameprocessor;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import androidx.camera.core.ImageProxy;
import p078e6.AbstractC6709a;

@AbstractC6709a
@Keep
/* loaded from: classes6.dex */
public class ImageProxyUtils {
    @AbstractC6709a
    @Keep
    public static int getBytesPerRow(ImageProxy imageProxy) {
        return imageProxy.mo39701d0()[0].mo39900d();
    }

    @AbstractC6709a
    @Keep
    public static int getPlanesCount(ImageProxy imageProxy) {
        return imageProxy.mo39701d0().length;
    }

    @AbstractC6709a
    @Keep
    @SuppressLint({"UnsafeOptInUsageError"})
    public static boolean isImageProxyValid(ImageProxy imageProxy) {
        try {
            if (imageProxy.mo39699r0() == null) {
                return false;
            }
            imageProxy.mo39699r0().getCropRect();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
