package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p034c1.AbstractMenuItemC3753b;

/* renamed from: androidx.core.view.l0 */
/* loaded from: classes.dex */
public final class C2660l0 {

    /* renamed from: androidx.core.view.l0$a */
    /* loaded from: classes.dex */
    static class C2661a {
        /* renamed from: a */
        static int m37210a(MenuItem menuItem) {
            int alphabeticModifiers;
            alphabeticModifiers = menuItem.getAlphabeticModifiers();
            return alphabeticModifiers;
        }

        /* renamed from: b */
        static CharSequence m37209b(MenuItem menuItem) {
            CharSequence contentDescription;
            contentDescription = menuItem.getContentDescription();
            return contentDescription;
        }

        /* renamed from: c */
        static ColorStateList m37208c(MenuItem menuItem) {
            ColorStateList iconTintList;
            iconTintList = menuItem.getIconTintList();
            return iconTintList;
        }

        /* renamed from: d */
        static PorterDuff.Mode m37207d(MenuItem menuItem) {
            PorterDuff.Mode iconTintMode;
            iconTintMode = menuItem.getIconTintMode();
            return iconTintMode;
        }

        /* renamed from: e */
        static int m37206e(MenuItem menuItem) {
            int numericModifiers;
            numericModifiers = menuItem.getNumericModifiers();
            return numericModifiers;
        }

        /* renamed from: f */
        static CharSequence m37205f(MenuItem menuItem) {
            CharSequence tooltipText;
            tooltipText = menuItem.getTooltipText();
            return tooltipText;
        }

        /* renamed from: g */
        static MenuItem m37204g(MenuItem menuItem, char c, int i) {
            MenuItem alphabeticShortcut;
            alphabeticShortcut = menuItem.setAlphabeticShortcut(c, i);
            return alphabeticShortcut;
        }

        /* renamed from: h */
        static MenuItem m37203h(MenuItem menuItem, CharSequence charSequence) {
            MenuItem contentDescription;
            contentDescription = menuItem.setContentDescription(charSequence);
            return contentDescription;
        }

        /* renamed from: i */
        static MenuItem m37202i(MenuItem menuItem, ColorStateList colorStateList) {
            MenuItem iconTintList;
            iconTintList = menuItem.setIconTintList(colorStateList);
            return iconTintList;
        }

        /* renamed from: j */
        static MenuItem m37201j(MenuItem menuItem, PorterDuff.Mode mode) {
            MenuItem iconTintMode;
            iconTintMode = menuItem.setIconTintMode(mode);
            return iconTintMode;
        }

        /* renamed from: k */
        static MenuItem m37200k(MenuItem menuItem, char c, int i) {
            MenuItem numericShortcut;
            numericShortcut = menuItem.setNumericShortcut(c, i);
            return numericShortcut;
        }

        /* renamed from: l */
        static MenuItem m37199l(MenuItem menuItem, char c, char c2, int i, int i2) {
            MenuItem shortcut;
            shortcut = menuItem.setShortcut(c, c2, i, i2);
            return shortcut;
        }

        /* renamed from: m */
        static MenuItem m37198m(MenuItem menuItem, CharSequence charSequence) {
            MenuItem tooltipText;
            tooltipText = menuItem.setTooltipText(charSequence);
            return tooltipText;
        }
    }

    /* renamed from: a */
    public static MenuItem m37217a(MenuItem menuItem, AbstractC2599b bVar) {
        if (menuItem instanceof AbstractMenuItemC3753b) {
            return ((AbstractMenuItemC3753b) menuItem).mo16221b(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m37216b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC3753b) {
            ((AbstractMenuItemC3753b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2661a.m37204g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m37215c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC3753b) {
            ((AbstractMenuItemC3753b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2661a.m37203h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m37214d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof AbstractMenuItemC3753b) {
            ((AbstractMenuItemC3753b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2661a.m37202i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m37213e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof AbstractMenuItemC3753b) {
            ((AbstractMenuItemC3753b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2661a.m37201j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m37212f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC3753b) {
            ((AbstractMenuItemC3753b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2661a.m37200k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m37211g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC3753b) {
            ((AbstractMenuItemC3753b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2661a.m37198m(menuItem, charSequence);
        }
    }
}
