package p167j2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p126h2.AbstractC7765j0;
import p126h2.C7742c;
import p126h2.C7748e0;
import p147i2.C8210a;
import p188k2.AbstractC9721a;
import p188k2.C9728c;
import p188k2.C9730d;
import p188k2.C9732f;
import p188k2.C9744q;
import p223m2.C10474e;
import p238n2.C10694b;
import p238n2.C10696d;
import p254o2.C11192s;
import p275p2.AbstractC11511b;
import p343t2.C12948i;
import p343t2.C12949j;
import p358u2.C13180c;

/* renamed from: j2.a */
/* loaded from: classes.dex */
public abstract class AbstractC9462a implements AbstractC9721a.AbstractC9722b, AbstractC9473k, AbstractC9467e {

    /* renamed from: e */
    private final C7748e0 f20848e;

    /* renamed from: f */
    protected final AbstractC11511b f20849f;

    /* renamed from: h */
    private final float[] f20851h;

    /* renamed from: i */
    final Paint f20852i;

    /* renamed from: j */
    private final AbstractC9721a<?, Float> f20853j;

    /* renamed from: k */
    private final AbstractC9721a<?, Integer> f20854k;

    /* renamed from: l */
    private final List<AbstractC9721a<?, Float>> f20855l;

    /* renamed from: m */
    private final AbstractC9721a<?, Float> f20856m;

    /* renamed from: n */
    private AbstractC9721a<ColorFilter, ColorFilter> f20857n;

    /* renamed from: o */
    private AbstractC9721a<Float, Float> f20858o;

    /* renamed from: q */
    private C9728c f20860q;

    /* renamed from: a */
    private final PathMeasure f20844a = new PathMeasure();

    /* renamed from: b */
    private final Path f20845b = new Path();

    /* renamed from: c */
    private final Path f20846c = new Path();

    /* renamed from: d */
    private final RectF f20847d = new RectF();

    /* renamed from: g */
    private final List<C9463b> f20850g = new ArrayList();

    /* renamed from: p */
    float f20859p = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j2.a$b */
    /* loaded from: classes.dex */
    public static final class C9463b {

        /* renamed from: a */
        private final List<AbstractC9476m> f20861a;

        /* renamed from: b */
        private final C9485u f20862b;

