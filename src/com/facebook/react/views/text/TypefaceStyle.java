package com.facebook.react.views.text;

import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes7.dex */
class TypefaceStyle {
    public static final int BOLD = 700;
    private static final int MAX_WEIGHT = 1000;
    private static final int MIN_WEIGHT = 1;
    public static final int NORMAL = 400;
    private final boolean mItalic;
    private final int mWeight;

    public TypefaceStyle(int i, boolean z) {
        this.mItalic = z;
        this.mWeight = i == -1 ? NORMAL : i;
    }

    public Typeface apply(Typeface typeface) {
        Typeface create;
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(typeface, getNearestStyle());
        }
        create = Typeface.create(typeface, this.mWeight, this.mItalic);
        return create;
    }

    public int getNearestStyle() {
        if (this.mWeight < 700) {
            if (this.mItalic) {
                return 2;
            }
            return 0;
        } else if (this.mItalic) {
            return 3;
        } else {
            return 1;
        }
    }

    public TypefaceStyle(int i) {
        boolean z = false;
        i = i == -1 ? 0 : i;
        this.mItalic = (i & 2) != 0 ? true : z;
        this.mWeight = (i & 1) != 0 ? BOLD : NORMAL;
    }

    public TypefaceStyle(int i, int i2) {
        boolean z = false;
        i = i == -1 ? 0 : i;
        this.mItalic = (i & 2) != 0 ? true : z;
        this.mWeight = i2 == -1 ? (i & 1) != 0 ? BOLD : NORMAL : i2;
    }
}
