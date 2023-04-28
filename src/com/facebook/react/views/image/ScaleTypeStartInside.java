package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.drawee.drawable.ScalingUtils;

/* loaded from: classes7.dex */
public class ScaleTypeStartInside extends ScalingUtils.AbstractC4797a {
    public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeStartInside();

    @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
    public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(Math.min(f3, f4), 1.0f);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
    }

    public String toString() {
        return "start_inside";
    }
}
