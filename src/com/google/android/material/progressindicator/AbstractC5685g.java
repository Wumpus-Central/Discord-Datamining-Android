package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC3285b;
import java.util.ArrayList;
import java.util.List;
import p102fb.C7101a;
import sb.C12860a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.g */
/* loaded from: classes3.dex */
public abstract class AbstractC5685g extends Drawable implements Animatable {

    /* renamed from: y */
    private static final Property<AbstractC5685g, Float> f11123y = new C5688c(Float.class, "growFraction");

    /* renamed from: k */
    final Context f11124k;

    /* renamed from: l */
    final AbstractC5676b f11125l;

    /* renamed from: n */
    private ValueAnimator f11127n;

    /* renamed from: o */
    private ValueAnimator f11128o;

    /* renamed from: p */
    private boolean f11129p;

    /* renamed from: q */
    private boolean f11130q;

    /* renamed from: r */
    private float f11131r;

    /* renamed from: s */
    private List<AbstractC3285b> f11132s;

    /* renamed from: t */
    private AbstractC3285b f11133t;

    /* renamed from: u */
    private boolean f11134u;

    /* renamed from: v */
    private float f11135v;

    /* renamed from: x */
    private int f11137x;

    /* renamed from: w */
    final Paint f11136w = new Paint();

    /* renamed from: m */
    C12860a f11126m = new C12860a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.g$a */
    /* loaded from: classes3.dex */
    public class C5686a extends AnimatorListenerAdapter {
        C5686a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC5685g.this.m27761e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.g$b */
    /* loaded from: classes3.dex */
    public class C5687b extends AnimatorListenerAdapter {
        C5687b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC5685g.super.setVisible(false, false);
            AbstractC5685g.this.m27762d();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$c */
    /* loaded from: classes3.dex */
    class C5688c extends Property<AbstractC5685g, Float> {
        C5688c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(AbstractC5685g gVar) {
            return Float.valueOf(gVar.m27759g());
        }

        /* renamed from: b */
        public void set(AbstractC5685g gVar, Float f) {
            gVar.m27757m(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5685g(Context context, AbstractC5676b bVar) {
        this.f11124k = context;
        this.f11125l = bVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m27762d() {
        AbstractC3285b bVar = this.f11133t;
        if (bVar != null) {
            bVar.mo27801a(this);
        }
        List<AbstractC3285b> list = this.f11132s;
        if (!(list == null || this.f11134u)) {
            for (AbstractC3285b bVar2 : list) {
                bVar2.mo27801a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m27761e() {
        AbstractC3285b bVar = this.f11133t;
        if (bVar != null) {
            bVar.m34816b(this);
        }
        List<AbstractC3285b> list = this.f11132s;
        if (!(list == null || this.f11134u)) {
            for (AbstractC3285b bVar2 : list) {
                bVar2.m34816b(this);
            }
        }
    }

    /* renamed from: f */
    private void m27760f(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f11134u;
        this.f11134u = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f11134u = z;
    }

    /* renamed from: k */
    private void m27758k() {
        if (this.f11127n == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f11123y, 0.0f, 1.0f);
            this.f11127n = ofFloat;
            ofFloat.setDuration(500L);
            this.f11127n.setInterpolator(C7101a.f15487b);
            m27755o(this.f11127n);
        }
        if (this.f11128o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f11123y, 1.0f, 0.0f);
            this.f11128o = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f11128o.setInterpolator(C7101a.f15487b);
            m27756n(this.f11128o);
        }
    }

    /* renamed from: n */
    private void m27756n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f11128o;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f11128o = valueAnimator;
            valueAnimator.addListener(new C5687b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* renamed from: o */
    private void m27755o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f11127n;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f11127n = valueAnimator;
            valueAnimator.addListener(new C5686a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m27759g() {
        if (!this.f11125l.m27799b() && !this.f11125l.m27800a()) {
            return 1.0f;
        }
        if (this.f11130q || this.f11129p) {
            return this.f11131r;
        }
        return this.f11135v;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11137x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean mo27737h() {
        return mo27733p(false, false, false);
    }

    /* renamed from: i */
    public boolean mo27736i() {
        ValueAnimator valueAnimator = this.f11128o;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f11130q;
    }

    public boolean isRunning() {
        return mo27735j() || mo27736i();
    }

    /* renamed from: j */
    public boolean mo27735j() {
        ValueAnimator valueAnimator = this.f11127n;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f11129p;
    }

    /* renamed from: l */
    public void mo27734l(AbstractC3285b bVar) {
        if (this.f11132s == null) {
            this.f11132s = new ArrayList();
        }
        if (!this.f11132s.contains(bVar)) {
            this.f11132s.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m27757m(float f) {
        if (this.f11135v != f) {
            this.f11135v = f;
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public boolean mo27733p(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float a = this.f11126m.m5249a(this.f11124k.getContentResolver());
        if (!z3 || a <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        return mo27732q(z, z2, z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo27732q(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        boolean z4;
        boolean z5;
        m27758k();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f11127n;
        } else {
            valueAnimator = this.f11128o;
        }
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m27760f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (!z || super.setVisible(z, false)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z) {
                z5 = this.f11125l.m27799b();
            } else {
                z5 = this.f11125l.m27800a();
            }
            if (!z5) {
                m27760f(valueAnimator);
                return z4;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }

    /* renamed from: r */
    public boolean mo27731r(AbstractC3285b bVar) {
        List<AbstractC3285b> list = this.f11132s;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f11132s.remove(bVar);
        if (!this.f11132s.isEmpty()) {
            return true;
        }
        this.f11132s = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f11137x = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11136w.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return mo27733p(z, z2, true);
    }

    public void start() {
        mo27732q(true, true, false);
    }

    public void stop() {
        mo27732q(false, true, false);
    }
}
