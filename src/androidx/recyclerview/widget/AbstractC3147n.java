package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
public abstract class AbstractC3147n extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    RecyclerView f4874a;

    /* renamed from: b */
    private Scroller f4875b;

    /* renamed from: c */
    private final RecyclerView.OnScrollListener f4876c = new C3148a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* loaded from: classes.dex */
    class C3148a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        boolean f4877a = false;

        C3148a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f4877a) {
                this.f4877a = false;
                AbstractC3147n.this.m35073j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4877a = true;
            }
        }
    }

    /* renamed from: e */
    private void m35077e() {
        this.f4874a.removeOnScrollListener(this.f4876c);
        this.f4874a.setOnFlingListener(null);
    }

    /* renamed from: h */
    private void m35075h() {
        if (this.f4874a.getOnFlingListener() == null) {
            this.f4874a.addOnScrollListener(this.f4876c);
            this.f4874a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: i */
    private boolean m35074i(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        RecyclerView.SmoothScroller d;
        int g;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.AbstractC3100a) || (d = mo35078d(layoutManager)) == null || (g = mo35076g(layoutManager, i, i2)) == -1) {
            return false;
        }
        d.setTargetPosition(g);
        layoutManager.m35481S1(d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    /* renamed from: a */
    public boolean mo35081a(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.f4874a.getLayoutManager();
        if (layoutManager == null || this.f4874a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4874a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m35074i(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m35080b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4874a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m35077e();
            }
            this.f4874a = recyclerView;
            if (recyclerView != null) {
                m35075h();
                this.f4875b = new Scroller(this.f4874a.getContext(), new DecelerateInterpolator());
                m35073j();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo35079c(RecyclerView.LayoutManager layoutManager, View view);

    /* renamed from: d */
    protected abstract RecyclerView.SmoothScroller mo35078d(RecyclerView.LayoutManager layoutManager);

    /* renamed from: f */
    public abstract View mo34632f(RecyclerView.LayoutManager layoutManager);

    /* renamed from: g */
    public abstract int mo35076g(RecyclerView.LayoutManager layoutManager, int i, int i2);

    /* renamed from: j */
    void m35073j() {
        RecyclerView.LayoutManager layoutManager;
        View f;
        RecyclerView recyclerView = this.f4874a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f = mo34632f(layoutManager)) != null) {
            int[] c = mo35079c(layoutManager, f);
            int i = c[0];
            if (i != 0 || c[1] != 0) {
                this.f4874a.smoothScrollBy(i, c[1]);
            }
        }
    }
}
