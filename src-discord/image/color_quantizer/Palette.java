package com.discord.image.color_quantizer;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
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

    private static void checkNumberColorsParam(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("numColors must be 1 of greater");
        }
    }

    private static float[] copyHslValues(Swatch swatch) {
        float[] fArr = new float[3];
        System.arraycopy(swatch.getHsl(), 0, fArr, 0, 3);
        return fArr;
    }

    private static float createComparisonValue(float f10, float f11, float f12, float f13, int i10, int i11) {
        return weightedMean(invertDiff(f10, f11), 3.0f, invertDiff(f12, f13), 6.5f, i10 / i11, TARGET_NORMAL_LUMA);
    }

    private Swatch findColor(float f10, float f11, float f12, float f13, float f14, float f15) {
        Swatch swatch = null;
        float f16 = 0.0f;
        for (Swatch swatch2 : this.mSwatches) {
            float f17 = swatch2.getHsl()[1];
            float f18 = swatch2.getHsl()[2];
            if (f17 >= f14 && f17 <= f15 && f18 >= f11 && f18 <= f12 && !isAlreadySelected(swatch2)) {
                float createComparisonValue = createComparisonValue(f17, f13, f18, f10, swatch2.getPopulation(), this.mHighestPopulation);
                if (swatch == null || createComparisonValue > f16) {
                    swatch = swatch2;
                    f16 = createComparisonValue;
                }
            }
        }
        return swatch;
    }

    private int findMaxPopulation() {
        int i10 = 0;
        for (Swatch swatch : this.mSwatches) {
            i10 = Math.max(i10, swatch.getPopulation());
        }
        return i10;
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

    private static float invertDiff(float f10, float f11) {
        return TARGET_VIBRANT_SATURATION - Math.abs(f10 - f11);
    }

    private boolean isAlreadySelected(Swatch swatch) {
        return this.mVibrantSwatch == swatch || this.mDarkVibrantSwatch == swatch || this.mLightVibrantSwatch == swatch || this.mMutedSwatch == swatch || this.mDarkMutedSwatch == swatch || this.mLightMutedColor == swatch;
    }

    private static Bitmap scaleBitmapDown(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (min <= 100) {
            return bitmap;
        }
        float f10 = 100.0f / min;
        return Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * f10), Math.round(bitmap.getHeight() * f10), false);
    }

    private static float weightedMean(float... fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < fArr.length; i10 += 2) {
            float f12 = fArr[i10];
            float f13 = fArr[i10 + 1];
            f10 += f12 * f13;
            f11 += f13;
        }
        return f10 / f11;
    }

    public int getDarkMutedColor(int i10) {
        Swatch swatch = this.mDarkMutedSwatch;
        return swatch != null ? swatch.getRgb() : i10;
    }

    public Swatch getDarkMutedSwatch() {
        return this.mDarkMutedSwatch;
    }

    public int getDarkVibrantColor(int i10) {
        Swatch swatch = this.mDarkVibrantSwatch;
        return swatch != null ? swatch.getRgb() : i10;
    }

    public Swatch getDarkVibrantSwatch() {
        return this.mDarkVibrantSwatch;
    }

    public int getLightMutedColor(int i10) {
        Swatch swatch = this.mLightMutedColor;
        return swatch != null ? swatch.getRgb() : i10;
    }

    public Swatch getLightMutedSwatch() {
        return this.mLightMutedColor;
    }

    public int getLightVibrantColor(int i10) {
        Swatch swatch = this.mLightVibrantSwatch;
        return swatch != null ? swatch.getRgb() : i10;
    }

    public Swatch getLightVibrantSwatch() {
        return this.mLightVibrantSwatch;
    }

    public int getMutedColor(int i10) {
        Swatch swatch = this.mMutedSwatch;
        return swatch != null ? swatch.getRgb() : i10;
    }

    public Swatch getMutedSwatch() {
        return this.mMutedSwatch;
    }

    public List<Swatch> getSwatches() {
        return Collections.unmodifiableList(this.mSwatches);
    }

    public int getVibrantColor(int i10) {
        Swatch swatch = this.mVibrantSwatch;
        return swatch != null ? swatch.getRgb() : i10;
    }

    public Swatch getVibrantSwatch() {
        return this.mVibrantSwatch;
    }

    public static Palette generate(Bitmap bitmap, int i10) {
        checkBitmapParam(bitmap);
        checkNumberColorsParam(i10);
        Bitmap scaleBitmapDown = scaleBitmapDown(bitmap);
        ColorCutQuantizer fromBitmap = ColorCutQuantizer.fromBitmap(scaleBitmapDown, i10);
        if (scaleBitmapDown != bitmap) {
            scaleBitmapDown.recycle();
        }
        return new Palette(fromBitmap.getQuantizedColors());
    }
}
