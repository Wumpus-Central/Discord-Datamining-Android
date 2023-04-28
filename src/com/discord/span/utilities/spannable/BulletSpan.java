package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJh\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0016R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m15073d2 = {"Lcom/discord/span/utilities/spannable/BulletSpan;", "Landroid/text/style/LeadingMarginSpan;", ViewProps.COLOR, "", "gapWidth", "wantColor", "", "bulletRadius", "strokeWidth", "", "style", "Landroid/graphics/Paint$Style;", "(IIZIFLandroid/graphics/Paint$Style;)V", "mBulletRadius", "mColor", "mGapWidth", "mStrokeWidth", "mStyle", "mWantColor", "drawLeadingMargin", "", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "x", "dir", ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "first", "l", "Landroid/text/Layout;", "getLeadingMargin", "Companion", "span_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class BulletSpan implements LeadingMarginSpan {
    public static final Companion Companion = new Companion(null);
    public static final int STANDARD_BULLET_RADIUS_PX = 4;
    public static final int STANDARD_GAP_WIDTH_PX = 2;
    public static final float STANDARD_STROKE_WIDTH_PX = 4.0f;
    private static Path sBulletPath;
    private final int mBulletRadius;
    private final int mColor;
    private final int mGapWidth;
    private final float mStrokeWidth;
    private final Paint.Style mStyle;
    private final boolean mWantColor;

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m15073d2 = {"Lcom/discord/span/utilities/spannable/BulletSpan$Companion;", "", "()V", "STANDARD_BULLET_RADIUS_PX", "", "STANDARD_GAP_WIDTH_PX", "STANDARD_STROKE_WIDTH_PX", "", "sBulletPath", "Landroid/graphics/Path;", "span_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BulletSpan(int i, int i2, boolean z, int i3, float f, Paint.Style style) {
        C9677q.m14633g(style, "style");
        this.mGapWidth = i2;
        this.mBulletRadius = i3;
        this.mWantColor = z;
        this.mColor = i;
        this.mStrokeWidth = f;
        this.mStyle = style;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas c, Paint p, int i, int i2, int i3, int i4, int i5, CharSequence text, int i6, int i7, boolean z, Layout l) {
        int i8;
        C9677q.m14633g(c, "c");
        C9677q.m14633g(p, "p");
        C9677q.m14633g(text, "text");
        C9677q.m14633g(l, "l");
        if (((Spanned) text).getSpanStart(this) == i6) {
            Paint.Style style = p.getStyle();
            if (this.mWantColor) {
                i8 = p.getColor();
                p.setColor(this.mColor);
            } else {
                i8 = 0;
            }
            p.setStyle(this.mStyle);
            Paint.Style style2 = this.mStyle;
            if (style2 == Paint.Style.STROKE || style2 == Paint.Style.FILL_AND_STROKE) {
                p.setStrokeWidth(this.mStrokeWidth);
            }
            if (c.isHardwareAccelerated()) {
                if (sBulletPath == null) {
                    Path path = new Path();
                    path.addCircle(0.0f, 0.0f, this.mBulletRadius * 1.2f, Path.Direction.CW);
                    sBulletPath = path;
                }
                c.save();
                c.translate(i + (i2 * 1.2f * this.mBulletRadius), (i3 + i5) / 2.0f);
                Path path2 = sBulletPath;
                C9677q.m14636d(path2);
                c.drawPath(path2, p);
                c.restore();
            } else {
                int i9 = this.mBulletRadius;
                c.drawCircle(i + (i2 * i9), (i3 + i5) / 2.0f, i9, p);
            }
            if (this.mWantColor) {
                p.setColor(i8);
            }
            p.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return (this.mBulletRadius * 2) + this.mGapWidth;
    }

    public /* synthetic */ BulletSpan(int i, int i2, boolean z, int i3, float f, Paint.Style style, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 2 : i2, (i4 & 4) != 0 ? true : z, (i4 & 8) != 0 ? 4 : i3, (i4 & 16) != 0 ? 4.0f : f, (i4 & 32) != 0 ? Paint.Style.FILL : style);
    }
}
