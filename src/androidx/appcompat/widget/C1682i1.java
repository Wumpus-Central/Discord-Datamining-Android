package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C2382a;
import p052d.C6388j;

/* renamed from: androidx.appcompat.widget.i1 */
/* loaded from: classes.dex */
public class C1682i1 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1388a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1389b = {-16842910};

    /* renamed from: c */
    static final int[] f1390c = {16842908};

    /* renamed from: d */
    static final int[] f1391d = {16843518};

    /* renamed from: e */
    static final int[] f1392e = {16842919};

    /* renamed from: f */
    static final int[] f1393f = {16842912};

    /* renamed from: g */
    static final int[] f1394g = {16842913};

    /* renamed from: h */
    static final int[] f1395h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1396i = new int[0];

    /* renamed from: j */
    private static final int[] f1397j = new int[1];

    /* renamed from: a */
    public static void m40169a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C6388j.f13356y0);
        try {
            if (!obtainStyledAttributes.hasValue(C6388j.f37801D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m40168b(Context context, int i) {
        ColorStateList e = m40165e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1389b, e.getDefaultColor());
        }
        TypedValue f = m40164f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m40166d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m40167c(Context context, int i) {
        int[] iArr = f1397j;
        iArr[0] = i;
        C1698n1 u = C1698n1.m40106u(context, null, iArr);
        try {
            return u.m40125b(0, 0);
        } finally {
            u.m40104w();
        }
    }

    /* renamed from: d */
    static int m40166d(Context context, int i, float f) {
        int c = m40167c(context, i);
        return C2382a.m37920k(c, Math.round(Color.alpha(c) * f));
    }

    /* renamed from: e */
    public static ColorStateList m40165e(Context context, int i) {
        int[] iArr = f1397j;
        iArr[0] = i;
        C1698n1 u = C1698n1.m40106u(context, null, iArr);
        try {
            return u.m40124c(0);
        } finally {
            u.m40104w();
        }
    }

    /* renamed from: f */
    private static TypedValue m40164f() {
        ThreadLocal<TypedValue> threadLocal = f1388a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
