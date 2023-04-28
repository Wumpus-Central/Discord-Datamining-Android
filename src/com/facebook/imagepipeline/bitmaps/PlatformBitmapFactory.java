package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;

/* loaded from: classes7.dex */
public abstract class PlatformBitmapFactory {
    /* renamed from: a */
    public CloseableReference<Bitmap> m31511a(int i, int i2) {
        return m31510b(i, i2, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: b */
    public CloseableReference<Bitmap> m31510b(int i, int i2, Bitmap.Config config) {
        return m31509c(i, i2, config, null);
    }

    /* renamed from: c */
    public CloseableReference<Bitmap> m31509c(int i, int i2, Bitmap.Config config, Object obj) {
        return mo10504d(i, i2, config);
    }

    /* renamed from: d */
    public abstract CloseableReference<Bitmap> mo10504d(int i, int i2, Bitmap.Config config);
}
