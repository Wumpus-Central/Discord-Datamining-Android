package com.facebook.react.views.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.facebook.react.bridge.Callback;

/* loaded from: classes7.dex */
public class CustomLineHeightSpan implements LineHeightSpan, ReactSpan {
    public static Callback chooseHeightOverride;
    private final int mHeight;

    public CustomLineHeightSpan(float f) {
        this.mHeight = (int) Math.ceil(f);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Callback callback = chooseHeightOverride;
        if (callback != null) {
            callback.invoke(fontMetricsInt, Integer.valueOf(this.mHeight));
            return;
        }
        int i5 = fontMetricsInt.descent;
        int i6 = this.mHeight;
        if (i5 > i6) {
            int min = Math.min(i6, i5);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i7 = fontMetricsInt.ascent;
        if ((-i7) + i5 > i6) {
            fontMetricsInt.bottom = i5;
            int i8 = (-i6) + i5;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            return;
        }
        int i9 = fontMetricsInt.bottom;
        if ((-i7) + i9 > i6) {
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i7 + i6;
            return;
        }
        int i10 = fontMetricsInt.top;
        if ((-i10) + i9 > i6) {
            fontMetricsInt.top = i9 - i6;
            return;
        }
        double d = (i6 - ((-i10) + i9)) / 2.0f;
        fontMetricsInt.top = (int) (i10 - Math.ceil(d));
        int floor = (int) (fontMetricsInt.bottom + Math.floor(d));
        fontMetricsInt.bottom = floor;
        fontMetricsInt.ascent = fontMetricsInt.top;
        fontMetricsInt.descent = floor;
    }
}
