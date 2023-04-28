package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.view.t */
/* loaded from: classes.dex */
public final class C2706t {

    /* renamed from: androidx.core.view.t$a */
    /* loaded from: classes.dex */
    static class C2707a {
        /* renamed from: a */
        static void m37124a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: b */
        static void m37123b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: c */
        static void m37122c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    /* renamed from: a */
    public static void m37126a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        C2707a.m37123b(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: b */
    public static int m37125b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
