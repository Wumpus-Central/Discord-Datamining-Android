package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007Jh\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/span/utilities/spannable/OrderedListBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "listItemIndex", "", "largestListItemIndex", "trailingMargin", "", "(JJI)V", "largestBulletContentWidth", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "x", "dir", ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class OrderedListBulletSpan implements LeadingMarginSpan {
    private int largestBulletContentWidth;
    private final long largestListItemIndex;
    private final long listItemIndex;
    private final int trailingMargin;

    public OrderedListBulletSpan(long j10, long j11, int i10) {
        this.listItemIndex = j10;
        this.largestListItemIndex = j11;
        this.trailingMargin = i10;
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
            this.largestBulletContentWidth = (int) paint.measureText(this.largestListItemIndex + ".");
            String str = this.listItemIndex + ".";
            canvas.drawText(str, i10 + (this.largestBulletContentWidth - paint.measureText(str)), i13, paint);
            paint.setFontFeatureSettings(fontFeatureSettings);
        }
    }

    @Override 
    public int getLeadingMargin(boolean z10) {
        return this.largestBulletContentWidth + this.trailingMargin;
    }
}
