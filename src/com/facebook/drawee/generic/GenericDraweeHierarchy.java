package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.AbstractC4812c;
import com.facebook.drawee.drawable.C4814e;
import com.facebook.drawee.drawable.C4816f;
import com.facebook.drawee.drawable.C4817g;
import com.facebook.drawee.drawable.C4826n;
import com.facebook.drawee.drawable.ScalingUtils;
import p007a6.C1271b;
import p345t4.C12958b;
import p379v4.AbstractC13428a;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public class GenericDraweeHierarchy implements AbstractC13428a {

    /* renamed from: a */
    private final Drawable f7799a;

    /* renamed from: b */
    private final Resources f7800b;

    /* renamed from: c */
    private C4830a f7801c;

    /* renamed from: d */
    private final C12958b f7802d;

    /* renamed from: e */
    private final C4814e f7803e;

    /* renamed from: f */
    private final C4816f f7804f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GenericDraweeHierarchy(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        int i;
        int i2;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f7799a = colorDrawable;
        if (C1271b.m41491d()) {
            C1271b.m41494a("GenericDraweeHierarchy()");
        }
        this.f7800b = genericDraweeHierarchyBuilder.m31740p();
        this.f7801c = genericDraweeHierarchyBuilder.m31737s();
        C4816f fVar = new C4816f(colorDrawable);
        this.f7804f = fVar;
        int i3 = 1;
        if (genericDraweeHierarchyBuilder.m31746j() != null) {
            i = genericDraweeHierarchyBuilder.m31746j().size();
        } else {
            i = 1;
        }
        i = i == 0 ? 1 : i;
        if (genericDraweeHierarchyBuilder.m31743m() != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        Drawable[] drawableArr = new Drawable[i4 + 6];
        drawableArr[0] = m31786h(genericDraweeHierarchyBuilder.m31751e(), null);
        drawableArr[1] = m31786h(genericDraweeHierarchyBuilder.m31745k(), genericDraweeHierarchyBuilder.m31744l());
        drawableArr[2] = m31787g(fVar, genericDraweeHierarchyBuilder.m31752d(), genericDraweeHierarchyBuilder.m31753c(), genericDraweeHierarchyBuilder.m31754b());
        drawableArr[3] = m31786h(genericDraweeHierarchyBuilder.m31742n(), genericDraweeHierarchyBuilder.m31741o());
        drawableArr[4] = m31786h(genericDraweeHierarchyBuilder.m31739q(), genericDraweeHierarchyBuilder.m31738r());
        drawableArr[5] = m31786h(genericDraweeHierarchyBuilder.m31748h(), genericDraweeHierarchyBuilder.m31747i());
        if (i4 > 0) {
            if (genericDraweeHierarchyBuilder.m31746j() != null) {
                i3 = 0;
                for (Drawable drawable : genericDraweeHierarchyBuilder.m31746j()) {
                    drawableArr[i3 + 6] = m31786h(drawable, null);
                    i3++;
                }
            }
            if (genericDraweeHierarchyBuilder.m31743m() != null) {
                drawableArr[i3 + 6] = m31786h(genericDraweeHierarchyBuilder.m31743m(), null);
            }
        }
        C4814e eVar = new C4814e(drawableArr, false, 2);
        this.f7803e = eVar;
        eVar.m31818r(genericDraweeHierarchyBuilder.m31749g());
        C12958b bVar = new C12958b(C4831b.m31704e(eVar, this.f7801c));
        this.f7802d = bVar;
        bVar.mutate();
        m31775s();
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* renamed from: B */
    private void m31790B(float f) {
        Drawable b = this.f7803e.m31841b(3);
        if (b != null) {
            if (f >= 0.999f) {
                if (b instanceof Animatable) {
                    ((Animatable) b).stop();
                }
                m31783k(3);
            } else {
                if (b instanceof Animatable) {
                    ((Animatable) b).start();
                }
                m31785i(3);
            }
            b.setLevel(Math.round(f * 10000.0f));
        }
    }

    /* renamed from: g */
    private Drawable m31787g(Drawable drawable, ScalingUtils.ScaleType scaleType, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C4831b.m31702g(drawable, scaleType, pointF);
    }

    /* renamed from: h */
    private Drawable m31786h(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        return C4831b.m31703f(C4831b.m31705d(drawable, this.f7801c, this.f7800b), scaleType);
    }

    /* renamed from: i */
    private void m31785i(int i) {
        if (i >= 0) {
            this.f7803e.m31826j(i);
        }
    }

    /* renamed from: j */
    private void m31784j() {
        m31783k(1);
        m31783k(2);
        m31783k(3);
        m31783k(4);
        m31783k(5);
    }

    /* renamed from: k */
    private void m31783k(int i) {
        if (i >= 0) {
            this.f7803e.m31825k(i);
        }
    }

    /* renamed from: n */
    private AbstractC4812c m31780n(int i) {
        AbstractC4812c c = this.f7803e.m31840c(i);
        if (c.getDrawable() instanceof C4817g) {
            c = (C4817g) c.getDrawable();
        }
        if (c.getDrawable() instanceof C4826n) {
            return (C4826n) c.getDrawable();
        }
        return c;
    }

    /* renamed from: p */
    private C4826n m31778p(int i) {
        AbstractC4812c n = m31780n(i);
        if (n instanceof C4826n) {
            return (C4826n) n;
        }
        return C4831b.m31698k(n, ScalingUtils.ScaleType.f7703a);
    }

    /* renamed from: q */
    private boolean m31777q(int i) {
        return m31780n(i) instanceof C4826n;
    }

    /* renamed from: r */
    private void m31776r() {
        this.f7804f.setDrawable(this.f7799a);
    }

    /* renamed from: s */
    private void m31775s() {
        C4814e eVar = this.f7803e;
        if (eVar != null) {
            eVar.m31830f();
            this.f7803e.m31827i();
            m31784j();
            m31785i(1);
            this.f7803e.m31824l();
            this.f7803e.m31828h();
        }
    }

    /* renamed from: v */
    private void m31772v(int i, Drawable drawable) {
        if (drawable == null) {
            this.f7803e.m31838e(i, null);
            return;
        }
        m31780n(i).setDrawable(C4831b.m31705d(drawable, this.f7801c, this.f7800b));
    }

    /* renamed from: A */
    public void m31791A(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        m31772v(1, drawable);
        m31778p(1).m31792m(scaleType);
    }

    /* renamed from: C */
    public void m31789C(Drawable drawable) {
        m31772v(3, drawable);
    }

    /* renamed from: D */
    public void m31788D(C4830a aVar) {
        this.f7801c = aVar;
        C4831b.m31699j(this.f7802d, aVar);
        for (int i = 0; i < this.f7803e.m31839d(); i++) {
            C4831b.m31700i(m31780n(i), this.f7801c, this.f7800b);
        }
    }

    @Override // p379v4.AbstractC13428a
    /* renamed from: a */
    public void mo3747a(Throwable th2) {
        this.f7803e.m31830f();
        m31784j();
        if (this.f7803e.m31841b(4) != null) {
            m31785i(4);
        } else {
            m31785i(1);
        }
        this.f7803e.m31828h();
    }

    @Override // p379v4.AbstractC13428a
    /* renamed from: b */
    public void mo3746b(Throwable th2) {
        this.f7803e.m31830f();
        m31784j();
        if (this.f7803e.m31841b(5) != null) {
            m31785i(5);
        } else {
            m31785i(1);
        }
        this.f7803e.m31828h();
    }

    @Override // p379v4.AbstractC13428a
    /* renamed from: c */
    public void mo3745c(float f, boolean z) {
        if (this.f7803e.m31841b(3) != null) {
            this.f7803e.m31830f();
            m31790B(f);
            if (z) {
                this.f7803e.m31824l();
            }
            this.f7803e.m31828h();
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeHierarchy
    /* renamed from: d */
    public Drawable mo31692d() {
        return this.f7802d;
    }

    @Override // p379v4.AbstractC13428a
    /* renamed from: e */
    public void mo3744e(Drawable drawable, float f, boolean z) {
        Drawable d = C4831b.m31705d(drawable, this.f7801c, this.f7800b);
        d.mutate();
        this.f7804f.setDrawable(d);
        this.f7803e.m31830f();
        m31784j();
        m31785i(2);
        m31790B(f);
        if (z) {
            this.f7803e.m31824l();
        }
        this.f7803e.m31828h();
    }

    @Override // p379v4.AbstractC13428a
    /* renamed from: f */
    public void mo3743f(Drawable drawable) {
        this.f7802d.m4945h(drawable);
    }

    @Override // com.facebook.drawee.interfaces.DraweeHierarchy
    public Rect getBounds() {
        return this.f7802d.getBounds();
    }

    /* renamed from: l */
    public PointF m31782l() {
        if (!m31777q(2)) {
            return null;
        }
        return m31778p(2).m31795j();
    }

    /* renamed from: m */
    public ScalingUtils.ScaleType m31781m() {
        if (!m31777q(2)) {
            return null;
        }
        return m31778p(2).m31794k();
    }

    /* renamed from: o */
    public C4830a m31779o() {
        return this.f7801c;
    }

    @Override // p379v4.AbstractC13428a
    public void reset() {
        m31776r();
        m31775s();
    }

    /* renamed from: t */
    public void m31774t(ScalingUtils.ScaleType scaleType) {
        C13740j.m2834g(scaleType);
        m31778p(2).m31792m(scaleType);
    }

    /* renamed from: u */
    public void m31773u(Drawable drawable) {
        m31772v(0, drawable);
    }

    /* renamed from: w */
    public void m31771w(int i) {
        this.f7803e.m31818r(i);
    }

    /* renamed from: x */
    public void m31770x(int i, Drawable drawable) {
        boolean z;
        if (i < 0 || i + 6 >= this.f7803e.m31839d()) {
            z = false;
        } else {
            z = true;
        }
        C13740j.m2838c(z, "The given index does not correspond to an overlay image.");
        m31772v(i + 6, drawable);
    }

    /* renamed from: y */
    public void m31769y(Drawable drawable) {
        m31770x(0, drawable);
    }

    /* renamed from: z */
    public void m31768z(Drawable drawable) {
        m31772v(1, drawable);
    }
}
