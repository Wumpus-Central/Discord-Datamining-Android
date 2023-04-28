package com.discord.image.color_quantizer;

import android.graphics.Color;
import bg.C2362c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\f"}, m15073d2 = {"Lcom/discord/image/color_quantizer/ColorUtils;", "", "()V", "HSLtoRGB", "", "hsl", "", "RGBtoHSL", "", "r", "g", "b", "color_quantizer_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ColorUtils {
    public static final ColorUtils INSTANCE = new ColorUtils();

    private ColorUtils() {
    }

    public static final int HSLtoRGB(float[] hsl) {
        int i;
        int i2;
        int i3;
        int i4;
        C9677q.m14633g(hsl, "hsl");
        float f = hsl[0];
        float f2 = hsl[1];
        float f3 = hsl[2];
        float abs = (1.0f - Math.abs((2 * f3) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i3 = C2362c.m34305a((abs + f4) * 255.0f);
                i2 = C2362c.m34305a((abs2 + f4) * 255.0f);
                i = C2362c.m34305a(f4 * 255.0f);
                break;
            case 1:
                i3 = C2362c.m34305a((abs2 + f4) * 255.0f);
                i2 = C2362c.m34305a((abs + f4) * 255.0f);
                i = C2362c.m34305a(f4 * 255.0f);
                break;
            case 2:
                i3 = C2362c.m34305a(f4 * 255.0f);
                i2 = C2362c.m34305a((abs + f4) * 255.0f);
                i = C2362c.m34305a((abs2 + f4) * 255.0f);
                break;
            case 3:
                i3 = C2362c.m34305a(f4 * 255.0f);
                i4 = C2362c.m34305a((abs2 + f4) * 255.0f);
                i = C2362c.m34305a((abs + f4) * 255.0f);
                i2 = i4;
                break;
            case 4:
                i3 = C2362c.m34305a((abs2 + f4) * 255.0f);
                i4 = C2362c.m34305a(f4 * 255.0f);
                i = C2362c.m34305a((abs + f4) * 255.0f);
                i2 = i4;
                break;
            case 5:
            case 6:
                i3 = C2362c.m34305a((abs + f4) * 255.0f);
                i2 = C2362c.m34305a(f4 * 255.0f);
                i = C2362c.m34305a((abs2 + f4) * 255.0f);
                break;
            default:
                i = 0;
                i3 = 0;
                i2 = 0;
                break;
        }
        return Color.rgb(Math.max(0, Math.min(255, i3)), Math.max(0, Math.min(255, i2)), Math.max(0, Math.min(255, i)));
    }

    public static final void RGBtoHSL(int i, int i2, int i3, float[] hsl) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        C9677q.m14633g(hsl, "hsl");
        float f3 = i / 255.0f;
        float f4 = i2 / 255.0f;
        float f5 = i3 / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            if (max == f3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f2 = ((f4 - f5) / f6) % 6.0f;
            } else {
                if (max == f4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f2 = ((f5 - f3) / f6) + 2.0f;
                } else {
                    f2 = ((f3 - f4) / f6) + 4.0f;
                }
            }
            f = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        hsl[0] = (f2 * 60.0f) % 360.0f;
        hsl[1] = f;
        hsl[2] = f7;
    }
}
