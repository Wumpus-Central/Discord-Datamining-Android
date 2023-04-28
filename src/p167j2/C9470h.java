package p167j2;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C2098d;
import java.util.ArrayList;
import java.util.List;
import p126h2.AbstractC7765j0;
import p126h2.C7742c;
import p126h2.C7748e0;
import p147i2.C8210a;
import p188k2.AbstractC9721a;
import p188k2.C9728c;
import p188k2.C9744q;
import p223m2.C10474e;
import p254o2.C11171d;
import p254o2.C11172e;
import p254o2.EnumC11174g;
import p275p2.AbstractC11511b;
import p343t2.C12948i;
import p358u2.C13180c;

/* renamed from: j2.h */
/* loaded from: classes.dex */
public class C9470h implements AbstractC9467e, AbstractC9721a.AbstractC9722b, AbstractC9473k {

    /* renamed from: a */
    private final String f20896a;

    /* renamed from: b */
    private final boolean f20897b;

    /* renamed from: c */
    private final AbstractC11511b f20898c;

    /* renamed from: f */
    private final Path f20901f;

    /* renamed from: j */
    private final EnumC11174g f20905j;

    /* renamed from: k */
    private final AbstractC9721a<C11171d, C11171d> f20906k;

    /* renamed from: l */
    private final AbstractC9721a<Integer, Integer> f20907l;

    /* renamed from: m */
    private final AbstractC9721a<PointF, PointF> f20908m;

    /* renamed from: n */
    private final AbstractC9721a<PointF, PointF> f20909n;

    /* renamed from: o */
    private AbstractC9721a<ColorFilter, ColorFilter> f20910o;

    /* renamed from: p */
    private C9744q f20911p;

    /* renamed from: q */
    private final C7748e0 f20912q;

    /* renamed from: r */
    private final int f20913r;

    /* renamed from: s */
    private AbstractC9721a<Float, Float> f20914s;

    /* renamed from: u */
    private C9728c f20916u;

    /* renamed from: d */
    private final C2098d<LinearGradient> f20899d = new C2098d<>();

    /* renamed from: e */
    private final C2098d<RadialGradient> f20900e = new C2098d<>();

    /* renamed from: g */
    private final Paint f20902g = new C8210a(1);

    /* renamed from: h */
    private final RectF f20903h = new RectF();

    /* renamed from: i */
    private final List<AbstractC9476m> f20904i = new ArrayList();

    /* renamed from: t */
    float f20915t = 0.0f;

    public C9470h(C7748e0 e0Var, AbstractC11511b bVar, C11172e eVar) {
        Path path = new Path();
        this.f20901f = path;
        this.f20898c = bVar;
        this.f20896a = eVar.m10606f();
        this.f20897b = eVar.m10603i();
        this.f20912q = e0Var;
        this.f20905j = eVar.m10607e();
        path.setFillType(eVar.m10609c());
        this.f20913r = (int) (e0Var.m21527G().m21400d() / 32.0f);
        AbstractC9721a<C11171d, C11171d> a = eVar.m10608d().mo12624a();
        this.f20906k = a;
        a.m15511a(this);
        bVar.m9519j(a);
        AbstractC9721a<Integer, Integer> a2 = eVar.m10605g().mo12624a();
        this.f20907l = a2;
        a2.m15511a(this);
        bVar.m9519j(a2);
        AbstractC9721a<PointF, PointF> a3 = eVar.m10604h().mo12624a();
        this.f20908m = a3;
        a3.m15511a(this);
        bVar.m9519j(a3);
        AbstractC9721a<PointF, PointF> a4 = eVar.m10610b().mo12624a();
        this.f20909n = a4;
        a4.m15511a(this);
        bVar.m9519j(a4);
        if (bVar.mo9475w() != null) {
            AbstractC9721a<Float, Float> a5 = bVar.mo9475w().m10620a().mo12624a();
            this.f20914s = a5;
            a5.m15511a(this);
            bVar.m9519j(this.f20914s);
        }
        if (bVar.mo9474y() != null) {
            this.f20916u = new C9728c(this, bVar, bVar.mo9474y());
        }
    }

