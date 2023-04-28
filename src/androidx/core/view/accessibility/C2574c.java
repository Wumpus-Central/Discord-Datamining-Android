package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.core.view.accessibility.c */
/* loaded from: classes.dex */
public final class C2574c {

    /* renamed from: androidx.core.view.accessibility.c$a */
    /* loaded from: classes.dex */
    static class C2575a {
        /* renamed from: a */
        static boolean m37319a(AccessibilityManager accessibilityManager, AbstractC2576b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0043c(bVar));
        }

        /* renamed from: b */
        static boolean m37318b(AccessibilityManager accessibilityManager, AbstractC2576b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0043c(bVar));
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$b */
    /* loaded from: classes.dex */
    public interface AbstractC2576b {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.accessibility.c$c  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0043c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final AbstractC2576b f3592a;

        accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0043c(AbstractC2576b bVar) {
            this.f3592a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0043c)) {
                return false;
            }
            return this.f3592a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0043c) obj).f3592a);
        }

        public int hashCode() {
            return this.f3592a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f3592a.onTouchExplorationStateChanged(z);
        }
    }

    /* renamed from: a */
    public static boolean m37321a(AccessibilityManager accessibilityManager, AbstractC2576b bVar) {
        return C2575a.m37319a(accessibilityManager, bVar);
    }

    /* renamed from: b */
    public static boolean m37320b(AccessibilityManager accessibilityManager, AbstractC2576b bVar) {
        return C2575a.m37318b(accessibilityManager, bVar);
    }
}
