package com.discord.image.color_quantizer;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
final class Palette {
    private static final int CALCULATE_BITMAP_MIN_DIMENSION = 100;
    private static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
    private static final float MAX_DARK_LUMA = 0.45f;
    private static final float MAX_MUTED_SATURATION = 0.4f;
    private static final float MAX_NORMAL_LUMA = 0.7f;
    private static final float MIN_LIGHT_LUMA = 0.55f;
    private static final float MIN_NORMAL_LUMA = 0.3f;
    private static final float MIN_VIBRANT_SATURATION = 0.35f;
    private static final float TARGET_DARK_LUMA = 0.26f;
    private static final float TARGET_LIGHT_LUMA = 0.74f;
    private static final float TARGET_MUTED_SATURATION = 0.3f;
    private static final float TARGET_NORMAL_LUMA = 0.5f;
    private static final float TARGET_VIBRANT_SATURATION = 1.0f;
    private final List<Swatch> mSwatches;
    private final int mHighestPopulation = findMaxPopulation();
    private Swatch mVibrantSwatch = findColor(TARGET_NORMAL_LUMA, 0.3f, MAX_NORMAL_LUMA, TARGET_VIBRANT_SATURATION, MIN_VIBRANT_SATURATION, TARGET_VIBRANT_SATURATION);
    private Swatch mLightVibrantSwatch = findColor(TARGET_LIGHT_LUMA, MIN_LIGHT_LUMA, TARGET_VIBRANT_SATURATION, TARGET_VIBRANT_SATURATION, MIN_VIBRANT_SATURATION, TARGET_VIBRANT_SATURATION);
    private Swatch mDarkVibrantSwatch = findColor(TARGET_DARK_LUMA, 0.0f, MAX_DARK_LUMA, TARGET_VIBRANT_SATURATION, MIN_VIBRANT_SATURATION, TARGET_VIBRANT_SATURATION);
    private Swatch mMutedSwatch = findColor(TARGET_NORMAL_LUMA, 0.3f, MAX_NORMAL_LUMA, 0.3f, 0.0f, MAX_MUTED_SATURATION);
    private Swatch mLightMutedColor = findColor(TARGET_LIGHT_LUMA, MIN_LIGHT_LUMA, TARGET_VIBRANT_SATURATION, 0.3f, 0.0f, MAX_MUTED_SATURATION);
    private Swatch mDarkMutedSwatch = findColor(TARGET_DARK_LUMA, 0.0f, MAX_DARK_LUMA, 0.3f, 0.0f, MAX_MUTED_SATURATION);

    private Palette(List<Swatch> list) {
        this.mSwatches = list;
        generateEmptySwatches();
    }

