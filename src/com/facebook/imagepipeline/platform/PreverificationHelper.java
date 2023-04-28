package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.soloader.AbstractC5089e;

@AbstractC5089e
/* loaded from: classes7.dex */
class PreverificationHelper {
    /* JADX INFO: Access modifiers changed from: package-private */
    @AbstractC5089e
    @TargetApi(26)
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        Bitmap.Config config2;
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }
}
