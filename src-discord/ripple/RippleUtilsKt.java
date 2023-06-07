package com.discord.ripple;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"addCircleRipple", "", "Landroid/view/View;", "foreground", "", "addRipple", "cornerRadius", "", "setDrawableRipple", "maskShape", "Landroid/graphics/drawable/shapes/Shape;", "ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RippleUtilsKt {
    public static final void addCircleRipple(View view, boolean z10) {
        q.g(view, "<this>");
        setDrawableRipple(view, z10, new OvalShape());
    }

    public static /* synthetic */ void addCircleRipple$default(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        addCircleRipple(view, z10);
    }

    public static final void addRipple(View view, boolean z10, int i10) {
        q.g(view, "<this>");
        float f10 = i10;
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = f10;
        }
        setDrawableRipple(view, z10, new RoundRectShape(fArr, null, null));
    }

    public static /* synthetic */ void addRipple$default(View view, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        addRipple(view, z10, i10);
    }

    private static final void setDrawableRipple(View view, boolean z10, Shape shape) {
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(ThemeManagerKt.getTheme().getAndroidRipple()), null, new ShapeDrawable(shape));
        if (z10) {
            view.setForeground(rippleDrawable);
        } else {
            view.setBackground(rippleDrawable);
        }
    }
}
