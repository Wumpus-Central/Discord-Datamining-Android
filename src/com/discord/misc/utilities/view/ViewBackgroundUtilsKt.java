package com.discord.misc.utilities.view;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a7\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\t¨\u0006\n"}, m15073d2 = {"setBackgroundOval", "", "Landroid/view/View;", ViewProps.COLOR, "", "radiusPx", "setBackgroundRectangle", "strokeColor", "strokeWidth", "(Landroid/view/View;IILjava/lang/Integer;I)V", "misc_utilities_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ViewBackgroundUtilsKt {
    public static final void setBackgroundOval(View view, int i, int i2) {
        C9677q.m14633g(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        view.setBackground(gradientDrawable);
    }

    public static /* synthetic */ void setBackgroundOval$default(View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        setBackgroundOval(view, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setBackgroundRectangle(View view, int i, int i2, Integer num, int i3) {
        PaintDrawable paintDrawable;
        C9677q.m14633g(view, "<this>");
        if (num != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(i3, num.intValue());
            gradientDrawable.setCornerRadius(i2);
            gradientDrawable.setColor(i);
            paintDrawable = gradientDrawable;
        } else {
            PaintDrawable paintDrawable2 = new PaintDrawable(i);
            paintDrawable2.setCornerRadius(i2);
            paintDrawable = paintDrawable2;
        }
        view.setBackground(paintDrawable);
    }

    public static /* synthetic */ void setBackgroundRectangle$default(View view, int i, int i2, Integer num, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        setBackgroundRectangle(view, i, i2, num, i3);
    }
}
