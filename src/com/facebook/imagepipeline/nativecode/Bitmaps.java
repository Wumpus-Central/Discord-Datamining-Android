package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p394w3.AbstractC13731d;
import p394w3.C13740j;

@AbstractC13731d
/* loaded from: classes7.dex */
public class Bitmaps {

    /* renamed from: a */
    public static final /* synthetic */ int f8341a = 0;

    static {
        C4932d.m31252a();
    }

    @AbstractC13731d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        C13740j.m2839b(Boolean.valueOf(bitmap.isMutable()));
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z3 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z3));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @AbstractC13731d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
