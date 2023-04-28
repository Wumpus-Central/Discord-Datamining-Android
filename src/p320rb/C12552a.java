package p320rb;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.core.graphics.C2391d;
import androidx.core.view.animation.C2598a;
import p366ub.C13241b;

/* renamed from: rb.a */
/* loaded from: classes3.dex */
public class C12552a {
    /* renamed from: a */
    private static float m6568a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    private static String m6567b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    private static boolean m6566c(String str, String str2) {
        if (!str.startsWith(str2 + "(") || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m6565d(Context context, int i, int i2) {
        return C13241b.m4244c(context, i, i2);
    }

    /* renamed from: e */
    public static TimeInterpolator m6564e(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m6566c(valueOf, "cubic-bezier")) {
                String[] split = m6567b(valueOf, "cubic-bezier").split(",");
                if (split.length == 4) {
                    return C2598a.m37291a(m6568a(split, 0), m6568a(split, 1), m6568a(split, 2), m6568a(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (m6566c(valueOf, "path")) {
                return C2598a.m37290b(C2391d.m37902e(m6567b(valueOf, "path")));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }
}
