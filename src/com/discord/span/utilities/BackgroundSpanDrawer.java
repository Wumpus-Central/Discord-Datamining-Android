package com.discord.span.utilities;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.SpannedString;
import android.text.style.LineBackgroundSpan;
import android.widget.TextView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.spannable.BackgroundSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J`\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m15073d2 = {"Lcom/discord/span/utilities/BackgroundSpanDrawer;", "Landroid/text/style/LineBackgroundSpan;", "provider", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", ViewProps.LEFT, "", ViewProps.RIGHT, ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "lineNumber", "span_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class BackgroundSpanDrawer implements LineBackgroundSpan {
    private final TextView provider;

    public BackgroundSpanDrawer(TextView provider) {
        C9677q.m14633g(provider, "provider");
        this.provider = provider;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence text, int i6, int i7, int i8) {
        boolean z;
        int i9;
        float f;
        int i10;
        C9677q.m14633g(canvas, "canvas");
        C9677q.m14633g(paint, "paint");
        C9677q.m14633g(text, "text");
        SpannedString valueOf = SpannedString.valueOf(text);
        C9677q.m14634f(valueOf, "valueOf(this)");
        BackgroundSpan[] backgroundSpans = (BackgroundSpan[]) valueOf.getSpans(0, text.length(), BackgroundSpan.class);
        Layout layout = this.provider.getLayout();
        C9677q.m14634f(layout, "provider.layout");
        C9677q.m14634f(backgroundSpans, "backgroundSpans");
        int length = backgroundSpans.length;
        int i11 = 0;
        while (i11 < length) {
            BackgroundSpan backgroundSpan = backgroundSpans[i11];
            int spanStart = valueOf.getSpanStart(backgroundSpan);
            int spanEnd = valueOf.getSpanEnd(backgroundSpan);
            BackgroundStyle style = backgroundSpan.getStyle();
            float dpToPx = SizeUtilsKt.getDpToPx(style.getCornerRadius());
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            if (lineForOffset <= i8 && i8 <= lineForOffset2) {
                int primaryHorizontal = lineForOffset == i8 ? (int) layout.getPrimaryHorizontal(spanStart) : i;
                if (lineForOffset2 == i8) {
                    length = length;
                    f = layout.getPrimaryHorizontal(Math.min(spanEnd, layout.getLineEnd(i8)));
                } else {
                    length = length;
                    f = layout.getLineRight(i8);
                }
                int i12 = (int) f;
                int color = paint.getColor();
                paint.setColor(style.getBackgroundColor());
                if (lineForOffset == lineForOffset2) {
                    i9 = i11;
                    valueOf = valueOf;
                    i10 = color;
                    layout = layout;
                    canvas.drawRoundRect(primaryHorizontal, i3, i12, i5, SizeUtilsKt.getDpToPx(style.getCornerRadius()), SizeUtilsKt.getDpToPx(style.getCornerRadius()), paint);
                } else {
                    i9 = i11;
                    layout = layout;
                    valueOf = valueOf;
                    i10 = color;
                    if (lineForOffset == i8) {
                        paint.setColor(style.getBackgroundColor());
                        Path path = new Path();
                        path.addRoundRect(primaryHorizontal, i3, i12, i5, new float[]{dpToPx, dpToPx, 0.0f, 0.0f, 0.0f, 0.0f, dpToPx, dpToPx}, Path.Direction.CW);
                        canvas.drawPath(path, paint);
                    } else {
                        if (lineForOffset2 == i8) {
                            paint.setColor(style.getBackgroundColor());
                            Path path2 = new Path();
                            z = false;
                            path2.addRoundRect(primaryHorizontal, i3, i12, i5, new float[]{0.0f, 0.0f, dpToPx, dpToPx, dpToPx, dpToPx, 0.0f, 0.0f}, Path.Direction.CW);
                            canvas.drawPath(path2, paint);
                        } else {
                            z = false;
                            canvas.drawRect(primaryHorizontal, i3, i12, i5, paint);
                        }
                        paint.setColor(i10);
                    }
                }
                z = false;
                paint.setColor(i10);
            } else {
                i9 = i11;
                length = length;
                layout = layout;
                valueOf = valueOf;
                z = false;
            }
            i11 = i9 + 1;
        }
    }
}
