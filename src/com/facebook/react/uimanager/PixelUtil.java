package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes7.dex */
public class PixelUtil {
    public static float getDisplayMetricDensity() {
        return DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    public static float toDIPFromPixel(float f) {
        return f / DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    public static float toPixelFromDIP(float f) {
        return TypedValue.applyDimension(1, f, DisplayMetricsHolder.getWindowDisplayMetrics());
    }

    public static float toPixelFromSP(float f) {
        return toPixelFromSP(f, Float.NaN);
    }

    public static float toPixelFromSP(float f, float f2) {
        DisplayMetrics windowDisplayMetrics = DisplayMetricsHolder.getWindowDisplayMetrics();
        float f3 = windowDisplayMetrics.scaledDensity;
        float f4 = windowDisplayMetrics.density;
        float f5 = f3 / f4;
        if (f2 >= 1.0f && f2 < f5) {
            f3 = f4 * f2;
        }
        return f * f3;
    }

    public static float toPixelFromDIP(double d) {
        return toPixelFromDIP((float) d);
    }

    public static float toPixelFromSP(double d) {
        return toPixelFromSP((float) d);
    }
}
