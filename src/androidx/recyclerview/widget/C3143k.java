package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C3143k extends AbstractC3147n {

    /* renamed from: d */
    private AbstractC3140j f4871d;

    /* renamed from: e */
    private AbstractC3140j f4872e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    class C3144a extends C3136g {
        C3144a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C3136g
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C3136g
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C3136g, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            C3143k kVar = C3143k.this;
            int[] c = kVar.mo35079c(kVar.f4874a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                action.m35355d(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* renamed from: k */
    private int m35091k(View view, AbstractC3140j jVar) {
        return (jVar.mo35102g(view) + (jVar.mo35104e(view) / 2)) - (jVar.mo35096m() + (jVar.mo35095n() / 2));
    }

    /* renamed from: l */
    private View m35090l(RecyclerView.LayoutManager layoutManager, AbstractC3140j jVar) {
        int U = layoutManager.m35477U();
        View view = null;
        if (U == 0) {
            return null;
        }
        int m = jVar.mo35096m() + (jVar.mo35095n() / 2);
        int i = ViewDefaults.NUMBER_OF_LINES;
        for (int i2 = 0; i2 < U; i2++) {
            View T = layoutManager.m35480T(i2);
            int abs = Math.abs((jVar.mo35102g(T) + (jVar.mo35104e(T) / 2)) - m);
            if (abs < i) {
                view = T;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: m */
    private AbstractC3140j m35089m(RecyclerView.LayoutManager layoutManager) {
        AbstractC3140j jVar = this.f4872e;
        if (jVar == null || jVar.f4868a != layoutManager) {
            this.f4872e = AbstractC3140j.m35110a(layoutManager);
        }
        return this.f4872e;
    }

    /* renamed from: n */
    private AbstractC3140j m35088n(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo29356w()) {
            return m35087o(layoutManager);
        }
        if (layoutManager.mo29358v()) {
            return m35089m(layoutManager);
        }
        return null;
    }

    /* renamed from: o */
    private AbstractC3140j m35087o(RecyclerView.LayoutManager layoutManager) {
        AbstractC3140j jVar = this.f4871d;
        if (jVar == null || jVar.f4868a != layoutManager) {
            this.f4871d = AbstractC3140j.m35108c(layoutManager);
        }
        return this.f4871d;
    }

    /* renamed from: p */
    private boolean m35086p(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return layoutManager.mo29358v() ? i > 0 : i2 > 0;
    }

    /* renamed from: q */
    private boolean m35085q(RecyclerView.LayoutManager layoutManager) {
        PointF a;
        int j0 = layoutManager.m35456j0();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.AbstractC3100a) || (a = ((RecyclerView.SmoothScroller.AbstractC3100a) layoutManager).mo29388a(j0 - 1)) == null) {
            return false;
        }
        if (a.x < 0.0f || a.y < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC3147n
    /* renamed from: c */
    public int[] mo35079c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.mo29358v()) {
            iArr[0] = m35091k(view, m35089m(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.mo29356w()) {
            iArr[1] = m35091k(view, m35087o(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC3147n
    /* renamed from: d */
    protected RecyclerView.SmoothScroller mo35078d(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.AbstractC3100a)) {
            return null;
        }
        return new C3144a(this.f4874a.getContext());
    }

    @Override // androidx.recyclerview.widget.AbstractC3147n
    /* renamed from: f */
    public View mo34632f(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo29356w()) {
            return m35090l(layoutManager, m35087o(layoutManager));
        }
        if (layoutManager.mo29358v()) {
            return m35090l(layoutManager, m35089m(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3147n
    /* renamed from: g */
    public int mo35076g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        AbstractC3140j n;
        int i3;
        int j0 = layoutManager.m35456j0();
        if (j0 == 0 || (n = m35088n(layoutManager)) == null) {
            return -1;
        }
        int U = layoutManager.m35477U();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < U; i6++) {
            View T = layoutManager.m35480T(i6);
            if (T != null) {
                int k = m35091k(T, n);
                if (k <= 0 && k > i5) {
                    view2 = T;
                    i5 = k;
                }
                if (k >= 0 && k < i4) {
                    view = T;
                    i4 = k;
                }
            }
        }
        boolean p = m35086p(layoutManager, i, i2);
        if (p && view != null) {
            return layoutManager.m35446o0(view);
        }
        if (!(p || view2 == null)) {
            return layoutManager.m35446o0(view2);
        }
        if (p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int o0 = layoutManager.m35446o0(view);
        if (m35085q(layoutManager) == p) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = o0 + i3;
        if (i7 < 0 || i7 >= j0) {
            return -1;
        }
        return i7;
    }
}
