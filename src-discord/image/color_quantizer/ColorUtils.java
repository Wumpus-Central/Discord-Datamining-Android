package com.discord.image.color_quantizer;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import yg.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/discord/image/color_quantizer/ColorUtils;", "", "()V", "HSLtoRGB", "", "hsl", "", "RGBtoHSL", "", "r", "g", "b", "color_quantizer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ColorUtils {
    public static final ColorUtils INSTANCE = new ColorUtils();

    private ColorUtils() {
    }

    public static final int HSLtoRGB(float[] hsl) {
        int i10;
        int i11;
        int i12;
        int i13;
        q.g(hsl, "hsl");
        float f10 = hsl[0];
        float f11 = hsl[1];
        float f12 = hsl[2];
        float abs = (1.0f - Math.abs((2 * f12) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f10) / 60) {
            case 0:
                i12 = c.b((abs + f13) * 255.0f);
                i11 = c.b((abs2 + f13) * 255.0f);
                i10 = c.b(f13 * 255.0f);
                break;
            case 1:
                i12 = c.b((abs2 + f13) * 255.0f);
                i11 = c.b((abs + f13) * 255.0f);
                i10 = c.b(f13 * 255.0f);
                break;
            case 2:
                i12 = c.b(f13 * 255.0f);
                i11 = c.b((abs + f13) * 255.0f);
                i10 = c.b((abs2 + f13) * 255.0f);
                break;
            case 3:
                i12 = c.b(f13 * 255.0f);
                i13 = c.b((abs2 + f13) * 255.0f);
                i10 = c.b((abs + f13) * 255.0f);
                i11 = i13;
                break;
            case 4:
                i12 = c.b((abs2 + f13) * 255.0f);
                i13 = c.b(f13 * 255.0f);
                i10 = c.b((abs + f13) * 255.0f);
                i11 = i13;
                break;
            case 5:
            case 6:
                i12 = c.b((abs + f13) * 255.0f);
                i11 = c.b(f13 * 255.0f);
                i10 = c.b((abs2 + f13) * 255.0f);
                break;
            default:
                i10 = 0;
                i12 = 0;
                i11 = 0;
                break;
        }
        return Color.rgb(Math.max(0, Math.min(255, i12)), Math.max(0, Math.min(255, i11)), Math.max(0, Math.min(255, i10)));
    }

    public static final void RGBtoHSL(int i10, int i11, int i12, float[] hsl) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        boolean z12;
        q.g(hsl, "hsl");
        float f12 = i10 / 255.0f;
        float f13 = i11 / 255.0f;
        float f14 = i12 / 255.0f;
        float max = Math.max(f12, Math.max(f13, f14));
        float min = Math.min(f12, Math.min(f13, f14));
        float f15 = max - min;
        float f16 = (max + min) / 2.0f;
        if (max == min) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            if (max == f12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f11 = ((f13 - f14) / f15) % 6.0f;
            } else {
                if (max == f13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f11 = ((f14 - f12) / f15) + 2.0f;
                } else {
                    f11 = ((f12 - f13) / f15) + 4.0f;
                }
            }
            f10 = f15 / (1.0f - Math.abs((2.0f * f16) - 1.0f));
        }
        hsl[0] = (f11 * 60.0f) % 360.0f;
        hsl[1] = f10;
        hsl[2] = f16;
    }
}
