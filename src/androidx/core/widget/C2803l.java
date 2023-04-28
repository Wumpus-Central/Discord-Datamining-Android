package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.C2517g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.l */
/* loaded from: classes.dex */
public final class C2803l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.l$a */
    /* loaded from: classes.dex */
    public static class C2804a {
        /* renamed from: a */
        static boolean m36670a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m36669b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m36668c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.l$b */
    /* loaded from: classes.dex */
    public static class C2805b {
        /* renamed from: a */
        static Drawable[] m36667a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m36666b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m36665c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m36664d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m36663e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m36662f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m36661g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m36660h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.l$c */
    /* loaded from: classes.dex */
    public static class C2806c {
        /* renamed from: a */
        static int m36659a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m36658b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m36657c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m36656d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m36655e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        static void m36654f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m36653g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m36652h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.l$d */
    /* loaded from: classes.dex */
    public static class C2807d {
        /* renamed from: a */
        static DecimalFormatSymbols m36651a(Locale locale) {
            DecimalFormatSymbols instance;
            instance = DecimalFormatSymbols.getInstance(locale);
            return instance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.l$e */
    /* loaded from: classes.dex */
    public static class C2808e {
        /* renamed from: a */
        static String[] m36650a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        /* renamed from: b */
        static PrecomputedText.Params m36649b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        /* renamed from: c */
        static void m36648c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.l$f */
    /* loaded from: classes.dex */
    public static class ActionMode$CallbackC2809f implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f3716a;

        /* renamed from: b */
        private final TextView f3717b;

        /* renamed from: c */
        private Class<?> f3718c;

        /* renamed from: d */
        private Method f3719d;

        /* renamed from: e */
        private boolean f3720e;

        /* renamed from: f */
        private boolean f3721f = false;

        ActionMode$CallbackC2809f(ActionMode.Callback callback, TextView textView) {
            this.f3716a = callback;
            this.f3717b = textView;
        }

        /* renamed from: a */
        private Intent m36647a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m36646b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m36647a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m36643e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m36645c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m36647a(), 0)) {
                if (m36642f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        private boolean m36643e(TextView textView) {
            if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private boolean m36642f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private void m36641g(Menu menu) {
            Method method;
            Context context = this.f3717b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3721f) {
                this.f3721f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3718c = cls;
                    this.f3719d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f3720e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3718c = null;
                    this.f3719d = null;
                    this.f3720e = false;
                }
            }
            try {
                if (!this.f3720e || !this.f3718c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    method = this.f3719d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c = m36645c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m36646b(resolveInfo, this.f3717b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: d */
        ActionMode.Callback m36644d() {
            return this.f3716a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3716a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3716a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3716a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m36641g(menu);
            return this.f3716a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m36687a(TextView textView) {
        return C2805b.m36667a(textView);
    }

    /* renamed from: b */
    public static int m36686b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m36685c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    private static int m36684d(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: e */
    private static TextDirectionHeuristic m36683e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (C2805b.m36666b(textView) == 1) {
                z = true;
            }
            switch (C2805b.m36665c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(C2808e.m36650a(C2807d.m36651a(C2805b.m36664d(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: f */
    public static PrecomputedTextCompat.Params m36682f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PrecomputedTextCompat.Params(C2808e.m36649b(textView));
        }
        PrecomputedTextCompat.Params.C2484a aVar = new PrecomputedTextCompat.Params.C2484a(new TextPaint(textView.getPaint()));
        aVar.m37655b(C2806c.m36659a(textView));
        aVar.m37654c(C2806c.m36656d(textView));
        aVar.m37653d(m36683e(textView));
        return aVar.m37656a();
    }

    /* renamed from: g */
    public static void m36681g(TextView textView, ColorStateList colorStateList) {
        C2517g.m37588g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C2806c.m36654f(textView, colorStateList);
        } else if (textView instanceof AbstractC2814q) {
            ((AbstractC2814q) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: h */
    public static void m36680h(TextView textView, PorterDuff.Mode mode) {
        C2517g.m37588g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C2806c.m36653g(textView, mode);
        } else if (textView instanceof AbstractC2814q) {
            ((AbstractC2814q) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: i */
    public static void m36679i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C2805b.m36663e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: j */
    public static void m36678j(TextView textView, int i) {
        int i2;
        C2517g.m37591d(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C2808e.m36648c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C2804a.m36670a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: k */
    public static void m36677k(TextView textView, int i) {
        int i2;
        C2517g.m37591d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C2804a.m36670a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: l */
    public static void m36676l(TextView textView, int i) {
        C2517g.m37591d(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* renamed from: m */
    public static void m36675m(TextView textView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(precomputedTextCompat.m37662b());
        } else if (m36682f(textView).m37661a(precomputedTextCompat.m37663a())) {
            textView.setText(precomputedTextCompat);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: n */
    public static void m36674n(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    /* renamed from: o */
    public static void m36673o(TextView textView, PrecomputedTextCompat.Params params) {
        C2805b.m36660h(textView, m36684d(params.m37658d()));
        textView.getPaint().set(params.m37657e());
        C2806c.m36655e(textView, params.m37660b());
        C2806c.m36652h(textView, params.m37659c());
    }

    /* renamed from: p */
    public static ActionMode.Callback m36672p(ActionMode.Callback callback) {
        if (!(callback instanceof ActionMode$CallbackC2809f) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((ActionMode$CallbackC2809f) callback).m36644d();
    }

    /* renamed from: q */
    public static ActionMode.Callback m36671q(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC2809f) || callback == null) {
            return callback;
        }
        return new ActionMode$CallbackC2809f(callback, textView);
    }
}
