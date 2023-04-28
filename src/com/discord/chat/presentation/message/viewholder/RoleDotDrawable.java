package com.discord.chat.presentation.message.viewholder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.FontManager;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11089r;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0017J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0005J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", ViewProps.BORDER_COLOR, "", "spSize", "(Landroid/content/Context;II)V", "borderColorPaint", "Landroid/graphics/Paint;", "pxSize", "", "roleColorAlphaPaint", "roleColorPaint", "scale", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "p0", "setColor", "roleColor", "setColorFilter", "Landroid/graphics/ColorFilter;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class RoleDotDrawable extends Drawable {
    private final Paint borderColorPaint;
    private final float pxSize;
    private final Paint roleColorAlphaPaint;
    private final Paint roleColorPaint;
    private final float scale;
    private final int spSize;

    public RoleDotDrawable(Context context, int i, int i2) {
        C9971q.m14633g(context, "context");
        this.spSize = i2;
        float fontScale = FontManager.INSTANCE.getFontScale(context);
        this.scale = fontScale;
        this.pxSize = SizeUtilsKt.getSpToPx(i2) * fontScale;
        Paint paint = new Paint();
        paint.setColor(Color.argb(255, Color.red(i), Color.green(i), Color.blue(i)));
        paint.setAntiAlias(true);
        this.borderColorPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.roleColorAlphaPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        this.roleColorPaint = paint3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C9971q.m14633g(canvas, "canvas");
        float f = this.pxSize;
        float f2 = 2;
        float f3 = ((f / f2) + f2) / f2;
        canvas.drawCircle(f / f2, f / f2, f3, this.borderColorPaint);
        float f4 = this.pxSize;
        canvas.drawCircle(f4 / f2, f4 / f2, f3, this.roleColorAlphaPaint);
        float f5 = this.pxSize;
        canvas.drawCircle(f5 / f2, f5 / f2, f3 - f2, this.roleColorPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        throw new C11089r("An operation is not implemented: Not yet implemented");
    }

    public final void setColor(int i) {
        this.roleColorAlphaPaint.setColor(Color.argb(102, Color.red(i), Color.green(i), Color.blue(i)));
        this.roleColorPaint.setColor(Color.argb(255, Color.red(i), Color.green(i), Color.blue(i)));
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new C11089r("An operation is not implemented: Not yet implemented");
    }

    public /* synthetic */ RoleDotDrawable(Context context, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i3 & 4) != 0 ? 20 : i2);
    }
}
