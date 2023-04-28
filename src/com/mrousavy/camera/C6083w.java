package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/mrousavy/camera/w;", "Lcom/mrousavy/camera/a;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.w */
/* loaded from: classes6.dex */
public final class C6083w extends AbstractC6034a {
    public C6083w(Throwable th2) {
        super("capture", "insufficient-storage", "The recording failed due to insufficient storage space.\nThere are two possible cases that will cause this error.\n1. The storage is already full before the recording starts, so no output file will be generated.\n2. The storage becomes full during recording, so the output file will be generated.", th2);
    }
}
