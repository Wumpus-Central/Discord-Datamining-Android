package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.dynamicanimation.animation.C2851b;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.vectordrawable.graphics.drawable.AbstractC3285b;
import com.google.android.material.progressindicator.AbstractC5676b;
import lb.C10395a;
import p166j1.AbstractC9460a;

/* renamed from: com.google.android.material.progressindicator.f */
/* loaded from: classes3.dex */
public final class C5683f<S extends AbstractC5676b> extends AbstractC5685g {

    /* renamed from: E */
    private static final AbstractC9460a<C5683f> f37557E = new C5684a("indicatorLevel");

    /* renamed from: A */
    private final C2851b f37558A;

    /* renamed from: B */
    private final SpringAnimation f37559B;

    /* renamed from: C */
    private float f37560C;

    /* renamed from: D */
    private boolean f37561D = false;

    /* renamed from: z */
    private AbstractC5689h<S> f11122z;

    /* renamed from: com.google.android.material.progressindicator.f$a */
    /* loaded from: classes3.dex */
    class C5684a extends AbstractC9460a<C5683f> {
        C5684a(String str) {
            super(str);
        }

        /* renamed from: c */
        public float mo16199a(C5683f fVar) {
            return fVar.m27771w() * 10000.0f;
        }

        /* renamed from: d */
        public void mo16198b(C5683f fVar, float f) {
            fVar.m27769y(f / 10000.0f);
        }
    }

    C5683f(Context context, AbstractC5676b bVar, AbstractC5689h<S> hVar) {
        super(context, bVar);
        m27770x(hVar);
        C2851b bVar2 = new C2851b();
        this.f37558A = bVar2;
        bVar2.m36493d(1.0f);
        bVar2.m36491f(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, f37557E);
        this.f37559B = springAnimation;
        springAnimation.m36508t(bVar2);
        m27757m(1.0f);
    }

    /* renamed from: u */
    public static C5683f<C5682e> m27773u(Context context, C5682e eVar) {
        return new C5683f<>(context, eVar, new C5677c(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public float m27771w() {
        return this.f37560C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m27769y(float f) {
        this.f37560C = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f11122z.m27746g(canvas, m27759g());
            this.f11122z.mo27750c(canvas, this.f11136w);
            this.f11122z.mo27751b(canvas, this.f11136w, 0.0f, m27771w(), C10395a.m13520a(this.f11125l.f11096c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f11122z.mo27749d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f11122z.mo27748e();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g
    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo27737h() {
        return super.mo27737h();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g
    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo27736i() {
        return super.mo27736i();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g
    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo27735j() {
        return super.mo27735j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f37559B.m36507u();
        m27769y(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo27734l(AbstractC3285b bVar) {
        super.mo27734l(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f37561D) {
            this.f37559B.m36507u();
            m27769y(i / 10000.0f);
            return true;
        }
        this.f37559B.m36548j(m27771w() * 10000.0f);
        this.f37559B.m36513o(i);
        return true;
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g
    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo27733p(boolean z, boolean z2, boolean z3) {
        return super.mo27733p(z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC5685g
    /* renamed from: q */
    public boolean mo27732q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo27732q(z, z2, z3);
        float a = this.f11126m.m5249a(this.f11124k.getContentResolver());
        if (a == 0.0f) {
            this.f37561D = true;
        } else {
            this.f37561D = false;
            this.f37558A.m36491f(50.0f / a);
        }
        return q;
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g
    /* renamed from: r */
    public /* bridge */ /* synthetic */ boolean mo27731r(AbstractC3285b bVar) {
        return super.mo27731r(bVar);
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public AbstractC5689h<S> m27772v() {
        return this.f11122z;
    }

    /* renamed from: x */
    void m27770x(AbstractC5689h<S> hVar) {
        this.f11122z = hVar;
        hVar.m27747f(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m27768z(float f) {
        setLevel((int) (f * 10000.0f));
    }
}
