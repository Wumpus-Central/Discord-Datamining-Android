package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.core.widget.k */
/* loaded from: classes.dex */
public final class C2800k {

    /* renamed from: androidx.core.widget.k$a */
    /* loaded from: classes.dex */
    static class C2801a {
        /* renamed from: a */
        static void m36692a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: androidx.core.widget.k$b */
    /* loaded from: classes.dex */
    static class C2802b {
        /* renamed from: a */
        static boolean m36691a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m36690b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m36689c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        static void m36688d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m36695a(PopupWindow popupWindow, boolean z) {
        C2802b.m36689c(popupWindow, z);
    }

    /* renamed from: b */
    public static void m36694b(PopupWindow popupWindow, int i) {
        C2802b.m36688d(popupWindow, i);
    }

    /* renamed from: c */
    public static void m36693c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        C2801a.m36692a(popupWindow, view, i, i2, i3);
    }
}