    /* renamed from: g */
    private int[] m16183g(int[] iArr) {
        C9744q qVar = this.f20911p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.mo15449h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: j */
    private int m16182j() {
        int i;
        int round = Math.round(this.f20908m.m15507f() * this.f20913r);
        int round2 = Math.round(this.f20909n.m15507f() * this.f20913r);
        int round3 = Math.round(this.f20906k.m15507f() * this.f20913r);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    /* renamed from: k */
    private LinearGradient m16181k() {
        long j = m16182j();
        LinearGradient h = this.f20899d.m39015h(j);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f20908m.mo15449h();
        PointF h3 = this.f20909n.mo15449h();
        C11171d h4 = this.f20906k.mo15449h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, m16183g(h4.m10614a()), h4.m10613b(), Shader.TileMode.CLAMP);
        this.f20899d.m39011m(j, linearGradient);
        return linearGradient;
    }

    /* renamed from: l */
    private RadialGradient m16180l() {
        long j = m16182j();
        RadialGradient h = this.f20900e.m39015h(j);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f20908m.mo15449h();
        PointF h3 = this.f20909n.mo15449h();
        C11171d h4 = this.f20906k.mo15449h();
        int[] g = m16183g(h4.m10614a());
        float[] b = h4.m10613b();
        float f = h2.x;
        float f2 = h2.y;
        float hypot = (float) Math.hypot(h3.x - f, h3.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot, g, b, Shader.TileMode.CLAMP);
        this.f20900e.m39011m(j, radialGradient);
        return radialGradient;
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        this.f20912q.invalidateSelf();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            AbstractC9465c cVar = list2.get(i);
            if (cVar instanceof AbstractC9476m) {
                this.f20904i.add((AbstractC9476m) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        C9728c cVar2;
        C9728c cVar3;
        C9728c cVar4;
        C9728c cVar5;
        C9728c cVar6;
        if (t == AbstractC7765j0.f16879d) {
            this.f20907l.m15504n(cVar);
        } else if (t == AbstractC7765j0.f38430K) {
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f20910o;
            if (aVar != null) {
                this.f20898c.m9529H(aVar);
            }
            if (cVar == null) {
                this.f20910o = null;
                return;
            }
            C9744q qVar = new C9744q(cVar);
            this.f20910o = qVar;
            qVar.m15511a(this);
            this.f20898c.m9519j(this.f20910o);
        } else if (t == AbstractC7765j0.f38431L) {
            C9744q qVar2 = this.f20911p;
            if (qVar2 != null) {
                this.f20898c.m9529H(qVar2);
            }
            if (cVar == null) {
                this.f20911p = null;
                return;
            }
            this.f20899d.m39019c();
            this.f20900e.m39019c();
            C9744q qVar3 = new C9744q(cVar);
            this.f20911p = qVar3;
            qVar3.m15511a(this);
            this.f20898c.m9519j(this.f20911p);
        } else if (t == AbstractC7765j0.f16885j) {
            AbstractC9721a<Float, Float> aVar2 = this.f20914s;
            if (aVar2 != null) {
                aVar2.m15504n(cVar);
                return;
            }
            C9744q qVar4 = new C9744q(cVar);
            this.f20914s = qVar4;
            qVar4.m15511a(this);
            this.f20898c.m9519j(this.f20914s);
        } else if (t == AbstractC7765j0.f16880e && (cVar6 = this.f20916u) != null) {
            cVar6.m15492c(cVar);
        } else if (t == AbstractC7765j0.f38426G && (cVar5 = this.f20916u) != null) {
            cVar5.m15489f(cVar);
        } else if (t == AbstractC7765j0.f38427H && (cVar4 = this.f20916u) != null) {
            cVar4.m15491d(cVar);
        } else if (t == AbstractC7765j0.f38428I && (cVar3 = this.f20916u) != null) {
            cVar3.m15490e(cVar);
        } else if (t == AbstractC7765j0.f38429J && (cVar2 = this.f20916u) != null) {
            cVar2.m15488g(cVar);
        }
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        this.f20901f.reset();
        for (int i = 0; i < this.f20904i.size(); i++) {
            this.f20901f.addPath(this.f20904i.get(i).mo16163d(), matrix);
        }
        this.f20901f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20896a;
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: h */
    public void mo9521h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f20897b) {
            C7742c.m21543a("GradientFillContent#draw");
            this.f20901f.reset();
            for (int i2 = 0; i2 < this.f20904i.size(); i2++) {
                this.f20901f.addPath(this.f20904i.get(i2).mo16163d(), matrix);
            }
            this.f20901f.computeBounds(this.f20903h, false);
            if (this.f20905j == EnumC11174g.LINEAR) {
                shader = m16181k();
            } else {
                shader = m16180l();
            }
            shader.setLocalMatrix(matrix);
            this.f20902g.setShader(shader);
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f20910o;
            if (aVar != null) {
                this.f20902g.setColorFilter(aVar.mo15449h());
            }
            AbstractC9721a<Float, Float> aVar2 = this.f20914s;
            if (aVar2 != null) {
                float floatValue = aVar2.mo15449h().floatValue();
                if (floatValue == 0.0f) {
                    this.f20902g.setMaskFilter(null);
                } else if (floatValue != this.f20915t) {
                    this.f20902g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.f20915t = floatValue;
            }
            C9728c cVar = this.f20916u;
            if (cVar != null) {
                cVar.m15493b(this.f20902g);
            }
            this.f20902g.setAlpha(C12948i.m4980c((int) ((((i / 255.0f) * this.f20907l.mo15449h().intValue()) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f20901f, this.f20902g);
            C7742c.m21542b("GradientFillContent#draw");
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        C12948i.m4972k(eVar, i, list, eVar2, this);
    }
}
