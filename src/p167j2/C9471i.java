package p167j2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C2098d;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p188k2.AbstractC9721a;
import p188k2.C9744q;
import p254o2.C11171d;
import p254o2.C11173f;
import p254o2.EnumC11174g;
import p275p2.AbstractC11511b;
import p358u2.C13180c;

/* renamed from: j2.i */
/* loaded from: classes.dex */
public class C9471i extends AbstractC9462a {

    /* renamed from: A */
    private final AbstractC9721a<PointF, PointF> f38721A;

    /* renamed from: B */
    private C9744q f38722B;

    /* renamed from: r */
    private final String f20917r;

    /* renamed from: s */
    private final boolean f20918s;

    /* renamed from: t */
    private final C2098d<LinearGradient> f20919t = new C2098d<>();

    /* renamed from: u */
    private final C2098d<RadialGradient> f20920u = new C2098d<>();

    /* renamed from: v */
    private final RectF f20921v = new RectF();

    /* renamed from: w */
    private final EnumC11174g f20922w;

    /* renamed from: x */
    private final int f20923x;

    /* renamed from: y */
    private final AbstractC9721a<C11171d, C11171d> f20924y;

    /* renamed from: z */
    private final AbstractC9721a<PointF, PointF> f20925z;

    public C9471i(C7748e0 e0Var, AbstractC11511b bVar, C11173f fVar) {
        super(e0Var, bVar, fVar.m10602b().m10530a(), fVar.m10597g().m10529a(), fVar.m10595i(), fVar.m10593k(), fVar.m10591m(), fVar.m10596h(), fVar.m10601c());
        this.f20917r = fVar.m10594j();
        this.f20922w = fVar.m10598f();
        this.f20918s = fVar.m10590n();
        this.f20923x = (int) (e0Var.m21527G().m21400d() / 32.0f);
        AbstractC9721a<C11171d, C11171d> a = fVar.m10599e().mo12624a();
        this.f20924y = a;
        a.m15511a(this);
        bVar.m9519j(a);
        AbstractC9721a<PointF, PointF> a2 = fVar.m10592l().mo12624a();
        this.f20925z = a2;
        a2.m15511a(this);
        bVar.m9519j(a2);
        AbstractC9721a<PointF, PointF> a3 = fVar.m10600d().mo12624a();
        this.f38721A = a3;
        a3.m15511a(this);
        bVar.m9519j(a3);
    }

    /* renamed from: k */
    private int[] m16179k(int[] iArr) {
        C9744q qVar = this.f38722B;
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

    /* renamed from: l */
    private int m16178l() {
        int i;
        int round = Math.round(this.f20925z.m15507f() * this.f20923x);
        int round2 = Math.round(this.f38721A.m15507f() * this.f20923x);
        int round3 = Math.round(this.f20924y.m15507f() * this.f20923x);
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

    /* renamed from: m */
    private LinearGradient m16177m() {
        long l = m16178l();
        LinearGradient h = this.f20919t.m39015h(l);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f20925z.mo15449h();
        PointF h3 = this.f38721A.mo15449h();
        C11171d h4 = this.f20924y.mo15449h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, m16179k(h4.m10614a()), h4.m10613b(), Shader.TileMode.CLAMP);
        this.f20919t.m39011m(l, linearGradient);
        return linearGradient;
    }

    /* renamed from: n */
    private RadialGradient m16176n() {
        float f;
        float f2;
        long l = m16178l();
        RadialGradient h = this.f20920u.m39015h(l);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f20925z.mo15449h();
        PointF h3 = this.f38721A.mo15449h();
        C11171d h4 = this.f20924y.mo15449h();
        int[] k = m16179k(h4.m10614a());
        float[] b = h4.m10613b();
        RadialGradient radialGradient = new RadialGradient(h2.x, h2.y, (float) Math.hypot(h3.x - f, h3.y - f2), k, b, Shader.TileMode.CLAMP);
        this.f20920u.m39011m(l, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p167j2.AbstractC9462a, p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        super.mo9460c(t, cVar);
        if (t == AbstractC7765j0.f38431L) {
            C9744q qVar = this.f38722B;
            if (qVar != null) {
                this.f20849f.m9529H(qVar);
            }
            if (cVar == null) {
                this.f38722B = null;
                return;
            }
            C9744q qVar2 = new C9744q(cVar);
            this.f38722B = qVar2;
            qVar2.m15511a(this);
            this.f20849f.m9519j(this.f38722B);
        }
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20917r;
    }

    @Override // p167j2.AbstractC9462a, p167j2.AbstractC9467e
    /* renamed from: h */
    public void mo9521h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f20918s) {
            mo9457f(this.f20921v, matrix, false);
            if (this.f20922w == EnumC11174g.LINEAR) {
                shader = m16177m();
            } else {
                shader = m16176n();
            }
            shader.setLocalMatrix(matrix);
            this.f20852i.setShader(shader);
            super.mo9521h(canvas, matrix, i);
        }
    }
}
