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
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m15073d2 = {"addCircleRipple", "", "Landroid/view/View;", "foreground", "", "addRipple", "cornerRadius", "", "setDrawableRipple", "maskShape", "Landroid/graphics/drawable/shapes/Shape;", "ripple_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class RippleUtilsKt {
    public static final void addCircleRipple(View view, boolean z) {
        C9677q.m14633g(view, "<this>");
        setDrawableRipple(view, z, new OvalShape());
    }

    public static /* synthetic */ void addCircleRipple$default(View view, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        addCircleRipple(view, z);
    }

    public static final void addRipple(View view, boolean z, int i) {
        C9677q.m14633g(view, "<this>");
        float f = i;
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = f;
        }
        setDrawableRipple(view, z, new RoundRectShape(fArr, null, null));
    }

    public static /* synthetic */ void addRipple$default(View view, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        addRipple(view, z, i);
    }

    private static final void setDrawableRipple(View view, boolean z, Shape shape) {
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(ThemeManagerKt.getTheme().getAndroidRipple()), null, new ShapeDrawable(shape));
        if (z) {
            view.setForeground(rippleDrawable);
        } else {
            view.setBackground(rippleDrawable);
        }
    }
}
