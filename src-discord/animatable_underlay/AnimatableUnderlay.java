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

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002ABB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0014J\u0010\u00109\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\b\u0010:\u001a\u000206H\u0014J\b\u0010;\u001a\u000206H\u0014J(\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020!2\u0006\u0010@\u001a\u00020!H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001cR\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u000e\u00104\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clipDirectionX", "Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;", "getClipDirectionX", "()Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;", "setClipDirectionX", "(Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;)V", "clipDirectionY", "Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;", "getClipDirectionY", "()Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;", "setClipDirectionY", "(Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;)V", "height", "", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "pathRect", "Landroid/graphics/RectF;", ViewProps.SHADOW_COLOR, "", "getShadowColor$annotations", "()V", "shadowElevation", "getShadowElevation$annotations", "shadowPaint", "shapeBackgroundColor", "", "getShapeBackgroundColor", "()I", "setShapeBackgroundColor", "(I)V", "shapeBorderConfig", "Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "getShapeBorderConfig$animatable_underlay_release", "()Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "setShapeBorderConfig$animatable_underlay_release", "(Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;)V", "shapeHeight", "getShapeHeight", "()F", "setShapeHeight", "(F)V", "shapeWidth", "getShapeWidth", "setShapeWidth", "width", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawCustomShape", "onAttachedToWindow", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "ClipDirectionX", "ClipDirectionY", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AnimatableUnderlay extends ReactViewGroup {
    private float height;
    private final Paint paint;
    private final Paint shadowPaint;
    private int shapeBackgroundColor;
    private float shapeHeight;
    private float shapeWidth;
    private float width;
    private ClipDirectionX clipDirectionX = ClipDirectionX.CENTERED;
    private ClipDirectionY clipDirectionY = ClipDirectionY.CENTERED;
    private AnimatableUnderlayBorders shapeBorderConfig = new AnimatableUnderlayBorders();
    private String shadowColor = "#14000000";
    private float shadowElevation = SizeUtilsKt.getDpToPx(3);
    private final Path path = new Path();
    private final RectF pathRect = new RectF();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;", "", "(Ljava/lang/String;I)V", "FROM_LEFT", "FROM_RIGHT", "CENTERED", "Companion", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum ClipDirectionX {
        FROM_LEFT,
        FROM_RIGHT,
        CENTERED;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX$Companion;", "", "()V", "parse", "Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;", "clipDirectionX", "", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class Companion {
            private Companion() {
            }

            public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ClipDirectionX parse(String str) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1244903727) {
                        if (hashCode != -852420684) {
                            if (hashCode == 68351122 && str.equals("fromRight")) {
                                return ClipDirectionX.FROM_RIGHT;
                            }
                        } else if (str.equals("centered")) {
                            return ClipDirectionX.CENTERED;
                        }
                    } else if (str.equals("fromLeft")) {
                        return ClipDirectionX.FROM_LEFT;
                    }
                }
                throw new IllegalArgumentException("Invalid clipDirectionX: " + str);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;", "", "(Ljava/lang/String;I)V", "FROM_TOP", "FROM_BOTTOM", "CENTERED", "Companion", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum ClipDirectionY {
        FROM_TOP,
        FROM_BOTTOM,
        CENTERED;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY$Companion;", "", "()V", "parse", "Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;", "clipDirectionY", "", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class Companion {
            private Companion() {
            }

            public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ClipDirectionY parse(String str) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -852420684) {
                        if (hashCode != -594339509) {
                            if (hashCode == 1666758261 && str.equals("fromBottom")) {
                                return ClipDirectionY.FROM_BOTTOM;
                            }
                        } else if (str.equals("fromTop")) {
                            return ClipDirectionY.FROM_TOP;
                        }
                    } else if (str.equals("centered")) {
                        return ClipDirectionY.CENTERED;
                    }
                }
                throw new IllegalArgumentException("Invalid clipDirectionX: " + str);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;
        public static final  int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipDirectionY.values().length];
            try {
                iArr[ClipDirectionY.FROM_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipDirectionY.FROM_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipDirectionY.CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipDirectionX.values().length];
            try {
                iArr2[ClipDirectionX.FROM_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipDirectionX.FROM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClipDirectionX.CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
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
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.clipDirectionY.ordinal()];
        if (i10 == 1) {
            RectF rectF = this.pathRect;
            float f10 = this.height;
            rectF.top = f10 - this.shapeHeight;
            rectF.bottom = f10;
        } else if (i10 == 2) {
            RectF rectF2 = this.pathRect;
            rectF2.top = 0.0f;
            float f11 = this.height;
            rectF2.bottom = f11 - (f11 - this.shapeHeight);
        } else if (i10 == 3) {
            RectF rectF3 = this.pathRect;
            float f12 = this.height;
            float f13 = this.shapeHeight;
            float f14 = 2;
            rectF3.top = (f12 - f13) / f14;
            rectF3.bottom = f12 - ((f12 - f13) / f14);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.clipDirectionX.ordinal()];
        if (i11 == 1) {
            RectF rectF4 = this.pathRect;
            float f15 = this.width;
            rectF4.left = f15 - this.shapeWidth;
            rectF4.right = f15;
        } else if (i11 == 2) {
            RectF rectF5 = this.pathRect;
            rectF5.left = 0.0f;
            float f16 = this.width;
            rectF5.right = f16 - (f16 - this.shapeWidth);
        } else if (i11 == 3) {
            RectF rectF6 = this.pathRect;
            float f17 = this.width;
            float f18 = this.shapeWidth;
            float f19 = 2;
            rectF6.left = (f17 - f18) / f19;
            rectF6.right = f17 - ((f17 - f18) / f19);
        }
        this.path.addRoundRect(this.pathRect, this.shapeBorderConfig.getBorderRadiusRadii(), Path.Direction.CW);
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

    public final ClipDirectionX getClipDirectionX() {
        return this.clipDirectionX;
    }

    public final ClipDirectionY getClipDirectionY() {
        return this.clipDirectionY;
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

    public final void setClipDirectionX(ClipDirectionX clipDirectionX) {
        q.h(clipDirectionX, "<set-?>");
        this.clipDirectionX = clipDirectionX;
    }

    public final void setClipDirectionY(ClipDirectionY clipDirectionY) {
        q.h(clipDirectionY, "<set-?>");
        this.clipDirectionY = clipDirectionY;
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
