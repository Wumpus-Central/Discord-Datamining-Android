package p167j2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p126h2.AbstractC7765j0;
import p126h2.C7742c;
import p126h2.C7748e0;
import p147i2.C8210a;
import p188k2.AbstractC9721a;
import p188k2.C9727b;
import p188k2.C9728c;
import p188k2.C9744q;
import p223m2.C10474e;
import p254o2.C11185o;
import p275p2.AbstractC11511b;
import p343t2.C12948i;
import p358u2.C13180c;

/* renamed from: j2.g */
/* loaded from: classes.dex */
public class C9469g implements AbstractC9467e, AbstractC9721a.AbstractC9722b, AbstractC9473k {

    /* renamed from: a */
    private final Path f20883a;

    /* renamed from: c */
    private final AbstractC11511b f20885c;

    /* renamed from: d */
    private final String f20886d;

    /* renamed from: e */
    private final boolean f20887e;

    /* renamed from: g */
    private final AbstractC9721a<Integer, Integer> f20889g;

    /* renamed from: h */
    private final AbstractC9721a<Integer, Integer> f20890h;

    /* renamed from: i */
    private AbstractC9721a<ColorFilter, ColorFilter> f20891i;

    /* renamed from: j */
    private final C7748e0 f20892j;

    /* renamed from: k */
    private AbstractC9721a<Float, Float> f20893k;

    /* renamed from: l */
    float f20894l;

    /* renamed from: m */
    private C9728c f20895m;

    /* renamed from: b */
    private final Paint f20884b = new C8210a(1);

    /* renamed from: f */
    private final List<AbstractC9476m> f20888f = new ArrayList();

    public C9469g(C7748e0 e0Var, AbstractC11511b bVar, C11185o oVar) {
        Path path = new Path();
        this.f20883a = path;
        this.f20885c = bVar;
        this.f20886d = oVar.m10549d();
        this.f20887e = oVar.m10547f();
        this.f20892j = e0Var;
        if (bVar.mo9475w() != null) {
            AbstractC9721a<Float, Float> a = bVar.mo9475w().m10620a().mo12624a();
            this.f20893k = a;
            a.m15511a(this);
            bVar.m9519j(this.f20893k);
        }
        if (bVar.mo9474y() != null) {
            this.f20895m = new C9728c(this, bVar, bVar.mo9474y());
        }
        if (oVar.m10551b() == null || oVar.m10548e() == null) {
            this.f20889g = null;
            this.f20890h = null;
            return;
        }
        path.setFillType(oVar.m10550c());
        AbstractC9721a<Integer, Integer> a2 = oVar.m10551b().mo12624a();
        this.f20889g = a2;
        a2.m15511a(this);
        bVar.m9519j(a2);
        AbstractC9721a<Integer, Integer> a3 = oVar.m10548e().mo12624a();
        this.f20890h = a3;
        a3.m15511a(this);
        bVar.m9519j(a3);
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        this.f20892j.invalidateSelf();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            AbstractC9465c cVar = list2.get(i);
            if (cVar instanceof AbstractC9476m) {
                this.f20888f.add((AbstractC9476m) cVar);
            }
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
        if (t == AbstractC7765j0.f16876a) {
            this.f20889g.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16879d) {
            this.f20890h.m15504n(cVar);
        } else if (t == AbstractC7765j0.f38430K) {
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f20891i;
            if (aVar != null) {
                this.f20885c.m9529H(aVar);
            }
            if (cVar == null) {
                this.f20891i = null;
                return;
            }
            C9744q qVar = new C9744q(cVar);
            this.f20891i = qVar;
            qVar.m15511a(this);
            this.f20885c.m9519j(this.f20891i);
        } else if (t == AbstractC7765j0.f16885j) {
            AbstractC9721a<Float, Float> aVar2 = this.f20893k;
            if (aVar2 != null) {
                aVar2.m15504n(cVar);
                return;
            }
            C9744q qVar2 = new C9744q(cVar);
            this.f20893k = qVar2;
            qVar2.m15511a(this);
            this.f20885c.m9519j(this.f20893k);
        } else if (t == AbstractC7765j0.f16880e && (cVar6 = this.f20895m) != null) {
            cVar6.m15492c(cVar);
        } else if (t == AbstractC7765j0.f38426G && (cVar5 = this.f20895m) != null) {
            cVar5.m15489f(cVar);
        } else if (t == AbstractC7765j0.f38427H && (cVar4 = this.f20895m) != null) {
            cVar4.m15491d(cVar);
        } else if (t == AbstractC7765j0.f38428I && (cVar3 = this.f20895m) != null) {
            cVar3.m15490e(cVar);
        } else if (t == AbstractC7765j0.f38429J && (cVar2 = this.f20895m) != null) {
            cVar2.m15488g(cVar);
        }
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        this.f20883a.reset();
        for (int i = 0; i < this.f20888f.size(); i++) {
            this.f20883a.addPath(this.f20888f.get(i).mo16163d(), matrix);
        }
        this.f20883a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20886d;
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: h */
    public void mo9521h(Canvas canvas, Matrix matrix, int i) {
        if (!this.f20887e) {
            C7742c.m21543a("FillContent#draw");
            this.f20884b.setColor((C12948i.m4980c((int) ((((i / 255.0f) * this.f20890h.mo15449h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((C9727b) this.f20889g).m15496p() & 16777215));
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f20891i;
            if (aVar != null) {
                this.f20884b.setColorFilter(aVar.mo15449h());
            }
            AbstractC9721a<Float, Float> aVar2 = this.f20893k;
            if (aVar2 != null) {
                float floatValue = aVar2.mo15449h().floatValue();
                if (floatValue == 0.0f) {
                    this.f20884b.setMaskFilter(null);
                } else if (floatValue != this.f20894l) {
                    this.f20884b.setMaskFilter(this.f20885c.m9507x(floatValue));
                }
                this.f20894l = floatValue;
            }
            C9728c cVar = this.f20895m;
            if (cVar != null) {
                cVar.m15493b(this.f20884b);
            }
            this.f20883a.reset();
            for (int i2 = 0; i2 < this.f20888f.size(); i2++) {
                this.f20883a.addPath(this.f20888f.get(i2).mo16163d(), matrix);
            }
            canvas.drawPath(this.f20883a, this.f20884b);
            C7742c.m21542b("FillContent#draw");
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        C12948i.m4972k(eVar, i, list, eVar2, this);
    }
}
