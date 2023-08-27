package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002Jh\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/discord/span/utilities/spannable/OrderedListBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "listItemIndex", "", "trailingMargin", "", "largestListItemIndex", "paint", "Landroid/graphics/Paint;", "(JIJLandroid/graphics/Paint;)V", "largestBulletContentWidth", "", "calculateBulletContentWidth", "bulletContent", "", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "x", "dir", ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class OrderedListBulletSpan implements LeadingMarginSpan {
    private final float largestBulletContentWidth;
    private final long listItemIndex;
    private final int trailingMargin;

    public OrderedListBulletSpan(long j10, int i10, long j11, Paint paint) {
        q.h(paint, "paint");
        this.listItemIndex = j10;
        this.trailingMargin = i10;
        this.largestBulletContentWidth = calculateBulletContentWidth(paint, j11 + ".");
    }

    private final float calculateBulletContentWidth(Paint paint, String str) {
        Paint paint2 = new Paint(paint);
        paint2.setFontFeatureSettings("tnum");
        return paint2.measureText(str);
    }

    @Override 
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence text, int i15, int i16, boolean z10, Layout layout) {
        q.h(canvas, "canvas");
        q.h(paint, "paint");
        q.h(text, "text");
        q.h(layout, "layout");
        if (((Spanned) text).getSpanStart(this) == i15) {
            String fontFeatureSettings = paint.getFontFeatureSettings();
            paint.setFontFeatureSettings("tnum");
            String str = this.listItemIndex + ".";
            canvas.drawText(str, i10 + (this.largestBulletContentWidth - calculateBulletContentWidth(paint, str)), i13, paint);
            paint.setFontFeatureSettings(fontFeatureSettings);
        }
    }

    @Override 
    public int getLeadingMargin(boolean z10) {
        return ((int) this.largestBulletContentWidth) + this.trailingMargin;
    }
}
