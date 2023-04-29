package com.discord.misc.utilities.view;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a7\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"setBackgroundOval", "", "Landroid/view/View;", ViewProps.COLOR, "", "radiusPx", "setBackgroundRectangle", "strokeColor", "strokeWidth", "(Landroid/view/View;IILjava/lang/Integer;I)V", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewBackgroundUtilsKt {
    public static final void setBackgroundOval(View view, int i10, int i11) {
        q.g(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(i11);
        view.setBackground(gradientDrawable);
    }

    public static /* synthetic */ void setBackgroundOval$default(View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        setBackgroundOval(view, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setBackgroundRectangle(View view, int i10, int i11, Integer num, int i12) {
        PaintDrawable paintDrawable;
        q.g(view, "<this>");
        if (num != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(i12, num.intValue());
            gradientDrawable.setCornerRadius(i11);
            gradientDrawable.setColor(i10);
            paintDrawable = gradientDrawable;
        } else {
            PaintDrawable paintDrawable2 = new PaintDrawable(i10);
            paintDrawable2.setCornerRadius(i11);
            paintDrawable = paintDrawable2;
        }
        view.setBackground(paintDrawable);
    }

    public static /* synthetic */ void setBackgroundRectangle$default(View view, int i10, int i11, Integer num, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        setBackgroundRectangle(view, i10, i11, num, i12);
    }
}
