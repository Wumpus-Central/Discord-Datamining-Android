package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p394w3.AbstractC13731d;
import p394w3.C13740j;

@AbstractC13731d
/* loaded from: classes7.dex */
public class NativeBlurFilter {
    static {
        C4933e.m31251a();
    }

    /* renamed from: a */
    public static void m31262a(Bitmap bitmap, int i, int i2) {
        boolean z;
        C13740j.m2834g(bitmap);
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (i2 <= 0) {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @AbstractC13731d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
