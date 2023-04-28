package p188k2;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p126h2.AbstractC7765j0;
import p188k2.AbstractC9721a;
import p238n2.C10704l;
import p275p2.AbstractC11511b;
import p358u2.C13178a;
import p358u2.C13180c;
import p358u2.C13181d;

/* renamed from: k2.p */
/* loaded from: classes.dex */
public class C9743p {

    /* renamed from: a */
    private final Matrix f21654a = new Matrix();

    /* renamed from: b */
    private final Matrix f21655b;

    /* renamed from: c */
    private final Matrix f21656c;

    /* renamed from: d */
    private final Matrix f21657d;

    /* renamed from: e */
    private final float[] f21658e;

    /* renamed from: f */
    private AbstractC9721a<PointF, PointF> f21659f;

    /* renamed from: g */
    private AbstractC9721a<?, PointF> f21660g;

    /* renamed from: h */
    private AbstractC9721a<C13181d, C13181d> f21661h;

    /* renamed from: i */
    private AbstractC9721a<Float, Float> f21662i;

    /* renamed from: j */
    private AbstractC9721a<Integer, Integer> f21663j;

    /* renamed from: k */
    private C9730d f21664k;

    /* renamed from: l */
    private C9730d f21665l;

    /* renamed from: m */
    private AbstractC9721a<?, Float> f21666m;

    /* renamed from: n */
    private AbstractC9721a<?, Float> f21667n;

    public C9743p(C10704l lVar) {
        AbstractC9721a<PointF, PointF> aVar;
        AbstractC9721a<PointF, PointF> aVar2;
        AbstractC9721a<C13181d, C13181d> aVar3;
        AbstractC9721a<Float, Float> aVar4;
        C9730d dVar;
        C9730d dVar2;
        if (lVar.m12633c() == null) {
            aVar = null;
        } else {
            aVar = lVar.m12633c().mo12624a();
        }
        this.f21659f = aVar;
        if (lVar.m12630f() == null) {
            aVar2 = null;
        } else {
            aVar2 = lVar.m12630f().mo12624a();
        }
        this.f21660g = aVar2;
        if (lVar.m12628h() == null) {
            aVar3 = null;
        } else {
            aVar3 = lVar.m12628h().mo12624a();
        }
        this.f21661h = aVar3;
        if (lVar.m12629g() == null) {
            aVar4 = null;
        } else {
            aVar4 = lVar.m12629g().mo12624a();
        }
        this.f21662i = aVar4;
        if (lVar.m12627i() == null) {
            dVar = null;
        } else {
            dVar = (C9730d) lVar.m12627i().mo12624a();
        }
        this.f21664k = dVar;
        if (dVar != null) {
            this.f21655b = new Matrix();
            this.f21656c = new Matrix();
            this.f21657d = new Matrix();
            this.f21658e = new float[9];
        } else {
            this.f21655b = null;
            this.f21656c = null;
            this.f21657d = null;
            this.f21658e = null;
        }
        if (lVar.m12626j() == null) {
            dVar2 = null;
        } else {
            dVar2 = (C9730d) lVar.m12626j().mo12624a();
        }
        this.f21665l = dVar2;
        if (lVar.m12631e() != null) {
            this.f21663j = lVar.m12631e().mo12624a();
        }
        if (lVar.m12625k() != null) {
            this.f21666m = lVar.m12625k().mo12624a();
        } else {
            this.f21666m = null;
        }
        if (lVar.m12632d() != null) {
            this.f21667n = lVar.m12632d().mo12624a();
        } else {
            this.f21667n = null;
        }
    }

