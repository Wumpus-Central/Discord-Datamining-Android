package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C2733w0;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.n */
/* loaded from: classes.dex */
public class C3245n extends ViewGroup implements AbstractC3239k {

    /* renamed from: k */
    ViewGroup f5131k;

    /* renamed from: l */
    View f5132l;

    /* renamed from: m */
    final View f5133m;

    /* renamed from: n */
    int f5134n;

    /* renamed from: o */
    private Matrix f5135o;

    /* renamed from: p */
    private final ViewTreeObserver.OnPreDrawListener f5136p = new ViewTreeObserver$OnPreDrawListenerC3246a();

    /* renamed from: androidx.transition.n$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnPreDrawListenerC3246a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC3246a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C2733w0.m37008h0(C3245n.this);
            C3245n nVar = C3245n.this;
            ViewGroup viewGroup = nVar.f5131k;
            if (viewGroup == null || (view = nVar.f5132l) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C2733w0.m37008h0(C3245n.this.f5131k);
            C3245n nVar2 = C3245n.this;
            nVar2.f5131k = null;
            nVar2.f5132l = null;
            return true;
        }
    }

    C3245n(View view) {
        super(view.getContext());
        this.f5133m = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C3245n m34868b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        C3241l lVar;
        if (view.getParent() instanceof ViewGroup) {
            C3241l b = C3241l.m34885b(viewGroup);
            C3245n e = m34865e(view);
            if (e == null || (lVar = (C3241l) e.getParent()) == b) {
                i = 0;
            } else {
                i = e.f5134n;
                lVar.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m34867c(view, viewGroup, matrix);
                }
                e = new C3245n(view);
                e.m34862h(matrix);
                if (b == null) {
                    b = new C3241l(viewGroup);
                } else {
                    b.m34880g();
                }
                m34866d(viewGroup, b);
                m34866d(viewGroup, e);
                b.m34886a(e);
                e.f5134n = i;
            } else if (matrix != null) {
                e.m34862h(matrix);
            }
            e.f5134n++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    static void m34867c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C3252p0.m34847j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        C3252p0.m34846k(viewGroup, matrix);
    }

    /* renamed from: d */
    static void m34866d(View view, View view2) {
        C3252p0.m34850g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    static C3245n m34865e(View view) {
        return (C3245n) view.getTag(C3261t.f5144a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m34864f(View view) {
        C3245n e = m34865e(view);
        if (e != null) {
            int i = e.f5134n - 1;
            e.f5134n = i;
            if (i <= 0) {
                ((C3241l) e.getParent()).removeView(e);
            }
        }
    }

    /* renamed from: g */
    static void m34863g(View view, C3245n nVar) {
        view.setTag(C3261t.f5144a, nVar);
    }

    @Override // androidx.transition.AbstractC3239k
    /* renamed from: a */
    public void mo34869a(ViewGroup viewGroup, View view) {
        this.f5131k = viewGroup;
        this.f5132l = view;
    }

    /* renamed from: h */
    void m34862h(Matrix matrix) {
        this.f5135o = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m34863g(this.f5133m, this);
        this.f5133m.getViewTreeObserver().addOnPreDrawListener(this.f5136p);
        C3252p0.m34848i(this.f5133m, 4);
        if (this.f5133m.getParent() != null) {
            ((View) this.f5133m.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f5133m.getViewTreeObserver().removeOnPreDrawListener(this.f5136p);
        C3252p0.m34848i(this.f5133m, 0);
        m34863g(this.f5133m, null);
        if (this.f5133m.getParent() != null) {
            ((View) this.f5133m.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C3201e.m34948a(canvas, true);
        canvas.setMatrix(this.f5135o);
        C3252p0.m34848i(this.f5133m, 0);
        this.f5133m.invalidate();
        C3252p0.m34848i(this.f5133m, 4);
        drawChild(canvas, this.f5133m, getDrawingTime());
        C3201e.m34948a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, androidx.transition.AbstractC3239k
    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (m34865e(this.f5133m) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C3252p0.m34848i(this.f5133m, i2);
        }
    }
}
