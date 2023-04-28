package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.LineBackgroundSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ`\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m15073d2 = {"Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;", "Landroid/text/style/LineBackgroundSpan;", "fillColor", "", "strokeColor", "strokeWidth", "strokeRadius", "insetStart", "insetTop", "insetBottom", "(IIIIIII)V", "fillPaint", "Landroid/graphics/Paint;", "radius", "", "rect", "Landroid/graphics/RectF;", "strokePaint", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "paint", ViewProps.LEFT, ViewProps.RIGHT, ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "lnum", "span_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class BlockBackgroundSpan implements LineBackgroundSpan {
    private final Paint fillPaint;
    private final int insetBottom;
    private final int insetStart;
    private final int insetTop;
    private final float radius;
    private final RectF rect = new RectF();
    private final Paint strokePaint;

    public BlockBackgroundSpan(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.insetStart = i5;
        this.insetTop = i6;
        this.insetBottom = i7;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.fillPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(i2);
        paint2.setStrokeWidth(i3);
        paint2.setAntiAlias(true);
        this.strokePaint = paint2;
        this.radius = i4;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence text, int i6, int i7, int i8) {
        C9971q.m14633g(canvas, "canvas");
        C9971q.m14633g(paint, "paint");
        C9971q.m14633g(text, "text");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (spanned.getSpanStart(this) == i6) {
                RectF rectF = this.rect;
                rectF.left = i + this.insetStart;
                rectF.top = i3 + this.insetTop;
            }
            if (spanned.getSpanEnd(this) == i7) {
                RectF rectF2 = this.rect;
                rectF2.right = i2;
                rectF2.bottom = i5 - this.insetBottom;
                float f = this.radius;
                canvas.drawRoundRect(rectF2, f, f, this.fillPaint);
                RectF rectF3 = this.rect;
                float f2 = this.radius;
                canvas.drawRoundRect(rectF3, f2, f2, this.strokePaint);
            }
        }
    }
}
