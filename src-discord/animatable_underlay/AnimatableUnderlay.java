package com.discord.animatable_underlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 <2\u00020\u0001:\u0001<B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\u0012\u00106\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0014J(\u00107\u001a\u0002032\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u001a\u0010+\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001a\u0010.\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R\u000e\u00101\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "height", "", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "pathRect", "Landroid/graphics/RectF;", ViewProps.SHADOW_COLOR, "", "getShadowColor$annotations", "()V", "shadowElevation", "getShadowElevation$annotations", "shadowPaint", "shapeBackgroundColor", "getShapeBackgroundColor", "()I", "setShapeBackgroundColor", "(I)V", "shapeBorderConfig", "Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "getShapeBorderConfig$animatable_underlay_release", "()Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "setShapeBorderConfig$animatable_underlay_release", "(Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;)V", "shapeBottom", "getShapeBottom", "()F", "setShapeBottom", "(F)V", "shapeHeight", "getShapeHeight", "setShapeHeight", "shapeLeft", "getShapeLeft", "setShapeLeft", "shapeWidth", "getShapeWidth", "setShapeWidth", "width", "drawCustomShape", "", "canvas", "Landroid/graphics/Canvas;", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "Companion", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatableUnderlay extends View {
    public static final Companion Companion = new Companion(null);
    private static final Regex rgbaPattern = new Regex("rgba\\((\\d+),\\s*(\\d+),\\s*(\\d+),\\s*(\\d+(?:\\.\\d+)?)\\)");
    private float height;
    private final Paint paint;
    private final Path path;
    private final RectF pathRect;
    private String shadowColor;
    private float shadowElevation;
    private final Paint shadowPaint;
    private int shapeBackgroundColor;
    private AnimatableUnderlayBorders shapeBorderConfig;
    private float shapeBottom;
    private float shapeHeight;
    private float shapeLeft;
    private float shapeWidth;
    private float width;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$Companion;", "", "()V", "rgbaPattern", "Lkotlin/text/Regex;", "rgbaToArgb", "", "rgbaString", "", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int rgbaToArgb(String rgbaString) {
            q.g(rgbaString, "rgbaString");
            MatchResult f10 = AnimatableUnderlay.rgbaPattern.f(rgbaString);
            if (f10 == null) {
                return -16777216;
            }
            MatchResult.b a10 = f10.a();
            return Color.argb((int) (Double.parseDouble(a10.a().b().get(4)) * 255), Integer.parseInt(a10.a().b().get(1)), Integer.parseInt(a10.a().b().get(2)), Integer.parseInt(a10.a().b().get(3)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatableUnderlay(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatableUnderlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ AnimatableUnderlay(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void drawCustomShape(Canvas canvas) {
        this.path.reset();
        RectF rectF = this.pathRect;
        float f10 = this.shapeLeft;
        rectF.left = f10;
        float f11 = this.height;
        float f12 = this.shapeBottom;
        rectF.top = (f11 - this.shapeHeight) - f12;
        rectF.right = f10 + this.shapeWidth;
        rectF.bottom = f11 - f12;
        this.path.addRoundRect(rectF, this.shapeBorderConfig.getBorderRadiusRadii(), Path.Direction.CW);
        canvas.drawPath(this.path, this.shadowPaint);
        this.paint.setColor(this.shapeBackgroundColor);
        canvas.drawPath(this.path, this.paint);
        this.shapeBorderConfig.drawBorderStroke$animatable_underlay_release(canvas, this.paint, this.pathRect);
    }

    private static /* synthetic */ void getShadowColor$annotations() {
    }

    private static /* synthetic */ void getShadowElevation$annotations() {
    }

    public final int getShapeBackgroundColor() {
        return this.shapeBackgroundColor;
    }

    public final AnimatableUnderlayBorders getShapeBorderConfig$animatable_underlay_release() {
        return this.shapeBorderConfig;
    }

    public final float getShapeBottom() {
        return this.shapeBottom;
    }

    public final float getShapeHeight() {
        return this.shapeHeight;
    }

    public final float getShapeLeft() {
        return this.shapeLeft;
    }

    public final float getShapeWidth() {
        return this.shapeWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            drawCustomShape(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.width = i10;
        this.height = i11;
    }

    public final void setShapeBackgroundColor(int i10) {
        this.shapeBackgroundColor = i10;
    }

    public final void setShapeBorderConfig$animatable_underlay_release(AnimatableUnderlayBorders animatableUnderlayBorders) {
        q.g(animatableUnderlayBorders, "<set-?>");
        this.shapeBorderConfig = animatableUnderlayBorders;
    }

    public final void setShapeBottom(float f10) {
        this.shapeBottom = f10;
    }

    public final void setShapeHeight(float f10) {
        this.shapeHeight = f10;
    }

    public final void setShapeLeft(float f10) {
        this.shapeLeft = f10;
    }

    public final void setShapeWidth(float f10) {
        this.shapeWidth = f10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatableUnderlay(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        this.shapeLeft = SizeUtilsKt.getDpToPx(10);
        this.shapeBottom = SizeUtilsKt.getDpToPx(10);
        this.shapeBorderConfig = new AnimatableUnderlayBorders();
        this.shapeBackgroundColor = -16777216;
        this.shadowColor = "#14000000";
        this.shadowElevation = SizeUtilsKt.getDpToPx(3);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.paint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(0);
        float f10 = this.shadowElevation;
        paint2.setShadowLayer(f10, 0.0f, f10 / 2, Color.parseColor(this.shadowColor));
        this.shadowPaint = paint2;
        this.path = new Path();
        this.pathRect = new RectF();
        setEnabled(false);
    }
}
