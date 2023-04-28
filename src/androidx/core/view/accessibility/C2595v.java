package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.v */
/* loaded from: classes.dex */
public class C2595v {

    /* renamed from: androidx.core.view.accessibility.v$a */
    /* loaded from: classes.dex */
    static class C2596a {
        /* renamed from: a */
        static int m37296a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m37295b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m37294c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        static void m37293d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: androidx.core.view.accessibility.v$b */
    /* loaded from: classes.dex */
    static class C2597b {
        /* renamed from: a */
        static void m37292a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m37299a(AccessibilityRecord accessibilityRecord, int i) {
        C2596a.m37294c(accessibilityRecord, i);
    }

    /* renamed from: b */
    public static void m37298b(AccessibilityRecord accessibilityRecord, int i) {
        C2596a.m37293d(accessibilityRecord, i);
    }

    /* renamed from: c */
    public static void m37297c(AccessibilityRecord accessibilityRecord, View view, int i) {
        C2597b.m37292a(accessibilityRecord, view, i);
    }
}
