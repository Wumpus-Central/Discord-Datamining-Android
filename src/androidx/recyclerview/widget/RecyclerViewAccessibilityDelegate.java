package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerViewAccessibilityDelegate extends C2549a {

    /* renamed from: a */
    final RecyclerView f4753a;

    /* renamed from: b */
    private final C3110a f4754b;

    /* renamed from: androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$a */
    /* loaded from: classes.dex */
    public static class C3110a extends C2549a {

        /* renamed from: a */
        final RecyclerViewAccessibilityDelegate f4755a;

        /* renamed from: b */
        private Map<View, C2549a> f4756b = new WeakHashMap();

        public C3110a(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.f4755a = recyclerViewAccessibilityDelegate;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C2549a m35314a(View view) {
            return this.f4756b.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m35313b(View view) {
            C2549a l = C2733w0.m37001l(view);
            if (l != null && l != this) {
                this.f4756b.put(view, l);
            }
        }

        @Override // androidx.core.view.C2549a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2549a aVar = this.f4756b.get(view);
            if (aVar != null) {
                return aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C2549a
        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
            C2549a aVar = this.f4756b.get(view);
            if (aVar != null) {
                return aVar.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2549a aVar = this.f4756b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f4755a.m35315b() || this.f4755a.f4753a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                return;
            }
            this.f4755a.f4753a.getLayoutManager().m35473W0(view, accessibilityNodeInfoCompat);
            C2549a aVar = this.f4756b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            }
        }

        @Override // androidx.core.view.C2549a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2549a aVar = this.f4756b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C2549a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C2549a aVar = this.f4756b.get(viewGroup);
            if (aVar != null) {
                return aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C2549a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.f4755a.m35315b() || this.f4755a.f4753a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            C2549a aVar = this.f4756b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.f4755a.f4753a.getLayoutManager().m35440q1(view, i, bundle);
        }

        @Override // androidx.core.view.C2549a
        public void sendAccessibilityEvent(View view, int i) {
            C2549a aVar = this.f4756b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // androidx.core.view.C2549a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C2549a aVar = this.f4756b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.f4753a = recyclerView;
        C2549a a = m35316a();
        if (a == null || !(a instanceof C3110a)) {
            this.f4754b = new C3110a(this);
        } else {
            this.f4754b = (C3110a) a;
        }
    }

    /* renamed from: a */
    public C2549a m35316a() {
        return this.f4754b;
    }

    /* renamed from: b */
    boolean m35315b() {
        return this.f4753a.hasPendingAdapterUpdates();
    }

    @Override // androidx.core.view.C2549a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !m35315b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo35289S0(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.C2549a
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!m35315b() && this.f4753a.getLayoutManager() != null) {
            this.f4753a.getLayoutManager().m35476U0(accessibilityNodeInfoCompat);
        }
    }

    @Override // androidx.core.view.C2549a
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (m35315b() || this.f4753a.getLayoutManager() == null) {
            return false;
        }
        return this.f4753a.getLayoutManager().m35445o1(i, bundle);
    }
}
