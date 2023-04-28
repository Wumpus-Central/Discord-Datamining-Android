package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.yoga.C5126d;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes7.dex */
public class ReactViewBackgroundDrawable extends Drawable {
    private static final int ALL_BITS_SET = -1;
    private static final int ALL_BITS_UNSET = 0;
    private static final int DEFAULT_BORDER_ALPHA = 255;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_RGB = 0;
    private Spacing mBorderAlpha;
    private float[] mBorderCornerRadii;
    private Spacing mBorderRGB;
    private BorderStyle mBorderStyle;
    private Spacing mBorderWidth;
    private Path mCenterDrawPath;
    private final Context mContext;
    private PointF mInnerBottomLeftCorner;
    private PointF mInnerBottomRightCorner;
    private Path mInnerClipPathForBorderRadius;
    private RectF mInnerClipTempRectForBorderRadius;
    private PointF mInnerTopLeftCorner;
    private PointF mInnerTopRightCorner;
    private int mLayoutDirection;
    private Path mOuterClipPathForBorderRadius;
    private RectF mOuterClipTempRectForBorderRadius;
    private Path mPathForBorder;
    private Path mPathForBorderRadiusOutline;
    private RectF mTempRectForBorderRadiusOutline;
    private RectF mTempRectForCenterDrawPath;
    private final Path mPathForSingleBorder = new Path();
    private boolean mNeedUpdatePathForBorderRadius = false;
    private float mBorderRadius = Float.NaN;
    private final Paint mPaint = new Paint(1);
    private int mColor = 0;
    private int mAlpha = DEFAULT_BORDER_ALPHA;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.views.view.ReactViewBackgroundDrawable$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$facebook$react$views$view$ReactViewBackgroundDrawable$BorderStyle */
        static final /* synthetic */ int[] f37204xe6ea8768;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            f37204xe6ea8768 = iArr;
            try {
                iArr[BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37204xe6ea8768[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37204xe6ea8768[BorderStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum BorderRadiusLocation {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public enum BorderStyle {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect getPathEffect(BorderStyle borderStyle, float f) {
            int i = AnonymousClass1.f37204xe6ea8768[borderStyle.ordinal()];
            if (i == 2) {
                float f2 = f * 3.0f;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            } else if (i != 3) {
                return null;
            } else {
                return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
            }
        }
    }

    public ReactViewBackgroundDrawable(Context context) {
        this.mContext = context;
    }

    private static int colorFromAlphaAndRGBComponents(float f, float f2) {
        return ((((int) f) << 24) & DEFAULT_BORDER_COLOR) | (((int) f2) & 16777215);
    }

    private void drawQuadrilateral(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i != 0) {
            if (this.mPathForBorder == null) {
                this.mPathForBorder = new Path();
            }
            this.mPaint.setColor(i);
            this.mPathForBorder.reset();
            this.mPathForBorder.moveTo(f, f2);
            this.mPathForBorder.lineTo(f3, f4);
            this.mPathForBorder.lineTo(f5, f6);
            this.mPathForBorder.lineTo(f7, f8);
            this.mPathForBorder.lineTo(f, f2);
            canvas.drawPath(this.mPathForBorder, this.mPaint);
        }
    }

    private void drawRectangularBackgroundWithBorders(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        this.mPaint.setStyle(Paint.Style.FILL);
        int multiplyColorAlpha = ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha);
        if (Color.alpha(multiplyColorAlpha) != 0) {
            this.mPaint.setColor(multiplyColorAlpha);
            canvas.drawRect(getBounds(), this.mPaint);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int round = Math.round(directionAwareBorderInsets.left);
        int round2 = Math.round(directionAwareBorderInsets.top);
        int round3 = Math.round(directionAwareBorderInsets.right);
        int round4 = Math.round(directionAwareBorderInsets.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            if (getResolvedLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int borderColor5 = getBorderColor(4);
            int borderColor6 = getBorderColor(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (isBorderColorDefined(4)) {
                    borderColor = borderColor5;
                }
                if (isBorderColorDefined(5)) {
                    borderColor3 = borderColor6;
                }
                if (z) {
                    i9 = borderColor3;
                } else {
                    i9 = borderColor;
                }
                if (!z) {
                    borderColor = borderColor3;
                }
                i = borderColor;
                i2 = i9;
            } else {
                if (z) {
                    i8 = borderColor6;
                } else {
                    i8 = borderColor5;
                }
                if (!z) {
                    borderColor5 = borderColor6;
                }
                boolean isBorderColorDefined = isBorderColorDefined(4);
                boolean isBorderColorDefined2 = isBorderColorDefined(5);
                if (z) {
                    z2 = isBorderColorDefined2;
                } else {
                    z2 = isBorderColorDefined;
                }
                if (!z) {
                    isBorderColorDefined = isBorderColorDefined2;
                }
                if (z2) {
                    borderColor = i8;
                }
                i2 = borderColor;
                if (isBorderColorDefined) {
                    i = borderColor5;
                } else {
                    i = borderColor3;
                }
            }
            int i10 = bounds.left;
            int i11 = bounds.top;
            int fastBorderCompatibleColorOrZero = fastBorderCompatibleColorOrZero(round, round2, round3, round4, i2, borderColor2, i, borderColor4);
            if (fastBorderCompatibleColorOrZero == 0) {
                this.mPaint.setAntiAlias(false);
                int width = bounds.width();
                int height = bounds.height();
                if (round > 0) {
                    float f = i10;
                    float f2 = i10 + round;
                    i3 = i11;
                    drawQuadrilateral(canvas, i2, f, i11, f2, i11 + round2, f2, i7 - round4, f, i11 + height);
                } else {
                    i3 = i11;
                }
                if (round2 > 0) {
                    float f3 = i3;
                    float f4 = i3 + round2;
                    drawQuadrilateral(canvas, borderColor2, i10, f3, i10 + round, f4, i6 - round3, f4, i10 + width, f3);
                }
                if (round3 > 0) {
                    int i12 = i10 + width;
                    float f5 = i12;
                    float f6 = i12 - round3;
                    drawQuadrilateral(canvas, i, f5, i3, f5, i3 + height, f6, i5 - round4, f6, i3 + round2);
                }
                if (round4 > 0) {
                    int i13 = i3 + height;
                    float f7 = i13;
                    float f8 = i13 - round4;
                    drawQuadrilateral(canvas, borderColor4, i10, f7, i10 + width, f7, i4 - round3, f8, i10 + round, f8);
                }
                this.mPaint.setAntiAlias(true);
            } else if (Color.alpha(fastBorderCompatibleColorOrZero) != 0) {
                int i14 = bounds.right;
                int i15 = bounds.bottom;
                this.mPaint.setColor(fastBorderCompatibleColorOrZero);
                this.mPaint.setStyle(Paint.Style.STROKE);
                if (round > 0) {
                    this.mPathForSingleBorder.reset();
                    int round5 = Math.round(directionAwareBorderInsets.left);
                    updatePathEffect(round5);
                    this.mPaint.setStrokeWidth(round5);
                    float f9 = i10 + (round5 / 2);
                    this.mPathForSingleBorder.moveTo(f9, i11);
                    this.mPathForSingleBorder.lineTo(f9, i15);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (round2 > 0) {
                    this.mPathForSingleBorder.reset();
                    int round6 = Math.round(directionAwareBorderInsets.top);
                    updatePathEffect(round6);
                    this.mPaint.setStrokeWidth(round6);
                    float f10 = i11 + (round6 / 2);
                    this.mPathForSingleBorder.moveTo(i10, f10);
                    this.mPathForSingleBorder.lineTo(i14, f10);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (round3 > 0) {
                    this.mPathForSingleBorder.reset();
                    int round7 = Math.round(directionAwareBorderInsets.right);
                    updatePathEffect(round7);
                    this.mPaint.setStrokeWidth(round7);
                    float f11 = i14 - (round7 / 2);
                    this.mPathForSingleBorder.moveTo(f11, i11);
                    this.mPathForSingleBorder.lineTo(f11, i15);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (round4 > 0) {
                    this.mPathForSingleBorder.reset();
                    int round8 = Math.round(directionAwareBorderInsets.bottom);
                    updatePathEffect(round8);
                    this.mPaint.setStrokeWidth(round8);
                    float f12 = i15 - (round8 / 2);
                    this.mPathForSingleBorder.moveTo(i10, f12);
                    this.mPathForSingleBorder.lineTo(i14, f12);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
            }
        }
    }

    private void drawRoundedBackgroundWithBorders(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        int i3;
        boolean z;
        updatePath();
        canvas.save();
        int multiplyColorAlpha = ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha);
        if (Color.alpha(multiplyColorAlpha) != 0) {
            this.mPaint.setColor(multiplyColorAlpha);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.mInnerClipPathForBorderRadius, this.mPaint);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        boolean z2 = false;
        int borderColor = getBorderColor(0);
        int borderColor2 = getBorderColor(1);
        int borderColor3 = getBorderColor(2);
        int borderColor4 = getBorderColor(3);
        if (directionAwareBorderInsets.top > 0.0f || directionAwareBorderInsets.bottom > 0.0f || directionAwareBorderInsets.left > 0.0f || directionAwareBorderInsets.right > 0.0f) {
            float fullBorderWidth = getFullBorderWidth();
            int borderColor5 = getBorderColor(8);
            if (directionAwareBorderInsets.top != fullBorderWidth || directionAwareBorderInsets.bottom != fullBorderWidth || directionAwareBorderInsets.left != fullBorderWidth || directionAwareBorderInsets.right != fullBorderWidth || borderColor != borderColor5 || borderColor2 != borderColor5 || borderColor3 != borderColor5 || borderColor4 != borderColor5) {
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.clipPath(this.mOuterClipPathForBorderRadius, Region.Op.INTERSECT);
                canvas.clipPath(this.mInnerClipPathForBorderRadius, Region.Op.DIFFERENCE);
                if (getResolvedLayoutDirection() == 1) {
                    z2 = true;
                }
                int borderColor6 = getBorderColor(4);
                int borderColor7 = getBorderColor(5);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                    if (isBorderColorDefined(4)) {
                        borderColor = borderColor6;
                    }
                    if (isBorderColorDefined(5)) {
                        borderColor3 = borderColor7;
                    }
                    if (z2) {
                        i2 = borderColor3;
                    } else {
                        i2 = borderColor;
                    }
                    if (!z2) {
                        borderColor = borderColor3;
                    }
                    i = borderColor;
                } else {
                    if (z2) {
                        i3 = borderColor7;
                    } else {
                        i3 = borderColor6;
                    }
                    if (!z2) {
                        borderColor6 = borderColor7;
                    }
                    boolean isBorderColorDefined = isBorderColorDefined(4);
                    boolean isBorderColorDefined2 = isBorderColorDefined(5);
                    if (z2) {
                        z = isBorderColorDefined2;
                    } else {
                        z = isBorderColorDefined;
                    }
                    if (!z2) {
                        isBorderColorDefined = isBorderColorDefined2;
                    }
                    if (z) {
                        borderColor = i3;
                    }
                    if (isBorderColorDefined) {
                        i2 = borderColor;
                        i = borderColor6;
                    } else {
                        i2 = borderColor;
                        i = borderColor3;
                    }
                }
                RectF rectF = this.mOuterClipTempRectForBorderRadius;
                float f5 = rectF.left;
                float f6 = rectF.right;
                float f7 = rectF.top;
                float f8 = rectF.bottom;
                if (directionAwareBorderInsets.left > 0.0f) {
                    PointF pointF = this.mInnerTopLeftCorner;
                    float f9 = pointF.x;
                    float f10 = pointF.y;
                    PointF pointF2 = this.mInnerBottomLeftCorner;
                    f2 = f8;
                    f3 = f7;
                    f4 = f6;
                    f = f5;
                    drawQuadrilateral(canvas, i2, f5, f7, f9, f10, pointF2.x, pointF2.y, f5, f2);
                } else {
                    f2 = f8;
                    f3 = f7;
                    f4 = f6;
                    f = f5;
                }
                if (directionAwareBorderInsets.top > 0.0f) {
                    PointF pointF3 = this.mInnerTopLeftCorner;
                    float f11 = pointF3.x;
                    float f12 = pointF3.y;
                    PointF pointF4 = this.mInnerTopRightCorner;
                    drawQuadrilateral(canvas, borderColor2, f, f3, f11, f12, pointF4.x, pointF4.y, f4, f3);
                }
                if (directionAwareBorderInsets.right > 0.0f) {
                    PointF pointF5 = this.mInnerTopRightCorner;
                    float f13 = pointF5.x;
                    float f14 = pointF5.y;
                    PointF pointF6 = this.mInnerBottomRightCorner;
                    drawQuadrilateral(canvas, i, f4, f3, f13, f14, pointF6.x, pointF6.y, f4, f2);
                }
                if (directionAwareBorderInsets.bottom > 0.0f) {
                    PointF pointF7 = this.mInnerBottomLeftCorner;
                    float f15 = pointF7.x;
                    float f16 = pointF7.y;
                    PointF pointF8 = this.mInnerBottomRightCorner;
                    drawQuadrilateral(canvas, borderColor4, f, f2, f15, f16, pointF8.x, pointF8.y, f4, f2);
                }
            } else if (fullBorderWidth > 0.0f) {
                this.mPaint.setColor(ColorUtil.multiplyColorAlpha(borderColor5, this.mAlpha));
                this.mPaint.setStyle(Paint.Style.STROKE);
                this.mPaint.setStrokeWidth(fullBorderWidth);
                canvas.drawPath(this.mCenterDrawPath, this.mPaint);
            }
        }
        canvas.restore();
    }

    private static int fastBorderCompatibleColorOrZero(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -1;
        int i10 = (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i4 > 0) {
            i9 = i8;
        }
        int i11 = i9 & i10;
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i12 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = i12 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i11 == (i13 | i8)) {
            return i11;
        }
        return 0;
    }

    private int getBorderWidth(int i) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return 0;
        }
        float f = spacing.get(i);
        if (C5126d.m30596a(f)) {
            return -1;
        }
        return Math.round(f);
    }

    private static void getEllipseIntersectionWithLine(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (!Double.isNaN(d21) && !Double.isNaN(d22)) {
            pointF.x = (float) d21;
            pointF.y = (float) d22;
        }
    }

    private boolean isBorderColorDefined(int i) {
        float f;
        Spacing spacing = this.mBorderRGB;
        float f2 = Float.NaN;
        if (spacing != null) {
            f = spacing.get(i);
        } else {
            f = Float.NaN;
        }
        Spacing spacing2 = this.mBorderAlpha;
        if (spacing2 != null) {
            f2 = spacing2.get(i);
        }
        if (C5126d.m30596a(f) || C5126d.m30596a(f2)) {
            return false;
        }
        return true;
    }

    private void setBorderAlpha(int i, float f) {
        if (this.mBorderAlpha == null) {
            this.mBorderAlpha = new Spacing(255.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderAlpha.getRaw(i), f)) {
            this.mBorderAlpha.set(i, f);
            invalidateSelf();
        }
    }

    private void setBorderRGB(int i, float f) {
        if (this.mBorderRGB == null) {
            this.mBorderRGB = new Spacing(0.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderRGB.getRaw(i), f)) {
            this.mBorderRGB.set(i, f);
            invalidateSelf();
        }
    }

    private void updatePath() {
        float f;
        float f2;
        float max;
        float max2;
        float max3;
        float max4;
        float max5;
        float max6;
        float max7;
        float max8;
        if (this.mNeedUpdatePathForBorderRadius) {
            this.mNeedUpdatePathForBorderRadius = false;
            if (this.mInnerClipPathForBorderRadius == null) {
                this.mInnerClipPathForBorderRadius = new Path();
            }
            if (this.mOuterClipPathForBorderRadius == null) {
                this.mOuterClipPathForBorderRadius = new Path();
            }
            if (this.mPathForBorderRadiusOutline == null) {
                this.mPathForBorderRadiusOutline = new Path();
            }
            if (this.mCenterDrawPath == null) {
                this.mCenterDrawPath = new Path();
            }
            if (this.mInnerClipTempRectForBorderRadius == null) {
                this.mInnerClipTempRectForBorderRadius = new RectF();
            }
            if (this.mOuterClipTempRectForBorderRadius == null) {
                this.mOuterClipTempRectForBorderRadius = new RectF();
            }
            if (this.mTempRectForBorderRadiusOutline == null) {
                this.mTempRectForBorderRadiusOutline = new RectF();
            }
            if (this.mTempRectForCenterDrawPath == null) {
                this.mTempRectForCenterDrawPath = new RectF();
            }
            this.mInnerClipPathForBorderRadius.reset();
            this.mOuterClipPathForBorderRadius.reset();
            this.mPathForBorderRadiusOutline.reset();
            this.mCenterDrawPath.reset();
            this.mInnerClipTempRectForBorderRadius.set(getBounds());
            this.mOuterClipTempRectForBorderRadius.set(getBounds());
            this.mTempRectForBorderRadiusOutline.set(getBounds());
            this.mTempRectForCenterDrawPath.set(getBounds());
            RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            int borderColor5 = getBorderColor(8);
            if (!(Color.alpha(borderColor) == 0 || Color.alpha(borderColor2) == 0 || Color.alpha(borderColor3) == 0 || Color.alpha(borderColor4) == 0 || Color.alpha(borderColor5) == 0)) {
                RectF rectF = this.mInnerClipTempRectForBorderRadius;
                rectF.top += directionAwareBorderInsets.top;
                rectF.bottom -= directionAwareBorderInsets.bottom;
                rectF.left += directionAwareBorderInsets.left;
                rectF.right -= directionAwareBorderInsets.right;
            }
            RectF rectF2 = this.mTempRectForCenterDrawPath;
            rectF2.top += directionAwareBorderInsets.top * 0.5f;
            rectF2.bottom -= directionAwareBorderInsets.bottom * 0.5f;
            rectF2.left += directionAwareBorderInsets.left * 0.5f;
            rectF2.right -= directionAwareBorderInsets.right * 0.5f;
            float fullBorderRadius = getFullBorderRadius();
            float borderRadiusOrDefaultTo = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.TOP_LEFT);
            float borderRadiusOrDefaultTo2 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.TOP_RIGHT);
            float borderRadiusOrDefaultTo3 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.BOTTOM_LEFT);
            float borderRadiusOrDefaultTo4 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.BOTTOM_RIGHT);
            boolean z = getResolvedLayoutDirection() == 1;
            float borderRadius = getBorderRadius(BorderRadiusLocation.TOP_START);
            float borderRadius2 = getBorderRadius(BorderRadiusLocation.TOP_END);
            float borderRadius3 = getBorderRadius(BorderRadiusLocation.BOTTOM_START);
            float borderRadius4 = getBorderRadius(BorderRadiusLocation.BOTTOM_END);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (!C5126d.m30596a(borderRadius)) {
                    borderRadiusOrDefaultTo = borderRadius;
                }
                if (!C5126d.m30596a(borderRadius2)) {
                    borderRadiusOrDefaultTo2 = borderRadius2;
                }
                if (!C5126d.m30596a(borderRadius3)) {
                    borderRadiusOrDefaultTo3 = borderRadius3;
                }
                if (!C5126d.m30596a(borderRadius4)) {
                    borderRadiusOrDefaultTo4 = borderRadius4;
                }
                f2 = z ? borderRadiusOrDefaultTo2 : borderRadiusOrDefaultTo;
                if (!z) {
                    borderRadiusOrDefaultTo = borderRadiusOrDefaultTo2;
                }
                f = z ? borderRadiusOrDefaultTo4 : borderRadiusOrDefaultTo3;
                if (z) {
                    borderRadiusOrDefaultTo4 = borderRadiusOrDefaultTo3;
                }
            } else {
                float f3 = z ? borderRadius2 : borderRadius;
                if (!z) {
                    borderRadius = borderRadius2;
                }
                float f4 = z ? borderRadius4 : borderRadius3;
                if (!z) {
                    borderRadius3 = borderRadius4;
                }
                if (!C5126d.m30596a(f3)) {
                    borderRadiusOrDefaultTo = f3;
                }
                if (!C5126d.m30596a(borderRadius)) {
                    borderRadiusOrDefaultTo2 = borderRadius;
                }
                if (!C5126d.m30596a(f4)) {
                    borderRadiusOrDefaultTo3 = f4;
                }
                if (!C5126d.m30596a(borderRadius3)) {
                    f2 = borderRadiusOrDefaultTo;
                    borderRadiusOrDefaultTo = borderRadiusOrDefaultTo2;
                    f = borderRadiusOrDefaultTo3;
                    borderRadiusOrDefaultTo4 = borderRadius3;
                } else {
                    f2 = borderRadiusOrDefaultTo;
                    borderRadiusOrDefaultTo = borderRadiusOrDefaultTo2;
                    f = borderRadiusOrDefaultTo3;
                }
            }
            this.mInnerClipPathForBorderRadius.addRoundRect(this.mInnerClipTempRectForBorderRadius, new float[]{Math.max(f2 - directionAwareBorderInsets.left, 0.0f), Math.max(f2 - directionAwareBorderInsets.top, 0.0f), Math.max(borderRadiusOrDefaultTo - directionAwareBorderInsets.right, 0.0f), Math.max(borderRadiusOrDefaultTo - directionAwareBorderInsets.top, 0.0f), Math.max(borderRadiusOrDefaultTo4 - directionAwareBorderInsets.right, 0.0f), Math.max(borderRadiusOrDefaultTo4 - directionAwareBorderInsets.bottom, 0.0f), Math.max(f - directionAwareBorderInsets.left, 0.0f), Math.max(f - directionAwareBorderInsets.bottom, 0.0f)}, Path.Direction.CW);
            this.mOuterClipPathForBorderRadius.addRoundRect(this.mOuterClipTempRectForBorderRadius, new float[]{f2, f2, borderRadiusOrDefaultTo, borderRadiusOrDefaultTo, borderRadiusOrDefaultTo4, borderRadiusOrDefaultTo4, f, f}, Path.Direction.CW);
            Spacing spacing = this.mBorderWidth;
            float f5 = spacing != null ? spacing.get(8) / 2.0f : 0.0f;
            float f6 = f2 + f5;
            float f7 = borderRadiusOrDefaultTo + f5;
            float f8 = borderRadiusOrDefaultTo4 + f5;
            float f9 = f + f5;
            this.mPathForBorderRadiusOutline.addRoundRect(this.mTempRectForBorderRadiusOutline, new float[]{f6, f6, f7, f7, f8, f8, f9, f9}, Path.Direction.CW);
            Path path = this.mCenterDrawPath;
            RectF rectF3 = this.mTempRectForCenterDrawPath;
            float[] fArr = new float[8];
            float f10 = directionAwareBorderInsets.left;
            fArr[0] = Math.max(f2 - (f10 * 0.5f), f10 > 0.0f ? f2 / f10 : 0.0f);
            float f11 = directionAwareBorderInsets.top;
            fArr[1] = Math.max(f2 - (f11 * 0.5f), f11 > 0.0f ? f2 / f11 : 0.0f);
            float f12 = directionAwareBorderInsets.right;
            fArr[2] = Math.max(borderRadiusOrDefaultTo - (f12 * 0.5f), f12 > 0.0f ? borderRadiusOrDefaultTo / f12 : 0.0f);
            float f13 = directionAwareBorderInsets.top;
            fArr[3] = Math.max(borderRadiusOrDefaultTo - (f13 * 0.5f), f13 > 0.0f ? borderRadiusOrDefaultTo / f13 : 0.0f);
            float f14 = directionAwareBorderInsets.right;
            fArr[4] = Math.max(borderRadiusOrDefaultTo4 - (f14 * 0.5f), f14 > 0.0f ? borderRadiusOrDefaultTo4 / f14 : 0.0f);
            float f15 = directionAwareBorderInsets.bottom;
            fArr[5] = Math.max(borderRadiusOrDefaultTo4 - (f15 * 0.5f), f15 > 0.0f ? borderRadiusOrDefaultTo4 / f15 : 0.0f);
            float f16 = directionAwareBorderInsets.left;
            fArr[6] = Math.max(f - (f16 * 0.5f), f16 > 0.0f ? f / f16 : 0.0f);
            float f17 = directionAwareBorderInsets.bottom;
            fArr[7] = Math.max(f - (f17 * 0.5f), f17 > 0.0f ? f / f17 : 0.0f);
            path.addRoundRect(rectF3, fArr, Path.Direction.CW);
            if (this.mInnerTopLeftCorner == null) {
                this.mInnerTopLeftCorner = new PointF();
            }
            PointF pointF = this.mInnerTopLeftCorner;
            RectF rectF4 = this.mInnerClipTempRectForBorderRadius;
            float f18 = rectF4.left;
            pointF.x = f18;
            float f19 = rectF4.top;
            pointF.y = f19;
            RectF rectF5 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f18, f19, (max * 2.0f) + f18, (max2 * 2.0f) + f19, rectF5.left, rectF5.top, f18, f19, pointF);
            if (this.mInnerBottomLeftCorner == null) {
                this.mInnerBottomLeftCorner = new PointF();
            }
            PointF pointF2 = this.mInnerBottomLeftCorner;
            RectF rectF6 = this.mInnerClipTempRectForBorderRadius;
            float f20 = rectF6.left;
            pointF2.x = f20;
            float f21 = rectF6.bottom;
            pointF2.y = f21;
            RectF rectF7 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f20, f21 - (max8 * 2.0f), (max7 * 2.0f) + f20, f21, rectF7.left, rectF7.bottom, f20, f21, pointF2);
            if (this.mInnerTopRightCorner == null) {
                this.mInnerTopRightCorner = new PointF();
            }
            PointF pointF3 = this.mInnerTopRightCorner;
            RectF rectF8 = this.mInnerClipTempRectForBorderRadius;
            float f22 = rectF8.right;
            pointF3.x = f22;
            float f23 = rectF8.top;
            pointF3.y = f23;
            RectF rectF9 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f22 - (max3 * 2.0f), f23, f22, (max4 * 2.0f) + f23, rectF9.right, rectF9.top, f22, f23, pointF3);
            if (this.mInnerBottomRightCorner == null) {
                this.mInnerBottomRightCorner = new PointF();
            }
            PointF pointF4 = this.mInnerBottomRightCorner;
            RectF rectF10 = this.mInnerClipTempRectForBorderRadius;
            float f24 = rectF10.right;
            pointF4.x = f24;
            float f25 = rectF10.bottom;
            pointF4.y = f25;
            RectF rectF11 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f24 - (max5 * 2.0f), f25 - (2.0f * max6), f24, f25, rectF11.right, rectF11.bottom, f24, f25, pointF4);
        }
    }

    private void updatePathEffect() {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? BorderStyle.getPathEffect(borderStyle, getFullBorderWidth()) : null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        updatePathEffect();
        if (!hasRoundedBorders()) {
            drawRectangularBackgroundWithBorders(canvas);
        } else {
            drawRoundedBackgroundWithBorders(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    public int getBorderColor(int i) {
        float f;
        float f2;
        Spacing spacing = this.mBorderRGB;
        if (spacing != null) {
            f = spacing.get(i);
        } else {
            f = 0.0f;
        }
        Spacing spacing2 = this.mBorderAlpha;
        if (spacing2 != null) {
            f2 = spacing2.get(i);
        } else {
            f2 = 255.0f;
        }
        return colorFromAlphaAndRGBComponents(f2, f);
    }

    public float getBorderRadius(BorderRadiusLocation borderRadiusLocation) {
        return getBorderRadiusOrDefaultTo(Float.NaN, borderRadiusLocation);
    }

    public float getBorderRadiusOrDefaultTo(float f, BorderRadiusLocation borderRadiusLocation) {
        float[] fArr = this.mBorderCornerRadii;
        if (fArr == null) {
            return f;
        }
        float f2 = fArr[borderRadiusLocation.ordinal()];
        if (C5126d.m30596a(f2)) {
            return f;
        }
        return f2;
    }

    public float getBorderWidthOrDefaultTo(float f, int i) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return f;
        }
        float raw = spacing.getRaw(i);
        if (C5126d.m30596a(raw)) {
            return f;
        }
        return raw;
    }

    @VisibleForTesting
    public int getColor() {
        return this.mColor;
    }

    @TargetApi(21)
    public RectF getDirectionAwareBorderInsets() {
        float f;
        float f2;
        float borderWidthOrDefaultTo = getBorderWidthOrDefaultTo(0.0f, 8);
        boolean z = true;
        float borderWidthOrDefaultTo2 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 1);
        float borderWidthOrDefaultTo3 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 3);
        float borderWidthOrDefaultTo4 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 0);
        float borderWidthOrDefaultTo5 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 2);
        if (this.mBorderWidth != null) {
            if (getResolvedLayoutDirection() != 1) {
                z = false;
            }
            float raw = this.mBorderWidth.getRaw(4);
            float raw2 = this.mBorderWidth.getRaw(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (!C5126d.m30596a(raw)) {
                    borderWidthOrDefaultTo4 = raw;
                }
                if (!C5126d.m30596a(raw2)) {
                    borderWidthOrDefaultTo5 = raw2;
                }
                if (z) {
                    f2 = borderWidthOrDefaultTo5;
                } else {
                    f2 = borderWidthOrDefaultTo4;
                }
                if (z) {
                    borderWidthOrDefaultTo5 = borderWidthOrDefaultTo4;
                }
                borderWidthOrDefaultTo4 = f2;
            } else {
                if (z) {
                    f = raw2;
                } else {
                    f = raw;
                }
                if (!z) {
                    raw = raw2;
                }
                if (!C5126d.m30596a(f)) {
                    borderWidthOrDefaultTo4 = f;
                }
                if (!C5126d.m30596a(raw)) {
                    borderWidthOrDefaultTo5 = raw;
                }
            }
        }
        return new RectF(borderWidthOrDefaultTo4, borderWidthOrDefaultTo2, borderWidthOrDefaultTo5, borderWidthOrDefaultTo3);
    }

    public float getFullBorderRadius() {
        if (C5126d.m30596a(this.mBorderRadius)) {
            return 0.0f;
        }
        return this.mBorderRadius;
    }

    public float getFullBorderWidth() {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null || C5126d.m30596a(spacing.getRaw(8))) {
            return 0.0f;
        }
        return this.mBorderWidth.getRaw(8);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return ColorUtil.getOpacityFromColor(ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if ((C5126d.m30596a(this.mBorderRadius) || this.mBorderRadius <= 0.0f) && this.mBorderCornerRadii == null) {
            outline.setRect(getBounds());
            return;
        }
        updatePath();
        outline.setConvexPath(this.mPathForBorderRadiusOutline);
    }

    public int getResolvedLayoutDirection() {
        return this.mLayoutDirection;
    }

    public boolean hasRoundedBorders() {
        if (!C5126d.m30596a(this.mBorderRadius) && this.mBorderRadius > 0.0f) {
            return true;
        }
        float[] fArr = this.mBorderCornerRadii;
        if (fArr != null) {
            for (float f : fArr) {
                if (!C5126d.m30596a(f) && f > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public boolean onResolvedLayoutDirectionChanged(int i) {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.mAlpha) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    public void setBorderColor(int i, float f, float f2) {
        setBorderRGB(i, f);
        setBorderAlpha(i, f2);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public void setBorderStyle(String str) {
        BorderStyle borderStyle;
        if (str == null) {
            borderStyle = null;
        } else {
            borderStyle = BorderStyle.valueOf(str.toUpperCase(Locale.US));
        }
        if (this.mBorderStyle != borderStyle) {
            this.mBorderStyle = borderStyle;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setBorderWidth(int i, float f) {
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new Spacing();
        }
        if (!FloatUtil.floatsEqual(this.mBorderWidth.getRaw(i), f)) {
            this.mBorderWidth.set(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.mNeedUpdatePathForBorderRadius = true;
            }
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        this.mColor = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setRadius(float f) {
        if (!FloatUtil.floatsEqual(this.mBorderRadius, f)) {
            this.mBorderRadius = f;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public boolean setResolvedLayoutDirection(int i) {
        if (this.mLayoutDirection == i) {
            return false;
        }
        this.mLayoutDirection = i;
        return onResolvedLayoutDirectionChanged(i);
    }

    private void updatePathEffect(int i) {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? BorderStyle.getPathEffect(borderStyle, i) : null);
    }

    public void setRadius(float f, int i) {
        if (this.mBorderCornerRadii == null) {
            float[] fArr = new float[8];
            this.mBorderCornerRadii = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (!FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f)) {
            this.mBorderCornerRadii[i] = f;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }
}
