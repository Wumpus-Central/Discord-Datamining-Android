package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import p292q3.C11988h;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public class IterativeBoxBlurPostProcessor extends BasePostprocessor {

    /* renamed from: a */
    private final int f8363a;

    /* renamed from: b */
    private final int f8364b;

    /* renamed from: c */
    private CacheKey f8365c;

    public IterativeBoxBlurPostProcessor(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        C13740j.m2839b(Boolean.valueOf(i2 <= 0 ? false : z2));
        this.f8363a = i;
        this.f8364b = i2;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        if (this.f8365c == null) {
            this.f8365c = new C11988h(String.format(null, "i%dr%d", Integer.valueOf(this.f8363a), Integer.valueOf(this.f8364b)));
        }
        return this.f8365c;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        NativeBlurFilter.m31262a(bitmap, this.f8363a, this.f8364b);
    }
}
