package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.r1 */
/* loaded from: classes.dex */
public class C1715r1 {
    /* renamed from: a */
    public static void m40049a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnLongClickListenerC1720s1.m40029f(view, charSequence);
        }
    }
}
