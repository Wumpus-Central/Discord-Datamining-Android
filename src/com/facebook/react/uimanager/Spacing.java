package com.facebook.react.uimanager;

import com.facebook.yoga.C5126d;
import java.util.Arrays;
import p163j$.util.Spliterator;

/* loaded from: classes7.dex */
public class Spacing {
    public static final int ALL = 8;
    public static final int BOTTOM = 3;
    public static final int END = 5;
    public static final int HORIZONTAL = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int START = 4;
    public static final int TOP = 1;
    public static final int VERTICAL = 7;
    private static final int[] sFlagsMap = {1, 2, 4, 8, 16, 32, 64, 128, Spliterator.NONNULL};
    private final float mDefaultValue;
    private boolean mHasAliasesSet;
    private final float[] mSpacing;
    private int mValueFlags;

    public Spacing() {
        this(0.0f);
    }

    private static float[] newFullSpacingArray() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public float get(int i) {
        float f;
        char c;
        if (i == 4 || i == 5) {
            f = Float.NaN;
        } else {
            f = this.mDefaultValue;
        }
        int i2 = this.mValueFlags;
        if (i2 == 0) {
            return f;
        }
        int[] iArr = sFlagsMap;
        if ((iArr[i] & i2) != 0) {
            return this.mSpacing[i];
        }
        if (this.mHasAliasesSet) {
            if (i == 1 || i == 3) {
                c = 7;
            } else {
                c = 6;
            }
            if ((iArr[c] & i2) != 0) {
                return this.mSpacing[c];
            }
            if ((i2 & iArr[8]) != 0) {
                return this.mSpacing[8];
            }
        }
        return f;
    }

    public float getRaw(int i) {
        return this.mSpacing[i];
    }

    float getWithFallback(int i, int i2) {
        return (this.mValueFlags & sFlagsMap[i]) != 0 ? this.mSpacing[i] : get(i2);
    }

    public void reset() {
        Arrays.fill(this.mSpacing, Float.NaN);
        this.mHasAliasesSet = false;
        this.mValueFlags = 0;
    }

    public boolean set(int i, float f) {
        boolean z = false;
        if (FloatUtil.floatsEqual(this.mSpacing[i], f)) {
            return false;
        }
        this.mSpacing[i] = f;
        if (C5126d.m30596a(f)) {
            this.mValueFlags = (~sFlagsMap[i]) & this.mValueFlags;
        } else {
            this.mValueFlags = sFlagsMap[i] | this.mValueFlags;
        }
        int i2 = this.mValueFlags;
        int[] iArr = sFlagsMap;
        if (!((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0)) {
            z = true;
        }
        this.mHasAliasesSet = z;
        return true;
    }

    public Spacing(float f) {
        this.mValueFlags = 0;
        this.mDefaultValue = f;
        this.mSpacing = newFullSpacingArray();
    }

    public Spacing(Spacing spacing) {
        this.mValueFlags = 0;
        this.mDefaultValue = spacing.mDefaultValue;
        float[] fArr = spacing.mSpacing;
        this.mSpacing = Arrays.copyOf(fArr, fArr.length);
        this.mValueFlags = spacing.mValueFlags;
        this.mHasAliasesSet = spacing.mHasAliasesSet;
    }
}
