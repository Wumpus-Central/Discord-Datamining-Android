package com.th3rdwave.safeareacontext;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* renamed from: com.th3rdwave.safeareacontext.c */
/* loaded from: classes8.dex */
class C6351c {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Rect m25781a(ViewGroup viewGroup, View view) {
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            return new Rect(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static EdgeInsets m25780b(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        return new EdgeInsets(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), rootWindowInsets.getSystemWindowInsetLeft());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static EdgeInsets m25779c(View view) {
        View rootView;
        EdgeInsets b;
        if (view.getHeight() == 0 || (b = m25780b((rootView = view.getRootView()))) == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        b.f12939a = Math.max(b.f12939a - rect.top, 0.0f);
        b.f12942d = Math.max(b.f12942d - rect.left, 0.0f);
        b.f12941c = Math.max(Math.min((rect.top + view.getHeight()) - rootView.getHeight(), 0.0f) + b.f12941c, 0.0f);
        b.f12940b = Math.max(Math.min((rect.left + view.getWidth()) - rootView.getWidth(), 0.0f) + b.f12940b, 0.0f);
        return b;
    }
}
