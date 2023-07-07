package com.discord.image.color_quantizer;

import android.graphics.Color;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Swatch {
    final int mBlue;
    final int mGreen;
    private float[] mHsl;
    final int mPopulation;
    final int mRed;
    final int mRgb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Swatch(int i10, int i11) {
        this.mRed = Color.red(i10);
        this.mGreen = Color.green(i10);
        this.mBlue = Color.blue(i10);
        this.mRgb = i10;
        this.mPopulation = i11;
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
    public Swatch(int i10, int i11, int i12, int i13) {
        this.mRed = i10;
        this.mGreen = i11;
        this.mBlue = i12;
        this.mRgb = Color.rgb(i10, i11, i12);
        this.mPopulation = i13;
    }
}
