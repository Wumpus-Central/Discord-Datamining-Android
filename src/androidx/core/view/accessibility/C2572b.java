package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
/* loaded from: classes.dex */
public final class C2572b {

    /* renamed from: androidx.core.view.accessibility.b$a */
    /* loaded from: classes.dex */
    static class C2573a {
        /* renamed from: a */
        static int m37323a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m37322b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m37325a(AccessibilityEvent accessibilityEvent) {
        return C2573a.m37323a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m37324b(AccessibilityEvent accessibilityEvent, int i) {
        C2573a.m37322b(accessibilityEvent, i);
    }
}
