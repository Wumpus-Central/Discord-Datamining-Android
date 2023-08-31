package com.discord.chat.presentation.list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/list/MaskedShadowView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "borderRadius", "", "path", "Landroid/graphics/Path;", ViewProps.SHADOW_COLOR, "", "shadowElevation", "shadowPaint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setParams", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MaskedShadowView extends View {
    private float borderRadius;
    private final Path path;
    private String shadowColor;
    private float shadowElevation;
    private final Paint shadowPaint;

    
    public MaskedShadowView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  MaskedShadowView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override 
    protected void onDraw(Canvas canvas) {
        q.h(canvas, "canvas");
        super.onDraw(canvas);
        if (getVisibility() == 0 && getWidth() != 0 && getHeight() != 0) {
            this.path.reset();
            float f10 = this.borderRadius;
            this.path.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f10, f10, Path.Direction.CW);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.path);
            } else {
                canvas.clipPath(this.path, Region.Op.DIFFERENCE);
            }
            float f11 = this.shadowElevation / 2;
            float f12 = this.borderRadius;
            canvas.drawRoundRect(-f11, 0.0f, getWidth() + f11, getHeight() + f11, f12, f12, this.shadowPaint);
        }
    }

    public final void setParams(float f10, float f11, String shadowColor) {
        q.h(shadowColor, "shadowColor");
        this.borderRadius = f11;
        this.shadowElevation = f10;
        this.shadowColor = shadowColor;
        this.shadowPaint.setShadowLayer(f10, 0.0f, f10 / 2, Color.parseColor(shadowColor));
        invalidate();
    }

    
    public MaskedShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        this.shadowColor = "#28000000";
        this.shadowElevation = SizeUtilsKt.getDpToPx(10);
        this.path = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        float f10 = this.shadowElevation;
        paint.setShadowLayer(f10, 0.0f, f10 / 2, Color.parseColor(this.shadowColor));
        this.shadowPaint = paint;
    }
}
