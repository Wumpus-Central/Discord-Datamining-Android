package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/mrousavy/camera/k0;", "Lcom/mrousavy/camera/a;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.k0 */
/* loaded from: classes6.dex */
public final class C6060k0 extends AbstractC6034a {
    public C6060k0(Throwable th2) {
        super("capture", "encoder-error", "The recording failed while encoding.\nThis error may be generated when the video or audio codec encounters an error during encoding. When this happens and the output file is generated, the output file is not properly constructed. The application will need to clean up the output file, such as deleting the file.", th2);
    }
}
