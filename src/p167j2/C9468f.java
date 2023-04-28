package p167j2;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p188k2.AbstractC9721a;
import p223m2.C10474e;
import p254o2.C11169b;
import p254o2.C11192s;
import p275p2.AbstractC11511b;
import p343t2.C12948i;
import p358u2.C13180c;

/* renamed from: j2.f */
/* loaded from: classes.dex */
public class C9468f implements AbstractC9476m, AbstractC9721a.AbstractC9722b, AbstractC9473k {

    /* renamed from: b */
    private final String f20876b;

    /* renamed from: c */
    private final C7748e0 f20877c;

    /* renamed from: d */
    private final AbstractC9721a<?, PointF> f20878d;

    /* renamed from: e */
    private final AbstractC9721a<?, PointF> f20879e;

    /* renamed from: f */
    private final C11169b f20880f;

    /* renamed from: h */
    private boolean f20882h;

    /* renamed from: a */
    private final Path f20875a = new Path();

    /* renamed from: g */
    private final C9464b f20881g = new C9464b();

    public C9468f(C7748e0 e0Var, AbstractC11511b bVar, C11169b bVar2) {
        this.f20876b = bVar2.m10619b();
        this.f20877c = e0Var;
        AbstractC9721a<PointF, PointF> a = bVar2.m10617d().mo12624a();
        this.f20878d = a;
        AbstractC9721a<PointF, PointF> a2 = bVar2.m10618c().mo12624a();
        this.f20879e = a2;
        this.f20880f = bVar2;
        bVar.m9519j(a);
        bVar.m9519j(a2);
        a.m15511a(this);
        a2.m15511a(this);
    }

    /* renamed from: g */
    private void m16184g() {
        this.f20882h = false;
        this.f20877c.invalidateSelf();
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        m16184g();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC9465c cVar = list.get(i);
            if (cVar instanceof C9485u) {
                C9485u uVar = (C9485u) cVar;
                if (uVar.m16157k() == C11192s.EnumC11193a.SIMULTANEOUSLY) {
                    this.f20881g.m16191a(uVar);
                    uVar.m16161c(this);
                }
            }
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        if (t == AbstractC7765j0.f16886k) {
            this.f20878d.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16889n) {
            this.f20879e.m15504n(cVar);
        }
    }

    @Override // p167j2.AbstractC9476m
    /* renamed from: d */
    public Path mo16163d() {
        if (this.f20882h) {
            return this.f20875a;
        }
        this.f20875a.reset();
        if (this.f20880f.m10616e()) {
            this.f20882h = true;
            return this.f20875a;
        }
        PointF h = this.f20878d.mo15449h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f20875a.reset();
        if (this.f20880f.m10615f()) {
            float f5 = -f2;
            this.f20875a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f20875a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f20875a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f20875a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f20875a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f20875a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f20875a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f20875a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f20875a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f20875a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF h2 = this.f20879e.mo15449h();
        this.f20875a.offset(h2.x, h2.y);
        this.f20875a.close();
        this.f20881g.m16190b(this.f20875a);
        this.f20882h = true;
        return this.f20875a;
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20876b;
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        C12948i.m4972k(eVar, i, list, eVar2, this);
    }
}
