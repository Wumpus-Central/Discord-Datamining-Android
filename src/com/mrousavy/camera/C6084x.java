package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/mrousavy/camera/x;", "Lcom/mrousavy/camera/a;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.x */
/* loaded from: classes6.dex */
public final class C6084x extends AbstractC6034a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6084x(Throwable cause) {
        super("device", "invalid-device", "The given Camera device could not be found for use-case binding!", cause);
        C9971q.m14633g(cause, "cause");
    }
}
