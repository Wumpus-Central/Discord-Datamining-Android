package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/mrousavy/camera/v;", "Lcom/mrousavy/camera/a;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.v */
/* loaded from: classes6.dex */
public final class C6082v extends AbstractC6034a {
    public C6082v(Throwable th2) {
        super("capture", "inactive-source", "The recording failed because the source becomes inactive and stops sending frames.\nOne case is that if camera is closed due to lifecycle stopped, the active recording will be finalized with this error, and the output will be generated, containing the frames produced before camera closing. Attempting to start a new recording will be finalized immediately if the source remains inactive and no output will be generated.", th2);
    }
}
