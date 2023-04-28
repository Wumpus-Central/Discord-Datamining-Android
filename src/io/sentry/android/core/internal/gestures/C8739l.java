package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.util.C9111k;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.internal.gestures.l */
/* loaded from: classes8.dex */
public final class C8739l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static View m18232a(View view, float f, float f2, AbstractC8738k kVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        int[] iArr = new int[2];
        View view2 = null;
        while (arrayDeque.size() > 0) {
            View view3 = (View) C9111k.m16995a((View) arrayDeque.poll(), "view is required");
            if (kVar.mo18234a(view3)) {
                if (kVar.mo18233b()) {
                    return view3;
                }
                view2 = view3;
            }
            if (view3 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view3;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (m18226g(childAt, f, f2, iArr)) {
                        arrayDeque.add(childAt);
                    }
                }
            }
        }
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m18231b(View view) {
        int id2 = view.getId();
        Resources resources = view.getContext().getResources();
        if (resources != null) {
            return resources.getResourceEntryName(id2);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m18230c(View view) {
        int id2 = view.getId();
        try {
            return m18231b(view);
        } catch (Resources.NotFoundException unused) {
            return "0x" + Integer.toString(id2, 16);
        }
    }

    /* renamed from: d */
    private static boolean m18229d(View view, boolean z) {
        if (!z) {
            return false;
        }
        return ScrollingView.class.isAssignableFrom(view.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m18228e(View view, boolean z) {
        if ((m18229d(view, z) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m18227f(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    /* renamed from: g */
    private static boolean m18226g(View view, float f, float f2, int[] iArr) {
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < i || f > i + width || f2 < i2 || f2 > i2 + height) {
            return false;
        }
        return true;
    }
}
