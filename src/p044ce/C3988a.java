package p044ce;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.henninghall.date_picker.C5882b;
import com.henninghall.date_picker.C5899l;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.util.Locale;

/* renamed from: ce.a */
/* loaded from: classes6.dex */
public class C3988a {

    /* renamed from: a */
    private static final AccessibilityManager f6544a = (AccessibilityManager) C5882b.f11696a.getApplicationContext().getSystemService("accessibility");

    /* renamed from: b */
    private static Locale f6545b = Locale.getDefault();

    /* renamed from: ce.a$a */
    /* loaded from: classes6.dex */
    class C0101a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final /* synthetic */ AbstractC5907a f6546a;

        C0101a(AbstractC5907a aVar) {
            this.f6546a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int value = this.f6546a.getValue();
            if (i != 4096) {
                if (i == 8192 && !this.f6546a.mo26893c()) {
                    this.f6546a.mo26894b(value + 1);
                }
            } else if (!this.f6546a.mo26893c()) {
                this.f6546a.mo26894b(value - 1);
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: a */
    public static AccessibilityEvent m33194a(View view, int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        obtain.setClassName(view.getClass().getName());
        obtain.setPackageName(view.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: b */
    public static String m33193b(AbstractC5907a aVar) {
        String obj = aVar.getView().getTag().toString();
        String e = m33190e(aVar, aVar.getValue());
        String c = m33192c(obj);
        return e + ", " + c;
    }

    /* renamed from: c */
    private static String m33192c(String str) {
        Locale d = m33191d();
        return C5899l.m26921e(d, str + "_description");
    }

    /* renamed from: d */
    public static Locale m33191d() {
        return f6545b;
    }

    /* renamed from: e */
    private static String m33190e(AbstractC5907a aVar, int i) {
        String str = aVar.getDisplayedValues()[i];
        if (str != null) {
            return str;
        }
        return String.valueOf(i);
    }

    /* renamed from: f */
    public static void m33189f(AccessibilityEvent accessibilityEvent) {
        AccessibilityManager accessibilityManager = f6544a;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
        }
    }

    /* renamed from: g */
    public static void m33188g(AbstractC5907a aVar, int i) {
        AccessibilityEvent a = m33194a(aVar.getView(), 32);
        a.getText().add(m33190e(aVar, i));
        m33189f(a);
    }

    /* renamed from: h */
    public static void m33187h(Locale locale) {
        f6545b = locale;
    }

    /* renamed from: i */
    public static void m33186i(AbstractC5907a aVar, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.setContentDescription(m33193b(aVar));
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = new AccessibilityNodeInfo.AccessibilityAction(4096, "Increase value");
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = new AccessibilityNodeInfo.AccessibilityAction(8192, "Decrease value");
        accessibilityNodeInfo.addAction(accessibilityAction);
        accessibilityNodeInfo.addAction(accessibilityAction2);
    }

    /* renamed from: j */
    public static boolean m33185j(View view) {
        if (!f6544a.isTouchExplorationEnabled()) {
            return true;
        }
        return view.isAccessibilityFocused();
    }

    /* renamed from: k */
    public static void m33184k(AbstractC5907a aVar) {
        aVar.getView().setAccessibilityDelegate(new C0101a(aVar));
    }
}
