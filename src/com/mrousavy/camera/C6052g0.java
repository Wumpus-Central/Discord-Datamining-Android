package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/mrousavy/camera/g0;", "Lcom/mrousavy/camera/a;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.g0 */
/* loaded from: classes6.dex */
public final class C6052g0 extends AbstractC6034a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6052g0(Throwable cause) {
        super("device", "parallel-video-processing-not-supported", "The given LEGACY Camera device does not support parallel video processing (`video={true}` + `frameProcessor={...}`). Disable either `video` or `frameProcessor`. To find out if a device supports parallel video processing, check the `supportsParallelVideoProcessing` property on the CameraDevice. See https://mrousavy.github.io/react-native-vision-camera/docs/guides/devices#the-supportsparallelvideoprocessing-prop for more information.", cause);
        C9971q.m14633g(cause, "cause");
    }
}
