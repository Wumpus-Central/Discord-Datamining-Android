package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.AbstractC5013o0;
import com.facebook.imagepipeline.request.ImageRequest;

/* loaded from: classes7.dex */
public interface RequestListener extends AbstractC5013o0 {
    void onRequestCancellation(String str);

    void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z);

    void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z);

    void onRequestSuccess(ImageRequest imageRequest, String str, boolean z);
}
