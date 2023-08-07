package com.discord.clip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J(\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0014J\u0006\u0010\u001b\u001a\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/clip/ClipView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "clipToCircle", "", "clipToCirclePath", "Landroid/graphics/Path;", "cutoutCirclePath", "addCircleCutout", "", "x", "", "y", "r", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "", "h", "oldw", "oldh", "resetCircleCutouts", "clip_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ClipView extends FrameLayout {
    private boolean clipToCircle;
    private final Path clipToCirclePath;
    private final Path cutoutCirclePath;

    
    public ClipView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  ClipView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void addCircleCutout(float f10, float f11, float f12) {
        this.cutoutCirclePath.addCircle(f10, f11, f12, Path.Direction.CCW);
        invalidate();
    }

    public final void clipToCircle(boolean z10) {
        this.clipToCircle = z10;
        invalidate();
    }

    @Override 
    protected void onDraw(Canvas canvas) {
        q.h(canvas, "canvas");
        if (!this.clipToCirclePath.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipPath(this.clipToCirclePath);
            } else {
                canvas.clipPath(this.clipToCirclePath, Region.Op.INTERSECT);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.cutoutCirclePath);
        } else {
            canvas.clipPath(this.cutoutCirclePath, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    @Override 
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.clipToCircle) {
            this.clipToCirclePath.rewind();
            this.clipToCirclePath.addOval(0.0f, 0.0f, i10, i11, Path.Direction.CCW);
        }
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public final void resetCircleCutouts() {
        this.cutoutCirclePath.rewind();
        invalidate();
    }

    
    public ClipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        this.cutoutCirclePath = new Path();
        this.clipToCirclePath = new Path();
        setWillNotDraw(false);
    }
}
