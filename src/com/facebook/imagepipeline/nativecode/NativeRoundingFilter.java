package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p394w3.AbstractC13731d;
import p394w3.C13740j;

@AbstractC13731d
/* loaded from: classes7.dex */
public class NativeRoundingFilter {
    static {
        C4933e.m31251a();
    }

    @AbstractC13731d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @AbstractC13731d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @AbstractC13731d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @AbstractC13731d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @AbstractC13731d
    public static void toCircle(Bitmap bitmap, boolean z) {
        C13740j.m2834g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z);
        }
    }

    @AbstractC13731d
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        C13740j.m2834g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z);
        }
    }
}
