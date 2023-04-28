package com.facebook.react.views.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes7.dex */
public class TextInlineViewPlaceholderSpan extends ReplacementSpan implements ReactSpan {
    private int mHeight;
    private int mReactTag;
    private int mWidth;

    public TextInlineViewPlaceholderSpan(int i, int i2, int i3) {
        this.mReactTag = i;
        this.mWidth = i2;
        this.mHeight = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getReactTag() {
        return this.mReactTag;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = -this.mHeight;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.mWidth;
    }

    public int getWidth() {
        return this.mWidth;
    }
}
