package com.discord.image.color_quantizer;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseIntArray;
import com.discord.image.color_quantizer.ColorCutQuantizer;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u00060\u0017R\u00020\u00000\u0016H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0002J\"\u0010\"\u001a\u00020\u00192\u0010\u0010#\u001a\f\u0012\b\u0012\u00060\u0017R\u00020\u00000$2\u0006\u0010%\u001a\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m15073d2 = {"Lcom/discord/image/color_quantizer/ColorCutQuantizer;", "", "colorHistogram", "Lcom/discord/image/color_quantizer/ColorHistogram;", "maxColors", "", "(Lcom/discord/image/color_quantizer/ColorHistogram;I)V", "mColorPopulations", "Landroid/util/SparseIntArray;", "mColors", "", "mQuantizedColors", "", "Lcom/discord/image/color_quantizer/Swatch;", "mTempHsl", "", "quantizedColors", "", "getQuantizedColors", "()Ljava/util/List;", "generateAverageColors", "vboxes", "", "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;", "modifySignificantOctet", "", "dimension", "lowIndex", "highIndex", "quantizePixels", "maxColorIndex", "shouldIgnoreColor", "", ViewProps.COLOR, "splitBoxes", "queue", "Ljava/util/PriorityQueue;", "maxSize", "Companion", "Vbox", "color_quantizer_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ColorCutQuantizer {
    private static final float BLACK_MAX_LIGHTNESS = 0.05f;
    private static final int COMPONENT_BLUE = -1;
    private static final int COMPONENT_GREEN = -2;
    private static final int COMPONENT_RED = -3;
    public static final Companion Companion = new Companion(null);
    private static final Comparator<Vbox> VBOX_COMPARATOR_VOLUME = new Comparator() { // from class: com.discord.image.color_quantizer.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int VBOX_COMPARATOR_VOLUME$lambda$2;
            VBOX_COMPARATOR_VOLUME$lambda$2 = ColorCutQuantizer.VBOX_COMPARATOR_VOLUME$lambda$2((ColorCutQuantizer.Vbox) obj, (ColorCutQuantizer.Vbox) obj2);
            return VBOX_COMPARATOR_VOLUME$lambda$2;
        }
    };
    private static final float WHITE_MIN_LIGHTNESS = 0.95f;
    private final SparseIntArray mColorPopulations;
    private final int[] mColors;
    private final List<Swatch> mQuantizedColors;
    private final float[] mTempHsl;

    @Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u000bR\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m15073d2 = {"Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;", "", "()V", "BLACK_MAX_LIGHTNESS", "", "COMPONENT_BLUE", "", "COMPONENT_GREEN", "COMPONENT_RED", "VBOX_COMPARATOR_VOLUME", "Ljava/util/Comparator;", "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;", "Lcom/discord/image/color_quantizer/ColorCutQuantizer;", "WHITE_MIN_LIGHTNESS", "fromBitmap", "bitmap", "Landroid/graphics/Bitmap;", "maxColors", "isBlack", "", "hslColor", "", "isNearRedILine", "isWhite", "shouldIgnoreColor", ViewProps.COLOR, "Lcom/discord/image/color_quantizer/Swatch;", "color_quantizer_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isBlack(float[] fArr) {
            return fArr[2] <= ColorCutQuantizer.BLACK_MAX_LIGHTNESS;
        }

        private final boolean isNearRedILine(float[] fArr) {
            float f = fArr[0];
            return ((10.0f > f ? 1 : (10.0f == f ? 0 : -1)) <= 0 && (f > 37.0f ? 1 : (f == 37.0f ? 0 : -1)) <= 0) && fArr[1] <= 0.82f;
        }

        private final boolean isWhite(float[] fArr) {
            return fArr[2] >= ColorCutQuantizer.WHITE_MIN_LIGHTNESS;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldIgnoreColor(Swatch swatch) {
            float[] hsl = swatch.getHsl();
            C9677q.m14634f(hsl, "color.hsl");
            return shouldIgnoreColor(hsl);
        }

        public final ColorCutQuantizer fromBitmap(Bitmap bitmap, int i) {
            C9677q.m14633g(bitmap, "bitmap");
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            return new ColorCutQuantizer(new ColorHistogram(iArr), i, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldIgnoreColor(float[] fArr) {
            return isWhite(fArr) || isBlack(fArr) || isNearRedILine(fArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003J\n\u0010\u001e\u001a\u00060\u0000R\u00020\u001fR\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f¨\u0006 "}, m15073d2 = {"Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;", "", "lowerIndex", "", "upperIndex", "(Lcom/discord/image/color_quantizer/ColorCutQuantizer;II)V", "averageColor", "Lcom/discord/image/color_quantizer/Swatch;", "getAverageColor", "()Lcom/discord/image/color_quantizer/Swatch;", "colorCount", "getColorCount", "()I", "longestColorDimension", "getLongestColorDimension", "maxBlue", "maxGreen", "maxRed", "minBlue", "minGreen", "minRed", "volume", "getVolume", "canSplit", "", "findSplitPoint", "fitBox", "", "midPoint", "dimension", "splitBox", "Lcom/discord/image/color_quantizer/ColorCutQuantizer;", "color_quantizer_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public final class Vbox {
        private final int lowerIndex;
        private int maxBlue;
        private int maxGreen;
        private int maxRed;
        private int minBlue;
        private int minGreen;
        private int minRed;
        private int upperIndex;

        public Vbox(int i, int i2) {
            this.lowerIndex = i;
            this.upperIndex = i2;
            fitBox();
        }

        public final boolean canSplit() {
            return getColorCount() > 1;
        }

        public final int findSplitPoint() {
            int longestColorDimension = getLongestColorDimension();
            ColorCutQuantizer.this.modifySignificantOctet(longestColorDimension, this.lowerIndex, this.upperIndex);
            Arrays.sort(ColorCutQuantizer.this.mColors, this.lowerIndex, this.upperIndex + 1);
            ColorCutQuantizer.this.modifySignificantOctet(longestColorDimension, this.lowerIndex, this.upperIndex);
            int midPoint = midPoint(longestColorDimension);
            int i = this.upperIndex;
            for (int i2 = this.lowerIndex; i2 < i; i2++) {
                int i3 = ColorCutQuantizer.this.mColors[i2];
                if (longestColorDimension != ColorCutQuantizer.COMPONENT_RED) {
                    if (longestColorDimension != ColorCutQuantizer.COMPONENT_GREEN) {
                        if (longestColorDimension == -1 && Color.blue(i3) > midPoint) {
                            return i2;
                        }
                    } else if (Color.green(i3) >= midPoint) {
                        return i2;
                    }
                } else if (Color.red(i3) >= midPoint) {
                    return i2;
                }
            }
            return this.lowerIndex;
        }

        public final void fitBox() {
            this.minBlue = 255;
            this.minGreen = 255;
            this.minRed = 255;
            this.maxBlue = 0;
            this.maxGreen = 0;
            this.maxRed = 0;
            int i = this.lowerIndex;
            int i2 = this.upperIndex;
            if (i <= i2) {
                while (true) {
                    int i3 = ColorCutQuantizer.this.mColors[i];
                    int red = Color.red(i3);
                    int green = Color.green(i3);
                    int blue = Color.blue(i3);
                    if (red > this.maxRed) {
                        this.maxRed = red;
                    }
                    if (red < this.minRed) {
                        this.minRed = red;
                    }
                    if (green > this.maxGreen) {
                        this.maxGreen = green;
                    }
                    if (green < this.minGreen) {
                        this.minGreen = green;
                    }
                    if (blue > this.maxBlue) {
                        this.maxBlue = blue;
                    }
                    if (blue < this.minBlue) {
                        this.minBlue = blue;
                    }
                    if (i != i2) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public final Swatch getAverageColor() {
            int i;
            int i2;
            int i3;
            int i4 = this.lowerIndex;
            int i5 = this.upperIndex;
            int i6 = 0;
            if (i4 <= i5) {
                int i7 = 0;
                i2 = 0;
                i = 0;
                while (true) {
                    int i8 = ColorCutQuantizer.this.mColors[i4];
                    int i9 = ColorCutQuantizer.this.mColorPopulations.get(i8);
                    i6 += i9;
                    i7 += Color.red(i8) * i9;
                    i2 += Color.green(i8) * i9;
                    i += i9 * Color.blue(i8);
                    if (i4 == i5) {
                        break;
                    }
                    i4++;
                }
                i3 = i6;
                i6 = i7;
            } else {
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            float f = i6;
            float f2 = i3;
            return new Swatch(Math.round(f / f2), Math.round(i2 / f2), Math.round(i / f2), i3);
        }

        public final int getColorCount() {
            return this.upperIndex - this.lowerIndex;
        }

        public final int getLongestColorDimension() {
            int i = this.maxRed - this.minRed;
            int i2 = this.maxGreen - this.minGreen;
            int i3 = this.maxBlue - this.minBlue;
            if (i >= i2 && i >= i3) {
                return ColorCutQuantizer.COMPONENT_RED;
            }
            if (i2 < i || i2 < i3) {
                return -1;
            }
            return ColorCutQuantizer.COMPONENT_GREEN;
        }

        public final int getVolume() {
            return ((this.maxRed - this.minRed) + 1) * ((this.maxGreen - this.minGreen) + 1) * ((this.maxBlue - this.minBlue) + 1);
        }

        public final int midPoint(int i) {
            if (i == ColorCutQuantizer.COMPONENT_RED) {
                return (this.minRed + this.maxRed) / 2;
            }
            if (i == ColorCutQuantizer.COMPONENT_GREEN) {
                return (this.minGreen + this.maxGreen) / 2;
            }
            if (i != -1) {
                return (this.minRed + this.maxRed) / 2;
            }
            return (this.minBlue + this.maxBlue) / 2;
        }

        public final Vbox splitBox() {
            if (canSplit()) {
                int findSplitPoint = findSplitPoint();
                Vbox vbox = new Vbox(findSplitPoint + 1, this.upperIndex);
                this.upperIndex = findSplitPoint;
                fitBox();
                return vbox;
            }
            throw new IllegalStateException("Can not split a box with only 1 color".toString());
        }
    }

    private ColorCutQuantizer(ColorHistogram colorHistogram, int i) {
        boolean z;
        int[] iArr;
        this.mTempHsl = new float[3];
        if (colorHistogram != null) {
            if (i >= 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int numberOfColors = colorHistogram.getNumberOfColors();
                int[] colors = colorHistogram.getColors();
                int[] colorCounts = colorHistogram.getColorCounts();
                this.mColorPopulations = new SparseIntArray(numberOfColors);
                int length = colors.length;
                for (int i2 = 0; i2 < length; i2++) {
                    this.mColorPopulations.append(colors[i2], colorCounts[i2]);
                }
                this.mColors = new int[numberOfColors];
                int i3 = 0;
                for (int i4 : colors) {
                    if (!shouldIgnoreColor(i4)) {
                        this.mColors[i3] = i4;
                        i3++;
                    }
                }
                if (i3 <= i) {
                    this.mQuantizedColors = new ArrayList();
                    for (int i5 : this.mColors) {
                        this.mQuantizedColors.add(new Swatch(i5, this.mColorPopulations.get(i5)));
                    }
                    return;
                }
                this.mQuantizedColors = quantizePixels(i3 - 1, i);
                return;
            }
            throw new IllegalArgumentException("maxColors must be 1 or greater".toString());
        }
        throw new IllegalArgumentException("colorHistogram can not be null".toString());
    }

    public /* synthetic */ ColorCutQuantizer(ColorHistogram colorHistogram, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorHistogram, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int VBOX_COMPARATOR_VOLUME$lambda$2(Vbox vbox, Vbox vbox2) {
        return vbox2.getVolume() - vbox.getVolume();
    }

    public static final ColorCutQuantizer fromBitmap(Bitmap bitmap, int i) {
        return Companion.fromBitmap(bitmap, i);
    }

    private final List<Swatch> generateAverageColors(Collection<Vbox> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Vbox vbox : collection) {
            Swatch averageColor = vbox.getAverageColor();
            if (!Companion.shouldIgnoreColor(averageColor)) {
                arrayList.add(averageColor);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void modifySignificantOctet(int i, int i2, int i3) {
        if (i == COMPONENT_GREEN) {
            while (i2 <= i3) {
                int[] iArr = this.mColors;
                int i4 = iArr[i2];
                iArr[i2] = Color.rgb((i4 >> 8) & 255, (i4 >> 16) & 255, i4 & 255);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int[] iArr2 = this.mColors;
                int i5 = iArr2[i2];
                iArr2[i2] = Color.rgb(i5 & 255, (i5 >> 8) & 255, (i5 >> 16) & 255);
                i2++;
            }
        }
    }

    private final List<Swatch> quantizePixels(int i, int i2) {
        PriorityQueue<Vbox> priorityQueue = new PriorityQueue<>(i2, VBOX_COMPARATOR_VOLUME);
        priorityQueue.offer(new Vbox(0, i));
        splitBoxes(priorityQueue, i2);
        return generateAverageColors(priorityQueue);
    }

    private final boolean shouldIgnoreColor(int i) {
        int alpha = Color.alpha(i);
        ColorUtils.RGBtoHSL(Color.red(i), Color.green(i), Color.blue(i), this.mTempHsl);
        if (alpha < 250 || Companion.shouldIgnoreColor(this.mTempHsl)) {
            return true;
        }
        return false;
    }

    private final void splitBoxes(PriorityQueue<Vbox> priorityQueue, int i) {
        Vbox poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.canSplit()) {
            priorityQueue.offer(poll.splitBox());
            priorityQueue.offer(poll);
        }
    }

    public final List<Swatch> getQuantizedColors() {
        return this.mQuantizedColors;
    }
}
