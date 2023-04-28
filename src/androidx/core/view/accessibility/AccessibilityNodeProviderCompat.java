package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {

    /* renamed from: a */
    private final Object f3586a;

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$a */
    /* loaded from: classes.dex */
    static class C2560a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final AccessibilityNodeProviderCompat f3587a;

        C2560a(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f3587a = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfoCompat b = this.f3587a.mo36636b(i);
            if (b == null) {
                return null;
            }
            return b.m37410H0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<AccessibilityNodeInfoCompat> c = this.f3587a.m37328c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).m37410H0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f3587a.mo36634f(i, i2, bundle);
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$b */
    /* loaded from: classes.dex */
    static class C2561b extends C2560a {
        C2561b(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            AccessibilityNodeInfoCompat d = this.f3587a.mo36635d(i);
            if (d == null) {
                return null;
            }
            return d.m37410H0();
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$c */
    /* loaded from: classes.dex */
    static class C2562c extends C2561b {
        C2562c(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3587a.m37329a(i, AccessibilityNodeInfoCompat.m37408I0(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3586a = new C2562c(this);
        } else {
            this.f3586a = new C2561b(this);
        }
    }

    /* renamed from: a */
    public void m37329a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public AccessibilityNodeInfoCompat mo36636b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<AccessibilityNodeInfoCompat> m37328c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public AccessibilityNodeInfoCompat mo36635d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object m37327e() {
        return this.f3586a;
    }

    /* renamed from: f */
    public boolean mo36634f(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.f3586a = obj;
    }
}
