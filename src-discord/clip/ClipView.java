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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/clip/ClipView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "path", "Landroid/graphics/Path;", "clipCircle", "", "x", "", "y", "r", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "clip_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ClipView extends FrameLayout {
    private final Path path;

    
    public ClipView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  ClipView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void clipCircle(float f10, float f11, float f12) {
        this.path.addCircle(f10, f11, f12, Path.Direction.CCW);
        invalidate();
    }

    @Override 
    protected void onDraw(Canvas canvas) {
        q.g(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.path);
        } else {
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    public final void reset() {
        this.path.rewind();
        invalidate();
    }

    
    public ClipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        this.path = new Path();
        setWillNotDraw(false);
    }
}
