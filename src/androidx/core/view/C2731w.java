package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.w */
/* loaded from: classes.dex */
public final class C2731w {

    /* renamed from: androidx.core.view.w$a */
    /* loaded from: classes.dex */
    static class C2732a {
        /* renamed from: a */
        static int m37073a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m37072b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m37071c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m37070d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m37069e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        static void m37068f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        static void m37067g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        static void m37066h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m37077a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C2732a.m37072b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m37076b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C2732a.m37071c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m37075c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C2732a.m37067g(marginLayoutParams, i);
    }

    /* renamed from: d */
    public static void m37074d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C2732a.m37066h(marginLayoutParams, i);
    }
}
