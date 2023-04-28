package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.drawable.AbstractC4828p;
import com.facebook.drawee.drawable.AbstractC4829q;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import p277p4.C11531c;
import p394w3.C13736i;
import p394w3.C13740j;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class DraweeHolder<DH extends DraweeHierarchy> implements AbstractC4829q {

    /* renamed from: d */
    private DH f7854d;

    /* renamed from: a */
    private boolean f7851a = false;

    /* renamed from: b */
    private boolean f7852b = false;

    /* renamed from: c */
    private boolean f7853c = true;

    /* renamed from: e */
    private DraweeController f7855e = null;

    /* renamed from: f */
    private final C11531c f7856f = C11531c.m9442a();

    public DraweeHolder(DH dh) {
        if (dh != null) {
            m31656p(dh);
        }
    }

    /* renamed from: b */
    private void m31670b() {
        if (!this.f7851a) {
            this.f7856f.m9441b(C11531c.EnumC11532a.ON_ATTACH_CONTROLLER);
            this.f7851a = true;
            DraweeController draweeController = this.f7855e;
            if (draweeController != null && draweeController.mo31693f() != null) {
                this.f7855e.mo31695d();
            }
        }
    }

    /* renamed from: c */
    private void m31669c() {
        if (!this.f7852b || !this.f7853c) {
            m31667e();
        } else {
            m31670b();
        }
    }

    /* renamed from: d */
    public static <DH extends DraweeHierarchy> DraweeHolder<DH> m31668d(DH dh, Context context) {
        DraweeHolder<DH> draweeHolder = new DraweeHolder<>(dh);
        draweeHolder.m31658n(context);
        return draweeHolder;
    }

    /* renamed from: e */
    private void m31667e() {
        if (this.f7851a) {
            this.f7856f.m9441b(C11531c.EnumC11532a.ON_DETACH_CONTROLLER);
            this.f7851a = false;
            if (m31662j()) {
                this.f7855e.mo31697a();
            }
        }
    }

    /* renamed from: q */
    private void m31655q(AbstractC4829q qVar) {
        Drawable h = m31664h();
        if (h instanceof AbstractC4828p) {
            ((AbstractC4828p) h).mo4946f(qVar);
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4829q
    /* renamed from: a */
    public void mo31671a(boolean z) {
        C11531c.EnumC11532a aVar;
        if (this.f7853c != z) {
            C11531c cVar = this.f7856f;
            if (z) {
                aVar = C11531c.EnumC11532a.ON_DRAWABLE_SHOW;
            } else {
                aVar = C11531c.EnumC11532a.ON_DRAWABLE_HIDE;
            }
            cVar.m9441b(aVar);
            this.f7853c = z;
            m31669c();
        }
    }

    /* renamed from: f */
    public DraweeController m31666f() {
        return this.f7855e;
    }

    /* renamed from: g */
    public DH m31665g() {
        return (DH) ((DraweeHierarchy) C13740j.m2834g(this.f7854d));
    }

    /* renamed from: h */
    public Drawable m31664h() {
        DH dh = this.f7854d;
        if (dh == null) {
            return null;
        }
        return dh.mo31692d();
    }

    /* renamed from: i */
    public boolean m31663i() {
        return this.f7854d != null;
    }

    /* renamed from: j */
    public boolean m31662j() {
        DraweeController draweeController = this.f7855e;
        return draweeController != null && draweeController.mo31693f() == this.f7854d;
    }

    /* renamed from: k */
    public void m31661k() {
        this.f7856f.m9441b(C11531c.EnumC11532a.ON_HOLDER_ATTACH);
        this.f7852b = true;
        m31669c();
    }

    /* renamed from: l */
    public void m31660l() {
        this.f7856f.m9441b(C11531c.EnumC11532a.ON_HOLDER_DETACH);
        this.f7852b = false;
        m31669c();
    }

    /* renamed from: m */
    public boolean m31659m(MotionEvent motionEvent) {
        if (!m31662j()) {
            return false;
        }
        return this.f7855e.mo31696b(motionEvent);
    }

    /* renamed from: n */
    public void m31658n(Context context) {
    }

    /* renamed from: o */
    public void m31657o(DraweeController draweeController) {
        boolean z = this.f7851a;
        if (z) {
            m31667e();
        }
        if (m31662j()) {
            this.f7856f.m9441b(C11531c.EnumC11532a.ON_CLEAR_OLD_CONTROLLER);
            this.f7855e.mo31694e(null);
        }
        this.f7855e = draweeController;
        if (draweeController != null) {
            this.f7856f.m9441b(C11531c.EnumC11532a.ON_SET_CONTROLLER);
            this.f7855e.mo31694e(this.f7854d);
        } else {
            this.f7856f.m9441b(C11531c.EnumC11532a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m31670b();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4829q
    public void onDraw() {
        if (!this.f7851a) {
            C13925a.m2306F(C11531c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f7855e)), toString());
            this.f7852b = true;
            this.f7853c = true;
            m31669c();
        }
    }

    /* renamed from: p */
    public void m31656p(DH dh) {
        boolean z;
        this.f7856f.m9441b(C11531c.EnumC11532a.ON_SET_HIERARCHY);
        boolean j = m31662j();
        m31655q(null);
        DH dh2 = (DH) ((DraweeHierarchy) C13740j.m2834g(dh));
        this.f7854d = dh2;
        Drawable d = dh2.mo31692d();
        if (d == null || d.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        mo31671a(z);
        m31655q(this);
        if (j) {
            this.f7855e.mo31694e(dh);
        }
    }

    public String toString() {
        return C13736i.m2846c(this).m2843c("controllerAttached", this.f7851a).m2843c("holderAttached", this.f7852b).m2843c("drawableVisible", this.f7853c).m2844b("events", this.f7856f.toString()).toString();
    }
}
