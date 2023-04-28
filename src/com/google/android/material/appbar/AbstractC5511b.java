package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2706t;
import androidx.core.view.C2733w0;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import p054d1.C6391a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5511b extends C5512c<View> {

    /* renamed from: d */
    final Rect f10486d = new Rect();

    /* renamed from: e */
    final Rect f10487e = new Rect();

    /* renamed from: f */
    private int f10488f = 0;

    /* renamed from: g */
    private int f10489g;

    public AbstractC5511b() {
    }

    /* renamed from: N */
    private static int m28746N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C5512c
    /* renamed from: F */
    public void mo28742F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View H = mo28752H(coordinatorLayout.m38715l(view));
        if (H != null) {
            CoordinatorLayout.C2155f fVar = (CoordinatorLayout.C2155f) view.getLayoutParams();
            Rect rect = this.f10486d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C2733w0.m36975y(coordinatorLayout) && !C2733w0.m36975y(view)) {
                rect.left += lastWindowInsets.m37514m();
                rect.right -= lastWindowInsets.m37513n();
            }
            Rect rect2 = this.f10487e;
            C2706t.m37126a(m28746N(fVar.f2998c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = m28751I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f10488f = rect2.top - H.getBottom();
            return;
        }
        super.mo28742F(coordinatorLayout, view, i);
        this.f10488f = 0;
    }

    /* renamed from: H */
    abstract View mo28752H(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final int m28751I(View view) {
        if (this.f10489g == 0) {
            return 0;
        }
        float J = mo28750J(view);
        int i = this.f10489g;
        return C6391a.m25632b((int) (J * i), 0, i);
    }

    /* renamed from: J */
    float mo28750J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int m28749K() {
        return this.f10489g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo28748L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final int m28747M() {
        return this.f10488f;
    }

    /* renamed from: O */
    public final void m28745O(int i) {
        this.f10489g = i;
    }

    /* renamed from: P */
    protected boolean m28744P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: m */
    public boolean mo28600m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        int i5;
        WindowInsetsCompat lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (H = mo28752H(coordinatorLayout.m38715l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C2733w0.m36975y(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m37512o() + lastWindowInsets.m37515l();
        }
        int L = size + mo28748L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (m28744P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            L -= measuredHeight;
        }
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.m38741D(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5), i4);
        return true;
    }

    public AbstractC5511b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
