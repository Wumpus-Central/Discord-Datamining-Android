package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.view.C2733w0;
import androidx.vectordrawable.graphics.drawable.AbstractC3285b;
import com.google.android.material.internal.C5662m;
import com.google.android.material.progressindicator.AbstractC5676b;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import lb.C10395a;
import p083eb.C6803b;
import p083eb.C6811j;
import p083eb.C6812k;
import p462zb.C14615a;
import sb.C12860a;

/* renamed from: com.google.android.material.progressindicator.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5672a<S extends AbstractC5676b> extends ProgressBar {

    /* renamed from: y */
    static final int f11075y = C6811j.f14674t;

    /* renamed from: k */
    S f11076k;

    /* renamed from: l */
    private int f11077l;

    /* renamed from: m */
    private boolean f11078m;

    /* renamed from: o */
    private final int f11080o;

    /* renamed from: p */
    private final int f11081p;

    /* renamed from: q */
    private long f11082q = -1;

    /* renamed from: s */
    private boolean f11084s = false;

    /* renamed from: t */
    private int f11085t = 4;

    /* renamed from: u */
    private final Runnable f11086u = new RunnableC0159a();

    /* renamed from: v */
    private final Runnable f11087v = new RunnableC5673b();

    /* renamed from: w */
    private final AbstractC3285b f11088w = new C5674c();

    /* renamed from: x */
    private final AbstractC3285b f11089x = new C5675d();

    /* renamed from: r */
    C12860a f11083r = new C12860a();

    /* renamed from: n */
    private boolean f11079n = true;

    /* renamed from: com.google.android.material.progressindicator.a$a */
    /* loaded from: classes3.dex */
    class RunnableC0159a implements Runnable {
        RunnableC0159a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5672a.this.m27808k();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$b */
    /* loaded from: classes3.dex */
    class RunnableC5673b implements Runnable {
        RunnableC5673b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5672a.this.m27809j();
            AbstractC5672a.this.f11082q = -1L;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$c */
    /* loaded from: classes3.dex */
    class C5674c extends AbstractC3285b {
        C5674c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC3285b
        /* renamed from: a */
        public void mo27801a(Drawable drawable) {
            AbstractC5672a.this.setIndeterminate(false);
            AbstractC5672a aVar = AbstractC5672a.this;
            aVar.m27804o(aVar.f11077l, AbstractC5672a.this.f11078m);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$d */
    /* loaded from: classes3.dex */
    class C5675d extends AbstractC3285b {
        C5675d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC3285b
        /* renamed from: a */
        public void mo27801a(Drawable drawable) {
            super.mo27801a(drawable);
            if (!AbstractC5672a.this.f11084s) {
                AbstractC5672a aVar = AbstractC5672a.this;
                aVar.setVisibility(aVar.f11085t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5672a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C14615a.m126c(context, attributeSet, i, f11075y), attributeSet, i);
        Context context2 = getContext();
        this.f11076k = mo27810i(context2, attributeSet);
        TypedArray h = C5662m.m27838h(context2, attributeSet, C6812k.f38063E, i, i2, new int[0]);
        this.f11080o = h.getInt(C6812k.f38103J, -1);
        this.f11081p = Math.min(h.getInt(C6812k.f38087H, -1), (int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        h.recycle();
    }

    private AbstractC5689h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m27728u();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().m27772v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m27809j() {
        ((AbstractC5685g) getCurrentDrawable()).mo27733p(false, false, true);
        if (m27806m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m27808k() {
        if (this.f11081p > 0) {
            this.f11082q = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    private boolean m27806m() {
        if ((getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m27805n() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().m27729t().mo27742d(this.f11088w);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo27734l(this.f11089x);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo27734l(this.f11089x);
        }
    }

    /* renamed from: p */
    private void m27803p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo27731r(this.f11089x);
            getIndeterminateDrawable().m27729t().mo27738h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo27731r(this.f11089x);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f11076k.f11099f;
    }

    public int[] getIndicatorColor() {
        return this.f11076k.f11096c;
    }

    public int getShowAnimationBehavior() {
        return this.f11076k.f11098e;
    }

    public int getTrackColor() {
        return this.f11076k.f11097d;
    }

    public int getTrackCornerRadius() {
        return this.f11076k.f11095b;
    }

    public int getTrackThickness() {
        return this.f11076k.f11094a;
    }

    /* renamed from: h */
    protected void m27811h(boolean z) {
        if (this.f11079n) {
            ((AbstractC5685g) getCurrentDrawable()).mo27733p(m27802q(), false, z);
        }
    }

    /* renamed from: i */
    abstract S mo27810i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: l */
    boolean m27807l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void m27804o(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f11077l = i;
            this.f11078m = z;
            this.f11084s = true;
            if (!getIndeterminateDrawable().isVisible() || this.f11083r.m5249a(getContext().getContentResolver()) == 0.0f) {
                this.f11088w.mo27801a(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().m27729t().mo27740f();
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m27805n();
        if (m27802q()) {
            m27808k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f11087v);
        removeCallbacks(this.f11086u);
        ((AbstractC5685g) getCurrentDrawable()).mo27737h();
        m27803p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        AbstractC5689h<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.mo27748e();
            int d = currentDrawingDelegate.mo27749d();
            if (e < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = e + getPaddingLeft() + getPaddingRight();
            }
            if (d < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = d + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        m27811h(z);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m27811h(false);
    }

    /* renamed from: q */
    boolean m27802q() {
        if (!C2733w0.m37030T(this) || getWindowVisibility() != 0 || !m27807l()) {
            return false;
        }
        return true;
    }

    public void setAnimatorDurationScaleProvider(C12860a aVar) {
        this.f11083r = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f11126m = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f11126m = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f11076k.f11099f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            AbstractC5685g gVar = (AbstractC5685g) getCurrentDrawable();
            if (gVar != null) {
                gVar.mo27737h();
            }
            super.setIndeterminate(z);
            AbstractC5685g gVar2 = (AbstractC5685g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.mo27733p(m27802q(), false, false);
            }
            if ((gVar2 instanceof C5691j) && m27802q()) {
                ((C5691j) gVar2).m27729t().mo27739g();
            }
            this.f11084s = false;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof C5691j) {
            ((AbstractC5685g) drawable).mo27737h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C10395a.m13519b(getContext(), C6803b.f14537k, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f11076k.f11096c = iArr;
            getIndeterminateDrawable().m27729t().mo27743c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            m27804o(i, false);
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof C5683f) {
            C5683f fVar = (C5683f) drawable;
            fVar.mo27737h();
            super.setProgressDrawable(fVar);
            fVar.m27768z(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f11076k.f11098e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f11076k;
        if (s.f11097d != i) {
            s.f11097d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f11076k;
        if (s.f11095b != i) {
            s.f11095b = Math.min(i, s.f11094a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f11076k;
        if (s.f11094a != i) {
            s.f11094a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f11085t = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    @Override // android.widget.ProgressBar
    public C5691j<S> getIndeterminateDrawable() {
        return (C5691j) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C5683f<S> getProgressDrawable() {
        return (C5683f) super.getProgressDrawable();
    }
}