    /* renamed from: d */
    private void m15457d() {
        for (int i = 0; i < 9; i++) {
            this.f21658e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void m15460a(AbstractC11511b bVar) {
        bVar.m9519j(this.f21663j);
        bVar.m9519j(this.f21666m);
        bVar.m9519j(this.f21667n);
        bVar.m9519j(this.f21659f);
        bVar.m9519j(this.f21660g);
        bVar.m9519j(this.f21661h);
        bVar.m9519j(this.f21662i);
        bVar.m9519j(this.f21664k);
        bVar.m9519j(this.f21665l);
    }

    /* renamed from: b */
    public void m15459b(AbstractC9721a.AbstractC9722b bVar) {
        AbstractC9721a<Integer, Integer> aVar = this.f21663j;
        if (aVar != null) {
            aVar.m15511a(bVar);
        }
        AbstractC9721a<?, Float> aVar2 = this.f21666m;
        if (aVar2 != null) {
            aVar2.m15511a(bVar);
        }
        AbstractC9721a<?, Float> aVar3 = this.f21667n;
        if (aVar3 != null) {
            aVar3.m15511a(bVar);
        }
        AbstractC9721a<PointF, PointF> aVar4 = this.f21659f;
        if (aVar4 != null) {
            aVar4.m15511a(bVar);
        }
        AbstractC9721a<?, PointF> aVar5 = this.f21660g;
        if (aVar5 != null) {
            aVar5.m15511a(bVar);
        }
        AbstractC9721a<C13181d, C13181d> aVar6 = this.f21661h;
        if (aVar6 != null) {
            aVar6.m15511a(bVar);
        }
        AbstractC9721a<Float, Float> aVar7 = this.f21662i;
        if (aVar7 != null) {
            aVar7.m15511a(bVar);
        }
        C9730d dVar = this.f21664k;
        if (dVar != null) {
            dVar.m15511a(bVar);
        }
        C9730d dVar2 = this.f21665l;
        if (dVar2 != null) {
            dVar2.m15511a(bVar);
        }
    }

    /* renamed from: c */
    public <T> boolean m15458c(T t, C13180c<T> cVar) {
        if (t == AbstractC7765j0.f16881f) {
            AbstractC9721a<PointF, PointF> aVar = this.f21659f;
            if (aVar == null) {
                this.f21659f = new C9744q(cVar, new PointF());
                return true;
            }
            aVar.m15504n(cVar);
            return true;
        } else if (t == AbstractC7765j0.f16882g) {
            AbstractC9721a<?, PointF> aVar2 = this.f21660g;
            if (aVar2 == null) {
                this.f21660g = new C9744q(cVar, new PointF());
                return true;
            }
            aVar2.m15504n(cVar);
            return true;
        } else {
            if (t == AbstractC7765j0.f16883h) {
                AbstractC9721a<?, PointF> aVar3 = this.f21660g;
                if (aVar3 instanceof C9740n) {
                    ((C9740n) aVar3).m15465r(cVar);
                    return true;
                }
            }
            if (t == AbstractC7765j0.f16884i) {
                AbstractC9721a<?, PointF> aVar4 = this.f21660g;
                if (aVar4 instanceof C9740n) {
                    ((C9740n) aVar4).m15464s(cVar);
                    return true;
                }
            }
            if (t == AbstractC7765j0.f16890o) {
                AbstractC9721a<C13181d, C13181d> aVar5 = this.f21661h;
                if (aVar5 == null) {
                    this.f21661h = new C9744q(cVar, new C13181d());
                    return true;
                }
                aVar5.m15504n(cVar);
                return true;
            } else if (t == AbstractC7765j0.f16891p) {
                AbstractC9721a<Float, Float> aVar6 = this.f21662i;
                if (aVar6 == null) {
                    this.f21662i = new C9744q(cVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar6.m15504n(cVar);
                return true;
            } else if (t == AbstractC7765j0.f16878c) {
                AbstractC9721a<Integer, Integer> aVar7 = this.f21663j;
                if (aVar7 == null) {
                    this.f21663j = new C9744q(cVar, 100);
                    return true;
                }
                aVar7.m15504n(cVar);
                return true;
            } else if (t == AbstractC7765j0.f38422C) {
                AbstractC9721a<?, Float> aVar8 = this.f21666m;
                if (aVar8 == null) {
                    this.f21666m = new C9744q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.m15504n(cVar);
                return true;
            } else if (t == AbstractC7765j0.f38423D) {
                AbstractC9721a<?, Float> aVar9 = this.f21667n;
                if (aVar9 == null) {
                    this.f21667n = new C9744q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.m15504n(cVar);
                return true;
            } else if (t == AbstractC7765j0.f16892q) {
                if (this.f21664k == null) {
                    this.f21664k = new C9730d(Collections.singletonList(new C13178a(Float.valueOf(0.0f))));
                }
                this.f21664k.m15504n(cVar);
                return true;
            } else if (t != AbstractC7765j0.f16893r) {
                return false;
            } else {
                if (this.f21665l == null) {
                    this.f21665l = new C9730d(Collections.singletonList(new C13178a(Float.valueOf(0.0f))));
                }
                this.f21665l.m15504n(cVar);
                return true;
            }
        }
    }

    /* renamed from: e */
    public AbstractC9721a<?, Float> m15456e() {
        return this.f21667n;
    }

    /* renamed from: f */
    public Matrix m15455f() {
        C9730d dVar;
        C9730d dVar2;
        float f;
        C9730d dVar3;
        float f2;
        float f3;
        PointF h;
        this.f21654a.reset();
        AbstractC9721a<?, PointF> aVar = this.f21660g;
        if (!(aVar == null || (h = aVar.mo15449h()) == null)) {
            float f4 = h.x;
            if (!(f4 == 0.0f && h.y == 0.0f)) {
                this.f21654a.preTranslate(f4, h.y);
            }
        }
        AbstractC9721a<Float, Float> aVar2 = this.f21662i;
        if (aVar2 != null) {
            if (aVar2 instanceof C9744q) {
                f3 = aVar2.mo15449h().floatValue();
            } else {
                f3 = ((C9730d) aVar2).m15486p();
            }
            if (f3 != 0.0f) {
                this.f21654a.preRotate(f3);
            }
        }
        if (this.f21664k != null) {
            if (this.f21665l == null) {
                f = 0.0f;
            } else {
                f = (float) Math.cos(Math.toRadians((-dVar2.m15486p()) + 90.0f));
            }
            if (this.f21665l == null) {
                f2 = 1.0f;
            } else {
                f2 = (float) Math.sin(Math.toRadians((-dVar3.m15486p()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(dVar.m15486p()));
            m15457d();
            float[] fArr = this.f21658e;
            fArr[0] = f;
            fArr[1] = f2;
            float f5 = -f2;
            fArr[3] = f5;
            fArr[4] = f;
            fArr[8] = 1.0f;
            this.f21655b.setValues(fArr);
            m15457d();
            float[] fArr2 = this.f21658e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f21656c.setValues(fArr2);
            m15457d();
            float[] fArr3 = this.f21658e;
            fArr3[0] = f;
            fArr3[1] = f5;
            fArr3[3] = f2;
            fArr3[4] = f;
            fArr3[8] = 1.0f;
            this.f21657d.setValues(fArr3);
            this.f21656c.preConcat(this.f21655b);
            this.f21657d.preConcat(this.f21656c);
            this.f21654a.preConcat(this.f21657d);
        }
        AbstractC9721a<C13181d, C13181d> aVar3 = this.f21661h;
        if (aVar3 != null) {
            C13181d h2 = aVar3.mo15449h();
            if (!(h2.m4399b() == 1.0f && h2.m4398c() == 1.0f)) {
                this.f21654a.preScale(h2.m4399b(), h2.m4398c());
            }
        }
        AbstractC9721a<PointF, PointF> aVar4 = this.f21659f;
        if (aVar4 != null) {
            PointF h3 = aVar4.mo15449h();
            float f6 = h3.x;
            if (!(f6 == 0.0f && h3.y == 0.0f)) {
                this.f21654a.preTranslate(-f6, -h3.y);
            }
        }
        return this.f21654a;
    }

    /* renamed from: g */
    public Matrix m15454g(float f) {
        PointF pointF;
        C13181d dVar;
        float f2;
        AbstractC9721a<?, PointF> aVar = this.f21660g;
        PointF pointF2 = null;
        if (aVar == null) {
            pointF = null;
        } else {
            pointF = aVar.mo15449h();
        }
        AbstractC9721a<C13181d, C13181d> aVar2 = this.f21661h;
        if (aVar2 == null) {
            dVar = null;
        } else {
            dVar = aVar2.mo15449h();
        }
        this.f21654a.reset();
        if (pointF != null) {
            this.f21654a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (dVar != null) {
            double d = f;
            this.f21654a.preScale((float) Math.pow(dVar.m4399b(), d), (float) Math.pow(dVar.m4398c(), d));
        }
        AbstractC9721a<Float, Float> aVar3 = this.f21662i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo15449h().floatValue();
            AbstractC9721a<PointF, PointF> aVar4 = this.f21659f;
            if (aVar4 != null) {
                pointF2 = aVar4.mo15449h();
            }
            Matrix matrix = this.f21654a;
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f21654a;
    }

    /* renamed from: h */
    public AbstractC9721a<?, Integer> m15453h() {
        return this.f21663j;
    }

    /* renamed from: i */
    public AbstractC9721a<?, Float> m15452i() {
        return this.f21666m;
    }

    /* renamed from: j */
    public void m15451j(float f) {
        AbstractC9721a<Integer, Integer> aVar = this.f21663j;
        if (aVar != null) {
            aVar.mo15446m(f);
        }
        AbstractC9721a<?, Float> aVar2 = this.f21666m;
        if (aVar2 != null) {
            aVar2.mo15446m(f);
        }
        AbstractC9721a<?, Float> aVar3 = this.f21667n;
        if (aVar3 != null) {
            aVar3.mo15446m(f);
        }
        AbstractC9721a<PointF, PointF> aVar4 = this.f21659f;
        if (aVar4 != null) {
            aVar4.mo15446m(f);
        }
        AbstractC9721a<?, PointF> aVar5 = this.f21660g;
        if (aVar5 != null) {
            aVar5.mo15446m(f);
        }
        AbstractC9721a<C13181d, C13181d> aVar6 = this.f21661h;
        if (aVar6 != null) {
            aVar6.mo15446m(f);
        }
        AbstractC9721a<Float, Float> aVar7 = this.f21662i;
        if (aVar7 != null) {
            aVar7.mo15446m(f);
        }
        C9730d dVar = this.f21664k;
        if (dVar != null) {
            dVar.mo15446m(f);
        }
        C9730d dVar2 = this.f21665l;
        if (dVar2 != null) {
            dVar2.mo15446m(f);
        }
    }
}
