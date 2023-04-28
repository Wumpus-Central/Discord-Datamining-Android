package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.j2 */
/* loaded from: classes.dex */
public final class C2649j2 {

    /* renamed from: androidx.core.view.j2$a */
    /* loaded from: classes.dex */
    static class C2650a {
        /* renamed from: a */
        static int m37229a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m37228b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m37227c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m37230a(ViewGroup viewGroup) {
        return C2650a.m37228b(viewGroup);
    }
}
