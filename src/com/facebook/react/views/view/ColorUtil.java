package com.facebook.react.views.view;

/* loaded from: classes7.dex */
public class ColorUtil {
    private static int clamp255(double d) {
        return Math.max(0, Math.min(255, (int) Math.round(d)));
    }

    public static int getOpacityFromColor(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static int multiplyColorAlpha(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static int normalize(double d, double d2, double d3, double d4) {
        return (clamp255(d) << 16) | (clamp255(d4 * 255.0d) << 24) | (clamp255(d2) << 8) | clamp255(d3);
    }
}
