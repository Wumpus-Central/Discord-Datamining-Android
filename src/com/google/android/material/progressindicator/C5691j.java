package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.vectordrawable.graphics.drawable.AbstractC3285b;
import com.google.android.material.progressindicator.AbstractC5676b;

/* renamed from: com.google.android.material.progressindicator.j */
/* loaded from: classes3.dex */
public final class C5691j<S extends AbstractC5676b> extends AbstractC5685g {

    /* renamed from: A */
    private AbstractC5690i<ObjectAnimator> f37562A;

    /* renamed from: z */
    private AbstractC5689h<S> f11145z;

    C5691j(Context context, AbstractC5676b bVar, AbstractC5689h<S> hVar, AbstractC5690i<ObjectAnimator> iVar) {
        super(context, bVar);
        m27726w(hVar);
        m27727v(iVar);
    }

    /* renamed from: s */
    public static C5691j<C5682e> m27730s(Context context, C5682e eVar) {
        return new C5691j<>(context, eVar, new C5677c(eVar), new C5678d(eVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f11145z.m27746g(canvas, m27759g());
            this.f11145z.mo27750c(canvas, this.f11136w);
            int i = 0;
            while (true) {
                AbstractC5690i<ObjectAnimator> iVar = this.f37562A;
                int[] iArr = iVar.f11144c;
                if (i < iArr.length) {
                    AbstractC5689h<S> hVar = this.f11145z;
                    Paint paint = this.f11136w;
                    float[] fArr = iVar.f11143b;
                    int i2 = i * 2;
                    hVar.mo27751b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC5685g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f11145z.mo27749d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f11145z.mo27748e();
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

    @Override // com.google.android.material.progressindicator.AbstractC5685g
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo27734l(AbstractC3285b bVar) {
        super.mo27734l(bVar);
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
        if (!isRunning()) {
            this.f37562A.mo27745a();
        }
        this.f11126m.m5249a(this.f11124k.getContentResolver());
        if (z && z3) {
            this.f37562A.mo27739g();
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
    /* renamed from: t */
    public AbstractC5690i<ObjectAnimator> m27729t() {
        return this.f37562A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public AbstractC5689h<S> m27728u() {
        return this.f11145z;
    }

    /* renamed from: v */
    void m27727v(AbstractC5690i<ObjectAnimator> iVar) {
        this.f37562A = iVar;
        iVar.m27741e(this);
    }

    /* renamed from: w */
    void m27726w(AbstractC5689h<S> hVar) {
        this.f11145z = hVar;
        hVar.m27747f(this);
    }
}