        private C9463b(C9485u uVar) {
            this.f20861a = new ArrayList();
            this.f20862b = uVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9462a(C7748e0 e0Var, AbstractC11511b bVar, Paint.Cap cap, Paint.Join join, float f, C10696d dVar, C10694b bVar2, List<C10694b> list, C10694b bVar3) {
        C8210a aVar = new C8210a(1);
        this.f20852i = aVar;
        this.f20848e = e0Var;
        this.f20849f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f);
        this.f20854k = dVar.mo12624a();
        this.f20853j = bVar2.mo12624a();
        if (bVar3 == null) {
            this.f20856m = null;
        } else {
            this.f20856m = bVar3.mo12624a();
        }
        this.f20855l = new ArrayList(list.size());
        this.f20851h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f20855l.add(list.get(i).mo12624a());
        }
        bVar.m9519j(this.f20854k);
        bVar.m9519j(this.f20853j);
        for (int i2 = 0; i2 < this.f20855l.size(); i2++) {
            bVar.m9519j(this.f20855l.get(i2));
        }
        AbstractC9721a<?, Float> aVar2 = this.f20856m;
        if (aVar2 != null) {
            bVar.m9519j(aVar2);
        }
        this.f20854k.m15511a(this);
        this.f20853j.m15511a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f20855l.get(i3).m15511a(this);
        }
        AbstractC9721a<?, Float> aVar3 = this.f20856m;
        if (aVar3 != null) {
            aVar3.m15511a(this);
        }
        if (bVar.mo9475w() != null) {
            AbstractC9721a<Float, Float> a = bVar.mo9475w().m10620a().mo12624a();
            this.f20858o = a;
            a.m15511a(this);
            bVar.m9519j(this.f20858o);
        }
        if (bVar.mo9474y() != null) {
            this.f20860q = new C9728c(this, bVar, bVar.mo9474y());
        }
    }

    /* renamed from: g */
    private void m16195g(Matrix matrix) {
        float f;
        C7742c.m21543a("StrokeContent#applyDashPattern");
        if (this.f20855l.isEmpty()) {
            C7742c.m21542b("StrokeContent#applyDashPattern");
            return;
        }
        float g = C12949j.m4965g(matrix);
        for (int i = 0; i < this.f20855l.size(); i++) {
            this.f20851h[i] = this.f20855l.get(i).mo15449h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f20851h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f20851h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f20851h;
            fArr3[i] = fArr3[i] * g;
        }
        AbstractC9721a<?, Float> aVar = this.f20856m;
        if (aVar == null) {
            f = 0.0f;
        } else {
            f = g * aVar.mo15449h().floatValue();
        }
        this.f20852i.setPathEffect(new DashPathEffect(this.f20851h, f));
        C7742c.m21542b("StrokeContent#applyDashPattern");
    }

    /* renamed from: j */
    private void m16194j(Canvas canvas, C9463b bVar, Matrix matrix) {
        float f;
        float f2;
        float f3;
        C7742c.m21543a("StrokeContent#applyTrimPath");
        if (bVar.f20862b == null) {
            C7742c.m21542b("StrokeContent#applyTrimPath");
            return;
        }
        this.f20845b.reset();
        for (int size = bVar.f20861a.size() - 1; size >= 0; size--) {
            this.f20845b.addPath(((AbstractC9476m) bVar.f20861a.get(size)).mo16163d(), matrix);
        }
        float floatValue = bVar.f20862b.m16158j().mo15449h().floatValue() / 100.0f;
        float floatValue2 = bVar.f20862b.m16160g().mo15449h().floatValue() / 100.0f;
        float floatValue3 = bVar.f20862b.m16159i().mo15449h().floatValue() / 360.0f;
        if (floatValue >= 0.01f || floatValue2 <= 0.99f) {
            this.f20844a.setPath(this.f20845b, false);
            float length = this.f20844a.getLength();
            while (this.f20844a.nextContour()) {
                length += this.f20844a.getLength();
            }
            float f4 = floatValue3 * length;
            float f5 = (floatValue * length) + f4;
            float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
            float f6 = 0.0f;
            for (int size2 = bVar.f20861a.size() - 1; size2 >= 0; size2--) {
                this.f20846c.set(((AbstractC9476m) bVar.f20861a.get(size2)).mo16163d());
                this.f20846c.transform(matrix);
                this.f20844a.setPath(this.f20846c, false);
                float length2 = this.f20844a.getLength();
                if (min > length) {
                    float f7 = min - length;
                    if (f7 < f6 + length2 && f6 < f7) {
                        if (f5 > length) {
                            f3 = (f5 - length) / length2;
                        } else {
                            f3 = 0.0f;
                        }
                        C12949j.m4971a(this.f20846c, f3, Math.min(f7 / length2, 1.0f), 0.0f);
                        canvas.drawPath(this.f20846c, this.f20852i);
                        f6 += length2;
                    }
                }
                float f8 = f6 + length2;
                if (f8 >= f5 && f6 <= min) {
                    if (f8 > min || f5 >= f6) {
                        if (f5 < f6) {
                            f = 0.0f;
                        } else {
                            f = (f5 - f6) / length2;
                        }
                        if (min > f8) {
                            f2 = 1.0f;
                        } else {
                            f2 = (min - f6) / length2;
                        }
                        C12949j.m4971a(this.f20846c, f, f2, 0.0f);
                        canvas.drawPath(this.f20846c, this.f20852i);
                    } else {
                        canvas.drawPath(this.f20846c, this.f20852i);
                    }
                }
                f6 += length2;
            }
            C7742c.m21542b("StrokeContent#applyTrimPath");
            return;
        }
        canvas.drawPath(this.f20845b, this.f20852i);
        C7742c.m21542b("StrokeContent#applyTrimPath");
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        this.f20848e.invalidateSelf();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        C9485u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC9465c cVar = list.get(size);
            if (cVar instanceof C9485u) {
                C9485u uVar2 = (C9485u) cVar;
                if (uVar2.m16157k() == C11192s.EnumC11193a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.m16161c(this);
        }
        C9463b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            AbstractC9465c cVar2 = list2.get(size2);
            if (cVar2 instanceof C9485u) {
                C9485u uVar3 = (C9485u) cVar2;
                if (uVar3.m16157k() == C11192s.EnumC11193a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f20850g.add(bVar);
                    }
                    bVar = new C9463b(uVar3);
                    uVar3.m16161c(this);
                }
            }
            if (cVar2 instanceof AbstractC9476m) {
                if (bVar == null) {
                    bVar = new C9463b(uVar);
                }
                bVar.f20861a.add((AbstractC9476m) cVar2);
            }
        }
        if (bVar != null) {
            this.f20850g.add(bVar);
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        C9728c cVar2;
        C9728c cVar3;
        C9728c cVar4;
        C9728c cVar5;
        C9728c cVar6;
        if (t == AbstractC7765j0.f16879d) {
            this.f20854k.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16894s) {
            this.f20853j.m15504n(cVar);
        } else if (t == AbstractC7765j0.f38430K) {
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f20857n;
            if (aVar != null) {
                this.f20849f.m9529H(aVar);
            }
            if (cVar == null) {
                this.f20857n = null;
                return;
            }
            C9744q qVar = new C9744q(cVar);
            this.f20857n = qVar;
            qVar.m15511a(this);
            this.f20849f.m9519j(this.f20857n);
        } else if (t == AbstractC7765j0.f16885j) {
            AbstractC9721a<Float, Float> aVar2 = this.f20858o;
            if (aVar2 != null) {
                aVar2.m15504n(cVar);
                return;
            }
            C9744q qVar2 = new C9744q(cVar);
            this.f20858o = qVar2;
            qVar2.m15511a(this);
            this.f20849f.m9519j(this.f20858o);
        } else if (t == AbstractC7765j0.f16880e && (cVar6 = this.f20860q) != null) {
            cVar6.m15492c(cVar);
        } else if (t == AbstractC7765j0.f38426G && (cVar5 = this.f20860q) != null) {
            cVar5.m15489f(cVar);
        } else if (t == AbstractC7765j0.f38427H && (cVar4 = this.f20860q) != null) {
            cVar4.m15491d(cVar);
        } else if (t == AbstractC7765j0.f38428I && (cVar3 = this.f20860q) != null) {
            cVar3.m15490e(cVar);
        } else if (t == AbstractC7765j0.f38429J && (cVar2 = this.f20860q) != null) {
            cVar2.m15488g(cVar);
        }
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        C7742c.m21543a("StrokeContent#getBounds");
        this.f20845b.reset();
        for (int i = 0; i < this.f20850g.size(); i++) {
            C9463b bVar = this.f20850g.get(i);
            for (int i2 = 0; i2 < bVar.f20861a.size(); i2++) {
                this.f20845b.addPath(((AbstractC9476m) bVar.f20861a.get(i2)).mo16163d(), matrix);
            }
        }
        this.f20845b.computeBounds(this.f20847d, false);
        float p = ((C9730d) this.f20853j).m15486p();
        RectF rectF2 = this.f20847d;
        float f = p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f20847d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C7742c.m21542b("StrokeContent#getBounds");
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: h */
    public void mo9521h(Canvas canvas, Matrix matrix, int i) {
        C7742c.m21543a("StrokeContent#draw");
        if (C12949j.m4964h(matrix)) {
            C7742c.m21542b("StrokeContent#draw");
            return;
        }
        this.f20852i.setAlpha(C12948i.m4980c((int) ((((i / 255.0f) * ((C9732f) this.f20854k).m15482p()) / 100.0f) * 255.0f), 0, 255));
        this.f20852i.setStrokeWidth(((C9730d) this.f20853j).m15486p() * C12949j.m4965g(matrix));
        if (this.f20852i.getStrokeWidth() <= 0.0f) {
            C7742c.m21542b("StrokeContent#draw");
            return;
        }
        m16195g(matrix);
        AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f20857n;
        if (aVar != null) {
            this.f20852i.setColorFilter(aVar.mo15449h());
        }
        AbstractC9721a<Float, Float> aVar2 = this.f20858o;
        if (aVar2 != null) {
            float floatValue = aVar2.mo15449h().floatValue();
            if (floatValue == 0.0f) {
                this.f20852i.setMaskFilter(null);
            } else if (floatValue != this.f20859p) {
                this.f20852i.setMaskFilter(this.f20849f.m9507x(floatValue));
            }
            this.f20859p = floatValue;
        }
        C9728c cVar = this.f20860q;
        if (cVar != null) {
            cVar.m15493b(this.f20852i);
        }
        for (int i2 = 0; i2 < this.f20850g.size(); i2++) {
            C9463b bVar = this.f20850g.get(i2);
            if (bVar.f20862b != null) {
                m16194j(canvas, bVar, matrix);
            } else {
                C7742c.m21543a("StrokeContent#buildPath");
                this.f20845b.reset();
                for (int size = bVar.f20861a.size() - 1; size >= 0; size--) {
                    this.f20845b.addPath(((AbstractC9476m) bVar.f20861a.get(size)).mo16163d(), matrix);
                }
                C7742c.m21542b("StrokeContent#buildPath");
                C7742c.m21543a("StrokeContent#drawPath");
                canvas.drawPath(this.f20845b, this.f20852i);
                C7742c.m21542b("StrokeContent#drawPath");
            }
        }
        C7742c.m21542b("StrokeContent#draw");
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        C12948i.m4972k(eVar, i, list, eVar2, this);
    }
}
