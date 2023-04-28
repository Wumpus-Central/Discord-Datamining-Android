package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.r2 */
/* loaded from: classes.dex */
public final class C2696r2 {

    /* renamed from: androidx.core.view.r2$a */
    /* loaded from: classes.dex */
    static class C2697a {
        /* renamed from: a */
        static void m37143a(Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: androidx.core.view.r2$b */
    /* loaded from: classes.dex */
    static class C2698b {
        /* renamed from: a */
        static void m37142a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* renamed from: a */
    public static WindowInsetsControllerCompat m37145a(Window window, View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    /* renamed from: b */
    public static void m37144b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C2698b.m37142a(window, z);
        } else {
            C2697a.m37143a(window, z);
        }
    }
}
