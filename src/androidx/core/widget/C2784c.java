package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class C2784c {

    /* renamed from: androidx.core.widget.c$a */
    /* loaded from: classes.dex */
    private static class C2785a {
        /* renamed from: a */
        static Drawable m36732a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    /* loaded from: classes.dex */
    private static class C2786b {
        /* renamed from: a */
        static void m36731a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        static void m36730b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m36735a(CheckedTextView checkedTextView) {
        return C2785a.m36732a(checkedTextView);
    }

    /* renamed from: b */
    public static void m36734b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        C2786b.m36731a(checkedTextView, colorStateList);
    }

    /* renamed from: c */
    public static void m36733c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        C2786b.m36730b(checkedTextView, mode);
    }
}
