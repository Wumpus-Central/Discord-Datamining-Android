package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.imageutils.C5064a;
import p437y5.AbstractC14235h;

@TargetApi(26)
/* renamed from: com.facebook.imagepipeline.platform.f */
/* loaded from: classes7.dex */
public class C4944f extends AbstractC4940b {
    public C4944f(AbstractC14235h hVar, int i, Pools$SynchronizedPool pools$SynchronizedPool) {
        super(hVar, i, pools$SynchronizedPool);
    }

    /* renamed from: f */
    private static boolean m31230f(BitmapFactory.Options options) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        boolean isWideGamut;
        Bitmap.Config config;
        colorSpace = options.outColorSpace;
        if (colorSpace != null) {
            colorSpace2 = options.outColorSpace;
            isWideGamut = colorSpace2.isWideGamut();
            if (isWideGamut) {
                Bitmap.Config config2 = options.inPreferredConfig;
                config = Bitmap.Config.RGBA_F16;
                if (config2 != config) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.platform.AbstractC4940b
    /* renamed from: d */
    public int mo31231d(int i, int i2, BitmapFactory.Options options) {
        if (m31230f(options)) {
            return i * i2 * 8;
        }
        Bitmap.Config config = options.inPreferredConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return C5064a.m30860d(i, i2, config);
    }
}
