package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public class AspectRatioMeasure {

    /* loaded from: classes7.dex */
    public static class Spec {

        /* renamed from: a */
        public int f7849a;

        /* renamed from: b */
        public int f7850b;
    }

    /* renamed from: a */
    private static boolean m31673a(int i) {
        return i == 0 || i == -2;
    }

    /* renamed from: b */
    public static void m31672b(Spec spec, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f > 0.0f && layoutParams != null) {
            if (m31673a(layoutParams.height)) {
                spec.f7850b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(spec.f7849a) - i) / f) + i2), spec.f7850b), 1073741824);
            } else if (m31673a(layoutParams.width)) {
                spec.f7849a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(spec.f7850b) - i2) * f) + i), spec.f7849a), 1073741824);
            }
        }
    }
}
