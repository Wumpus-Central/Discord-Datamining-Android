package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public class C2795h {

    /* renamed from: androidx.core.widget.h$a */
    /* loaded from: classes.dex */
    static class C2796a {
        /* renamed from: a */
        static ColorStateList m36706a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m36705b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m36704c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m36703d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m36710a(ImageView imageView) {
        return C2796a.m36706a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m36709b(ImageView imageView) {
        return C2796a.m36705b(imageView);
    }

    /* renamed from: c */
    public static void m36708c(ImageView imageView, ColorStateList colorStateList) {
        C2796a.m36704c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m36707d(ImageView imageView, PorterDuff.Mode mode) {
        C2796a.m36703d(imageView, mode);
    }
}
