package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewDefaults;
import p054d1.C6391a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5510a<V extends View> extends C5512c<V> {

    /* renamed from: d */
    private Runnable f10476d;

    /* renamed from: e */
    OverScroller f10477e;

    /* renamed from: f */
    private boolean f10478f;

    /* renamed from: h */
    private int f10480h;

    /* renamed from: j */
    private VelocityTracker f10482j;

    /* renamed from: g */
    private int f10479g = -1;

    /* renamed from: i */
    private int f10481i = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes3.dex */
    public class RunnableC0152a implements Runnable {

        /* renamed from: k */
        private final CoordinatorLayout f10483k;

        /* renamed from: l */
        private final V f10484l;

        RunnableC0152a(CoordinatorLayout coordinatorLayout, V v) {
            this.f10483k = coordinatorLayout;
            this.f10484l = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f10484l != null && (overScroller = AbstractC5510a.this.f10477e) != null) {
                if (overScroller.computeScrollOffset()) {
                    AbstractC5510a aVar = AbstractC5510a.this;
                    aVar.m28754P(this.f10483k, this.f10484l, aVar.f10477e.getCurrY());
                    C2733w0.m37006i0(this.f10484l, this);
                    return;
                }
                AbstractC5510a.this.mo28756N(this.f10483k, this.f10484l);
            }
        }
    }

    public AbstractC5510a() {
    }

    /* renamed from: I */
    private void m28761I() {
        if (this.f10482j == null) {
            this.f10482j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo27351D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f10479g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f10480h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f10479g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f10480h
            int r7 = r1 - r0
            r11.f10480h = r0
            int r8 = r11.mo28759K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m28755O(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f10482j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f10482j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f10482j
            int r4 = r11.f10479g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo28758L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m28760J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f10478f = r3
            r11.f10479g = r1
            android.view.VelocityTracker r13 = r11.f10482j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f10482j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f10482j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f10478f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC5510a.mo27351D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    boolean mo28762H(V v) {
        return false;
    }

    /* renamed from: J */
    final boolean m28760J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f10476d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f10476d = null;
        }
        if (this.f10477e == null) {
            this.f10477e = new OverScroller(v.getContext());
        }
        this.f10477e.fling(0, mo28743E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f10477e.computeScrollOffset()) {
            RunnableC0152a aVar = new RunnableC0152a(coordinatorLayout, v);
            this.f10476d = aVar;
            C2733w0.m37006i0(v, aVar);
            return true;
        }
        mo28756N(coordinatorLayout, v);
        return false;
    }

    /* renamed from: K */
    int mo28759K(V v) {
        return -v.getHeight();
    }

    /* renamed from: L */
    int mo28758L(V v) {
        return v.getHeight();
    }

    /* renamed from: M */
    int mo28757M() {
        return mo28743E();
    }

    /* renamed from: N */
    void mo28756N(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final int m28755O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo28753Q(coordinatorLayout, v, mo28757M() - i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public int m28754P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo28753Q(coordinatorLayout, v, i, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: Q */
    int mo28753Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b;
        int E = mo28743E();
        if (i2 == 0 || E < i2 || E > i3 || E == (b = C6391a.m25632b(i, i2, i3))) {
            return 0;
        }
        mo28741G(b);
        return E - b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: k */
    public boolean mo27689k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f10481i < 0) {
            this.f10481i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f10478f) {
            int i = this.f10479g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f10480h) > this.f10481i) {
                this.f10480h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f10479g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!mo28762H(v) || !coordinatorLayout.m38705v(v, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.f10478f = z;
            if (z) {
                this.f10480h = y2;
                this.f10479g = motionEvent.getPointerId(0);
                m28761I();
                OverScroller overScroller = this.f10477e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f10477e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f10482j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC5510a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
