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
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J`\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/span/utilities/BackgroundSpanDrawer;", "Landroid/text/style/LineBackgroundSpan;", "provider", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", ViewProps.LEFT, "", ViewProps.RIGHT, ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "lineNumber", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BackgroundSpanDrawer implements LineBackgroundSpan {
    private final TextView provider;

    public BackgroundSpanDrawer(TextView provider) {
        q.g(provider, "provider");
        this.provider = provider;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence text, int i15, int i16, int i17) {
        boolean z10;
        int i18;
        float f10;
        int i19;
        q.g(canvas, "canvas");
        q.g(paint, "paint");
        q.g(text, "text");
        SpannedString valueOf = SpannedString.valueOf(text);
        q.f(valueOf, "valueOf(this)");
        BackgroundSpan[] backgroundSpans = (BackgroundSpan[]) valueOf.getSpans(0, text.length(), BackgroundSpan.class);
        Layout layout = this.provider.getLayout();
        q.f(layout, "provider.layout");
        q.f(backgroundSpans, "backgroundSpans");
        int length = backgroundSpans.length;
        int i20 = 0;
        while (i20 < length) {
            BackgroundSpan backgroundSpan = backgroundSpans[i20];
            int spanStart = valueOf.getSpanStart(backgroundSpan);
            int spanEnd = valueOf.getSpanEnd(backgroundSpan);
            BackgroundStyle style = backgroundSpan.getStyle();
            float dpToPx = SizeUtilsKt.getDpToPx(style.getCornerRadius());
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            if (lineForOffset <= i17 && i17 <= lineForOffset2) {
                int primaryHorizontal = lineForOffset == i17 ? (int) layout.getPrimaryHorizontal(spanStart) : i10;
                if (lineForOffset2 == i17) {
                    length = length;
                    f10 = layout.getPrimaryHorizontal(Math.min(spanEnd, layout.getLineEnd(i17)));
                } else {
                    length = length;
                    f10 = layout.getLineRight(i17);
                }
                int i21 = (int) f10;
                int color = paint.getColor();
                paint.setColor(style.getBackgroundColor());
                if (lineForOffset == lineForOffset2) {
                    i18 = i20;
                    valueOf = valueOf;
                    i19 = color;
                    layout = layout;
                    canvas.drawRoundRect(primaryHorizontal, i12, i21, i14, SizeUtilsKt.getDpToPx(style.getCornerRadius()), SizeUtilsKt.getDpToPx(style.getCornerRadius()), paint);
                } else {
                    i18 = i20;
                    layout = layout;
                    valueOf = valueOf;
                    i19 = color;
                    if (lineForOffset == i17) {
                        paint.setColor(style.getBackgroundColor());
                        Path path = new Path();
                        path.addRoundRect(primaryHorizontal, i12, i21, i14, new float[]{dpToPx, dpToPx, 0.0f, 0.0f, 0.0f, 0.0f, dpToPx, dpToPx}, Path.Direction.CW);
                        canvas.drawPath(path, paint);
                    } else {
                        if (lineForOffset2 == i17) {
                            paint.setColor(style.getBackgroundColor());
                            Path path2 = new Path();
                            z10 = false;
                            path2.addRoundRect(primaryHorizontal, i12, i21, i14, new float[]{0.0f, 0.0f, dpToPx, dpToPx, dpToPx, dpToPx, 0.0f, 0.0f}, Path.Direction.CW);
                            canvas.drawPath(path2, paint);
                        } else {
                            z10 = false;
                            canvas.drawRect(primaryHorizontal, i12, i21, i14, paint);
                        }
                        paint.setColor(i19);
                    }
                }
                z10 = false;
                paint.setColor(i19);
            } else {
                i18 = i20;
                length = length;
                layout = layout;
                valueOf = valueOf;
                z10 = false;
            }
            i20 = i18 + 1;
        }
    }
}
