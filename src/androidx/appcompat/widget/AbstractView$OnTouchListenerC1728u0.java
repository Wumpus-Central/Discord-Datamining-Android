package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p164j.AbstractC9457e;

/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC1728u0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    private final float f1507k;

    /* renamed from: l */
    private final int f1508l;

    /* renamed from: m */
    private final int f1509m;

    /* renamed from: n */
    final View f1510n;

    /* renamed from: o */
    private Runnable f1511o;

    /* renamed from: p */
    private Runnable f1512p;

    /* renamed from: q */
    private boolean f1513q;

    /* renamed from: r */
    private int f1514r;

    /* renamed from: s */
    private final int[] f1515s = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.u0$a */
    /* loaded from: classes.dex */
    public class RunnableC1729a implements Runnable {
        RunnableC1729a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC1728u0.this.f1510n.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.u0$b */
    /* loaded from: classes.dex */
    public class RunnableC1730b implements Runnable {
        RunnableC1730b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC1728u0.this.m40012e();
        }
    }

    public AbstractView$OnTouchListenerC1728u0(View view) {
        this.f1510n = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1507k = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1508l = tapTimeout;
        this.f1509m = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m40014a() {
        Runnable runnable = this.f1512p;
        if (runnable != null) {
            this.f1510n.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1511o;
        if (runnable2 != null) {
            this.f1510n.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m40011f(MotionEvent motionEvent) {
        C1717s0 s0Var;
        boolean z;
        View view = this.f1510n;
        AbstractC9457e b = mo39977b();
        if (b == null || !b.isShowing() || (s0Var = (C1717s0) b.mo16201n()) == null || !s0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m40008i(view, obtainNoHistory);
        m40007j(s0Var, obtainNoHistory);
        boolean e = s0Var.mo40044e(obtainNoHistory, this.f1514r);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z = false;
        } else {
            z = true;
        }
        if (!e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m40010g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1510n
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1514r
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1507k
            boolean r6 = m40009h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m40014a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m40014a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1514r = r6
            java.lang.Runnable r6 = r5.f1511o
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.u0$a r6 = new androidx.appcompat.widget.u0$a
            r6.<init>()
            r5.f1511o = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1511o
            int r1 = r5.f1508l
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1512p
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.u0$b r6 = new androidx.appcompat.widget.u0$b
            r6.<init>()
            r5.f1512p = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1512p
            int r1 = r5.f1509m
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0.m40010g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m40009h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= (view.getRight() - view.getLeft()) + f3 || f2 >= (view.getBottom() - view.getTop()) + f3) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m40008i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1515s;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m40007j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1515s;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* renamed from: b */
    public abstract AbstractC9457e mo39977b();

    /* renamed from: c */
    protected abstract boolean mo39976c();

    /* renamed from: d */
    protected boolean mo40013d() {
        AbstractC9457e b = mo39977b();
        if (b == null || !b.isShowing()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* renamed from: e */
    void m40012e() {
        m40014a();
        View view = this.f1510n;
        if (view.isEnabled() && !view.isLongClickable() && mo39976c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1513q = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1513q;
        if (!z2) {
            if (!m40010g(motionEvent) || !mo39976c()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1510n.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else if (m40011f(motionEvent) || !mo40013d()) {
            z = true;
        } else {
            z = false;
        }
        this.f1513q = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1513q = false;
        this.f1514r = -1;
        Runnable runnable = this.f1511o;
        if (runnable != null) {
            this.f1510n.removeCallbacks(runnable);
        }
    }
}
