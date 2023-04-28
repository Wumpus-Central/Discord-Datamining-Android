package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2733w0;
import java.util.List;
import p283pb.AbstractC11608a;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC2152c<View> {

    /* renamed from: a */
    private int f11425a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes3.dex */
    class ViewTreeObserver$OnPreDrawListenerC5783a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: k */
        final /* synthetic */ View f11426k;

        /* renamed from: l */
        final /* synthetic */ int f11427l;

        /* renamed from: m */
        final /* synthetic */ AbstractC11608a f11428m;

        ViewTreeObserver$OnPreDrawListenerC5783a(View view, int i, AbstractC11608a aVar) {
            this.f11426k = view;
            this.f11427l = i;
            this.f11428m = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f11426k.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f11425a == this.f11427l) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                AbstractC11608a aVar = this.f11428m;
                expandableBehavior.mo27347H((View) aVar, this.f11426k, aVar.mo9271a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: F */
    private boolean m27378F(boolean z) {
        if (z) {
            int i = this.f11425a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f11425a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: G */
    protected AbstractC11608a m27377G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> l = coordinatorLayout.m38715l(view);
        int size = l.size();
        for (int i = 0; i < size; i++) {
            View view2 = l.get(i);
            if (mo27348e(coordinatorLayout, view, view2)) {
                return (AbstractC11608a) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    protected abstract boolean mo27347H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: e */
    public abstract boolean mo27348e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: h */
    public boolean mo27376h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        AbstractC11608a aVar = (AbstractC11608a) view2;
        if (!m27378F(aVar.mo9271a())) {
            return false;
        }
        if (aVar.mo9271a()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f11425a = i;
        return mo27347H((View) aVar, view, aVar.mo9271a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: l */
    public boolean mo27375l(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC11608a G;
        int i2;
        if (C2733w0.m37029U(view) || (G = m27377G(coordinatorLayout, view)) == null || !m27378F(G.mo9271a())) {
            return false;
        }
        if (G.mo9271a()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f11425a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC5783a(view, i2, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
