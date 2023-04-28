package lb;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C2382a;
import p366ub.C13241b;

/* renamed from: lb.a */
/* loaded from: classes3.dex */
public class C10395a {
    /* renamed from: a */
    public static int m13520a(int i, int i2) {
        return C2382a.m37920k(i, (Color.alpha(i) * i2) / 255);
    }

    /* renamed from: b */
    public static int m13519b(Context context, int i, int i2) {
        TypedValue a = C13241b.m4246a(context, i);
        if (a != null) {
            return a.data;
        }
        return i2;
    }

    /* renamed from: c */
    public static int m13518c(Context context, int i, String str) {
        return C13241b.m4243d(context, i, str);
    }

    /* renamed from: d */
    public static int m13517d(View view, int i) {
        return C13241b.m4242e(view, i);
    }

    /* renamed from: e */
    public static int m13516e(View view, int i, int i2) {
        return m13519b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static boolean m13515f(int i) {
        return i != 0 && C2382a.m37927d(i) > 0.5d;
    }

    /* renamed from: g */
    public static int m13514g(int i, int i2) {
        return C2382a.m37924g(i2, i);
    }

    /* renamed from: h */
    public static int m13513h(int i, int i2, float f) {
        return m13514g(i, C2382a.m37920k(i2, Math.round(Color.alpha(i2) * f)));
    }

    /* renamed from: i */
    public static int m13512i(View view, int i, int i2, float f) {
        return m13513h(m13517d(view, i), m13517d(view, i2), f);
    }
}
