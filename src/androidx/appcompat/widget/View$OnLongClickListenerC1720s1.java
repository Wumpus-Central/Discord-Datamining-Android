package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C2632g2;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: androidx.appcompat.widget.s1 */
/* loaded from: classes.dex */
class View$OnLongClickListenerC1720s1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: t */
    private static View$OnLongClickListenerC1720s1 f1487t;

    /* renamed from: u */
    private static View$OnLongClickListenerC1720s1 f1488u;

    /* renamed from: k */
    private final View f1489k;

    /* renamed from: l */
    private final CharSequence f1490l;

    /* renamed from: m */
    private final int f1491m;

    /* renamed from: n */
    private final Runnable f1492n = new RunnableC1721a();

    /* renamed from: o */
    private final Runnable f1493o = new RunnableC1722b();

    /* renamed from: p */
    private int f1494p;

    /* renamed from: q */
    private int f1495q;

    /* renamed from: r */
    private C1725t1 f1496r;

    /* renamed from: s */
    private boolean f1497s;

    /* renamed from: androidx.appcompat.widget.s1$a */
    /* loaded from: classes.dex */
    class RunnableC1721a implements Runnable {
        RunnableC1721a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC1720s1.this.m40028g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.s1$b */
    /* loaded from: classes.dex */
    class RunnableC1722b implements Runnable {
        RunnableC1722b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC1720s1.this.m40032c();
        }
    }

    private View$OnLongClickListenerC1720s1(View view, CharSequence charSequence) {
        this.f1489k = view;
        this.f1490l = charSequence;
        this.f1491m = C2632g2.m37251c(ViewConfiguration.get(view.getContext()));
        m40033b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m40034a() {
        this.f1489k.removeCallbacks(this.f1492n);
    }

    /* renamed from: b */
    private void m40033b() {
        this.f1494p = ViewDefaults.NUMBER_OF_LINES;
        this.f1495q = ViewDefaults.NUMBER_OF_LINES;
    }

    /* renamed from: d */
    private void m40031d() {
        this.f1489k.postDelayed(this.f1492n, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m40030e(View$OnLongClickListenerC1720s1 s1Var) {
        View$OnLongClickListenerC1720s1 s1Var2 = f1487t;
        if (s1Var2 != null) {
            s1Var2.m40034a();
        }
        f1487t = s1Var;
        if (s1Var != null) {
            s1Var.m40031d();
        }
    }

    /* renamed from: f */
    public static void m40029f(View view, CharSequence charSequence) {
        View$OnLongClickListenerC1720s1 s1Var = f1487t;
        if (s1Var != null && s1Var.f1489k == view) {
            m40030e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC1720s1 s1Var2 = f1488u;
            if (s1Var2 != null && s1Var2.f1489k == view) {
                s1Var2.m40032c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC1720s1(view, charSequence);
    }

    /* renamed from: h */
    private boolean m40027h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1494p) <= this.f1491m && Math.abs(y - this.f1495q) <= this.f1491m) {
            return false;
        }
        this.f1494p = x;
        this.f1495q = y;
        return true;
    }

    /* renamed from: c */
    void m40032c() {
        if (f1488u == this) {
            f1488u = null;
            C1725t1 t1Var = this.f1496r;
            if (t1Var != null) {
                t1Var.m40022c();
                this.f1496r = null;
                m40033b();
                this.f1489k.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1487t == this) {
            m40030e(null);
        }
        this.f1489k.removeCallbacks(this.f1493o);
    }

    /* renamed from: g */
    void m40028g(boolean z) {
        long j;
        long j2;
        long j3;
        if (C2733w0.m37030T(this.f1489k)) {
            m40030e(null);
            View$OnLongClickListenerC1720s1 s1Var = f1488u;
            if (s1Var != null) {
                s1Var.m40032c();
            }
            f1488u = this;
            this.f1497s = z;
            C1725t1 t1Var = new C1725t1(this.f1489k.getContext());
            this.f1496r = t1Var;
            t1Var.m40020e(this.f1489k, this.f1494p, this.f1495q, this.f1497s, this.f1490l);
            this.f1489k.addOnAttachStateChangeListener(this);
            if (this.f1497s) {
                j = 2500;
            } else {
                if ((C2733w0.m37041M(this.f1489k) & 1) == 1) {
                    j3 = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    j3 = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j = j2 - j3;
            }
            this.f1489k.removeCallbacks(this.f1493o);
            this.f1489k.postDelayed(this.f1493o, j);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1496r != null && this.f1497s) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1489k.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m40033b();
                m40032c();
            }
        } else if (this.f1489k.isEnabled() && this.f1496r == null && m40027h(motionEvent)) {
            m40030e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1494p = view.getWidth() / 2;
        this.f1495q = view.getHeight() / 2;
        m40028g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m40032c();
    }
}
