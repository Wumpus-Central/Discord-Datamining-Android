package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002Jh\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0013\u0010\u0007\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/discord/span/utilities/spannable/QuoteSpan;", "Landroid/text/style/LeadingMarginSpan;", "stripeColor", "", "stripeWidth", "gapWidth", "(III)V", "insetStart", "getInsetStart", "()I", "radius", "", "rect", "Landroid/graphics/RectF;", "getStripeColor", "draw", "", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "drawLeadingMargin", "x", "dir", ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class QuoteSpan implements LeadingMarginSpan {
    private final int insetStart;
    private final float radius;
    private final RectF rect = new RectF();
    private final int stripeColor;
    private final int stripeWidth;

    public QuoteSpan(int i10, int i11, int i12) {
        this.stripeColor = i10;
        this.stripeWidth = i11;
        this.radius = i11 / 2.0f;
        this.insetStart = i11 + i12;
    }

    private final void draw(Canvas canvas, Paint paint) {
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.stripeColor);
        RectF rectF = this.rect;
        float f10 = this.radius;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override 
    public void drawLeadingMargin(Canvas c10, Paint p10, int i10, int i11, int i12, int i13, int i14, CharSequence text, int i15, int i16, boolean z10, Layout layout) {
        q.h(c10, "c");
        q.h(p10, "p");
        q.h(text, "text");
        q.h(layout, "layout");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (spanned.getSpanStart(this) == i15) {
                RectF rectF = this.rect;
                rectF.left = i10;
                rectF.right = i10 + (i11 * this.stripeWidth);
                rectF.top = i12;
            }
            int spanEnd = spanned.getSpanEnd(this);
            if (spanEnd == i16 || (spanEnd - 1 == i16 && text.charAt(i16) == '\n')) {
                this.rect.bottom = i14;
                draw(c10, p10);
            }
        }
    }

    public final int getInsetStart() {
        return this.insetStart;
    }

    @Override 
    public int getLeadingMargin(boolean z10) {
        return this.insetStart;
    }

    public final int getStripeColor() {
        return this.stripeColor;
    }
}
