package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public abstract class AbstractC3140j {

    /* renamed from: a */
    protected final RecyclerView.LayoutManager f4868a;

    /* renamed from: b */
    private int f4869b;

    /* renamed from: c */
    final Rect f4870c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    public class C3141a extends AbstractC3140j {
        C3141a(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: d */
        public int mo35105d(View view) {
            return this.f4868a.m35463e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3109i) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: e */
        public int mo35104e(View view) {
            RecyclerView.C3109i iVar = (RecyclerView.C3109i) view.getLayoutParams();
            return this.f4868a.m35464d0(view) + ((ViewGroup.MarginLayoutParams) iVar).leftMargin + ((ViewGroup.MarginLayoutParams) iVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: f */
        public int mo35103f(View view) {
            RecyclerView.C3109i iVar = (RecyclerView.C3109i) view.getLayoutParams();
            return this.f4868a.m35465c0(view) + ((ViewGroup.MarginLayoutParams) iVar).topMargin + ((ViewGroup.MarginLayoutParams) iVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: g */
        public int mo35102g(View view) {
            return this.f4868a.m35466b0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3109i) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: h */
        public int mo35101h() {
            return this.f4868a.m35428v0();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: i */
        public int mo35100i() {
            return this.f4868a.m35428v0() - this.f4868a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: j */
        public int mo35099j() {
            return this.f4868a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: k */
        public int mo35098k() {
            return this.f4868a.m35426w0();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: l */
        public int mo35097l() {
            return this.f4868a.m35458i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: m */
        public int mo35096m() {
            return this.f4868a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: n */
        public int mo35095n() {
            return (this.f4868a.m35428v0() - this.f4868a.getPaddingLeft()) - this.f4868a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: p */
        public int mo35094p(View view) {
            this.f4868a.m35430u0(view, true, this.f4870c);
            return this.f4870c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: q */
        public int mo35093q(View view) {
            this.f4868a.m35430u0(view, true, this.f4870c);
            return this.f4870c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: r */
        public void mo35092r(int i) {
            this.f4868a.mo35302K0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes.dex */
    public class C3142b extends AbstractC3140j {
        C3142b(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: d */
        public int mo35105d(View view) {
            return this.f4868a.m35468Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3109i) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: e */
        public int mo35104e(View view) {
            RecyclerView.C3109i iVar = (RecyclerView.C3109i) view.getLayoutParams();
            return this.f4868a.m35465c0(view) + ((ViewGroup.MarginLayoutParams) iVar).topMargin + ((ViewGroup.MarginLayoutParams) iVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: f */
        public int mo35103f(View view) {
            RecyclerView.C3109i iVar = (RecyclerView.C3109i) view.getLayoutParams();
            return this.f4868a.m35464d0(view) + ((ViewGroup.MarginLayoutParams) iVar).leftMargin + ((ViewGroup.MarginLayoutParams) iVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: g */
        public int mo35102g(View view) {
            return this.f4868a.m35462f0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3109i) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: h */
        public int mo35101h() {
            return this.f4868a.m35460h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: i */
        public int mo35100i() {
            return this.f4868a.m35460h0() - this.f4868a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: j */
        public int mo35099j() {
            return this.f4868a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: k */
        public int mo35098k() {
            return this.f4868a.m35458i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: l */
        public int mo35097l() {
            return this.f4868a.m35426w0();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: m */
        public int mo35096m() {
            return this.f4868a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: n */
        public int mo35095n() {
            return (this.f4868a.m35460h0() - this.f4868a.getPaddingTop()) - this.f4868a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: p */
        public int mo35094p(View view) {
            this.f4868a.m35430u0(view, true, this.f4870c);
            return this.f4870c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: q */
        public int mo35093q(View view) {
            this.f4868a.m35430u0(view, true, this.f4870c);
            return this.f4870c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC3140j
        /* renamed from: r */
        public void mo35092r(int i) {
            this.f4868a.mo35300L0(i);
        }
    }

    /* synthetic */ AbstractC3140j(RecyclerView.LayoutManager layoutManager, C3141a aVar) {
        this(layoutManager);
    }

    /* renamed from: a */
    public static AbstractC3140j m35110a(RecyclerView.LayoutManager layoutManager) {
        return new C3141a(layoutManager);
    }

    /* renamed from: b */
    public static AbstractC3140j m35109b(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return m35110a(layoutManager);
        }
        if (i == 1) {
            return m35108c(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC3140j m35108c(RecyclerView.LayoutManager layoutManager) {
        return new C3142b(layoutManager);
    }

    /* renamed from: d */
    public abstract int mo35105d(View view);

    /* renamed from: e */
    public abstract int mo35104e(View view);

    /* renamed from: f */
    public abstract int mo35103f(View view);

    /* renamed from: g */
    public abstract int mo35102g(View view);

    /* renamed from: h */
    public abstract int mo35101h();

    /* renamed from: i */
    public abstract int mo35100i();

    /* renamed from: j */
    public abstract int mo35099j();

    /* renamed from: k */
    public abstract int mo35098k();

    /* renamed from: l */
    public abstract int mo35097l();

    /* renamed from: m */
    public abstract int mo35096m();

    /* renamed from: n */
    public abstract int mo35095n();

    /* renamed from: o */
    public int m35107o() {
        if (Integer.MIN_VALUE == this.f4869b) {
            return 0;
        }
        return mo35095n() - this.f4869b;
    }

    /* renamed from: p */
    public abstract int mo35094p(View view);

    /* renamed from: q */
    public abstract int mo35093q(View view);

    /* renamed from: r */
    public abstract void mo35092r(int i);

    /* renamed from: s */
    public void m35106s() {
        this.f4869b = mo35095n();
    }

    private AbstractC3140j(RecyclerView.LayoutManager layoutManager) {
        this.f4869b = Integer.MIN_VALUE;
        this.f4870c = new Rect();
        this.f4868a = layoutManager;
    }
}
