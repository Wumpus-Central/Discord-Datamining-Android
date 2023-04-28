package com.discord.image.color_quantizer;

import android.graphics.Color;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class Swatch {
    final int mBlue;
    final int mGreen;
    private float[] mHsl;
    final int mPopulation;
    final int mRed;
    final int mRgb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Swatch(int i, int i2) {
        this.mRed = Color.red(i);
        this.mGreen = Color.green(i);
        this.mBlue = Color.blue(i);
        this.mRgb = i;
        this.mPopulation = i2;
    }

    public float[] getHsl() {
        if (this.mHsl == null) {
            float[] fArr = new float[3];
            this.mHsl = fArr;
            ColorUtils.RGBtoHSL(this.mRed, this.mGreen, this.mBlue, fArr);
        }
        return this.mHsl;
    }

    public int getPopulation() {
        return this.mPopulation;
    }

    public int getRgb() {
        return this.mRgb;
    }

    public String toString() {
        return Swatch.class.getSimpleName() + " [" + Integer.toHexString(getRgb()) + "][HSL: " + Arrays.toString(getHsl()) + "][Population: " + this.mPopulation + ']';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Swatch(int i, int i2, int i3, int i4) {
        this.mRed = i;
        this.mGreen = i2;
        this.mBlue = i3;
        this.mRgb = Color.rgb(i, i2, i3);
        this.mPopulation = i4;
    }
}
