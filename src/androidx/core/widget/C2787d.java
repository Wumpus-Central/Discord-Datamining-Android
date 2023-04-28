package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: androidx.core.widget.d */
/* loaded from: classes.dex */
public final class C2787d {

    /* renamed from: androidx.core.widget.d$a */
    /* loaded from: classes.dex */
    static class C2788a {
        /* renamed from: a */
        static ColorStateList m36725a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m36724b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m36723c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m36722d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    /* loaded from: classes.dex */
    static class C2789b {
        /* renamed from: a */
        static Drawable m36721a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m36729a(CompoundButton compoundButton) {
        return C2789b.m36721a(compoundButton);
    }

    /* renamed from: b */
    public static ColorStateList m36728b(CompoundButton compoundButton) {
        return C2788a.m36725a(compoundButton);
    }

    /* renamed from: c */
    public static void m36727c(CompoundButton compoundButton, ColorStateList colorStateList) {
        C2788a.m36723c(compoundButton, colorStateList);
    }

    /* renamed from: d */
    public static void m36726d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C2788a.m36722d(compoundButton, mode);
    }
}
