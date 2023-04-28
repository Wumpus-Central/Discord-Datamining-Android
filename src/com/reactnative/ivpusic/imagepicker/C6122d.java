package com.reactnative.ivpusic.imagepicker;

import android.graphics.Bitmap;

/* renamed from: com.reactnative.ivpusic.imagepicker.d */
/* loaded from: classes6.dex */
public class C6122d {
    /* renamed from: a */
    public static Bitmap.CompressFormat m26226a(String str) {
        if (str.equals("image/png")) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }
}