    private static void checkBitmapParam(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap can not be null");
        } else if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("bitmap can not be recycled");
        }
    }

    private static void checkNumberColorsParam(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("numColors must be 1 of greater");
        }
    }

    private static float[] copyHslValues(Swatch swatch) {
        float[] fArr = new float[3];
        System.arraycopy(swatch.getHsl(), 0, fArr, 0, 3);
        return fArr;
    }

    private static float createComparisonValue(float f, float f2, float f3, float f4, int i, int i2) {
        return weightedMean(invertDiff(f, f2), 3.0f, invertDiff(f3, f4), 6.5f, i / i2, TARGET_NORMAL_LUMA);
    }

    private Swatch findColor(float f, float f2, float f3, float f4, float f5, float f6) {
        Swatch swatch = null;
        float f7 = 0.0f;
        for (Swatch swatch2 : this.mSwatches) {
            float f8 = swatch2.getHsl()[1];
            float f9 = swatch2.getHsl()[2];
            if (f8 >= f5 && f8 <= f6 && f9 >= f2 && f9 <= f3 && !isAlreadySelected(swatch2)) {
                float createComparisonValue = createComparisonValue(f8, f4, f9, f, swatch2.getPopulation(), this.mHighestPopulation);
                if (swatch == null || createComparisonValue > f7) {
                    swatch = swatch2;
                    f7 = createComparisonValue;
                }
            }
        }
        return swatch;
    }

    private int findMaxPopulation() {
        int i = 0;
        for (Swatch swatch : this.mSwatches) {
            i = Math.max(i, swatch.getPopulation());
        }
        return i;
    }

    public static Palette generate(Bitmap bitmap) {
        return generate(bitmap, 16);
    }

    private void generateEmptySwatches() {
        Swatch swatch;
        Swatch swatch2;
        if (this.mVibrantSwatch == null && (swatch2 = this.mDarkVibrantSwatch) != null) {
            float[] copyHslValues = copyHslValues(swatch2);
            copyHslValues[2] = 0.5f;
            this.mVibrantSwatch = new Swatch(ColorUtils.HSLtoRGB(copyHslValues), 0);
        }
        if (this.mDarkVibrantSwatch == null && (swatch = this.mVibrantSwatch) != null) {
            float[] copyHslValues2 = copyHslValues(swatch);
            copyHslValues2[2] = 0.26f;
            this.mDarkVibrantSwatch = new Swatch(ColorUtils.HSLtoRGB(copyHslValues2), 0);
        }
    }

    private static float invertDiff(float f, float f2) {
        return TARGET_VIBRANT_SATURATION - Math.abs(f - f2);
    }

    private boolean isAlreadySelected(Swatch swatch) {
        return this.mVibrantSwatch == swatch || this.mDarkVibrantSwatch == swatch || this.mLightVibrantSwatch == swatch || this.mMutedSwatch == swatch || this.mDarkMutedSwatch == swatch || this.mLightMutedColor == swatch;
    }

    private static Bitmap scaleBitmapDown(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (min <= 100) {
            return bitmap;
        }
        float f = 100.0f / min;
        return Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * f), Math.round(bitmap.getHeight() * f), false);
    }

    private static float weightedMean(float... fArr) {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < fArr.length; i += 2) {
            float f3 = fArr[i];
            float f4 = fArr[i + 1];
            f += f3 * f4;
            f2 += f4;
        }
        return f / f2;
    }

    public int getDarkMutedColor(int i) {
        Swatch swatch = this.mDarkMutedSwatch;
        return swatch != null ? swatch.getRgb() : i;
    }

    public Swatch getDarkMutedSwatch() {
        return this.mDarkMutedSwatch;
    }

    public int getDarkVibrantColor(int i) {
        Swatch swatch = this.mDarkVibrantSwatch;
        return swatch != null ? swatch.getRgb() : i;
    }

    public Swatch getDarkVibrantSwatch() {
        return this.mDarkVibrantSwatch;
    }

    public int getLightMutedColor(int i) {
        Swatch swatch = this.mLightMutedColor;
        return swatch != null ? swatch.getRgb() : i;
    }

    public Swatch getLightMutedSwatch() {
        return this.mLightMutedColor;
    }

    public int getLightVibrantColor(int i) {
        Swatch swatch = this.mLightVibrantSwatch;
        return swatch != null ? swatch.getRgb() : i;
    }

    public Swatch getLightVibrantSwatch() {
        return this.mLightVibrantSwatch;
    }

    public int getMutedColor(int i) {
        Swatch swatch = this.mMutedSwatch;
        return swatch != null ? swatch.getRgb() : i;
    }

    public Swatch getMutedSwatch() {
        return this.mMutedSwatch;
    }

    public List<Swatch> getSwatches() {
        return Collections.unmodifiableList(this.mSwatches);
    }

    public int getVibrantColor(int i) {
        Swatch swatch = this.mVibrantSwatch;
        return swatch != null ? swatch.getRgb() : i;
    }

    public Swatch getVibrantSwatch() {
        return this.mVibrantSwatch;
    }

    public static Palette generate(Bitmap bitmap, int i) {
        checkBitmapParam(bitmap);
        checkNumberColorsParam(i);
        Bitmap scaleBitmapDown = scaleBitmapDown(bitmap);
        ColorCutQuantizer fromBitmap = ColorCutQuantizer.fromBitmap(scaleBitmapDown, i);
        if (scaleBitmapDown != bitmap) {
            scaleBitmapDown.recycle();
        }
        return new Palette(fromBitmap.getQuantizedColors());
    }
}
