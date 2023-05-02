package com.discord;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"setTextSizeSp", "", "Landroid/widget/TextView;", "textSizeSp", "", "sizeSp", "maxScaledSizeSp", "fonts_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetTextSizeSpKt {
    public static final void setTextSizeSp(TextView textView, float f10) {
        q.g(textView, "<this>");
        textView.setTextSize(2, f10);
    }

    public static /* synthetic */ void setTextSizeSp$default(TextView textView, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = Float.MAX_VALUE;
        }
        setTextSizeSp(textView, f10, f11);
    }

    public static final void setTextSizeSp(TextView textView, float f10, float f11) {
        q.g(textView, "<this>");
        float f12 = textView.getContext().getResources().getConfiguration().fontScale;
        float f13 = f10 / f12;
        setTextSizeSp(textView, f13 * Math.min(f12, f11 / f13));
    }
}
