package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C2400a {

    /* renamed from: androidx.core.graphics.drawable.a$a */
    /* loaded from: classes.dex */
    static class C0038a {
        /* renamed from: a */
        static int m37824a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m37823b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        static Drawable m37822c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m37821d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m37820e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$b */
    /* loaded from: classes.dex */
    static class C2401b {
        /* renamed from: a */
        static void m37819a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m37818b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m37817c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m37816d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m37815e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        static void m37814f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m37813g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        static void m37812h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m37811i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$c */
    /* loaded from: classes.dex */
    static class C2402c {
        /* renamed from: a */
        static int m37810a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m37809b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m37842a(Drawable drawable, Resources.Theme theme) {
        C2401b.m37819a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m37841b(Drawable drawable) {
        return C2401b.m37818b(drawable);
    }

    /* renamed from: c */
    public static void m37840c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m37839d(Drawable drawable) {
        return C0038a.m37824a(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m37838e(Drawable drawable) {
        return C2401b.m37817c(drawable);
    }

    /* renamed from: f */
    public static int m37837f(Drawable drawable) {
        return C2402c.m37810a(drawable);
    }

    /* renamed from: g */
    public static void m37836g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2401b.m37816d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m37835h(Drawable drawable) {
        return C0038a.m37821d(drawable);
    }

    @Deprecated
    /* renamed from: i */
    public static void m37834i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m37833j(Drawable drawable, boolean z) {
        C0038a.m37820e(drawable, z);
    }

    /* renamed from: k */
    public static void m37832k(Drawable drawable, float f, float f2) {
        C2401b.m37815e(drawable, f, f2);
    }

    /* renamed from: l */
    public static void m37831l(Drawable drawable, int i, int i2, int i3, int i4) {
        C2401b.m37814f(drawable, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static boolean m37830m(Drawable drawable, int i) {
        return C2402c.m37809b(drawable, i);
    }

    /* renamed from: n */
    public static void m37829n(Drawable drawable, int i) {
        C2401b.m37813g(drawable, i);
    }

    /* renamed from: o */
    public static void m37828o(Drawable drawable, ColorStateList colorStateList) {
        C2401b.m37812h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m37827p(Drawable drawable, PorterDuff.Mode mode) {
        C2401b.m37811i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static <T extends Drawable> T m37826q(Drawable drawable) {
        if (drawable instanceof AbstractC2409h) {
            return (T) ((AbstractC2409h) drawable).m37802a();
        }
        return drawable;
    }

    /* renamed from: r */
    public static Drawable m37825r(Drawable drawable) {
        return drawable;
    }
}
