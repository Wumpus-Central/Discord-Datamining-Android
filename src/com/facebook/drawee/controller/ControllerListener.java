package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;

/* loaded from: classes7.dex */
public interface ControllerListener<INFO> {
    void onFailure(String str, Throwable th2);

    void onFinalImageSet(String str, INFO info, Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th2);

    void onIntermediateImageSet(String str, INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
