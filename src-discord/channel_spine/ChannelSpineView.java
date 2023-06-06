package com.discord.channel_spine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00012B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020\u0018H\u0002J\u0006\u0010$\u001a\u00020%J \u0010&\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0014J\u0018\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0014J\b\u00100\u001a\u00020%H\u0002J\u0018\u00101\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000e¨\u00063"}, d2 = {"Lcom/discord/channel_spine/ChannelSpineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "arcRect", "Landroid/graphics/RectF;", "horizontalPadding", "", "getHorizontalPadding", "()I", "setHorizontalPadding", "(I)V", "isReplySpline", "", "value", "numRows", "getNumRows", "setNumRows", "paths", "", "Landroid/graphics/Path;", "", "rowHeight", "getRowHeight", "()F", "setRowHeight", "(F)V", "spinePaint", "Landroid/graphics/Paint;", "verticalPadding", "getVerticalPadding", "setVerticalPadding", "arcPercent", "configureAsReplySpline", "", "createSpinePath", "rowIndex", "direction", "Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "rebuildLayout", "yOfRow", "SpineDirection", "channel_spine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChannelSpineView extends View {
    private final RectF arcRect;
    private int horizontalPadding;
    private boolean isReplySpline;
    private int numRows;
    private List<? extends Path> paths;
    private float rowHeight;
    private final Paint spinePaint;
    private int verticalPadding;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;", "", "arcSweepAngle", "", "(Ljava/lang/String;IF)V", "getArcSweepAngle", "()F", "TOP_TO_BOTTOM", "BOTTOM_TO_TOP", "channel_spine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public enum SpineDirection {
        TOP_TO_BOTTOM(-90.0f),
        BOTTOM_TO_TOP(90.0f);
        
        private final float arcSweepAngle;

        SpineDirection(float f10) {
            this.arcSweepAngle = f10;
        }

        public final float getArcSweepAngle() {
            return this.arcSweepAngle;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpineDirection.values().length];
            try {
                iArr[SpineDirection.TOP_TO_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpineDirection.BOTTOM_TO_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelSpineView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ ChannelSpineView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final float arcPercent() {
        return this.isReplySpline ? 0.25f : 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAsReplySpline$lambda$1(ChannelSpineView this$0, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        q.g(this$0, "this$0");
        this$0.setRowHeight(SizeUtilsKt.getPxToDp(i13 - i11));
    }

    private final Path createSpinePath(float f10, int i10, SpineDirection spineDirection) {
        float f11;
        float f12;
        Path path = new Path();
        float strokeWidth = this.spinePaint.getStrokeWidth() / 2.0f;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[spineDirection.ordinal()];
        if (i11 == 1) {
            f11 = yOfRow(f10, i10);
        } else if (i11 == 2) {
            f11 = yOfRow(f10, i10 + 1);
        } else {
            throw new kg.q();
        }
        if (this.isReplySpline) {
            f12 = SizeUtilsKt.getDpToPx(9);
        } else {
            f12 = 0.5f * f10;
        }
        float yOfRow = ((yOfRow(f10, i10) - this.verticalPadding) - strokeWidth) + f12;
        float measuredWidth = getMeasuredWidth() - this.horizontalPadding;
        float arcPercent = arcPercent() * getMeasuredWidth();
        int i12 = iArr[spineDirection.ordinal()];
        if (i12 == 1) {
            this.arcRect.set(strokeWidth, yOfRow - arcPercent, arcPercent + strokeWidth, yOfRow);
        } else if (i12 == 2) {
            this.arcRect.set(strokeWidth, yOfRow, strokeWidth + arcPercent, arcPercent + yOfRow);
        }
        path.moveTo(strokeWidth, f11);
        path.arcTo(this.arcRect, 180.0f, spineDirection.getArcSweepAngle(), false);
        path.lineTo(measuredWidth, yOfRow);
        return path;
    }

    private final void rebuildLayout() {
        List<? extends Path> i10;
        SpineDirection spineDirection;
        int i11 = this.numRows;
        float dpToPx = SizeUtilsKt.getDpToPx(this.rowHeight);
        if (i11 == 0 || dpToPx <= 1.0E-4f) {
            i10 = j.i();
            this.paths = i10;
            return;
        }
        int i12 = 1;
        if (i11 <= 1) {
            i12 = 0;
        }
        ArrayList arrayList = new ArrayList(i11 + i12);
        int i13 = i11 - 1;
        for (int i14 = 0; i14 < i11; i14++) {
            if (this.isReplySpline) {
                spineDirection = SpineDirection.BOTTOM_TO_TOP;
            } else {
                spineDirection = SpineDirection.TOP_TO_BOTTOM;
            }
            arrayList.add(createSpinePath(dpToPx, i14, spineDirection));
            if (i14 < i13) {
                arrayList.add(createSpinePath(dpToPx, i14, SpineDirection.BOTTOM_TO_TOP));
            }
        }
        if (i12 != 0) {
            Path path = new Path();
            float strokeWidth = this.spinePaint.getStrokeWidth() / 2.0f;
            path.moveTo(strokeWidth, this.verticalPadding);
            path.lineTo(strokeWidth, yOfRow(dpToPx, i11 - 2) + (dpToPx / 2.0f));
            arrayList.add(path);
        }
        this.paths = arrayList;
    }

    private final float yOfRow(float f10, int i10) {
        return this.verticalPadding + (i10 * f10);
    }

    public final void configureAsReplySpline() {
        this.isReplySpline = true;
        this.verticalPadding = SizeUtilsKt.getDpToPx(0);
        this.horizontalPadding = SizeUtilsKt.getDpToPx(0);
        setNumRows(1);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.channel_spine.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                ChannelSpineView.configureAsReplySpline$lambda$1(ChannelSpineView.this, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final int getNumRows() {
        return this.numRows;
    }

    public final float getRowHeight() {
        return this.rowHeight;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        q.g(canvas, "canvas");
        super.onDraw(canvas);
        int save = canvas.save();
        for (Path path : this.paths) {
            canvas.drawPath(path, this.spinePaint);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        Number number;
        float f10;
        if (this.numRows != 0) {
            boolean z11 = true;
            if (this.rowHeight == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                    i12 = View.MeasureSpec.getSize(i10);
                } else {
                    i12 = 0;
                }
                float f11 = this.numRows * this.rowHeight;
                int mode2 = View.MeasureSpec.getMode(i11);
                if (mode2 == Integer.MIN_VALUE) {
                    f10 = bh.j.f(f11, View.MeasureSpec.getSize(i11));
                    number = Float.valueOf(f10);
                } else if (mode2 != 1073741824) {
                    number = Float.valueOf(f11);
                } else {
                    number = Integer.valueOf(View.MeasureSpec.getSize(i11));
                }
                if (i12 == getMeasuredWidth()) {
                    z11 = false;
                }
                setMeasuredDimension(i12, number.intValue());
                if (z11) {
                    rebuildLayout();
                    invalidate();
                    return;
                }
                return;
            }
        }
        super.onMeasure(i10, i11);
    }

    public final void setHorizontalPadding(int i10) {
        this.horizontalPadding = i10;
    }

    public final void setNumRows(int i10) {
        boolean z10;
        if (this.numRows != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.numRows = i10;
        if (z10 && this.rowHeight > 0.0f) {
            rebuildLayout();
            invalidate();
            requestLayout();
        }
    }

    public final void setRowHeight(float f10) {
        boolean z10;
        if (this.rowHeight == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = !z10;
        this.rowHeight = f10;
        if (z11 && this.numRows > 0) {
            rebuildLayout();
            invalidate();
            requestLayout();
        }
    }

    public final void setVerticalPadding(int i10) {
        this.verticalPadding = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelSpineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        List<? extends Path> i11;
        q.g(context, "context");
        Paint paint = new Paint();
        if (!isInEditMode()) {
            i10 = ThemeManagerKt.getTheme().getBackgroundAccent();
        } else {
            i10 = ColorUtilsKt.getColorCompat(context, R.color.primary_500);
        }
        paint.setColor(i10);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(getResources().getDimension(R.dimen.spine_width));
        paint.setStyle(Paint.Style.STROKE);
        this.spinePaint = paint;
        this.verticalPadding = SizeUtilsKt.getDpToPx(8);
        this.horizontalPadding = SizeUtilsKt.getDpToPx(0);
        this.arcRect = new RectF();
        i11 = j.i();
        this.paths = i11;
        setWillNotDraw(false);
    }
}
