package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
class C3135f {

    /* renamed from: b */
    int f4859b;

    /* renamed from: c */
    int f4860c;

    /* renamed from: d */
    int f4861d;

    /* renamed from: e */
    int f4862e;

    /* renamed from: h */
    boolean f4865h;

    /* renamed from: i */
    boolean f4866i;

    /* renamed from: a */
    boolean f4858a = true;

    /* renamed from: f */
    int f4863f = 0;

    /* renamed from: g */
    int f4864g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m35124a(RecyclerView.State state) {
        int i = this.f4860c;
        return i >= 0 && i < state.m35352b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m35123b(RecyclerView.Recycler recycler) {
        View o = recycler.m35377o(this.f4860c);
        this.f4860c += this.f4861d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4859b + ", mCurrentPosition=" + this.f4860c + ", mItemDirection=" + this.f4861d + ", mLayoutDirection=" + this.f4862e + ", mStartLine=" + this.f4863f + ", mEndLine=" + this.f4864g + '}';
    }
}
