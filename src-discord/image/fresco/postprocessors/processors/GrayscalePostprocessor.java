package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.BasePostprocessor;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import q2.h;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GrayscalePostprocessor;", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "()V", "getName", "", "getPostprocessorCacheKey", "Lcom/facebook/cache/common/CacheKey;", "process", "", "destBitmap", "Landroid/graphics/Bitmap;", "sourceBitmap", "fresco_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GrayscalePostprocessor extends BasePostprocessor {
    public static final GrayscalePostprocessor INSTANCE = new GrayscalePostprocessor();

    private GrayscalePostprocessor() {
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        String simpleName = GrayscalePostprocessor.class.getSimpleName();
        q.f(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        return new h(getName());
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap destBitmap, Bitmap sourceBitmap) {
        q.g(destBitmap, "destBitmap");
        q.g(sourceBitmap, "sourceBitmap");
        super.process(destBitmap, sourceBitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        new Canvas(destBitmap).drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
    }
}
