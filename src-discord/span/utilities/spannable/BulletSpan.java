package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJh\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0016R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/discord/span/utilities/spannable/BulletSpan;", "Landroid/text/style/LeadingMarginSpan;", ViewProps.COLOR, "", "gapWidth", "wantColor", "", "bulletRadius", "strokeWidth", "", "style", "Landroid/graphics/Paint$Style;", "(IIZIFLandroid/graphics/Paint$Style;)V", "mBulletRadius", "mColor", "mGapWidth", "mStrokeWidth", "mStyle", "mWantColor", "drawLeadingMargin", "", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "x", "dir", ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "first", "l", "Landroid/text/Layout;", "getLeadingMargin", "Companion", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/span/utilities/spannable/BulletSpan$Companion;", "", "()V", "STANDARD_BULLET_RADIUS_PX", "", "STANDARD_GAP_WIDTH_PX", "STANDARD_STROKE_WIDTH_PX", "", "sBulletPath", "Landroid/graphics/Path;", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BulletSpan(int i10, int i11, boolean z10, int i12, float f10, Paint.Style style) {
        q.g(style, "style");
        this.mGapWidth = i11;
        this.mBulletRadius = i12;
        this.mWantColor = z10;
        this.mColor = i10;
        this.mStrokeWidth = f10;
        this.mStyle = style;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas c10, Paint p10, int i10, int i11, int i12, int i13, int i14, CharSequence text, int i15, int i16, boolean z10, Layout l10) {
        int i17;
        q.g(c10, "c");
        q.g(p10, "p");
        q.g(text, "text");
        q.g(l10, "l");
        if (((Spanned) text).getSpanStart(this) == i15) {
            Paint.Style style = p10.getStyle();
            if (this.mWantColor) {
                i17 = p10.getColor();
                p10.setColor(this.mColor);
            } else {
                i17 = 0;
            }
            p10.setStyle(this.mStyle);
            Paint.Style style2 = this.mStyle;
            if (style2 == Paint.Style.STROKE || style2 == Paint.Style.FILL_AND_STROKE) {
                p10.setStrokeWidth(this.mStrokeWidth);
            }
            if (c10.isHardwareAccelerated()) {
                if (sBulletPath == null) {
                    Path path = new Path();
                    path.addCircle(0.0f, 0.0f, this.mBulletRadius * 1.2f, Path.Direction.CW);
                    sBulletPath = path;
                }
                c10.save();
                c10.translate(i10 + (i11 * 1.2f * this.mBulletRadius), (i12 + i14) / 2.0f);
                Path path2 = sBulletPath;
                q.d(path2);
                c10.drawPath(path2, p10);
                c10.restore();
            } else {
                int i18 = this.mBulletRadius;
                c10.drawCircle(i10 + (i11 * i18), (i12 + i14) / 2.0f, i18, p10);
            }
            if (this.mWantColor) {
                p10.setColor(i17);
            }
            p10.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return (this.mBulletRadius * 2) + this.mGapWidth;
    }

    public /* synthetic */ BulletSpan(int i10, int i11, boolean z10, int i12, float f10, Paint.Style style, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i13 & 2) != 0 ? 2 : i11, (i13 & 4) != 0 ? true : z10, (i13 & 8) != 0 ? 4 : i12, (i13 & 16) != 0 ? 4.0f : f10, (i13 & 32) != 0 ? Paint.Style.FILL : style);
    }
}
