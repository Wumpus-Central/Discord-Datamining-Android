package p366ub;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: ub.b */
/* loaded from: classes3.dex */
public class C13241b {
    /* renamed from: a */
    public static TypedValue m4246a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m4245b(Context context, int i, boolean z) {
        TypedValue a = m4246a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        if (a.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m4244c(Context context, int i, int i2) {
        TypedValue a = m4246a(context, i);
        if (a == null || a.type != 16) {
            return i2;
        }
        return a.data;
    }

    /* renamed from: d */
    public static int m4243d(Context context, int i, String str) {
        TypedValue a = m4246a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: e */
    public static int m4242e(View view, int i) {
        return m4243d(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
