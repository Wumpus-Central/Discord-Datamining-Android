package p167j2;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p188k2.AbstractC9721a;
import p188k2.C9730d;
import p223m2.C10474e;
import p254o2.C11181k;
import p254o2.C11192s;
import p275p2.AbstractC11511b;
import p343t2.C12948i;
import p358u2.C13180c;

/* renamed from: j2.o */
/* loaded from: classes.dex */
public class C9479o implements AbstractC9721a.AbstractC9722b, AbstractC9473k, AbstractC9476m {

    /* renamed from: c */
    private final String f20951c;

    /* renamed from: d */
    private final boolean f20952d;

    /* renamed from: e */
    private final C7748e0 f20953e;

    /* renamed from: f */
    private final AbstractC9721a<?, PointF> f20954f;

    /* renamed from: g */
    private final AbstractC9721a<?, PointF> f20955g;

    /* renamed from: h */
    private final AbstractC9721a<?, Float> f20956h;

    /* renamed from: k */
    private boolean f20959k;

    /* renamed from: a */
    private final Path f20949a = new Path();

    /* renamed from: b */
    private final RectF f20950b = new RectF();

    /* renamed from: i */
    private final C9464b f20957i = new C9464b();

    /* renamed from: j */
    private AbstractC9721a<Float, Float> f20958j = null;

    public C9479o(C7748e0 e0Var, AbstractC11511b bVar, C11181k kVar) {
        this.f20951c = kVar.m10568c();
        this.f20952d = kVar.m10565f();
        this.f20953e = e0Var;
        AbstractC9721a<PointF, PointF> a = kVar.m10567d().mo12624a();
        this.f20954f = a;
        AbstractC9721a<PointF, PointF> a2 = kVar.m10566e().mo12624a();
        this.f20955g = a2;
        AbstractC9721a<Float, Float> a3 = kVar.m10569b().mo12624a();
        this.f20956h = a3;
        bVar.m9519j(a);
        bVar.m9519j(a2);
        bVar.m9519j(a3);
        a.m15511a(this);
        a2.m15511a(this);
        a3.m15511a(this);
    }

    /* renamed from: g */
    private void m16170g() {
        this.f20959k = false;
        this.f20953e.invalidateSelf();
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        m16170g();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC9465c cVar = list.get(i);
            if (cVar instanceof C9485u) {
                C9485u uVar = (C9485u) cVar;
                if (uVar.m16157k() == C11192s.EnumC11193a.SIMULTANEOUSLY) {
                    this.f20957i.m16191a(uVar);
                    uVar.m16161c(this);
                }
            }
            if (cVar instanceof C9481q) {
                this.f20958j = ((C9481q) cVar).m16166i();
            }
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        if (t == AbstractC7765j0.f16887l) {
            this.f20955g.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16889n) {
            this.f20954f.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16888m) {
            this.f20956h.m15504n(cVar);
        }
    }

    @Override // p167j2.AbstractC9476m
    /* renamed from: d */
    public Path mo16163d() {
        float f;
        AbstractC9721a<Float, Float> aVar;
        if (this.f20959k) {
            return this.f20949a;
        }
        this.f20949a.reset();
        if (this.f20952d) {
            this.f20959k = true;
            return this.f20949a;
        }
        PointF h = this.f20955g.mo15449h();
        float f2 = h.x / 2.0f;
        float f3 = h.y / 2.0f;
        AbstractC9721a<?, Float> aVar2 = this.f20956h;
        if (aVar2 == null) {
            f = 0.0f;
        } else {
            f = ((C9730d) aVar2).m15486p();
        }
        if (f == 0.0f && (aVar = this.f20958j) != null) {
            f = Math.min(aVar.mo15449h().floatValue(), Math.min(f2, f3));
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF h2 = this.f20954f.mo15449h();
        this.f20949a.moveTo(h2.x + f2, (h2.y - f3) + f);
        this.f20949a.lineTo(h2.x + f2, (h2.y + f3) - f);
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f20950b;
            float f4 = h2.x;
            float f5 = f * 2.0f;
            float f6 = h2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f20949a.arcTo(this.f20950b, 0.0f, 90.0f, false);
        }
        this.f20949a.lineTo((h2.x - f2) + f, h2.y + f3);
        if (i > 0) {
            RectF rectF2 = this.f20950b;
            float f7 = h2.x;
            float f8 = h2.y;
            float f9 = f * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f20949a.arcTo(this.f20950b, 90.0f, 90.0f, false);
        }
        this.f20949a.lineTo(h2.x - f2, (h2.y - f3) + f);
        if (i > 0) {
            RectF rectF3 = this.f20950b;
            float f10 = h2.x;
            float f11 = h2.y;
            float f12 = f * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.f20949a.arcTo(this.f20950b, 180.0f, 90.0f, false);
        }
        this.f20949a.lineTo((h2.x + f2) - f, h2.y - f3);
        if (i > 0) {
            RectF rectF4 = this.f20950b;
            float f13 = h2.x;
            float f14 = f * 2.0f;
            float f15 = h2.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.f20949a.arcTo(this.f20950b, 270.0f, 90.0f, false);
        }
        this.f20949a.close();
        this.f20957i.m16190b(this.f20949a);
        this.f20959k = true;
        return this.f20949a;
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20951c;
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        C12948i.m4972k(eVar, i, list, eVar2, this);
    }
}
