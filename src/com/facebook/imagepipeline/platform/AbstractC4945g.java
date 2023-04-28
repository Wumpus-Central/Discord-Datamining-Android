package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import p380v5.C13434e;

/* renamed from: com.facebook.imagepipeline.platform.g */
/* loaded from: classes7.dex */
public interface AbstractC4945g {
    /* renamed from: a */
    CloseableReference<Bitmap> mo31229a(C13434e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace);

    /* renamed from: b */
    CloseableReference<Bitmap> mo31228b(C13434e eVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace);
}
