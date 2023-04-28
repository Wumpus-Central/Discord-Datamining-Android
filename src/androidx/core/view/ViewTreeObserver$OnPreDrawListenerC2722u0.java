package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.u0 */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC2722u0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    private final View f3642k;

    /* renamed from: l */
    private ViewTreeObserver f3643l;

    /* renamed from: m */
    private final Runnable f3644m;

    private ViewTreeObserver$OnPreDrawListenerC2722u0(View view, Runnable runnable) {
        this.f3642k = view;
        this.f3643l = view.getViewTreeObserver();
        this.f3644m = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC2722u0 m37085a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            ViewTreeObserver$OnPreDrawListenerC2722u0 u0Var = new ViewTreeObserver$OnPreDrawListenerC2722u0(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(u0Var);
            view.addOnAttachStateChangeListener(u0Var);
            return u0Var;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public void m37084b() {
        if (this.f3643l.isAlive()) {
            this.f3643l.removeOnPreDrawListener(this);
        } else {
            this.f3642k.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3642k.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m37084b();
        this.f3644m.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3643l = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m37084b();
    }
}
