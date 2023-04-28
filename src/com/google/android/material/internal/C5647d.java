package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.C2382a;
import androidx.core.view.C2696r2;
import androidx.core.view.WindowInsetsControllerCompat;
import lb.C10395a;

/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes3.dex */
public class C5647d {
    /* renamed from: a */
    public static void m27876a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2;
        boolean z3 = false;
        if (num == null || num.intValue() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num2 == null || num2.intValue() == 0) {
            z3 = true;
        }
        if (z2 || z3) {
            int b = C10395a.m13519b(window.getContext(), 16842801, -16777216);
            if (z2) {
                num = Integer.valueOf(b);
            }
            if (z3) {
                num2 = Integer.valueOf(b);
            }
        }
        C2696r2.m37144b(window, !z);
        int c = m27874c(window.getContext(), z);
        int b2 = m27875b(window.getContext(), z);
        window.setStatusBarColor(c);
        window.setNavigationBarColor(b2);
        boolean d = m27873d(c, C10395a.m13515f(num.intValue()));
        boolean d2 = m27873d(b2, C10395a.m13515f(num2.intValue()));
        WindowInsetsControllerCompat a = C2696r2.m37145a(window, window.getDecorView());
        if (a != null) {
            a.m37451c(d);
            a.m37452b(d2);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m27875b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return C2382a.m37920k(C10395a.m13519b(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return C10395a.m13519b(context, 16843858, -16777216);
    }

    @TargetApi(21)
    /* renamed from: c */
    private static int m27874c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return C10395a.m13519b(context, 16843857, -16777216);
    }

    /* renamed from: d */
    private static boolean m27873d(int i, boolean z) {
        return C10395a.m13515f(i) || (i == 0 && z);
    }
}
