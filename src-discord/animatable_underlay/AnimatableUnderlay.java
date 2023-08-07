package com.discord.animatable_underlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_activities.ReactRootView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 52\u00020\u0001:\u00015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020*H\u0014J\b\u0010/\u001a\u00020*H\u0014J(\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0015H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u000e\u0010(\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "height", "", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "pathRect", "Landroid/graphics/RectF;", ViewProps.SHADOW_COLOR, "", "getShadowColor$annotations", "()V", "shadowElevation", "getShadowElevation$annotations", "shadowPaint", "shapeBackgroundColor", "", "getShapeBackgroundColor", "()I", "setShapeBackgroundColor", "(I)V", "shapeBorderConfig", "Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "getShapeBorderConfig$animatable_underlay_release", "()Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "setShapeBorderConfig$animatable_underlay_release", "(Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;)V", "shapeHeight", "getShapeHeight", "()F", "setShapeHeight", "(F)V", "shapeWidth", "getShapeWidth", "setShapeWidth", "width", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawCustomShape", "onAttachedToWindow", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "Companion", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AnimatableUnderlay extends ReactViewGroup {
    public static final Companion Companion = new Companion(null);
    private static final Regex rgbaPattern = new Regex("rgba\\((\\d+),\\s*(\\d+),\\s*(\\d+),\\s*(\\d+(?:\\.\\d+)?)\\)");
    private float height;
    private final Paint paint;
    private final Paint shadowPaint;
    private float shapeHeight;
    private float shapeWidth;
    private float width;
    private AnimatableUnderlayBorders shapeBorderConfig = new AnimatableUnderlayBorders();
    private int shapeBackgroundColor = -16777216;
    private String shadowColor = "#14000000";
    private float shadowElevation = SizeUtilsKt.getDpToPx(3);
    private final Path path = new Path();
    private final RectF pathRect = new RectF();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$Companion;", "", "()V", "rgbaPattern", "Lkotlin/text/Regex;", "rgbaToArgb", "", "rgbaString", "", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int rgbaToArgb(String rgbaString) {
            q.h(rgbaString, "rgbaString");
            MatchResult f10 = AnimatableUnderlay.rgbaPattern.f(rgbaString);
            if (f10 == null) {
                return -16777216;
            }
            MatchResult.b a10 = f10.a();
            return Color.argb((int) (Double.parseDouble(a10.a().b().get(4)) * 255), Integer.parseInt(a10.a().b().get(1)), Integer.parseInt(a10.a().b().get(2)), Integer.parseInt(a10.a().b().get(3)));
        }
    }

    
    public AnimatableUnderlay(Context context) {
        super(context);
        q.h(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.paint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(0);
        float f10 = this.shadowElevation;
        paint2.setShadowLayer(f10, 0.0f, f10 / 2, Color.parseColor(this.shadowColor));
        this.shadowPaint = paint2;
    }

    private final void drawCustomShape(Canvas canvas) {
        this.path.reset();
        RectF rectF = this.pathRect;
        float f10 = this.width;
        rectF.left = f10 - this.shapeWidth;
        float f11 = this.height;
        rectF.top = f11 - this.shapeHeight;
        rectF.right = f10;
        rectF.bottom = f11;
        this.path.addRoundRect(rectF, this.shapeBorderConfig.getBorderRadiusRadii(), Path.Direction.CW);
        canvas.drawPath(this.path, this.shadowPaint);
        this.paint.setColor(this.shapeBackgroundColor);
        canvas.drawPath(this.path, this.paint);
        this.shapeBorderConfig.drawBorderStroke$animatable_underlay_release(canvas, this.paint, this.pathRect);
    }

    private static  void getShadowColor$annotations() {
    }

    private static  void getShadowElevation$annotations() {
    }

    
    @Override 
    public void dispatchDraw(Canvas canvas) {
        if (canvas != null) {
            drawCustomShape(canvas);
        }
        if (canvas != null) {
            canvas.clipPath(this.path);
        }
        super.dispatchDraw(canvas);
    }

    public final int getShapeBackgroundColor() {
        return this.shapeBackgroundColor;
    }

    public final AnimatableUnderlayBorders getShapeBorderConfig$animatable_underlay_release() {
        return this.shapeBorderConfig;
    }

    public final float getShapeHeight() {
        return this.shapeHeight;
    }

    public final float getShapeWidth() {
        return this.shapeWidth;
    }

    
    @Override 
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ReactRootView.Companion.setOnInterceptTouchEvent(this, new AnimatableUnderlay$onAttachedToWindow$1(this));
    }

    @Override 
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReactRootView.Companion.setOnInterceptTouchEvent(this, null);
    }

    
    @Override 
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.width = i10;
        this.height = i11;
    }

    public final void setShapeBackgroundColor(int i10) {
        this.shapeBackgroundColor = i10;
    }

    public final void setShapeBorderConfig$animatable_underlay_release(AnimatableUnderlayBorders animatableUnderlayBorders) {
        q.h(animatableUnderlayBorders, "<set-?>");
        this.shapeBorderConfig = animatableUnderlayBorders;
    }

    public final void setShapeHeight(float f10) {
        this.shapeHeight = f10;
    }

    public final void setShapeWidth(float f10) {
        this.shapeWidth = f10;
    }
}
