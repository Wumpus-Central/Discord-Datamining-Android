package com.discord.image;

import android.graphics.Bitmap;
import androidx.core.graphics.a;
import com.discord.image.color_quantizer.ColorCutQuantizer;
import com.discord.image.color_quantizer.Swatch;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"Lcom/discord/image/DominantColor;", "", "()V", "getPrimaryColorsForBitmap", "", "", "bitmap", "Landroid/graphics/Bitmap;", "getRepresentativeColors", "NoSwatchesFoundException", "color_quantizer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DominantColor {
    public static final DominantColor INSTANCE = new DominantColor();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/image/DominantColor$NoSwatchesFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "color_quantizer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NoSwatchesFoundException extends RuntimeException {
    }

    private DominantColor() {
    }

    private final List<Integer> getPrimaryColorsForBitmap(Bitmap bitmap) {
        int s10;
        List<Swatch> quantizedColors = ColorCutQuantizer.Companion.fromBitmap(bitmap, 5).getQuantizedColors();
        if (!quantizedColors.isEmpty()) {
            s10 = k.s(quantizedColors, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (Swatch swatch : quantizedColors) {
                arrayList.add(Integer.valueOf(swatch.getRgb()));
            }
            return arrayList;
        }
        throw new NoSwatchesFoundException();
    }

    public final List<Integer> getRepresentativeColors(Bitmap bitmap) {
        int s10;
        q.g(bitmap, "bitmap");
        try {
            List<Integer> primaryColorsForBitmap = getPrimaryColorsForBitmap(bitmap);
            if (primaryColorsForBitmap.isEmpty()) {
                return null;
            }
            s10 = k.s(primaryColorsForBitmap, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (Number number : primaryColorsForBitmap) {
                arrayList.add(Integer.valueOf(a.k(number.intValue(), 255)));
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }
}
