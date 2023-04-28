package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC2152c<V> {

    /* renamed from: a */
    ViewDragHelper f10506a;

    /* renamed from: b */
    AbstractC5518c f10507b;

    /* renamed from: c */
    private boolean f10508c;

    /* renamed from: e */
    private boolean f10510e;

    /* renamed from: d */
    private float f10509d = 0.0f;

    /* renamed from: f */
    int f10511f = 2;

    /* renamed from: g */
    float f10512g = 0.5f;

    /* renamed from: h */
    float f10513h = 0.0f;

    /* renamed from: i */
    float f10514i = 0.5f;

    /* renamed from: j */
    private final ViewDragHelper.AbstractC2820c f10515j = new C5516a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes3.dex */
    class C5516a extends ViewDragHelper.AbstractC2820c {

        /* renamed from: a */
        private int f10516a;

        /* renamed from: b */
        private int f10517b = -1;

        C5516a() {
        }

        /* renamed from: n */
        private boolean m28712n(View view, float f) {
            boolean z;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (C2733w0.m37063B(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f10511f;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f10516a) >= Math.round(view.getWidth() * SwipeDismissBehavior.this.f10512g)) {
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: a */
        public int mo28580a(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int width;
            if (C2733w0.m37063B(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i5 = SwipeDismissBehavior.this.f10511f;
            if (i5 == 0) {
                if (z) {
                    i3 = this.f10516a - view.getWidth();
                    i4 = this.f10516a;
                } else {
                    i3 = this.f10516a;
                    width = view.getWidth();
                    i4 = width + i3;
                }
            } else if (i5 != 1) {
                i3 = this.f10516a - view.getWidth();
                i4 = view.getWidth() + this.f10516a;
            } else if (z) {
                i3 = this.f10516a;
                width = view.getWidth();
                i4 = width + i3;
            } else {
                i3 = this.f10516a - view.getWidth();
                i4 = this.f10516a;
            }
            return SwipeDismissBehavior.m28722G(i3, i, i4);
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: b */
        public int mo28579b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: d */
        public int mo28714d(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: i */
        public void mo28713i(View view, int i) {
            this.f10517b = i;
            this.f10516a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: j */
        public void mo28577j(int i) {
            AbstractC5518c cVar = SwipeDismissBehavior.this.f10507b;
            if (cVar != null) {
                cVar.mo27687b(i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: k */
        public void mo28576k(View view, int i, int i2, int i3, int i4) {
            float width = this.f10516a + (view.getWidth() * SwipeDismissBehavior.this.f10513h);
            float width2 = this.f10516a + (view.getWidth() * SwipeDismissBehavior.this.f10514i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m28723F(0.0f, 1.0f - SwipeDismissBehavior.m28720I(width, width2, f), 1.0f));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: l */
        public void mo28575l(View view, float f, float f2) {
            boolean z;
            int i;
            AbstractC5518c cVar;
            this.f10517b = -1;
            int width = view.getWidth();
            if (m28712n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f10516a;
                if (left < i2) {
                    i = i2 - width;
                } else {
                    i = i2 + width;
                }
                z = true;
            } else {
                i = this.f10516a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f10506a.m36598O(i, view.getTop())) {
                C2733w0.m37006i0(view, new RunnableC5519d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.f10507b) != null) {
                cVar.mo27688a(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: m */
        public boolean mo28574m(View view, int i) {
            int i2 = this.f10517b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo27692E(view)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes3.dex */
    public class C5517b implements AccessibilityViewCommand {
        C5517b() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        /* renamed from: a */
        public boolean mo28572a(View view, AccessibilityViewCommand.AbstractC2563a aVar) {
            boolean z;
            boolean z2 = false;
            if (!SwipeDismissBehavior.this.mo27692E(view)) {
                return false;
            }
            if (C2733w0.m37063B(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = SwipeDismissBehavior.this.f10511f;
            if ((i == 0 && z) || (i == 1 && !z)) {
                z2 = true;
            }
            int width = view.getWidth();
            if (z2) {
                width = -width;
            }
            C2733w0.m37022a0(view, width);
            view.setAlpha(0.0f);
            AbstractC5518c cVar = SwipeDismissBehavior.this.f10507b;
            if (cVar != null) {
                cVar.mo27688a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes3.dex */
    public interface AbstractC5518c {
        /* renamed from: a */
        void mo27688a(View view);

        /* renamed from: b */
        void mo27687b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    /* loaded from: classes3.dex */
    private class RunnableC5519d implements Runnable {

        /* renamed from: k */
        private final View f10520k;

        /* renamed from: l */
        private final boolean f10521l;

        RunnableC5519d(View view, boolean z) {
            this.f10520k = view;
            this.f10521l = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5518c cVar;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f10506a;
            if (viewDragHelper != null && viewDragHelper.m36582m(true)) {
                C2733w0.m37006i0(this.f10520k, this);
            } else if (this.f10521l && (cVar = SwipeDismissBehavior.this.f10507b) != null) {
                cVar.mo27688a(this.f10520k);
            }
        }
    }

    /* renamed from: F */
    static float m28723F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m28722G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m28721H(ViewGroup viewGroup) {
        ViewDragHelper viewDragHelper;
        if (this.f10506a == null) {
            if (this.f10510e) {
                viewDragHelper = ViewDragHelper.m36581n(viewGroup, this.f10509d, this.f10515j);
            } else {
                viewDragHelper = ViewDragHelper.m36580o(viewGroup, this.f10515j);
            }
            this.f10506a = viewDragHelper;
        }
    }

    /* renamed from: I */
    static float m28720I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: N */
    private void m28715N(View view) {
        C2733w0.m37002k0(view, 1048576);
        if (mo27692E(view)) {
            C2733w0.m36998m0(view, AccessibilityNodeInfoCompat.C2556a.f3577y, null, new C5517b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: D */
    public boolean mo27351D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.f10506a;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.m36607F(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo27692E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m28719J(float f) {
        this.f10514i = m28723F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void m28718K(AbstractC5518c cVar) {
        this.f10507b = cVar;
    }

    /* renamed from: L */
    public void m28717L(float f) {
        this.f10513h = m28723F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void m28716M(int i) {
        this.f10511f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: k */
    public boolean mo27689k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f10508c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m38705v(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f10508c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10508c = false;
        }
        if (!z) {
            return false;
        }
        m28721H(coordinatorLayout);
        return this.f10506a.m36597P(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: l */
    public boolean mo27375l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.mo27375l(coordinatorLayout, v, i);
        if (C2733w0.m36973z(v) == 0) {
            C2733w0.m37064A0(v, 1);
            m28715N(v);
        }
        return l;
    }
}
