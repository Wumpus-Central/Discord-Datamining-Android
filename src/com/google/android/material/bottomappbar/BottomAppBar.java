package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2733w0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C5665o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p083eb.C6802a;
import p083eb.C6805d;
import p083eb.C6811j;
import p125h1.AbstractC7736a;
import p422xb.C14038g;
import p422xb.C14042h;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AbstractC2151b {

    /* renamed from: w0 */
    private static final int f10523w0 = C6811j.f14663i;

    /* renamed from: e0 */
    private Integer f10524e0;

    /* renamed from: f0 */
    private final int f10525f0;

    /* renamed from: g0 */
    private final C14038g f10526g0;

    /* renamed from: h0 */
    private Animator f10527h0;

    /* renamed from: i0 */
    private Animator f10528i0;

    /* renamed from: j0 */
    private int f10529j0;

    /* renamed from: k0 */
    private int f10530k0;

    /* renamed from: l0 */
    private boolean f10531l0;

    /* renamed from: m0 */
    private int f10532m0;

    /* renamed from: n0 */
    private ArrayList<AbstractC5528g> f10533n0;

    /* renamed from: o0 */
    private int f10534o0;

    /* renamed from: p0 */
    private boolean f10535p0;

    /* renamed from: q0 */
    private boolean f10536q0;

    /* renamed from: r0 */
    private Behavior f10537r0;

    /* renamed from: s0 */
    private int f10538s0;

    /* renamed from: t0 */
    private int f10539t0;

    /* renamed from: u0 */
    private int f10540u0;

    /* renamed from: v0 */
    AnimatorListenerAdapter f10541v0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes3.dex */
    public class C5521a extends AnimatorListenerAdapter {
        C5521a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m28685n0();
            BottomAppBar.this.f10527h0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m28684o0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes3.dex */
    public class C5522b extends FloatingActionButton.AbstractC5620b {

        /* renamed from: a */
        final /* synthetic */ int f10548a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        /* loaded from: classes3.dex */
        class C5523a extends FloatingActionButton.AbstractC5620b {
            C5523a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC5620b
            /* renamed from: b */
            public void mo28043b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m28685n0();
            }
        }

        C5522b(int i) {
            this.f10548a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC5620b
        /* renamed from: a */
        public void mo28044a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m28680s0(this.f10548a));
            floatingActionButton.m28056s(new C5523a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes3.dex */
    public class C5524c extends AnimatorListenerAdapter {
        C5524c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m28685n0();
            BottomAppBar.this.f10535p0 = false;
            BottomAppBar.this.f10528i0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m28684o0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes3.dex */
    public class C5525d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f10552a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f10553b;

        /* renamed from: c */
        final /* synthetic */ int f10554c;

        /* renamed from: d */
        final /* synthetic */ boolean f10555d;

        C5525d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f10553b = actionMenuView;
            this.f10554c = i;
            this.f10555d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10552a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z;
            if (!this.f10552a) {
                if (BottomAppBar.this.f10534o0 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m28675x0(bottomAppBar.f10534o0);
                BottomAppBar.this.m28708D0(this.f10553b, this.f10554c, this.f10555d, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes3.dex */
    public class RunnableC5526e implements Runnable {

        /* renamed from: k */
        final /* synthetic */ ActionMenuView f10557k;

        /* renamed from: l */
        final /* synthetic */ int f10558l;

        /* renamed from: m */
        final /* synthetic */ boolean f10559m;

        RunnableC5526e(ActionMenuView actionMenuView, int i, boolean z) {
            this.f10557k = actionMenuView;
            this.f10558l = i;
            this.f10559m = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f10557k;
            actionMenuView.setTranslationX(BottomAppBar.this.m28681r0(actionMenuView, this.f10558l, this.f10559m));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes3.dex */
    public class C5527f extends AnimatorListenerAdapter {
        C5527f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f10541v0.onAnimationStart(animator);
            FloatingActionButton p0 = BottomAppBar.this.m28683p0();
            if (p0 != null) {
                p0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes3.dex */
    public interface AbstractC5528g {
        /* renamed from: a */
        void m28667a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m28666b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    /* loaded from: classes3.dex */
    public static class C5529h extends AbstractC7736a {
        public static final Parcelable.Creator<C5529h> CREATOR = new C5530a();

        /* renamed from: m */
        int f10562m;

        /* renamed from: n */
        boolean f10563n;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h$a */
        /* loaded from: classes3.dex */
        class C5530a implements Parcelable.ClassLoaderCreator<C5529h> {
            C5530a() {
            }

            /* renamed from: a */
            public C5529h createFromParcel(Parcel parcel) {
                return new C5529h(parcel, null);
            }

            /* renamed from: b */
            public C5529h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5529h(parcel, classLoader);
            }

            /* renamed from: c */
            public C5529h[] newArray(int i) {
                return new C5529h[i];
            }
        }

        public C5529h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10562m);
            parcel.writeInt(this.f10563n ? 1 : 0);
        }

        public C5529h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10562m = parcel.readInt();
            this.f10563n = parcel.readInt() != 0;
        }
    }

    /* renamed from: C0 */
    private void m28709C0(ActionMenuView actionMenuView, int i, boolean z) {
        m28708D0(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public void m28708D0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC5526e eVar = new RunnableC5526e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f10538s0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m28680s0(this.f10529j0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m28662d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f10540u0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f10539t0;
    }

    private C5531a getTopEdgeTreatment() {
        return (C5531a) this.f10526g0.m2001E().m1920p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m28690i0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m28070e(this.f10541v0);
        floatingActionButton.m28069f(new C5527f());
        floatingActionButton.m28068g(null);
    }

    /* renamed from: j0 */
    private void m28689j0() {
        Animator animator = this.f10528i0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f10527h0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: l0 */
    private void m28687l0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m28683p0(), "translationX", m28680s0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: m0 */
    private void m28686m0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if (Math.abs(actionMenuView.getTranslationX() - m28681r0(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.addListener(new C5525d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public void m28685n0() {
        ArrayList<AbstractC5528g> arrayList;
        int i = this.f10532m0 - 1;
        this.f10532m0 = i;
        if (i == 0 && (arrayList = this.f10533n0) != null) {
            Iterator<AbstractC5528g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m28667a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m28684o0() {
        ArrayList<AbstractC5528g> arrayList;
        int i = this.f10532m0;
        this.f10532m0 = i + 1;
        if (i == 0 && (arrayList = this.f10533n0) != null) {
            Iterator<AbstractC5528g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m28666b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public FloatingActionButton m28683p0() {
        View q0 = m28682q0();
        if (q0 instanceof FloatingActionButton) {
            return (FloatingActionButton) q0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m28682q0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m38714m(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m28682q0():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public float m28680s0(int i) {
        int i2;
        boolean e = C5665o.m27826e(this);
        int i3 = 1;
        if (i != 1) {
            return 0.0f;
        }
        if (e) {
            i2 = this.f10540u0;
        } else {
            i2 = this.f10539t0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f10525f0 + i2);
        if (e) {
            i3 = -1;
        }
        return measuredWidth * i3;
    }

    /* renamed from: t0 */
    private boolean m28679t0() {
        FloatingActionButton p0 = m28683p0();
        if (p0 == null || !p0.m28060o()) {
            return false;
        }
        return true;
    }

    /* renamed from: u0 */
    private void m28678u0(int i, boolean z) {
        if (!C2733w0.m37029U(this)) {
            this.f10535p0 = false;
            m28675x0(this.f10534o0);
            return;
        }
        Animator animator = this.f10528i0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m28679t0()) {
            i = 0;
            z = false;
        }
        m28686m0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f10528i0 = animatorSet;
        animatorSet.addListener(new C5524c());
        this.f10528i0.start();
    }

    /* renamed from: v0 */
    private void m28677v0(int i) {
        if (this.f10529j0 != i && C2733w0.m37029U(this)) {
            Animator animator = this.f10527h0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f10530k0 == 1) {
                m28687l0(i, arrayList);
            } else {
                m28688k0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f10527h0 = animatorSet;
            animatorSet.addListener(new C5521a());
            this.f10527h0.start();
        }
    }

    /* renamed from: w0 */
    private Drawable m28676w0(Drawable drawable) {
        if (drawable == null || this.f10524e0 == null) {
            return drawable;
        }
        Drawable r = C2400a.m37825r(drawable.mutate());
        C2400a.m37829n(r, this.f10524e0.intValue());
        return r;
    }

    /* renamed from: y0 */
    private void m28674y0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f10528i0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m28679t0()) {
                m28709C0(actionMenuView, 0, false);
            } else {
                m28709C0(actionMenuView, this.f10529j0, this.f10536q0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public void m28673z0() {
        float f;
        getTopEdgeTreatment().m28652q(getFabTranslationX());
        View q0 = m28682q0();
        C14038g gVar = this.f10526g0;
        if (!this.f10536q0 || !m28679t0()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        gVar.m1980Z(f);
        if (q0 != null) {
            q0.setTranslationY(getFabTranslationY());
            q0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: A0 */
    public void m28711A0(int i, int i2) {
        this.f10534o0 = i2;
        this.f10535p0 = true;
        m28678u0(i, this.f10536q0);
        m28677v0(i);
        this.f10529j0 = i;
    }

    /* renamed from: B0 */
    boolean m28710B0(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().m28658j()) {
            return false;
        }
        getTopEdgeTreatment().m28653o(f);
        this.f10526g0.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f10526g0.m1999G();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m28662d();
    }

    public int getFabAlignmentMode() {
        return this.f10529j0;
    }

    public int getFabAnimationMode() {
        return this.f10530k0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m28660f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m28659h();
    }

    public boolean getHideOnScroll() {
        return this.f10531l0;
    }

    /* renamed from: k0 */
    protected void m28688k0(int i, List<Animator> list) {
        FloatingActionButton p0 = m28683p0();
        if (p0 != null && !p0.m28061n()) {
            m28684o0();
            p0.m28063l(new C5522b(i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14042h.m1938f(this, this.f10526g0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m28689j0();
            m28673z0();
        }
        m28674y0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5529h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5529h hVar = (C5529h) parcelable;
        super.onRestoreInstanceState(hVar.m21547a());
        this.f10529j0 = hVar.f10562m;
        this.f10536q0 = hVar.f10563n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        C5529h hVar = new C5529h(super.onSaveInstanceState());
        hVar.f10562m = this.f10529j0;
        hVar.f10563n = this.f10536q0;
        return hVar;
    }

    /* renamed from: r0 */
    protected int m28681r0(ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        if (i != 1 || !z) {
            return 0;
        }
        boolean e = C5665o.m27826e(this);
        if (e) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt.getLayoutParams() instanceof Toolbar.C1629e) || (((Toolbar.C1629e) childAt.getLayoutParams()).f658a & 8388615) != 8388611) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (e) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (e) {
            i3 = actionMenuView.getRight();
        } else {
            i3 = actionMenuView.getLeft();
        }
        if (e) {
            i4 = this.f10539t0;
        } else {
            i4 = -this.f10540u0;
        }
        return i2 - (i3 + i4);
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C2400a.m37828o(this.f10526g0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m28657k(f);
            this.f10526g0.invalidateSelf();
            m28673z0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f10526g0.m1982X(f);
        getBehavior().m28728I(this, this.f10526g0.m2002D() - this.f10526g0.m2003C());
    }

    public void setFabAlignmentMode(int i) {
        m28711A0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f10530k0 = i;
    }

    void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().m28661e()) {
            getTopEdgeTreatment().m28656l(f);
            this.f10526g0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m28655m(f);
            this.f10526g0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m28654n(f);
            this.f10526g0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f10531l0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m28676w0(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f10524e0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: x0 */
    public void m28675x0(int i) {
        if (i != 0) {
            this.f10534o0 = 0;
            getMenu().clear();
            m40345x(i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2151b
    public Behavior getBehavior() {
        if (this.f10537r0 == null) {
            this.f10537r0 = new Behavior();
        }
        return this.f10537r0;
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: f */
        private WeakReference<BottomAppBar> f10543f;

        /* renamed from: g */
        private int f10544g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f10545h = new View$OnLayoutChangeListenerC5520a();

        /* renamed from: e */
        private final Rect f10542e = new Rect();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes3.dex */
        class View$OnLayoutChangeListenerC5520a implements View.OnLayoutChangeListener {
            View$OnLayoutChangeListenerC5520a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f10543f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.m28065j(Behavior.this.f10542e);
                int height = Behavior.this.f10542e.height();
                bottomAppBar.m28710B0(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().m1918r().mo1937a(new RectF(Behavior.this.f10542e)));
                CoordinatorLayout.C2155f fVar = (CoordinatorLayout.C2155f) view.getLayoutParams();
                if (Behavior.this.f10544g == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C6805d.f14583y) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (C5665o.m27826e(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f10525f0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f10525f0;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: Q */
        public boolean mo27375l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f10543f = new WeakReference<>(bottomAppBar);
            View q0 = bottomAppBar.m28682q0();
            if (q0 != null && !C2733w0.m37029U(q0)) {
                CoordinatorLayout.C2155f fVar = (CoordinatorLayout.C2155f) q0.getLayoutParams();
                fVar.f2999d = 49;
                this.f10544g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (q0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) q0;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C6802a.f14524b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C6802a.f14523a);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f10545h);
                    bottomAppBar.m28690i0(floatingActionButton);
                }
                bottomAppBar.m28673z0();
            }
            coordinatorLayout.m38742C(bottomAppBar, i);
            return super.mo27375l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: R */
        public boolean mo28651A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            if (!bottomAppBar.getHideOnScroll() || !super.mo28651A(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return false;
            }
            return true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
