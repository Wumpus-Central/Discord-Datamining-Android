package com.discord.image.color_quantizer;

import com.p046BV.LinearGradient.LinearGradientManager;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/image/color_quantizer/ColorHistogram;", "", "pixels", "", "([I)V", "colorCounts", "getColorCounts", "()[I", LinearGradientManager.PROP_COLORS, "getColors", "numberOfColors", "", "getNumberOfColors", "()I", "countFrequencies", "", "Companion", "color_quantizer_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ColorHistogram {
    public static final Companion Companion = new Companion(null);
    private final int[] colorCounts;
    private final int[] colors;
    private final int numberOfColors;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/image/color_quantizer/ColorHistogram$Companion;", "", "()V", "countDistinctColors", "", "pixels", "", "color_quantizer_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int countDistinctColors(int[] iArr) {
            if (iArr.length < 2) {
                return iArr.length;
            }
            int i = iArr[0];
            int length = iArr.length;
            int i2 = 1;
            for (int i3 = 1; i3 < length; i3++) {
                int i4 = iArr[i3];
                if (i4 != i) {
                    i2++;
                    i = i4;
                }
            }
            return i2;
        }
    }

    public ColorHistogram(int[] pixels) {
        C9971q.m14633g(pixels, "pixels");
        Arrays.sort(pixels);
        int countDistinctColors = Companion.countDistinctColors(pixels);
        this.numberOfColors = countDistinctColors;
        this.colors = new int[countDistinctColors];
        this.colorCounts = new int[countDistinctColors];
        countFrequencies(pixels);
    }

    private final void countFrequencies(int[] iArr) {
        boolean z;
        int i = 0;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i2 = iArr[0];
            this.colors[0] = i2;
            this.colorCounts[0] = 1;
            if (iArr.length != 1) {
                int length = iArr.length;
                for (int i3 = 1; i3 < length; i3++) {
                    int i4 = iArr[i3];
                    if (i4 == i2) {
                        int[] iArr2 = this.colorCounts;
                        iArr2[i] = iArr2[i] + 1;
                    } else {
                        i++;
                        this.colors[i] = i4;
                        this.colorCounts[i] = 1;
                        i2 = i4;
                    }
                }
            }
        }
    }

    public final int[] getColorCounts() {
        return this.colorCounts;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final int getNumberOfColors() {
        return this.numberOfColors;
    }
}
